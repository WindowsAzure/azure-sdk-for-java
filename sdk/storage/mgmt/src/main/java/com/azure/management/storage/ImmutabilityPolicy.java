// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.fluentcore.arm.models.HasManager;
import com.azure.management.resources.fluentcore.model.Appliable;
import com.azure.management.resources.fluentcore.model.Creatable;
import com.azure.management.resources.fluentcore.model.HasInner;
import com.azure.management.resources.fluentcore.model.Indexable;
import com.azure.management.resources.fluentcore.model.Refreshable;
import com.azure.management.resources.fluentcore.model.Updatable;
import com.azure.management.storage.implementation.StorageManager;
import com.azure.management.storage.models.ImmutabilityPolicyInner;

/**
 * Type representing ImmutabilityPolicy.
 */
@Fluent
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
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithContainer, DefinitionStages.WithIfMatch, DefinitionStages.WithImmutabilityPeriodSinceCreationInDays, DefinitionStages.WithCreate {
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
             * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
             * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
             * @param containerName The name of the blob container within the specified storage account. Blob container names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number
             * @return the next definition stage
             */
            WithIfMatch withExistingContainer(String resourceGroupName, String accountName, String containerName);
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used to apply the operation only if the immutability policy already exists. If omitted, this operation will always be applied
             * @return the next definition stage
             */
            WithImmutabilityPeriodSinceCreationInDays withIfMatch(String ifMatch);
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify ImmutabilityPeriodSinceCreationInDays.
         */
        interface WithImmutabilityPeriodSinceCreationInDays {
            /**
             * Specifies immutabilityPeriodSinceCreationInDays.
             * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the policy creation, in days
             * @return the next definition stage
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
    interface Update extends Appliable<ImmutabilityPolicy>, UpdateStages.WithIfMatch, UpdateStages.WithImmutabilityPeriodSinceCreationInDays {
    }

    /**
     * Grouping of ImmutabilityPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the immutabilitypolicy update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used to apply the operation only if the immutability policy already exists. If omitted, this operation will always be applied
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the immutabilitypolicy update allowing to specify ImmutabilityPeriodSinceCreationInDays.
         */
        interface WithImmutabilityPeriodSinceCreationInDays {
            /**
             * Specifies immutabilityPeriodSinceCreationInDays.
             * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the policy creation, in days
             * @return the next update stage
             */
            Update withImmutabilityPeriodSinceCreationInDays(int immutabilityPeriodSinceCreationInDays);
        }

    }
}