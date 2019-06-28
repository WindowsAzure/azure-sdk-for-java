/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.RecipientsContractProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Notification details.
 */
@JsonFlatten
public class NotificationContractInner extends ProxyResource {
    /**
     * Title of the Notification.
     */
    @JsonProperty(value = "properties.title", required = true)
    private String title;

    /**
     * Description of the Notification.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Recipient Parameter values.
     */
    @JsonProperty(value = "properties.recipients")
    private RecipientsContractProperties recipients;

    /**
     * Get title of the Notification.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set title of the Notification.
     *
     * @param title the title value to set
     * @return the NotificationContractInner object itself.
     */
    public NotificationContractInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get description of the Notification.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the Notification.
     *
     * @param description the description value to set
     * @return the NotificationContractInner object itself.
     */
    public NotificationContractInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get recipient Parameter values.
     *
     * @return the recipients value
     */
    public RecipientsContractProperties recipients() {
        return this.recipients;
    }

    /**
     * Set recipient Parameter values.
     *
     * @param recipients the recipients value to set
     * @return the NotificationContractInner object itself.
     */
    public NotificationContractInner withRecipients(RecipientsContractProperties recipients) {
        this.recipients = recipients;
        return this;
    }

}
