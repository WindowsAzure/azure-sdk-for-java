// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of DevicesForHubs. */
public interface DevicesForHubs {
    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    PagedIterable<Device> list(String resourceId);

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param deviceManagementType Get devices only from specific type, Managed or Unmanaged.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    PagedIterable<Device> list(
        String resourceId, Integer limit, String skipToken, ManagementState deviceManagementType, Context context);
}
