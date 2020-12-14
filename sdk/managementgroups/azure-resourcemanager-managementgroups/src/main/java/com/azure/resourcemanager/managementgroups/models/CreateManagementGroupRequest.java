// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Management group creation parameters. */
@JsonFlatten
@Fluent
public class CreateManagementGroupRequest extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CreateManagementGroupRequest.class);

    /*
     * The name of the management group. For example,
     * 00000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The friendly name of the management group. If no value is passed then
     * this  field will be set to the groupId.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * The details of a management group used during creation.
     */
    @JsonProperty(value = "properties.details")
    private CreateManagementGroupDetails details;

    /*
     * The list of children.
     */
    @JsonProperty(value = "properties.children", access = JsonProperty.Access.WRITE_ONLY)
    private List<CreateManagementGroupChildInfo> children;

    /**
     * Get the name property: The name of the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @param name the name value to set.
     * @return the CreateManagementGroupRequest object itself.
     */
    public CreateManagementGroupRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the displayName property: The friendly name of the management group. If no value is passed then this field
     * will be set to the groupId.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The friendly name of the management group. If no value is passed then this field
     * will be set to the groupId.
     *
     * @param displayName the displayName value to set.
     * @return the CreateManagementGroupRequest object itself.
     */
    public CreateManagementGroupRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the details property: The details of a management group used during creation.
     *
     * @return the details value.
     */
    public CreateManagementGroupDetails details() {
        return this.details;
    }

    /**
     * Set the details property: The details of a management group used during creation.
     *
     * @param details the details value to set.
     * @return the CreateManagementGroupRequest object itself.
     */
    public CreateManagementGroupRequest withDetails(CreateManagementGroupDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get the children property: The list of children.
     *
     * @return the children value.
     */
    public List<CreateManagementGroupChildInfo> children() {
        return this.children;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().validate();
        }
        if (children() != null) {
            children().forEach(e -> e.validate());
        }
    }
}
