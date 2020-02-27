/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The API deployment parameter metadata.
 */
public class ApiDeploymentParameterMetadata {
    /**
     * The type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Indicates whether its required.
     */
    @JsonProperty(value = "isRequired")
    private Boolean isRequired;

    /**
     * The display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The visibility. Possible values include: 'NotSpecified', 'Default',
     * 'Internal'.
     */
    @JsonProperty(value = "visibility")
    private ApiDeploymentParameterVisibility visibility;

    /**
     * Get the type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type.
     *
     * @param type the type value to set
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get indicates whether its required.
     *
     * @return the isRequired value
     */
    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * Set indicates whether its required.
     *
     * @param isRequired the isRequired value to set
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * Get the display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name.
     *
     * @param displayName the displayName value to set
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description.
     *
     * @param description the description value to set
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the visibility. Possible values include: 'NotSpecified', 'Default', 'Internal'.
     *
     * @return the visibility value
     */
    public ApiDeploymentParameterVisibility visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility. Possible values include: 'NotSpecified', 'Default', 'Internal'.
     *
     * @param visibility the visibility value to set
     * @return the ApiDeploymentParameterMetadata object itself.
     */
    public ApiDeploymentParameterMetadata withVisibility(ApiDeploymentParameterVisibility visibility) {
        this.visibility = visibility;
        return this;
    }

}
