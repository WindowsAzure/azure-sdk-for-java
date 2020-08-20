/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedCluster;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterAgentPoolProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceLinuxProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterWindowsProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterServicePrincipalProfile;
import java.util.Map;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterAddonProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceNetworkProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterAADProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterPropertiesAutoScalerProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterAPIServerAccessProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterPropertiesIdentityProfileValue;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterIdentity;
import com.microsoft.azure.management.containerservice.v2020_07_01.ManagedClusterSKU;

class ManagedClusterImpl extends GroupableResourceCoreImpl<ManagedCluster, ManagedClusterInner, ManagedClusterImpl, ContainerServiceManager> implements ManagedCluster, ManagedCluster.Definition, ManagedCluster.Update {
    ManagedClusterImpl(String name, ManagedClusterInner inner, ContainerServiceManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ManagedCluster> createResourceAsync() {
        ManagedClustersInner client = this.manager().inner().managedClusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagedCluster> updateResourceAsync() {
        ManagedClustersInner client = this.manager().inner().managedClusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagedClusterInner> getInnerAsync() {
        ManagedClustersInner client = this.manager().inner().managedClusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ManagedClusterAADProfile aadProfile() {
        return this.inner().aadProfile();
    }

    @Override
    public Map<String, ManagedClusterAddonProfile> addonProfiles() {
        return this.inner().addonProfiles();
    }

    @Override
    public List<ManagedClusterAgentPoolProfile> agentPoolProfiles() {
        return this.inner().agentPoolProfiles();
    }

    @Override
    public ManagedClusterAPIServerAccessProfile apiServerAccessProfile() {
        return this.inner().apiServerAccessProfile();
    }

    @Override
    public ManagedClusterPropertiesAutoScalerProfile autoScalerProfile() {
        return this.inner().autoScalerProfile();
    }

    @Override
    public String diskEncryptionSetID() {
        return this.inner().diskEncryptionSetID();
    }

    @Override
    public String dnsPrefix() {
        return this.inner().dnsPrefix();
    }

    @Override
    public Boolean enablePodSecurityPolicy() {
        return this.inner().enablePodSecurityPolicy();
    }

    @Override
    public Boolean enableRBAC() {
        return this.inner().enableRBAC();
    }

    @Override
    public String fqdn() {
        return this.inner().fqdn();
    }

    @Override
    public ManagedClusterIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile() {
        return this.inner().identityProfile();
    }

    @Override
    public String kubernetesVersion() {
        return this.inner().kubernetesVersion();
    }

    @Override
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.inner().linuxProfile();
    }

    @Override
    public Integer maxAgentPools() {
        return this.inner().maxAgentPools();
    }

    @Override
    public ContainerServiceNetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public String nodeResourceGroup() {
        return this.inner().nodeResourceGroup();
    }

    @Override
    public String privateFQDN() {
        return this.inner().privateFQDN();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ManagedClusterServicePrincipalProfile servicePrincipalProfile() {
        return this.inner().servicePrincipalProfile();
    }

    @Override
    public ManagedClusterSKU sku() {
        return this.inner().sku();
    }

    @Override
    public ManagedClusterWindowsProfile windowsProfile() {
        return this.inner().windowsProfile();
    }

    @Override
    public ManagedClusterImpl withAadProfile(ManagedClusterAADProfile aadProfile) {
        this.inner().withAadProfile(aadProfile);
        return this;
    }

    @Override
    public ManagedClusterImpl withAddonProfiles(Map<String, ManagedClusterAddonProfile> addonProfiles) {
        this.inner().withAddonProfiles(addonProfiles);
        return this;
    }

    @Override
    public ManagedClusterImpl withAgentPoolProfiles(List<ManagedClusterAgentPoolProfile> agentPoolProfiles) {
        this.inner().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    @Override
    public ManagedClusterImpl withApiServerAccessProfile(ManagedClusterAPIServerAccessProfile apiServerAccessProfile) {
        this.inner().withApiServerAccessProfile(apiServerAccessProfile);
        return this;
    }

    @Override
    public ManagedClusterImpl withAutoScalerProfile(ManagedClusterPropertiesAutoScalerProfile autoScalerProfile) {
        this.inner().withAutoScalerProfile(autoScalerProfile);
        return this;
    }

    @Override
    public ManagedClusterImpl withDiskEncryptionSetID(String diskEncryptionSetID) {
        this.inner().withDiskEncryptionSetID(diskEncryptionSetID);
        return this;
    }

    @Override
    public ManagedClusterImpl withDnsPrefix(String dnsPrefix) {
        this.inner().withDnsPrefix(dnsPrefix);
        return this;
    }

    @Override
    public ManagedClusterImpl withEnablePodSecurityPolicy(Boolean enablePodSecurityPolicy) {
        this.inner().withEnablePodSecurityPolicy(enablePodSecurityPolicy);
        return this;
    }

    @Override
    public ManagedClusterImpl withEnableRBAC(Boolean enableRBAC) {
        this.inner().withEnableRBAC(enableRBAC);
        return this;
    }

    @Override
    public ManagedClusterImpl withIdentity(ManagedClusterIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ManagedClusterImpl withIdentityProfile(Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile) {
        this.inner().withIdentityProfile(identityProfile);
        return this;
    }

    @Override
    public ManagedClusterImpl withKubernetesVersion(String kubernetesVersion) {
        this.inner().withKubernetesVersion(kubernetesVersion);
        return this;
    }

    @Override
    public ManagedClusterImpl withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        this.inner().withLinuxProfile(linuxProfile);
        return this;
    }

    @Override
    public ManagedClusterImpl withNetworkProfile(ContainerServiceNetworkProfile networkProfile) {
        this.inner().withNetworkProfile(networkProfile);
        return this;
    }

    @Override
    public ManagedClusterImpl withNodeResourceGroup(String nodeResourceGroup) {
        this.inner().withNodeResourceGroup(nodeResourceGroup);
        return this;
    }

    @Override
    public ManagedClusterImpl withServicePrincipalProfile(ManagedClusterServicePrincipalProfile servicePrincipalProfile) {
        this.inner().withServicePrincipalProfile(servicePrincipalProfile);
        return this;
    }

    @Override
    public ManagedClusterImpl withSku(ManagedClusterSKU sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public ManagedClusterImpl withWindowsProfile(ManagedClusterWindowsProfile windowsProfile) {
        this.inner().withWindowsProfile(windowsProfile);
        return this;
    }

}
