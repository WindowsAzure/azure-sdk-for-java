/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The optional parameters class for "addImage" method.
 */
public class AddImageOptionalParameter {
    /**
    * Tag for the image.
    */
    private Integer tag;

    /**
    * The image label.
    */
    private String label;

    /**
    * Get the tag value.
    *
    * @return the tag value
    */
    public Integer tag() {
        return this.tag;
    }

    /**
    * Get the label value.
    *
    * @return the label value
    */
    public String label() {
        return this.label;
    }

    /**
    * Set the tag value.
    * <p>
    * Tag for the image.
    *
    * @param tag the tag value to set
    * @return the addImageOptionalParameter object itself.
    */
    public AddImageOptionalParameter withTag(int tag) {
        this.tag = tag;
        return this;
    }

    /**
    * Set the label value.
    * <p>
    * The image label.
    *
    * @param label the label value to set
    * @return the addImageOptionalParameter object itself.
    */
    public AddImageOptionalParameter withLabel(String label) {
        this.label = label;
        return this;
    }

    }
