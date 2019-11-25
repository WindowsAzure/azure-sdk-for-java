/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2018_02_01.implementation.ImmutabilityPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2018_02_01.implementation.StorageManager;

/**
 * Type representing ImmutabilityPolicy.
 */
public interface ImmutabilityPolicy extends HasInner<ImmutabilityPolicyInner>, Indexable, Refreshable<ImmutabilityPolicy>, Updatable<ImmutabilityPolicy.Update>, HasManager<StorageManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    int immutabilityPeriodSinceCreationInDays();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    ImmutabilityPolicyState state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ImmutabilityPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithContainer, DefinitionStages.WithImmutabilityPeriodSinceCreationInDays, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ImmutabilityPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ImmutabilityPolicy definition.
         */
        interface Blank extends WithContainer {
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify Container.
         */
        interface WithContainer {
           /**
            * Specifies resourceGroupName, accountName, containerName.
            */
            WithImmutabilityPeriodSinceCreationInDays withExistingContainer(String resourceGroupName, String accountName, String containerName);
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify ImmutabilityPeriodSinceCreationInDays.
         */
        interface WithImmutabilityPeriodSinceCreationInDays {
           /**
            * Specifies immutabilityPeriodSinceCreationInDays.
            */
            WithCreate withImmutabilityPeriodSinceCreationInDays(int immutabilityPeriodSinceCreationInDays);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ImmutabilityPolicy> {
        }
    }
    /**
     * The template for a ImmutabilityPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ImmutabilityPolicy>, UpdateStages.WithImmutabilityPeriodSinceCreationInDays {
    }

    /**
     * Grouping of ImmutabilityPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the immutabilitypolicy update allowing to specify ImmutabilityPeriodSinceCreationInDays.
         */
        interface WithImmutabilityPeriodSinceCreationInDays {
            /**
             * Specifies immutabilityPeriodSinceCreationInDays.
             */
            Update withImmutabilityPeriodSinceCreationInDays(int immutabilityPeriodSinceCreationInDays);
        }

    }
}
