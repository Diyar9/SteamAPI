package com.example.steamapi.api.model.ISteamUser.GetPlayerSummaries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Players {

    private String steamid;
    private Integer communityvisibilitystate;
    private Integer profilestate;
    private String personaname;
    private Integer commentpermission;
    private String profileurl;
    private String avatar;
    private String avatarmedium;
    private String avatarfull;
    private String avatarhash;
    private Integer lastlogoff;
    private Integer personastate;
    private String realname;
    private String primaryclanid;
    private long timecreated;
    private Integer personastateflags;
    private String loccountrycode;

    @JsonProperty("steamid")
    public String getSteamid() { return steamid; }
    public void setSteamid(String steamid) { this.steamid = steamid; }

    @JsonProperty("communityvisibilitystate")
    public Integer getCommunityvisibilitystate() { return communityvisibilitystate; }
    public void setCommunityvisibilitystate(Integer communityvisibilitystate) { this.communityvisibilitystate = communityvisibilitystate; }

    @JsonProperty("profilestate")
    public Integer getProfilestate() { return profilestate; }
    public void setProfilestate(Integer profilestate) { this.profilestate = profilestate; }

    @JsonProperty("personaname")
    public String getPersonaname() { return personaname; }
    public void setPersonaname(String personaname) { this.personaname = personaname; }

    @JsonProperty("commentpermission")
    public Integer getCommentpermission() { return commentpermission; }
    public void setCommentpermission(Integer commentpermission) { this.commentpermission = commentpermission; }

    @JsonProperty("profileurl")
    public String getProfileurl() { return profileurl; }
    public void setProfileurl(String profileurl) { this.profileurl = profileurl; }

    @JsonProperty("avatar")
    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }

    @JsonProperty("avatarmedium")
    public String getAvatarmedium() { return avatarmedium; }
    public void setAvatarmedium(String avatarmedium) { this.avatarmedium = avatarmedium; }

    @JsonProperty("avatarfull")
    public String getAvatarfull() { return avatarfull; }
    public void setAvatarfull(String avatarfull) { this.avatarfull = avatarfull; }

    @JsonProperty("avatarhash")
    public String getAvatarhash() { return avatarhash; }
    public void setAvatarhash(String avatarhash) { this.avatarhash = avatarhash; }

    @JsonProperty("lastlogoff")
    public Integer getLastlogoff() { return lastlogoff; }
    public void setLastlogoff(Integer lastlogoff) { this.lastlogoff = lastlogoff; }

    @JsonProperty("personastate")
    public Integer getPersonastate() { return personastate; }
    public void setPersonastate(Integer personastate) { this.personastate = personastate; }

    @JsonProperty("realname")
    public String getRealname() { return realname; }
    public void setRealname(String realname) { this.realname = realname; }

    @JsonProperty("primaryclanid")
    public String getPrimaryclanid() { return primaryclanid; }
    public void setPrimaryclanid(String primaryclanid) { this.primaryclanid = primaryclanid; }

    @JsonProperty("timecreated")
    public long getTimecreated() { return timecreated; }
    public void setTimecreated(long timecreated) { this.timecreated = timecreated; }

    @JsonProperty("personastateflags")
    public Integer getPersonastateflags() { return personastateflags; }
    public void setPersonastateflags(Integer personastateflags) { this.personastateflags = personastateflags; }

    @JsonProperty("loccountrycode")
    public String getLoccountrycode() { return loccountrycode; }
    public void setLoccountrycode(String loccountrycode) { this.loccountrycode = loccountrycode; }
}
