package org.example.sprngtask2.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Task 2 API")
                        .version("1.0")
                        .description("API documentation for Spring Task 2 application")
                        .contact(new Contact()
                                .name("Your Name")
                                .email("your.email@example.com")));
    }
}