package com.example.steamapi.api.service;

import com.example.steamapi.api.model.ISteamUser.ResolveVanityURL.ResolveVanityURLResponse;

public interface ResolveVanityURLService {
    ResolveVanityURLResponse getResolveVanityURL(String vanityurl, Integer url_type);
}
