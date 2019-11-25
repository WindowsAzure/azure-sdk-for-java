/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2017_10_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.storage.v2017_10_01.StorageAccount;
import rx.Observable;
import com.microsoft.azure.management.storage.v2017_10_01.StorageAccountUpdateParameters;
import com.microsoft.azure.management.storage.v2017_10_01.StorageAccountCreateParameters;
import com.microsoft.azure.management.storage.v2017_10_01.AccessTier;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2017_10_01.CustomDomain;
import com.microsoft.azure.management.storage.v2017_10_01.Encryption;
import com.microsoft.azure.management.storage.v2017_10_01.Identity;
import com.microsoft.azure.management.storage.v2017_10_01.Kind;
import com.microsoft.azure.management.storage.v2017_10_01.NetworkRuleSet;
import com.microsoft.azure.management.storage.v2017_10_01.Endpoints;
import com.microsoft.azure.management.storage.v2017_10_01.ProvisioningState;
import com.microsoft.azure.management.storage.v2017_10_01.Sku;
import com.microsoft.azure.management.storage.v2017_10_01.AccountStatus;
import rx.functions.Func1;

class StorageAccountImpl extends GroupableResourceCoreImpl<StorageAccount, StorageAccountInner, StorageAccountImpl, StorageManager> implements StorageAccount, StorageAccount.Definition, StorageAccount.Update {
    private StorageAccountCreateParameters createParameter;
    private StorageAccountUpdateParameters updateParameter;
    StorageAccountImpl(String name, StorageAccountInner inner, StorageManager manager) {
        super(name, inner, manager);
        this.createParameter = new StorageAccountCreateParameters();
        this.updateParameter = new StorageAccountUpdateParameters();
    }

    @Override
    public Observable<StorageAccount> createResourceAsync() {
        StorageAccountsInner client = this.manager().inner().storageAccounts();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<StorageAccountInner, StorageAccountInner>() {
               @Override
               public StorageAccountInner call(StorageAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StorageAccount> updateResourceAsync() {
        StorageAccountsInner client = this.manager().inner().storageAccounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<StorageAccountInner, StorageAccountInner>() {
               @Override
               public StorageAccountInner call(StorageAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StorageAccountInner> getInnerAsync() {
        StorageAccountsInner client = this.manager().inner().storageAccounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new StorageAccountCreateParameters();
        this.updateParameter = new StorageAccountUpdateParameters();
    }

    @Override
    public AccessTier accessTier() {
        return this.inner().accessTier();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public CustomDomain customDomain() {
        return this.inner().customDomain();
    }

    @Override
    public Boolean enableHttpsTrafficOnly() {
        return this.inner().enableHttpsTrafficOnly();
    }

    @Override
    public Encryption encryption() {
        return this.inner().encryption();
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public DateTime lastGeoFailoverTime() {
        return this.inner().lastGeoFailoverTime();
    }

    @Override
    public NetworkRuleSet networkRuleSet() {
        return this.inner().networkRuleSet();
    }

    @Override
    public Endpoints primaryEndpoints() {
        return this.inner().primaryEndpoints();
    }

    @Override
    public String primaryLocation() {
        return this.inner().primaryLocation();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Endpoints secondaryEndpoints() {
        return this.inner().secondaryEndpoints();
    }

    @Override
    public String secondaryLocation() {
        return this.inner().secondaryLocation();
    }

    @Override
    public Sku sku() {
        SkuInner inner = this.inner().sku();
        if (inner != null) {
            return  new SkuImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public AccountStatus statusOfPrimary() {
        return this.inner().statusOfPrimary();
    }

    @Override
    public AccountStatus statusOfSecondary() {
        return this.inner().statusOfSecondary();
    }

    @Override
    public StorageAccountImpl withKind(Kind kind) {
        if (isInCreateMode()) {
            this.createParameter.withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withSku(SkuInner sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withAccessTier(AccessTier accessTier) {
        if (isInCreateMode()) {
            this.createParameter.withAccessTier(accessTier);
        } else {
            this.updateParameter.withAccessTier(accessTier);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withCustomDomain(CustomDomain customDomain) {
        if (isInCreateMode()) {
            this.createParameter.withCustomDomain(customDomain);
        } else {
            this.updateParameter.withCustomDomain(customDomain);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        if (isInCreateMode()) {
            this.createParameter.withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        } else {
            this.updateParameter.withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withEncryption(Encryption encryption) {
        if (isInCreateMode()) {
            this.createParameter.withEncryption(encryption);
        } else {
            this.updateParameter.withEncryption(encryption);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.createParameter.withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (isInCreateMode()) {
            this.createParameter.withNetworkRuleSet(networkRuleSet);
        } else {
            this.updateParameter.withNetworkRuleSet(networkRuleSet);
        }
        return this;
    }

}
