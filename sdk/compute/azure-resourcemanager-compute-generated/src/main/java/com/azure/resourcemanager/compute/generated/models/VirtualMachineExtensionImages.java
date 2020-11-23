// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of VirtualMachineExtensionImages. */
public interface VirtualMachineExtensionImages {
    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    VirtualMachineExtensionImage get(String location, String publisherName, String type, String version);

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    Response<VirtualMachineExtensionImage> getWithResponse(
        String location, String publisherName, String type, String version, Context context);

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    List<VirtualMachineExtensionImage> listTypes(String location, String publisherName);

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    Response<List<VirtualMachineExtensionImage>> listTypesWithResponse(
        String location, String publisherName, Context context);

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    List<VirtualMachineExtensionImage> listVersions(String location, String publisherName, String type);

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param filter The filter to apply on the operation.
     * @param top The top parameter.
     * @param orderby The orderby parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    Response<List<VirtualMachineExtensionImage>> listVersionsWithResponse(
        String location,
        String publisherName,
        String type,
        String filter,
        Integer top,
        String orderby,
        Context context);
}
