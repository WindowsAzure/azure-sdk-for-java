/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.management.network.v2019_02_01.NetworkInterfaceNetworkInterfaceIPConfiguration;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_02_01.ApplicationGatewayBackendAddressPool;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_02_01.ApplicationSecurityGroup;
import com.microsoft.azure.management.network.v2019_02_01.BackendAddressPool;
import com.microsoft.azure.management.network.v2019_02_01.InboundNatRule;
import com.microsoft.azure.management.network.v2019_02_01.IPVersion;
import com.microsoft.azure.management.network.v2019_02_01.IPAllocationMethod;
import com.microsoft.azure.management.network.v2019_02_01.PublicIPAddress;
import com.microsoft.azure.management.network.v2019_02_01.Subnet;
import com.microsoft.azure.management.network.v2019_02_01.VirtualNetworkTap;

class NetworkInterfaceNetworkInterfaceIPConfigurationImpl extends IndexableRefreshableWrapperImpl<NetworkInterfaceNetworkInterfaceIPConfiguration, NetworkInterfaceIPConfigurationInner> implements NetworkInterfaceNetworkInterfaceIPConfiguration {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String networkInterfaceName;
    private String ipConfigurationName;

    NetworkInterfaceNetworkInterfaceIPConfigurationImpl(NetworkInterfaceIPConfigurationInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.networkInterfaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkInterfaces");
        this.ipConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "ipConfigurations");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<NetworkInterfaceIPConfigurationInner> getInnerAsync() {
        NetworkInterfaceIPConfigurationsInner client = this.manager().inner().networkInterfaceIPConfigurations();
        return client.getAsync(this.resourceGroupName, this.networkInterfaceName, this.ipConfigurationName);
    }



    @Override
    public List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools() {
        return this.inner().applicationGatewayBackendAddressPools();
    }

    @Override
    public List<ApplicationSecurityGroup> applicationSecurityGroups() {
        List<ApplicationSecurityGroup> lst = new ArrayList<ApplicationSecurityGroup>();
        if (this.inner().applicationSecurityGroups() != null) {
            for (ApplicationSecurityGroupInner inner : this.inner().applicationSecurityGroups()) {
                lst.add( new ApplicationSecurityGroupImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<BackendAddressPool> loadBalancerBackendAddressPools() {
        List<BackendAddressPool> lst = new ArrayList<BackendAddressPool>();
        if (this.inner().loadBalancerBackendAddressPools() != null) {
            for (BackendAddressPoolInner inner : this.inner().loadBalancerBackendAddressPools()) {
                lst.add( new BackendAddressPoolImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<InboundNatRule> loadBalancerInboundNatRules() {
        List<InboundNatRule> lst = new ArrayList<InboundNatRule>();
        if (this.inner().loadBalancerInboundNatRules() != null) {
            for (InboundNatRuleInner inner : this.inner().loadBalancerInboundNatRules()) {
                lst.add( new InboundNatRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean primary() {
        return this.inner().primary();
    }

    @Override
    public String privateIPAddress() {
        return this.inner().privateIPAddress();
    }

    @Override
    public IPVersion privateIPAddressVersion() {
        return this.inner().privateIPAddressVersion();
    }

    @Override
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.inner().privateIPAllocationMethod();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicIPAddress publicIPAddress() {
        PublicIPAddressInner inner = this.inner().publicIPAddress();
        if (inner != null) {
            return  new PublicIPAddressImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Subnet subnet() {
        SubnetInner inner = this.inner().subnet();
        if (inner != null) {
            return  new SubnetImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public List<VirtualNetworkTap> virtualNetworkTaps() {
        List<VirtualNetworkTap> lst = new ArrayList<VirtualNetworkTap>();
        if (this.inner().virtualNetworkTaps() != null) {
            for (VirtualNetworkTapInner inner : this.inner().virtualNetworkTaps()) {
                lst.add( new VirtualNetworkTapImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

}
