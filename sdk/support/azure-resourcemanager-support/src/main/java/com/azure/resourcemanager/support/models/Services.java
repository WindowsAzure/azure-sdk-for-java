// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Services. */
public interface Services {
    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources.
     */
    PagedIterable<Service> list();

    /**
     * Lists all the Azure services available for support ticket creation. For **Technical** issues, select the Service
     * Id that maps to the Azure service/product as displayed in the **Services** drop-down list on the Azure portal's
     * [New support request](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/overview) page.
     * Always use the service and its corresponding problem classification(s) obtained programmatically for support
     * ticket creation. This practice ensures that you always have the most recent set of service and problem
     * classification Ids.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Service resources.
     */
    PagedIterable<Service> list(Context context);

    /**
     * Gets a specific Azure service for support ticket creation.
     *
     * @param serviceName Name of the Azure service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Azure service for support ticket creation.
     */
    Service get(String serviceName);

    /**
     * Gets a specific Azure service for support ticket creation.
     *
     * @param serviceName Name of the Azure service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific Azure service for support ticket creation.
     */
    Response<Service> getWithResponse(String serviceName, Context context);
}
