/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.LogAnalyticsManager;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.SearchGetSchemaResponseInner;
import java.util.List;

/**
 * Type representing SearchGetSchemaResponse.
 */
public interface SearchGetSchemaResponse extends HasInner<SearchGetSchemaResponseInner>, HasManager<LogAnalyticsManager> {
    /**
     * @return the metadata value.
     */
    SearchMetadata metadata();

    /**
     * @return the value value.
     */
    List<SearchSchemaValue> value();

}
