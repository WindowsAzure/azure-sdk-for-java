/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.HybridConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;

/**
 * Type representing HybridConnection.
 */
public interface HybridConnection extends HasInner<HybridConnectionInner>, Indexable, Refreshable<HybridConnection>, Updatable<HybridConnection.Update>, HasManager<AppServiceManager> {
    /**
     * @return the hostname value.
     */
    String hostname();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the port value.
     */
    Integer port();

    /**
     * @return the relayArmUri value.
     */
    String relayArmUri();

    /**
     * @return the relayName value.
     */
    String relayName();

    /**
     * @return the sendKeyName value.
     */
    String sendKeyName();

    /**
     * @return the sendKeyValue value.
     */
    String sendKeyValue();

    /**
     * @return the serviceBusNamespace value.
     */
    String serviceBusNamespace();

    /**
     * @return the serviceBusSuffix value.
     */
    String serviceBusSuffix();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the HybridConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithHybridConnectionNamespace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of HybridConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a HybridConnection definition.
         */
        interface Blank extends WithHybridConnectionNamespace {
        }

        /**
         * The stage of the hybridconnection definition allowing to specify HybridConnectionNamespace.
         */
        interface WithHybridConnectionNamespace {
           /**
            * Specifies resourceGroupName, name, namespaceName.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name The name of the web app
            * @param namespaceName The namespace for this hybrid connection
            * @return the next definition stage
            */
            WithCreate withExistingHybridConnectionNamespace(String resourceGroupName, String name, String namespaceName);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify Hostname.
         */
        interface WithHostname {
            /**
             * Specifies hostname.
             * @param hostname The hostname of the endpoint
             * @return the next definition stage
             */
            WithCreate withHostname(String hostname);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify Port.
         */
        interface WithPort {
            /**
             * Specifies port.
             * @param port The port of the endpoint
             * @return the next definition stage
             */
            WithCreate withPort(Integer port);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify RelayArmUri.
         */
        interface WithRelayArmUri {
            /**
             * Specifies relayArmUri.
             * @param relayArmUri The ARM URI to the Service Bus relay
             * @return the next definition stage
             */
            WithCreate withRelayArmUri(String relayArmUri);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify RelayName.
         */
        interface WithRelayName {
            /**
             * Specifies relayName.
             * @param relayName The name of the Service Bus relay
             * @return the next definition stage
             */
            WithCreate withRelayName(String relayName);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify SendKeyName.
         */
        interface WithSendKeyName {
            /**
             * Specifies sendKeyName.
             * @param sendKeyName The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus
             * @return the next definition stage
             */
            WithCreate withSendKeyName(String sendKeyName);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify SendKeyValue.
         */
        interface WithSendKeyValue {
            /**
             * Specifies sendKeyValue.
             * @param sendKeyValue The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
 normally, use the POST /listKeys API instead
             * @return the next definition stage
             */
            WithCreate withSendKeyValue(String sendKeyValue);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify ServiceBusNamespace.
         */
        interface WithServiceBusNamespace {
            /**
             * Specifies serviceBusNamespace.
             * @param serviceBusNamespace The name of the Service Bus namespace
             * @return the next definition stage
             */
            WithCreate withServiceBusNamespace(String serviceBusNamespace);
        }

        /**
         * The stage of the hybridconnection definition allowing to specify ServiceBusSuffix.
         */
        interface WithServiceBusSuffix {
            /**
             * Specifies serviceBusSuffix.
             * @param serviceBusSuffix The suffix for the service bus endpoint. By default this is .servicebus.windows.net
             * @return the next definition stage
             */
            WithCreate withServiceBusSuffix(String serviceBusSuffix);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<HybridConnection>, DefinitionStages.WithHostname, DefinitionStages.WithKind, DefinitionStages.WithPort, DefinitionStages.WithRelayArmUri, DefinitionStages.WithRelayName, DefinitionStages.WithSendKeyName, DefinitionStages.WithSendKeyValue, DefinitionStages.WithServiceBusNamespace, DefinitionStages.WithServiceBusSuffix {
        }
    }
    /**
     * The template for a HybridConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<HybridConnection>, UpdateStages.WithHostname, UpdateStages.WithKind, UpdateStages.WithPort, UpdateStages.WithRelayArmUri, UpdateStages.WithRelayName, UpdateStages.WithSendKeyName, UpdateStages.WithSendKeyValue, UpdateStages.WithServiceBusNamespace, UpdateStages.WithServiceBusSuffix {
    }

    /**
     * Grouping of HybridConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the hybridconnection update allowing to specify Hostname.
         */
        interface WithHostname {
            /**
             * Specifies hostname.
             * @param hostname The hostname of the endpoint
             * @return the next update stage
             */
            Update withHostname(String hostname);
        }

        /**
         * The stage of the hybridconnection update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the hybridconnection update allowing to specify Port.
         */
        interface WithPort {
            /**
             * Specifies port.
             * @param port The port of the endpoint
             * @return the next update stage
             */
            Update withPort(Integer port);
        }

        /**
         * The stage of the hybridconnection update allowing to specify RelayArmUri.
         */
        interface WithRelayArmUri {
            /**
             * Specifies relayArmUri.
             * @param relayArmUri The ARM URI to the Service Bus relay
             * @return the next update stage
             */
            Update withRelayArmUri(String relayArmUri);
        }

        /**
         * The stage of the hybridconnection update allowing to specify RelayName.
         */
        interface WithRelayName {
            /**
             * Specifies relayName.
             * @param relayName The name of the Service Bus relay
             * @return the next update stage
             */
            Update withRelayName(String relayName);
        }

        /**
         * The stage of the hybridconnection update allowing to specify SendKeyName.
         */
        interface WithSendKeyName {
            /**
             * Specifies sendKeyName.
             * @param sendKeyName The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus
             * @return the next update stage
             */
            Update withSendKeyName(String sendKeyName);
        }

        /**
         * The stage of the hybridconnection update allowing to specify SendKeyValue.
         */
        interface WithSendKeyValue {
            /**
             * Specifies sendKeyValue.
             * @param sendKeyValue The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
 normally, use the POST /listKeys API instead
             * @return the next update stage
             */
            Update withSendKeyValue(String sendKeyValue);
        }

        /**
         * The stage of the hybridconnection update allowing to specify ServiceBusNamespace.
         */
        interface WithServiceBusNamespace {
            /**
             * Specifies serviceBusNamespace.
             * @param serviceBusNamespace The name of the Service Bus namespace
             * @return the next update stage
             */
            Update withServiceBusNamespace(String serviceBusNamespace);
        }

        /**
         * The stage of the hybridconnection update allowing to specify ServiceBusSuffix.
         */
        interface WithServiceBusSuffix {
            /**
             * Specifies serviceBusSuffix.
             * @param serviceBusSuffix The suffix for the service bus endpoint. By default this is .servicebus.windows.net
             * @return the next update stage
             */
            Update withServiceBusSuffix(String serviceBusSuffix);
        }

    }
}
