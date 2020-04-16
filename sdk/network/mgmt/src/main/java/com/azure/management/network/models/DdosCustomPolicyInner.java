// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.management.network.ProtocolCustomSettingsFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DdosCustomPolicy model. */
@JsonFlatten
@Fluent
public class DdosCustomPolicyInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The resource GUID property of the DDoS custom policy resource. It
     * uniquely identifies the resource, even if the user changes its name or
     * migrate the resource across subscriptions or resource groups.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the DDoS custom policy resource. Possible
     * values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The list of public IPs associated with the DDoS custom policy resource.
     * This list is read-only.
     */
    @JsonProperty(value = "properties.publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> publicIPAddresses;

    /*
     * The protocol-specific DDoS policy customization parameters.
     */
    @JsonProperty(value = "properties.protocolCustomSettings")
    private List<ProtocolCustomSettingsFormat> protocolCustomSettings;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the DDoS custom policy resource. It uniquely
     * identifies the resource, even if the user changes its name or migrate the resource across subscriptions or
     * resource groups.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the DDoS custom policy resource. Possible values
     * are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicIPAddresses property: The list of public IPs associated with the DDoS custom policy resource. This
     * list is read-only.
     *
     * @return the publicIPAddresses value.
     */
    public List<SubResource> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * Get the protocolCustomSettings property: The protocol-specific DDoS policy customization parameters.
     *
     * @return the protocolCustomSettings value.
     */
    public List<ProtocolCustomSettingsFormat> protocolCustomSettings() {
        return this.protocolCustomSettings;
    }

    /**
     * Set the protocolCustomSettings property: The protocol-specific DDoS policy customization parameters.
     *
     * @param protocolCustomSettings the protocolCustomSettings value to set.
     * @return the DdosCustomPolicyInner object itself.
     */
    public DdosCustomPolicyInner withProtocolCustomSettings(List<ProtocolCustomSettingsFormat> protocolCustomSettings) {
        this.protocolCustomSettings = protocolCustomSettings;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the DdosCustomPolicyInner object itself.
     */
    public DdosCustomPolicyInner withId(String id) {
        this.id = id;
        return this;
    }
}
