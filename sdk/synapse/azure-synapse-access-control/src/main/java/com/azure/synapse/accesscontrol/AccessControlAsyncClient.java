// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.accesscontrol;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.synapse.accesscontrol.implementation.AccessControlClientImpl;
import com.azure.synapse.accesscontrol.models.Action;
import com.azure.synapse.accesscontrol.models.CheckAccessDecision;
import com.azure.synapse.accesscontrol.models.ErrorContractException;
import com.azure.synapse.accesscontrol.models.SubjectInfo;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AccessControlClient type. */
@ServiceClient(builder = AccessControlClientBuilder.class, isAsync = true)
public final class AccessControlAsyncClient {
    private final AccessControlClientImpl serviceClient;

    /**
     * Initializes an instance of AccessControlClient client.
     *
     * @param serviceClient the service client implementation.
     */
    AccessControlAsyncClient(AccessControlClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Check if the given principalId has access to perform list of actions at a given scope.
     *
     * @param subject Subject details.
     * @param actions List of actions.
     * @param scope Scope at which the check access is done.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check access response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<CheckAccessDecision>>> checkPrincipalAccessWithResponse(
            SubjectInfo subject, List<Action> actions, String scope) {
        return this.serviceClient.checkPrincipalAccessWithResponseAsync(subject, actions, scope);
    }

    /**
     * Check if the given principalId has access to perform list of actions at a given scope.
     *
     * @param subject Subject details.
     * @param actions List of actions.
     * @param scope Scope at which the check access is done.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check access response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<CheckAccessDecision>> checkPrincipalAccess(
            SubjectInfo subject, List<Action> actions, String scope) {
        return this.serviceClient.checkPrincipalAccessAsync(subject, actions, scope);
    }
}
