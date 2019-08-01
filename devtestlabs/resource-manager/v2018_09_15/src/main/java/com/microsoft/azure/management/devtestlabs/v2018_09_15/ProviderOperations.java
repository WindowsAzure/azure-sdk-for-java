/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.ProviderOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProviderOperations.
 */
public interface ProviderOperations extends HasInner<ProviderOperationsInner> {
    /**
     * Result of the request to list REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationMetadata> listAsync();

}
