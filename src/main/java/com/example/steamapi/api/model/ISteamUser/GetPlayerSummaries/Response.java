package com.example.steamapi.api.model.ISteamUser.GetPlayerSummaries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    private List<Players> players;

    @JsonProperty("players")
    public List<Players> getPlayers() { return players; }
    public void setPlayers(List<Players> players) { this.players = players; }
}
