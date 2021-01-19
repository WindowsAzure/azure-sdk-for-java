/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_07_01.NetworkVirtualAppliance;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.VirtualApplianceSkuProperties;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_07_01.VirtualApplianceNicProperties;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_07_01.ManagedServiceIdentity;

class NetworkVirtualApplianceImpl extends GroupableResourceCoreImpl<NetworkVirtualAppliance, NetworkVirtualApplianceInner, NetworkVirtualApplianceImpl, NetworkManager> implements NetworkVirtualAppliance, NetworkVirtualAppliance.Definition, NetworkVirtualAppliance.Update {
    NetworkVirtualApplianceImpl(String name, NetworkVirtualApplianceInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<NetworkVirtualAppliance> createResourceAsync() {
        NetworkVirtualAppliancesInner client = this.manager().inner().networkVirtualAppliances();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NetworkVirtualAppliance> updateResourceAsync() {
        NetworkVirtualAppliancesInner client = this.manager().inner().networkVirtualAppliances();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkVirtualApplianceInner> getInnerAsync() {
        NetworkVirtualAppliancesInner client = this.manager().inner().networkVirtualAppliances();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String addressPrefix() {
        return this.inner().addressPrefix();
    }

    @Override
    public List<String> bootStrapConfigurationBlobs() {
        return this.inner().bootStrapConfigurationBlobs();
    }

    @Override
    public String cloudInitConfiguration() {
        return this.inner().cloudInitConfiguration();
    }

    @Override
    public List<String> cloudInitConfigurationBlobs() {
        return this.inner().cloudInitConfigurationBlobs();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public List<SubResource> inboundSecurityRules() {
        return this.inner().inboundSecurityRules();
    }

    @Override
    public VirtualApplianceSkuProperties nvaSku() {
        return this.inner().nvaSku();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Long virtualApplianceAsn() {
        return this.inner().virtualApplianceAsn();
    }

    @Override
    public List<VirtualApplianceNicProperties> virtualApplianceNics() {
        return this.inner().virtualApplianceNics();
    }

    @Override
    public List<SubResource> virtualApplianceSites() {
        return this.inner().virtualApplianceSites();
    }

    @Override
    public SubResource virtualHub() {
        return this.inner().virtualHub();
    }

    @Override
    public NetworkVirtualApplianceImpl withBootStrapConfigurationBlobs(List<String> bootStrapConfigurationBlobs) {
        this.inner().withBootStrapConfigurationBlobs(bootStrapConfigurationBlobs);
        return this;
    }

    @Override
    public NetworkVirtualApplianceImpl withCloudInitConfiguration(String cloudInitConfiguration) {
        this.inner().withCloudInitConfiguration(cloudInitConfiguration);
        return this;
    }

    @Override
    public NetworkVirtualApplianceImpl withCloudInitConfigurationBlobs(List<String> cloudInitConfigurationBlobs) {
        this.inner().withCloudInitConfigurationBlobs(cloudInitConfigurationBlobs);
        return this;
    }

    @Override
    public NetworkVirtualApplianceImpl withIdentity(ManagedServiceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public NetworkVirtualApplianceImpl withNvaSku(VirtualApplianceSkuProperties nvaSku) {
        this.inner().withNvaSku(nvaSku);
        return this;
    }

    @Override
    public NetworkVirtualApplianceImpl withVirtualApplianceAsn(Long virtualApplianceAsn) {
        this.inner().withVirtualApplianceAsn(virtualApplianceAsn);
        return this;
    }

    @Override
    public NetworkVirtualApplianceImpl withVirtualHub(SubResource virtualHub) {
        this.inner().withVirtualHub(virtualHub);
        return this;
    }

}
