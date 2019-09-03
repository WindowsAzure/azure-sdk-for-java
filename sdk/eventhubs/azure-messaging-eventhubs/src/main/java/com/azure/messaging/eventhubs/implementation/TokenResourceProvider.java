// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.implementation;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.EventHubErrorCodeStrings;

import java.util.Locale;
import java.util.Objects;

/**
 * Generates the correct resource scope to access Event Hubs resources given the authorization type.
 */
class TokenResourceProvider {
    private static final String TOKEN_AUDIENCE_FORMAT = "amqp://%s/%s";
    private static final String AZURE_ACTIVE_DIRECTORY_SCOPE = "https://eventhubs.azure.net//.default";

    private final ClientLogger logger = new ClientLogger(TokenResourceProvider.class);
    private final CBSAuthorizationType authorizationType;
    private final String host;

    TokenResourceProvider(CBSAuthorizationType authorizationType, String host) {
        Objects.requireNonNull(authorizationType);
        Objects.requireNonNull(host);

        this.host = host;
        this.authorizationType = authorizationType;
    }

    String getResourceString(String resource) {
        switch (authorizationType) {
            case JSON_WEB_TOKEN:
                return AZURE_ACTIVE_DIRECTORY_SCOPE;
            case SHARED_ACCESS_SIGNATURE:
                return String.format(Locale.US, TOKEN_AUDIENCE_FORMAT, host, resource);
            default:
                throw logger.logExceptionAsError(new IllegalArgumentException(String.format(Locale.US,
                    EventHubErrorCodeStrings.getErrorString(EventHubErrorCodeStrings.UNSUPPORTED_AUTHORIZATION_TYPE), authorizationType)));
        }
    }
}
