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

/** Initializes a new instance of the synchronous AzureAttestationRestClient type. */
@ServiceClient(builder = AttestationClientBuilder.class)
public final class SigningCertificatesClient {
    private final SigningCertificatesImpl serviceClient;

    /**
     * Initializes an instance of SigningCertificates client.
     *
     * @param serviceClient the service client implementation.
     */
    SigningCertificatesClient(SigningCertificatesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Retrieves metadata signing certificates in use by the attestation service.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JsonWebKeySet get() {
        return JsonWebKeySet.fromGenerated(serviceClient.get());
    }

    /**
     * Retrieves metadata signing certificates in use by the attestation service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<JsonWebKeySet> getWithResponse(Context context) {
        Response<com.azure.security.attestation.implementation.models.JsonWebKeySet> response = serviceClient.getWithResponse(context);
        return Utilities.generateResponseFromModelType(response, JsonWebKeySet.fromGenerated(response.getValue()));
    }
}
