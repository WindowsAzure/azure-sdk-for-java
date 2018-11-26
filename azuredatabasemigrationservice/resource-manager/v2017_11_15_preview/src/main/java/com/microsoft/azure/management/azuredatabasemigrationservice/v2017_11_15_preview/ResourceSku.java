/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation.DataMigrationManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation.ResourceSkuInner;
import java.util.List;

/**
 * Type representing ResourceSku.
 */
public interface ResourceSku extends HasInner<ResourceSkuInner>, HasManager<DataMigrationManager> {
    /**
     * @return the apiVersions value.
     */
    List<String> apiVersions();

    /**
     * @return the capabilities value.
     */
    List<ResourceSkuCapabilities> capabilities();

    /**
     * @return the capacity value.
     */
    ResourceSkuCapacity capacity();

    /**
     * @return the costs value.
     */
    List<ResourceSkuCosts> costs();

    /**
     * @return the family value.
     */
    String family();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the locations value.
     */
    List<String> locations();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the restrictions value.
     */
    List<ResourceSkuRestrictions> restrictions();

    /**
     * @return the size value.
     */
    String size();

    /**
     * @return the tier value.
     */
    String tier();

}
