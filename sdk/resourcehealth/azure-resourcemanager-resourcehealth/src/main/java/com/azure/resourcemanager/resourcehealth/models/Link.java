// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Useful links for service health event. */
@Fluent
public final class Link {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Link.class);

    /*
     * Type of link.
     */
    @JsonProperty(value = "type")
    private LinkTypeValues type;

    /*
     * Display text of link.
     */
    @JsonProperty(value = "displayText")
    private LinkDisplayText displayText;

    /*
     * It provides the name of portal extension to produce link for given
     * service health event.
     */
    @JsonProperty(value = "extensionName")
    private String extensionName;

    /*
     * It provides the name of portal extension blade to produce link for given
     * service health event.
     */
    @JsonProperty(value = "bladeName")
    private String bladeName;

    /*
     * It provides a map of parameter name and value for portal extension blade
     * to produce lik for given service health event.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * Get the type property: Type of link.
     *
     * @return the type value.
     */
    public LinkTypeValues type() {
        return this.type;
    }

    /**
     * Set the type property: Type of link.
     *
     * @param type the type value to set.
     * @return the Link object itself.
     */
    public Link withType(LinkTypeValues type) {
        this.type = type;
        return this;
    }

    /**
     * Get the displayText property: Display text of link.
     *
     * @return the displayText value.
     */
    public LinkDisplayText displayText() {
        return this.displayText;
    }

    /**
     * Set the displayText property: Display text of link.
     *
     * @param displayText the displayText value to set.
     * @return the Link object itself.
     */
    public Link withDisplayText(LinkDisplayText displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get the extensionName property: It provides the name of portal extension to produce link for given service health
     * event.
     *
     * @return the extensionName value.
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set the extensionName property: It provides the name of portal extension to produce link for given service health
     * event.
     *
     * @param extensionName the extensionName value to set.
     * @return the Link object itself.
     */
    public Link withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get the bladeName property: It provides the name of portal extension blade to produce link for given service
     * health event.
     *
     * @return the bladeName value.
     */
    public String bladeName() {
        return this.bladeName;
    }

    /**
     * Set the bladeName property: It provides the name of portal extension blade to produce link for given service
     * health event.
     *
     * @param bladeName the bladeName value to set.
     * @return the Link object itself.
     */
    public Link withBladeName(String bladeName) {
        this.bladeName = bladeName;
        return this;
    }

    /**
     * Get the parameters property: It provides a map of parameter name and value for portal extension blade to produce
     * lik for given service health event.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: It provides a map of parameter name and value for portal extension blade to produce
     * lik for given service health event.
     *
     * @param parameters the parameters value to set.
     * @return the Link object itself.
     */
    public Link withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayText() != null) {
            displayText().validate();
        }
    }
}
