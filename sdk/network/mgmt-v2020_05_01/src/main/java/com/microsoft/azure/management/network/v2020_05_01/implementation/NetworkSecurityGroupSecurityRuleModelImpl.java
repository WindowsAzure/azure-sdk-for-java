/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.NetworkSecurityGroupSecurityRuleModel;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_05_01.SecurityRuleAccess;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_05_01.ApplicationSecurityGroup;
import com.microsoft.azure.management.network.v2020_05_01.SecurityRuleDirection;
import com.microsoft.azure.management.network.v2020_05_01.SecurityRuleProtocol;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;

class NetworkSecurityGroupSecurityRuleModelImpl extends IndexableRefreshableWrapperImpl<NetworkSecurityGroupSecurityRuleModel, SecurityRuleInner> implements NetworkSecurityGroupSecurityRuleModel {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String networkSecurityGroupName;
    private String defaultSecurityRuleName;

    NetworkSecurityGroupSecurityRuleModelImpl(SecurityRuleInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.networkSecurityGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkSecurityGroups");
        this.defaultSecurityRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "defaultSecurityRules");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<SecurityRuleInner> getInnerAsync() {
        DefaultSecurityRulesInner client = this.manager().inner().defaultSecurityRules();
        return client.getAsync(this.resourceGroupName, this.networkSecurityGroupName, this.defaultSecurityRuleName);
    }



    @Override
    public SecurityRuleAccess access() {
        return this.inner().access();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String destinationAddressPrefix() {
        return this.inner().destinationAddressPrefix();
    }

    @Override
    public List<String> destinationAddressPrefixes() {
        return this.inner().destinationAddressPrefixes();
    }

    @Override
    public List<ApplicationSecurityGroup> destinationApplicationSecurityGroups() {
        List<ApplicationSecurityGroup> lst = new ArrayList<ApplicationSecurityGroup>();
        if (this.inner().destinationApplicationSecurityGroups() != null) {
            for (ApplicationSecurityGroupInner inner : this.inner().destinationApplicationSecurityGroups()) {
                lst.add( new ApplicationSecurityGroupImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String destinationPortRange() {
        return this.inner().destinationPortRange();
    }

    @Override
    public List<String> destinationPortRanges() {
        return this.inner().destinationPortRanges();
    }

    @Override
    public SecurityRuleDirection direction() {
        return this.inner().direction();
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer priority() {
        return this.inner().priority();
    }

    @Override
    public SecurityRuleProtocol protocol() {
        return this.inner().protocol();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String sourceAddressPrefix() {
        return this.inner().sourceAddressPrefix();
    }

    @Override
    public List<String> sourceAddressPrefixes() {
        return this.inner().sourceAddressPrefixes();
    }

    @Override
    public List<ApplicationSecurityGroup> sourceApplicationSecurityGroups() {
        List<ApplicationSecurityGroup> lst = new ArrayList<ApplicationSecurityGroup>();
        if (this.inner().sourceApplicationSecurityGroups() != null) {
            for (ApplicationSecurityGroupInner inner : this.inner().sourceApplicationSecurityGroups()) {
                lst.add( new ApplicationSecurityGroupImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String sourcePortRange() {
        return this.inner().sourcePortRange();
    }

    @Override
    public List<String> sourcePortRanges() {
        return this.inner().sourcePortRanges();
    }

}
