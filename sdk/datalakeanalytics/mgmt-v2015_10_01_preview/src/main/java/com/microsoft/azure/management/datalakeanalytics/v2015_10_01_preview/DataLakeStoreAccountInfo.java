/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.DataLakeStoreAccountInfoInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.DataLakeAnalyticsManager;

/**
 * Type representing DataLakeStoreAccountInfo.
 */
public interface DataLakeStoreAccountInfo extends HasInner<DataLakeStoreAccountInfoInner>, HasManager<DataLakeAnalyticsManager> {
    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    DataLakeStoreAccountInfoProperties properties();

}
