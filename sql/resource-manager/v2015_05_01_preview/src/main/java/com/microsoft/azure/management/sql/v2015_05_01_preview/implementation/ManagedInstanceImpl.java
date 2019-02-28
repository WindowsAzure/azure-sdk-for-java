/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ManagedInstance;
import rx.Observable;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ManagedInstanceUpdate;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ResourceIdentity;
import com.microsoft.azure.management.sql.v2015_05_01_preview.Sku;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ManagedInstanceProxyOverride;
import rx.functions.Func1;

class ManagedInstanceImpl extends GroupableResourceCoreImpl<ManagedInstance, ManagedInstanceInner, ManagedInstanceImpl, SqlManager> implements ManagedInstance, ManagedInstance.Definition, ManagedInstance.Update {
    private ManagedInstanceUpdate updateParameter;
    ManagedInstanceImpl(String name, ManagedInstanceInner inner, SqlManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ManagedInstanceUpdate();
    }

    @Override
    public Observable<ManagedInstance> createResourceAsync() {
        ManagedInstancesInner client = this.manager().inner().managedInstances();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ManagedInstanceInner, ManagedInstanceInner>() {
               @Override
               public ManagedInstanceInner call(ManagedInstanceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagedInstance> updateResourceAsync() {
        ManagedInstancesInner client = this.manager().inner().managedInstances();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ManagedInstanceInner, ManagedInstanceInner>() {
               @Override
               public ManagedInstanceInner call(ManagedInstanceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagedInstanceInner> getInnerAsync() {
        ManagedInstancesInner client = this.manager().inner().managedInstances();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ManagedInstanceUpdate();
    }

    @Override
    public String administratorLogin() {
        return this.inner().administratorLogin();
    }

    @Override
    public String administratorLoginPassword() {
        return this.inner().administratorLoginPassword();
    }

    @Override
    public String collation() {
        return this.inner().collation();
    }

    @Override
    public String dnsZone() {
        return this.inner().dnsZone();
    }

    @Override
    public String dnsZonePartner() {
        return this.inner().dnsZonePartner();
    }

    @Override
    public String fullyQualifiedDomainName() {
        return this.inner().fullyQualifiedDomainName();
    }

    @Override
    public ResourceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public String licenseType() {
        return this.inner().licenseType();
    }

    @Override
    public ManagedInstanceProxyOverride proxyOverride() {
        return this.inner().proxyOverride();
    }

    @Override
    public Boolean publicDataEndpointEnabled() {
        return this.inner().publicDataEndpointEnabled();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

    @Override
    public Integer storageSizeInGB() {
        return this.inner().storageSizeInGB();
    }

    @Override
    public String subnetId() {
        return this.inner().subnetId();
    }

    @Override
    public String timezoneId() {
        return this.inner().timezoneId();
    }

    @Override
    public Integer vCores() {
        return this.inner().vCores();
    }

    @Override
    public ManagedInstanceImpl withIdentity(ResourceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ManagedInstanceImpl withAdministratorLogin(String administratorLogin) {
        if (isInCreateMode()) {
            this.inner().withAdministratorLogin(administratorLogin);
        } else {
            this.updateParameter.withAdministratorLogin(administratorLogin);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withAdministratorLoginPassword(String administratorLoginPassword) {
        if (isInCreateMode()) {
            this.inner().withAdministratorLoginPassword(administratorLoginPassword);
        } else {
            this.updateParameter.withAdministratorLoginPassword(administratorLoginPassword);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withCollation(String collation) {
        if (isInCreateMode()) {
            this.inner().withCollation(collation);
        } else {
            this.updateParameter.withCollation(collation);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withDnsZonePartner(String dnsZonePartner) {
        if (isInCreateMode()) {
            this.inner().withDnsZonePartner(dnsZonePartner);
        } else {
            this.updateParameter.withDnsZonePartner(dnsZonePartner);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withLicenseType(String licenseType) {
        if (isInCreateMode()) {
            this.inner().withLicenseType(licenseType);
        } else {
            this.updateParameter.withLicenseType(licenseType);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withProxyOverride(ManagedInstanceProxyOverride proxyOverride) {
        if (isInCreateMode()) {
            this.inner().withProxyOverride(proxyOverride);
        } else {
            this.updateParameter.withProxyOverride(proxyOverride);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled) {
        if (isInCreateMode()) {
            this.inner().withPublicDataEndpointEnabled(publicDataEndpointEnabled);
        } else {
            this.updateParameter.withPublicDataEndpointEnabled(publicDataEndpointEnabled);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withStorageSizeInGB(Integer storageSizeInGB) {
        if (isInCreateMode()) {
            this.inner().withStorageSizeInGB(storageSizeInGB);
        } else {
            this.updateParameter.withStorageSizeInGB(storageSizeInGB);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withSubnetId(String subnetId) {
        if (isInCreateMode()) {
            this.inner().withSubnetId(subnetId);
        } else {
            this.updateParameter.withSubnetId(subnetId);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withTimezoneId(String timezoneId) {
        if (isInCreateMode()) {
            this.inner().withTimezoneId(timezoneId);
        } else {
            this.updateParameter.withTimezoneId(timezoneId);
        }
        return this;
    }

    @Override
    public ManagedInstanceImpl withVCores(Integer vCores) {
        if (isInCreateMode()) {
            this.inner().withVCores(vCores);
        } else {
            this.updateParameter.withVCores(vCores);
        }
        return this;
    }

}
