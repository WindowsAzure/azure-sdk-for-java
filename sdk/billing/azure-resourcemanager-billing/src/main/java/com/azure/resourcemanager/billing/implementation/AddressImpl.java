// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.AddressClient;
import com.azure.resourcemanager.billing.fluent.models.ValidateAddressResponseInner;
import com.azure.resourcemanager.billing.models.Address;
import com.azure.resourcemanager.billing.models.AddressDetails;
import com.azure.resourcemanager.billing.models.ValidateAddressResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AddressImpl implements Address {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddressImpl.class);

    private final AddressClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public AddressImpl(AddressClient innerClient, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ValidateAddressResponse validate(AddressDetails address) {
        ValidateAddressResponseInner inner = this.serviceClient().validate(address);
        if (inner != null) {
            return new ValidateAddressResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateAddressResponse> validateWithResponse(AddressDetails address, Context context) {
        Response<ValidateAddressResponseInner> inner = this.serviceClient().validateWithResponse(address, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateAddressResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private AddressClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
