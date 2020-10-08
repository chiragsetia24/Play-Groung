package com.playing.Play.Ground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CacheProperties.class)
public class PlayGroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayGroundApplication.class, args);
	}

}
