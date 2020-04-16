/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Cluster update request.
 */
@JsonFlatten
public class ClusterUpdateParameters {
    /**
     * The reliability level sets the replica set size of system services.
     * Learn about
     * [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     * Possible values include: 'Bronze', 'Silver', 'Gold'.
     */
    @JsonProperty(value = "properties.reliabilityLevel")
    private String reliabilityLevel;

    /**
     * The upgrade mode of the cluster. This indicates if the cluster should be
     * automatically upgraded when new Service Fabric runtime version is
     * available. Possible values include: 'Automatic', 'Manual'.
     */
    @JsonProperty(value = "properties.upgradeMode")
    private String upgradeMode;

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
     * The certificate to use for securing the cluster. The certificate
     * provided will be used for  node to node security within the cluster, SSL
     * certificate for cluster management endpoint and default  admin client.
     */
    @JsonProperty(value = "properties.certificate")
    private CertificateDescription certificate;

    /**
     * The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster. This will overwrite the existing list.
     */
    @JsonProperty(value = "properties.clientCertificateThumbprints")
    private List<ClientCertificateThumbprint> clientCertificateThumbprints;

    /**
     * The list of client certificates referenced by common name that are
     * allowed to manage the cluster. This will overwrite the existing list.
     */
    @JsonProperty(value = "properties.clientCertificateCommonNames")
    private List<ClientCertificateCommonName> clientCertificateCommonNames;

    /**
     * The list of custom fabric settings to configure the cluster. This will
     * overwrite the existing list.
     */
    @JsonProperty(value = "properties.fabricSettings")
    private List<SettingsSectionDescription> fabricSettings;

    /**
     * The server certificate used by reverse proxy.
     */
    @JsonProperty(value = "properties.reverseProxyCertificate")
    private CertificateDescription reverseProxyCertificate;

    /**
     * The list of node types in the cluster. This will overwrite the existing
     * list.
     */
    @JsonProperty(value = "properties.nodeTypes")
    private List<NodeTypeDescription> nodeTypes;

    /**
     * The policy to use when upgrading the cluster.
     */
    @JsonProperty(value = "properties.upgradeDescription")
    private ClusterUpgradePolicy upgradeDescription;

    /**
     * The list of add-on features to enable in the cluster.
     */
    @JsonProperty(value = "properties.addOnFeatures")
    private List<String> addOnFeatures;

    /**
     * Cluster update parameters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity). Possible values include: 'Bronze', 'Silver', 'Gold'.
     *
     * @return the reliabilityLevel value
     */
    public String reliabilityLevel() {
        return this.reliabilityLevel;
    }

    /**
     * Set the reliability level sets the replica set size of system services. Learn about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity). Possible values include: 'Bronze', 'Silver', 'Gold'.
     *
     * @param reliabilityLevel the reliabilityLevel value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withReliabilityLevel(String reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
        return this;
    }

    /**
     * Get the upgrade mode of the cluster. This indicates if the cluster should be automatically upgraded when new Service Fabric runtime version is available. Possible values include: 'Automatic', 'Manual'.
     *
     * @return the upgradeMode value
     */
    public String upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgrade mode of the cluster. This indicates if the cluster should be automatically upgraded when new Service Fabric runtime version is available. Possible values include: 'Automatic', 'Manual'.
     *
     * @param upgradeMode the upgradeMode value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClusterCodeVersion(String clusterCodeVersion) {
        this.clusterCodeVersion = clusterCodeVersion;
        return this;
    }

    /**
     * Get the certificate to use for securing the cluster. The certificate provided will be used for  node to node security within the cluster, SSL certificate for cluster management endpoint and default  admin client.
     *
     * @return the certificate value
     */
    public CertificateDescription certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate to use for securing the cluster. The certificate provided will be used for  node to node security within the cluster, SSL certificate for cluster management endpoint and default  admin client.
     *
     * @param certificate the certificate value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withCertificate(CertificateDescription certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the list of client certificates referenced by thumbprint that are allowed to manage the cluster. This will overwrite the existing list.
     *
     * @return the clientCertificateThumbprints value
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.clientCertificateThumbprints;
    }

    /**
     * Set the list of client certificates referenced by thumbprint that are allowed to manage the cluster. This will overwrite the existing list.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClientCertificateThumbprints(List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        this.clientCertificateThumbprints = clientCertificateThumbprints;
        return this;
    }

    /**
     * Get the list of client certificates referenced by common name that are allowed to manage the cluster. This will overwrite the existing list.
     *
     * @return the clientCertificateCommonNames value
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.clientCertificateCommonNames;
    }

    /**
     * Set the list of client certificates referenced by common name that are allowed to manage the cluster. This will overwrite the existing list.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withClientCertificateCommonNames(List<ClientCertificateCommonName> clientCertificateCommonNames) {
        this.clientCertificateCommonNames = clientCertificateCommonNames;
        return this;
    }

    /**
     * Get the list of custom fabric settings to configure the cluster. This will overwrite the existing list.
     *
     * @return the fabricSettings value
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.fabricSettings;
    }

    /**
     * Set the list of custom fabric settings to configure the cluster. This will overwrite the existing list.
     *
     * @param fabricSettings the fabricSettings value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        this.fabricSettings = fabricSettings;
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        this.reverseProxyCertificate = reverseProxyCertificate;
        return this;
    }

    /**
     * Get the list of node types in the cluster. This will overwrite the existing list.
     *
     * @return the nodeTypes value
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the list of node types in the cluster. This will overwrite the existing list.
     *
     * @param nodeTypes the nodeTypes value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        this.nodeTypes = nodeTypes;
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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        this.upgradeDescription = upgradeDescription;
        return this;
    }

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
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withAddOnFeatures(List<String> addOnFeatures) {
        this.addOnFeatures = addOnFeatures;
        return this;
    }

    /**
     * Get cluster update parameters.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set cluster update parameters.
     *
     * @param tags the tags value to set
     * @return the ClusterUpdateParameters object itself.
     */
    public ClusterUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
