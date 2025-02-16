package com.example.steamapi.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SteamApiConfig {

    @Value("${steam.api.key}") // Hämta från application.properties eller en miljövariabel
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
