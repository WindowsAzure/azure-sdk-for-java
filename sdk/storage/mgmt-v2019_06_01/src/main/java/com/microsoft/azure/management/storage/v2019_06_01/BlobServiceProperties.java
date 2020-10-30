/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.BlobServicePropertiesInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;

/**
 * Type representing BlobServiceProperties.
 */
public interface BlobServiceProperties extends HasInner<BlobServicePropertiesInner>, Indexable, Refreshable<BlobServiceProperties>, Updatable<BlobServiceProperties.Update>, HasManager<StorageManager> {
    /**
     * @return the automaticSnapshotPolicyEnabled value.
     */
    Boolean automaticSnapshotPolicyEnabled();

    /**
     * @return the changeFeed value.
     */
    ChangeFeed changeFeed();

    /**
     * @return the containerDeleteRetentionPolicy value.
     */
    DeleteRetentionPolicy containerDeleteRetentionPolicy();

    /**
     * @return the cors value.
     */
    CorsRules cors();

    /**
     * @return the defaultServiceVersion value.
     */
    String defaultServiceVersion();

    /**
     * @return the deleteRetentionPolicy value.
     */
    DeleteRetentionPolicy deleteRetentionPolicy();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isVersioningEnabled value.
     */
    Boolean isVersioningEnabled();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the restorePolicy value.
     */
    RestorePolicyProperties restorePolicy();

    /**
     * @return the sku value.
     */
    SkuInner sku();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BlobServiceProperties definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BlobServiceProperties definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BlobServiceProperties definition.
         */
        interface Blank extends WithStorageAccount {
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify AutomaticSnapshotPolicyEnabled.
         */
        interface WithAutomaticSnapshotPolicyEnabled {
            /**
             * Specifies automaticSnapshotPolicyEnabled.
             * @param automaticSnapshotPolicyEnabled Deprecated in favor of isVersioningEnabled property
             * @return the next definition stage
             */
            WithCreate withAutomaticSnapshotPolicyEnabled(Boolean automaticSnapshotPolicyEnabled);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify ChangeFeed.
         */
        interface WithChangeFeed {
            /**
             * Specifies changeFeed.
             * @param changeFeed The blob service properties for change feed events
             * @return the next definition stage
             */
            WithCreate withChangeFeed(ChangeFeed changeFeed);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify ContainerDeleteRetentionPolicy.
         */
        interface WithContainerDeleteRetentionPolicy {
            /**
             * Specifies containerDeleteRetentionPolicy.
             * @param containerDeleteRetentionPolicy The blob service properties for container soft delete
             * @return the next definition stage
             */
            WithCreate withContainerDeleteRetentionPolicy(DeleteRetentionPolicy containerDeleteRetentionPolicy);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify Cors.
         */
        interface WithCors {
            /**
             * Specifies cors.
             * @param cors Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service
             * @return the next definition stage
             */
            WithCreate withCors(CorsRules cors);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify DefaultServiceVersion.
         */
        interface WithDefaultServiceVersion {
            /**
             * Specifies defaultServiceVersion.
             * @param defaultServiceVersion DefaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions
             * @return the next definition stage
             */
            WithCreate withDefaultServiceVersion(String defaultServiceVersion);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify DeleteRetentionPolicy.
         */
        interface WithDeleteRetentionPolicy {
            /**
             * Specifies deleteRetentionPolicy.
             * @param deleteRetentionPolicy The blob service properties for blob soft delete
             * @return the next definition stage
             */
            WithCreate withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify IsVersioningEnabled.
         */
        interface WithIsVersioningEnabled {
            /**
             * Specifies isVersioningEnabled.
             * @param isVersioningEnabled Versioning is enabled if set to true
             * @return the next definition stage
             */
            WithCreate withIsVersioningEnabled(Boolean isVersioningEnabled);
        }

        /**
         * The stage of the blobserviceproperties definition allowing to specify RestorePolicy.
         */
        interface WithRestorePolicy {
            /**
             * Specifies restorePolicy.
             * @param restorePolicy The blob service properties for blob restore policy
             * @return the next definition stage
             */
            WithCreate withRestorePolicy(RestorePolicyProperties restorePolicy);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BlobServiceProperties>, DefinitionStages.WithAutomaticSnapshotPolicyEnabled, DefinitionStages.WithChangeFeed, DefinitionStages.WithContainerDeleteRetentionPolicy, DefinitionStages.WithCors, DefinitionStages.WithDefaultServiceVersion, DefinitionStages.WithDeleteRetentionPolicy, DefinitionStages.WithIsVersioningEnabled, DefinitionStages.WithRestorePolicy {
        }
    }
    /**
     * The template for a BlobServiceProperties update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BlobServiceProperties>, UpdateStages.WithAutomaticSnapshotPolicyEnabled, UpdateStages.WithChangeFeed, UpdateStages.WithContainerDeleteRetentionPolicy, UpdateStages.WithCors, UpdateStages.WithDefaultServiceVersion, UpdateStages.WithDeleteRetentionPolicy, UpdateStages.WithIsVersioningEnabled, UpdateStages.WithRestorePolicy {
    }

    /**
     * Grouping of BlobServiceProperties update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the blobserviceproperties update allowing to specify AutomaticSnapshotPolicyEnabled.
         */
        interface WithAutomaticSnapshotPolicyEnabled {
            /**
             * Specifies automaticSnapshotPolicyEnabled.
             * @param automaticSnapshotPolicyEnabled Deprecated in favor of isVersioningEnabled property
             * @return the next update stage
             */
            Update withAutomaticSnapshotPolicyEnabled(Boolean automaticSnapshotPolicyEnabled);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify ChangeFeed.
         */
        interface WithChangeFeed {
            /**
             * Specifies changeFeed.
             * @param changeFeed The blob service properties for change feed events
             * @return the next update stage
             */
            Update withChangeFeed(ChangeFeed changeFeed);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify ContainerDeleteRetentionPolicy.
         */
        interface WithContainerDeleteRetentionPolicy {
            /**
             * Specifies containerDeleteRetentionPolicy.
             * @param containerDeleteRetentionPolicy The blob service properties for container soft delete
             * @return the next update stage
             */
            Update withContainerDeleteRetentionPolicy(DeleteRetentionPolicy containerDeleteRetentionPolicy);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify Cors.
         */
        interface WithCors {
            /**
             * Specifies cors.
             * @param cors Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service
             * @return the next update stage
             */
            Update withCors(CorsRules cors);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify DefaultServiceVersion.
         */
        interface WithDefaultServiceVersion {
            /**
             * Specifies defaultServiceVersion.
             * @param defaultServiceVersion DefaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions
             * @return the next update stage
             */
            Update withDefaultServiceVersion(String defaultServiceVersion);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify DeleteRetentionPolicy.
         */
        interface WithDeleteRetentionPolicy {
            /**
             * Specifies deleteRetentionPolicy.
             * @param deleteRetentionPolicy The blob service properties for blob soft delete
             * @return the next update stage
             */
            Update withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify IsVersioningEnabled.
         */
        interface WithIsVersioningEnabled {
            /**
             * Specifies isVersioningEnabled.
             * @param isVersioningEnabled Versioning is enabled if set to true
             * @return the next update stage
             */
            Update withIsVersioningEnabled(Boolean isVersioningEnabled);
        }

        /**
         * The stage of the blobserviceproperties update allowing to specify RestorePolicy.
         */
        interface WithRestorePolicy {
            /**
             * Specifies restorePolicy.
             * @param restorePolicy The blob service properties for blob restore policy
             * @return the next update stage
             */
            Update withRestorePolicy(RestorePolicyProperties restorePolicy);
        }

    }
}
