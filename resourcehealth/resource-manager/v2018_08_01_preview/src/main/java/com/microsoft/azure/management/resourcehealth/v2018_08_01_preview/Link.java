/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Useful links for service health event.
 */
public class Link {
    /**
     * Type of link. Possible values include: 'Button', 'Hyperlink'.
     */
    @JsonProperty(value = "type")
    private LinkTypeValues type;

    /**
     * Display text of link.
     */
    @JsonProperty(value = "displayText")
    private LinkDisplayText displayText;

    /**
     * It provides the name of portal extension to produce link for given
     * service health event.
     */
    @JsonProperty(value = "extensionName")
    private String extensionName;

    /**
     * It provides the name of portal extension blade to produce link for given
     * service health event.
     */
    @JsonProperty(value = "bladeName")
    private String bladeName;

    /**
     * It provides a map of parameter name and value for portal extension blade
     * to produce lik for given service health event.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * Get type of link. Possible values include: 'Button', 'Hyperlink'.
     *
     * @return the type value
     */
    public LinkTypeValues type() {
        return this.type;
    }

    /**
     * Set type of link. Possible values include: 'Button', 'Hyperlink'.
     *
     * @param type the type value to set
     * @return the Link object itself.
     */
    public Link withType(LinkTypeValues type) {
        this.type = type;
        return this;
    }

    /**
     * Get display text of link.
     *
     * @return the displayText value
     */
    public LinkDisplayText displayText() {
        return this.displayText;
    }

    /**
     * Set display text of link.
     *
     * @param displayText the displayText value to set
     * @return the Link object itself.
     */
    public Link withDisplayText(LinkDisplayText displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get it provides the name of portal extension to produce link for given service health event.
     *
     * @return the extensionName value
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set it provides the name of portal extension to produce link for given service health event.
     *
     * @param extensionName the extensionName value to set
     * @return the Link object itself.
     */
    public Link withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get it provides the name of portal extension blade to produce link for given service health event.
     *
     * @return the bladeName value
     */
    public String bladeName() {
        return this.bladeName;
    }

    /**
     * Set it provides the name of portal extension blade to produce link for given service health event.
     *
     * @param bladeName the bladeName value to set
     * @return the Link object itself.
     */
    public Link withBladeName(String bladeName) {
        this.bladeName = bladeName;
        return this;
    }

    /**
     * Get it provides a map of parameter name and value for portal extension blade to produce lik for given service health event.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set it provides a map of parameter name and value for portal extension blade to produce lik for given service health event.
     *
     * @param parameters the parameters value to set
     * @return the Link object itself.
     */
    public Link withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

}
