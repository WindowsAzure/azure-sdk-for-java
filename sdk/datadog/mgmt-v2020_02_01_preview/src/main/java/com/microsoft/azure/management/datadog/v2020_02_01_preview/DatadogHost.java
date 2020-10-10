/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.DatadogManager;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.DatadogHostInner;
import java.util.List;

/**
 * Type representing DatadogHost.
 */
public interface DatadogHost extends HasInner<DatadogHostInner>, HasManager<DatadogManager> {
    /**
     * @return the aliases value.
     */
    List<String> aliases();

    /**
     * @return the apps value.
     */
    List<String> apps();

    /**
     * @return the meta value.
     */
    DatadogHostMetadata meta();

    /**
     * @return the name value.
     */
    String name();

}
