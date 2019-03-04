/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object detected inside an image.
 */
public class ObjectHierarchy {
    /**
     * Label for the object.
     */
    @JsonProperty(value = "object")
    private String objectProperty;

    /**
     * Confidence score of having observed the object in the image, as a value
     * ranging from 0 to 1.
     */
    @JsonProperty(value = "confidence")
    private double confidence;

    /**
     * The parent object, from a taxonomy perspective.
     * The parent object is a more generic form of this object.  For example, a
     * 'bulldog' would have a parent of 'dog'.
     */
    @JsonProperty(value = "parent")
    private ObjectHierarchy parent;

    /**
     * Get label for the object.
     *
     * @return the objectProperty value
     */
    public String objectProperty() {
        return this.objectProperty;
    }

    /**
     * Set label for the object.
     *
     * @param objectProperty the objectProperty value to set
     * @return the ObjectHierarchy object itself.
     */
    public ObjectHierarchy withObjectProperty(String objectProperty) {
        this.objectProperty = objectProperty;
        return this;
    }

    /**
     * Get confidence score of having observed the object in the image, as a value ranging from 0 to 1.
     *
     * @return the confidence value
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Set confidence score of having observed the object in the image, as a value ranging from 0 to 1.
     *
     * @param confidence the confidence value to set
     * @return the ObjectHierarchy object itself.
     */
    public ObjectHierarchy withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the parent object, from a taxonomy perspective.
     The parent object is a more generic form of this object.  For example, a 'bulldog' would have a parent of 'dog'.
     *
     * @return the parent value
     */
    public ObjectHierarchy parent() {
        return this.parent;
    }

    /**
     * Set the parent object, from a taxonomy perspective.
     The parent object is a more generic form of this object.  For example, a 'bulldog' would have a parent of 'dog'.
     *
     * @param parent the parent value to set
     * @return the ObjectHierarchy object itself.
     */
    public ObjectHierarchy withParent(ObjectHierarchy parent) {
        this.parent = parent;
        return this;
    }

}
