// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.ai.formrecognizer.models.LengthUnit;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ReadResult model. */
@Fluent
public final class ReadResult {
    /*
     * The 1-based page number in the input document.
     */
    @JsonProperty(value = "page", required = true)
    private int page;

    /*
     * The general orientation of the text in clockwise direction, measured in
     * degrees between (-180, 180].
     */
    @JsonProperty(value = "angle", required = true)
    private float angle;

    /*
     * The width of the image/PDF in pixels/inches, respectively.
     */
    @JsonProperty(value = "width", required = true)
    private float width;

    /*
     * The height of the image/PDF in pixels/inches, respectively.
     */
    @JsonProperty(value = "height", required = true)
    private float height;

    /*
     * The unit used by the width, height and boundingBox properties. For
     * images, the unit is "pixel". For PDF, the unit is "inch".
     */
    @JsonProperty(value = "unit", required = true)
    private LengthUnit unit;

    /*
     * The detected language on the page overall.
     */
    @JsonProperty(value = "language")
    private Language language;

    /*
     * When includeTextDetails is set to true, a list of recognized text lines.
     * The maximum number of lines returned is 300 per page. The lines are
     * sorted top to bottom, left to right, although in certain cases proximity
     * is treated with higher priority. As the sorting order depends on the
     * detected text, it may change across images and OCR version updates.
     * Thus, business logic should be built upon the actual line location
     * instead of order.
     */
    @JsonProperty(value = "lines")
    private List<TextLine> lines;

    /*
     * List of selection marks extracted from the page.
     */
    @JsonProperty(value = "selectionMarks")
    private List<SelectionMark> selectionMarks;

    /**
     * Get the page property: The 1-based page number in the input document.
     *
     * @return the page value.
     */
    public int getPage() {
        return this.page;
    }

    /**
     * Set the page property: The 1-based page number in the input document.
     *
     * @param page the page value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setPage(int page) {
        this.page = page;
        return this;
    }

    /**
     * Get the angle property: The general orientation of the text in clockwise direction, measured in degrees between
     * (-180, 180].
     *
     * @return the angle value.
     */
    public float getAngle() {
        return this.angle;
    }

    /**
     * Set the angle property: The general orientation of the text in clockwise direction, measured in degrees between
     * (-180, 180].
     *
     * @param angle the angle value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setAngle(float angle) {
        this.angle = angle;
        return this;
    }

    /**
     * Get the width property: The width of the image/PDF in pixels/inches, respectively.
     *
     * @return the width value.
     */
    public float getWidth() {
        return this.width;
    }

    /**
     * Set the width property: The width of the image/PDF in pixels/inches, respectively.
     *
     * @param width the width value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setWidth(float width) {
        this.width = width;
        return this;
    }

    /**
     * Get the height property: The height of the image/PDF in pixels/inches, respectively.
     *
     * @return the height value.
     */
    public float getHeight() {
        return this.height;
    }

    /**
     * Set the height property: The height of the image/PDF in pixels/inches, respectively.
     *
     * @param height the height value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setHeight(float height) {
        this.height = height;
        return this;
    }

    /**
     * Get the unit property: The unit used by the width, height and boundingBox properties. For images, the unit is
     * "pixel". For PDF, the unit is "inch".
     *
     * @return the unit value.
     */
    public LengthUnit getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit used by the width, height and boundingBox properties. For images, the unit is
     * "pixel". For PDF, the unit is "inch".
     *
     * @param unit the unit value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setUnit(LengthUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the language property: The detected language on the page overall.
     *
     * @return the language value.
     */
    public Language getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The detected language on the page overall.
     *
     * @param language the language value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setLanguage(Language language) {
        this.language = language;
        return this;
    }

    /**
     * Get the lines property: When includeTextDetails is set to true, a list of recognized text lines. The maximum
     * number of lines returned is 300 per page. The lines are sorted top to bottom, left to right, although in certain
     * cases proximity is treated with higher priority. As the sorting order depends on the detected text, it may change
     * across images and OCR version updates. Thus, business logic should be built upon the actual line location instead
     * of order.
     *
     * @return the lines value.
     */
    public List<TextLine> getLines() {
        return this.lines;
    }

    /**
     * Set the lines property: When includeTextDetails is set to true, a list of recognized text lines. The maximum
     * number of lines returned is 300 per page. The lines are sorted top to bottom, left to right, although in certain
     * cases proximity is treated with higher priority. As the sorting order depends on the detected text, it may change
     * across images and OCR version updates. Thus, business logic should be built upon the actual line location instead
     * of order.
     *
     * @param lines the lines value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setLines(List<TextLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Get the selectionMarks property: List of selection marks extracted from the page.
     *
     * @return the selectionMarks value.
     */
    public List<SelectionMark> getSelectionMarks() {
        return this.selectionMarks;
    }

    /**
     * Set the selectionMarks property: List of selection marks extracted from the page.
     *
     * @param selectionMarks the selectionMarks value to set.
     * @return the ReadResult object itself.
     */
    public ReadResult setSelectionMarks(List<SelectionMark> selectionMarks) {
        this.selectionMarks = selectionMarks;
        return this;
    }
}
