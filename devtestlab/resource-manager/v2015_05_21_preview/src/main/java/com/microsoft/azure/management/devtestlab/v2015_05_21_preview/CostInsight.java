/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation.CostInsightInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation.DevTestLabManager;
import java.util.Map;
import java.util.List;

/**
 * Type representing CostInsight.
 */
public interface CostInsight extends HasInner<CostInsightInner>, Indexable, Refreshable<CostInsight>, HasManager<DevTestLabManager> {
    /**
     * @return the currencyCode value.
     */
    String currencyCode();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vmCosts value.
     */
    List<VMCostProperties> vmCosts();

}
