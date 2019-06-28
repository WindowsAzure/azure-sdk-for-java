/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Log of the entity being created, updated or deleted.
 */
public class OperationResultLogItemContract {
    /**
     * The type of entity contract.
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /**
     * Action like create/update/delete.
     */
    @JsonProperty(value = "action")
    private String action;

    /**
     * Identifier of the entity being created/updated/deleted.
     */
    @JsonProperty(value = "objectKey")
    private String objectKey;

    /**
     * Get the type of entity contract.
     *
     * @return the objectType value
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the type of entity contract.
     *
     * @param objectType the objectType value to set
     * @return the OperationResultLogItemContract object itself.
     */
    public OperationResultLogItemContract withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get action like create/update/delete.
     *
     * @return the action value
     */
    public String action() {
        return this.action;
    }

    /**
     * Set action like create/update/delete.
     *
     * @param action the action value to set
     * @return the OperationResultLogItemContract object itself.
     */
    public OperationResultLogItemContract withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get identifier of the entity being created/updated/deleted.
     *
     * @return the objectKey value
     */
    public String objectKey() {
        return this.objectKey;
    }

    /**
     * Set identifier of the entity being created/updated/deleted.
     *
     * @param objectKey the objectKey value to set
     * @return the OperationResultLogItemContract object itself.
     */
    public OperationResultLogItemContract withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

}
