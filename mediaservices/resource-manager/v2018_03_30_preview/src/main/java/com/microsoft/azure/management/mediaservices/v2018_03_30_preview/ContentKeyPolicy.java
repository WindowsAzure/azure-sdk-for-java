/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.ContentKeyPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.MediaManager;
import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing ContentKeyPolicy.
 */
public interface ContentKeyPolicy extends HasInner<ContentKeyPolicyInner>, Indexable, Refreshable<ContentKeyPolicy>, Updatable<ContentKeyPolicy.Update>, HasManager<MediaManager> {
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
     * @return the options value.
     */
    List<ContentKeyPolicyOption> options();

    /**
     * @return the policyId value.
     */
    UUID policyId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ContentKeyPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithOptions, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ContentKeyPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ContentKeyPolicy definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the contentkeypolicy definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the Azure subscription
            * @param accountName The Media Services account name
            * @return the next definition stage
            */
            WithOptions withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the contentkeypolicy definition allowing to specify Options.
         */
        interface WithOptions {
           /**
            * Specifies options.
            * @param options The Key Policy options
            * @return the next definition stage
            */
            WithCreate withOptions(List<ContentKeyPolicyOption> options);
        }

        /**
         * The stage of the contentkeypolicy definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description A description for the Policy
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ContentKeyPolicy>, DefinitionStages.WithDescription {
        }
    }
    /**
     * The template for a ContentKeyPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ContentKeyPolicy>, UpdateStages.WithDescription {
    }

    /**
     * Grouping of ContentKeyPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the contentkeypolicy update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description A description for the Policy
             * @return the next update stage
             */
            Update withDescription(String description);
        }

    }
}
