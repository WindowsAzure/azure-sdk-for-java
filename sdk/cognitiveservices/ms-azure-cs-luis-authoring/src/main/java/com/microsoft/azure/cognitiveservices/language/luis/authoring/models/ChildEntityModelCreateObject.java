/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A child entity extractor create object.
 */
public class ChildEntityModelCreateObject {
    /**
     * Child entities.
     */
    @JsonProperty(value = "children")
    private List<ChildEntityModelCreateObject> children;

    /**
     * Entity name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The instance of model name.
     */
    @JsonProperty(value = "instanceOf")
    private String instanceOfProperty;

    /**
     * Get the children value.
     *
     * @return the children value
     */
    public List<ChildEntityModelCreateObject> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set
     * @return the ChildEntityModelCreateObject object itself.
     */
    public ChildEntityModelCreateObject withChildren(List<ChildEntityModelCreateObject> children) {
        this.children = children;
        return this;
    }

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
     * @return the ChildEntityModelCreateObject object itself.
     */
    public ChildEntityModelCreateObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the instanceOfProperty value.
     *
     * @return the instanceOfProperty value
     */
    public String instanceOfProperty() {
        return this.instanceOfProperty;
    }

    /**
     * Set the instanceOfProperty value.
     *
     * @param instanceOfProperty the instanceOfProperty value to set
     * @return the ChildEntityModelCreateObject object itself.
     */
    public ChildEntityModelCreateObject withInstanceOfProperty(String instanceOfProperty) {
        this.instanceOfProperty = instanceOfProperty;
        return this;
    }

}
