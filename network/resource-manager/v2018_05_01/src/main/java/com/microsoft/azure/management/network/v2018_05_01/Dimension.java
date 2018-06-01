/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dimension of the metric.
 */
public class Dimension {
    /**
     * The name of the dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display name of the dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The internal name of the dimension.
     */
    @JsonProperty(value = "internalName")
    private String internalName;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the Dimension object itself.
     */
    public Dimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the internalName value.
     *
     * @return the internalName value
     */
    public String internalName() {
        return this.internalName;
    }

    /**
     * Set the internalName value.
     *
     * @param internalName the internalName value to set
     * @return the Dimension object itself.
     */
    public Dimension withInternalName(String internalName) {
        this.internalName = internalName;
        return this;
    }

}
