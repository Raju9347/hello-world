package com.trying.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

/**
 * SwaggerConfig class is used to generate swagger ui.
 *
 */
@Configuration
public class SwaggerConfig {

	public static final String API = "Hello World Service API";

	@Bean
	public OpenAPI postApi(@Value("#{new String('${application.url}')}") String applicationurl) {
		Server server = new Server();
		server.setUrl(applicationurl);
		final Info info = new Info().title(API).description("Hello World Service API");
		return new OpenAPI().info(info).components(new Components()).servers(List.of(server));

	}
}
