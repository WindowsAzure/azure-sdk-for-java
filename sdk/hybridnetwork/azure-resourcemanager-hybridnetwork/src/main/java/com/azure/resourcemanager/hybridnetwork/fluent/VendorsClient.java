// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorInner;

/** An instance of this class provides access to all the operations defined in VendorsClient. */
public interface VendorsClient {
    /**
     * Deletes the specified vendor.
     *
     * @param vendorName The name of the vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String vendorName);

    /**
     * Deletes the specified vendor.
     *
     * @param vendorName The name of the vendor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String vendorName, Context context);

    /**
     * Deletes the specified vendor.
     *
     * @param vendorName The name of the vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String vendorName);

    /**
     * Deletes the specified vendor.
     *
     * @param vendorName The name of the vendor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String vendorName, Context context);

    /**
     * Gets information about the specified vendor.
     *
     * @param vendorName The name of the vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified vendor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorInner get(String vendorName);

    /**
     * Gets information about the specified vendor.
     *
     * @param vendorName The name of the vendor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified vendor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VendorInner> getWithResponse(String vendorName, Context context);

    /**
     * Creates or updates a vendor.
     *
     * @param vendorName The name of the vendor.
     * @param parameters Parameters supplied to the create vendor operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vendor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VendorInner>, VendorInner> beginCreateOrUpdate(String vendorName, VendorInner parameters);

    /**
     * Creates or updates a vendor.
     *
     * @param vendorName The name of the vendor.
     * @param parameters Parameters supplied to the create vendor operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vendor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VendorInner>, VendorInner> beginCreateOrUpdate(
        String vendorName, VendorInner parameters, Context context);

    /**
     * Creates or updates a vendor.
     *
     * @param vendorName The name of the vendor.
     * @param parameters Parameters supplied to the create vendor operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vendor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorInner createOrUpdate(String vendorName, VendorInner parameters);

    /**
     * Creates or updates a vendor.
     *
     * @param vendorName The name of the vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vendor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorInner createOrUpdate(String vendorName);

    /**
     * Creates or updates a vendor.
     *
     * @param vendorName The name of the vendor.
     * @param parameters Parameters supplied to the create vendor operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vendor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VendorInner createOrUpdate(String vendorName, VendorInner parameters, Context context);

    /**
     * Lists all the vendors in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for vendors API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VendorInner> list();

    /**
     * Lists all the vendors in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for vendors API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VendorInner> list(Context context);
}
