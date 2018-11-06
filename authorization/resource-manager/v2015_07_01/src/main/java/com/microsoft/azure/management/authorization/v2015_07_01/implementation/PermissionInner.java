/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role definition permissions.
 */
public class PermissionInner {
    /**
     * Allowed actions.
     */
    @JsonProperty(value = "actions")
    private List<String> actions;

    /**
     * Denied actions.
     */
    @JsonProperty(value = "notActions")
    private List<String> notActions;

    /**
     * Get allowed actions.
     *
     * @return the actions value
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Set allowed actions.
     *
     * @param actions the actions value to set
     * @return the PermissionInner object itself.
     */
    public PermissionInner withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get denied actions.
     *
     * @return the notActions value
     */
    public List<String> notActions() {
        return this.notActions;
    }

    /**
     * Set denied actions.
     *
     * @param notActions the notActions value to set
     * @return the PermissionInner object itself.
     */
    public PermissionInner withNotActions(List<String> notActions) {
        this.notActions = notActions;
        return this;
    }

}
