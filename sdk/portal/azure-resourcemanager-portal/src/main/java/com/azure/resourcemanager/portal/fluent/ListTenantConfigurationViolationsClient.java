// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.portal.fluent.models.ViolationInner;

/**
 * An instance of this class provides access to all the operations defined in ListTenantConfigurationViolationsClient.
 */
public interface ListTenantConfigurationViolationsClient {
    /**
     * Gets list of items that violate tenant's configuration.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of items that violate tenant's configuration.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ViolationInner> list();

    /**
     * Gets list of items that violate tenant's configuration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of items that violate tenant's configuration.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ViolationInner> list(Context context);
}
