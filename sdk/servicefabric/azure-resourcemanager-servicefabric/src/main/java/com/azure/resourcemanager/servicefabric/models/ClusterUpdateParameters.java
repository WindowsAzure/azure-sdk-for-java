// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Cluster update request. */
@JsonFlatten
@Fluent
public class ClusterUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterUpdateParameters.class);

    /*
     * Cluster update parameters
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The list of add-on features to enable in the cluster.
     */
    @JsonProperty(value = "properties.addOnFeatures")
    private List<AddOnFeatures> addOnFeatures;

    /*
     * The certificate to use for securing the cluster. The certificate
     * provided will be used for  node to node security within the cluster, SSL
     * certificate for cluster management endpoint and default  admin client.
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
     * allowed to manage the cluster. This will overwrite the existing list.
     */
    @JsonProperty(value = "properties.clientCertificateCommonNames")
    private List<ClientCertificateCommonName> clientCertificateCommonNames;

    /*
     * The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster. This will overwrite the existing list.
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
     * Indicates if the event store service is enabled.
     */
    @JsonProperty(value = "properties.eventStoreServiceEnabled")
    private Boolean eventStoreServiceEnabled;

    /*
     * The list of custom fabric settings to configure the cluster. This will
     * overwrite the existing list.
     */
    @JsonProperty(value = "properties.fabricSettings")
    private List<SettingsSectionDescription> fabricSettings;

    /*
     * The list of node types in the cluster. This will overwrite the existing
     * list.
     */
    @JsonProperty(value = "properties.nodeTypes")
    private List<NodeTypeDescription> nodeTypes;

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

    /**
     * Get the tags property: Cluster update parameters.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Cluster update parameters.
     *
     * @param tags the tags value to set.
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withAddOnFeatures(List<AddOnFeatures> addOnFeatures) {
        this.addOnFeatures = addOnFeatures;
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withCertificate(CertificateDescription certificate) {
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withCertificateCommonNames(ServerCertificateCommonNames certificateCommonNames) {
        this.certificateCommonNames = certificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster. This will overwrite the existing list.
     *
     * @return the clientCertificateCommonNames value.
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }

    /**
     * Set the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster. This will overwrite the existing list.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set.
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClientCertificateCommonNames(
        List<ClientCertificateCommonName> clientCertificateCommonNames) {
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        return this;
    }

    /**
     * Get the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster. This will overwrite the existing list.
     *
     * @return the clientCertificateThumbprints value.
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }

    /**
     * Set the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster. This will overwrite the existing list.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set.
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClientCertificateThumbprints(
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withEventStoreServiceEnabled(Boolean eventStoreServiceEnabled) {
        this.eventStoreServiceEnabled = eventStoreServiceEnabled;
        return this;
    }

    /**
     * Get the fabricSettings property: The list of custom fabric settings to configure the cluster. This will overwrite
     * the existing list.
     *
     * @return the fabricSettings value.
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.fabricSettings;
    }

    /**
     * Set the fabricSettings property: The list of custom fabric settings to configure the cluster. This will overwrite
     * the existing list.
     *
     * @param fabricSettings the fabricSettings value to set.
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        this.fabricSettings = fabricSettings;
        return this;
    }

    /**
     * Get the nodeTypes property: The list of node types in the cluster. This will overwrite the existing list.
     *
     * @return the nodeTypes value.
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the nodeTypes property: The list of node types in the cluster. This will overwrite the existing list.
     *
     * @param nodeTypes the nodeTypes value to set.
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withReliabilityLevel(ReliabilityLevel reliabilityLevel) {
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        this.reverseProxyCertificate = reverseProxyCertificate;
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withUpgradeMode(UpgradeMode upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
        if (fabricSettings() != null) {
            fabricSettings().forEach(e -> e.validate());
        }
        if (nodeTypes() != null) {
            nodeTypes().forEach(e -> e.validate());
        }
        if (reverseProxyCertificate() != null) {
            reverseProxyCertificate().validate();
        }
        if (upgradeDescription() != null) {
            upgradeDescription().validate();
        }
    }
}
