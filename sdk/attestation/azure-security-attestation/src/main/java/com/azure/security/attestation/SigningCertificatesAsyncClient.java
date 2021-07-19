// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.security.attestation.implementation.SigningCertificatesImpl;
import com.azure.security.attestation.models.CloudErrorException;
import com.azure.security.attestation.models.JsonWebKeySet;
import reactor.core.publisher.Mono;

import static com.azure.core.util.FluxUtil.withContext;

/** Initializes a new instance of the asynchronous AzureAttestationRestClient type. */
@ServiceClient(builder = AttestationClientBuilder.class, isAsync = true)
public final class SigningCertificatesAsyncClient {
    private final SigningCertificatesImpl serviceClient;

    /**
     * Initializes an instance of SigningCertificates client.
     *
     * @param serviceClient the service client implementation.
     */
    SigningCertificatesAsyncClient(SigningCertificatesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Retrieves metadata signing certificates in use by the attestation service.
     *
     * @param context - Context to associate with this operation.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JsonWebKeySet>> getWithResponse(Context context) {
        return this.serviceClient.getWithResponseAsync(context)
            .map(response -> Utilities.generateResponseFromModelType(response, JsonWebKeySet.fromGenerated(response.getValue())));
    }

    /**
     * Retrieves metadata signing certificates in use by the attestation service.
     *
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JsonWebKeySet> get() {
        return withContext(context -> this.getWithResponse(context))
            .map(response -> response.getValue());
    }
}
