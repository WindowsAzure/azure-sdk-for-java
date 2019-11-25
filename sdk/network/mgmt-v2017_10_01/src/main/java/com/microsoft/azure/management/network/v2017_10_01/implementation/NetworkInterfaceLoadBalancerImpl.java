/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.management.network.v2017_10_01.NetworkInterfaceLoadBalancer;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2017_10_01.BackendAddressPool;
import java.util.List;
import com.microsoft.azure.management.network.v2017_10_01.FrontendIPConfiguration;
import com.microsoft.azure.management.network.v2017_10_01.InboundNatPool;
import com.microsoft.azure.management.network.v2017_10_01.InboundNatRule;
import com.microsoft.azure.management.network.v2017_10_01.LoadBalancingRule;
import com.microsoft.azure.management.network.v2017_10_01.OutboundNatRule;
import com.microsoft.azure.management.network.v2017_10_01.Probe;
import com.microsoft.azure.management.network.v2017_10_01.LoadBalancerSku;
import java.util.Map;

class NetworkInterfaceLoadBalancerImpl extends WrapperImpl<LoadBalancerInner> implements NetworkInterfaceLoadBalancer {
    private final NetworkManager manager;

    NetworkInterfaceLoadBalancerImpl(LoadBalancerInner inner,  NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }



    @Override
    public List<BackendAddressPool> backendAddressPools() {
        List<BackendAddressPool> lst = new ArrayList<BackendAddressPool>();
        if (this.inner().backendAddressPools() != null) {
            for (BackendAddressPoolInner inner : this.inner().backendAddressPools()) {
                lst.add( new BackendAddressPoolImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<FrontendIPConfiguration> frontendIPConfigurations() {
        List<FrontendIPConfiguration> lst = new ArrayList<FrontendIPConfiguration>();
        if (this.inner().frontendIPConfigurations() != null) {
            for (FrontendIPConfigurationInner inner : this.inner().frontendIPConfigurations()) {
                lst.add( new FrontendIPConfigurationImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<InboundNatPool> inboundNatPools() {
        return this.inner().inboundNatPools();
    }

    @Override
    public List<InboundNatRule> inboundNatRules() {
        List<InboundNatRule> lst = new ArrayList<InboundNatRule>();
        if (this.inner().inboundNatRules() != null) {
            for (InboundNatRuleInner inner : this.inner().inboundNatRules()) {
                lst.add( new InboundNatRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<LoadBalancingRule> loadBalancingRules() {
        List<LoadBalancingRule> lst = new ArrayList<LoadBalancingRule>();
        if (this.inner().loadBalancingRules() != null) {
            for (LoadBalancingRuleInner inner : this.inner().loadBalancingRules()) {
                lst.add( new LoadBalancingRuleImpl(inner, manager()));
            }
        }
        return lst;
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
    public List<OutboundNatRule> outboundNatRules() {
        return this.inner().outboundNatRules();
    }

    @Override
    public List<Probe> probes() {
        List<Probe> lst = new ArrayList<Probe>();
        if (this.inner().probes() != null) {
            for (ProbeInner inner : this.inner().probes()) {
                lst.add( new ProbeImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public LoadBalancerSku sku() {
        return this.inner().sku();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
