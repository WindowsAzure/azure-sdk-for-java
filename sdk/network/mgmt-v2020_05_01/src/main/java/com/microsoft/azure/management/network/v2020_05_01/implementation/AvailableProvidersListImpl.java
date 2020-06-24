/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.AvailableProvidersList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.AvailableProvidersListCountry;

class AvailableProvidersListImpl extends WrapperImpl<AvailableProvidersListInner> implements AvailableProvidersList {
    private final NetworkManager manager;
    AvailableProvidersListImpl(AvailableProvidersListInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<AvailableProvidersListCountry> countries() {
        return this.inner().countries();
    }

}
