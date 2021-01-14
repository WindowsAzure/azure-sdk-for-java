/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.SecurityPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.CdnManager;
import java.util.List;

/**
 * Type representing SecurityPolicy.
 */
public interface SecurityPolicy extends HasInner<SecurityPolicyInner>, Indexable, Refreshable<SecurityPolicy>, Updatable<SecurityPolicy.Update>, HasManager<CdnManager> {
    /**
     * @return the deploymentStatus value.
     */
    DeploymentStatus deploymentStatus();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    SecurityPolicyWebApplicationFirewallParameters parameters();

    /**
     * @return the provisioningState value.
     */
    AfdProvisioningState provisioningState();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the SecurityPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProfile, DefinitionStages.WithParameters, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SecurityPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SecurityPolicy definition.
         */
        interface Blank extends WithProfile {
        }

        /**
         * The stage of the securitypolicy definition allowing to specify Profile.
         */
        interface WithProfile {
           /**
            * Specifies resourceGroupName, profileName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param profileName Name of the CDN profile which is unique within the resource group
            * @return the next definition stage
            */
            WithParameters withExistingProfile(String resourceGroupName, String profileName);
        }

        /**
         * The stage of the securitypolicy definition allowing to specify Parameters.
         */
        interface WithParameters {
           /**
            * Specifies parameters.
            * @param parameters object which contains security policy parameters
            * @return the next definition stage
            */
            WithCreate withParameters(SecurityPolicyWebApplicationFirewallParameters parameters);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SecurityPolicy> {
        }
    }
    /**
     * The template for a SecurityPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SecurityPolicy>, UpdateStages.WithAssociations, UpdateStages.WithWafPolicy {
    }

    /**
     * Grouping of SecurityPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the securitypolicy update allowing to specify Associations.
         */
        interface WithAssociations {
            /**
             * Specifies associations.
             * @param associations Waf associations
             * @return the next update stage
             */
            Update withAssociations(List<SecurityPolicyWebApplicationFirewallAssociation> associations);
        }

        /**
         * The stage of the securitypolicy update allowing to specify WafPolicy.
         */
        interface WithWafPolicy {
            /**
             * Specifies wafPolicy.
             * @param wafPolicy Resource ID
             * @return the next update stage
             */
            Update withWafPolicy(ResourceReference wafPolicy);
        }

    }
}
