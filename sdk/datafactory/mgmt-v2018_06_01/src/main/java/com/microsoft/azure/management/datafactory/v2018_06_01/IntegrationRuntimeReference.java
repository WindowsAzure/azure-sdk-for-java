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
 * Integration runtime reference type.
 */
public class IntegrationRuntimeReference {
    /**
     * Type of integration runtime.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Reference integration runtime name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /**
     * Arguments for integration runtime.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Creates an instance of IntegrationRuntimeReference class.
     * @param referenceName reference integration runtime name.
     */
    public IntegrationRuntimeReference() {
        type = "IntegrationRuntimeReference";
    }

    /**
     * Get type of integration runtime.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of integration runtime.
     *
     * @param type the type value to set
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get reference integration runtime name.
     *
     * @return the referenceName value
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set reference integration runtime name.
     *
     * @param referenceName the referenceName value to set
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get arguments for integration runtime.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set arguments for integration runtime.
     *
     * @param parameters the parameters value to set
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

}
