package br.com.cdm.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Stamp(
        @JsonProperty("stamp_id")
        int stampId,
        @JsonProperty("country")
        String country,
        @JsonProperty("price")
        double price,
        @JsonProperty("mainPicture")
        @JsonAlias("main_picture")
        String mainPicture) {
}
