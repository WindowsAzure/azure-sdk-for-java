// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.annotation.Immutable;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.util.Configuration;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.implementation.IdentityClientBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import reactor.core.publisher.Mono;

/**
 * The base class for Managed Service Identity token based credentials.
 */
@Immutable
public final class ManagedIdentityCredential implements TokenCredential {
    private final AppServiceMSICredential appServiceMSICredential;
    private final VirtualMachineMSICredential virtualMachineMSICredential;

    /**
     * Creates an instance of the ManagedIdentityCredential.
     * @param clientId the client id of user assigned or system assigned identity
     * @param identityClientOptions the options for configuring the identity client.
     */
    ManagedIdentityCredential(String clientId, IdentityClientOptions identityClientOptions) {
        IdentityClient identityClient = new IdentityClientBuilder()
            .clientId(clientId)
            .identityClientOptions(identityClientOptions)
            .build();
        Configuration configuration = Configuration.getGlobalConfiguration();
        if (configuration.contains(Configuration.PROPERTY_MSI_ENDPOINT)) {
            appServiceMSICredential = new AppServiceMSICredential(clientId, identityClient);
            virtualMachineMSICredential = null;
        } else {
            virtualMachineMSICredential = new VirtualMachineMSICredential(clientId, identityClient);
            appServiceMSICredential = null;
        }
    }

    /**
     * @return the client id of user assigned or system assigned identity.
     */
    public String getClientId() {
        return this.appServiceMSICredential != null
            ? this.appServiceMSICredential.getClientId()
            : this.virtualMachineMSICredential.getClientId();
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        return (appServiceMSICredential != null
            ? appServiceMSICredential.authenticate(request)
            : virtualMachineMSICredential.authenticate(request));
    }
}
