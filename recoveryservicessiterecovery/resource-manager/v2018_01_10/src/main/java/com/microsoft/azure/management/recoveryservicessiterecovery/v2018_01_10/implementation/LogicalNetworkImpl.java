/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.LogicalNetwork;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.LogicalNetworkProperties;

class LogicalNetworkImpl extends IndexableRefreshableWrapperImpl<LogicalNetwork, LogicalNetworkInner> implements LogicalNetwork {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String logicalNetworkName;

    LogicalNetworkImpl(LogicalNetworkInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.logicalNetworkName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationLogicalNetworks");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<LogicalNetworkInner> getInnerAsync() {
        ReplicationLogicalNetworksInner client = this.manager().inner().replicationLogicalNetworks();
        return client.getAsync(this.fabricName, this.logicalNetworkName);
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
    public LogicalNetworkProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
