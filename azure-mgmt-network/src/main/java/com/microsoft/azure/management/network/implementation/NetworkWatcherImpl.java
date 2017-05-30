/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.FlowLogInformation;
import com.microsoft.azure.management.network.NetworkWatcher;
import com.microsoft.azure.management.network.SecurityGroupViewResult;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import rx.Observable;

/**
 * Implementation for Network Watcher and its create and update interfaces.
 */
@LangDefinition
class NetworkWatcherImpl
        extends GroupableResourceImpl<
        NetworkWatcher,
                NetworkWatcherInner,
                NetworkWatcherImpl,
                NetworkManager>
        implements
        NetworkWatcher,
        NetworkWatcher.Definition,
        NetworkWatcher.Update {

    NetworkWatcherImpl(String name,
                final NetworkWatcherInner innerModel,
                final NetworkManager networkManager) {
        super(name, innerModel, networkManager);
    }

    // Verbs

    @Override
    public TopologyImpl getTopology(String targetResourceGroup) {
        TopologyInner topologyInner = this.manager().inner().networkWatchers()
                .getTopology(this.resourceGroupName(), this.name(), targetResourceGroup);
        return new TopologyImpl(this, topologyInner, targetResourceGroup);
    }

    @Override
    public SecurityGroupViewResult securityGroupViewResult(String vmId) {
        SecurityGroupViewResultInner securityGroupViewResultInner = this.manager().inner().networkWatchers()
                .getVMSecurityRules(this.resourceGroupName(), this.name(), vmId);
        return new SecurityGroupViewResultImpl(this, securityGroupViewResultInner, vmId);
    }

    public FlowLogInformation getFlowLogStatus(String nsgId) {
        FlowLogInformationInner flowLogInformationInner = this.manager().inner().networkWatchers()
                .getFlowLogStatus(this.resourceGroupName(), this.name(), nsgId);
        return new FlowLogInformationImpl(this, flowLogInformationInner);
    }

    public TroubleshootingImpl troubleshoot(String targetResourceId, String storageId, String storagePath) {
        TroubleshootingParametersInner parameters = new TroubleshootingParametersInner().withTargetResourceId(targetResourceId)
                .withStorageId(storageId).withStoragePath(storagePath);
        TroubleshootingResultInner inner = this.manager().inner().networkWatchers()
                .getTroubleshooting(this.resourceGroupName(), this.name(), parameters);
        return new TroubleshootingImpl(this, inner, targetResourceId);
    }

    public NextHopImpl nextHop() {
        return new NextHopImpl(this);
    }

    @Override
    public VerificationIPFlowImpl verifyIPFlow() {
        return new VerificationIPFlowImpl(this);
    }

    @Override
    public Observable<NetworkWatcher> createResourceAsync() {
        return this.manager().inner().networkWatchers().createOrUpdateAsync(
                this.resourceGroupName(), this.name(), this.inner())
                .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NetworkWatcherInner> getInnerAsync() {
        return this.manager().inner().networkWatchers().getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }
}
