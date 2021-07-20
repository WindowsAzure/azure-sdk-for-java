// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.security.attestation.implementation.AttestationClientImpl;
import com.azure.security.attestation.implementation.AttestationClientImplBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

/** A builder for creating a new instance of the AttestationClient type. */
@ServiceClientBuilder(
        serviceClients = {
            AttestationAsyncClient.class,
            SigningCertificatesAsyncClient.class
        })
public final class AttestationAsyncClientBuilder {
    private final AttestationClientImplBuilder clientImplBuilder;
    private final ClientLogger logger = new ClientLogger(AttestationAsyncClientBuilder.class);

    /**
     * Creates a new instance of the AttestationClientBuilder class.
     */
    public AttestationAsyncClientBuilder() {
        clientImplBuilder = new AttestationClientImplBuilder();
    }

    /**
     * Sets The attestation endpoint URI, for example https://mytenant.attest.azure.net.
     *
     * @param endpoint The endpoint to connect to.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder endpoint(String endpoint) {
        Objects.requireNonNull(endpoint);
        try {
            new URL(endpoint);
        } catch (MalformedURLException ex) {
            throw logger.logExceptionAsError(new IllegalArgumentException(ex));
        }
        clientImplBuilder.instanceUrl(endpoint);
        return this;
    }

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder pipeline(HttpPipeline pipeline) {
        Objects.requireNonNull(pipeline);
        clientImplBuilder.pipeline(pipeline);
        return this;
    }

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        Objects.requireNonNull(serializerAdapter);
        clientImplBuilder.serializerAdapter(serializerAdapter);
        return this;
    }

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder httpClient(HttpClient httpClient) {
        clientImplBuilder.httpClient(httpClient);
        return this;
    }

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder configuration(Configuration configuration) {
        clientImplBuilder.configuration(configuration);
        return this;
    }

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        clientImplBuilder.httpLogOptions(httpLogOptions);
        return this;
    }

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        clientImplBuilder.retryPolicy(retryPolicy);
        return this;
    }
    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the AttestationClientBuilder.
     */
    public AttestationAsyncClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        clientImplBuilder.addPolicy(customPolicy);
        return this;
    }

    /**
     * Builds an instance of AttestationClientImpl with the provided parameters.
     *
     * @return an instance of AttestationClientImpl.
     */
    private AttestationClientImpl buildInnerClient() {
        return clientImplBuilder.buildClient();
    }

    /**
     * Builds an instance of AttestationAsyncClient async client.
     *
     * @return an instance of AttestationAsyncClient.
     */
    public AttestationAsyncClient buildAttestationAsyncClient() {
        return new AttestationAsyncClient(buildInnerClient());
    }
}
