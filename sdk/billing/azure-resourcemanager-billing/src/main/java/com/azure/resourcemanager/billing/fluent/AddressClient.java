// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.ValidateAddressResponseInner;
import com.azure.resourcemanager.billing.models.AddressDetails;

/** An instance of this class provides access to all the operations defined in AddressClient. */
public interface AddressClient {
    /**
     * Validates an address. Use the operation to validate an address before using it as soldTo or a billTo address.
     *
     * @param address Address details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the address validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateAddressResponseInner validate(AddressDetails address);

    /**
     * Validates an address. Use the operation to validate an address before using it as soldTo or a billTo address.
     *
     * @param address Address details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the address validation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateAddressResponseInner> validateWithResponse(AddressDetails address, Context context);
}
