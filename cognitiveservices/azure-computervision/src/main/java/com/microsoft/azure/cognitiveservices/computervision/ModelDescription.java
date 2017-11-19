/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.computervision;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object describing supported model by name and categories.
 */
public class ModelDescription {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The categories property.
     */
    @JsonProperty(value = "categories")
    private List<String> categories;

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
     * @return the ModelDescription object itself.
     */
    public ModelDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the categories value.
     *
     * @return the categories value
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * Set the categories value.
     *
     * @param categories the categories value to set
     * @return the ModelDescription object itself.
     */
    public ModelDescription withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

}
