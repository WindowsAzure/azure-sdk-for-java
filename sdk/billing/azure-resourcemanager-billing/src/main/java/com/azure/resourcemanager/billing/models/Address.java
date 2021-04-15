// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Address. */
public interface Address {
    /**
     * Validates an address. Use the operation to validate an address before using it as soldTo or a billTo address.
     *
     * @param address Address details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the address validation.
     */
    ValidateAddressResponse validate(AddressDetails address);

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
    Response<ValidateAddressResponse> validateWithResponse(AddressDetails address, Context context);
}
