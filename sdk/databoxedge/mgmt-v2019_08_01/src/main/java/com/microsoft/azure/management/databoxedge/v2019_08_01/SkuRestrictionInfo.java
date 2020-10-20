/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The restriction info with locations and zones.
 */
public class SkuRestrictionInfo {
    /**
     * The locations.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /**
     * The zones.
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /**
     * Get the locations.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the zones.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

}
