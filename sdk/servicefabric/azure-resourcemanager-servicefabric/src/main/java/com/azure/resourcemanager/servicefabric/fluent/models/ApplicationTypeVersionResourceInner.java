// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An application type version resource for the specified application type name resource. */
@JsonFlatten
@Fluent
public class ApplicationTypeVersionResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationTypeVersionResourceInner.class);

    /*
     * The current deployment or provisioning state, which only appears in the
     * response
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The URL to the application package
     */
    @JsonProperty(value = "properties.appPackageUrl")
    private String appPackageUrl;

    /*
     * List of application type parameters that can be overridden when creating
     * or updating the application.
     */
    @JsonProperty(value = "properties.defaultParameterList", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> defaultParameterList;

    /*
     * It will be deprecated in New API, resource location depends on the
     * parent resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Azure resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Azure resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the appPackageUrl property: The URL to the application package.
     *
     * @return the appPackageUrl value.
     */
    public String appPackageUrl() {
        return this.appPackageUrl;
    }

    /**
     * Set the appPackageUrl property: The URL to the application package.
     *
     * @param appPackageUrl the appPackageUrl value to set.
     * @return the ApplicationTypeVersionResourceInner object itself.
     */
    public ApplicationTypeVersionResourceInner withAppPackageUrl(String appPackageUrl) {
        this.appPackageUrl = appPackageUrl;
        return this;
    }

    /**
     * Get the defaultParameterList property: List of application type parameters that can be overridden when creating
     * or updating the application.
     *
     * @return the defaultParameterList value.
     */
    public Map<String, String> defaultParameterList() {
        return this.defaultParameterList;
    }

    /**
     * Get the location property: It will be deprecated in New API, resource location depends on the parent resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: It will be deprecated in New API, resource location depends on the parent resource.
     *
     * @param location the location value to set.
     * @return the ApplicationTypeVersionResourceInner object itself.
     */
    public ApplicationTypeVersionResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Azure resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Azure resource tags.
     *
     * @param tags the tags value to set.
     * @return the ApplicationTypeVersionResourceInner object itself.
     */
    public ApplicationTypeVersionResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the etag property: Azure resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}