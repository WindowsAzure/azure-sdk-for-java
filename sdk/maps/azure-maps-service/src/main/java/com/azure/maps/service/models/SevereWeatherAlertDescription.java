// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of a severe weather alert. */
@Fluent
public final class SevereWeatherAlertDescription {
    /*
     * Description of the alert in the specified language. By default English
     * (en-US) is returned if the language parameter is not specified in the
     * request.
     */
    @JsonProperty(value = "localized")
    private String localized;

    /*
     * Description of the alert in English (en-US).
     */
    @JsonProperty(value = "english")
    private String english;

    /**
     * Get the localized property: Description of the alert in the specified language. By default English (en-US) is
     * returned if the language parameter is not specified in the request.
     *
     * @return the localized value.
     */
    public String getLocalized() {
        return this.localized;
    }

    /**
     * Set the localized property: Description of the alert in the specified language. By default English (en-US) is
     * returned if the language parameter is not specified in the request.
     *
     * @param localized the localized value to set.
     * @return the SevereWeatherAlertDescription object itself.
     */
    public SevereWeatherAlertDescription setLocalized(String localized) {
        this.localized = localized;
        return this;
    }

    /**
     * Get the english property: Description of the alert in English (en-US).
     *
     * @return the english value.
     */
    public String getEnglish() {
        return this.english;
    }

    /**
     * Set the english property: Description of the alert in English (en-US).
     *
     * @param english the english value to set.
     * @return the SevereWeatherAlertDescription object itself.
     */
    public SevereWeatherAlertDescription setEnglish(String english) {
        this.english = english;
        return this;
    }
}
