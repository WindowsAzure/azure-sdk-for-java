/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.consumption.v2018_06_30.implementation.ConsumptionManager;
import com.microsoft.azure.management.consumption.v2018_06_30.implementation.PriceSheetResultInner;
import java.util.List;
import java.util.Map;

/**
 * Type representing PriceSheetResult.
 */
public interface PriceSheetResult extends HasInner<PriceSheetResultInner>, HasManager<ConsumptionManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the pricesheets value.
     */
    List<PriceSheetProperties> pricesheets();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
