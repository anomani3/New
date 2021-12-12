package com.ashraf.searchservice.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration
{
	@Bean
	public Docket swaggerConfiguration1()
	{
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.any())
					.apis(RequestHandlerSelectors.basePackage("com.ashraf.searchservice"))
					.build()
					.apiInfo(apiDetails());
		
	}
	
	private ApiInfo apiDetails()
	{
		return new ApiInfo(
				"FLIGHT BOOKING SYSTEM APP",
				"THIS IS SWAGGER API FOR SearchService",
				"1.0",
				"MY OWN APP IS GOING TO DEVELOPE",
				new springfox.documentation.service.Contact("ASHRAF NOMANI", "https://anomani3.github.io/nomanitech.github.io/", "anomani786@hotmail.com"),
				"copyRight AshrafNomani",
				"My Portfolio website",
				Collections.emptyList());
	}
}