package com.example.steamapi.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("steam")
public record SteamConfigProperties(@DefaultValue("") String apiKey) {
}

