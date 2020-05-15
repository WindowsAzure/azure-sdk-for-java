// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.containerregistry.ProvisioningState;
import com.azure.management.containerregistry.WebhookAction;
import com.azure.management.containerregistry.WebhookStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Webhook model. */
@JsonFlatten
@Fluent
public class WebhookInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebhookInner.class);

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

    /*
     * The provisioning state of the webhook at the time the operation was
     * called.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

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
     * @return the WebhookInner object itself.
     */
    public WebhookInner withStatus(WebhookStatus status) {
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
     * @return the WebhookInner object itself.
     */
    public WebhookInner withScope(String scope) {
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
     * @return the WebhookInner object itself.
     */
    public WebhookInner withActions(List<WebhookAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the webhook at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
