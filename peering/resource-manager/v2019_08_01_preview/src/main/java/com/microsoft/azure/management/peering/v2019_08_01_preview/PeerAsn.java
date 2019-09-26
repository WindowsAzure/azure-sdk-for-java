/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.peering.v2019_08_01_preview.implementation.PeerAsnInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.peering.v2019_08_01_preview.implementation.PeeringManager;

/**
 * Type representing PeerAsn.
 */
public interface PeerAsn extends HasInner<PeerAsnInner>, Indexable, Updatable<PeerAsn.Update>, Refreshable<PeerAsn>, HasManager<PeeringManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peerAsn value.
     */
    Integer peerAsn();

    /**
     * @return the peerContactInfo value.
     */
    ContactInfo peerContactInfo();

    /**
     * @return the peerName value.
     */
    String peerName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the validationState value.
     */
    ValidationState validationState();

    /**
     * The entirety of the PeerAsn definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PeerAsn definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PeerAsn definition.
         */
        interface Blank extends WithCreate {
        }

        /**
         * The stage of the peerasn definition allowing to specify PeerAsn.
         */
        interface WithPeerAsn {
            /**
             * Specifies peerAsn.
             * @param peerAsn The Autonomous System Number (ASN) of the peer
             * @return the next definition stage
             */
            WithCreate withPeerAsn(Integer peerAsn);
        }

        /**
         * The stage of the peerasn definition allowing to specify PeerContactInfo.
         */
        interface WithPeerContactInfo {
            /**
             * Specifies peerContactInfo.
             * @param peerContactInfo The contact information of the peer
             * @return the next definition stage
             */
            WithCreate withPeerContactInfo(ContactInfo peerContactInfo);
        }

        /**
         * The stage of the peerasn definition allowing to specify PeerName.
         */
        interface WithPeerName {
            /**
             * Specifies peerName.
             * @param peerName The name of the peer
             * @return the next definition stage
             */
            WithCreate withPeerName(String peerName);
        }

        /**
         * The stage of the peerasn definition allowing to specify ValidationState.
         */
        interface WithValidationState {
            /**
             * Specifies validationState.
             * @param validationState The validation state of the ASN associated with the peer. Possible values include: 'None', 'Pending', 'Approved', 'Failed'
             * @return the next definition stage
             */
            WithCreate withValidationState(ValidationState validationState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PeerAsn>, DefinitionStages.WithPeerAsn, DefinitionStages.WithPeerContactInfo, DefinitionStages.WithPeerName, DefinitionStages.WithValidationState {
        }
    }
    /**
     * The template for a PeerAsn update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PeerAsn>, UpdateStages.WithPeerAsn, UpdateStages.WithPeerContactInfo, UpdateStages.WithPeerName, UpdateStages.WithValidationState {
    }

    /**
     * Grouping of PeerAsn update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the peerasn update allowing to specify PeerAsn.
         */
        interface WithPeerAsn {
            /**
             * Specifies peerAsn.
             * @param peerAsn The Autonomous System Number (ASN) of the peer
             * @return the next update stage
             */
            Update withPeerAsn(Integer peerAsn);
        }

        /**
         * The stage of the peerasn update allowing to specify PeerContactInfo.
         */
        interface WithPeerContactInfo {
            /**
             * Specifies peerContactInfo.
             * @param peerContactInfo The contact information of the peer
             * @return the next update stage
             */
            Update withPeerContactInfo(ContactInfo peerContactInfo);
        }

        /**
         * The stage of the peerasn update allowing to specify PeerName.
         */
        interface WithPeerName {
            /**
             * Specifies peerName.
             * @param peerName The name of the peer
             * @return the next update stage
             */
            Update withPeerName(String peerName);
        }

        /**
         * The stage of the peerasn update allowing to specify ValidationState.
         */
        interface WithValidationState {
            /**
             * Specifies validationState.
             * @param validationState The validation state of the ASN associated with the peer. Possible values include: 'None', 'Pending', 'Approved', 'Failed'
             * @return the next update stage
             */
            Update withValidationState(ValidationState validationState);
        }

    }
}
