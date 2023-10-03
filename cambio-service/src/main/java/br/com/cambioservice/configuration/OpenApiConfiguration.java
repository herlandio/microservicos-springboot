package br.com.cambioservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Cambio Service Api", version = "v1", description = "Documentation Cambio service api"))
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(
                        new io.swagger.v3.oas.models.info.Info()
                                .title("Cambio Service Api")
                                .version("v1")
                                .license(new License().name("Apache 2.0").url("http://springdoc.org")));

    }
}
