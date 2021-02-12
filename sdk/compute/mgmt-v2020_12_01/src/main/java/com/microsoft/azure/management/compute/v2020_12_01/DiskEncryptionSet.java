/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.ComputeManager;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.DiskEncryptionSetInner;

/**
 * Type representing DiskEncryptionSet.
 */
public interface DiskEncryptionSet extends HasInner<DiskEncryptionSetInner>, Resource, GroupableResourceCore<ComputeManager, DiskEncryptionSetInner>, HasResourceGroup, Refreshable<DiskEncryptionSet>, Updatable<DiskEncryptionSet.Update>, HasManager<ComputeManager> {
    /**
     * @return the activeKey value.
     */
    KeyForDiskEncryptionSet activeKey();

    /**
     * @return the encryptionType value.
     */
    DiskEncryptionSetType encryptionType();

    /**
     * @return the identity value.
     */
    EncryptionSetIdentity identity();

    /**
     * @return the previousKeys value.
     */
    List<KeyForDiskEncryptionSet> previousKeys();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the DiskEncryptionSet definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DiskEncryptionSet definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DiskEncryptionSet definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DiskEncryptionSet definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the diskencryptionset definition allowing to specify ActiveKey.
         */
        interface WithActiveKey {
            /**
             * Specifies activeKey.
             * @param activeKey The key vault key which is currently used by this disk encryption set
             * @return the next definition stage
             */
            WithCreate withActiveKey(KeyForDiskEncryptionSet activeKey);
        }

        /**
         * The stage of the diskencryptionset definition allowing to specify EncryptionType.
         */
        interface WithEncryptionType {
            /**
             * Specifies encryptionType.
             * @param encryptionType Possible values include: 'EncryptionAtRestWithCustomerKey', 'EncryptionAtRestWithPlatformAndCustomerKeys'
             * @return the next definition stage
             */
            WithCreate withEncryptionType(DiskEncryptionSetType encryptionType);
        }

        /**
         * The stage of the diskencryptionset definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity the identity parameter value
             * @return the next definition stage
             */
            WithCreate withIdentity(EncryptionSetIdentity identity);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DiskEncryptionSet>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithActiveKey, DefinitionStages.WithEncryptionType, DefinitionStages.WithIdentity {
        }
    }
    /**
     * The template for a DiskEncryptionSet update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DiskEncryptionSet>, Resource.UpdateWithTags<Update>, UpdateStages.WithActiveKey, UpdateStages.WithEncryptionType {
    }

    /**
     * Grouping of DiskEncryptionSet update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the diskencryptionset update allowing to specify ActiveKey.
         */
        interface WithActiveKey {
            /**
             * Specifies activeKey.
             * @param activeKey the activeKey parameter value
             * @return the next update stage
             */
            Update withActiveKey(KeyForDiskEncryptionSet activeKey);
        }

        /**
         * The stage of the diskencryptionset update allowing to specify EncryptionType.
         */
        interface WithEncryptionType {
            /**
             * Specifies encryptionType.
             * @param encryptionType Possible values include: 'EncryptionAtRestWithCustomerKey', 'EncryptionAtRestWithPlatformAndCustomerKeys'
             * @return the next update stage
             */
            Update withEncryptionType(DiskEncryptionSetType encryptionType);
        }

    }
}
