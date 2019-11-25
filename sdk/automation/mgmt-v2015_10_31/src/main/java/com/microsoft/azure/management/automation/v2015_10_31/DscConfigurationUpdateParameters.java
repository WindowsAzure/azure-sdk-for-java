/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters supplied to the create or update configuration operation.
 */
@JsonFlatten
public class DscConfigurationUpdateParameters {
    /**
     * Gets or sets verbose log option.
     */
    @JsonProperty(value = "properties.logVerbose")
    private Boolean logVerbose;

    /**
     * Gets or sets progress log option.
     */
    @JsonProperty(value = "properties.logProgress")
    private Boolean logProgress;

    /**
     * Gets or sets the source.
     */
    @JsonProperty(value = "properties.source", required = true)
    private ContentSource source;

    /**
     * Gets or sets the configuration parameters.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, DscConfigurationParameter> parameters;

    /**
     * Gets or sets the description of the configuration.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Gets or sets name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets the tags attached to the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get gets or sets verbose log option.
     *
     * @return the logVerbose value
     */
    public Boolean logVerbose() {
        return this.logVerbose;
    }

    /**
     * Set gets or sets verbose log option.
     *
     * @param logVerbose the logVerbose value to set
     * @return the DscConfigurationUpdateParameters object itself.
     */
    public DscConfigurationUpdateParameters withLogVerbose(Boolean logVerbose) {
        this.logVerbose = logVerbose;
        return this;
    }

    /**
     * Get gets or sets progress log option.
     *
     * @return the logProgress value
     */
    public Boolean logProgress() {
        return this.logProgress;
    }

    /**
     * Set gets or sets progress log option.
     *
     * @param logProgress the logProgress value to set
     * @return the DscConfigurationUpdateParameters object itself.
     */
    public DscConfigurationUpdateParameters withLogProgress(Boolean logProgress) {
        this.logProgress = logProgress;
        return this;
    }

    /**
     * Get gets or sets the source.
     *
     * @return the source value
     */
    public ContentSource source() {
        return this.source;
    }

    /**
     * Set gets or sets the source.
     *
     * @param source the source value to set
     * @return the DscConfigurationUpdateParameters object itself.
     */
    public DscConfigurationUpdateParameters withSource(ContentSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get gets or sets the configuration parameters.
     *
     * @return the parameters value
     */
    public Map<String, DscConfigurationParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the configuration parameters.
     *
     * @param parameters the parameters value to set
     * @return the DscConfigurationUpdateParameters object itself.
     */
    public DscConfigurationUpdateParameters withParameters(Map<String, DscConfigurationParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get gets or sets the description of the configuration.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description of the configuration.
     *
     * @param description the description value to set
     * @return the DscConfigurationUpdateParameters object itself.
     */
    public DscConfigurationUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets name of the resource.
     *
     * @param name the name value to set
     * @return the DscConfigurationUpdateParameters object itself.
     */
    public DscConfigurationUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets the tags attached to the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set gets or sets the tags attached to the resource.
     *
     * @param tags the tags value to set
     * @return the DscConfigurationUpdateParameters object itself.
     */
    public DscConfigurationUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
