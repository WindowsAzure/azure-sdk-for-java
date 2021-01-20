// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.security.attestation;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class SecuredPolicyResetToken {
    private JWSSigner signer;
    private Base64 signingCertificate;

    SecuredPolicyResetToken(JWSSigner signer, String signingCertificateBase64) {
        this.signer = signer;
        this.signingCertificate = new Base64(signingCertificateBase64);
    }

    String serialize() throws JOSEException {
        List<Base64> certs = new ArrayList<>();
        certs.add(signingCertificate);
        JWSHeader header = new JWSHeader.Builder(JWSAlgorithm.RS256)
            .x509CertChain(certs)
            .build();

        String signedBody = header.toBase64URL() + ".";
        Base64URL signedToken = signer.sign(header, signedBody.getBytes(StandardCharsets.UTF_8));
        return signedBody + "." + signedToken.toString();
    }
}
