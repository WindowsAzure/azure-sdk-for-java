/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.search.v2020_08_01.implementation.SearchManager;
import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.search.v2020_08_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.management.search.v2020_08_01.implementation.SharedPrivateLinkResourceInner;
import com.microsoft.azure.management.search.v2020_08_01.implementation.SearchServiceInner;

/**
 * Type representing SearchService.
 */
public interface SearchService extends HasInner<SearchServiceInner>, Resource, GroupableResourceCore<SearchManager, SearchServiceInner>, HasResourceGroup, Refreshable<SearchService>, Updatable<SearchService.Update>, HasManager<SearchManager> {
    /**
     * @return the hostingMode value.
     */
    HostingMode hostingMode();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the networkRuleSet value.
     */
    NetworkRuleSet networkRuleSet();

    /**
     * @return the partitionCount value.
     */
    Integer partitionCount();

    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * @return the replicaCount value.
     */
    Integer replicaCount();

    /**
     * @return the sharedPrivateLinkResources value.
     */
    List<SharedPrivateLinkResource> sharedPrivateLinkResources();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the status value.
     */
    SearchServiceStatus status();

    /**
     * @return the statusDetails value.
     */
    String statusDetails();

    /**
     * The entirety of the SearchService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSearchManagementRequestOptions, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SearchService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SearchService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the SearchService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSearchManagementRequestOptions> {
        }

        /**
         * The stage of the searchservice definition allowing to specify SearchManagementRequestOptions.
         */
        interface WithSearchManagementRequestOptions {
           /**
            * Specifies searchManagementRequestOptions.
            * @param searchManagementRequestOptions Additional parameters for the operation
            * @return the next definition stage
*/
            WithCreate withSearchManagementRequestOptions(SearchManagementRequestOptions searchManagementRequestOptions);
        }

        /**
         * The stage of the searchservice definition allowing to specify HostingMode.
         */
        interface WithHostingMode {
            /**
             * Specifies hostingMode.
             * @param hostingMode Applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this value must be 'default'. Possible values include: 'default', 'highDensity'
             * @return the next definition stage
             */
            WithCreate withHostingMode(HostingMode hostingMode);
        }

        /**
         * The stage of the searchservice definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the resource
             * @return the next definition stage
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the searchservice definition allowing to specify NetworkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies networkRuleSet.
             * @param networkRuleSet Network specific rules that determine how the Azure Cognitive Search service may be reached
             * @return the next definition stage
             */
            WithCreate withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the searchservice definition allowing to specify PartitionCount.
         */
        interface WithPartitionCount {
            /**
             * Specifies partitionCount.
             * @param partitionCount The number of partitions in the Search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode set to 'highDensity', the allowed values are between 1 and 3
             * @return the next definition stage
             */
            WithCreate withPartitionCount(Integer partitionCount);
        }

        /**
         * The stage of the searchservice definition allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess This value can be set to 'enabled' to avoid breaking changes on existing customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method. Possible values include: 'enabled', 'disabled'
             * @return the next definition stage
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the searchservice definition allowing to specify ReplicaCount.
         */
        interface WithReplicaCount {
            /**
             * Specifies replicaCount.
             * @param replicaCount The number of replicas in the Search service. If specified, it must be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU
             * @return the next definition stage
             */
            WithCreate withReplicaCount(Integer replicaCount);
        }

        /**
         * The stage of the searchservice definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the Search Service, which determines price tier and capacity limits. This property is required when creating a new Search Service
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SearchService>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithHostingMode, DefinitionStages.WithIdentity, DefinitionStages.WithNetworkRuleSet, DefinitionStages.WithPartitionCount, DefinitionStages.WithPublicNetworkAccess, DefinitionStages.WithReplicaCount, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a SearchService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SearchService>, Resource.UpdateWithTags<Update>, UpdateStages.WithSearchManagementRequestOptions, UpdateStages.WithHostingMode, UpdateStages.WithIdentity, UpdateStages.WithNetworkRuleSet, UpdateStages.WithPartitionCount, UpdateStages.WithPublicNetworkAccess, UpdateStages.WithReplicaCount, UpdateStages.WithSku {
    }

    /**
     * Grouping of SearchService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the searchservice update allowing to specify SearchManagementRequestOptions.
         */
        interface WithSearchManagementRequestOptions {
            /**
             * Specifies searchManagementRequestOptions.
             * @param searchManagementRequestOptions Additional parameters for the operation
             * @return the next update stage
             */
            Update withSearchManagementRequestOptions(SearchManagementRequestOptions searchManagementRequestOptions);
        }

        /**
         * The stage of the searchservice update allowing to specify HostingMode.
         */
        interface WithHostingMode {
            /**
             * Specifies hostingMode.
             * @param hostingMode Applicable only for the standard3 SKU. You can set this property to enable up to 3 high density partitions that allow up to 1000 indexes, which is much higher than the maximum indexes allowed for any other SKU. For the standard3 SKU, the value is either 'default' or 'highDensity'. For all other SKUs, this value must be 'default'. Possible values include: 'default', 'highDensity'
             * @return the next update stage
             */
            Update withHostingMode(HostingMode hostingMode);
        }

        /**
         * The stage of the searchservice update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the resource
             * @return the next update stage
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the searchservice update allowing to specify NetworkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies networkRuleSet.
             * @param networkRuleSet Network specific rules that determine how the Azure Cognitive Search service may be reached
             * @return the next update stage
             */
            Update withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the searchservice update allowing to specify PartitionCount.
         */
        interface WithPartitionCount {
            /**
             * Specifies partitionCount.
             * @param partitionCount The number of partitions in the Search service; if specified, it can be 1, 2, 3, 4, 6, or 12. Values greater than 1 are only valid for standard SKUs. For 'standard3' services with hostingMode set to 'highDensity', the allowed values are between 1 and 3
             * @return the next update stage
             */
            Update withPartitionCount(Integer partitionCount);
        }

        /**
         * The stage of the searchservice update allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess This value can be set to 'enabled' to avoid breaking changes on existing customer resources and templates. If set to 'disabled', traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method. Possible values include: 'enabled', 'disabled'
             * @return the next update stage
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the searchservice update allowing to specify ReplicaCount.
         */
        interface WithReplicaCount {
            /**
             * Specifies replicaCount.
             * @param replicaCount The number of replicas in the Search service. If specified, it must be a value between 1 and 12 inclusive for standard SKUs or between 1 and 3 inclusive for basic SKU
             * @return the next update stage
             */
            Update withReplicaCount(Integer replicaCount);
        }

        /**
         * The stage of the searchservice update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the Search Service, which determines price tier and capacity limits. This property is required when creating a new Search Service
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

    }
}
