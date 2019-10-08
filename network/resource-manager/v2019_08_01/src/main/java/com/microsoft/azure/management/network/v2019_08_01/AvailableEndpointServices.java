/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_08_01.implementation.AvailableEndpointServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AvailableEndpointServices.
 */
public interface AvailableEndpointServices extends HasInner<AvailableEndpointServicesInner> {
    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EndpointServiceResult> listAsync(final String location);

}
