/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.authorization.v2018_03_01.implementation.PolicyDefinitionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.authorization.v2018_03_01.implementation.AuthorizationManager;

/**
 * Type representing PolicyDefinition.
 */
public interface PolicyDefinition extends HasInner<PolicyDefinitionInner>, Indexable, Updatable<PolicyDefinition.Update>, Refreshable<PolicyDefinition>, HasManager<AuthorizationManager> {
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
     * @return the mode value.
     */
    PolicyMode mode();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    Object parameters();

    /**
     * @return the policyRule value.
     */
    Object policyRule();

    /**
     * @return the policyType value.
     */
    PolicyType policyType();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PolicyDefinition definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PolicyDefinition definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PolicyDefinition definition.
         */
        interface Blank extends WithCreate {
        }

        /**
         * The stage of the policydefinition definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the policydefinition definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the policydefinition definition allowing to specify Metadata.
         */
        interface WithMetadata {
            /**
             * Specifies metadata.
             */
            WithCreate withMetadata(Object metadata);
        }

        /**
         * The stage of the policydefinition definition allowing to specify Mode.
         */
        interface WithMode {
            /**
             * Specifies mode.
             */
            WithCreate withMode(PolicyMode mode);
        }

        /**
         * The stage of the policydefinition definition allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            WithCreate withParameters(Object parameters);
        }

        /**
         * The stage of the policydefinition definition allowing to specify PolicyRule.
         */
        interface WithPolicyRule {
            /**
             * Specifies policyRule.
             */
            WithCreate withPolicyRule(Object policyRule);
        }

        /**
         * The stage of the policydefinition definition allowing to specify PolicyType.
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
        interface WithCreate extends Creatable<PolicyDefinition>, DefinitionStages.WithDescription, DefinitionStages.WithDisplayName, DefinitionStages.WithMetadata, DefinitionStages.WithMode, DefinitionStages.WithParameters, DefinitionStages.WithPolicyRule, DefinitionStages.WithPolicyType {
        }
    }
    /**
     * The template for a PolicyDefinition update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PolicyDefinition>, UpdateStages.WithDescription, UpdateStages.WithDisplayName, UpdateStages.WithMetadata, UpdateStages.WithMode, UpdateStages.WithParameters, UpdateStages.WithPolicyRule, UpdateStages.WithPolicyType {
    }

    /**
     * Grouping of PolicyDefinition update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the policydefinition update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the policydefinition update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the policydefinition update allowing to specify Metadata.
         */
        interface WithMetadata {
            /**
             * Specifies metadata.
             */
            Update withMetadata(Object metadata);
        }

        /**
         * The stage of the policydefinition update allowing to specify Mode.
         */
        interface WithMode {
            /**
             * Specifies mode.
             */
            Update withMode(PolicyMode mode);
        }

        /**
         * The stage of the policydefinition update allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            Update withParameters(Object parameters);
        }

        /**
         * The stage of the policydefinition update allowing to specify PolicyRule.
         */
        interface WithPolicyRule {
            /**
             * Specifies policyRule.
             */
            Update withPolicyRule(Object policyRule);
        }

        /**
         * The stage of the policydefinition update allowing to specify PolicyType.
         */
        interface WithPolicyType {
            /**
             * Specifies policyType.
             */
            Update withPolicyType(PolicyType policyType);
        }

    }
}
