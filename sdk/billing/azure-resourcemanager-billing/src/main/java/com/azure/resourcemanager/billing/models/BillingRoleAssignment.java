// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.BillingRoleAssignmentInner;

/** An immutable client-side representation of BillingRoleAssignment. */
public interface BillingRoleAssignment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the createdOn property: The date the role assignment was created.
     *
     * @return the createdOn value.
     */
    String createdOn();

    /**
     * Gets the createdByPrincipalTenantId property: The tenant Id of the user who created the role assignment.
     *
     * @return the createdByPrincipalTenantId value.
     */
    String createdByPrincipalTenantId();

    /**
     * Gets the createdByPrincipalId property: The principal Id of the user who created the role assignment.
     *
     * @return the createdByPrincipalId value.
     */
    String createdByPrincipalId();

    /**
     * Gets the createdByUserEmailAddress property: The email address of the user who created the role assignment.
     *
     * @return the createdByUserEmailAddress value.
     */
    String createdByUserEmailAddress();

    /**
     * Gets the principalId property: The principal id of the user to whom the role was assigned.
     *
     * @return the principalId value.
     */
    String principalId();

    /**
     * Gets the principalTenantId property: The principal tenant id of the user to whom the role was assigned.
     *
     * @return the principalTenantId value.
     */
    String principalTenantId();

    /**
     * Gets the roleDefinitionId property: The ID of the role definition.
     *
     * @return the roleDefinitionId value.
     */
    String roleDefinitionId();

    /**
     * Gets the scope property: The scope at which the role was assigned.
     *
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the userAuthenticationType property: The authentication type.
     *
     * @return the userAuthenticationType value.
     */
    String userAuthenticationType();

    /**
     * Gets the userEmailAddress property: The email address of the user.
     *
     * @return the userEmailAddress value.
     */
    String userEmailAddress();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.BillingRoleAssignmentInner object.
     *
     * @return the inner object.
     */
    BillingRoleAssignmentInner innerModel();
}
