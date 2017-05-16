package com.michaelfotiadis.steam.data.player.response;

import com.google.gson.annotations.SerializedName;
import com.michaelfotiadis.steam.data.player.model.AccountDetails;

import java.util.List;

public class PlayerResponse {

    @SerializedName("players")
    private final List<AccountDetails> players;

    public PlayerResponse(final List<AccountDetails> players) {
        this.players = players;
    }

    public List<AccountDetails> getPlayers() {
        return this.players;
    }

}