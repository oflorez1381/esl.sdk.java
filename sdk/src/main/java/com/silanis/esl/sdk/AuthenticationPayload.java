package com.silanis.esl.sdk;

public class AuthenticationPayload implements java.io.Serializable {

    private String payload;

    public AuthenticationPayload(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
