/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.keyvault.v2016_10_01.Locations;
import com.microsoft.azure.management.keyvault.v2016_10_01.DeletedVaults;

class LocationsImpl extends WrapperImpl<VaultsInner> implements Locations {
    private final KeyVaultManager manager;

    LocationsImpl(KeyVaultManager manager) {
        super(manager.inner().vaults());
        this.manager = manager;
    }

    @Override
    public DeletedVaults deletedVaults() {
        DeletedVaults accessor = this.manager().deletedVaults();
        return accessor;
    }

    public KeyVaultManager manager() {
        return this.manager;
    }

}
