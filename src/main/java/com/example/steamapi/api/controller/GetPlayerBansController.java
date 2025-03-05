package com.example.steamapi.api.controller;

import com.example.steamapi.api.model.ISteamUser.GetPlayerBans.GetPlayerBansResponse;
import com.example.steamapi.api.service.GetPlayerBansService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/playerbans")
public class GetPlayerBansController {

    private final GetPlayerBansService getPlayerBansService;

    public GetPlayerBansController(GetPlayerBansService getPlayerBansService) {
        this.getPlayerBansService = getPlayerBansService;
    }

    @GetMapping
    public GetPlayerBansResponse getBans(@RequestParam String steamids) {
        return getPlayerBansService.getPlayerBans(steamids);
    }
}

//EXAMPLE http://localhost:8080/api/playerbans?steamids=76561198051645268
