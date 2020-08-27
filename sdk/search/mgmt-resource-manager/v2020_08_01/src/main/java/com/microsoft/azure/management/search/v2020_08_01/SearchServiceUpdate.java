/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import java.util.List;
import com.microsoft.azure.management.search.v2020_08_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.management.search.v2020_08_01.implementation.SharedPrivateLinkResourceInner;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The parameters used to update an Azure Cognitive Search service.
 */
@JsonFlatten
public class SearchServiceUpdate extends ProxyResource {
    /**
     * The number of replicas in the Search service. If specified, it must be a
     * value between 1 and 12 inclusive for standard SKUs or between 1 and 3
     * inclusive for basic SKU.
     */
    @JsonProperty(value = "properties.replicaCount")
    private Integer replicaCount;

    /**
     * The number of partitions in the Search service; if specified, it can be
     * 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard
     * SKUs. For 'standard3' services with hostingMode set to 'highDensity',
     * the allowed values are between 1 and 3.
     */
    @JsonProperty(value = "properties.partitionCount")
    private Integer partitionCount;

    /**
     * Applicable only for the standard3 SKU. You can set this property to
     * enable up to 3 high density partitions that allow up to 1000 indexes,
     * which is much higher than the maximum indexes allowed for any other SKU.
     * For the standard3 SKU, the value is either 'default' or 'highDensity'.
     * For all other SKUs, this value must be 'default'. Possible values
     * include: 'default', 'highDensity'.
     */
    @JsonProperty(value = "properties.hostingMode")
    private HostingMode hostingMode;

    /**
     * This value can be set to 'enabled' to avoid breaking changes on existing
     * customer resources and templates. If set to 'disabled', traffic over
     * public interface is not allowed, and private endpoint connections would
     * be the exclusive access method. Possible values include: 'enabled',
     * 'disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * The status of the Search service. Possible values include: 'running':
     * The Search service is running and no provisioning operations are
     * underway. 'provisioning': The Search service is being provisioned or
     * scaled up or down. 'deleting': The Search service is being deleted.
     * 'degraded': The Search service is degraded. This can occur when the
     * underlying search units are not healthy. The Search service is most
     * likely operational, but performance might be slow and some requests
     * might be dropped. 'disabled': The Search service is disabled. In this
     * state, the service will reject all API requests. 'error': The Search
     * service is in an error state. If your service is in the degraded,
     * disabled, or error states, it means the Azure Cognitive Search team is
     * actively investigating the underlying issue. Dedicated services in these
     * states are still chargeable based on the number of search units
     * provisioned. Possible values include: 'running', 'provisioning',
     * 'deleting', 'degraded', 'disabled', 'error'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private SearchServiceStatus status;

    /**
     * The details of the Search service status.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /**
     * The state of the last provisioning operation performed on the Search
     * service. Provisioning is an intermediate state that occurs while service
     * capacity is being established. After capacity is set up,
     * provisioningState changes to either 'succeeded' or 'failed'. Client
     * applications can poll provisioning status (the recommended polling
     * interval is from 30 seconds to one minute) by using the Get Search
     * Service operation to see when an operation is completed. If you are
     * using the free service, this value tends to come back as 'succeeded'
     * directly in the call to Create Search service. This is because the free
     * service uses capacity that is already set up. Possible values include:
     * 'succeeded', 'provisioning', 'failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Network specific rules that determine how the Azure Cognitive Search
     * service may be reached.
     */
    @JsonProperty(value = "properties.networkRuleSet")
    private NetworkRuleSet networkRuleSet;

    /**
     * The list of private endpoint connections to the Azure Cognitive Search
     * service.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * The list of shared private link resources managed by the Azure Cognitive
     * Search service.
     */
    @JsonProperty(value = "properties.sharedPrivateLinkResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources;

    /**
     * The SKU of the Search Service, which determines price tier and capacity
     * limits. This property is required when creating a new Search Service.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The geographic location of the resource. This must be one of the
     * supported and registered Azure Geo Regions (for example, West US, East
     * US, Southeast Asia, and so forth). This property is required when
     * creating a new resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Tags to help categorize the resource in the Azure portal.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the number of replicas in the Search service. If specified, it must be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     *
     * @return the replicaCount value
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the number of replicas in the Search service. If specified, it must be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     *
     * @param replicaCount the replicaCount value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the number of partitions in the Search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode set to 'highDensity', the allowed values are between 1 and 3.
     *
     * @return the partitionCount value
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the number of partitions in the Search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode set to 'highDensity', the allowed values are between 1 and 3.
     *
     * @param partitionCount the partitionCount value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this value must be 'default'. Possible values include: 'default', 'highDensity'.
     *
     * @return the hostingMode value
     */
    public HostingMode hostingMode() {
        return this.hostingMode;
    }

    /**
     * Set applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this value must be 'default'. Possible values include: 'default', 'highDensity'.
     *
     * @param hostingMode the hostingMode value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withHostingMode(HostingMode hostingMode) {
        this.hostingMode = hostingMode;
        return this;
    }

    /**
     * Get this value can be set to 'enabled' to avoid breaking changes on existing customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method. Possible values include: 'enabled', 'disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set this value can be set to 'enabled' to avoid breaking changes on existing customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method. Possible values include: 'enabled', 'disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the status of the Search service. Possible values include: 'running': The Search service is running and no provisioning operations are underway. 'provisioning': The Search service is being provisioned or scaled up or down. 'deleting': The Search service is being deleted. 'degraded': The Search service is degraded. This can occur when the underlying search units are not healthy. The Search service is most likely operational, but performance might be slow and some requests might be dropped. 'disabled': The Search service is disabled. In this state, the service will reject all API requests. 'error': The Search service is in an error state. If your service is in the degraded, disabled, or error states, it means the Azure Cognitive Search team is actively investigating the underlying issue. Dedicated services in these states are still chargeable based on the number of search units provisioned. Possible values include: 'running', 'provisioning', 'deleting', 'degraded', 'disabled', 'error'.
     *
     * @return the status value
     */
    public SearchServiceStatus status() {
        return this.status;
    }

    /**
     * Get the details of the Search service status.
     *
     * @return the statusDetails value
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the state of the last provisioning operation performed on the Search service. Provisioning is an intermediate state that occurs while service capacity is being established. After capacity is set up, provisioningState changes to either 'succeeded' or 'failed'. Client applications can poll provisioning status (the recommended polling interval is from 30 seconds to one minute) by using the Get Search Service operation to see when an operation is completed. If you are using the free service, this value tends to come back as 'succeeded' directly in the call to Create Search service. This is because the free service uses capacity that is already set up. Possible values include: 'succeeded', 'provisioning', 'failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get network specific rules that determine how the Azure Cognitive Search service may be reached.
     *
     * @return the networkRuleSet value
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set network specific rules that determine how the Azure Cognitive Search service may be reached.
     *
     * @param networkRuleSet the networkRuleSet value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the list of private endpoint connections to the Azure Cognitive Search service.
     *
     * @return the privateEndpointConnections value
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the list of shared private link resources managed by the Azure Cognitive Search service.
     *
     * @return the sharedPrivateLinkResources value
     */
    public List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /**
     * Get the SKU of the Search Service, which determines price tier and capacity limits. This property is required when creating a new Search Service.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the Search Service, which determines price tier and capacity limits. This property is required when creating a new Search Service.
     *
     * @param sku the sku value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the geographic location of the resource. This must be one of the supported and registered Azure Geo Regions (for example, West US, East US, Southeast Asia, and so forth). This property is required when creating a new resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the geographic location of the resource. This must be one of the supported and registered Azure Geo Regions (for example, West US, East US, Southeast Asia, and so forth). This property is required when creating a new resource.
     *
     * @param location the location value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get tags to help categorize the resource in the Azure portal.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set tags to help categorize the resource in the Azure portal.
     *
     * @param tags the tags value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity of the resource.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the resource.
     *
     * @param identity the identity value to set
     * @return the SearchServiceUpdate object itself.
     */
    public SearchServiceUpdate withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

}
