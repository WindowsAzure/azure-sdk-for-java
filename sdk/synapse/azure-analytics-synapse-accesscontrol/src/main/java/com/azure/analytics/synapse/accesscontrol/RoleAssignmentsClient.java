// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol;

import com.azure.analytics.synapse.accesscontrol.implementation.RoleAssignmentsImpl;
import com.azure.analytics.synapse.accesscontrol.models.CheckPrincipalAccessResponse;
import com.azure.analytics.synapse.accesscontrol.models.ErrorContractException;
import com.azure.analytics.synapse.accesscontrol.models.RequiredAction;
import com.azure.analytics.synapse.accesscontrol.models.RoleAssignmentDetails;
import com.azure.analytics.synapse.accesscontrol.models.RoleAssignmentDetailsList;
import com.azure.analytics.synapse.accesscontrol.models.SubjectInfo;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;
import java.util.UUID;

/** Initializes a new instance of the synchronous AccessControlClient type. */
@ServiceClient(builder = AccessControlClientBuilder.class)
public final class RoleAssignmentsClient {
    private final RoleAssignmentsImpl serviceClient;

    /**
     * Initializes an instance of RoleAssignments client.
     *
     * @param serviceClient the service client implementation.
     */
    RoleAssignmentsClient(RoleAssignmentsImpl serviceClient) {
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
    public CheckPrincipalAccessResponse checkPrincipalAccess(
            SubjectInfo subject, List<RequiredAction> actions, String scope) {
        return this.serviceClient.checkPrincipalAccess(subject, actions, scope);
    }

    /**
     * Check if the given principalId has access to perform list of actions at a given scope.
     *
     * @param subject Subject details.
     * @param actions List of actions.
     * @param scope Scope at which the check access is done.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check access response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckPrincipalAccessResponse> checkPrincipalAccessWithResponse(
            SubjectInfo subject, List<RequiredAction> actions, String scope, Context context) {
        return this.serviceClient.checkPrincipalAccessWithResponse(subject, actions, scope, context);
    }

    /**
     * List role assignments.
     *
     * @param roleId Synapse Built-In Role Id.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope of the Synapse Built-in Role.
     * @param continuationToken Continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleAssignmentDetailsList listRoleAssignments(
            String roleId, String principalId, String scope, String continuationToken) {
        return this.serviceClient.listRoleAssignments(roleId, principalId, scope, continuationToken);
    }

    /**
     * List role assignments.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleAssignmentDetailsList listRoleAssignments() {
        return this.serviceClient.listRoleAssignments();
    }

    /**
     * List role assignments.
     *
     * @param roleId Synapse Built-In Role Id.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope of the Synapse Built-in Role.
     * @param continuationToken Continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleAssignmentDetailsList> listRoleAssignmentsWithResponse(
            String roleId, String principalId, String scope, String continuationToken, Context context) {
        return this.serviceClient.listRoleAssignmentsWithResponse(
                roleId, principalId, scope, continuationToken, context);
    }

    /**
     * Create role assignment.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @param roleId Role ID of the Synapse Built-In Role.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope at which the role assignment is created.
     * @param principalType Type of the principal Id: User, Group or ServicePrincipal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleAssignmentDetails createRoleAssignment(
            String roleAssignmentId, UUID roleId, UUID principalId, String scope, String principalType) {
        return this.serviceClient.createRoleAssignment(roleAssignmentId, roleId, principalId, scope, principalType);
    }

    /**
     * Create role assignment.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @param roleId Role ID of the Synapse Built-In Role.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope at which the role assignment is created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleAssignmentDetails createRoleAssignment(
            String roleAssignmentId, UUID roleId, UUID principalId, String scope) {
        return this.serviceClient.createRoleAssignment(roleAssignmentId, roleId, principalId, scope);
    }

    /**
     * Create role assignment.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @param roleId Role ID of the Synapse Built-In Role.
     * @param principalId Object ID of the AAD principal or security-group.
     * @param scope Scope at which the role assignment is created.
     * @param principalType Type of the principal Id: User, Group or ServicePrincipal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignment response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleAssignmentDetails> createRoleAssignmentWithResponse(
            String roleAssignmentId,
            UUID roleId,
            UUID principalId,
            String scope,
            String principalType,
            Context context) {
        return this.serviceClient.createRoleAssignmentWithResponse(
                roleAssignmentId, roleId, principalId, scope, principalType, context);
    }

    /**
     * Get role assignment by role assignment Id.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment by role assignment Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleAssignmentDetails getRoleAssignmentById(String roleAssignmentId) {
        return this.serviceClient.getRoleAssignmentById(roleAssignmentId);
    }

    /**
     * Get role assignment by role assignment Id.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment by role assignment Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleAssignmentDetails> getRoleAssignmentByIdWithResponse(String roleAssignmentId, Context context) {
        return this.serviceClient.getRoleAssignmentByIdWithResponse(roleAssignmentId, context);
    }

    /**
     * Delete role assignment by role assignment Id.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @param scope Scope of the Synapse Built-in Role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteRoleAssignmentById(String roleAssignmentId, String scope) {
        this.serviceClient.deleteRoleAssignmentById(roleAssignmentId, scope);
    }

    /**
     * Delete role assignment by role assignment Id.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteRoleAssignmentById(String roleAssignmentId) {
        this.serviceClient.deleteRoleAssignmentById(roleAssignmentId);
    }

    /**
     * Delete role assignment by role assignment Id.
     *
     * @param roleAssignmentId The ID of the role assignment.
     * @param scope Scope of the Synapse Built-in Role.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteRoleAssignmentByIdWithResponse(String roleAssignmentId, String scope, Context context) {
        return this.serviceClient.deleteRoleAssignmentByIdWithResponse(roleAssignmentId, scope, context);
    }
}
