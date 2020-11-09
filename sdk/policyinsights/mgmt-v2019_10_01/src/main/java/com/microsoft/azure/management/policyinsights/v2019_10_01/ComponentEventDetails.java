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
 * Component event details.
 */
public class ComponentEventDetails {
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
     * Timestamp for component policy event record.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Tenant ID for the policy event record.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Principal object ID for the user who initiated the resource component
     * operation that triggered the policy event.
     */
    @JsonProperty(value = "principalOid")
    private String principalOid;

    /**
     * Policy definition action, i.e. effect.
     */
    @JsonProperty(value = "policyDefinitionAction")
    private String policyDefinitionAction;

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
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withAdditionalProperties(Map<String, Object> additionalProperties) {
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
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withId(String id) {
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
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withType(String type) {
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
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get timestamp for component policy event record.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set timestamp for component policy event record.
     *
     * @param timestamp the timestamp value to set
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get tenant ID for the policy event record.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set tenant ID for the policy event record.
     *
     * @param tenantId the tenantId value to set
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get principal object ID for the user who initiated the resource component operation that triggered the policy event.
     *
     * @return the principalOid value
     */
    public String principalOid() {
        return this.principalOid;
    }

    /**
     * Set principal object ID for the user who initiated the resource component operation that triggered the policy event.
     *
     * @param principalOid the principalOid value to set
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withPrincipalOid(String principalOid) {
        this.principalOid = principalOid;
        return this;
    }

    /**
     * Get policy definition action, i.e. effect.
     *
     * @return the policyDefinitionAction value
     */
    public String policyDefinitionAction() {
        return this.policyDefinitionAction;
    }

    /**
     * Set policy definition action, i.e. effect.
     *
     * @param policyDefinitionAction the policyDefinitionAction value to set
     * @return the ComponentEventDetails object itself.
     */
    public ComponentEventDetails withPolicyDefinitionAction(String policyDefinitionAction) {
        this.policyDefinitionAction = policyDefinitionAction;
        return this;
    }

}
