/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_08_01.implementation.SecurityRuleInner;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkSecurityGroupInner;

/**
 * Type representing NetworkSecurityGroup.
 */
public interface NetworkSecurityGroup extends HasInner<NetworkSecurityGroupInner>, Resource, GroupableResourceCore<NetworkManager, NetworkSecurityGroupInner>, HasResourceGroup, Refreshable<NetworkSecurityGroup>, Updatable<NetworkSecurityGroup.Update>, HasManager<NetworkManager> {
    /**
     * @return the defaultSecurityRules value.
     */
    List<NetworkSecurityGroupSecurityRule> defaultSecurityRules();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the securityRules value.
     */
    List<NetworkSecurityGroupSecurityRule> securityRules();

    /**
     * @return the subnets value.
     */
    List<Subnet> subnets();

    /**
     * The entirety of the NetworkSecurityGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetworkSecurityGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetworkSecurityGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the NetworkSecurityGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the networksecuritygroup update allowing to specify DefaultSecurityRules.
         */
        interface WithDefaultSecurityRules {
            /**
             * Specifies defaultSecurityRules.
             */
            WithCreate withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules);
        }

        /**
         * The stage of the networksecuritygroup update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the networksecuritygroup update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networksecuritygroup update allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             */
            WithCreate withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the networksecuritygroup update allowing to specify SecurityRules.
         */
        interface WithSecurityRules {
            /**
             * Specifies securityRules.
             */
            WithCreate withSecurityRules(List<SecurityRuleInner> securityRules);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetworkSecurityGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDefaultSecurityRules, DefinitionStages.WithEtag, DefinitionStages.WithProvisioningState, DefinitionStages.WithResourceGuid, DefinitionStages.WithSecurityRules {
        }
    }
    /**
     * The template for a NetworkSecurityGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetworkSecurityGroup>, Resource.UpdateWithTags<Update>, UpdateStages.WithDefaultSecurityRules, UpdateStages.WithEtag, UpdateStages.WithProvisioningState, UpdateStages.WithResourceGuid, UpdateStages.WithSecurityRules {
    }

    /**
     * Grouping of NetworkSecurityGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the networksecuritygroup {0} allowing to specify DefaultSecurityRules.
         */
        interface WithDefaultSecurityRules {
            /**
             * Specifies defaultSecurityRules.
             */
            Update withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules);
        }

        /**
         * The stage of the networksecuritygroup {0} allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the networksecuritygroup {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networksecuritygroup {0} allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             */
            Update withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the networksecuritygroup {0} allowing to specify SecurityRules.
         */
        interface WithSecurityRules {
            /**
             * Specifies securityRules.
             */
            Update withSecurityRules(List<SecurityRuleInner> securityRules);
        }

    }
}
