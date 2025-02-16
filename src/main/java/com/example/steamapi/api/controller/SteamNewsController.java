package com.example.steamapi.api.controller;

import com.example.steamapi.api.model.ISteamNews.GetNewsForApp.SteamNewsResponse;
import com.example.steamapi.api.service.SteamNewsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/steamnews")
public class SteamNewsController {

    private final SteamNewsService steamNewsService;

    public SteamNewsController(SteamNewsService steamNewsService) {
        this.steamNewsService = steamNewsService;
    }

    @GetMapping("/{appid}")
    public SteamNewsResponse getNews(@PathVariable int appid,
                                     @RequestParam(required = false) Long count,
                                     @RequestParam(required = false) Integer maxlength,
                                     @RequestParam(required = false) Long enddate,
                                     @RequestParam(required = false) String feeds) {
        return steamNewsService.getNewsForApp(appid, count, maxlength, enddate, feeds);
    }
}