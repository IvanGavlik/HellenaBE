package info.hellena.api.graphQLConfig;


import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import java.time.LocalDateTime;


@Configuration
public class GraphQlConfig  {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        return wiringBuilder -> wiringBuilder
                .scalar(DateTimeScalar.INSTANCE)
                .scalar(UploadScalar.INSTANCE)
                .directive("auth", new AuthorisationDirective())
                .directive("commentOnPost",  this.applicationContext.getBean(CommentOnPostDirective.class))
                .build();
    }

}
