/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2015_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * the authorization used by the user who has performed the operation that led
 * to this event. This captures the RBAC properties of the event. These usually
 * include the 'action', 'role' and the 'scope'.
 */
public class SenderAuthorization {
    /**
     * the permissible actions. For instance:
     * microsoft.support/supporttickets/write.
     */
    @JsonProperty(value = "action")
    private String action;

    /**
     * the role of the user. For instance: Subscription Admin.
     */
    @JsonProperty(value = "role")
    private String role;

    /**
     * the scope.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * Get the permissible actions. For instance: microsoft.support/supporttickets/write.
     *
     * @return the action value
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the permissible actions. For instance: microsoft.support/supporttickets/write.
     *
     * @param action the action value to set
     * @return the SenderAuthorization object itself.
     */
    public SenderAuthorization withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the role of the user. For instance: Subscription Admin.
     *
     * @return the role value
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role of the user. For instance: Subscription Admin.
     *
     * @param role the role value to set
     * @return the SenderAuthorization object itself.
     */
    public SenderAuthorization withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get the scope.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope.
     *
     * @param scope the scope value to set
     * @return the SenderAuthorization object itself.
     */
    public SenderAuthorization withScope(String scope) {
        this.scope = scope;
        return this;
    }

}
