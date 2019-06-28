/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.servicefabric.v2018_02_01.Cluster;
import rx.Observable;
import com.microsoft.azure.management.servicefabric.v2018_02_01.ClusterUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.servicefabric.v2018_02_01.ClusterVersionDetails;
import com.microsoft.azure.management.servicefabric.v2018_02_01.AzureActiveDirectory;
import com.microsoft.azure.management.servicefabric.v2018_02_01.CertificateDescription;
import com.microsoft.azure.management.servicefabric.v2018_02_01.ServerCertificateCommonNames;
import com.microsoft.azure.management.servicefabric.v2018_02_01.ClientCertificateCommonName;
import com.microsoft.azure.management.servicefabric.v2018_02_01.ClientCertificateThumbprint;
import com.microsoft.azure.management.servicefabric.v2018_02_01.DiagnosticsStorageAccountConfig;
import com.microsoft.azure.management.servicefabric.v2018_02_01.SettingsSectionDescription;
import com.microsoft.azure.management.servicefabric.v2018_02_01.NodeTypeDescription;
import com.microsoft.azure.management.servicefabric.v2018_02_01.ProvisioningState;
import com.microsoft.azure.management.servicefabric.v2018_02_01.ClusterUpgradePolicy;
import rx.functions.Func1;

class ClusterImpl extends GroupableResourceCoreImpl<Cluster, ClusterInner, ClusterImpl, ServiceFabricManager> implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterUpdateParameters updateParameter;
    ClusterImpl(String name, ClusterInner inner, ServiceFabricManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ClusterUpdateParameters();
    }

    @Override
    public Observable<Cluster> createResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.createAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Cluster> updateResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ClusterUpdateParameters();
    }

    @Override
    public List<String> addOnFeatures() {
        return this.inner().addOnFeatures();
    }

    @Override
    public List<ClusterVersionDetails> availableClusterVersions() {
        return this.inner().availableClusterVersions();
    }

    @Override
    public AzureActiveDirectory azureActiveDirectory() {
        return this.inner().azureActiveDirectory();
    }

    @Override
    public CertificateDescription certificate() {
        return this.inner().certificate();
    }

    @Override
    public ServerCertificateCommonNames certificateCommonNames() {
        return this.inner().certificateCommonNames();
    }

    @Override
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.inner().clientCertificateCommonNames();
    }

    @Override
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.inner().clientCertificateThumbprints();
    }

    @Override
    public String clusterCodeVersion() {
        return this.inner().clusterCodeVersion();
    }

    @Override
    public String clusterEndpoint() {
        return this.inner().clusterEndpoint();
    }

    @Override
    public String clusterId() {
        return this.inner().clusterId();
    }

    @Override
    public String clusterState() {
        return this.inner().clusterState();
    }

    @Override
    public DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig() {
        return this.inner().diagnosticsStorageAccountConfig();
    }

    @Override
    public List<SettingsSectionDescription> fabricSettings() {
        return this.inner().fabricSettings();
    }

    @Override
    public String managementEndpoint() {
        return this.inner().managementEndpoint();
    }

    @Override
    public List<NodeTypeDescription> nodeTypes() {
        return this.inner().nodeTypes();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String reliabilityLevel() {
        return this.inner().reliabilityLevel();
    }

    @Override
    public CertificateDescription reverseProxyCertificate() {
        return this.inner().reverseProxyCertificate();
    }

    @Override
    public ServerCertificateCommonNames reverseProxyCertificateCommonNames() {
        return this.inner().reverseProxyCertificateCommonNames();
    }

    @Override
    public ClusterUpgradePolicy upgradeDescription() {
        return this.inner().upgradeDescription();
    }

    @Override
    public String upgradeMode() {
        return this.inner().upgradeMode();
    }

    @Override
    public String vmImage() {
        return this.inner().vmImage();
    }

    @Override
    public ClusterImpl withManagementEndpoint(String managementEndpoint) {
        this.inner().withManagementEndpoint(managementEndpoint);
        return this;
    }

    @Override
    public ClusterImpl withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory) {
        this.inner().withAzureActiveDirectory(azureActiveDirectory);
        return this;
    }

    @Override
    public ClusterImpl withDiagnosticsStorageAccountConfig(DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig) {
        this.inner().withDiagnosticsStorageAccountConfig(diagnosticsStorageAccountConfig);
        return this;
    }

    @Override
    public ClusterImpl withReverseProxyCertificateCommonNames(ServerCertificateCommonNames reverseProxyCertificateCommonNames) {
        this.inner().withReverseProxyCertificateCommonNames(reverseProxyCertificateCommonNames);
        return this;
    }

    @Override
    public ClusterImpl withVmImage(String vmImage) {
        this.inner().withVmImage(vmImage);
        return this;
    }

    @Override
    public ClusterImpl withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        if (isInCreateMode()) {
            this.inner().withNodeTypes(nodeTypes);
        } else {
            this.updateParameter.withNodeTypes(nodeTypes);
        }
        return this;
    }

    @Override
    public ClusterImpl withAddOnFeatures(List<String> addOnFeatures) {
        if (isInCreateMode()) {
            this.inner().withAddOnFeatures(addOnFeatures);
        } else {
            this.updateParameter.withAddOnFeatures(addOnFeatures);
        }
        return this;
    }

    @Override
    public ClusterImpl withCertificate(CertificateDescription certificate) {
        if (isInCreateMode()) {
            this.inner().withCertificate(certificate);
        } else {
            this.updateParameter.withCertificate(certificate);
        }
        return this;
    }

    @Override
    public ClusterImpl withCertificateCommonNames(ServerCertificateCommonNames certificateCommonNames) {
        if (isInCreateMode()) {
            this.inner().withCertificateCommonNames(certificateCommonNames);
        } else {
            this.updateParameter.withCertificateCommonNames(certificateCommonNames);
        }
        return this;
    }

    @Override
    public ClusterImpl withClientCertificateCommonNames(List<ClientCertificateCommonName> clientCertificateCommonNames) {
        if (isInCreateMode()) {
            this.inner().withClientCertificateCommonNames(clientCertificateCommonNames);
        } else {
            this.updateParameter.withClientCertificateCommonNames(clientCertificateCommonNames);
        }
        return this;
    }

    @Override
    public ClusterImpl withClientCertificateThumbprints(List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        if (isInCreateMode()) {
            this.inner().withClientCertificateThumbprints(clientCertificateThumbprints);
        } else {
            this.updateParameter.withClientCertificateThumbprints(clientCertificateThumbprints);
        }
        return this;
    }

    @Override
    public ClusterImpl withClusterCodeVersion(String clusterCodeVersion) {
        if (isInCreateMode()) {
            this.inner().withClusterCodeVersion(clusterCodeVersion);
        } else {
            this.updateParameter.withClusterCodeVersion(clusterCodeVersion);
        }
        return this;
    }

    @Override
    public ClusterImpl withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        if (isInCreateMode()) {
            this.inner().withFabricSettings(fabricSettings);
        } else {
            this.updateParameter.withFabricSettings(fabricSettings);
        }
        return this;
    }

    @Override
    public ClusterImpl withReliabilityLevel(String reliabilityLevel) {
        if (isInCreateMode()) {
            this.inner().withReliabilityLevel(reliabilityLevel);
        } else {
            this.updateParameter.withReliabilityLevel(reliabilityLevel);
        }
        return this;
    }

    @Override
    public ClusterImpl withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        if (isInCreateMode()) {
            this.inner().withReverseProxyCertificate(reverseProxyCertificate);
        } else {
            this.updateParameter.withReverseProxyCertificate(reverseProxyCertificate);
        }
        return this;
    }

    @Override
    public ClusterImpl withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        if (isInCreateMode()) {
            this.inner().withUpgradeDescription(upgradeDescription);
        } else {
            this.updateParameter.withUpgradeDescription(upgradeDescription);
        }
        return this;
    }

    @Override
    public ClusterImpl withUpgradeMode(String upgradeMode) {
        if (isInCreateMode()) {
            this.inner().withUpgradeMode(upgradeMode);
        } else {
            this.updateParameter.withUpgradeMode(upgradeMode);
        }
        return this;
    }

}
