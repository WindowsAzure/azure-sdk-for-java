// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.credential;

import com.azure.core.credentials.TokenRequest;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.util.TestUtils;
import com.microsoft.aad.msal4j.MsalServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import reactor.test.StepVerifier;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.azure.identity.*")
@PowerMockIgnore({"com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*"})
public class ClientCertificateCredentialTest {

    private final String tenantId = "contoso.com";
    private final String clientId = UUID.randomUUID().toString();

    @Test
    public void testValidCertificates() throws Exception {
        // setup
        String pemPath = "C:\\fakepath\\cert1.pem";
        String pfxPath = "C:\\fakepath\\cert2.pfx";
        String pfxPassword = "password";
        String token1 = "token1";
        String token2 = "token2";
        TokenRequest request1 = new TokenRequest().addScopes("https://management.azure.com");
        TokenRequest request2 = new TokenRequest().addScopes("https://vault.azure.net");
        OffsetDateTime expiresOn = OffsetDateTime.now(ZoneOffset.UTC).plusHours(1);

        // mock
        IdentityClient identityClient = PowerMockito.mock(IdentityClient.class);
        when(identityClient.authenticateWithPemCertificate(pemPath, request1)).thenReturn(TestUtils.getMockAccessToken(token1, expiresOn));
        when(identityClient.authenticateWithPfxCertificate(pfxPath, pfxPassword, request2)).thenReturn(TestUtils.getMockAccessToken(token2, expiresOn));
        PowerMockito.whenNew(IdentityClient.class).withAnyArguments().thenReturn(identityClient);

        // test
        ClientCertificateCredential credential =
            new ClientCertificateCredentialBuilder().tenantId(tenantId).clientId(clientId).pemCertificate(pemPath).build();
        StepVerifier.create(credential.getToken(request1))
            .expectNextMatches(accessToken -> token1.equals(accessToken.getToken())
                && expiresOn.getSecond() == accessToken.getExpiresOn().getSecond())
            .verifyComplete();
        credential =
            new ClientCertificateCredentialBuilder().tenantId(tenantId).clientId(clientId).pfxCertificate(pfxPath, pfxPassword).build();
        StepVerifier.create(credential.getToken(request2))
            .expectErrorMatches(e -> e instanceof MsalServiceException && "bad secret".equals(e.getMessage()))
            .verify();
    }

    @Test
    public void testInvalidCertificates() throws Exception {
        // setup
        String pemPath = "C:\\fakepath\\cert1.pem";
        String pfxPath = "C:\\fakepath\\cert2.pfx";
        String pfxPassword = "password";
        TokenRequest request1 = new TokenRequest().addScopes("https://management.azure.com");
        TokenRequest request2 = new TokenRequest().addScopes("https://vault.azure.net");
        OffsetDateTime expiresOn = OffsetDateTime.now(ZoneOffset.UTC).plusHours(1);

        // mock
        IdentityClient identityClient = PowerMockito.mock(IdentityClient.class);
        when(identityClient.authenticateWithPemCertificate(pemPath, request1)).thenThrow(new MsalServiceException("bad pem", "BadPem"));
        when(identityClient.authenticateWithPfxCertificate(pfxPath, pfxPassword, request2)).thenThrow(new MsalServiceException("bad pfx", "BadPfx"));
        PowerMockito.whenNew(IdentityClient.class).withAnyArguments().thenReturn(identityClient);

        // test
        ClientCertificateCredential credential =
            new ClientCertificateCredentialBuilder().tenantId(tenantId).clientId(clientId).pemCertificate(pemPath).build();
        StepVerifier.create(credential.getToken(request1))
            .expectErrorMatches(e -> e instanceof MsalServiceException && "bad pem".equals(e.getMessage()))
            .verify();

        credential =
            new ClientCertificateCredentialBuilder().tenantId(tenantId).clientId(clientId).pfxCertificate(pfxPath, pfxPassword).build();
        StepVerifier.create(credential.getToken(request1))
            .expectErrorMatches(e -> e instanceof MsalServiceException && "bad pfx".equals(e.getMessage()))
            .verify();
    }

    @Test
    public void testInvalidParameters() throws Exception {
        // setup
        String pemPath = "C:\\fakepath\\cert1.pem";
        String token1 = "token1";
        TokenRequest request = new TokenRequest().addScopes("https://management.azure.com");
        OffsetDateTime expiresOn = OffsetDateTime.now(ZoneOffset.UTC).plusHours(1);

        // mock
        IdentityClient identityClient = PowerMockito.mock(IdentityClient.class);
        when(identityClient.authenticateWithPemCertificate(pemPath, request)).thenReturn(TestUtils.getMockAccessToken(token1, expiresOn));
        PowerMockito.whenNew(IdentityClient.class).withAnyArguments().thenReturn(identityClient);

        // test
        ClientCertificateCredential credential =
            new ClientCertificateCredentialBuilder().clientId(clientId).pemCertificate(pemPath).build();
        StepVerifier.create(credential.getToken(request))
            .expectErrorMatches(e -> e instanceof IllegalArgumentException && e.getMessage().contains("tenantId"))
            .verify();

        credential = new ClientCertificateCredentialBuilder().tenantId(tenantId).pemCertificate(pemPath).build();
        StepVerifier.create(credential.getToken(request))
            .expectErrorMatches(e -> e instanceof IllegalArgumentException && e.getMessage().contains("clientId"))
            .verify();

        credential = new ClientCertificateCredentialBuilder().tenantId(tenantId).clientId(clientId).build();
        StepVerifier.create(credential.getToken(request))
            .expectErrorMatches(e -> e instanceof IllegalArgumentException && e.getMessage().contains("clientCertificate"))
            .verify();
    }
}
