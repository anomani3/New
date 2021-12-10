package caseStudy.searchMicroservices;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration()
	{
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.any())
					.apis(RequestHandlerSelectors.basePackage("caseStudy.searchMicroservices"))
					.build()
					.apiInfo(apiDetails());
		
	}
	
	private ApiInfo apiDetails()
	{
		return new ApiInfo(
				"User API Documentation",
				"API for User Microservice",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Anees Sharief", "http://Youtube.com", "aneessharief18@gmail.com"),
				"API Licence",
				"http://Youtube.com",
				Collections.emptyList());
	}
}
