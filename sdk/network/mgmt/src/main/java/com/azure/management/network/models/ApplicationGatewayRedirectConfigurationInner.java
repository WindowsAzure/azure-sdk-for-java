// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.management.network.ApplicationGatewayRedirectType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayRedirectConfiguration model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayRedirectConfigurationInner extends SubResource {
    /*
     * Name of the redirect configuration that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * HTTP redirection type.
     */
    @JsonProperty(value = "properties.redirectType")
    private ApplicationGatewayRedirectType redirectType;

    /*
     * Reference to a listener to redirect the request to.
     */
    @JsonProperty(value = "properties.targetListener")
    private SubResource targetListener;

    /*
     * Url to redirect the request to.
     */
    @JsonProperty(value = "properties.targetUrl")
    private String targetUrl;

    /*
     * Include path in the redirected url.
     */
    @JsonProperty(value = "properties.includePath")
    private Boolean includePath;

    /*
     * Include query string in the redirected url.
     */
    @JsonProperty(value = "properties.includeQueryString")
    private Boolean includeQueryString;

    /*
     * Request routing specifying redirect configuration.
     */
    @JsonProperty(value = "properties.requestRoutingRules")
    private List<SubResource> requestRoutingRules;

    /*
     * Url path maps specifying default redirect configuration.
     */
    @JsonProperty(value = "properties.urlPathMaps")
    private List<SubResource> urlPathMaps;

    /*
     * Path rules specifying redirect configuration.
     */
    @JsonProperty(value = "properties.pathRules")
    private List<SubResource> pathRules;

    /**
     * Get the name property: Name of the redirect configuration that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the redirect configuration that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the redirectType property: HTTP redirection type.
     *
     * @return the redirectType value.
     */
    public ApplicationGatewayRedirectType redirectType() {
        return this.redirectType;
    }

    /**
     * Set the redirectType property: HTTP redirection type.
     *
     * @param redirectType the redirectType value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withRedirectType(ApplicationGatewayRedirectType redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    /**
     * Get the targetListener property: Reference to a listener to redirect the request to.
     *
     * @return the targetListener value.
     */
    public SubResource targetListener() {
        return this.targetListener;
    }

    /**
     * Set the targetListener property: Reference to a listener to redirect the request to.
     *
     * @param targetListener the targetListener value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withTargetListener(SubResource targetListener) {
        this.targetListener = targetListener;
        return this;
    }

    /**
     * Get the targetUrl property: Url to redirect the request to.
     *
     * @return the targetUrl value.
     */
    public String targetUrl() {
        return this.targetUrl;
    }

    /**
     * Set the targetUrl property: Url to redirect the request to.
     *
     * @param targetUrl the targetUrl value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * Get the includePath property: Include path in the redirected url.
     *
     * @return the includePath value.
     */
    public Boolean includePath() {
        return this.includePath;
    }

    /**
     * Set the includePath property: Include path in the redirected url.
     *
     * @param includePath the includePath value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withIncludePath(Boolean includePath) {
        this.includePath = includePath;
        return this;
    }

    /**
     * Get the includeQueryString property: Include query string in the redirected url.
     *
     * @return the includeQueryString value.
     */
    public Boolean includeQueryString() {
        return this.includeQueryString;
    }

    /**
     * Set the includeQueryString property: Include query string in the redirected url.
     *
     * @param includeQueryString the includeQueryString value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withIncludeQueryString(Boolean includeQueryString) {
        this.includeQueryString = includeQueryString;
        return this;
    }

    /**
     * Get the requestRoutingRules property: Request routing specifying redirect configuration.
     *
     * @return the requestRoutingRules value.
     */
    public List<SubResource> requestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set the requestRoutingRules property: Request routing specifying redirect configuration.
     *
     * @param requestRoutingRules the requestRoutingRules value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withRequestRoutingRules(List<SubResource> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
        return this;
    }

    /**
     * Get the urlPathMaps property: Url path maps specifying default redirect configuration.
     *
     * @return the urlPathMaps value.
     */
    public List<SubResource> urlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set the urlPathMaps property: Url path maps specifying default redirect configuration.
     *
     * @param urlPathMaps the urlPathMaps value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withUrlPathMaps(List<SubResource> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
        return this;
    }

    /**
     * Get the pathRules property: Path rules specifying redirect configuration.
     *
     * @return the pathRules value.
     */
    public List<SubResource> pathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules property: Path rules specifying redirect configuration.
     *
     * @param pathRules the pathRules value to set.
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withPathRules(List<SubResource> pathRules) {
        this.pathRules = pathRules;
        return this;
    }
}
