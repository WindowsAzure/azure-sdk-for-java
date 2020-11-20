/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2018_09_15.VirtualNetwork;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.VirtualNetworkFragment;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Subnet;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ExternalSubnet;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.SubnetOverride;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.SubnetFragment;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.SubnetOverrideFragment;
import rx.functions.Func1;

class VirtualNetworkImpl extends CreatableUpdatableImpl<VirtualNetwork, VirtualNetworkInner, VirtualNetworkImpl> implements VirtualNetwork, VirtualNetwork.Definition, VirtualNetwork.Update {
    private final DevTestLabsManager manager;
    private String resourceGroupName;
    private String labName;
    private String name;
    private VirtualNetworkFragment updateParameter;

    VirtualNetworkImpl(String name, DevTestLabsManager manager) {
        super(name, new VirtualNetworkInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new VirtualNetworkFragment();
    }

    VirtualNetworkImpl(VirtualNetworkInner inner, DevTestLabsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualnetworks");
        //
        this.updateParameter = new VirtualNetworkFragment();
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualNetwork> createResourceAsync() {
        VirtualNetworksInner client = this.manager().inner().virtualNetworks();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(new Func1<VirtualNetworkInner, VirtualNetworkInner>() {
               @Override
               public VirtualNetworkInner call(VirtualNetworkInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetwork> updateResourceAsync() {
        VirtualNetworksInner client = this.manager().inner().virtualNetworks();
        return client.updateAsync(this.resourceGroupName, this.labName, this.name, this.updateParameter)
            .map(new Func1<VirtualNetworkInner, VirtualNetworkInner>() {
               @Override
               public VirtualNetworkInner call(VirtualNetworkInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkInner> getInnerAsync() {
        VirtualNetworksInner client = this.manager().inner().virtualNetworks();
        return client.getAsync(this.resourceGroupName, this.labName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new VirtualNetworkFragment();
    }

    @Override
    public List<Subnet> allowedSubnets() {
        return this.inner().allowedSubnets();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String externalProviderResourceId() {
        return this.inner().externalProviderResourceId();
    }

    @Override
    public List<ExternalSubnet> externalSubnets() {
        return this.inner().externalSubnets();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<SubnetOverride> subnetOverrides() {
        return this.inner().subnetOverrides();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public VirtualNetworkImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    @Override
    public VirtualNetworkImpl withAllowedSubnets(List<Subnet> allowedSubnets) {
        this.inner().withAllowedSubnets(allowedSubnets);
        return this;
    }

    @Override
    public VirtualNetworkImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VirtualNetworkImpl withSubnetOverrides(List<SubnetOverride> subnetOverrides) {
        this.inner().withSubnetOverrides(subnetOverrides);
        return this;
    }

    @Override
    public VirtualNetworkImpl withAllowedSubnets(List<SubnetFragment> allowedSubnets) {
        this.updateParameter.withAllowedSubnets(allowedSubnets);
        return this;
    }

    @Override
    public VirtualNetworkImpl withSubnetOverrides(List<SubnetOverrideFragment> subnetOverrides) {
        this.updateParameter.withSubnetOverrides(subnetOverrides);
        return this;
    }

    @Override
    public VirtualNetworkImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public VirtualNetworkImpl withExternalProviderResourceId(String externalProviderResourceId) {
        if (isInCreateMode()) {
            this.inner().withExternalProviderResourceId(externalProviderResourceId);
        } else {
            this.updateParameter.withExternalProviderResourceId(externalProviderResourceId);
        }
        return this;
    }

    @Override
    public VirtualNetworkImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
