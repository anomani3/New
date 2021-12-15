package com.ashraf.booking.config;

import java.util.Collections;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class BSSwaggerConfig {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
	}


	@Bean
	public Docket swaggerConfiguration()
	{
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths((Predicate<String>) PathSelectors.any())
					.apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.ashraf.booking"))
					.build()
					.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails()
	{
		return new ApiInfo(
				"FLIGHT BOOKING SYSTEM APP",
				"THIS IS SWAGGER API FOR FBS",
				"1.0",
				"MY OWN APP IS GOING TO DEVELOPE",
				new springfox.documentation.service.Contact("ASHRAF NOMANI", "https://anomani3.github.io/nomanitech.github.io/", "anomani786@hotmail.com"),
				"copyRight AshrafNomani",
				"My Portfolio website",
				Collections.emptyList());
	}
}
