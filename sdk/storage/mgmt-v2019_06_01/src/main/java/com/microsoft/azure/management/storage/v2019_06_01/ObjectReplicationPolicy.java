/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.ObjectReplicationPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing ObjectReplicationPolicy.
 */
public interface ObjectReplicationPolicy extends HasInner<ObjectReplicationPolicyInner>, Indexable, Refreshable<ObjectReplicationPolicy>, Updatable<ObjectReplicationPolicy.Update>, HasManager<StorageManager> {
    /**
     * @return the destinationAccount value.
     */
    String destinationAccount();

    /**
     * @return the enabledTime value.
     */
    DateTime enabledTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the policyId value.
     */
    String policyId();

    /**
     * @return the rules value.
     */
    List<ObjectReplicationPolicyRule> rules();

    /**
     * @return the sourceAccount value.
     */
    String sourceAccount();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ObjectReplicationPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageAccount, DefinitionStages.WithDestinationAccount, DefinitionStages.WithSourceAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ObjectReplicationPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ObjectReplicationPolicy definition.
         */
        interface Blank extends WithStorageAccount {
        }

        /**
         * The stage of the objectreplicationpolicy definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithDestinationAccount withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the objectreplicationpolicy definition allowing to specify DestinationAccount.
         */
        interface WithDestinationAccount {
           /**
            * Specifies destinationAccount.
            * @param destinationAccount Required. Destination account name
            * @return the next definition stage
            */
            WithSourceAccount withDestinationAccount(String destinationAccount);
        }

        /**
         * The stage of the objectreplicationpolicy definition allowing to specify SourceAccount.
         */
        interface WithSourceAccount {
           /**
            * Specifies sourceAccount.
            * @param sourceAccount Required. Source account name
            * @return the next definition stage
            */
            WithCreate withSourceAccount(String sourceAccount);
        }

        /**
         * The stage of the objectreplicationpolicy definition allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules The storage account object replication rules
             * @return the next definition stage
             */
            WithCreate withRules(List<ObjectReplicationPolicyRule> rules);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ObjectReplicationPolicy>, DefinitionStages.WithRules {
        }
    }
    /**
     * The template for a ObjectReplicationPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ObjectReplicationPolicy>, UpdateStages.WithRules {
    }

    /**
     * Grouping of ObjectReplicationPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the objectreplicationpolicy update allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules The storage account object replication rules
             * @return the next update stage
             */
            Update withRules(List<ObjectReplicationPolicyRule> rules);
        }

    }
}
