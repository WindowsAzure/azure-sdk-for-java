/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response body structure for get data factory operation status.
 */
public class GetDataFactoryOperationStatusResponse {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the GetDataFactoryOperationStatusResponse object itself.
     */
    public GetDataFactoryOperationStatusResponse withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get status of the operation.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of the operation.
     *
     * @param status the status value to set
     * @return the GetDataFactoryOperationStatusResponse object itself.
     */
    public GetDataFactoryOperationStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

}
