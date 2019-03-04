/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TextRecognitionResult model.
 */
public class TextRecognitionResult {
    /**
     * The lines property.
     */
    @JsonProperty(value = "lines", required = true)
    private List<Line> lines;

    /**
     * The page property.
     */
    @JsonProperty(value = "page")
    private Integer page;

    /**
     * The width property.
     */
    @JsonProperty(value = "width")
    private Double width;

    /**
     * The height property.
     */
    @JsonProperty(value = "height")
    private Double height;

    /**
     * The clockwiseOrientation property.
     */
    @JsonProperty(value = "clockwiseOrientation")
    private Double clockwiseOrientation;

    /**
     * Possible values include: 'pixel', 'inch'.
     */
    @JsonProperty(value = "unit")
    private TextRecognitionResultDimensionUnit unit;

    /**
     * Get the lines value.
     *
     * @return the lines value
     */
    public List<Line> lines() {
        return this.lines;
    }

    /**
     * Set the lines value.
     *
     * @param lines the lines value to set
     * @return the TextRecognitionResult object itself.
     */
    public TextRecognitionResult withLines(List<Line> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Get the page value.
     *
     * @return the page value
     */
    public Integer page() {
        return this.page;
    }

    /**
     * Set the page value.
     *
     * @param page the page value to set
     * @return the TextRecognitionResult object itself.
     */
    public TextRecognitionResult withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get the width value.
     *
     * @return the width value
     */
    public Double width() {
        return this.width;
    }

    /**
     * Set the width value.
     *
     * @param width the width value to set
     * @return the TextRecognitionResult object itself.
     */
    public TextRecognitionResult withWidth(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height value.
     *
     * @return the height value
     */
    public Double height() {
        return this.height;
    }

    /**
     * Set the height value.
     *
     * @param height the height value to set
     * @return the TextRecognitionResult object itself.
     */
    public TextRecognitionResult withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Get the clockwiseOrientation value.
     *
     * @return the clockwiseOrientation value
     */
    public Double clockwiseOrientation() {
        return this.clockwiseOrientation;
    }

    /**
     * Set the clockwiseOrientation value.
     *
     * @param clockwiseOrientation the clockwiseOrientation value to set
     * @return the TextRecognitionResult object itself.
     */
    public TextRecognitionResult withClockwiseOrientation(Double clockwiseOrientation) {
        this.clockwiseOrientation = clockwiseOrientation;
        return this;
    }

    /**
     * Get possible values include: 'pixel', 'inch'.
     *
     * @return the unit value
     */
    public TextRecognitionResultDimensionUnit unit() {
        return this.unit;
    }

    /**
     * Set possible values include: 'pixel', 'inch'.
     *
     * @param unit the unit value to set
     * @return the TextRecognitionResult object itself.
     */
    public TextRecognitionResult withUnit(TextRecognitionResultDimensionUnit unit) {
        this.unit = unit;
        return this;
    }

}
