/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01.implementation;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The cluster resource.
 */
@JsonFlatten
public class ClusterInner extends Resource {
    /**
     * The list of add-on features to enable in the cluster.
     */
    @JsonProperty(value = "properties.addOnFeatures")
    private List<String> addOnFeatures;

    /**
     * The Service Fabric runtime versions available for this cluster.
     */
    @JsonProperty(value = "properties.availableClusterVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ClusterVersionDetails> availableClusterVersions;

    /**
     * The AAD authentication settings of the cluster.
     */
    @JsonProperty(value = "properties.azureActiveDirectory")
    private AzureActiveDirectory azureActiveDirectory;

    /**
     * The certificate to use for securing the cluster. The certificate
     * provided will be used for node to node security within the cluster, SSL
     * certificate for cluster management endpoint and default admin client.
     */
    @JsonProperty(value = "properties.certificate")
    private CertificateDescription certificate;

    /**
     * Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     */
    @JsonProperty(value = "properties.certificateCommonNames")
    private ServerCertificateCommonNames certificateCommonNames;

    /**
     * The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     */
    @JsonProperty(value = "properties.clientCertificateCommonNames")
    private List<ClientCertificateCommonName> clientCertificateCommonNames;

    /**
     * The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     */
    @JsonProperty(value = "properties.clientCertificateThumbprints")
    private List<ClientCertificateThumbprint> clientCertificateThumbprints;

    /**
     * The Service Fabric runtime version of the cluster. This property can
     * only by set the user when **upgradeMode** is set to 'Manual'. To get
     * list of available Service Fabric versions for new clusters use
     * [ClusterVersion API](./ClusterVersion.md). To get the list of available
     * version for existing clusters use **availableClusterVersions**.
     */
    @JsonProperty(value = "properties.clusterCodeVersion")
    private String clusterCodeVersion;

    /**
     * The Azure Resource Provider endpoint. A system service in the cluster
     * connects to this  endpoint.
     */
    @JsonProperty(value = "properties.clusterEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterEndpoint;

    /**
     * A service generated unique identifier for the cluster resource.
     */
    @JsonProperty(value = "properties.clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /**
     * The current state of the cluster.
     *
     * - WaitingForNodes - Indicates that the cluster resource is created and
     * the resource provider is waiting for Service Fabric VM extension to boot
     * up and report to it.
     * - Deploying - Indicates that the Service Fabric runtime is being
     * installed on the VMs. Cluster resource will be in this state until the
     * cluster boots up and system services are up.
     * - BaselineUpgrade - Indicates that the cluster is upgrading to
     * establishes the cluster version. This upgrade is automatically initiated
     * when the cluster boots up for the first time.
     * - UpdatingUserConfiguration - Indicates that the cluster is being
     * upgraded with the user provided configuration.
     * - UpdatingUserCertificate - Indicates that the cluster is being upgraded
     * with the user provided certificate.
     * - UpdatingInfrastructure - Indicates that the cluster is being upgraded
     * with the latest Service Fabric runtime version. This happens only when
     * the **upgradeMode** is set to 'Automatic'.
     * - EnforcingClusterVersion - Indicates that cluster is on a different
     * version than expected and the cluster is being upgraded to the expected
     * version.
     * - UpgradeServiceUnreachable - Indicates that the system service in the
     * cluster is no longer polling the Resource Provider. Clusters in this
     * state cannot be managed by the Resource Provider.
     * - AutoScale - Indicates that the ReliabilityLevel of the cluster is
     * being adjusted.
     * - Ready - Indicates that the cluster is in a stable state.
     * . Possible values include: 'WaitingForNodes', 'Deploying',
     * 'BaselineUpgrade', 'UpdatingUserConfiguration',
     * 'UpdatingUserCertificate', 'UpdatingInfrastructure',
     * 'EnforcingClusterVersion', 'UpgradeServiceUnreachable', 'AutoScale',
     * 'Ready'.
     */
    @JsonProperty(value = "properties.clusterState", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterState;

    /**
     * The storage account information for storing Service Fabric diagnostic
     * logs.
     */
    @JsonProperty(value = "properties.diagnosticsStorageAccountConfig")
    private DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig;

    /**
     * The list of custom fabric settings to configure the cluster.
     */
    @JsonProperty(value = "properties.fabricSettings")
    private List<SettingsSectionDescription> fabricSettings;

    /**
     * The http management endpoint of the cluster.
     */
    @JsonProperty(value = "properties.managementEndpoint", required = true)
    private String managementEndpoint;

    /**
     * The list of node types in the cluster.
     */
    @JsonProperty(value = "properties.nodeTypes", required = true)
    private List<NodeTypeDescription> nodeTypes;

    /**
     * The provisioning state of the cluster resource. Possible values include:
     * 'Updating', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The reliability level sets the replica set size of system services.
     * Learn about
     * [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * - None - Run the System services with a target replica set count of 1.
     * This should only be used for test clusters.
     * - Bronze - Run the System services with a target replica set count of 3.
     * This should only be used for test clusters.
     * - Silver - Run the System services with a target replica set count of 5.
     * - Gold - Run the System services with a target replica set count of 7.
     * - Platinum - Run the System services with a target replica set count of
     * 9.
     * . Possible values include: 'None', 'Bronze', 'Silver', 'Gold',
     * 'Platinum'.
     */
    @JsonProperty(value = "properties.reliabilityLevel")
    private String reliabilityLevel;

    /**
     * The server certificate used by reverse proxy.
     */
    @JsonProperty(value = "properties.reverseProxyCertificate")
    private CertificateDescription reverseProxyCertificate;

    /**
     * Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     */
    @JsonProperty(value = "properties.reverseProxyCertificateCommonNames")
    private ServerCertificateCommonNames reverseProxyCertificateCommonNames;

    /**
     * The policy to use when upgrading the cluster.
     */
    @JsonProperty(value = "properties.upgradeDescription")
    private ClusterUpgradePolicy upgradeDescription;

    /**
     * The upgrade mode of the cluster when new Service Fabric runtime version
     * is available.
     *
     * - Automatic - The cluster will be automatically upgraded to the latest
     * Service Fabric runtime version as soon as it is available.
     * - Manual - The cluster will not be automatically upgraded to the latest
     * Service Fabric runtime version. The cluster is upgraded by setting the
     * **clusterCodeVersion** property in the cluster resource.
     * . Possible values include: 'Automatic', 'Manual'.
     */
    @JsonProperty(value = "properties.upgradeMode")
    private String upgradeMode;

    /**
     * The VM image VMSS has been configured with. Generic names such as
     * Windows or Linux can be used.
     */
    @JsonProperty(value = "properties.vmImage")
    private String vmImage;

    /**
     * Get the list of add-on features to enable in the cluster.
     *
     * @return the addOnFeatures value
     */
    public List<String> addOnFeatures() {
        return this.addOnFeatures;
    }

    /**
     * Set the list of add-on features to enable in the cluster.
     *
     * @param addOnFeatures the addOnFeatures value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAddOnFeatures(List<String> addOnFeatures) {
        this.addOnFeatures = addOnFeatures;
        return this;
    }

    /**
     * Get the Service Fabric runtime versions available for this cluster.
     *
     * @return the availableClusterVersions value
     */
    public List<ClusterVersionDetails> availableClusterVersions() {
        return this.availableClusterVersions;
    }

    /**
     * Get the AAD authentication settings of the cluster.
     *
     * @return the azureActiveDirectory value
     */
    public AzureActiveDirectory azureActiveDirectory() {
        return this.azureActiveDirectory;
    }

    /**
     * Set the AAD authentication settings of the cluster.
     *
     * @param azureActiveDirectory the azureActiveDirectory value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory) {
        this.azureActiveDirectory = azureActiveDirectory;
        return this;
    }

    /**
     * Get the certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     *
     * @return the certificate value
     */
    public CertificateDescription certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate to use for securing the cluster. The certificate provided will be used for node to node security within the cluster, SSL certificate for cluster management endpoint and default admin client.
     *
     * @param certificate the certificate value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCertificate(CertificateDescription certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get describes a list of server certificates referenced by common name that are used to secure the cluster.
     *
     * @return the certificateCommonNames value
     */
    public ServerCertificateCommonNames certificateCommonNames() {
        return this.certificateCommonNames;
    }

    /**
     * Set describes a list of server certificates referenced by common name that are used to secure the cluster.
     *
     * @param certificateCommonNames the certificateCommonNames value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCertificateCommonNames(ServerCertificateCommonNames certificateCommonNames) {
        this.certificateCommonNames = certificateCommonNames;
        return this;
    }

    /**
     * Get the list of client certificates referenced by common name that are allowed to manage the cluster.
     *
     * @return the clientCertificateCommonNames value
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }

    /**
     * Set the list of client certificates referenced by common name that are allowed to manage the cluster.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateCommonNames(List<ClientCertificateCommonName> clientCertificateCommonNames) {
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        return this;
    }

    /**
     * Get the list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     *
     * @return the clientCertificateThumbprints value
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }

    /**
     * Set the list of client certificates referenced by thumbprint that are allowed to manage the cluster.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateThumbprints(List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        return this;
    }

    /**
     * Get the Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     *
     * @return the clusterCodeVersion value
     */
    public String clusterCodeVersion() {
        return this.clusterCodeVersion;
    }

    /**
     * Set the Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     *
     * @param clusterCodeVersion the clusterCodeVersion value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
        return this;
    }

    /**
     * Get the Azure Resource Provider endpoint. A system service in the cluster connects to this  endpoint.
     *
     * @return the clusterEndpoint value
     */
    public String clusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * Get a service generated unique identifier for the cluster resource.
     *
     * @return the clusterId value
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the current state of the cluster.
       - WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for Service Fabric VM extension to boot up and report to it.
       - Deploying - Indicates that the Service Fabric runtime is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system services are up.
       - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version. This upgrade is automatically initiated when the cluster boots up for the first time.
       - UpdatingUserConfiguration - Indicates that the cluster is being upgraded with the user provided configuration.
       - UpdatingUserCertificate - Indicates that the cluster is being upgraded with the user provided certificate.
       - UpdatingInfrastructure - Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only when the **upgradeMode** is set to 'Automatic'.
       - EnforcingClusterVersion - Indicates that cluster is on a different version than expected and the cluster is being upgraded to the expected version.
       - UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource Provider. Clusters in this state cannot be managed by the Resource Provider.
       - AutoScale - Indicates that the ReliabilityLevel of the cluster is being adjusted.
       - Ready - Indicates that the cluster is in a stable state.
     . Possible values include: 'WaitingForNodes', 'Deploying', 'BaselineUpgrade', 'UpdatingUserConfiguration', 'UpdatingUserCertificate', 'UpdatingInfrastructure', 'EnforcingClusterVersion', 'UpgradeServiceUnreachable', 'AutoScale', 'Ready'.
     *
     * @return the clusterState value
     */
    public String clusterState() {
        return this.clusterState;
    }

    /**
     * Get the storage account information for storing Service Fabric diagnostic logs.
     *
     * @return the diagnosticsStorageAccountConfig value
     */
    public DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig() {
        return this.diagnosticsStorageAccountConfig;
    }

    /**
     * Set the storage account information for storing Service Fabric diagnostic logs.
     *
     * @param diagnosticsStorageAccountConfig the diagnosticsStorageAccountConfig value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withDiagnosticsStorageAccountConfig(DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig) {
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        return this;
    }

    /**
     * Get the list of custom fabric settings to configure the cluster.
     *
     * @return the fabricSettings value
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.fabricSettings;
    }

    /**
     * Set the list of custom fabric settings to configure the cluster.
     *
     * @param fabricSettings the fabricSettings value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        this.fabricSettings = fabricSettings;
        return this;
    }

    /**
     * Get the http management endpoint of the cluster.
     *
     * @return the managementEndpoint value
     */
    public String managementEndpoint() {
        return this.managementEndpoint;
    }

    /**
     * Set the http management endpoint of the cluster.
     *
     * @param managementEndpoint the managementEndpoint value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withManagementEndpoint(String managementEndpoint) {
        this.managementEndpoint = managementEndpoint;
        return this;
    }

    /**
     * Get the list of node types in the cluster.
     *
     * @return the nodeTypes value
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the list of node types in the cluster.
     *
     * @param nodeTypes the nodeTypes value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    /**
     * Get the provisioning state of the cluster resource. Possible values include: 'Updating', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
       - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
       - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
       - Silver - Run the System services with a target replica set count of 5.
       - Gold - Run the System services with a target replica set count of 7.
       - Platinum - Run the System services with a target replica set count of 9.
     . Possible values include: 'None', 'Bronze', 'Silver', 'Gold', 'Platinum'.
     *
     * @return the reliabilityLevel value
     */
    public String reliabilityLevel() {
        return this.reliabilityLevel;
    }

    /**
     * Set the reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
       - None - Run the System services with a target replica set count of 1. This should only be used for test clusters.
       - Bronze - Run the System services with a target replica set count of 3. This should only be used for test clusters.
       - Silver - Run the System services with a target replica set count of 5.
       - Gold - Run the System services with a target replica set count of 7.
       - Platinum - Run the System services with a target replica set count of 9.
     . Possible values include: 'None', 'Bronze', 'Silver', 'Gold', 'Platinum'.
     *
     * @param reliabilityLevel the reliabilityLevel value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReliabilityLevel(String reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
        return this;
    }

    /**
     * Get the server certificate used by reverse proxy.
     *
     * @return the reverseProxyCertificate value
     */
    public CertificateDescription reverseProxyCertificate() {
        return this.reverseProxyCertificate;
    }

    /**
     * Set the server certificate used by reverse proxy.
     *
     * @param reverseProxyCertificate the reverseProxyCertificate value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        this.reverseProxyCertificate = reverseProxyCertificate;
        return this;
    }

    /**
     * Get describes a list of server certificates referenced by common name that are used to secure the cluster.
     *
     * @return the reverseProxyCertificateCommonNames value
     */
    public ServerCertificateCommonNames reverseProxyCertificateCommonNames() {
        return this.reverseProxyCertificateCommonNames;
    }

    /**
     * Set describes a list of server certificates referenced by common name that are used to secure the cluster.
     *
     * @param reverseProxyCertificateCommonNames the reverseProxyCertificateCommonNames value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReverseProxyCertificateCommonNames(ServerCertificateCommonNames reverseProxyCertificateCommonNames) {
        this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
        return this;
    }

    /**
     * Get the policy to use when upgrading the cluster.
     *
     * @return the upgradeDescription value
     */
    public ClusterUpgradePolicy upgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set the policy to use when upgrading the cluster.
     *
     * @param upgradeDescription the upgradeDescription value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

    /**
     * Get the upgrade mode of the cluster when new Service Fabric runtime version is available.
       - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
       - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     . Possible values include: 'Automatic', 'Manual'.
     *
     * @return the upgradeMode value
     */
    public String upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgrade mode of the cluster when new Service Fabric runtime version is available.
       - Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon as it is available.
       - Manual - The cluster will not be automatically upgraded to the latest Service Fabric runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     . Possible values include: 'Automatic', 'Manual'.
     *
     * @param upgradeMode the upgradeMode value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Get the VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     *
     * @return the vmImage value
     */
    public String vmImage() {
        return this.vmImage;
    }

    /**
     * Set the VM image VMSS has been configured with. Generic names such as Windows or Linux can be used.
     *
     * @param vmImage the vmImage value to set
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmImage(String vmImage) {
        this.vmImage = vmImage;
        return this;
    }

}
