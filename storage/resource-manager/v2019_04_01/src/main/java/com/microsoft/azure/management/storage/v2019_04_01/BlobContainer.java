/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_04_01.implementation.BlobContainerInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_04_01.implementation.StorageManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing BlobContainer.
 */
public interface BlobContainer extends HasInner<BlobContainerInner>, Indexable, Updatable<BlobContainer.Update>, HasManager<StorageManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the hasImmutabilityPolicy value.
     */
    Boolean hasImmutabilityPolicy();

    /**
     * @return the hasLegalHold value.
     */
    Boolean hasLegalHold();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the immutabilityPolicy value.
     */
    ImmutabilityPolicyProperties immutabilityPolicy();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the leaseDuration value.
     */
    LeaseDuration leaseDuration();

    /**
     * @return the leaseState value.
     */
    LeaseState leaseState();

    /**
     * @return the leaseStatus value.
     */
    LeaseStatus leaseStatus();

    /**
     * @return the legalHold value.
     */
    LegalHoldProperties legalHold();

    /**
     * @return the metadata value.
     */
    Map<String, String> metadata();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the publicAccess value.
     */
    PublicAccess publicAccess();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BlobContainer definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithBlobService, DefinitionStages.WithPublicAccess, DefinitionStages.WithMetadata, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BlobContainer definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BlobContainer definition.
         */
        interface Blank extends WithBlobService {
        }

        /**
         * The stage of the blobcontainer definition allowing to specify BlobService.
         */
        interface WithBlobService {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithPublicAccess withExistingBlobService(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the blobcontainer definition allowing to specify PublicAccess.
         */
        interface WithPublicAccess {
           /**
            * Specifies publicAccess.
            * @param publicAccess Specifies whether data in the container may be accessed publicly and the level of access. Possible values include: 'Container', 'Blob', 'None'
            * @return the next definition stage
            */
            WithMetadata withPublicAccess(PublicAccess publicAccess);
        }

        /**
         * The stage of the blobcontainer definition allowing to specify Metadata.
         */
        interface WithMetadata {
           /**
            * Specifies metadata.
            * @param metadata A name-value pair to associate with the container as metadata
            * @return the next definition stage
            */
            WithCreate withMetadata(Map<String, String> metadata);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BlobContainer> {
        }
    }
    /**
     * The template for a BlobContainer update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BlobContainer>, UpdateStages.WithPublicAccess, UpdateStages.WithMetadata {
    }

    /**
     * Grouping of BlobContainer update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the blobcontainer update allowing to specify PublicAccess.
         */
        interface WithPublicAccess {
            /**
             * Specifies publicAccess.
             * @param publicAccess Specifies whether data in the container may be accessed publicly and the level of access. Possible values include: 'Container', 'Blob', 'None'
             * @return the next update stage
             */
            Update withPublicAccess(PublicAccess publicAccess);
        }

        /**
         * The stage of the blobcontainer update allowing to specify Metadata.
         */
        interface WithMetadata {
            /**
             * Specifies metadata.
             * @param metadata A name-value pair to associate with the container as metadata
             * @return the next update stage
             */
            Update withMetadata(Map<String, String> metadata);
        }

    }
}
