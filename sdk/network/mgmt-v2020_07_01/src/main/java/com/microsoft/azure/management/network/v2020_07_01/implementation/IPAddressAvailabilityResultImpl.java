/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.IPAddressAvailabilityResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class IPAddressAvailabilityResultImpl extends WrapperImpl<IPAddressAvailabilityResultInner> implements IPAddressAvailabilityResult {
    private final NetworkManager manager;
    IPAddressAvailabilityResultImpl(IPAddressAvailabilityResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Boolean available() {
        return this.inner().available();
    }

    @Override
    public List<String> availableIPAddresses() {
        return this.inner().availableIPAddresses();
    }

}
