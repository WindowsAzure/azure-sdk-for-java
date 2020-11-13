/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.ClusterInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.AVSManager;
import java.util.List;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Indexable, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<AVSManager> {
    /**
     * @return the clusterId value.
     */
    Integer clusterId();

    /**
     * @return the clusterSize value.
     */
    Integer clusterSize();

    /**
     * @return the hosts value.
     */
    List<String> hosts();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ClusterProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPrivateCloud, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Cluster definition.
         */
        interface Blank extends WithPrivateCloud {
        }

        /**
         * The stage of the cluster definition allowing to specify PrivateCloud.
         */
        interface WithPrivateCloud {
           /**
            * Specifies resourceGroupName, privateCloudName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param privateCloudName The name of the private cloud
            * @return the next definition stage
            */
            WithSku withExistingPrivateCloud(String resourceGroupName, String privateCloudName);
        }

        /**
         * The stage of the cluster definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The cluster SKU
            * @return the next definition stage
            */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the cluster definition allowing to specify ClusterSize.
         */
        interface WithClusterSize {
            /**
             * Specifies clusterSize.
             * @param clusterSize The cluster size
             * @return the next definition stage
             */
            WithCreate withClusterSize(Integer clusterSize);
        }

        /**
         * The stage of the cluster definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The state of the cluster provisioning. Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Deleting', 'Updating'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(ClusterProvisioningState provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster>, DefinitionStages.WithClusterSize, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, UpdateStages.WithClusterSize {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify ClusterSize.
         */
        interface WithClusterSize {
            /**
             * Specifies clusterSize.
             * @param clusterSize The cluster size
             * @return the next update stage
             */
            Update withClusterSize(Integer clusterSize);
        }

    }
}
