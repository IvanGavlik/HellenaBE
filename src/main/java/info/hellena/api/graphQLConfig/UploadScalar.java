package info.hellena.api.graphQLConfig;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import graphql.Internal;
import graphql.language.StringValue;
import graphql.language.Value;
import graphql.scalars.util.Kit;
import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.function.Function;

@Internal
public final class UploadScalar {
    public static final GraphQLScalarType INSTANCE;
    private static final DateTimeFormatter customOutputFormatter = getCustomDateTimeFormatter();

    private UploadScalar() {
    }

    private static DateTimeFormatter getCustomDateTimeFormatter() {
        return (new DateTimeFormatterBuilder()).parseCaseInsensitive().append(DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T').appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendLiteral(':').appendValue(ChronoField.SECOND_OF_MINUTE, 2).appendFraction(ChronoField.NANO_OF_SECOND, 3, 3, true).appendOffset("+HH:MM", "Z").toFormatter();
    }

    static {
        Coercing<OffsetDateTime, String> coercing = new Coercing<OffsetDateTime, String>() {
            public String serialize(Object input) throws CoercingSerializeException {
                OffsetDateTime offsetDateTime;
                if (input instanceof OffsetDateTime) {
                    offsetDateTime = (OffsetDateTime)input;
                } else if (input instanceof ZonedDateTime) {
                    offsetDateTime = ((ZonedDateTime)input).toOffsetDateTime();
                } else {
                    if (!(input instanceof String)) {
                        throw new CoercingSerializeException("Expected something we can convert to 'java.time.OffsetDateTime' but was '" + Kit.typeName(input) + "'.");
                    }

                    offsetDateTime = this.parseOffsetDateTime(input.toString(), CoercingSerializeException::new);
                }

                try {
                    return UploadScalar.customOutputFormatter.format(offsetDateTime);
                } catch (DateTimeException var4) {
                    throw new CoercingSerializeException("Unable to turn TemporalAccessor into OffsetDateTime because of : '" + var4.getMessage() + "'.");
                }
            }

            public OffsetDateTime parseValue(Object input) throws CoercingParseValueException {
                OffsetDateTime offsetDateTime;
                if (input instanceof OffsetDateTime) {
                    offsetDateTime = (OffsetDateTime)input;
                } else if (input instanceof ZonedDateTime) {
                    offsetDateTime = ((ZonedDateTime)input).toOffsetDateTime();
                } else {
                    if (!(input instanceof String)) {
                        throw new CoercingParseValueException("Expected a 'String' but was '" + Kit.typeName(input) + "'.");
                    }

                    offsetDateTime = this.parseOffsetDateTime(input.toString(), CoercingParseValueException::new);
                }

                return offsetDateTime;
            }

            public OffsetDateTime parseLiteral(Object input) throws CoercingParseLiteralException {
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

            private OffsetDateTime parseOffsetDateTime(String s, Function<String, RuntimeException> exceptionMaker) {
                try {
                    return OffsetDateTime.parse(s, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
                } catch (DateTimeParseException var4) {
                    throw (RuntimeException)exceptionMaker.apply("Invalid RFC3339 value : '" + s + "'. because of : '" + var4.getMessage() + "'");
                }
            }
        };
        INSTANCE = GraphQLScalarType.newScalar().name("Upload").description("An RFC-3339 compliant DateTime Scalar").coercing(coercing).build();
    }
}
