/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2019_11_09.implementation.KustoManager;
import java.util.List;
import com.microsoft.azure.management.kusto.v2019_11_09.implementation.ClusterInner;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Resource, GroupableResourceCore<KustoManager, ClusterInner>, HasResourceGroup, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<KustoManager> {
    /**
     * @return the dataIngestionUri value.
     */
    String dataIngestionUri();

    /**
     * @return the enableDiskEncryption value.
     */
    Boolean enableDiskEncryption();

    /**
     * @return the enableStreamingIngest value.
     */
    Boolean enableStreamingIngest();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the keyVaultProperties value.
     */
    KeyVaultProperties keyVaultProperties();

    /**
     * @return the optimizedAutoscale value.
     */
    OptimizedAutoscale optimizedAutoscale();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    AzureSku sku();

    /**
     * @return the state value.
     */
    State state();

    /**
     * @return the stateReason value.
     */
    String stateReason();

    /**
     * @return the trustedExternalTenants value.
     */
    List<TrustedExternalTenant> trustedExternalTenants();

    /**
     * @return the uri value.
     */
    String uri();

    /**
     * @return the virtualNetworkConfiguration value.
     */
    VirtualNetworkConfiguration virtualNetworkConfiguration();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Cluster definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Cluster definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the cluster definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The SKU of the cluster
            * @return the next definition stage
*/
            WithCreate withSku(AzureSku sku);
        }

        /**
         * The stage of the cluster definition allowing to specify EnableDiskEncryption.
         */
        interface WithEnableDiskEncryption {
            /**
             * Specifies enableDiskEncryption.
             * @param enableDiskEncryption A boolean value that indicates if the cluster's disks are encrypted
             * @return the next definition stage
             */
            WithCreate withEnableDiskEncryption(Boolean enableDiskEncryption);
        }

        /**
         * The stage of the cluster definition allowing to specify EnableStreamingIngest.
         */
        interface WithEnableStreamingIngest {
            /**
             * Specifies enableStreamingIngest.
             * @param enableStreamingIngest A boolean value that indicates if the streaming ingest is enabled
             * @return the next definition stage
             */
            WithCreate withEnableStreamingIngest(Boolean enableStreamingIngest);
        }

        /**
         * The stage of the cluster definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the cluster, if configured
             * @return the next definition stage
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the cluster definition allowing to specify KeyVaultProperties.
         */
        interface WithKeyVaultProperties {
            /**
             * Specifies keyVaultProperties.
             * @param keyVaultProperties KeyVault properties for the cluster encryption
             * @return the next definition stage
             */
            WithCreate withKeyVaultProperties(KeyVaultProperties keyVaultProperties);
        }

        /**
         * The stage of the cluster definition allowing to specify OptimizedAutoscale.
         */
        interface WithOptimizedAutoscale {
            /**
             * Specifies optimizedAutoscale.
             * @param optimizedAutoscale Optimized auto scale definition
             * @return the next definition stage
             */
            WithCreate withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale);
        }

        /**
         * The stage of the cluster definition allowing to specify TrustedExternalTenants.
         */
        interface WithTrustedExternalTenants {
            /**
             * Specifies trustedExternalTenants.
             * @param trustedExternalTenants The cluster's external tenants
             * @return the next definition stage
             */
            WithCreate withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants);
        }

        /**
         * The stage of the cluster definition allowing to specify VirtualNetworkConfiguration.
         */
        interface WithVirtualNetworkConfiguration {
            /**
             * Specifies virtualNetworkConfiguration.
             * @param virtualNetworkConfiguration Virtual network definition
             * @return the next definition stage
             */
            WithCreate withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration);
        }

        /**
         * The stage of the cluster definition allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones The availability zones of the cluster
             * @return the next definition stage
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEnableDiskEncryption, DefinitionStages.WithEnableStreamingIngest, DefinitionStages.WithIdentity, DefinitionStages.WithKeyVaultProperties, DefinitionStages.WithOptimizedAutoscale, DefinitionStages.WithTrustedExternalTenants, DefinitionStages.WithVirtualNetworkConfiguration, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, Resource.UpdateWithTags<Update>, UpdateStages.WithEnableDiskEncryption, UpdateStages.WithEnableStreamingIngest, UpdateStages.WithIdentity, UpdateStages.WithKeyVaultProperties, UpdateStages.WithOptimizedAutoscale, UpdateStages.WithSku, UpdateStages.WithTrustedExternalTenants, UpdateStages.WithVirtualNetworkConfiguration {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify EnableDiskEncryption.
         */
        interface WithEnableDiskEncryption {
            /**
             * Specifies enableDiskEncryption.
             * @param enableDiskEncryption A boolean value that indicates if the cluster's disks are encrypted
             * @return the next update stage
             */
            Update withEnableDiskEncryption(Boolean enableDiskEncryption);
        }

        /**
         * The stage of the cluster update allowing to specify EnableStreamingIngest.
         */
        interface WithEnableStreamingIngest {
            /**
             * Specifies enableStreamingIngest.
             * @param enableStreamingIngest A boolean value that indicates if the streaming ingest is enabled
             * @return the next update stage
             */
            Update withEnableStreamingIngest(Boolean enableStreamingIngest);
        }

        /**
         * The stage of the cluster update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the cluster, if configured
             * @return the next update stage
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the cluster update allowing to specify KeyVaultProperties.
         */
        interface WithKeyVaultProperties {
            /**
             * Specifies keyVaultProperties.
             * @param keyVaultProperties KeyVault properties for the cluster encryption
             * @return the next update stage
             */
            Update withKeyVaultProperties(KeyVaultProperties keyVaultProperties);
        }

        /**
         * The stage of the cluster update allowing to specify OptimizedAutoscale.
         */
        interface WithOptimizedAutoscale {
            /**
             * Specifies optimizedAutoscale.
             * @param optimizedAutoscale Optimized auto scale definition
             * @return the next update stage
             */
            Update withOptimizedAutoscale(OptimizedAutoscale optimizedAutoscale);
        }

        /**
         * The stage of the cluster update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the cluster
             * @return the next update stage
             */
            Update withSku(AzureSku sku);
        }

        /**
         * The stage of the cluster update allowing to specify TrustedExternalTenants.
         */
        interface WithTrustedExternalTenants {
            /**
             * Specifies trustedExternalTenants.
             * @param trustedExternalTenants The cluster's external tenants
             * @return the next update stage
             */
            Update withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants);
        }

        /**
         * The stage of the cluster update allowing to specify VirtualNetworkConfiguration.
         */
        interface WithVirtualNetworkConfiguration {
            /**
             * Specifies virtualNetworkConfiguration.
             * @param virtualNetworkConfiguration Virtual network definition
             * @return the next update stage
             */
            Update withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration);
        }

    }
}
