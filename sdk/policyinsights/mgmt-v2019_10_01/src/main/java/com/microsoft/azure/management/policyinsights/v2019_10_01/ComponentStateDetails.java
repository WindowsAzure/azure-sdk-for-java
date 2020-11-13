/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Component state details.
 */
public class ComponentStateDetails {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Component Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Component type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Component name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Component compliance evaluation timestamp.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Component compliance state.
     */
    @JsonProperty(value = "complianceState")
    private String complianceState;

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
     * @return the ComponentStateDetails object itself.
     */
    public ComponentStateDetails withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get component Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set component Id.
     *
     * @param id the id value to set
     * @return the ComponentStateDetails object itself.
     */
    public ComponentStateDetails withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get component type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set component type.
     *
     * @param type the type value to set
     * @return the ComponentStateDetails object itself.
     */
    public ComponentStateDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get component name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set component name.
     *
     * @param name the name value to set
     * @return the ComponentStateDetails object itself.
     */
    public ComponentStateDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get component compliance evaluation timestamp.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set component compliance evaluation timestamp.
     *
     * @param timestamp the timestamp value to set
     * @return the ComponentStateDetails object itself.
     */
    public ComponentStateDetails withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get component compliance state.
     *
     * @return the complianceState value
     */
    public String complianceState() {
        return this.complianceState;
    }

    /**
     * Set component compliance state.
     *
     * @param complianceState the complianceState value to set
     * @return the ComponentStateDetails object itself.
     */
    public ComponentStateDetails withComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

}
