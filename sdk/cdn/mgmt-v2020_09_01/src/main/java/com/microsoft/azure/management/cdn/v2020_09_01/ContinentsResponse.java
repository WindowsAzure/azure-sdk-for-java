/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.CdnManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.ContinentsResponseInner;
import java.util.List;

/**
 * Type representing ContinentsResponse.
 */
public interface ContinentsResponse extends HasInner<ContinentsResponseInner>, HasManager<CdnManager> {
    /**
     * @return the continents value.
     */
    List<ContinentsResponseContinentsItem> continents();

    /**
     * @return the countryOrRegions value.
     */
    List<ContinentsResponseCountryOrRegionsItem> countryOrRegions();

}
