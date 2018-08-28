/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * A pipeline activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Activity")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Execution", value = ExecutionActivity.class),
    @JsonSubTypes.Type(name = "Container", value = ControlActivity.class)
})
public class Activity {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Activity name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Activity description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Activity depends on condition.
     */
    @JsonProperty(value = "dependsOn")
    private List<ActivityDependency> dependsOn;

    /**
     * Activity user properties.
     */
    @JsonProperty(value = "userProperties")
    private List<UserProperty> userProperties;

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
     * @return the Activity object itself.
     */
    public Activity withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get activity name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set activity name.
     *
     * @param name the name value to set
     * @return the Activity object itself.
     */
    public Activity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get activity description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set activity description.
     *
     * @param description the description value to set
     * @return the Activity object itself.
     */
    public Activity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get activity depends on condition.
     *
     * @return the dependsOn value
     */
    public List<ActivityDependency> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set activity depends on condition.
     *
     * @param dependsOn the dependsOn value to set
     * @return the Activity object itself.
     */
    public Activity withDependsOn(List<ActivityDependency> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get activity user properties.
     *
     * @return the userProperties value
     */
    public List<UserProperty> userProperties() {
        return this.userProperties;
    }

    /**
     * Set activity user properties.
     *
     * @param userProperties the userProperties value to set
     * @return the Activity object itself.
     */
    public Activity withUserProperties(List<UserProperty> userProperties) {
        this.userProperties = userProperties;
        return this;
    }

}
