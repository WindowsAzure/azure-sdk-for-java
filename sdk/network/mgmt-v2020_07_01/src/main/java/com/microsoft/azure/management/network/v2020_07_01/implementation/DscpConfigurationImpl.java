/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_07_01.DscpConfiguration;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_07_01.QosIpRange;
import com.microsoft.azure.management.network.v2020_07_01.QosPortRange;
import com.microsoft.azure.management.network.v2020_07_01.ProtocolType;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_07_01.NetworkInterface;

class DscpConfigurationImpl extends GroupableResourceCoreImpl<DscpConfiguration, DscpConfigurationInner, DscpConfigurationImpl, NetworkManager> implements DscpConfiguration, DscpConfiguration.Definition, DscpConfiguration.Update {
    DscpConfigurationImpl(String name, DscpConfigurationInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<DscpConfiguration> createResourceAsync() {
        DscpConfigurationsInner client = this.manager().inner().dscpConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DscpConfiguration> updateResourceAsync() {
        DscpConfigurationsInner client = this.manager().inner().dscpConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DscpConfigurationInner> getInnerAsync() {
        DscpConfigurationsInner client = this.manager().inner().dscpConfigurations();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<NetworkInterface> associatedNetworkInterfaces() {
        List<NetworkInterface> lst = new ArrayList<NetworkInterface>();
        if (this.inner().associatedNetworkInterfaces() != null) {
            for (NetworkInterfaceInner inner : this.inner().associatedNetworkInterfaces()) {
                lst.add( new NetworkInterfaceImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<QosIpRange> destinationIpRanges() {
        return this.inner().destinationIpRanges();
    }

    @Override
    public List<QosPortRange> destinationPortRanges() {
        return this.inner().destinationPortRanges();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<Integer> markings() {
        return this.inner().markings();
    }

    @Override
    public ProtocolType protocol() {
        return this.inner().protocol();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String qosCollectionId() {
        return this.inner().qosCollectionId();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public List<QosIpRange> sourceIpRanges() {
        return this.inner().sourceIpRanges();
    }

    @Override
    public List<QosPortRange> sourcePortRanges() {
        return this.inner().sourcePortRanges();
    }

    @Override
    public DscpConfigurationImpl withDestinationIpRanges(List<QosIpRange> destinationIpRanges) {
        this.inner().withDestinationIpRanges(destinationIpRanges);
        return this;
    }

    @Override
    public DscpConfigurationImpl withDestinationPortRanges(List<QosPortRange> destinationPortRanges) {
        this.inner().withDestinationPortRanges(destinationPortRanges);
        return this;
    }

    @Override
    public DscpConfigurationImpl withMarkings(List<Integer> markings) {
        this.inner().withMarkings(markings);
        return this;
    }

    @Override
    public DscpConfigurationImpl withProtocol(ProtocolType protocol) {
        this.inner().withProtocol(protocol);
        return this;
    }

    @Override
    public DscpConfigurationImpl withSourceIpRanges(List<QosIpRange> sourceIpRanges) {
        this.inner().withSourceIpRanges(sourceIpRanges);
        return this;
    }

    @Override
    public DscpConfigurationImpl withSourcePortRanges(List<QosPortRange> sourcePortRanges) {
        this.inner().withSourcePortRanges(sourcePortRanges);
        return this;
    }

}
