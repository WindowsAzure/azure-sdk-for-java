/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.management.network.v2019_07_01.LoadBalancerNetworkInterface;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_07_01.NetworkInterfaceDnsSettings;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_07_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;
import com.microsoft.azure.management.network.v2019_07_01.NetworkSecurityGroup;
import com.microsoft.azure.management.network.v2019_07_01.PrivateEndpoint;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import java.util.Map;
import com.microsoft.azure.management.network.v2019_07_01.NetworkInterfaceTapConfiguration;
import com.microsoft.azure.SubResource;

class LoadBalancerNetworkInterfaceImpl extends WrapperImpl<NetworkInterfaceInner> implements LoadBalancerNetworkInterface {
    private final NetworkManager manager;

    LoadBalancerNetworkInterfaceImpl(NetworkInterfaceInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.inner().dnsSettings();
    }

    @Override
    public Boolean enableAcceleratedNetworking() {
        return this.inner().enableAcceleratedNetworking();
    }

    @Override
    public Boolean enableIPForwarding() {
        return this.inner().enableIPForwarding();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<String> hostedWorkloads() {
        return this.inner().hostedWorkloads();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> ipConfigurations() {
        List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> lst = new ArrayList<VirtualMachineScaleSetNetworkInterfaceIPConfiguration>();
        if (this.inner().ipConfigurations() != null) {
            for (NetworkInterfaceIPConfigurationInner inner : this.inner().ipConfigurations()) {
                lst.add( new VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String macAddress() {
        return this.inner().macAddress();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkSecurityGroup networkSecurityGroup() {
        NetworkSecurityGroupInner inner = this.inner().networkSecurityGroup();
        if (inner != null) {
            return  new NetworkSecurityGroupImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Boolean primary() {
        return this.inner().primary();
    }

    @Override
    public PrivateEndpoint privateEndpoint() {
        PrivateEndpointInner inner = this.inner().privateEndpoint();
        if (inner != null) {
            return  new PrivateEndpointImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public List<NetworkInterfaceTapConfiguration> tapConfigurations() {
        List<NetworkInterfaceTapConfiguration> lst = new ArrayList<NetworkInterfaceTapConfiguration>();
        if (this.inner().tapConfigurations() != null) {
            for (NetworkInterfaceTapConfigurationInner inner : this.inner().tapConfigurations()) {
                lst.add( new NetworkInterfaceTapConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SubResource virtualMachine() {
        return this.inner().virtualMachine();
    }

}
