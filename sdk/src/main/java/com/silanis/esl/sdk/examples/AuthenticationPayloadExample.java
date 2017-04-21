package com.silanis.esl.sdk.examples;


import com.silanis.esl.sdk.DocumentPackage;
import com.silanis.esl.sdk.DocumentType;
import com.silanis.esl.sdk.builder.*;

public class AuthenticationPayloadExample extends SDKSample {

    public static String PAYLOAD = "Xz3AwPp9xazJ0ku5CZnlmgAx2DlJJGw0k0kd8SHkAeT";

    public static void main( String... args ) {
        new AuthenticationPayloadExample().run();
    }

    @Override
    protected void execute() {

        DocumentPackage documentPackage = PackageBuilder.newPackageNamed(packageName)
                .withSigner(SignerBuilder.newSignerWithEmail(email1)
                        .withFirstName("John1")
                        .withLastName("Smith1"))
                .withSigner(SignerBuilder.newSignerWithEmail(email2)
                        .withFirstName("John2")
                        .withLastName("Smith2")
                        .withAuthenticationPayload(AuthenticationPayloadBuilder.createAuthenticationPayload(PAYLOAD)))
                .withDocument(DocumentBuilder.newDocumentWithName("Custom Consent Document")
                        .fromStream(documentInputStream1, DocumentType.PDF)
                        .withSignature(SignatureBuilder.signatureFor(email2)
                                .onPage(0)
                                .atPosition(100, 100)))
                .build();

        packageId = eslClient.createPackage(documentPackage);
        retrievedPackage = eslClient.getPackage(packageId);

    }
}
