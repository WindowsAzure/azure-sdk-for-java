// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The CreateTopicBodyContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class CreateTopicBodyContent {
    /*
     * MIME type of content.
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Topic information to create.
     */
    @JacksonXmlProperty(
            localName = "TopicDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private TopicDescription topicDescription;

    /**
     * Get the type property: MIME type of content.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: MIME type of content.
     *
     * @param type the type value to set.
     * @return the CreateTopicBodyContent object itself.
     */
    public CreateTopicBodyContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the topicDescription property: Topic information to create.
     *
     * @return the topicDescription value.
     */
    public TopicDescription getTopicDescription() {
        return this.topicDescription;
    }

    /**
     * Set the topicDescription property: Topic information to create.
     *
     * @param topicDescription the topicDescription value to set.
     * @return the CreateTopicBodyContent object itself.
     */
    public CreateTopicBodyContent setTopicDescription(TopicDescription topicDescription) {
        this.topicDescription = topicDescription;
        return this;
    }
}
