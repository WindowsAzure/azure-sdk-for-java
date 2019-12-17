/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ReplicationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;
import java.util.Map;

/**
 * Type representing Replication.
 */
public interface Replication extends HasInner<ReplicationInner>, Indexable, Refreshable<Replication>, Updatable<Replication.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the status value.
     */
    Status status();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Replication definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Replication definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Replication definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the replication definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithLocation withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the replication definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The location of the resource. This cannot be changed after the resource is created
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the replication definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Replication>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a Replication update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Replication>, UpdateStages.WithTags {
    }

    /**
     * Grouping of Replication update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the replication update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
