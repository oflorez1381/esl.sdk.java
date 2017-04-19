package com.silanis.esl.sdk.builder;


import com.silanis.esl.sdk.AuthenticationPayload;
import com.silanis.esl.sdk.internal.Asserts;

public class AuthenticationPayloadBuilder {

    private String payload;

    private AuthenticationPayloadBuilder(String payload){
        this.payload = payload;
    }

    public static AuthenticationPayloadBuilder createAuthenticationPayload(String payload){
        return new AuthenticationPayloadBuilder(payload);
    }

    public AuthenticationPayload build(){
        Asserts.notNullOrEmpty(payload, "payload");
        return new AuthenticationPayload(payload);
    }
}
