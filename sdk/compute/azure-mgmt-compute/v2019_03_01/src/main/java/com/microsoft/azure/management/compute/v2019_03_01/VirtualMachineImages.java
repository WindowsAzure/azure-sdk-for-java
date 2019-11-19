/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import rx.Observable;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineImageResource;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineImage;

/**
 * Type representing VirtualMachineImages.
 */
public interface VirtualMachineImages {
    /**
     * Gets a list of virtual machine image publishers for the specified Azure location.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImageResource> listPublishersAsync(String location);

    /**
     * Gets a virtual machine image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImage> getAsync(String location, String publisherName, String offer, String skus, String version);

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImage> listAsync(String location, String publisherName, String offer, String skus);

    /**
     * Gets a list of virtual machine image offers for the specified location and publisher.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImageResource> listOffersAsync(String location, String publisherName);

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImageResource> listSkusAsync(String location, String publisherName, String offer);

}
