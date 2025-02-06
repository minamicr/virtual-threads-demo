package br.com.cdm.service;

import br.com.cdm.domain.Coin;
import br.com.cdm.domain.Stamp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectConverter {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public Object convertItem(String objectJson) {
        try {
            // Converts a json string into a Coin object
            Coin coin = objectMapper.readValue(objectJson, Coin.class);

            if (coin.coinId() > 0)
                return coin;

            // Converts a json string into a Stamp object
            return objectMapper.readValue(objectJson, Stamp.class);

        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
            return null;
        }

    }

}
