/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings for an authentication token that the Task can use to perform
 * Batch service operations.
 */
public class AuthenticationTokenSettings {
    /**
     * The Batch resources to which the token grants access.
     * The authentication token grants access to a limited set of Batch service
     * operations. Currently the only supported value for the access property
     * is 'job', which grants access to all operations related to the Job which
     * contains the Task.
     */
    @JsonProperty(value = "access")
    private List<AccessScope> access;

    /**
     * Get the authentication token grants access to a limited set of Batch service operations. Currently the only supported value for the access property is 'job', which grants access to all operations related to the Job which contains the Task.
     *
     * @return the access value
     */
    public List<AccessScope> access() {
        return this.access;
    }

    /**
     * Set the authentication token grants access to a limited set of Batch service operations. Currently the only supported value for the access property is 'job', which grants access to all operations related to the Job which contains the Task.
     *
     * @param access the access value to set
     * @return the AuthenticationTokenSettings object itself.
     */
    public AuthenticationTokenSettings withAccess(List<AccessScope> access) {
        this.access = access;
        return this;
    }

}
