/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The GenerateThumbnailOptionalParameter model.
 */
public class GenerateThumbnailOptionalParameter {
    /**
     * Boolean flag for enabling smart cropping.
     */
    private Boolean smartCropping;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the smartCropping value.
     *
     * @return the smartCropping value
     */
    public Boolean smartCropping() {
        return this.smartCropping;
    }

    /**
     * Set the smartCropping value.
     *
     * @param smartCropping the smartCropping value to set
     * @return the GenerateThumbnailOptionalParameter object itself.
     */
    public GenerateThumbnailOptionalParameter withSmartCropping(Boolean smartCropping) {
        this.smartCropping = smartCropping;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the GenerateThumbnailOptionalParameter object itself.
     */
    public GenerateThumbnailOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
