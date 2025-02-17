package com.example.steamapi;

import com.example.steamapi.api.config.SteamConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(SteamConfigProperties.class)
public class SteamApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SteamApiApplication.class, args);
    }

}
