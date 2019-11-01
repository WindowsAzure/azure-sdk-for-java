/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.DatabaseAccountGetResults;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.DatabaseAccountUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.DatabaseAccountCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.Capability;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.ConnectorOffer;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.ConsistencyPolicy;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.DatabaseAccountOfferType;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.FailoverPolicy;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.DatabaseAccountKind;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.Location;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.VirtualNetworkRule;
import rx.functions.Func1;

class DatabaseAccountGetResultsImpl extends GroupableResourceCoreImpl<DatabaseAccountGetResults, DatabaseAccountGetResultsInner, DatabaseAccountGetResultsImpl, CosmosDBManager> implements DatabaseAccountGetResults, DatabaseAccountGetResults.Definition, DatabaseAccountGetResults.Update {
    private DatabaseAccountCreateUpdateParameters createParameter;
    private DatabaseAccountUpdateParameters updateParameter;
    DatabaseAccountGetResultsImpl(String name, DatabaseAccountGetResultsInner inner, CosmosDBManager manager) {
        super(name, inner, manager);
        this.createParameter = new DatabaseAccountCreateUpdateParameters();
        this.updateParameter = new DatabaseAccountUpdateParameters();
    }

    @Override
    public Observable<DatabaseAccountGetResults> createResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<DatabaseAccountGetResultsInner, DatabaseAccountGetResultsInner>() {
               @Override
               public DatabaseAccountGetResultsInner call(DatabaseAccountGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DatabaseAccountGetResults> updateResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DatabaseAccountGetResultsInner, DatabaseAccountGetResultsInner>() {
               @Override
               public DatabaseAccountGetResultsInner call(DatabaseAccountGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseAccountGetResultsInner> getInnerAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new DatabaseAccountCreateUpdateParameters();
        this.updateParameter = new DatabaseAccountUpdateParameters();
    }

    @Override
    public List<Capability> capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public ConnectorOffer connectorOffer() {
        return this.inner().connectorOffer();
    }

    @Override
    public ConsistencyPolicy consistencyPolicy() {
        return this.inner().consistencyPolicy();
    }

    @Override
    public DatabaseAccountOfferType databaseAccountOfferType() {
        return this.inner().databaseAccountOfferType();
    }

    @Override
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.inner().disableKeyBasedMetadataWriteAccess();
    }

    @Override
    public String documentEndpoint() {
        return this.inner().documentEndpoint();
    }

    @Override
    public Boolean enableAutomaticFailover() {
        return this.inner().enableAutomaticFailover();
    }

    @Override
    public Boolean enableCassandraConnector() {
        return this.inner().enableCassandraConnector();
    }

    @Override
    public Boolean enableMultipleWriteLocations() {
        return this.inner().enableMultipleWriteLocations();
    }

    @Override
    public List<FailoverPolicy> failoverPolicies() {
        return this.inner().failoverPolicies();
    }

    @Override
    public String ipRangeFilter() {
        return this.inner().ipRangeFilter();
    }

    @Override
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.inner().isVirtualNetworkFilterEnabled();
    }

    @Override
    public DatabaseAccountKind kind() {
        return this.inner().kind();
    }

    @Override
    public List<Location> locations() {
        return this.inner().locations();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<Location> readLocations() {
        return this.inner().readLocations();
    }

    @Override
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.inner().virtualNetworkRules();
    }

    @Override
    public List<Location> writeLocations() {
        return this.inner().writeLocations();
    }

    @Override
    public DatabaseAccountGetResultsImpl withDatabaseAccountOfferType(String databaseAccountOfferType) {
        this.createParameter.withDatabaseAccountOfferType(databaseAccountOfferType);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withKind(DatabaseAccountKind kind) {
        this.createParameter.withKind(kind);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withLocations(List<Location> locations) {
        if (isInCreateMode()) {
            this.createParameter.withLocations(locations);
        } else {
            this.updateParameter.withLocations(locations);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withCapabilities(List<Capability> capabilities) {
        if (isInCreateMode()) {
            this.createParameter.withCapabilities(capabilities);
        } else {
            this.updateParameter.withCapabilities(capabilities);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withConnectorOffer(ConnectorOffer connectorOffer) {
        if (isInCreateMode()) {
            this.createParameter.withConnectorOffer(connectorOffer);
        } else {
            this.updateParameter.withConnectorOffer(connectorOffer);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        if (isInCreateMode()) {
            this.createParameter.withConsistencyPolicy(consistencyPolicy);
        } else {
            this.updateParameter.withConsistencyPolicy(consistencyPolicy);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess) {
        if (isInCreateMode()) {
            this.createParameter.withDisableKeyBasedMetadataWriteAccess(disableKeyBasedMetadataWriteAccess);
        } else {
            this.updateParameter.withDisableKeyBasedMetadataWriteAccess(disableKeyBasedMetadataWriteAccess);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        if (isInCreateMode()) {
            this.createParameter.withEnableAutomaticFailover(enableAutomaticFailover);
        } else {
            this.updateParameter.withEnableAutomaticFailover(enableAutomaticFailover);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableCassandraConnector(Boolean enableCassandraConnector) {
        if (isInCreateMode()) {
            this.createParameter.withEnableCassandraConnector(enableCassandraConnector);
        } else {
            this.updateParameter.withEnableCassandraConnector(enableCassandraConnector);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        if (isInCreateMode()) {
            this.createParameter.withEnableMultipleWriteLocations(enableMultipleWriteLocations);
        } else {
            this.updateParameter.withEnableMultipleWriteLocations(enableMultipleWriteLocations);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withIpRangeFilter(String ipRangeFilter) {
        if (isInCreateMode()) {
            this.createParameter.withIpRangeFilter(ipRangeFilter);
        } else {
            this.updateParameter.withIpRangeFilter(ipRangeFilter);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        if (isInCreateMode()) {
            this.createParameter.withIsVirtualNetworkFilterEnabled(isVirtualNetworkFilterEnabled);
        } else {
            this.updateParameter.withIsVirtualNetworkFilterEnabled(isVirtualNetworkFilterEnabled);
        }
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        if (isInCreateMode()) {
            this.createParameter.withVirtualNetworkRules(virtualNetworkRules);
        } else {
            this.updateParameter.withVirtualNetworkRules(virtualNetworkRules);
        }
        return this;
    }

}
