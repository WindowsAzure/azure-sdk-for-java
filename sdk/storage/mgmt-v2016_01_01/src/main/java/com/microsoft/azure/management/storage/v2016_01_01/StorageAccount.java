/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2016_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2016_01_01.implementation.StorageManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2016_01_01.implementation.StorageAccountInner;

/**
 * Type representing StorageAccount.
 */
public interface StorageAccount extends HasInner<StorageAccountInner>, Resource, GroupableResourceCore<StorageManager, StorageAccountInner>, HasResourceGroup, Refreshable<StorageAccount>, Updatable<StorageAccount.Update>, HasManager<StorageManager> {
    /**
     * @return the accessTier value.
     */
    AccessTier accessTier();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the customDomain value.
     */
    CustomDomain customDomain();

    /**
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * @return the kind value.
     */
    Kind kind();

    /**
     * @return the lastGeoFailoverTime value.
     */
    DateTime lastGeoFailoverTime();

    /**
     * @return the primaryEndpoints value.
     */
    Endpoints primaryEndpoints();

    /**
     * @return the primaryLocation value.
     */
    String primaryLocation();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the secondaryEndpoints value.
     */
    Endpoints secondaryEndpoints();

    /**
     * @return the secondaryLocation value.
     */
    String secondaryLocation();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the statusOfPrimary value.
     */
    AccountStatus statusOfPrimary();

    /**
     * @return the statusOfSecondary value.
     */
    AccountStatus statusOfSecondary();

    /**
     * The entirety of the StorageAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithKind, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the StorageAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithKind> {
        }

        /**
         * The stage of the storageaccount definition allowing to specify Kind.
         */
        interface WithKind {
           /**
            * Specifies kind.
            * @param kind Required. Indicates the type of storage account. Possible values include: 'Storage', 'BlobStorage'
            * @return the next definition stage
*/
            WithSku withKind(Kind kind);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku Required. Gets or sets the sku name
            * @return the next definition stage
*/
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the storageaccount definition allowing to specify AccessTier.
         */
        interface WithAccessTier {
            /**
             * Specifies accessTier.
             * @param accessTier Required for storage accounts where kind = BlobStorage. The access tier used for billing. Possible values include: 'Hot', 'Cool'
             * @return the next definition stage
             */
            WithCreate withAccessTier(AccessTier accessTier);
        }

        /**
         * The stage of the storageaccount definition allowing to specify CustomDomain.
         */
        interface WithCustomDomain {
            /**
             * Specifies customDomain.
             * @param customDomain User domain assigned to the storage account. Name is the CNAME source. Only one custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty string for the custom domain name property
             * @return the next definition stage
             */
            WithCreate withCustomDomain(CustomDomain customDomain);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption Provides the encryption settings on the account. If left unspecified the account encryption settings will remain the same. The default setting is unencrypted
             * @return the next definition stage
             */
            WithCreate withEncryption(Encryption encryption);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAccessTier, DefinitionStages.WithCustomDomain, DefinitionStages.WithEncryption {
        }
    }
    /**
     * The template for a StorageAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithAccessTier, UpdateStages.WithCustomDomain, UpdateStages.WithEncryption, UpdateStages.WithSku {
    }

    /**
     * Grouping of StorageAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageaccount update allowing to specify AccessTier.
         */
        interface WithAccessTier {
            /**
             * Specifies accessTier.
             * @param accessTier Required for storage accounts where kind = BlobStorage. The access tier used for billing. Possible values include: 'Hot', 'Cool'
             * @return the next update stage
             */
            Update withAccessTier(AccessTier accessTier);
        }

        /**
         * The stage of the storageaccount update allowing to specify CustomDomain.
         */
        interface WithCustomDomain {
            /**
             * Specifies customDomain.
             * @param customDomain Custom domain assigned to the storage account by the user. Name is the CNAME source. Only one custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty string for the custom domain name property
             * @return the next update stage
             */
            Update withCustomDomain(CustomDomain customDomain);
        }

        /**
         * The stage of the storageaccount update allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption Provides the encryption settings on the account. The default setting is unencrypted
             * @return the next update stage
             */
            Update withEncryption(Encryption encryption);
        }

        /**
         * The stage of the storageaccount update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS or Premium_LRS, nor can accounts of those sku names be updated to any other value
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

    }
}
