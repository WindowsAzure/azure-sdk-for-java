// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.util.Configuration;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.implementation.IdentityClientBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import com.azure.identity.implementation.MsalToken;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicReference;

/**
 * A credential provider that provides token credentials from the MSAL shared token cache.
 * Requires a username and client Id. If a username is not provided, then the
 * {@link Configuration#PROPERTY_AZURE_USERNAME AZURE_USERNAME} environment variable will be used.
 */
public class SharedTokenCacheCredential implements TokenCredential {
    private final String username;
    private final String clientId;
    private final String tenantId;
    private final AtomicReference<MsalToken> cachedToken;

    private final IdentityClient identityClient;

    /**
     * Creates an instance of the Shared Token Cache Credential Provider.
     *
     * @param username the username of the account for the application
     * @param clientId the client ID of the application
     * @param identityClientOptions the options for configuring the identity client
     */
    SharedTokenCacheCredential(String username, String clientId, String tenantId,
                               IdentityClientOptions identityClientOptions) {
        Configuration configuration = Configuration.getGlobalConfiguration().clone();

        if (username == null) {
            this.username = configuration.get(Configuration.PROPERTY_AZURE_USERNAME);
        } else {
            this.username = username;
        }
        if (clientId == null) {
            this.clientId = configuration.get(Configuration.PROPERTY_AZURE_CLIENT_ID);
        } else {
            this.clientId = clientId;
        }
        if (tenantId == null) {
            this.tenantId = configuration.contains(Configuration.PROPERTY_AZURE_TENANT_ID)
                    ? configuration.get(Configuration.PROPERTY_AZURE_TENANT_ID) : "common";
        } else {
            this.tenantId = tenantId;
        }
        this.identityClient = new IdentityClientBuilder()
                .tenantId(this.tenantId)
                .clientId(this.clientId)
                .identityClientOptions(identityClientOptions)
                .build();
        this.cachedToken = new AtomicReference<>();
    }

    /**
     * Gets token from shared token cache
     * */
    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        return Mono.defer(() -> {
            if (cachedToken.get() != null) {
                return identityClient.authenticateWithPublicClientCache(request, cachedToken.get().getAccount())
                    .onErrorResume(t -> Mono.empty());
            } else {
                return Mono.empty();
            }
        }).switchIfEmpty(
            Mono.defer(() -> identityClient.authenticateWithSharedTokenCache(request, username)))
            .map(msalToken -> {
                cachedToken.set(msalToken);
                return msalToken;
            });
    }
}
