/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.InsightsManager;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ApplicationInsightsComponentAvailableFeaturesInner;
import java.util.List;

/**
 * Type representing ApplicationInsightsComponentAvailableFeatures.
 */
public interface ApplicationInsightsComponentAvailableFeatures extends HasInner<ApplicationInsightsComponentAvailableFeaturesInner>, HasManager<InsightsManager> {
    /**
     * @return the result value.
     */
    List<ApplicationInsightsComponentFeature> result();

}
