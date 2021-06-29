// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managedservices.fluent.models.RegistrationAssignmentInner;

/** An instance of this class provides access to all the operations defined in RegistrationAssignmentsClient. */
public interface RegistrationAssignmentsClient {
    /**
     * Gets the details of the specified registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified registration assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistrationAssignmentInner get(String scope, String registrationAssignmentId);

    /**
     * Gets the details of the specified registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @param expandRegistrationDefinition The flag indicating whether to return the registration definition details
     *     along with the registration assignment details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the specified registration assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RegistrationAssignmentInner> getWithResponse(
        String scope, String registrationAssignmentId, Boolean expandRegistrationDefinition, Context context);

    /**
     * Deletes the specified registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String scope, String registrationAssignmentId);

    /**
     * Deletes the specified registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String scope, String registrationAssignmentId, Context context);

    /**
     * Deletes the specified registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String registrationAssignmentId);

    /**
     * Deletes the specified registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String registrationAssignmentId, Context context);

    /**
     * Creates or updates a registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @param requestBody The parameters required to create new registration assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the registration assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistrationAssignmentInner>, RegistrationAssignmentInner> beginCreateOrUpdate(
        String scope, String registrationAssignmentId, RegistrationAssignmentInner requestBody);

    /**
     * Creates or updates a registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @param requestBody The parameters required to create new registration assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the registration assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RegistrationAssignmentInner>, RegistrationAssignmentInner> beginCreateOrUpdate(
        String scope, String registrationAssignmentId, RegistrationAssignmentInner requestBody, Context context);

    /**
     * Creates or updates a registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @param requestBody The parameters required to create new registration assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the registration assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistrationAssignmentInner createOrUpdate(
        String scope, String registrationAssignmentId, RegistrationAssignmentInner requestBody);

    /**
     * Creates or updates a registration assignment.
     *
     * @param scope The scope of the resource.
     * @param registrationAssignmentId The GUID of the registration assignment.
     * @param requestBody The parameters required to create new registration assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the registration assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RegistrationAssignmentInner createOrUpdate(
        String scope, String registrationAssignmentId, RegistrationAssignmentInner requestBody, Context context);

    /**
     * Gets a list of the registration assignments.
     *
     * @param scope The scope of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the registration assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistrationAssignmentInner> list(String scope);

    /**
     * Gets a list of the registration assignments.
     *
     * @param scope The scope of the resource.
     * @param expandRegistrationDefinition The flag indicating whether to return the registration definition details
     *     along with the registration assignment details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the registration assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RegistrationAssignmentInner> list(
        String scope, Boolean expandRegistrationDefinition, Context context);
}
