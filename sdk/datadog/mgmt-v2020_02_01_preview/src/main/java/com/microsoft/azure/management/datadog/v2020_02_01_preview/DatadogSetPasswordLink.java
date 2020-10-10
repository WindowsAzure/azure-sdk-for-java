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
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.DatadogSetPasswordLinkInner;

/**
 * Type representing DatadogSetPasswordLink.
 */
public interface DatadogSetPasswordLink extends HasInner<DatadogSetPasswordLinkInner>, HasManager<DatadogManager> {
    /**
     * @return the setPasswordLink value.
     */
    String setPasswordLink();

}
