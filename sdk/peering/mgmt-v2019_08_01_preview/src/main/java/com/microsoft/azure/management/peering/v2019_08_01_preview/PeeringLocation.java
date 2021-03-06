/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.peering.v2019_08_01_preview.implementation.PeeringManager;
import com.microsoft.azure.management.peering.v2019_08_01_preview.implementation.PeeringLocationInner;

/**
 * Type representing PeeringLocation.
 */
public interface PeeringLocation extends HasInner<PeeringLocationInner>, HasManager<PeeringManager> {
    /**
     * @return the azureRegion value.
     */
    String azureRegion();

    /**
     * @return the country value.
     */
    String country();

    /**
     * @return the direct value.
     */
    PeeringLocationPropertiesDirect direct();

    /**
     * @return the exchange value.
     */
    PeeringLocationPropertiesExchange exchange();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    Kind kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peeringLocation value.
     */
    String peeringLocation();

    /**
     * @return the type value.
     */
    String type();

}
