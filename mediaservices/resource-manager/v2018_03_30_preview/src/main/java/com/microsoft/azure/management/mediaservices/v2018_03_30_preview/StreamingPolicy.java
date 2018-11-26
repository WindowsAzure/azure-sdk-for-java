/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.StreamingPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation.MediaManager;
import org.joda.time.DateTime;

/**
 * Type representing StreamingPolicy.
 */
public interface StreamingPolicy extends HasInner<StreamingPolicyInner>, Indexable, Refreshable<StreamingPolicy>, Updatable<StreamingPolicy.Update>, HasManager<MediaManager> {
    /**
     * @return the commonEncryptionCbcs value.
     */
    CommonEncryptionCbcs commonEncryptionCbcs();

    /**
     * @return the commonEncryptionCenc value.
     */
    CommonEncryptionCenc commonEncryptionCenc();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the defaultContentKeyPolicyName value.
     */
    String defaultContentKeyPolicyName();

    /**
     * @return the envelopeEncryption value.
     */
    EnvelopeEncryption envelopeEncryption();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the noEncryption value.
     */
    NoEncryption noEncryption();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StreamingPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StreamingPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StreamingPolicy definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the streamingpolicy definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the Azure subscription
            * @param accountName The Media Services account name
            * @return the next definition stage
            */
            WithCreate withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the streamingpolicy definition allowing to specify CommonEncryptionCbcs.
         */
        interface WithCommonEncryptionCbcs {
            /**
             * Specifies commonEncryptionCbcs.
             * @param commonEncryptionCbcs Configuration of CommonEncryptionCbcs
             * @return the next definition stage
             */
            WithCreate withCommonEncryptionCbcs(CommonEncryptionCbcs commonEncryptionCbcs);
        }

        /**
         * The stage of the streamingpolicy definition allowing to specify CommonEncryptionCenc.
         */
        interface WithCommonEncryptionCenc {
            /**
             * Specifies commonEncryptionCenc.
             * @param commonEncryptionCenc Configuration of CommonEncryptionCenc
             * @return the next definition stage
             */
            WithCreate withCommonEncryptionCenc(CommonEncryptionCenc commonEncryptionCenc);
        }

        /**
         * The stage of the streamingpolicy definition allowing to specify DefaultContentKeyPolicyName.
         */
        interface WithDefaultContentKeyPolicyName {
            /**
             * Specifies defaultContentKeyPolicyName.
             * @param defaultContentKeyPolicyName Default ContentKey used by current Streaming Policy
             * @return the next definition stage
             */
            WithCreate withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName);
        }

        /**
         * The stage of the streamingpolicy definition allowing to specify EnvelopeEncryption.
         */
        interface WithEnvelopeEncryption {
            /**
             * Specifies envelopeEncryption.
             * @param envelopeEncryption Configuration of EnvelopeEncryption
             * @return the next definition stage
             */
            WithCreate withEnvelopeEncryption(EnvelopeEncryption envelopeEncryption);
        }

        /**
         * The stage of the streamingpolicy definition allowing to specify NoEncryption.
         */
        interface WithNoEncryption {
            /**
             * Specifies noEncryption.
             * @param noEncryption Configuations of NoEncryption
             * @return the next definition stage
             */
            WithCreate withNoEncryption(NoEncryption noEncryption);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StreamingPolicy>, DefinitionStages.WithCommonEncryptionCbcs, DefinitionStages.WithCommonEncryptionCenc, DefinitionStages.WithDefaultContentKeyPolicyName, DefinitionStages.WithEnvelopeEncryption, DefinitionStages.WithNoEncryption {
        }
    }
    /**
     * The template for a StreamingPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StreamingPolicy>, UpdateStages.WithCommonEncryptionCbcs, UpdateStages.WithCommonEncryptionCenc, UpdateStages.WithDefaultContentKeyPolicyName, UpdateStages.WithEnvelopeEncryption, UpdateStages.WithNoEncryption {
    }

    /**
     * Grouping of StreamingPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the streamingpolicy update allowing to specify CommonEncryptionCbcs.
         */
        interface WithCommonEncryptionCbcs {
            /**
             * Specifies commonEncryptionCbcs.
             * @param commonEncryptionCbcs Configuration of CommonEncryptionCbcs
             * @return the next update stage
             */
            Update withCommonEncryptionCbcs(CommonEncryptionCbcs commonEncryptionCbcs);
        }

        /**
         * The stage of the streamingpolicy update allowing to specify CommonEncryptionCenc.
         */
        interface WithCommonEncryptionCenc {
            /**
             * Specifies commonEncryptionCenc.
             * @param commonEncryptionCenc Configuration of CommonEncryptionCenc
             * @return the next update stage
             */
            Update withCommonEncryptionCenc(CommonEncryptionCenc commonEncryptionCenc);
        }

        /**
         * The stage of the streamingpolicy update allowing to specify DefaultContentKeyPolicyName.
         */
        interface WithDefaultContentKeyPolicyName {
            /**
             * Specifies defaultContentKeyPolicyName.
             * @param defaultContentKeyPolicyName Default ContentKey used by current Streaming Policy
             * @return the next update stage
             */
            Update withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName);
        }

        /**
         * The stage of the streamingpolicy update allowing to specify EnvelopeEncryption.
         */
        interface WithEnvelopeEncryption {
            /**
             * Specifies envelopeEncryption.
             * @param envelopeEncryption Configuration of EnvelopeEncryption
             * @return the next update stage
             */
            Update withEnvelopeEncryption(EnvelopeEncryption envelopeEncryption);
        }

        /**
         * The stage of the streamingpolicy update allowing to specify NoEncryption.
         */
        interface WithNoEncryption {
            /**
             * Specifies noEncryption.
             * @param noEncryption Configuations of NoEncryption
             * @return the next update stage
             */
            Update withNoEncryption(NoEncryption noEncryption);
        }

    }
}
