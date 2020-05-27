// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.annotation.Immutable;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.implementation.IdentityClientBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import com.azure.identity.implementation.MsalAuthenticationAccount;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/**
 * An AAD credential that acquires a token with a device code for an AAD application.
 */
@Immutable
public class DeviceCodeCredential implements TokenCredential {
    private final Consumer<DeviceCodeInfo> challengeConsumer;
    private final IdentityClient identityClient;
    private final AtomicReference<MsalAuthenticationAccount> cachedToken;
    private final String authorityHost;
    private final boolean automaticAuthentication;

    /**
     * Creates a DeviceCodeCredential with the given identity client options.
     *
     * @param clientId the client ID of the application
     * @param tenantId the tenant ID of the application
     * @param challengeConsumer a method allowing the user to meet the device code challenge
     * @param identityClientOptions the options for configuring the identity client
     */
    DeviceCodeCredential(String clientId, String tenantId, Consumer<DeviceCodeInfo> challengeConsumer,
                         boolean automaticAuthentication, IdentityClientOptions identityClientOptions) {
        this.challengeConsumer = challengeConsumer;
        identityClient = new IdentityClientBuilder()
            .tenantId(tenantId)
            .clientId(clientId)
            .identityClientOptions(identityClientOptions)
            .build();
        this.cachedToken = new AtomicReference<>();
        this.authorityHost = identityClientOptions.getAuthorityHost();
        this.automaticAuthentication = automaticAuthentication;
        if (identityClientOptions.getAuthenticationRecord() != null) {
            cachedToken.set(new MsalAuthenticationAccount(identityClientOptions.getAuthenticationRecord()));
        }
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        return Mono.defer(() -> {
            if (cachedToken.get() != null) {
                return identityClient.authenticateWithMsalAccount(request, cachedToken.get())
                    .onErrorResume(t -> Mono.empty());
            } else {
                return Mono.empty();
            }
        }).switchIfEmpty(
            Mono.defer(() -> {
                if (!automaticAuthentication) {
                    return Mono.error(new AuthenticationRequiredException("Interactive authentication is needed to "
                              + "acquire token. Call Authenticate to initiate the device code authentication."));
                }
                return identityClient.authenticateWithDeviceCode(request, challengeConsumer);
            }))
            .map(msalToken -> {
                cachedToken.set(
                        new MsalAuthenticationAccount(
                                new AuthenticationRecord(msalToken.getAuthenticationResult(),
                                        identityClient.getTenantId())));
                return msalToken;
            });
    }

    /**
     * Interactively authenticates a user via the default browser.
     *
     * @param request The details of the authentication request.
     *
     * @return The {@link AuthenticationRecord} which can be used to silently authenticate the account
     * on future execution if persistent caching was enabled via
     * {@link DeviceCodeCredentialBuilder#enablePersistentCache(boolean)} when credential was instantiated.
     */
    public Mono<AuthenticationRecord> authenticate(TokenRequestContext request) {
        return Mono.defer(() -> identityClient.authenticateWithDeviceCode(request, challengeConsumer))
                       .map(msalToken -> new AuthenticationRecord(msalToken.getAuthenticationResult(),
                               identityClient.getTenantId()));
    }

    /**
     * Interactively authenticates a user via the default browser.
     *
     * @return The {@link AuthenticationRecord} which can be used to silently authenticate the account
     * on future execution if persistent caching was enabled via
     * {@link DeviceCodeCredentialBuilder#enablePersistentCache(boolean)} when credential was instantiated.
     */
    public Mono<AuthenticationRecord> authenticate() {
        String defaultScope = KnownAuthorityHosts.getDefaultScope(authorityHost);
        if (defaultScope == null) {
            return Mono.error(new AuthenticationRequiredException("Authenticating in this environment requires"
                                                      + " specifying a TokenRequestContext."));
        }
        return authenticate(new TokenRequestContext().addScopes(defaultScope));
    }
}
