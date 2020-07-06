/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.ConfigurationStore;
import rx.Observable;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.ConfigurationStoreUpdateParameters;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.ResourceIdentity;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.ProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.EncryptionProperties;
import java.util.List;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.PrivateEndpointConnectionReference;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.PublicNetworkAccess;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.Sku;
import rx.functions.Func1;

class ConfigurationStoreImpl extends GroupableResourceCoreImpl<ConfigurationStore, ConfigurationStoreInner, ConfigurationStoreImpl, AppConfigurationManager> implements ConfigurationStore, ConfigurationStore.Definition, ConfigurationStore.Update {
    private ConfigurationStoreUpdateParameters updateParameter;
    ConfigurationStoreImpl(String name, ConfigurationStoreInner inner, AppConfigurationManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ConfigurationStoreUpdateParameters();
    }

    @Override
    public Observable<ConfigurationStore> createResourceAsync() {
        ConfigurationStoresInner client = this.manager().inner().configurationStores();
        return client.createAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ConfigurationStoreInner, ConfigurationStoreInner>() {
               @Override
               public ConfigurationStoreInner call(ConfigurationStoreInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ConfigurationStore> updateResourceAsync() {
        ConfigurationStoresInner client = this.manager().inner().configurationStores();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ConfigurationStoreInner, ConfigurationStoreInner>() {
               @Override
               public ConfigurationStoreInner call(ConfigurationStoreInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ConfigurationStoreInner> getInnerAsync() {
        ConfigurationStoresInner client = this.manager().inner().configurationStores();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ConfigurationStoreUpdateParameters();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public EncryptionProperties encryption() {
        return this.inner().encryption();
    }

    @Override
    public String endpoint() {
        return this.inner().endpoint();
    }

    @Override
    public ResourceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public List<PrivateEndpointConnectionReference> privateEndpointConnections() {
        return this.inner().privateEndpointConnections();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicNetworkAccess publicNetworkAccess() {
        return this.inner().publicNetworkAccess();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public ConfigurationStoreImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.inner().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    @Override
    public ConfigurationStoreImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public ConfigurationStoreImpl withEncryption(EncryptionProperties encryption) {
        if (isInCreateMode()) {
            this.inner().withEncryption(encryption);
        } else {
            this.updateParameter.withEncryption(encryption);
        }
        return this;
    }

    @Override
    public ConfigurationStoreImpl withIdentity(ResourceIdentity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

}
