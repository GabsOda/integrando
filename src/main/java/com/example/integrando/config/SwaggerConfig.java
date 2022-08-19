package com.example.integrando.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI forumAluraOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Integrando")
                        .description("API restfull para realizar o crud de clientes e dos pacotes de tarifas contratados")
                        .version("v0.0.1"));
    }

}
