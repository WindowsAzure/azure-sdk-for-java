// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TimezoneEnumWindow model. */
@Fluent
public final class TimezoneEnumWindow {
    /*
     * Windows Id property
     */
    @JsonProperty(value = "WindowsId", access = JsonProperty.Access.WRITE_ONLY)
    private String windowsId;

    /*
     * Territory property
     */
    @JsonProperty(value = "Territory", access = JsonProperty.Access.WRITE_ONLY)
    private String territory;

    /*
     * IanaIds array
     */
    @JsonProperty(value = "IanaIds")
    private List<String> ianaIds;

    /**
     * Get the windowsId property: Windows Id property.
     *
     * @return the windowsId value.
     */
    public String getWindowsId() {
        return this.windowsId;
    }

    /**
     * Get the territory property: Territory property.
     *
     * @return the territory value.
     */
    public String getTerritory() {
        return this.territory;
    }

    /**
     * Get the ianaIds property: IanaIds array.
     *
     * @return the ianaIds value.
     */
    public List<String> getIanaIds() {
        return this.ianaIds;
    }

    /**
     * Set the ianaIds property: IanaIds array.
     *
     * @param ianaIds the ianaIds value to set.
     * @return the TimezoneEnumWindow object itself.
     */
    public TimezoneEnumWindow setIanaIds(List<String> ianaIds) {
        this.ianaIds = ianaIds;
        return this;
    }
}
