package com.silanis.esl.sdk.examples;


import com.silanis.esl.sdk.DocumentPackage;
import org.junit.Assert;
import org.junit.Test;

public class AuthenticationPayloadExampleTest {

    @Test
    public void verifyResult() {
        AuthenticationPayloadExample example = new AuthenticationPayloadExample();
        example.run();

        DocumentPackage documentPackage = example.getRetrievedPackage();

        Assert.assertNotNull(documentPackage.getSigner(example.email2).getAuthenticationPayload());
        Assert.assertEquals(documentPackage.getSigner(example.email2).getAuthenticationPayload().getPayload(), AuthenticationPayloadExample.PAYLOAD);

    }
}
