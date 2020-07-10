/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ClientDiscoveryValueForSingleApi;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ClientDiscoveryDisplay;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ClientDiscoveryForProperties;

class ClientDiscoveryValueForSingleApiImpl extends WrapperImpl<ClientDiscoveryValueForSingleApiInner> implements ClientDiscoveryValueForSingleApi {
    private final RecoveryServicesManager manager;
    ClientDiscoveryValueForSingleApiImpl(ClientDiscoveryValueForSingleApiInner inner, RecoveryServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public ClientDiscoveryDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public ClientDiscoveryForProperties properties() {
        return this.inner().properties();
    }

}
