// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.resourcemanager.storagecache.fluent.models.ResourceSkuInner;
import java.util.List;

/** An immutable client-side representation of ResourceSku. */
public interface ResourceSku {
    /**
     * Gets the resourceType property: The type of resource the SKU applies to.
     *
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the capabilities property: A list of capabilities of this SKU, such as throughput or ops/sec.
     *
     * @return the capabilities value.
     */
    List<ResourceSkuCapabilities> capabilities();

    /**
     * Gets the locations property: The set of locations where the SKU is available. This is the supported and
     * registered Azure Geo Regions (e.g., West US, East US, Southeast Asia, etc.).
     *
     * @return the locations value.
     */
    List<String> locations();

    /**
     * Gets the locationInfo property: The set of locations where the SKU is available.
     *
     * @return the locationInfo value.
     */
    List<ResourceSkuLocationInfo> locationInfo();

    /**
     * Gets the name property: The name of this SKU.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the restrictions property: The restrictions preventing this SKU from being used. This is empty if there are
     * no restrictions.
     *
     * @return the restrictions value.
     */
    List<Restriction> restrictions();

    /**
     * Gets the inner com.azure.resourcemanager.storagecache.fluent.models.ResourceSkuInner object.
     *
     * @return the inner object.
     */
    ResourceSkuInner innerModel();
}
