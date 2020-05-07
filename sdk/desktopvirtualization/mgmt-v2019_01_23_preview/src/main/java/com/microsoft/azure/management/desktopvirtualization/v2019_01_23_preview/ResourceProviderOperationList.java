/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation.DesktopVirtualizationManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation.ResourceProviderOperationListInner;
import java.util.List;

/**
 * Type representing ResourceProviderOperationList.
 */
public interface ResourceProviderOperationList extends HasInner<ResourceProviderOperationListInner>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the value value.
     */
    List<ResourceProviderOperation> value();

}
