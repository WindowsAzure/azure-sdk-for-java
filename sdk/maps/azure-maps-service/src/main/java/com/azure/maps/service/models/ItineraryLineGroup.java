// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A line group. */
@Fluent
public final class ItineraryLineGroup {
    /*
     * Line group Id. Typically contains 2 lines having the same agency and
     * line, one going from A to B, and the other from B to A.
     */
    @JsonProperty(value = "lineGroupId")
    private String lineGroupId;

    /*
     * The Id of the transit agency, for example, '5872'.
     */
    @JsonProperty(value = "agencyId")
    private String agencyId;

    /*
     * The name of the transit agency, e.g. Metro Transit.
     */
    @JsonProperty(value = "agencyName")
    private String agencyName;

    /*
     * The transit line number.
     */
    @JsonProperty(value = "lineNumber")
    private String lineNumber;

    /*
     * A descriptive string. In case caption2 is null, should be used alone as
     * a subtitle to the line number (i.e. Circular). In case caption2 has a
     * value present, should be used in conjunction with it (i.e. Rome ↔
     * Napoli).
     */
    @JsonProperty(value = "caption1")
    private String caption1;

    /*
     * A descriptive string.
     */
    @JsonProperty(value = "caption2")
    private String caption2;

    /*
     * HEX color for the line.
     */
    @JsonProperty(value = "color")
    private String color;

    /*
     * The public transit type of the line.
     */
    @JsonProperty(value = "transitType")
    private TransitType transitType;

    /**
     * Get the lineGroupId property: Line group Id. Typically contains 2 lines having the same agency and line, one
     * going from A to B, and the other from B to A.
     *
     * @return the lineGroupId value.
     */
    public String getLineGroupId() {
        return this.lineGroupId;
    }

    /**
     * Set the lineGroupId property: Line group Id. Typically contains 2 lines having the same agency and line, one
     * going from A to B, and the other from B to A.
     *
     * @param lineGroupId the lineGroupId value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setLineGroupId(String lineGroupId) {
        this.lineGroupId = lineGroupId;
        return this;
    }

    /**
     * Get the agencyId property: The Id of the transit agency, for example, '5872'.
     *
     * @return the agencyId value.
     */
    public String getAgencyId() {
        return this.agencyId;
    }

    /**
     * Set the agencyId property: The Id of the transit agency, for example, '5872'.
     *
     * @param agencyId the agencyId value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * Get the agencyName property: The name of the transit agency, e.g. Metro Transit.
     *
     * @return the agencyName value.
     */
    public String getAgencyName() {
        return this.agencyName;
    }

    /**
     * Set the agencyName property: The name of the transit agency, e.g. Metro Transit.
     *
     * @param agencyName the agencyName value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * Get the lineNumber property: The transit line number.
     *
     * @return the lineNumber value.
     */
    public String getLineNumber() {
        return this.lineNumber;
    }

    /**
     * Set the lineNumber property: The transit line number.
     *
     * @param lineNumber the lineNumber value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * Get the caption1 property: A descriptive string. In case caption2 is null, should be used alone as a subtitle to
     * the line number (i.e. Circular). In case caption2 has a value present, should be used in conjunction with it
     * (i.e. Rome ↔ Napoli).
     *
     * @return the caption1 value.
     */
    public String getCaption1() {
        return this.caption1;
    }

    /**
     * Set the caption1 property: A descriptive string. In case caption2 is null, should be used alone as a subtitle to
     * the line number (i.e. Circular). In case caption2 has a value present, should be used in conjunction with it
     * (i.e. Rome ↔ Napoli).
     *
     * @param caption1 the caption1 value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setCaption1(String caption1) {
        this.caption1 = caption1;
        return this;
    }

    /**
     * Get the caption2 property: A descriptive string.
     *
     * @return the caption2 value.
     */
    public String getCaption2() {
        return this.caption2;
    }

    /**
     * Set the caption2 property: A descriptive string.
     *
     * @param caption2 the caption2 value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setCaption2(String caption2) {
        this.caption2 = caption2;
        return this;
    }

    /**
     * Get the color property: HEX color for the line.
     *
     * @return the color value.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color property: HEX color for the line.
     *
     * @param color the color value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get the transitType property: The public transit type of the line.
     *
     * @return the transitType value.
     */
    public TransitType getTransitType() {
        return this.transitType;
    }

    /**
     * Set the transitType property: The public transit type of the line.
     *
     * @param transitType the transitType value to set.
     * @return the ItineraryLineGroup object itself.
     */
    public ItineraryLineGroup setTransitType(TransitType transitType) {
        this.transitType = transitType;
        return this;
    }
}
