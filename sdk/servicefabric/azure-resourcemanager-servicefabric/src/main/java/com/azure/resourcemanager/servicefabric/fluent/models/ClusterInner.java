// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.models.AddOnFeatures;
import com.azure.resourcemanager.servicefabric.models.AzureActiveDirectory;
import com.azure.resourcemanager.servicefabric.models.CertificateDescription;
import com.azure.resourcemanager.servicefabric.models.ClientCertificateCommonName;
import com.azure.resourcemanager.servicefabric.models.ClientCertificateThumbprint;
import com.azure.resourcemanager.servicefabric.models.ClusterState;
import com.azure.resourcemanager.servicefabric.models.ClusterUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.ClusterVersionDetails;
import com.azure.resourcemanager.servicefabric.models.DiagnosticsStorageAccountConfig;
import com.azure.resourcemanager.servicefabric.models.NodeTypeDescription;
import com.azure.resourcemanager.servicefabric.models.ProvisioningState;
import com.azure.resourcemanager.servicefabric.models.ReliabilityLevel;
import com.azure.resourcemanager.servicefabric.models.ServerCertificateCommonNames;
import com.azure.resourcemanager.servicefabric.models.SettingsSectionDescription;
import com.azure.resourcemanager.servicefabric.models.UpgradeMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The cluster resource properties. */
@JsonFlatten
@Fluent
public class ClusterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterInner.class);

    /*
     * The list of add-on features to enable in the cluster.
     */
    @JsonProperty(value = "properties.addOnFeatures")
    private List<AddOnFeatures> addOnFeatures;

    /*
     * The Service Fabric runtime versions available for this cluster.
     */
    @JsonProperty(value = "properties.availableClusterVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ClusterVersionDetails> availableClusterVersions;

    /*
     * The AAD authentication settings of the cluster.
     */
    @JsonProperty(value = "properties.azureActiveDirectory")
    private AzureActiveDirectory azureActiveDirectory;

    /*
     * The certificate to use for securing the cluster. The certificate
     * provided will be used for node to node security within the cluster, SSL
     * certificate for cluster management endpoint and default admin client.
     */
    @JsonProperty(value = "properties.certificate")
    private CertificateDescription certificate;

    /*
     * Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     */
    @JsonProperty(value = "properties.certificateCommonNames")
    private ServerCertificateCommonNames certificateCommonNames;

    /*
     * The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     */
    @JsonProperty(value = "properties.clientCertificateCommonNames")
    private List<ClientCertificateCommonName> clientCertificateCommonNames;

    /*
     * The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     */
    @JsonProperty(value = "properties.clientCertificateThumbprints")
    private List<ClientCertificateThumbprint> clientCertificateThumbprints;

    /*
     * The Service Fabric runtime version of the cluster. This property can
     * only by set the user when **upgradeMode** is set to 'Manual'. To get
     * list of available Service Fabric versions for new clusters use
     * [ClusterVersion API](./ClusterVersion.md). To get the list of available
     * version for existing clusters use **availableClusterVersions**.
     */
    @JsonProperty(value = "properties.clusterCodeVersion")
    private String clusterCodeVersion;

    /*
     * The Azure Resource Provider endpoint. A system service in the cluster
     * connects to this  endpoint.
     */
    @JsonProperty(value = "properties.clusterEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterEndpoint;

    /*
     * A service generated unique identifier for the cluster resource.
     */
    @JsonProperty(value = "properties.clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
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
     *
     */
    @JsonProperty(value = "properties.clusterState", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterState clusterState;

    /*
     * The storage account information for storing Service Fabric diagnostic
     * logs.
     */
    @JsonProperty(value = "properties.diagnosticsStorageAccountConfig")
    private DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig;

    /*
     * Indicates if the event store service is enabled.
     */
    @JsonProperty(value = "properties.eventStoreServiceEnabled")
    private Boolean eventStoreServiceEnabled;

    /*
     * The list of custom fabric settings to configure the cluster.
     */
    @JsonProperty(value = "properties.fabricSettings")
    private List<SettingsSectionDescription> fabricSettings;

    /*
     * The http management endpoint of the cluster.
     */
    @JsonProperty(value = "properties.managementEndpoint")
    private String managementEndpoint;

    /*
     * The list of node types in the cluster.
     */
    @JsonProperty(value = "properties.nodeTypes")
    private List<NodeTypeDescription> nodeTypes;

    /*
     * The provisioning state of the cluster resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
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
     *
     */
    @JsonProperty(value = "properties.reliabilityLevel")
    private ReliabilityLevel reliabilityLevel;

    /*
     * The server certificate used by reverse proxy.
     */
    @JsonProperty(value = "properties.reverseProxyCertificate")
    private CertificateDescription reverseProxyCertificate;

    /*
     * Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     */
    @JsonProperty(value = "properties.reverseProxyCertificateCommonNames")
    private ServerCertificateCommonNames reverseProxyCertificateCommonNames;

    /*
     * The policy to use when upgrading the cluster.
     */
    @JsonProperty(value = "properties.upgradeDescription")
    private ClusterUpgradePolicy upgradeDescription;

    /*
     * The upgrade mode of the cluster when new Service Fabric runtime version
     * is available.
     *
     * - Automatic - The cluster will be automatically upgraded to the latest
     * Service Fabric runtime version as soon as it is available.
     * - Manual - The cluster will not be automatically upgraded to the latest
     * Service Fabric runtime version. The cluster is upgraded by setting the
     * **clusterCodeVersion** property in the cluster resource.
     *
     */
    @JsonProperty(value = "properties.upgradeMode")
    private UpgradeMode upgradeMode;

    /*
     * The VM image VMSS has been configured with. Generic names such as
     * Windows or Linux can be used.
     */
    @JsonProperty(value = "properties.vmImage")
    private String vmImage;

    /*
     * Azure resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the addOnFeatures property: The list of add-on features to enable in the cluster.
     *
     * @return the addOnFeatures value.
     */
    public List<AddOnFeatures> addOnFeatures() {
        return this.addOnFeatures;
    }

    /**
     * Set the addOnFeatures property: The list of add-on features to enable in the cluster.
     *
     * @param addOnFeatures the addOnFeatures value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAddOnFeatures(List<AddOnFeatures> addOnFeatures) {
        this.addOnFeatures = addOnFeatures;
        return this;
    }

    /**
     * Get the availableClusterVersions property: The Service Fabric runtime versions available for this cluster.
     *
     * @return the availableClusterVersions value.
     */
    public List<ClusterVersionDetails> availableClusterVersions() {
        return this.availableClusterVersions;
    }

    /**
     * Get the azureActiveDirectory property: The AAD authentication settings of the cluster.
     *
     * @return the azureActiveDirectory value.
     */
    public AzureActiveDirectory azureActiveDirectory() {
        return this.azureActiveDirectory;
    }

    /**
     * Set the azureActiveDirectory property: The AAD authentication settings of the cluster.
     *
     * @param azureActiveDirectory the azureActiveDirectory value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory) {
        this.azureActiveDirectory = azureActiveDirectory;
        return this;
    }

    /**
     * Get the certificate property: The certificate to use for securing the cluster. The certificate provided will be
     * used for node to node security within the cluster, SSL certificate for cluster management endpoint and default
     * admin client.
     *
     * @return the certificate value.
     */
    public CertificateDescription certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: The certificate to use for securing the cluster. The certificate provided will be
     * used for node to node security within the cluster, SSL certificate for cluster management endpoint and default
     * admin client.
     *
     * @param certificate the certificate value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCertificate(CertificateDescription certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the certificateCommonNames property: Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     *
     * @return the certificateCommonNames value.
     */
    public ServerCertificateCommonNames certificateCommonNames() {
        return this.certificateCommonNames;
    }

    /**
     * Set the certificateCommonNames property: Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     *
     * @param certificateCommonNames the certificateCommonNames value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCertificateCommonNames(ServerCertificateCommonNames certificateCommonNames) {
        this.certificateCommonNames = certificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     *
     * @return the clientCertificateCommonNames value.
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }

    /**
     * Set the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateCommonNames(
        List<ClientCertificateCommonName> clientCertificateCommonNames) {
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     *
     * @return the clientCertificateThumbprints value.
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }

    /**
     * Set the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateThumbprints(
        List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        return this;
    }

    /**
     * Get the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This property can only by
     * set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new
     * clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing
     * clusters use **availableClusterVersions**.
     *
     * @return the clusterCodeVersion value.
     */
    public String clusterCodeVersion() {
        return this.clusterCodeVersion;
    }

    /**
     * Set the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This property can only by
     * set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new
     * clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing
     * clusters use **availableClusterVersions**.
     *
     * @param clusterCodeVersion the clusterCodeVersion value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
        return this;
    }

    /**
     * Get the clusterEndpoint property: The Azure Resource Provider endpoint. A system service in the cluster connects
     * to this endpoint.
     *
     * @return the clusterEndpoint value.
     */
    public String clusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * Get the clusterId property: A service generated unique identifier for the cluster resource.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the clusterState property: The current state of the cluster.
     *
     * <p>- WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for
     * Service Fabric VM extension to boot up and report to it. - Deploying - Indicates that the Service Fabric runtime
     * is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system
     * services are up. - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version.
     * This upgrade is automatically initiated when the cluster boots up for the first time. - UpdatingUserConfiguration
     * - Indicates that the cluster is being upgraded with the user provided configuration. - UpdatingUserCertificate -
     * Indicates that the cluster is being upgraded with the user provided certificate. - UpdatingInfrastructure -
     * Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only
     * when the **upgradeMode** is set to 'Automatic'. - EnforcingClusterVersion - Indicates that cluster is on a
     * different version than expected and the cluster is being upgraded to the expected version. -
     * UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource
     * Provider. Clusters in this state cannot be managed by the Resource Provider. - AutoScale - Indicates that the
     * ReliabilityLevel of the cluster is being adjusted. - Ready - Indicates that the cluster is in a stable state.
     *
     * @return the clusterState value.
     */
    public ClusterState clusterState() {
        return this.clusterState;
    }

    /**
     * Get the diagnosticsStorageAccountConfig property: The storage account information for storing Service Fabric
     * diagnostic logs.
     *
     * @return the diagnosticsStorageAccountConfig value.
     */
    public DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig() {
        return this.diagnosticsStorageAccountConfig;
    }

    /**
     * Set the diagnosticsStorageAccountConfig property: The storage account information for storing Service Fabric
     * diagnostic logs.
     *
     * @param diagnosticsStorageAccountConfig the diagnosticsStorageAccountConfig value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withDiagnosticsStorageAccountConfig(
        DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig) {
        this.diagnosticsStorageAccountConfig = diagnosticsStorageAccountConfig;
        return this;
    }

    /**
     * Get the eventStoreServiceEnabled property: Indicates if the event store service is enabled.
     *
     * @return the eventStoreServiceEnabled value.
     */
    public Boolean eventStoreServiceEnabled() {
        return this.eventStoreServiceEnabled;
    }

    /**
     * Set the eventStoreServiceEnabled property: Indicates if the event store service is enabled.
     *
     * @param eventStoreServiceEnabled the eventStoreServiceEnabled value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEventStoreServiceEnabled(Boolean eventStoreServiceEnabled) {
        this.eventStoreServiceEnabled = eventStoreServiceEnabled;
        return this;
    }

    /**
     * Get the fabricSettings property: The list of custom fabric settings to configure the cluster.
     *
     * @return the fabricSettings value.
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.fabricSettings;
    }

    /**
     * Set the fabricSettings property: The list of custom fabric settings to configure the cluster.
     *
     * @param fabricSettings the fabricSettings value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        this.fabricSettings = fabricSettings;
        return this;
    }

    /**
     * Get the managementEndpoint property: The http management endpoint of the cluster.
     *
     * @return the managementEndpoint value.
     */
    public String managementEndpoint() {
        return this.managementEndpoint;
    }

    /**
     * Set the managementEndpoint property: The http management endpoint of the cluster.
     *
     * @param managementEndpoint the managementEndpoint value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withManagementEndpoint(String managementEndpoint) {
        this.managementEndpoint = managementEndpoint;
        return this;
    }

    /**
     * Get the nodeTypes property: The list of node types in the cluster.
     *
     * @return the nodeTypes value.
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the nodeTypes property: The list of node types in the cluster.
     *
     * @param nodeTypes the nodeTypes value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the cluster resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the reliabilityLevel property: The reliability level sets the replica set size of system services. Learn
     * about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- None - Run the System services with a target replica set count of 1. This should only be used for test
     * clusters. - Bronze - Run the System services with a target replica set count of 3. This should only be used for
     * test clusters. - Silver - Run the System services with a target replica set count of 5. - Gold - Run the System
     * services with a target replica set count of 7. - Platinum - Run the System services with a target replica set
     * count of 9.
     *
     * @return the reliabilityLevel value.
     */
    public ReliabilityLevel reliabilityLevel() {
        return this.reliabilityLevel;
    }

    /**
     * Set the reliabilityLevel property: The reliability level sets the replica set size of system services. Learn
     * about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- None - Run the System services with a target replica set count of 1. This should only be used for test
     * clusters. - Bronze - Run the System services with a target replica set count of 3. This should only be used for
     * test clusters. - Silver - Run the System services with a target replica set count of 5. - Gold - Run the System
     * services with a target replica set count of 7. - Platinum - Run the System services with a target replica set
     * count of 9.
     *
     * @param reliabilityLevel the reliabilityLevel value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReliabilityLevel(ReliabilityLevel reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
        return this;
    }

    /**
     * Get the reverseProxyCertificate property: The server certificate used by reverse proxy.
     *
     * @return the reverseProxyCertificate value.
     */
    public CertificateDescription reverseProxyCertificate() {
        return this.reverseProxyCertificate;
    }

    /**
     * Set the reverseProxyCertificate property: The server certificate used by reverse proxy.
     *
     * @param reverseProxyCertificate the reverseProxyCertificate value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        this.reverseProxyCertificate = reverseProxyCertificate;
        return this;
    }

    /**
     * Get the reverseProxyCertificateCommonNames property: Describes a list of server certificates referenced by common
     * name that are used to secure the cluster.
     *
     * @return the reverseProxyCertificateCommonNames value.
     */
    public ServerCertificateCommonNames reverseProxyCertificateCommonNames() {
        return this.reverseProxyCertificateCommonNames;
    }

    /**
     * Set the reverseProxyCertificateCommonNames property: Describes a list of server certificates referenced by common
     * name that are used to secure the cluster.
     *
     * @param reverseProxyCertificateCommonNames the reverseProxyCertificateCommonNames value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReverseProxyCertificateCommonNames(
        ServerCertificateCommonNames reverseProxyCertificateCommonNames) {
        this.reverseProxyCertificateCommonNames = reverseProxyCertificateCommonNames;
        return this;
    }

    /**
     * Get the upgradeDescription property: The policy to use when upgrading the cluster.
     *
     * @return the upgradeDescription value.
     */
    public ClusterUpgradePolicy upgradeDescription() {
        return this.upgradeDescription;
    }

    /**
     * Set the upgradeDescription property: The policy to use when upgrading the cluster.
     *
     * @param upgradeDescription the upgradeDescription value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

    /**
     * Get the upgradeMode property: The upgrade mode of the cluster when new Service Fabric runtime version is
     * available.
     *
     * <p>- Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon
     * as it is available. - Manual - The cluster will not be automatically upgraded to the latest Service Fabric
     * runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     *
     * @return the upgradeMode value.
     */
    public UpgradeMode upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgradeMode property: The upgrade mode of the cluster when new Service Fabric runtime version is
     * available.
     *
     * <p>- Automatic - The cluster will be automatically upgraded to the latest Service Fabric runtime version as soon
     * as it is available. - Manual - The cluster will not be automatically upgraded to the latest Service Fabric
     * runtime version. The cluster is upgraded by setting the **clusterCodeVersion** property in the cluster resource.
     *
     * @param upgradeMode the upgradeMode value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeMode(UpgradeMode upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Get the vmImage property: The VM image VMSS has been configured with. Generic names such as Windows or Linux can
     * be used.
     *
     * @return the vmImage value.
     */
    public String vmImage() {
        return this.vmImage;
    }

    /**
     * Set the vmImage property: The VM image VMSS has been configured with. Generic names such as Windows or Linux can
     * be used.
     *
     * @param vmImage the vmImage value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmImage(String vmImage) {
        this.vmImage = vmImage;
        return this;
    }

    /**
     * Get the etag property: Azure resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availableClusterVersions() != null) {
            availableClusterVersions().forEach(e -> e.validate());
        }
        if (azureActiveDirectory() != null) {
            azureActiveDirectory().validate();
        }
        if (certificate() != null) {
            certificate().validate();
        }
        if (certificateCommonNames() != null) {
            certificateCommonNames().validate();
        }
        if (clientCertificateCommonNames() != null) {
            clientCertificateCommonNames().forEach(e -> e.validate());
        }
        if (clientCertificateThumbprints() != null) {
            clientCertificateThumbprints().forEach(e -> e.validate());
        }
        if (diagnosticsStorageAccountConfig() != null) {
            diagnosticsStorageAccountConfig().validate();
        }
        if (fabricSettings() != null) {
            fabricSettings().forEach(e -> e.validate());
        }
        if (nodeTypes() != null) {
            nodeTypes().forEach(e -> e.validate());
        }
        if (reverseProxyCertificate() != null) {
            reverseProxyCertificate().validate();
        }
        if (reverseProxyCertificateCommonNames() != null) {
            reverseProxyCertificateCommonNames().validate();
        }
        if (upgradeDescription() != null) {
            upgradeDescription().validate();
        }
    }
}
