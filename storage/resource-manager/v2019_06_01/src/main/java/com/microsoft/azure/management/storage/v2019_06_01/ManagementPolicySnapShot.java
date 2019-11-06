/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Management policy action for snapshot.
 */
public class ManagementPolicySnapShot {
    /**
     * The function to delete the blob snapshot.
     */
    @JsonProperty(value = "delete")
    private DateAfterCreation delete;

    /**
     * Get the function to delete the blob snapshot.
     *
     * @return the delete value
     */
    public DateAfterCreation delete() {
        return this.delete;
    }

    /**
     * Set the function to delete the blob snapshot.
     *
     * @param delete the delete value to set
     * @return the ManagementPolicySnapShot object itself.
     */
    public ManagementPolicySnapShot withDelete(DateAfterCreation delete) {
        this.delete = delete;
        return this;
    }

}
