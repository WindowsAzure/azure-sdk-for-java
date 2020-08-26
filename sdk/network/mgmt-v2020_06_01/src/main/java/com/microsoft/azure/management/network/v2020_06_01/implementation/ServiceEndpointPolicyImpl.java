/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.ServiceEndpointPolicy;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_06_01.ServiceEndpointPolicyDefinition;
import com.microsoft.azure.management.network.v2020_06_01.Subnet;

class ServiceEndpointPolicyImpl extends GroupableResourceCoreImpl<ServiceEndpointPolicy, ServiceEndpointPolicyInner, ServiceEndpointPolicyImpl, NetworkManager> implements ServiceEndpointPolicy, ServiceEndpointPolicy.Definition, ServiceEndpointPolicy.Update {
    ServiceEndpointPolicyImpl(String name, ServiceEndpointPolicyInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ServiceEndpointPolicy> createResourceAsync() {
        ServiceEndpointPoliciesInner client = this.manager().inner().serviceEndpointPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServiceEndpointPolicy> updateResourceAsync() {
        ServiceEndpointPoliciesInner client = this.manager().inner().serviceEndpointPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServiceEndpointPolicyInner> getInnerAsync() {
        ServiceEndpointPoliciesInner client = this.manager().inner().serviceEndpointPolicies();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
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
    public List<ServiceEndpointPolicyDefinition> serviceEndpointPolicyDefinitions() {
        List<ServiceEndpointPolicyDefinition> lst = new ArrayList<ServiceEndpointPolicyDefinition>();
        if (this.inner().serviceEndpointPolicyDefinitions() != null) {
            for (ServiceEndpointPolicyDefinitionInner inner : this.inner().serviceEndpointPolicyDefinitions()) {
                lst.add( new ServiceEndpointPolicyDefinitionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<Subnet> subnets() {
        List<Subnet> lst = new ArrayList<Subnet>();
        if (this.inner().subnets() != null) {
            for (SubnetInner inner : this.inner().subnets()) {
                lst.add( new SubnetImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ServiceEndpointPolicyImpl withServiceEndpointPolicyDefinitions(List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions) {
        this.inner().withServiceEndpointPolicyDefinitions(serviceEndpointPolicyDefinitions);
        return this;
    }

}
