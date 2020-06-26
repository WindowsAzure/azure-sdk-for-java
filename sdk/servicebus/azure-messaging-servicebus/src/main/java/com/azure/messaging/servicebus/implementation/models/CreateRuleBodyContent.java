// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.models.RuleDescription;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The CreateRuleBodyContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class CreateRuleBodyContent {
    /*
     * MIME type of content.
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Rule information to create.
     */
    @JacksonXmlProperty(
            localName = "RuleDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private RuleDescription ruleDescription;

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
     * @return the CreateRuleBodyContent object itself.
     */
    public CreateRuleBodyContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the ruleDescription property: Rule information to create.
     *
     * @return the ruleDescription value.
     */
    public RuleDescription getRuleDescription() {
        return this.ruleDescription;
    }

    /**
     * Set the ruleDescription property: Rule information to create.
     *
     * @param ruleDescription the ruleDescription value to set.
     * @return the CreateRuleBodyContent object itself.
     */
    public CreateRuleBodyContent setRuleDescription(RuleDescription ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
}
