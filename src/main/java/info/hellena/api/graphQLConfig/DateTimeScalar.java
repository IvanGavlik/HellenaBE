package info.hellena.api.graphQLConfig;

import graphql.language.StringValue;
import graphql.language.Value;
import graphql.scalars.util.Kit;
import graphql.schema.*;
import org.springframework.stereotype.Component;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.function.Function;

@Component
public class DateTimeScalar {
    public static final GraphQLScalarType INSTANCE;
    private static final DateTimeFormatter customOutputFormatter = getCustomDateTimeFormatter();

    private DateTimeScalar() {
    }

    private static DateTimeFormatter getCustomDateTimeFormatter() {
        return (new DateTimeFormatterBuilder()).parseCaseInsensitive().append(DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T').appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendLiteral(':').appendValue(ChronoField.SECOND_OF_MINUTE, 2).appendFraction(ChronoField.NANO_OF_SECOND, 3, 3, true).appendOffset("+HH:MM", "Z").toFormatter();
    }

    static {
        Coercing<LocalDateTime, String> coercing = new Coercing<LocalDateTime, String>() {
            public String serialize(Object input) throws CoercingSerializeException {
                LocalDateTime offsetDateTime;
                if (input instanceof LocalDateTime) {
                    offsetDateTime = (LocalDateTime)input;
                } else {
                    if (!(input instanceof String)) {
                        throw new CoercingSerializeException("Expected something we can convert to 'java.time.OffsetDateTime' but was '" + Kit.typeName(input) + "'.");
                    }

                    offsetDateTime = this.parseOffsetDateTime(input.toString(), CoercingSerializeException::new);
                }

                try {
                    return offsetDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                } catch (DateTimeException var4) {
                    throw new CoercingSerializeException("Unable to turn TemporalAccessor into OffsetDateTime because of : '" + var4.getMessage() + "'.");
                }
            }

            public LocalDateTime parseValue(Object input) throws CoercingParseValueException {
                LocalDateTime offsetDateTime;
                if (input instanceof LocalDateTime) {
                    offsetDateTime = (LocalDateTime)input;
                } else {
                    if (!(input instanceof String)) {
                        throw new CoercingParseValueException("Expected a 'String' but was '" + Kit.typeName(input) + "'.");
                    }

                    offsetDateTime = this.parseOffsetDateTime(input.toString(), CoercingParseValueException::new);
                }

                return offsetDateTime;
            }

            public LocalDateTime parseLiteral(Object input) throws CoercingParseLiteralException {
                if (!(input instanceof StringValue)) {
                    throw new CoercingParseLiteralException("Expected AST type 'StringValue' but was '" + Kit.typeName(input) + "'.");
                } else {
                    return this.parseOffsetDateTime(((StringValue)input).getValue(), CoercingParseLiteralException::new);
                }
            }

            public Value<?> valueToLiteral(Object input) {
                String s = this.serialize(input);
                return StringValue.newStringValue(s).build();
            }

            private LocalDateTime parseOffsetDateTime(String s, Function<String, RuntimeException> exceptionMaker) {
                try {
                    return LocalDateTime.parse(s, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                } catch (DateTimeParseException var4) {
                    throw (RuntimeException)exceptionMaker.apply("Invalid RFC3339 value : '" + s + "'. because of : '" + var4.getMessage() + "'");
                }
            }
        };
        INSTANCE = GraphQLScalarType.newScalar().name("DateTime").description("An RFC-3339 compliant DateTime Scalar").coercing(coercing).build();
    }
}
