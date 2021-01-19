// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.fluent.models.WcfRelayInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of WcfRelay. */
public interface WcfRelay {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the isDynamic property: Returns true if the relay is dynamic; otherwise, false.
     *
     * @return the isDynamic value.
     */
    Boolean isDynamic();

    /**
     * Gets the createdAt property: The time the WCF relay was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime createdAt();

    /**
     * Gets the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime updatedAt();

    /**
     * Gets the listenerCount property: The number of listeners for this relay. Note that min :1 and max:25 are
     * supported.
     *
     * @return the listenerCount value.
     */
    Integer listenerCount();

    /**
     * Gets the relayType property: WCF relay type.
     *
     * @return the relayType value.
     */
    Relaytype relayType();

    /**
     * Gets the requiresClientAuthorization property: Returns true if client authorization is needed for this relay;
     * otherwise, false.
     *
     * @return the requiresClientAuthorization value.
     */
    Boolean requiresClientAuthorization();

    /**
     * Gets the requiresTransportSecurity property: Returns true if transport security is needed for this relay;
     * otherwise, false.
     *
     * @return the requiresTransportSecurity value.
     */
    Boolean requiresTransportSecurity();

    /**
     * Gets the userMetadata property: The usermetadata is a placeholder to store user-defined string data for the WCF
     * Relay endpoint. For example, it can be used to store descriptive data, such as list of teams and their contact
     * information. Also, user-defined configuration settings can be stored.
     *
     * @return the userMetadata value.
     */
    String userMetadata();

    /**
     * Gets the inner com.azure.resourcemanager.relay.fluent.models.WcfRelayInner object.
     *
     * @return the inner object.
     */
    WcfRelayInner innerModel();

    /** The entirety of the WcfRelay definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The WcfRelay definition stages. */
    interface DefinitionStages {
        /** The first stage of the WcfRelay definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the WcfRelay definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             *
             * @param resourceGroupName Name of the Resource group within the Azure subscription.
             * @param namespaceName The namespace name.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }
        /**
         * The stage of the WcfRelay definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithRelayType,
                DefinitionStages.WithRequiresClientAuthorization,
                DefinitionStages.WithRequiresTransportSecurity,
                DefinitionStages.WithUserMetadata {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            WcfRelay create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            WcfRelay create(Context context);
        }
        /** The stage of the WcfRelay definition allowing to specify relayType. */
        interface WithRelayType {
            /**
             * Specifies the relayType property: WCF relay type..
             *
             * @param relayType WCF relay type.
             * @return the next definition stage.
             */
            WithCreate withRelayType(Relaytype relayType);
        }
        /** The stage of the WcfRelay definition allowing to specify requiresClientAuthorization. */
        interface WithRequiresClientAuthorization {
            /**
             * Specifies the requiresClientAuthorization property: Returns true if client authorization is needed for
             * this relay; otherwise, false..
             *
             * @param requiresClientAuthorization Returns true if client authorization is needed for this relay;
             *     otherwise, false.
             * @return the next definition stage.
             */
            WithCreate withRequiresClientAuthorization(Boolean requiresClientAuthorization);
        }
        /** The stage of the WcfRelay definition allowing to specify requiresTransportSecurity. */
        interface WithRequiresTransportSecurity {
            /**
             * Specifies the requiresTransportSecurity property: Returns true if transport security is needed for this
             * relay; otherwise, false..
             *
             * @param requiresTransportSecurity Returns true if transport security is needed for this relay; otherwise,
             *     false.
             * @return the next definition stage.
             */
            WithCreate withRequiresTransportSecurity(Boolean requiresTransportSecurity);
        }
        /** The stage of the WcfRelay definition allowing to specify userMetadata. */
        interface WithUserMetadata {
            /**
             * Specifies the userMetadata property: The usermetadata is a placeholder to store user-defined string data
             * for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams
             * and their contact information. Also, user-defined configuration settings can be stored..
             *
             * @param userMetadata The usermetadata is a placeholder to store user-defined string data for the WCF Relay
             *     endpoint. For example, it can be used to store descriptive data, such as list of teams and their
             *     contact information. Also, user-defined configuration settings can be stored.
             * @return the next definition stage.
             */
            WithCreate withUserMetadata(String userMetadata);
        }
    }
    /**
     * Begins update for the WcfRelay resource.
     *
     * @return the stage of resource update.
     */
    WcfRelay.Update update();

    /** The template for WcfRelay update. */
    interface Update
        extends UpdateStages.WithRelayType,
            UpdateStages.WithRequiresClientAuthorization,
            UpdateStages.WithRequiresTransportSecurity,
            UpdateStages.WithUserMetadata {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        WcfRelay apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        WcfRelay apply(Context context);
    }
    /** The WcfRelay update stages. */
    interface UpdateStages {
        /** The stage of the WcfRelay update allowing to specify relayType. */
        interface WithRelayType {
            /**
             * Specifies the relayType property: WCF relay type..
             *
             * @param relayType WCF relay type.
             * @return the next definition stage.
             */
            Update withRelayType(Relaytype relayType);
        }
        /** The stage of the WcfRelay update allowing to specify requiresClientAuthorization. */
        interface WithRequiresClientAuthorization {
            /**
             * Specifies the requiresClientAuthorization property: Returns true if client authorization is needed for
             * this relay; otherwise, false..
             *
             * @param requiresClientAuthorization Returns true if client authorization is needed for this relay;
             *     otherwise, false.
             * @return the next definition stage.
             */
            Update withRequiresClientAuthorization(Boolean requiresClientAuthorization);
        }
        /** The stage of the WcfRelay update allowing to specify requiresTransportSecurity. */
        interface WithRequiresTransportSecurity {
            /**
             * Specifies the requiresTransportSecurity property: Returns true if transport security is needed for this
             * relay; otherwise, false..
             *
             * @param requiresTransportSecurity Returns true if transport security is needed for this relay; otherwise,
             *     false.
             * @return the next definition stage.
             */
            Update withRequiresTransportSecurity(Boolean requiresTransportSecurity);
        }
        /** The stage of the WcfRelay update allowing to specify userMetadata. */
        interface WithUserMetadata {
            /**
             * Specifies the userMetadata property: The usermetadata is a placeholder to store user-defined string data
             * for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams
             * and their contact information. Also, user-defined configuration settings can be stored..
             *
             * @param userMetadata The usermetadata is a placeholder to store user-defined string data for the WCF Relay
             *     endpoint. For example, it can be used to store descriptive data, such as list of teams and their
             *     contact information. Also, user-defined configuration settings can be stored.
             * @return the next definition stage.
             */
            Update withUserMetadata(String userMetadata);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    WcfRelay refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    WcfRelay refresh(Context context);
}
