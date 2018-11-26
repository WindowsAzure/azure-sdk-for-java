/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.List;

/**
 * The CreateImageRegionsOptionalParameter model.
 */
public class CreateImageRegionsOptionalParameter {
    /**
     * The regions property.
     */
    private List<ImageRegionCreateEntry> regions;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the regions value.
     *
     * @return the regions value
     */
    public List<ImageRegionCreateEntry> regions() {
        return this.regions;
    }

    /**
     * Set the regions value.
     *
     * @param regions the regions value to set
     * @return the CreateImageRegionsOptionalParameter object itself.
     */
    public CreateImageRegionsOptionalParameter withRegions(List<ImageRegionCreateEntry> regions) {
        this.regions = regions;
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
     * @return the CreateImageRegionsOptionalParameter object itself.
     */
    public CreateImageRegionsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
