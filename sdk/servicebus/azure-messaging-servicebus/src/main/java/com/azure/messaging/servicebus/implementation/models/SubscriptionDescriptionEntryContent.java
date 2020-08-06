// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The SubscriptionDescriptionEntryContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class SubscriptionDescriptionEntryContent {
    /*
     * Type of content in subscription response
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Description of a Service Bus subscription resource.
     */
    @JacksonXmlProperty(
            localName = "SubscriptionDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private SubscriptionDescription subscriptionDescription;

    /**
     * Get the type property: Type of content in subscription response.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of content in subscription response.
     *
     * @param type the type value to set.
     * @return the SubscriptionDescriptionEntryContent object itself.
     */
    public SubscriptionDescriptionEntryContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the subscriptionDescription property: Description of a Service Bus subscription resource.
     *
     * @return the subscriptionDescription value.
     */
    public SubscriptionDescription getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * Set the subscriptionDescription property: Description of a Service Bus subscription resource.
     *
     * @param subscriptionDescription the subscriptionDescription value to set.
     * @return the SubscriptionDescriptionEntryContent object itself.
     */
    public SubscriptionDescriptionEntryContent setSubscriptionDescription(
            SubscriptionDescription subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
        return this;
    }
}
