/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.implementation.SubscriptionOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SubscriptionOperations.
 */
public interface SubscriptionOperations extends HasInner<SubscriptionOperationsInner> {
    /**
     * Get the status of the pending Microsoft.Subscription API operations.
     *
     * @param operationId The operation ID, which can be found from the Location field in the generate recommendation response header.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SubscriptionCreationResult> getAsync(String operationId);

}
