// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.security.attestation.models.AttestOpenEnclaveRequest;
import com.azure.security.attestation.models.AttestSgxEnclaveRequest;
import com.azure.security.attestation.models.AttestationResponse;
import com.azure.security.attestation.models.AttestationSigner;
import com.azure.security.attestation.models.CloudErrorException;

import static com.azure.core.util.FluxUtil.withContext;

/** Initializes a new instance of the synchronous AttestationClient object. */
@ServiceClient(builder = AttestationClientBuilder.class)
public final class AttestationClient {
    private final AttestationAsyncClient asyncClient;

    /**
     * Initializes an instance of Attestations client.
     *
     * @param serviceClient the service client implementation.
     */
    AttestationClient(AttestationAsyncClient serviceClient) {
        this.asyncClient = serviceClient;
    }

    /**
     * Retrieves the OpenId Metadata for this AttestationClient instance.
     * @return Object containing the OpenId metadata configuration for this instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getOpenIdMetadata() {
        return withContext(context -> asyncClient.getOpenIdMetadataWithResponse(context))
            .map(Response::getValue).block();
    }

    /**
     * Retrieves the OpenId Metadata for this AttestationClient instance.
     *
     * @param context - Context for this operation.
     * @return Object containing the OpenId metadata configuration for this instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Object> getOpenIdMetadataWithResponse(Context context) {
        return asyncClient.getOpenIdMetadataWithResponse(context).block();
    }

    /**
     * Retrieves the list of {@link AttestationSigner} objects associated with this attestation instance.
     * An {@link AttestationSigner} represents an X.509 certificate chain and KeyId which can be used
     * to validate an attestation token returned by the service.
     *
     * @return Returns an array of {@link AttestationSigner} objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationSigner[] getAttestationSigners() {
        return withContext(context -> asyncClient.getAttestationSignersWithResponse(context))
            .map(Response::getValue).block();
    }

    /**
     * Retrieves the list of {@link AttestationSigner} objects associated with this attestation instance.
     * An {@link AttestationSigner} represents an X.509 certificate chain and KeyId which can be used
     * to validate an attestation token returned by the service.
     *
     * @param context Context for the operation.
     *
     * @return Returns an array of {@link AttestationSigner} objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationSigner[]> getAttestationSignersWithResponse(Context context) {
        return asyncClient.getAttestationSignersWithResponse(context).block();
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
    public AttestationResponse attestOpenEnclave(AttestOpenEnclaveRequest request) {
        return asyncClient.attestOpenEnclave(request).block();
    }

    /**
     * Processes an OpenEnclave report , producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResponse> attestOpenEnclaveWithResponse(
            AttestOpenEnclaveRequest request, Context context) {

        return asyncClient.attestOpenEnclaveWithResponse(request, context).block();
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
    public AttestationResponse attestSgxEnclave(AttestSgxEnclaveRequest request) {
        return asyncClient.attestSgxEnclave(request).block();
    }

    /**
     * Processes an SGX enclave quote, producing an artifact. The type of artifact produced is dependent upon
     * attestation policy.
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResponse> attestSgxEnclaveWithResponse(
            AttestSgxEnclaveRequest request, Context context) {
        return asyncClient.attestSgxEnclaveWithResponse(request, context).block();
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
    public String attestTpm(String request) {
        return asyncClient.attestTpm(request).block();
    }

    /**
     * Processes attestation evidence from a VBS enclave, producing an attestation result. The attestation result
     * produced is dependent upon the attestation policy.
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<String> attestTpmWithResponse(String request, Context context) {
        return asyncClient.attestTpmWithResponse(request, context).block();
    }
}
