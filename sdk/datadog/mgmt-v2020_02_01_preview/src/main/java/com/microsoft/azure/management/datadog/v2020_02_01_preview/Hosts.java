/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import rx.Observable;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.HostsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Hosts.
 */
public interface Hosts extends HasInner<HostsInner> {
    /**
     * List the hosts for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatadogHost> listAsync(final String resourceGroupName, final String monitorName);

}
