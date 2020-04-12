/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.IpFirewallRuleInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;

/**
 * Type representing IpFirewallRuleInfo.
 */
public interface IpFirewallRuleInfo extends HasInner<IpFirewallRuleInfoInner>, Indexable, Refreshable<IpFirewallRuleInfo>, Updatable<IpFirewallRuleInfo.Update>, HasManager<SynapseManager> {
    /**
     * @return the endIpAddress value.
     */
    String endIpAddress();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the startIpAddress value.
     */
    String startIpAddress();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the IpFirewallRuleInfo definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IpFirewallRuleInfo definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IpFirewallRuleInfo definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the ipfirewallruleinfo definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @return the next definition stage
            */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the ipfirewallruleinfo definition allowing to specify EndIpAddress.
         */
        interface WithEndIpAddress {
            /**
             * Specifies endIpAddress.
             * @param endIpAddress The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
             * @return the next definition stage
             */
            WithCreate withEndIpAddress(String endIpAddress);
        }

        /**
         * The stage of the ipfirewallruleinfo definition allowing to specify StartIpAddress.
         */
        interface WithStartIpAddress {
            /**
             * Specifies startIpAddress.
             * @param startIpAddress The start IP address of the firewall rule. Must be IPv4 format
             * @return the next definition stage
             */
            WithCreate withStartIpAddress(String startIpAddress);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IpFirewallRuleInfo>, DefinitionStages.WithEndIpAddress, DefinitionStages.WithStartIpAddress {
        }
    }
    /**
     * The template for a IpFirewallRuleInfo update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IpFirewallRuleInfo>, UpdateStages.WithEndIpAddress, UpdateStages.WithStartIpAddress {
    }

    /**
     * Grouping of IpFirewallRuleInfo update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ipfirewallruleinfo update allowing to specify EndIpAddress.
         */
        interface WithEndIpAddress {
            /**
             * Specifies endIpAddress.
             * @param endIpAddress The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress
             * @return the next update stage
             */
            Update withEndIpAddress(String endIpAddress);
        }

        /**
         * The stage of the ipfirewallruleinfo update allowing to specify StartIpAddress.
         */
        interface WithStartIpAddress {
            /**
             * Specifies startIpAddress.
             * @param startIpAddress The start IP address of the firewall rule. Must be IPv4 format
             * @return the next update stage
             */
            Update withStartIpAddress(String startIpAddress);
        }

    }
}
