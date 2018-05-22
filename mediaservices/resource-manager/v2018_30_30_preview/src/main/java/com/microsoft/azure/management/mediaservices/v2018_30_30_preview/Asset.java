/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation.AssetInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation.MediaManager;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * Type representing Asset.
 */
public interface Asset extends HasInner<AssetInner>, Indexable, Refreshable<Asset>, Updatable<Asset.Update>, HasManager<MediaManager> {
    /**
     * @return the alternateId value.
     */
    String alternateId();

    /**
     * @return the assetId value.
     */
    UUID assetId();

    /**
     * @return the container value.
     */
    String container();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the storageAccountName value.
     */
    String storageAccountName();

    /**
     * @return the storageEncryptionFormat value.
     */
    AssetStorageEncryptionFormat storageEncryptionFormat();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Asset definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Asset definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Asset definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the asset definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            */
            WithCreate withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the asset definition allowing to specify AlternateId.
         */
        interface WithAlternateId {
            /**
             * Specifies alternateId.
             */
            WithCreate withAlternateId(String alternateId);
        }

        /**
         * The stage of the asset definition allowing to specify Container.
         */
        interface WithContainer {
            /**
             * Specifies container.
             */
            WithCreate withContainer(String container);
        }

        /**
         * The stage of the asset definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the asset definition allowing to specify StorageAccountName.
         */
        interface WithStorageAccountName {
            /**
             * Specifies storageAccountName.
             */
            WithCreate withStorageAccountName(String storageAccountName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Asset>, DefinitionStages.WithAlternateId, DefinitionStages.WithContainer, DefinitionStages.WithDescription, DefinitionStages.WithStorageAccountName {
        }
    }
    /**
     * The template for a Asset update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Asset>, UpdateStages.WithAlternateId, UpdateStages.WithContainer, UpdateStages.WithDescription, UpdateStages.WithStorageAccountName {
    }

    /**
     * Grouping of Asset update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the asset update allowing to specify AlternateId.
         */
        interface WithAlternateId {
            /**
             * Specifies alternateId.
             */
            Update withAlternateId(String alternateId);
        }

        /**
         * The stage of the asset update allowing to specify Container.
         */
        interface WithContainer {
            /**
             * Specifies container.
             */
            Update withContainer(String container);
        }

        /**
         * The stage of the asset update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the asset update allowing to specify StorageAccountName.
         */
        interface WithStorageAccountName {
            /**
             * Specifies storageAccountName.
             */
            Update withStorageAccountName(String storageAccountName);
        }

    }
}
