/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.avs.v2019_08_09_preview.implementation.ClusterInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.avs.v2019_08_09_preview.implementation.AVSManager;
import java.util.List;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Indexable, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<AVSManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ClusterProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPrivateCloud, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
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
            * @param resourceGroupName Name of the resource group within the Azure subscription
            * @param privateCloudName The name of the private cloud
            * @return the next definition stage
            */
            WithProperties withExistingPrivateCloud(String resourceGroupName, String privateCloudName);
        }

        /**
         * The stage of the cluster definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties The properties of a cluster resource
            * @return the next definition stage
            */
            WithCreate withProperties(ClusterProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster> {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties The properties of a cluster resource
             * @return the next update stage
             */
            Update withProperties(ClusterProperties properties);
        }

    }
}
