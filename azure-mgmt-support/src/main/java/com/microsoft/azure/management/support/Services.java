/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support;

import rx.Observable;
import com.microsoft.azure.management.support.implementation.ServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Services.
 */
public interface Services extends HasInner<ServicesInner> {
    /**
     * Gets a specific Azure service available for support.
     *
     * @param serviceName Name of Azure service available for support
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Service> getAsync(String serviceName);

    /**
     * List all the Azure services available for support.
     * List all the Azure services available for support. This includes **Billing**, **Subscription Management**, **Service and subscription limits (quotas)** and all **technical** services. User must provide the id of the Azure service when creating a support ticket. &lt;br/&gt;For Billing, the id is '/providers/Microsoft.Support/services/517f2da6-78fd-0498-4e22-ad26996b1dfc'. &lt;br/&gt;For Subscription Management, the id is '/providers/Microsoft.Support/services/f3dc5421-79ef-1efa-41a5-42bf3cbb52c6'. &lt;br/&gt;For Quota, the id is '/providers/Microsoft.Support/services/06bfd9d3-516b-d5c6-5802-169c800dec89' and rest of the ids are for technical services.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Service> listAsync();

}
