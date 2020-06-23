/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.eventgrid.v2020_06_01.Domain;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2020_06_01.DomainUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_06_01.DomainProvisioningState;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InputSchema;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InputSchemaMapping;
import com.microsoft.azure.management.eventgrid.v2020_06_01.PublicNetworkAccess;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InboundIpRule;
import java.util.ArrayList;
import com.microsoft.azure.management.eventgrid.v2020_06_01.PrivateEndpointConnection;
import rx.functions.Func1;

class DomainImpl extends GroupableResourceCoreImpl<Domain, DomainInner, DomainImpl, EventGridManager> implements Domain, Domain.Definition, Domain.Update {
    private DomainUpdateParameters updateParameter;
    DomainImpl(String name, DomainInner inner, EventGridManager manager) {
        super(name, inner, manager);
        this.updateParameter = new DomainUpdateParameters();
    }

    @Override
    public Observable<Domain> createResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<DomainInner, DomainInner>() {
               @Override
               public DomainInner call(DomainInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Domain> updateResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DomainInner, DomainInner>() {
               @Override
               public DomainInner call(DomainInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DomainInner> getInnerAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DomainUpdateParameters();
    }

    @Override
    public String endpoint() {
        return this.inner().endpoint();
    }

    @Override
    public List<InboundIpRule> inboundIpRules() {
        return this.inner().inboundIpRules();
    }

    @Override
    public InputSchema inputSchema() {
        return this.inner().inputSchema();
    }

    @Override
    public InputSchemaMapping inputSchemaMapping() {
        return this.inner().inputSchemaMapping();
    }

    @Override
    public String metricResourceId() {
        return this.inner().metricResourceId();
    }

    @Override
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnection> lst = new ArrayList<PrivateEndpointConnection>();
        if (this.inner().privateEndpointConnections() != null) {
            for (PrivateEndpointConnectionInner inner : this.inner().privateEndpointConnections()) {
                lst.add( new PrivateEndpointConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public DomainProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicNetworkAccess publicNetworkAccess() {
        return this.inner().publicNetworkAccess();
    }

    @Override
    public DomainImpl withInputSchema(InputSchema inputSchema) {
        this.inner().withInputSchema(inputSchema);
        return this;
    }

    @Override
    public DomainImpl withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inner().withInputSchemaMapping(inputSchemaMapping);
        return this;
    }

    @Override
    public DomainImpl withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.inner().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    @Override
    public DomainImpl withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        if (isInCreateMode()) {
            this.inner().withInboundIpRules(inboundIpRules);
        } else {
            this.updateParameter.withInboundIpRules(inboundIpRules);
        }
        return this;
    }

    @Override
    public DomainImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.inner().withPublicNetworkAccess(publicNetworkAccess);
        } else {
            this.updateParameter.withPublicNetworkAccess(publicNetworkAccess);
        }
        return this;
    }

}
