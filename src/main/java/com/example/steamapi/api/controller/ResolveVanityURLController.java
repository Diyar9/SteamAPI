package com.example.steamapi.api.controller;

import com.example.steamapi.api.model.ISteamUser.ResolveVanityURL.ResolveVanityURLResponse;
import com.example.steamapi.api.service.ResolveVanityURLService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resolvevanity")
public class ResolveVanityURLController {

    private final ResolveVanityURLService resolveVanityURLService;

    public ResolveVanityURLController(ResolveVanityURLService resolveVanityURLService) {
        this.resolveVanityURLService = resolveVanityURLService;
    }

    @GetMapping
    public ResolveVanityURLResponse getVanityURL(@RequestParam String vanityurl,
                                                        @RequestParam(required = false) Integer url_type) {
        return resolveVanityURLService.getResolveVanityURL(vanityurl, url_type);
    }
}

//EXAMPLE http://localhost:8080/api/resolvevanity?vanityurl=tangosukah101
