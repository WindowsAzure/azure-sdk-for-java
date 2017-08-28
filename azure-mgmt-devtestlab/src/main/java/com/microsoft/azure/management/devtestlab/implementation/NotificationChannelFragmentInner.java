/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.implementation;

import java.util.List;
import com.microsoft.azure.management.devtestlab.EventFragment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A notification.
 */
@JsonFlatten
public class NotificationChannelFragmentInner extends Resource {
    /**
     * The webhook URL to send notifications to.
     */
    @JsonProperty(value = "properties.webHookUrl")
    private String webHookUrl;

    /**
     * Description of notification.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The list of event for which this notification is enabled.
     */
    @JsonProperty(value = "properties.events")
    private List<EventFragment> events;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the webHookUrl value.
     *
     * @return the webHookUrl value
     */
    public String webHookUrl() {
        return this.webHookUrl;
    }

    /**
     * Set the webHookUrl value.
     *
     * @param webHookUrl the webHookUrl value to set
     * @return the NotificationChannelFragmentInner object itself.
     */
    public NotificationChannelFragmentInner withWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the NotificationChannelFragmentInner object itself.
     */
    public NotificationChannelFragmentInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the events value.
     *
     * @return the events value
     */
    public List<EventFragment> events() {
        return this.events;
    }

    /**
     * Set the events value.
     *
     * @param events the events value to set
     * @return the NotificationChannelFragmentInner object itself.
     */
    public NotificationChannelFragmentInner withEvents(List<EventFragment> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the NotificationChannelFragmentInner object itself.
     */
    public NotificationChannelFragmentInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier value.
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier value.
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the NotificationChannelFragmentInner object itself.
     */
    public NotificationChannelFragmentInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
