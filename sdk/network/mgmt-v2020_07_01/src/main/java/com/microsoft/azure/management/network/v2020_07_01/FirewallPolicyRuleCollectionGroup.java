/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_07_01.implementation.FirewallPolicyRuleCollectionGroupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing FirewallPolicyRuleCollectionGroup.
 */
public interface FirewallPolicyRuleCollectionGroup extends HasInner<FirewallPolicyRuleCollectionGroupInner>, Indexable, Refreshable<FirewallPolicyRuleCollectionGroup>, Updatable<FirewallPolicyRuleCollectionGroup.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the priority value.
     */
    Integer priority();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the ruleCollections value.
     */
    List<FirewallPolicyRuleCollection> ruleCollections();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the FirewallPolicyRuleCollectionGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithFirewallPolicy, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FirewallPolicyRuleCollectionGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FirewallPolicyRuleCollectionGroup definition.
         */
        interface Blank extends WithFirewallPolicy {
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup definition allowing to specify FirewallPolicy.
         */
        interface WithFirewallPolicy {
           /**
            * Specifies resourceGroupName, firewallPolicyName.
            * @param resourceGroupName The name of the resource group
            * @param firewallPolicyName The name of the Firewall Policy
            * @return the next definition stage
            */
            WithCreate withExistingFirewallPolicy(String resourceGroupName, String firewallPolicyName);
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup definition allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority of the Firewall Policy Rule Collection Group resource
             * @return the next definition stage
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup definition allowing to specify RuleCollections.
         */
        interface WithRuleCollections {
            /**
             * Specifies ruleCollections.
             * @param ruleCollections Group of Firewall Policy rule collections
             * @return the next definition stage
             */
            WithCreate withRuleCollections(List<FirewallPolicyRuleCollection> ruleCollections);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FirewallPolicyRuleCollectionGroup>, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPriority, DefinitionStages.WithRuleCollections {
        }
    }
    /**
     * The template for a FirewallPolicyRuleCollectionGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FirewallPolicyRuleCollectionGroup>, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPriority, UpdateStages.WithRuleCollections {
    }

    /**
     * Grouping of FirewallPolicyRuleCollectionGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the firewallpolicyrulecollectiongroup update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority of the Firewall Policy Rule Collection Group resource
             * @return the next update stage
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the firewallpolicyrulecollectiongroup update allowing to specify RuleCollections.
         */
        interface WithRuleCollections {
            /**
             * Specifies ruleCollections.
             * @param ruleCollections Group of Firewall Policy rule collections
             * @return the next update stage
             */
            Update withRuleCollections(List<FirewallPolicyRuleCollection> ruleCollections);
        }

    }
}
