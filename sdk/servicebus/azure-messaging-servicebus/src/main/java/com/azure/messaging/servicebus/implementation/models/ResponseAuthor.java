// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The ResponseAuthor model. */
@JacksonXmlRootElement(localName = "author", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class ResponseAuthor {
    /*
     * The Service Bus namespace
     */
    @JacksonXmlProperty(localName = "name", namespace = "http://www.w3.org/2005/Atom")
    private String name;

    /**
     * Get the name property: The Service Bus namespace.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Service Bus namespace.
     *
     * @param name the name value to set.
     * @return the ResponseAuthor object itself.
     */
    public ResponseAuthor setName(String name) {
        this.name = name;
        return this;
    }
}
