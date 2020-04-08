// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The WebhookCreateParameters model. */
@JsonFlatten
@Fluent
public class WebhookCreateParameters {
    /*
     * The tags for the webhook.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The location of the webhook. This cannot be changed after the resource
     * is created.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The service URI for the webhook to post notifications.
     */
    @JsonProperty(value = "properties.serviceUri")
    private String serviceUri;

    /*
     * Custom headers that will be added to the webhook notifications.
     */
    @JsonProperty(value = "properties.customHeaders")
    private Map<String, String> customHeaders;

    /*
     * The status of the webhook at the time the operation was called.
     */
    @JsonProperty(value = "properties.status")
    private WebhookStatus status;

    /*
     * The scope of repositories where the event can be triggered. For example,
     * 'foo:*' means events for all tags under repository 'foo'. 'foo:bar'
     * means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'.
     * Empty means all events.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /*
     * The list of actions that trigger the webhook to post notifications.
     */
    @JsonProperty(value = "properties.actions")
    private List<WebhookAction> actions;

    /**
     * Get the tags property: The tags for the webhook.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags for the webhook.
     *
     * @param tags the tags value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The location of the webhook. This cannot be changed after the resource is created.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the webhook. This cannot be changed after the resource is created.
     *
     * @param location the location value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the serviceUri property: The service URI for the webhook to post notifications.
     *
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The service URI for the webhook to post notifications.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the customHeaders property: Custom headers that will be added to the webhook notifications.
     *
     * @return the customHeaders value.
     */
    public Map<String, String> customHeaders() {
        return this.customHeaders;
    }

    /**
     * Set the customHeaders property: Custom headers that will be added to the webhook notifications.
     *
     * @param customHeaders the customHeaders value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Get the status property: The status of the webhook at the time the operation was called.
     *
     * @return the status value.
     */
    public WebhookStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the webhook at the time the operation was called.
     *
     * @param status the status value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withStatus(WebhookStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the scope property: The scope of repositories where the event can be triggered. For example, 'foo:*' means
     * events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to
     * 'foo:latest'. Empty means all events.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of repositories where the event can be triggered. For example, 'foo:*' means
     * events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to
     * 'foo:latest'. Empty means all events.
     *
     * @param scope the scope value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the actions property: The list of actions that trigger the webhook to post notifications.
     *
     * @return the actions value.
     */
    public List<WebhookAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The list of actions that trigger the webhook to post notifications.
     *
     * @param actions the actions value to set.
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withActions(List<WebhookAction> actions) {
        this.actions = actions;
        return this;
    }
}
