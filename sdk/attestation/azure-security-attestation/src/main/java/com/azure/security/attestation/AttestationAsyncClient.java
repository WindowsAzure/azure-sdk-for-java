// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.security.attestation.implementation.AttestationsImpl;
import com.azure.security.attestation.models.AttestOpenEnclaveRequest;
import com.azure.security.attestation.models.AttestSgxEnclaveRequest;
import com.azure.security.attestation.models.AttestationResponse;
import com.azure.security.attestation.models.CloudErrorException;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

/** Initializes a new instance of the asynchronous AzureAttestationRestClient type. */
@ServiceClient(builder = AttestationClientBuilder.class, isAsync = true)
public final class AttestationAsyncClient {
    private final AttestationsImpl serviceClient;

    /**
     * Initializes an instance of Attestations client.
     *
     * @param serviceClient the service client implementation.
     */
    AttestationAsyncClient(AttestationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AttestationResponse>> attestOpenEnclaveWithResponse(AttestOpenEnclaveRequest request) {
        return this.serviceClient.attestOpenEnclaveWithResponseAsync(request.toGenerated())
            .map(response -> Utilities.generateResponseFromModelType(response, AttestationResponse.fromGenerated(response.getValue())));
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AttestationResponse> attestOpenEnclave(AttestOpenEnclaveRequest request) {
        return serviceClient.attestOpenEnclaveAsync(request.toGenerated())
            .map(AttestationResponse::fromGenerated);
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AttestationResponse>> attestSgxEnclaveWithResponse(AttestSgxEnclaveRequest request) {
        return this.serviceClient.attestSgxEnclaveWithResponseAsync(request.toGenerated())
            .map(response ->  Utilities.generateResponseFromModelType(response, AttestationResponse.fromGenerated(response.getValue())));
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AttestationResponse> attestSgxEnclave(AttestSgxEnclaveRequest request) {
        return this.serviceClient.attestSgxEnclaveAsync(request.toGenerated())
            .map(AttestationResponse::fromGenerated);
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<String>> attestTpmWithResponse(String request) {
        return this.serviceClient.attestTpmWithResponseAsync(new com.azure.security.attestation.implementation.models.TpmAttestationRequest().setData(request.getBytes(StandardCharsets.UTF_8)))
            .map(response -> Utilities.generateResponseFromModelType(response, new String(Objects.requireNonNull(response.getValue().getData()), StandardCharsets.UTF_8)));
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<String> attestTpm(String request) {
        return this.serviceClient.attestTpmAsync(new com.azure.security.attestation.implementation.models.TpmAttestationRequest().setData(request.getBytes(StandardCharsets.UTF_8)))
            .map(response -> new String(response.getData(), StandardCharsets.UTF_8));
    }
}
