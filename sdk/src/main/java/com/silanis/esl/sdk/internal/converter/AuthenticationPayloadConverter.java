package com.silanis.esl.sdk.internal.converter;


import com.silanis.esl.sdk.AuthenticationPayload;
import com.silanis.esl.sdk.builder.AuthenticationPayloadBuilder;

public class AuthenticationPayloadConverter {


    private com.silanis.esl.sdk.AuthenticationPayload sdkAuthenticationPayload = null;
    private com.silanis.esl.api.model.AuthenticationPayload apiAuthenticationPayload= null;


    public AuthenticationPayloadConverter(com.silanis.esl.sdk.AuthenticationPayload sdkAuthenticationPayload){
        this.sdkAuthenticationPayload = sdkAuthenticationPayload;
    }

    public AuthenticationPayloadConverter(com.silanis.esl.api.model.AuthenticationPayload apiAuthenticationPayload){
        this.apiAuthenticationPayload = apiAuthenticationPayload;
    }

    public com.silanis.esl.api.model.AuthenticationPayload toAPIAuthenticationPayload(){

        if (sdkAuthenticationPayload == null) {
            return apiAuthenticationPayload;
        }

        com.silanis.esl.api.model.AuthenticationPayload result = new com.silanis.esl.api.model.AuthenticationPayload();
        result.setPayload(sdkAuthenticationPayload.getPayload());

        return result;
    }

    public com.silanis.esl.sdk.AuthenticationPayload toSDKAuthenticationPayload(){

        if (apiAuthenticationPayload == null) {
            return sdkAuthenticationPayload;
        }

        com.silanis.esl.sdk.AuthenticationPayload result = AuthenticationPayloadBuilder.
                createAuthenticationPayload(apiAuthenticationPayload.getPayload()).build();

        return result;
    }


}
