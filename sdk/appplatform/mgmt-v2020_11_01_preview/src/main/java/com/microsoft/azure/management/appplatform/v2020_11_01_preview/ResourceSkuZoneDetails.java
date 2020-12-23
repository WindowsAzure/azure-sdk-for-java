/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of capabilities available to a SKU in specific zones.
 */
public class ResourceSkuZoneDetails {
    /**
     * Gets the set of zones that the SKU is available in with the
     * specified capabilities.
     */
    @JsonProperty(value = "name")
    private List<String> name;

    /**
     * Gets a list of capabilities that are available for the SKU in the
     * specified list of zones.
     */
    @JsonProperty(value = "capabilities")
    private List<ResourceSkuCapabilities> capabilities;

    /**
     * Get gets the set of zones that the SKU is available in with the
     specified capabilities.
     *
     * @return the name value
     */
    public List<String> name() {
        return this.name;
    }

    /**
     * Set gets the set of zones that the SKU is available in with the
     specified capabilities.
     *
     * @param name the name value to set
     * @return the ResourceSkuZoneDetails object itself.
     */
    public ResourceSkuZoneDetails withName(List<String> name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets a list of capabilities that are available for the SKU in the
     specified list of zones.
     *
     * @return the capabilities value
     */
    public List<ResourceSkuCapabilities> capabilities() {
        return this.capabilities;
    }

    /**
     * Set gets a list of capabilities that are available for the SKU in the
     specified list of zones.
     *
     * @param capabilities the capabilities value to set
     * @return the ResourceSkuZoneDetails object itself.
     */
    public ResourceSkuZoneDetails withCapabilities(List<ResourceSkuCapabilities> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

}
