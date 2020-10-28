/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.DataMaskingRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;

/**
 * Type representing DataMaskingRule.
 */
public interface DataMaskingRule extends HasInner<DataMaskingRuleInner>, Indexable, Updatable<DataMaskingRule.Update>, HasManager<SynapseManager> {
    /**
     * @return the aliasName value.
     */
    String aliasName();

    /**
     * @return the columnName value.
     */
    String columnName();

    /**
     * @return the dataMaskingRuleId value.
     */
    String dataMaskingRuleId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maskingFunction value.
     */
    DataMaskingFunction maskingFunction();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the numberFrom value.
     */
    String numberFrom();

    /**
     * @return the numberTo value.
     */
    String numberTo();

    /**
     * @return the prefixSize value.
     */
    String prefixSize();

    /**
     * @return the replacementString value.
     */
    String replacementString();

    /**
     * @return the ruleState value.
     */
    DataMaskingRuleState ruleState();

    /**
     * @return the schemaName value.
     */
    String schemaName();

    /**
     * @return the suffixSize value.
     */
    String suffixSize();

    /**
     * @return the tableName value.
     */
    String tableName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DataMaskingRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDataMaskingPolicy, DefinitionStages.WithColumnName, DefinitionStages.WithMaskingFunction, DefinitionStages.WithSchemaName, DefinitionStages.WithTableName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DataMaskingRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DataMaskingRule definition.
         */
        interface Blank extends WithDataMaskingPolicy {
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify DataMaskingPolicy.
         */
        interface WithDataMaskingPolicy {
           /**
            * Specifies resourceGroupName, workspaceName, sqlPoolName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @param sqlPoolName SQL pool name
            * @return the next definition stage
            */
            WithColumnName withExistingDataMaskingPolicy(String resourceGroupName, String workspaceName, String sqlPoolName);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify ColumnName.
         */
        interface WithColumnName {
           /**
            * Specifies columnName.
            * @param columnName The column name on which the data masking rule is applied
            * @return the next definition stage
            */
            WithMaskingFunction withColumnName(String columnName);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify MaskingFunction.
         */
        interface WithMaskingFunction {
           /**
            * Specifies maskingFunction.
            * @param maskingFunction The masking function that is used for the data masking rule. Possible values include: 'Default', 'CCN', 'Email', 'Number', 'SSN', 'Text'
            * @return the next definition stage
            */
            WithSchemaName withMaskingFunction(DataMaskingFunction maskingFunction);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify SchemaName.
         */
        interface WithSchemaName {
           /**
            * Specifies schemaName.
            * @param schemaName The schema name on which the data masking rule is applied
            * @return the next definition stage
            */
            WithTableName withSchemaName(String schemaName);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify TableName.
         */
        interface WithTableName {
           /**
            * Specifies tableName.
            * @param tableName The table name on which the data masking rule is applied
            * @return the next definition stage
            */
            WithCreate withTableName(String tableName);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify AliasName.
         */
        interface WithAliasName {
            /**
             * Specifies aliasName.
             * @param aliasName The alias name. This is a legacy parameter and is no longer used
             * @return the next definition stage
             */
            WithCreate withAliasName(String aliasName);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify NumberFrom.
         */
        interface WithNumberFrom {
            /**
             * Specifies numberFrom.
             * @param numberFrom The numberFrom property of the masking rule. Required if maskingFunction is set to Number, otherwise this parameter will be ignored
             * @return the next definition stage
             */
            WithCreate withNumberFrom(String numberFrom);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify NumberTo.
         */
        interface WithNumberTo {
            /**
             * Specifies numberTo.
             * @param numberTo The numberTo property of the data masking rule. Required if maskingFunction is set to Number, otherwise this parameter will be ignored
             * @return the next definition stage
             */
            WithCreate withNumberTo(String numberTo);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify PrefixSize.
         */
        interface WithPrefixSize {
            /**
             * Specifies prefixSize.
             * @param prefixSize If maskingFunction is set to Text, the number of characters to show unmasked in the beginning of the string. Otherwise, this parameter will be ignored
             * @return the next definition stage
             */
            WithCreate withPrefixSize(String prefixSize);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify ReplacementString.
         */
        interface WithReplacementString {
            /**
             * Specifies replacementString.
             * @param replacementString If maskingFunction is set to Text, the character to use for masking the unexposed part of the string. Otherwise, this parameter will be ignored
             * @return the next definition stage
             */
            WithCreate withReplacementString(String replacementString);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify RuleState.
         */
        interface WithRuleState {
            /**
             * Specifies ruleState.
             * @param ruleState The rule state. Used to delete a rule. To delete an existing rule, specify the schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the rule doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the provided value of ruleState. Possible values include: 'Disabled', 'Enabled'
             * @return the next definition stage
             */
            WithCreate withRuleState(DataMaskingRuleState ruleState);
        }

        /**
         * The stage of the datamaskingrule definition allowing to specify SuffixSize.
         */
        interface WithSuffixSize {
            /**
             * Specifies suffixSize.
             * @param suffixSize If maskingFunction is set to Text, the number of characters to show unmasked at the end of the string. Otherwise, this parameter will be ignored
             * @return the next definition stage
             */
            WithCreate withSuffixSize(String suffixSize);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DataMaskingRule>, DefinitionStages.WithAliasName, DefinitionStages.WithNumberFrom, DefinitionStages.WithNumberTo, DefinitionStages.WithPrefixSize, DefinitionStages.WithReplacementString, DefinitionStages.WithRuleState, DefinitionStages.WithSuffixSize {
        }
    }
    /**
     * The template for a DataMaskingRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DataMaskingRule>, UpdateStages.WithAliasName, UpdateStages.WithNumberFrom, UpdateStages.WithNumberTo, UpdateStages.WithPrefixSize, UpdateStages.WithReplacementString, UpdateStages.WithRuleState, UpdateStages.WithSuffixSize {
    }

    /**
     * Grouping of DataMaskingRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the datamaskingrule update allowing to specify AliasName.
         */
        interface WithAliasName {
            /**
             * Specifies aliasName.
             * @param aliasName The alias name. This is a legacy parameter and is no longer used
             * @return the next update stage
             */
            Update withAliasName(String aliasName);
        }

        /**
         * The stage of the datamaskingrule update allowing to specify NumberFrom.
         */
        interface WithNumberFrom {
            /**
             * Specifies numberFrom.
             * @param numberFrom The numberFrom property of the masking rule. Required if maskingFunction is set to Number, otherwise this parameter will be ignored
             * @return the next update stage
             */
            Update withNumberFrom(String numberFrom);
        }

        /**
         * The stage of the datamaskingrule update allowing to specify NumberTo.
         */
        interface WithNumberTo {
            /**
             * Specifies numberTo.
             * @param numberTo The numberTo property of the data masking rule. Required if maskingFunction is set to Number, otherwise this parameter will be ignored
             * @return the next update stage
             */
            Update withNumberTo(String numberTo);
        }

        /**
         * The stage of the datamaskingrule update allowing to specify PrefixSize.
         */
        interface WithPrefixSize {
            /**
             * Specifies prefixSize.
             * @param prefixSize If maskingFunction is set to Text, the number of characters to show unmasked in the beginning of the string. Otherwise, this parameter will be ignored
             * @return the next update stage
             */
            Update withPrefixSize(String prefixSize);
        }

        /**
         * The stage of the datamaskingrule update allowing to specify ReplacementString.
         */
        interface WithReplacementString {
            /**
             * Specifies replacementString.
             * @param replacementString If maskingFunction is set to Text, the character to use for masking the unexposed part of the string. Otherwise, this parameter will be ignored
             * @return the next update stage
             */
            Update withReplacementString(String replacementString);
        }

        /**
         * The stage of the datamaskingrule update allowing to specify RuleState.
         */
        interface WithRuleState {
            /**
             * Specifies ruleState.
             * @param ruleState The rule state. Used to delete a rule. To delete an existing rule, specify the schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the rule doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the provided value of ruleState. Possible values include: 'Disabled', 'Enabled'
             * @return the next update stage
             */
            Update withRuleState(DataMaskingRuleState ruleState);
        }

        /**
         * The stage of the datamaskingrule update allowing to specify SuffixSize.
         */
        interface WithSuffixSize {
            /**
             * Specifies suffixSize.
             * @param suffixSize If maskingFunction is set to Text, the number of characters to show unmasked at the end of the string. Otherwise, this parameter will be ignored
             * @return the next update stage
             */
            Update withSuffixSize(String suffixSize);
        }

    }
}
