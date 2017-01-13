package com.opus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class ConfigServerApplication {
	@RequestMapping("/")
	  public String home() {
	    return "Hello World";
	  }
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
