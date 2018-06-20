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
 * The OcrResult model.
 */
public class OcrResult {
    /**
     * The BCP-47 language code of the text in the image.
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * The angle, in degrees, of the detected text with respect to the closest
     * horizontal or vertical direction. After rotating the input image
     * clockwise by this angle, the recognized text lines become horizontal or
     * vertical. In combination with the orientation property it can be used to
     * overlay recognition results correctly on the original image, by rotating
     * either the original image or recognition results by a suitable angle
     * around the center of the original image. If the angle cannot be
     * confidently detected, this property is not present. If the image
     * contains text at different angles, only part of the text will be
     * recognized correctly.
     */
    @JsonProperty(value = "textAngle")
    private double textAngle;

    /**
     * Orientation of the text recognized in the image. The value
     * (up,down,left, or right) refers to the direction that the top of the
     * recognized text is facing, after the image has been rotated around its
     * center according to the detected text angle (see textAngle property).
     */
    @JsonProperty(value = "orientation")
    private String orientation;

    /**
     * An array of objects, where each object represents a region of recognized
     * text.
     */
    @JsonProperty(value = "regions")
    private List<OcrRegion> regions;

    /**
     * Get the BCP-47 language code of the text in the image.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the BCP-47 language code of the text in the image.
     *
     * @param language the language value to set
     * @return the OcrResult object itself.
     */
    public OcrResult withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the angle, in degrees, of the detected text with respect to the closest horizontal or vertical direction. After rotating the input image clockwise by this angle, the recognized text lines become horizontal or vertical. In combination with the orientation property it can be used to overlay recognition results correctly on the original image, by rotating either the original image or recognition results by a suitable angle around the center of the original image. If the angle cannot be confidently detected, this property is not present. If the image contains text at different angles, only part of the text will be recognized correctly.
     *
     * @return the textAngle value
     */
    public double textAngle() {
        return this.textAngle;
    }

    /**
     * Set the angle, in degrees, of the detected text with respect to the closest horizontal or vertical direction. After rotating the input image clockwise by this angle, the recognized text lines become horizontal or vertical. In combination with the orientation property it can be used to overlay recognition results correctly on the original image, by rotating either the original image or recognition results by a suitable angle around the center of the original image. If the angle cannot be confidently detected, this property is not present. If the image contains text at different angles, only part of the text will be recognized correctly.
     *
     * @param textAngle the textAngle value to set
     * @return the OcrResult object itself.
     */
    public OcrResult withTextAngle(double textAngle) {
        this.textAngle = textAngle;
        return this;
    }

    /**
     * Get orientation of the text recognized in the image. The value (up,down,left, or right) refers to the direction that the top of the recognized text is facing, after the image has been rotated around its center according to the detected text angle (see textAngle property).
     *
     * @return the orientation value
     */
    public String orientation() {
        return this.orientation;
    }

    /**
     * Set orientation of the text recognized in the image. The value (up,down,left, or right) refers to the direction that the top of the recognized text is facing, after the image has been rotated around its center according to the detected text angle (see textAngle property).
     *
     * @param orientation the orientation value to set
     * @return the OcrResult object itself.
     */
    public OcrResult withOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Get an array of objects, where each object represents a region of recognized text.
     *
     * @return the regions value
     */
    public List<OcrRegion> regions() {
        return this.regions;
    }

    /**
     * Set an array of objects, where each object represents a region of recognized text.
     *
     * @param regions the regions value to set
     * @return the OcrResult object itself.
     */
    public OcrResult withRegions(List<OcrRegion> regions) {
        this.regions = regions;
        return this;
    }

}
