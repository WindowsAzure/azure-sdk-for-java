// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakestore.fluent.models.FirewallRuleInner;

/** An immutable client-side representation of FirewallRule. */
public interface FirewallRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the startIpAddress property: The start IP address for the firewall rule. This can be either ipv4 or ipv6.
     * Start and End should be in the same protocol.
     *
     * @return the startIpAddress value.
     */
    String startIpAddress();

    /**
     * Gets the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start
     * and End should be in the same protocol.
     *
     * @return the endIpAddress value.
     */
    String endIpAddress();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner com.azure.resourcemanager.datalakestore.fluent.models.FirewallRuleInner object.
     *
     * @return the inner object.
     */
    FirewallRuleInner innerModel();

    /** The entirety of the FirewallRule definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithStartIpAddress,
            DefinitionStages.WithEndIpAddress,
            DefinitionStages.WithCreate {
    }
    /** The FirewallRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the FirewallRule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the FirewallRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the Azure resource group.
             * @param accountName The name of the Data Lake Store account.
             * @return the next definition stage.
             */
            WithStartIpAddress withExistingAccount(String resourceGroupName, String accountName);
        }
        /** The stage of the FirewallRule definition allowing to specify startIpAddress. */
        interface WithStartIpAddress {
            /**
             * Specifies the startIpAddress property: The start IP address for the firewall rule. This can be either
             * ipv4 or ipv6. Start and End should be in the same protocol..
             *
             * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start
             *     and End should be in the same protocol.
             * @return the next definition stage.
             */
            WithEndIpAddress withStartIpAddress(String startIpAddress);
        }
        /** The stage of the FirewallRule definition allowing to specify endIpAddress. */
        interface WithEndIpAddress {
            /**
             * Specifies the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or
             * ipv6. Start and End should be in the same protocol..
             *
             * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and
             *     End should be in the same protocol.
             * @return the next definition stage.
             */
            WithCreate withEndIpAddress(String endIpAddress);
        }
        /**
         * The stage of the FirewallRule definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            FirewallRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FirewallRule create(Context context);
        }
    }
    /**
     * Begins update for the FirewallRule resource.
     *
     * @return the stage of resource update.
     */
    FirewallRule.Update update();

    /** The template for FirewallRule update. */
    interface Update extends UpdateStages.WithStartIpAddress, UpdateStages.WithEndIpAddress {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        FirewallRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        FirewallRule apply(Context context);
    }
    /** The FirewallRule update stages. */
    interface UpdateStages {
        /** The stage of the FirewallRule update allowing to specify startIpAddress. */
        interface WithStartIpAddress {
            /**
             * Specifies the startIpAddress property: The start IP address for the firewall rule. This can be either
             * ipv4 or ipv6. Start and End should be in the same protocol..
             *
             * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start
             *     and End should be in the same protocol.
             * @return the next definition stage.
             */
            Update withStartIpAddress(String startIpAddress);
        }
        /** The stage of the FirewallRule update allowing to specify endIpAddress. */
        interface WithEndIpAddress {
            /**
             * Specifies the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or
             * ipv6. Start and End should be in the same protocol..
             *
             * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and
             *     End should be in the same protocol.
             * @return the next definition stage.
             */
            Update withEndIpAddress(String endIpAddress);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    FirewallRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FirewallRule refresh(Context context);
}
