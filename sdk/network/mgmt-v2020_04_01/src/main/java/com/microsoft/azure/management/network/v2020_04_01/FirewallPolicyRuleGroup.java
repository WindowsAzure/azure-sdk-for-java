/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_04_01.implementation.FirewallPolicyRuleGroupInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_04_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing FirewallPolicyRuleGroup.
 */
public interface FirewallPolicyRuleGroup extends HasInner<FirewallPolicyRuleGroupInner>, Indexable, Refreshable<FirewallPolicyRuleGroup>, Updatable<FirewallPolicyRuleGroup.Update>, HasManager<NetworkManager> {
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
     * @return the rules value.
     */
    List<FirewallPolicyRule> rules();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the FirewallPolicyRuleGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithFirewallPolicy, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FirewallPolicyRuleGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FirewallPolicyRuleGroup definition.
         */
        interface Blank extends WithFirewallPolicy {
        }

        /**
         * The stage of the firewallpolicyrulegroup definition allowing to specify FirewallPolicy.
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
         * The stage of the firewallpolicyrulegroup definition allowing to specify Id.
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
         * The stage of the firewallpolicyrulegroup definition allowing to specify Name.
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
         * The stage of the firewallpolicyrulegroup definition allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority of the Firewall Policy Rule Group resource
             * @return the next definition stage
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the firewallpolicyrulegroup definition allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules Group of Firewall Policy rules
             * @return the next definition stage
             */
            WithCreate withRules(List<FirewallPolicyRule> rules);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FirewallPolicyRuleGroup>, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPriority, DefinitionStages.WithRules {
        }
    }
    /**
     * The template for a FirewallPolicyRuleGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FirewallPolicyRuleGroup>, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPriority, UpdateStages.WithRules {
    }

    /**
     * Grouping of FirewallPolicyRuleGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the firewallpolicyrulegroup update allowing to specify Id.
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
         * The stage of the firewallpolicyrulegroup update allowing to specify Name.
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
         * The stage of the firewallpolicyrulegroup update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority of the Firewall Policy Rule Group resource
             * @return the next update stage
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the firewallpolicyrulegroup update allowing to specify Rules.
         */
        interface WithRules {
            /**
             * Specifies rules.
             * @param rules Group of Firewall Policy rules
             * @return the next update stage
             */
            Update withRules(List<FirewallPolicyRule> rules);
        }

    }
}
