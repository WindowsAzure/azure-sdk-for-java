/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.OperationDisplay;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.OperationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The HDInsight REST API operation.
 */
public class OperationInner {
    /**
     * The operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * The operation properties.
     */
    @JsonProperty(value = "properties")
    private OperationProperties properties;

    /**
     * Get the operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the object that represents the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that represents the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the operation properties.
     *
     * @return the properties value
     */
    public OperationProperties properties() {
        return this.properties;
    }

    /**
     * Set the operation properties.
     *
     * @param properties the properties value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(OperationProperties properties) {
        this.properties = properties;
        return this;
    }

}
