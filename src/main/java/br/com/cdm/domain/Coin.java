package br.com.cdm.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Coin(
        @JsonProperty("coinId")
        @JsonAlias({"coin_id", "coin__id"})
        int coinId,
        @JsonProperty("country")
        String country,
        @JsonProperty("price")
        double price,
        @JsonProperty("weight")
        double weight) {
}
