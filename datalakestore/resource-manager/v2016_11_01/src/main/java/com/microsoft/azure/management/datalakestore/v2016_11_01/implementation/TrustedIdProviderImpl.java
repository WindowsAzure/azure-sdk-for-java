/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01.implementation;

import com.microsoft.azure.management.datalakestore.v2016_11_01.TrustedIdProvider;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.datalakestore.v2016_11_01.UpdateTrustedIdProviderParameters;
import com.microsoft.azure.management.datalakestore.v2016_11_01.CreateOrUpdateTrustedIdProviderParameters;
import rx.functions.Func1;

class TrustedIdProviderImpl extends CreatableUpdatableImpl<TrustedIdProvider, TrustedIdProviderInner, TrustedIdProviderImpl> implements TrustedIdProvider, TrustedIdProvider.Definition, TrustedIdProvider.Update {
    private final DataLakeStoreManager manager;
    private String resourceGroupName;
    private String accountName;
    private String trustedIdProviderName;
    private CreateOrUpdateTrustedIdProviderParameters createParameter;
    private UpdateTrustedIdProviderParameters updateParameter;

    TrustedIdProviderImpl(String name, DataLakeStoreManager manager) {
        super(name, new TrustedIdProviderInner());
        this.manager = manager;
        // Set resource name
        this.trustedIdProviderName = name;
        //
        this.createParameter = new CreateOrUpdateTrustedIdProviderParameters();
        this.updateParameter = new UpdateTrustedIdProviderParameters();
    }

    TrustedIdProviderImpl(TrustedIdProviderInner inner, DataLakeStoreManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.trustedIdProviderName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "accounts");
        this.trustedIdProviderName = IdParsingUtils.getValueFromIdByName(inner.id(), "trustedIdProviders");
        //
        this.createParameter = new CreateOrUpdateTrustedIdProviderParameters();
        this.updateParameter = new UpdateTrustedIdProviderParameters();
    }

    @Override
    public DataLakeStoreManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TrustedIdProvider> createResourceAsync() {
        TrustedIdProvidersInner client = this.manager().inner().trustedIdProviders();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.trustedIdProviderName, this.createParameter)
            .map(new Func1<TrustedIdProviderInner, TrustedIdProviderInner>() {
               @Override
               public TrustedIdProviderInner call(TrustedIdProviderInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<TrustedIdProvider> updateResourceAsync() {
        TrustedIdProvidersInner client = this.manager().inner().trustedIdProviders();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.trustedIdProviderName, this.updateParameter)
            .map(new Func1<TrustedIdProviderInner, TrustedIdProviderInner>() {
               @Override
               public TrustedIdProviderInner call(TrustedIdProviderInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TrustedIdProviderInner> getInnerAsync() {
        TrustedIdProvidersInner client = this.manager().inner().trustedIdProviders();
        return client.getAsync(this.resourceGroupName, this.accountName, this.trustedIdProviderName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new CreateOrUpdateTrustedIdProviderParameters();
        this.updateParameter = new UpdateTrustedIdProviderParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String idProvider() {
        return this.inner().idProvider();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TrustedIdProviderImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public TrustedIdProviderImpl withIdProvider(String idProvider) {
        if (isInCreateMode()) {
            this.createParameter.withIdProvider(idProvider);
        } else {
            this.updateParameter.withIdProvider(idProvider);
        }
        return this;
    }

}
