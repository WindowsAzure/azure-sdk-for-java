/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed application locking policy.
 */
public class ApplicationPackageLockingPolicyDefinition {
    /**
     * The deny assignment excluded actions.
     */
    @JsonProperty(value = "allowedActions")
    private List<String> allowedActions;

    /**
     * Get the deny assignment excluded actions.
     *
     * @return the allowedActions value
     */
    public List<String> allowedActions() {
        return this.allowedActions;
    }

    /**
     * Set the deny assignment excluded actions.
     *
     * @param allowedActions the allowedActions value to set
     * @return the ApplicationPackageLockingPolicyDefinition object itself.
     */
    public ApplicationPackageLockingPolicyDefinition withAllowedActions(List<String> allowedActions) {
        this.allowedActions = allowedActions;
        return this;
    }

}
