/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL dependency information item.
 */
public class USqlAssemblyDependencyInfo {
    /**
     * the EntityId of the dependency.
     */
    @JsonProperty(value = "entityId")
    private EntityId entityId;

    /**
     * Get the EntityId of the dependency.
     *
     * @return the entityId value
     */
    public EntityId entityId() {
        return this.entityId;
    }

    /**
     * Set the EntityId of the dependency.
     *
     * @param entityId the entityId value to set
     * @return the USqlAssemblyDependencyInfo object itself.
     */
    public USqlAssemblyDependencyInfo withEntityId(EntityId entityId) {
        this.entityId = entityId;
        return this;
    }

}
