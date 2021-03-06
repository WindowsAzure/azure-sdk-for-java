/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import rx.Observable;
import com.microsoft.azure.management.resourcemover.v2021_01_01.implementation.OperationsDiscoverysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing OperationsDiscoverys.
 */
public interface OperationsDiscoverys extends HasInner<OperationsDiscoverysInner> {
    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationsDiscoveryCollection> getAsync();

}
