// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.http.policy.UserAgentPolicy;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Client Options for setting various properties on the client. The {@link ClientOptions} is set on the builder at the
 * time of building the client.
 * <p>
 * The {@link Header} could be set using {@link ClientOptions#setHeaders(Iterable) setHeaders}. The {@link Header} will
 * be applied on the request being sent to Azure Service.
 * <p>
 * The {@code applicationId} could be set using {@link ClientOptions#setApplicationId(String) setApplicationId} which
 * is used for setting {@code applicationId} in the {@link UserAgentPolicy}.
 */
@Fluent
public final class ClientOptions {
    private static final int MAX_APPLICATION_ID_LENGTH = 24;
    private final ClientLogger logger = new ClientLogger(ClientOptions.class);
    private Iterable<Header> headers;

    private String applicationId;

    /**
     * Gets the applicationId.
     * @return The applicationId.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the applicationId provided.
     * @param applicationId to be set.
     *
     * @return updated {@link ClientOptions}.
     */
    public ClientOptions setApplicationId(String applicationId) {

        if (CoreUtils.isNullOrEmpty(applicationId)) {
            this.applicationId = applicationId;
            return this;
        }

        if (applicationId.length() > MAX_APPLICATION_ID_LENGTH) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("'applicationId' length cannot be greater than "
                    + MAX_APPLICATION_ID_LENGTH));
        } else if (applicationId.contains(" ")) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("'applicationId' must not contain a space."));
        } else {
            this.applicationId = applicationId;
        }

        return this;
    }

    /**
     * Sets the provided headers, overwriting all previously-set headers in the process.
     * @param headers headers to be set.
     *
     * @return updated {@link ClientOptions}.
     * @throws NullPointerException if {@code headers} is null.
     */
    public ClientOptions setHeaders(Iterable<Header> headers) {
        this.headers = Objects.requireNonNull(headers, "'headers' cannot be null.");
        return this;
    }

    /**
     * Gets a {@link Iterable} representation of the {@link Header}.
     * @return the headers.
     */
    public Iterable<Header> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<>();
        }
        return headers;
    }
}
