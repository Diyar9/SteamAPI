package com.example.steamapi.api.controller;

import com.example.steamapi.api.model.ISteamUser.GetPlayerSummaries.PlayerSummariesResponse;
import com.example.steamapi.api.service.PlayerSummariesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/playersummaries")
public class PlayerSummariesController {

    private final PlayerSummariesService playerSummariesService;

    public PlayerSummariesController(PlayerSummariesService playerSummariesService) {
        this.playerSummariesService = playerSummariesService;
    }

    @GetMapping
    public PlayerSummariesResponse getSummaries(@RequestParam String steamids) {
        return playerSummariesService.getPlayerSummaries(steamids);
    }
}

//EXAMPLE http://localhost:8080/api/playersummaries?steamids=76561198051645268
