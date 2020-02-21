/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Activity dependency information.
 */
public class ActivityDependency {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Activity name.
     */
    @JsonProperty(value = "activity", required = true)
    private String activity;

    /**
     * Match-Condition for the dependency.
     */
    @JsonProperty(value = "dependencyConditions", required = true)
    private List<DependencyCondition> dependencyConditions;

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
     * @return the ActivityDependency object itself.
     */
    public ActivityDependency withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get activity name.
     *
     * @return the activity value
     */
    public String activity() {
        return this.activity;
    }

    /**
     * Set activity name.
     *
     * @param activity the activity value to set
     * @return the ActivityDependency object itself.
     */
    public ActivityDependency withActivity(String activity) {
        this.activity = activity;
        return this;
    }

    /**
     * Get match-Condition for the dependency.
     *
     * @return the dependencyConditions value
     */
    public List<DependencyCondition> dependencyConditions() {
        return this.dependencyConditions;
    }

    /**
     * Set match-Condition for the dependency.
     *
     * @param dependencyConditions the dependencyConditions value to set
     * @return the ActivityDependency object itself.
     */
    public ActivityDependency withDependencyConditions(List<DependencyCondition> dependencyConditions) {
        this.dependencyConditions = dependencyConditions;
        return this;
    }

}
