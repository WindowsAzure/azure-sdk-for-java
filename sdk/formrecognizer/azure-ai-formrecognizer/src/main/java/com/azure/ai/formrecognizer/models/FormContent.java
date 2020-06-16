// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.model.BoundingBox;

/**
 * The FormContent model.
 */
@Immutable
public abstract class FormContent {

    /*
     * Text content of the extracted field.
     */
    private final String text;

    /*
     * The 1-based page number in the input document.
     */
    private final Integer pageNumber;

    /*
     * BoundingBox specifying relative coordinates of the element.
     */
    private final BoundingBox boundingBox;

    /**
     * Creates raw OCR item.
     *
     * @param text The text content of the field.
     * @param boundingBox The BoundingBox specifying relative coordinates of the field.
     * @param pageNumber the 1 based page number.
     */
    FormContent(final String text, final BoundingBox boundingBox, final Integer pageNumber) {
        this.text = text;
        this.boundingBox = boundingBox;
        this.pageNumber = pageNumber;
    }

    /**
     * A list of 4 points representing the quadrilateral bounding box that outlines the text.
     * The points are listed in clockwise order: top-left, top-right, bottom-right, bottom-left.
     *
     * @return the {@code boundingBox} value of the element.
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * The text of the extracted item.
     *
     * @return The text of the extracted item.
     */
    public String getText() {
        return text;
    }

    /**
     * Get the 1-based page number in the input document.
     *
     * @return the page number value.
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }
}
