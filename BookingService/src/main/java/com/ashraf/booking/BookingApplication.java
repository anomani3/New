package com.ashraf.booking;
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.google.common.base.Predicate;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;
//import it.ozimov.springboot.mail.configuration.EnableEmailTools;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEmailTools
public class BookingApplication
{
	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}
	
	
}