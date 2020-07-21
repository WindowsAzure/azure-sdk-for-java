/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Location metadata information.
 */
public class LocationMetadata {
    /**
     * The type of the region. Possible values include: 'Physical', 'Logical'.
     */
    @JsonProperty(value = "regionType", access = JsonProperty.Access.WRITE_ONLY)
    private RegionType regionType;

    /**
     * The category of the region. Possible values include: 'Recommended',
     * 'Other'.
     */
    @JsonProperty(value = "regionCategory", access = JsonProperty.Access.WRITE_ONLY)
    private RegionCategory regionCategory;

    /**
     * The geography group of the location.
     */
    @JsonProperty(value = "geographyGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String geographyGroup;

    /**
     * The longitude of the location.
     */
    @JsonProperty(value = "longitude", access = JsonProperty.Access.WRITE_ONLY)
    private String longitude;

    /**
     * The latitude of the location.
     */
    @JsonProperty(value = "latitude", access = JsonProperty.Access.WRITE_ONLY)
    private String latitude;

    /**
     * The physical location of the Azure location.
     */
    @JsonProperty(value = "physicalLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String physicalLocation;

    /**
     * The regions paired to this region.
     */
    @JsonProperty(value = "pairedRegion")
    private List<PairedRegion> pairedRegion;

    /**
     * Get the type of the region. Possible values include: 'Physical', 'Logical'.
     *
     * @return the regionType value
     */
    public RegionType regionType() {
        return this.regionType;
    }

    /**
     * Get the category of the region. Possible values include: 'Recommended', 'Other'.
     *
     * @return the regionCategory value
     */
    public RegionCategory regionCategory() {
        return this.regionCategory;
    }

    /**
     * Get the geography group of the location.
     *
     * @return the geographyGroup value
     */
    public String geographyGroup() {
        return this.geographyGroup;
    }

    /**
     * Get the longitude of the location.
     *
     * @return the longitude value
     */
    public String longitude() {
        return this.longitude;
    }

    /**
     * Get the latitude of the location.
     *
     * @return the latitude value
     */
    public String latitude() {
        return this.latitude;
    }

    /**
     * Get the physical location of the Azure location.
     *
     * @return the physicalLocation value
     */
    public String physicalLocation() {
        return this.physicalLocation;
    }

    /**
     * Get the regions paired to this region.
     *
     * @return the pairedRegion value
     */
    public List<PairedRegion> pairedRegion() {
        return this.pairedRegion;
    }

    /**
     * Set the regions paired to this region.
     *
     * @param pairedRegion the pairedRegion value to set
     * @return the LocationMetadata object itself.
     */
    public LocationMetadata withPairedRegion(List<PairedRegion> pairedRegion) {
        this.pairedRegion = pairedRegion;
        return this;
    }

}
