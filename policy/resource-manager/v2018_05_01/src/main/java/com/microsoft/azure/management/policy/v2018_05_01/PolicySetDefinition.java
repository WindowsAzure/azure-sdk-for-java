/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.policy.v2018_05_01.implementation.PolicySetDefinitionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policy.v2018_05_01.implementation.PolicyManager;
import java.util.List;

/**
 * Type representing PolicySetDefinition.
 */
public interface PolicySetDefinition extends HasInner<PolicySetDefinitionInner>, Indexable, Updatable<PolicySetDefinition.Update>, HasManager<PolicyManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the metadata value.
     */
    Object metadata();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    Object parameters();

    /**
     * @return the policyDefinitions value.
     */
    List<PolicyDefinitionReference> policyDefinitions();

    /**
     * @return the policyType value.
     */
    PolicyType policyType();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PolicySetDefinition definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSubscriptionId, DefinitionStages.WithPolicyDefinitions, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PolicySetDefinition definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PolicySetDefinition definition.
         */
        interface Blank extends WithSubscriptionId {
        }

        /**
         * The stage of the policysetdefinition definition allowing to specify SubscriptionId.
         */
        interface WithSubscriptionId {
           /**
            * Specifies subscriptionId.
            */
            WithPolicyDefinitions withSubscriptionId(String subscriptionId);
        }

        /**
         * The stage of the policysetdefinition definition allowing to specify PolicyDefinitions.
         */
        interface WithPolicyDefinitions {
           /**
            * Specifies policyDefinitions.
            */
            WithCreate withPolicyDefinitions(List<PolicyDefinitionReference> policyDefinitions);
        }

        /**
         * The stage of the policysetdefinition definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the policysetdefinition definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the policysetdefinition definition allowing to specify Metadata.
         */
        interface WithMetadata {
            /**
             * Specifies metadata.
             */
            WithCreate withMetadata(Object metadata);
        }

        /**
         * The stage of the policysetdefinition definition allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            WithCreate withParameters(Object parameters);
        }

        /**
         * The stage of the policysetdefinition definition allowing to specify PolicyType.
         */
        interface WithPolicyType {
            /**
             * Specifies policyType.
             */
            WithCreate withPolicyType(PolicyType policyType);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PolicySetDefinition>, DefinitionStages.WithDescription, DefinitionStages.WithDisplayName, DefinitionStages.WithMetadata, DefinitionStages.WithParameters, DefinitionStages.WithPolicyType {
        }
    }
    /**
     * The template for a PolicySetDefinition update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PolicySetDefinition>, UpdateStages.WithDescription, UpdateStages.WithDisplayName, UpdateStages.WithMetadata, UpdateStages.WithParameters, UpdateStages.WithPolicyType {
    }

    /**
     * Grouping of PolicySetDefinition update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the policysetdefinition update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the policysetdefinition update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the policysetdefinition update allowing to specify Metadata.
         */
        interface WithMetadata {
            /**
             * Specifies metadata.
             */
            Update withMetadata(Object metadata);
        }

        /**
         * The stage of the policysetdefinition update allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            Update withParameters(Object parameters);
        }

        /**
         * The stage of the policysetdefinition update allowing to specify PolicyType.
         */
        interface WithPolicyType {
            /**
             * Specifies policyType.
             */
            Update withPolicyType(PolicyType policyType);
        }

    }
}
