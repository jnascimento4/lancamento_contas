package br.com.extract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ContaRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(ContaRest1Application.class, args);
	}

}
