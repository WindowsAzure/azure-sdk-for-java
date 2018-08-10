/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Body model.
 */
public class Body {
    /**
     * Name of the list.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Description of the list.
     */
    @JsonProperty(value = "Description")
    private String description;

    /**
     * Metadata of the list.
     */
    @JsonProperty(value = "Metadata")
    private BodyMetadata metadata;

    /**
     * Get name of the list.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the list.
     *
     * @param name the name value to set
     * @return the Body object itself.
     */
    public Body withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get description of the list.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the list.
     *
     * @param description the description value to set
     * @return the Body object itself.
     */
    public Body withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get metadata of the list.
     *
     * @return the metadata value
     */
    public BodyMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set metadata of the list.
     *
     * @param metadata the metadata value to set
     * @return the Body object itself.
     */
    public Body withMetadata(BodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

}
