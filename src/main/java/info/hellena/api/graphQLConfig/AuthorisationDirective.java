package info.hellena.api.graphQLConfig;

import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.idl.SchemaDirectiveWiring;
import graphql.schema.idl.SchemaDirectiveWiringEnvironment;
import org.springframework.stereotype.Component;


// TODO https://github.com/graphql-java/graphql-java/issues/1201
@Component
class AuthorisationDirective implements SchemaDirectiveWiring {

    @Override
    public GraphQLFieldDefinition onField(SchemaDirectiveWiringEnvironment<GraphQLFieldDefinition> schemaDirectiveWiringEnv) {
        return schemaDirectiveWiringEnv.getFieldDefinition();
    }
}
