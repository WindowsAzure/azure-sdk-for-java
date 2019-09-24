// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.credential;

import com.azure.core.credentials.AccessToken;
import com.azure.core.credentials.TokenRequest;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.util.TestUtils;
import com.microsoft.aad.msal4j.MsalServiceException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.azure.identity.*")
@PowerMockIgnore({"com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*"})
public class ClientSecretCredentialTest {

    private final String tenantId = "contoso.com";
    private final String clientId = UUID.randomUUID().toString();

    @Test
    public void testValidSecrets() throws Exception {
        // setup
        String secret = "secret";
        String token1 = "token1";
        String token2 = "token2";
        TokenRequest request1 = new TokenRequest().addScopes("https://management.azure.com");
        TokenRequest request2 = new TokenRequest().addScopes("https://vault.azure.net");
        OffsetDateTime expiresOn = OffsetDateTime.now(ZoneOffset.UTC).plusHours(1);

        // mock
        IdentityClient identityClient = PowerMockito.mock(IdentityClient.class);
        when(identityClient.authenticateWithClientSecret(secret, request1)).thenReturn(TestUtils.getMockAccessToken(token1, expiresOn));
        when(identityClient.authenticateWithClientSecret(secret, request2)).thenReturn(TestUtils.getMockAccessToken(token2, expiresOn));
        PowerMockito.whenNew(IdentityClient.class).withAnyArguments().thenReturn(identityClient);

        // test
        ClientSecretCredential credential =
            new ClientSecretCredentialBuilder().tenantId(tenantId).clientId(clientId).clientSecret(secret).build();
        AccessToken token = credential.getToken(request1).block();
        Assert.assertEquals(token1, token.getToken());
        Assert.assertEquals(expiresOn.getSecond(), token.getExpiresOn().getSecond());
        token = credential.getToken(request2).block();
        Assert.assertEquals(token2, token.getToken());
        Assert.assertEquals(expiresOn.getSecond(), token.getExpiresOn().getSecond());
    }

    @Test
    public void testInvalidSecrets() throws Exception {
        // setup
        String secret = "secret";
        String badSecret = "badsecret";
        String token1 = "token1";
        TokenRequest request = new TokenRequest().addScopes("https://management.azure.com");
        OffsetDateTime expiresOn = OffsetDateTime.now(ZoneOffset.UTC).plusHours(1);

        // mock
        IdentityClient identityClient = PowerMockito.mock(IdentityClient.class);
        when(identityClient.authenticateWithClientSecret(secret, request)).thenReturn(TestUtils.getMockAccessToken(token1, expiresOn));
        when(identityClient.authenticateWithClientSecret(badSecret, request)).thenThrow(new MsalServiceException("bad secret", "BadSecret"));
        PowerMockito.whenNew(IdentityClient.class).withAnyArguments().thenReturn(identityClient);

        // test
        ClientSecretCredential credential =
            new ClientSecretCredentialBuilder().tenantId(tenantId).clientId(clientId).clientSecret(secret).build();
        AccessToken token = credential.getToken(request).block();
        Assert.assertEquals(token1, token.getToken());
        Assert.assertEquals(expiresOn.getSecond(), token.getExpiresOn().getSecond());
        try {
            credential =
                new ClientSecretCredentialBuilder().tenantId(tenantId).clientId(clientId).clientSecret(badSecret).build();
            credential.getToken(request).block();
            fail();
        } catch (MsalServiceException e) {
            Assert.assertEquals("bad secret", e.getMessage());
        }
    }

    @Test
    public void testInvalidParameters() throws Exception {
        // setup
        String secret = "secret";
        String token1 = "token1";
        TokenRequest request = new TokenRequest().addScopes("https://management.azure.com");
        OffsetDateTime expiresOn = OffsetDateTime.now(ZoneOffset.UTC).plusHours(1);

        // mock
        IdentityClient identityClient = PowerMockito.mock(IdentityClient.class);
        when(identityClient.authenticateWithClientSecret(secret, request)).thenReturn(TestUtils.getMockAccessToken(token1, expiresOn));
        PowerMockito.whenNew(IdentityClient.class).withAnyArguments().thenReturn(identityClient);

        // test
        try {
            ClientSecretCredential credential =
                new ClientSecretCredentialBuilder().clientId(clientId).clientSecret(secret).build();
            credential.getToken(request).block();
            fail();
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("tenantId"));
        }
        try {
            ClientSecretCredential credential = new ClientSecretCredentialBuilder().tenantId(tenantId).clientSecret(secret).build();
            credential.getToken(request).block();
            fail();
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("clientId"));
        }
        try {
            ClientSecretCredential credential =
                new ClientSecretCredentialBuilder().tenantId(tenantId).clientId(clientId).build();
            credential.getToken(request).block();
            fail();
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("clientSecret"));
        }
    }
}
