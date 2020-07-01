/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that represents the operation.
 */
public class OperationDisplay {
    /**
     * The service provider: Microsoft.HDInsight.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The resource on which the operation is performed: Cluster, Applications,
     * etc.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The operation type: read, write, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Get the service provider: Microsoft.HDInsight.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the service provider: Microsoft.HDInsight.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource on which the operation is performed: Cluster, Applications, etc.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource on which the operation is performed: Cluster, Applications, etc.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation type: read, write, delete, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation type: read, write, delete, etc.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

}
