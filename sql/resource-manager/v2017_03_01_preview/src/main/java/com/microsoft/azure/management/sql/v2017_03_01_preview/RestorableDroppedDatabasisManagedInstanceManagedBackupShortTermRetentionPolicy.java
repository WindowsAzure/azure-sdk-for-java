/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.ManagedBackupShortTermRetentionPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;

/**
 * Type representing RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy.
 */
public interface RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy extends HasInner<ManagedBackupShortTermRetentionPolicyInner>, Indexable, Refreshable<RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy>, Updatable<RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRestorableDroppedDatabasis, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy definition.
         */
        interface Blank extends WithRestorableDroppedDatabasis {
        }

        /**
         * The stage of the restorabledroppeddatabasismanagedinstancemanagedbackupshorttermretentionpolicy definition allowing to specify RestorableDroppedDatabasis.
         */
        interface WithRestorableDroppedDatabasis {
           /**
            * Specifies resourceGroupName, managedInstanceName, restorableDroppedDatabaseId.
            */
            WithCreate withExistingRestorableDroppedDatabasis(String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy> {
        }
    }
    /**
     * The template for a RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy> {
    }

    /**
     * Grouping of RestorableDroppedDatabasisManagedInstanceManagedBackupShortTermRetentionPolicy update stages.
     */
    interface UpdateStages {
    }
}
