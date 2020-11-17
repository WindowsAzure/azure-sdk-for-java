/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview;

import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation.MsixImagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing MsixImages.
 */
public interface MsixImages extends HasInner<MsixImagesInner> {
    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpandMsixImage> expandAsync(final String resourceGroupName, final String hostPoolName);

}
