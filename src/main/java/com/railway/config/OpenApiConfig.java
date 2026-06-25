package com.railway.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI railwayApi() {

        return new OpenAPI()
                .info(new Info()
                        .title("Railway Reservation API")
                        .version("1.0")
                        .description("Railway Reservation System Backend"));
    }
}