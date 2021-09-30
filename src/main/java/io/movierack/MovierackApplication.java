package io.movierack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class MovierackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovierackApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		//Return a prepared Docket Instance
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				//.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("io.movierack"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Movie Rack API",
				"A minimum viable API of movie collections",
				"1.0",
				"Copyrights - SK",
				new springfox.documentation.service.Contact("Sridhar Kesavan", "https://sridharke7.github.io/", "sridharke7@gmail.com"),
				"API License",
				"https://sridharke7.github.io/",
						Collections.emptyList());
	}
}
