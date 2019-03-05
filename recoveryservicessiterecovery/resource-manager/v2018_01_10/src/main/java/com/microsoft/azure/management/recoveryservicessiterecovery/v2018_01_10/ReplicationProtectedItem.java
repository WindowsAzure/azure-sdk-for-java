/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation.ReplicationProtectedItemInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation.RecoveryServicesManager;
import java.util.List;

/**
 * Type representing ReplicationProtectedItem.
 */
public interface ReplicationProtectedItem extends HasInner<ReplicationProtectedItemInner>, Indexable, Refreshable<ReplicationProtectedItem>, Updatable<ReplicationProtectedItem.Update>, HasManager<RecoveryServicesManager> {
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
     * @return the properties value.
     */
    ReplicationProtectedItemProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ReplicationProtectedItem definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithReplicationProtectionContainer, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ReplicationProtectedItem definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ReplicationProtectedItem definition.
         */
        interface Blank extends WithReplicationProtectionContainer {
        }

        /**
         * The stage of the replicationprotecteditem definition allowing to specify ReplicationProtectionContainer.
         */
        interface WithReplicationProtectionContainer {
           /**
            * Specifies fabricName, protectionContainerName.
            * @param fabricName Name of the fabric
            * @param protectionContainerName Protection container name
            * @return the next definition stage
            */
            WithProperties withExistingReplicationProtectionContainer(String fabricName, String protectionContainerName);
        }

        /**
         * The stage of the replicationprotecteditem definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Enable protection input properties
            * @return the next definition stage
            */
            WithCreate withProperties(EnableProtectionInputProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ReplicationProtectedItem> {
        }
    }
    /**
     * The template for a ReplicationProtectedItem update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ReplicationProtectedItem>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of ReplicationProtectedItem update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the replicationprotecteditem update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Update replication protected item properties
             * @return the next update stage
             */
            Update withProperties(UpdateReplicationProtectedItemInputProperties properties);
        }

    }
}
