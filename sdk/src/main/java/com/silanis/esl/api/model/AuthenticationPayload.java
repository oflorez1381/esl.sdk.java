package com.silanis.esl.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class AuthenticationPayload extends Model implements java.io.Serializable {

    @JsonIgnore
    private static final String FIELD_PAYLOAD = "payload";

    private String payload;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
        setDirty(FIELD_PAYLOAD);
    }
}
