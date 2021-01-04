// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.search.models.HostingMode;
import com.azure.resourcemanager.search.models.Identity;
import com.azure.resourcemanager.search.models.NetworkRuleSet;
import com.azure.resourcemanager.search.models.ProvisioningState;
import com.azure.resourcemanager.search.models.PublicNetworkAccess;
import com.azure.resourcemanager.search.models.SearchServiceStatus;
import com.azure.resourcemanager.search.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes an Azure Cognitive Search service and its current state. */
@JsonFlatten
@Fluent
public class SearchServiceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SearchServiceInner.class);

    /*
     * The SKU of the Search Service, which determines price tier and capacity
     * limits. This property is required when creating a new Search Service.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The number of replicas in the search service. If specified, it must be a
     * value between 1 and 12 inclusive for standard SKUs or between 1 and 3
     * inclusive for basic SKU.
     */
    @JsonProperty(value = "properties.replicaCount")
    private Integer replicaCount;

    /*
     * The number of partitions in the search service; if specified, it can be
     * 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard
     * SKUs. For 'standard3' services with hostingMode set to 'highDensity',
     * the allowed values are between 1 and 3.
     */
    @JsonProperty(value = "properties.partitionCount")
    private Integer partitionCount;

    /*
     * Applicable only for the standard3 SKU. You can set this property to
     * enable up to 3 high density partitions that allow up to 1000 indexes,
     * which is much higher than the maximum indexes allowed for any other SKU.
     * For the standard3 SKU, the value is either 'default' or 'highDensity'.
     * For all other SKUs, this value must be 'default'.
     */
    @JsonProperty(value = "properties.hostingMode")
    private HostingMode hostingMode;

    /*
     * This value can be set to 'enabled' to avoid breaking changes on existing
     * customer resources and templates. If set to 'disabled', traffic over
     * public interface is not allowed, and private endpoint connections would
     * be the exclusive access method.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The status of the search service. Possible values include: 'running':
     * The search service is running and no provisioning operations are
     * underway. 'provisioning': The search service is being provisioned or
     * scaled up or down. 'deleting': The search service is being deleted.
     * 'degraded': The search service is degraded. This can occur when the
     * underlying search units are not healthy. The search service is most
     * likely operational, but performance might be slow and some requests
     * might be dropped. 'disabled': The search service is disabled. In this
     * state, the service will reject all API requests. 'error': The search
     * service is in an error state. If your service is in the degraded,
     * disabled, or error states, it means the Azure Cognitive Search team is
     * actively investigating the underlying issue. Dedicated services in these
     * states are still chargeable based on the number of search units
     * provisioned.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private SearchServiceStatus status;

    /*
     * The details of the search service status.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * The state of the last provisioning operation performed on the search
     * service. Provisioning is an intermediate state that occurs while service
     * capacity is being established. After capacity is set up,
     * provisioningState changes to either 'succeeded' or 'failed'. Client
     * applications can poll provisioning status (the recommended polling
     * interval is from 30 seconds to one minute) by using the Get Search
     * Service operation to see when an operation is completed. If you are
     * using the free service, this value tends to come back as 'succeeded'
     * directly in the call to Create search service. This is because the free
     * service uses capacity that is already set up.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Network specific rules that determine how the Azure Cognitive Search
     * service may be reached.
     */
    @JsonProperty(value = "properties.networkRuleSet")
    private NetworkRuleSet networkRuleSet;

    /*
     * The list of private endpoint connections to the Azure Cognitive Search
     * service.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The list of shared private link resources managed by the Azure Cognitive
     * Search service.
     */
    @JsonProperty(value = "properties.sharedPrivateLinkResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources;

    /**
     * Get the sku property: The SKU of the Search Service, which determines price tier and capacity limits. This
     * property is required when creating a new Search Service.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Search Service, which determines price tier and capacity limits. This
     * property is required when creating a new Search Service.
     *
     * @param sku the sku value to set.
     * @return the SearchServiceInner object itself.
     */
    public SearchServiceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the SearchServiceInner object itself.
     */
    public SearchServiceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the replicaCount property: The number of replicas in the search service. If specified, it must be a value
     * between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     *
     * @return the replicaCount value.
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the replicaCount property: The number of replicas in the search service. If specified, it must be a value
     * between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU.
     *
     * @param replicaCount the replicaCount value to set.
     * @return the SearchServiceInner object itself.
     */
    public SearchServiceInner withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the partitionCount property: The number of partitions in the search service; if specified, it can be 1, 2, 3,
     * 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode
     * set to 'highDensity', the allowed values are between 1 and 3.
     *
     * @return the partitionCount value.
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the partitionCount property: The number of partitions in the search service; if specified, it can be 1, 2, 3,
     * 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode
     * set to 'highDensity', the allowed values are between 1 and 3.
     *
     * @param partitionCount the partitionCount value to set.
     * @return the SearchServiceInner object itself.
     */
    public SearchServiceInner withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the hostingMode property: Applicable only for the standard3 SKU. You can set this property to enable up to 3
     * high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for
     * any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this
     * value must be 'default'.
     *
     * @return the hostingMode value.
     */
    public HostingMode hostingMode() {
        return this.hostingMode;
    }

    /**
     * Set the hostingMode property: Applicable only for the standard3 SKU. You can set this property to enable up to 3
     * high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for
     * any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this
     * value must be 'default'.
     *
     * @param hostingMode the hostingMode value to set.
     * @return the SearchServiceInner object itself.
     */
    public SearchServiceInner withHostingMode(HostingMode hostingMode) {
        this.hostingMode = hostingMode;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This value can be set to 'enabled' to avoid breaking changes on existing
     * customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private
     * endpoint connections would be the exclusive access method.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This value can be set to 'enabled' to avoid breaking changes on existing
     * customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private
     * endpoint connections would be the exclusive access method.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the SearchServiceInner object itself.
     */
    public SearchServiceInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the status property: The status of the search service. Possible values include: 'running': The search service
     * is running and no provisioning operations are underway. 'provisioning': The search service is being provisioned
     * or scaled up or down. 'deleting': The search service is being deleted. 'degraded': The search service is
     * degraded. This can occur when the underlying search units are not healthy. The search service is most likely
     * operational, but performance might be slow and some requests might be dropped. 'disabled': The search service is
     * disabled. In this state, the service will reject all API requests. 'error': The search service is in an error
     * state. If your service is in the degraded, disabled, or error states, it means the Azure Cognitive Search team is
     * actively investigating the underlying issue. Dedicated services in these states are still chargeable based on the
     * number of search units provisioned.
     *
     * @return the status value.
     */
    public SearchServiceStatus status() {
        return this.status;
    }

    /**
     * Get the statusDetails property: The details of the search service status.
     *
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the provisioningState property: The state of the last provisioning operation performed on the search service.
     * Provisioning is an intermediate state that occurs while service capacity is being established. After capacity is
     * set up, provisioningState changes to either 'succeeded' or 'failed'. Client applications can poll provisioning
     * status (the recommended polling interval is from 30 seconds to one minute) by using the Get Search Service
     * operation to see when an operation is completed. If you are using the free service, this value tends to come back
     * as 'succeeded' directly in the call to Create search service. This is because the free service uses capacity that
     * is already set up.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkRuleSet property: Network specific rules that determine how the Azure Cognitive Search service may
     * be reached.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: Network specific rules that determine how the Azure Cognitive Search service may
     * be reached.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the SearchServiceInner object itself.
     */
    public SearchServiceInner withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The list of private endpoint connections to the Azure Cognitive
     * Search service.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the sharedPrivateLinkResources property: The list of shared private link resources managed by the Azure
     * Cognitive Search service.
     *
     * @return the sharedPrivateLinkResources value.
     */
    public List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }

    /** {@inheritDoc} */
    @Override
    public SearchServiceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SearchServiceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (networkRuleSet() != null) {
            networkRuleSet().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (sharedPrivateLinkResources() != null) {
            sharedPrivateLinkResources().forEach(e -> e.validate());
        }
    }
}
