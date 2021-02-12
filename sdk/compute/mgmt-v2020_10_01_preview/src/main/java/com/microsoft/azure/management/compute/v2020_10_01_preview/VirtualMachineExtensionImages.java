/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineExtensionImage;

/**
 * Type representing VirtualMachineExtensionImages.
 */
public interface VirtualMachineExtensionImages {
    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineExtensionImage> getAsync(String location, String publisherName, String type, String version);

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName the String value
     * @param type the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineExtensionImage> listVersionsAsync(String location, String publisherName, String type);

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineExtensionImage> listTypesAsync(String location, String publisherName);

}
