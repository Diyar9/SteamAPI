package com.example.steamapi.api.model.ISteamUser.GetPlayerBans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Players {

    private String SteamId;
    private boolean CommunityBanned;
    private boolean VACBanned;
    private Integer NumberOfVACBans;
    private Integer DaysSinceLastBan;
    private Integer NumberOfGameBans;
    private String EconomyBan;

    @JsonProperty("SteamId")
    public String getSteamId() { return SteamId; }
    public void setSteamId(String SteamId) { this.SteamId = SteamId; }

    @JsonProperty("CommunityBanned")
    public boolean isCommunityBanned() { return CommunityBanned; }
    public void setCommunityBanned(Boolean CommunityBanned) { this.CommunityBanned = CommunityBanned; }

    @JsonProperty("VACBanned")
    public boolean isVACBanned() { return VACBanned; }
    public void setVACBanned(Boolean VACBanned) { this.VACBanned = VACBanned; }

    @JsonProperty("NumberOfVACBans")
    public Integer getNumberOfVACBans() { return NumberOfVACBans; }
    public void setNumberOfVACBans(Integer NumberOfVACBans) { this.NumberOfVACBans = NumberOfVACBans; }

    @JsonProperty("DaysSinceLastBan")
    public Integer getDaysSinceLastBan() { return DaysSinceLastBan; }
    public void setDaysSinceLastBan(Integer daysSinceLastBan) { this.DaysSinceLastBan = daysSinceLastBan; }

    @JsonProperty("NumberOfGameBans")
    public Integer getNumberOfGameBans() { return NumberOfGameBans; }
    public void setNumberOfGameBans(Integer NumberOfGameBans) { this.NumberOfGameBans = NumberOfGameBans; }

    @JsonProperty("EconomyBan")
    public String getEconomyBan() { return EconomyBan; }
    public void setEconomyBan(String economyBan) { this.EconomyBan = economyBan; }
}
