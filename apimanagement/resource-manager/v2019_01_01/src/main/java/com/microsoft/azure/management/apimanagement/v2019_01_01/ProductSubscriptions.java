/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ProductSubscriptionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProductSubscriptions.
 */
public interface ProductSubscriptions extends HasInner<ProductSubscriptionsInner> {
    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductSubscriptionContract> listAsync(final String resourceGroupName, final String serviceName, final String productId);

}
