/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01.implementation;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Managed cluster.
 */
@JsonFlatten
public class ManagedClusterInner extends Resource {
    /**
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The max number of agent pools for the managed cluster.
     */
    @JsonProperty(value = "properties.maxAgentPools", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxAgentPools;

    /**
     * Version of Kubernetes specified when creating the managed cluster.
     */
    @JsonProperty(value = "properties.kubernetesVersion")
    private String kubernetesVersion;

    /**
     * DNS prefix specified when creating the managed cluster.
     */
    @JsonProperty(value = "properties.dnsPrefix")
    private String dnsPrefix;

    /**
     * FQDN for the master pool.
     */
    @JsonProperty(value = "properties.fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * FQDN of private cluster.
     */
    @JsonProperty(value = "properties.privateFQDN", access = JsonProperty.Access.WRITE_ONLY)
    private String privateFQDN;

    /**
     * Properties of the agent pool.
     */
    @JsonProperty(value = "properties.agentPoolProfiles")
    private List<ManagedClusterAgentPoolProfile> agentPoolProfiles;

    /**
     * Profile for Linux VMs in the container service cluster.
     */
    @JsonProperty(value = "properties.linuxProfile")
    private ContainerServiceLinuxProfile linuxProfile;

    /**
     * Profile for Windows VMs in the container service cluster.
     */
    @JsonProperty(value = "properties.windowsProfile")
    private ManagedClusterWindowsProfile windowsProfile;

    /**
     * Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs.
     */
    @JsonProperty(value = "properties.servicePrincipalProfile")
    private ManagedClusterServicePrincipalProfile servicePrincipalProfile;

    /**
     * Profile of managed cluster add-on.
     */
    @JsonProperty(value = "properties.addonProfiles")
    private Map<String, ManagedClusterAddonProfile> addonProfiles;

    /**
     * Name of the resource group containing agent pool nodes.
     */
    @JsonProperty(value = "properties.nodeResourceGroup")
    private String nodeResourceGroup;

    /**
     * Whether to enable Kubernetes Role-Based Access Control.
     */
    @JsonProperty(value = "properties.enableRBAC")
    private Boolean enableRBAC;

    /**
     * (DEPRECATING) Whether to enable Kubernetes pod security policy
     * (preview). This feature is set for removal on October 15th, 2020. Learn
     * more at aka.ms/aks/azpodpolicy.
     */
    @JsonProperty(value = "properties.enablePodSecurityPolicy")
    private Boolean enablePodSecurityPolicy;

    /**
     * Profile of network configuration.
     */
    @JsonProperty(value = "properties.networkProfile")
    private ContainerServiceNetworkProfile networkProfile;

    /**
     * Profile of Azure Active Directory configuration.
     */
    @JsonProperty(value = "properties.aadProfile")
    private ManagedClusterAADProfile aadProfile;

    /**
     * Parameters to be applied to the cluster-autoscaler when enabled.
     */
    @JsonProperty(value = "properties.autoScalerProfile")
    private ManagedClusterPropertiesAutoScalerProfile autoScalerProfile;

    /**
     * Access profile for managed cluster API server.
     */
    @JsonProperty(value = "properties.apiServerAccessProfile")
    private ManagedClusterAPIServerAccessProfile apiServerAccessProfile;

    /**
     * ResourceId of the disk encryption set to use for enabling encryption at
     * rest.
     */
    @JsonProperty(value = "properties.diskEncryptionSetID")
    private String diskEncryptionSetID;

    /**
     * Identities associated with the cluster.
     */
    @JsonProperty(value = "properties.identityProfile")
    private Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile;

    /**
     * The identity of the managed cluster, if configured.
     */
    @JsonProperty(value = "identity")
    private ManagedClusterIdentity identity;

    /**
     * The managed cluster SKU.
     */
    @JsonProperty(value = "sku")
    private ManagedClusterSKU sku;

    /**
     * Get the current deployment or provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the max number of agent pools for the managed cluster.
     *
     * @return the maxAgentPools value
     */
    public Integer maxAgentPools() {
        return this.maxAgentPools;
    }

    /**
     * Get version of Kubernetes specified when creating the managed cluster.
     *
     * @return the kubernetesVersion value
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set version of Kubernetes specified when creating the managed cluster.
     *
     * @param kubernetesVersion the kubernetesVersion value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get dNS prefix specified when creating the managed cluster.
     *
     * @return the dnsPrefix value
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }

    /**
     * Set dNS prefix specified when creating the managed cluster.
     *
     * @param dnsPrefix the dnsPrefix value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withDnsPrefix(String dnsPrefix) {
        this.dnsPrefix = dnsPrefix;
        return this;
    }

    /**
     * Get fQDN for the master pool.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get fQDN of private cluster.
     *
     * @return the privateFQDN value
     */
    public String privateFQDN() {
        return this.privateFQDN;
    }

    /**
     * Get properties of the agent pool.
     *
     * @return the agentPoolProfiles value
     */
    public List<ManagedClusterAgentPoolProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set properties of the agent pool.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAgentPoolProfiles(List<ManagedClusterAgentPoolProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

    /**
     * Get profile for Linux VMs in the container service cluster.
     *
     * @return the linuxProfile value
     */
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.linuxProfile;
    }

    /**
     * Set profile for Linux VMs in the container service cluster.
     *
     * @param linuxProfile the linuxProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        this.linuxProfile = linuxProfile;
        return this;
    }

    /**
     * Get profile for Windows VMs in the container service cluster.
     *
     * @return the windowsProfile value
     */
    public ManagedClusterWindowsProfile windowsProfile() {
        return this.windowsProfile;
    }

    /**
     * Set profile for Windows VMs in the container service cluster.
     *
     * @param windowsProfile the windowsProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withWindowsProfile(ManagedClusterWindowsProfile windowsProfile) {
        this.windowsProfile = windowsProfile;
        return this;
    }

    /**
     * Get information about a service principal identity for the cluster to use for manipulating Azure APIs.
     *
     * @return the servicePrincipalProfile value
     */
    public ManagedClusterServicePrincipalProfile servicePrincipalProfile() {
        return this.servicePrincipalProfile;
    }

    /**
     * Set information about a service principal identity for the cluster to use for manipulating Azure APIs.
     *
     * @param servicePrincipalProfile the servicePrincipalProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withServicePrincipalProfile(ManagedClusterServicePrincipalProfile servicePrincipalProfile) {
        this.servicePrincipalProfile = servicePrincipalProfile;
        return this;
    }

    /**
     * Get profile of managed cluster add-on.
     *
     * @return the addonProfiles value
     */
    public Map<String, ManagedClusterAddonProfile> addonProfiles() {
        return this.addonProfiles;
    }

    /**
     * Set profile of managed cluster add-on.
     *
     * @param addonProfiles the addonProfiles value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAddonProfiles(Map<String, ManagedClusterAddonProfile> addonProfiles) {
        this.addonProfiles = addonProfiles;
        return this;
    }

    /**
     * Get name of the resource group containing agent pool nodes.
     *
     * @return the nodeResourceGroup value
     */
    public String nodeResourceGroup() {
        return this.nodeResourceGroup;
    }

    /**
     * Set name of the resource group containing agent pool nodes.
     *
     * @param nodeResourceGroup the nodeResourceGroup value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withNodeResourceGroup(String nodeResourceGroup) {
        this.nodeResourceGroup = nodeResourceGroup;
        return this;
    }

    /**
     * Get whether to enable Kubernetes Role-Based Access Control.
     *
     * @return the enableRBAC value
     */
    public Boolean enableRBAC() {
        return this.enableRBAC;
    }

    /**
     * Set whether to enable Kubernetes Role-Based Access Control.
     *
     * @param enableRBAC the enableRBAC value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withEnableRBAC(Boolean enableRBAC) {
        this.enableRBAC = enableRBAC;
        return this;
    }

    /**
     * Get (DEPRECATING) Whether to enable Kubernetes pod security policy (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     *
     * @return the enablePodSecurityPolicy value
     */
    public Boolean enablePodSecurityPolicy() {
        return this.enablePodSecurityPolicy;
    }

    /**
     * Set (DEPRECATING) Whether to enable Kubernetes pod security policy (preview). This feature is set for removal on October 15th, 2020. Learn more at aka.ms/aks/azpodpolicy.
     *
     * @param enablePodSecurityPolicy the enablePodSecurityPolicy value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withEnablePodSecurityPolicy(Boolean enablePodSecurityPolicy) {
        this.enablePodSecurityPolicy = enablePodSecurityPolicy;
        return this;
    }

    /**
     * Get profile of network configuration.
     *
     * @return the networkProfile value
     */
    public ContainerServiceNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set profile of network configuration.
     *
     * @param networkProfile the networkProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withNetworkProfile(ContainerServiceNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get profile of Azure Active Directory configuration.
     *
     * @return the aadProfile value
     */
    public ManagedClusterAADProfile aadProfile() {
        return this.aadProfile;
    }

    /**
     * Set profile of Azure Active Directory configuration.
     *
     * @param aadProfile the aadProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAadProfile(ManagedClusterAADProfile aadProfile) {
        this.aadProfile = aadProfile;
        return this;
    }

    /**
     * Get parameters to be applied to the cluster-autoscaler when enabled.
     *
     * @return the autoScalerProfile value
     */
    public ManagedClusterPropertiesAutoScalerProfile autoScalerProfile() {
        return this.autoScalerProfile;
    }

    /**
     * Set parameters to be applied to the cluster-autoscaler when enabled.
     *
     * @param autoScalerProfile the autoScalerProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withAutoScalerProfile(ManagedClusterPropertiesAutoScalerProfile autoScalerProfile) {
        this.autoScalerProfile = autoScalerProfile;
        return this;
    }

    /**
     * Get access profile for managed cluster API server.
     *
     * @return the apiServerAccessProfile value
     */
    public ManagedClusterAPIServerAccessProfile apiServerAccessProfile() {
        return this.apiServerAccessProfile;
    }

    /**
     * Set access profile for managed cluster API server.
     *
     * @param apiServerAccessProfile the apiServerAccessProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withApiServerAccessProfile(ManagedClusterAPIServerAccessProfile apiServerAccessProfile) {
        this.apiServerAccessProfile = apiServerAccessProfile;
        return this;
    }

    /**
     * Get resourceId of the disk encryption set to use for enabling encryption at rest.
     *
     * @return the diskEncryptionSetID value
     */
    public String diskEncryptionSetID() {
        return this.diskEncryptionSetID;
    }

    /**
     * Set resourceId of the disk encryption set to use for enabling encryption at rest.
     *
     * @param diskEncryptionSetID the diskEncryptionSetID value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withDiskEncryptionSetID(String diskEncryptionSetID) {
        this.diskEncryptionSetID = diskEncryptionSetID;
        return this;
    }

    /**
     * Get identities associated with the cluster.
     *
     * @return the identityProfile value
     */
    public Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile() {
        return this.identityProfile;
    }

    /**
     * Set identities associated with the cluster.
     *
     * @param identityProfile the identityProfile value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withIdentityProfile(Map<String, ManagedClusterPropertiesIdentityProfileValue> identityProfile) {
        this.identityProfile = identityProfile;
        return this;
    }

    /**
     * Get the identity of the managed cluster, if configured.
     *
     * @return the identity value
     */
    public ManagedClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the managed cluster, if configured.
     *
     * @param identity the identity value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withIdentity(ManagedClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the managed cluster SKU.
     *
     * @return the sku value
     */
    public ManagedClusterSKU sku() {
        return this.sku;
    }

    /**
     * Set the managed cluster SKU.
     *
     * @param sku the sku value to set
     * @return the ManagedClusterInner object itself.
     */
    public ManagedClusterInner withSku(ManagedClusterSKU sku) {
        this.sku = sku;
        return this;
    }

}
