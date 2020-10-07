/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.FunctionEnvelopeInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;
import java.util.Map;

/**
 * Type representing FunctionEnvelope.
 */
public interface FunctionEnvelope extends HasInner<FunctionEnvelopeInner>, Indexable, Refreshable<FunctionEnvelope>, Updatable<FunctionEnvelope.Update>, HasManager<AppServiceManager> {
    /**
     * @return the config value.
     */
    Object config();

    /**
     * @return the configHref value.
     */
    String configHref();

    /**
     * @return the files value.
     */
    Map<String, String> files();

    /**
     * @return the functionAppId value.
     */
    String functionAppId();

    /**
     * @return the href value.
     */
    String href();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invokeUrlTemplate value.
     */
    String invokeUrlTemplate();

    /**
     * @return the isDisabled value.
     */
    Boolean isDisabled();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the language value.
     */
    String language();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the scriptHref value.
     */
    String scriptHref();

    /**
     * @return the scriptRootPathHref value.
     */
    String scriptRootPathHref();

    /**
     * @return the secretsFileHref value.
     */
    String secretsFileHref();

    /**
     * @return the testData value.
     */
    String testData();

    /**
     * @return the testDataHref value.
     */
    String testDataHref();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the FunctionEnvelope definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSite, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FunctionEnvelope definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FunctionEnvelope definition.
         */
        interface Blank extends WithSite {
        }

        /**
         * The stage of the functionenvelope definition allowing to specify Site.
         */
        interface WithSite {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name Site name
            * @return the next definition stage
            */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify Config.
         */
        interface WithConfig {
            /**
             * Specifies config.
             * @param config Config information
             * @return the next definition stage
             */
            WithCreate withConfig(Object config);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify ConfigHref.
         */
        interface WithConfigHref {
            /**
             * Specifies configHref.
             * @param configHref Config URI
             * @return the next definition stage
             */
            WithCreate withConfigHref(String configHref);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify Files.
         */
        interface WithFiles {
            /**
             * Specifies files.
             * @param files File list
             * @return the next definition stage
             */
            WithCreate withFiles(Map<String, String> files);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify FunctionAppId.
         */
        interface WithFunctionAppId {
            /**
             * Specifies functionAppId.
             * @param functionAppId Function App ID
             * @return the next definition stage
             */
            WithCreate withFunctionAppId(String functionAppId);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify Href.
         */
        interface WithHref {
            /**
             * Specifies href.
             * @param href Function URI
             * @return the next definition stage
             */
            WithCreate withHref(String href);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify InvokeUrlTemplate.
         */
        interface WithInvokeUrlTemplate {
            /**
             * Specifies invokeUrlTemplate.
             * @param invokeUrlTemplate The invocation URL
             * @return the next definition stage
             */
            WithCreate withInvokeUrlTemplate(String invokeUrlTemplate);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify IsDisabled.
         */
        interface WithIsDisabled {
            /**
             * Specifies isDisabled.
             * @param isDisabled Gets or sets a value indicating whether the function is disabled
             * @return the next definition stage
             */
            WithCreate withIsDisabled(Boolean isDisabled);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify Kind.
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
         * The stage of the functionenvelope definition allowing to specify Language.
         */
        interface WithLanguage {
            /**
             * Specifies language.
             * @param language The function language
             * @return the next definition stage
             */
            WithCreate withLanguage(String language);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify ScriptHref.
         */
        interface WithScriptHref {
            /**
             * Specifies scriptHref.
             * @param scriptHref Script URI
             * @return the next definition stage
             */
            WithCreate withScriptHref(String scriptHref);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify ScriptRootPathHref.
         */
        interface WithScriptRootPathHref {
            /**
             * Specifies scriptRootPathHref.
             * @param scriptRootPathHref Script root path URI
             * @return the next definition stage
             */
            WithCreate withScriptRootPathHref(String scriptRootPathHref);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify SecretsFileHref.
         */
        interface WithSecretsFileHref {
            /**
             * Specifies secretsFileHref.
             * @param secretsFileHref Secrets file URI
             * @return the next definition stage
             */
            WithCreate withSecretsFileHref(String secretsFileHref);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify TestData.
         */
        interface WithTestData {
            /**
             * Specifies testData.
             * @param testData Test data used when testing via the Azure Portal
             * @return the next definition stage
             */
            WithCreate withTestData(String testData);
        }

        /**
         * The stage of the functionenvelope definition allowing to specify TestDataHref.
         */
        interface WithTestDataHref {
            /**
             * Specifies testDataHref.
             * @param testDataHref Test data URI
             * @return the next definition stage
             */
            WithCreate withTestDataHref(String testDataHref);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FunctionEnvelope>, DefinitionStages.WithConfig, DefinitionStages.WithConfigHref, DefinitionStages.WithFiles, DefinitionStages.WithFunctionAppId, DefinitionStages.WithHref, DefinitionStages.WithInvokeUrlTemplate, DefinitionStages.WithIsDisabled, DefinitionStages.WithKind, DefinitionStages.WithLanguage, DefinitionStages.WithScriptHref, DefinitionStages.WithScriptRootPathHref, DefinitionStages.WithSecretsFileHref, DefinitionStages.WithTestData, DefinitionStages.WithTestDataHref {
        }
    }
    /**
     * The template for a FunctionEnvelope update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FunctionEnvelope>, UpdateStages.WithConfig, UpdateStages.WithConfigHref, UpdateStages.WithFiles, UpdateStages.WithFunctionAppId, UpdateStages.WithHref, UpdateStages.WithInvokeUrlTemplate, UpdateStages.WithIsDisabled, UpdateStages.WithKind, UpdateStages.WithLanguage, UpdateStages.WithScriptHref, UpdateStages.WithScriptRootPathHref, UpdateStages.WithSecretsFileHref, UpdateStages.WithTestData, UpdateStages.WithTestDataHref {
    }

    /**
     * Grouping of FunctionEnvelope update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the functionenvelope update allowing to specify Config.
         */
        interface WithConfig {
            /**
             * Specifies config.
             * @param config Config information
             * @return the next update stage
             */
            Update withConfig(Object config);
        }

        /**
         * The stage of the functionenvelope update allowing to specify ConfigHref.
         */
        interface WithConfigHref {
            /**
             * Specifies configHref.
             * @param configHref Config URI
             * @return the next update stage
             */
            Update withConfigHref(String configHref);
        }

        /**
         * The stage of the functionenvelope update allowing to specify Files.
         */
        interface WithFiles {
            /**
             * Specifies files.
             * @param files File list
             * @return the next update stage
             */
            Update withFiles(Map<String, String> files);
        }

        /**
         * The stage of the functionenvelope update allowing to specify FunctionAppId.
         */
        interface WithFunctionAppId {
            /**
             * Specifies functionAppId.
             * @param functionAppId Function App ID
             * @return the next update stage
             */
            Update withFunctionAppId(String functionAppId);
        }

        /**
         * The stage of the functionenvelope update allowing to specify Href.
         */
        interface WithHref {
            /**
             * Specifies href.
             * @param href Function URI
             * @return the next update stage
             */
            Update withHref(String href);
        }

        /**
         * The stage of the functionenvelope update allowing to specify InvokeUrlTemplate.
         */
        interface WithInvokeUrlTemplate {
            /**
             * Specifies invokeUrlTemplate.
             * @param invokeUrlTemplate The invocation URL
             * @return the next update stage
             */
            Update withInvokeUrlTemplate(String invokeUrlTemplate);
        }

        /**
         * The stage of the functionenvelope update allowing to specify IsDisabled.
         */
        interface WithIsDisabled {
            /**
             * Specifies isDisabled.
             * @param isDisabled Gets or sets a value indicating whether the function is disabled
             * @return the next update stage
             */
            Update withIsDisabled(Boolean isDisabled);
        }

        /**
         * The stage of the functionenvelope update allowing to specify Kind.
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
         * The stage of the functionenvelope update allowing to specify Language.
         */
        interface WithLanguage {
            /**
             * Specifies language.
             * @param language The function language
             * @return the next update stage
             */
            Update withLanguage(String language);
        }

        /**
         * The stage of the functionenvelope update allowing to specify ScriptHref.
         */
        interface WithScriptHref {
            /**
             * Specifies scriptHref.
             * @param scriptHref Script URI
             * @return the next update stage
             */
            Update withScriptHref(String scriptHref);
        }

        /**
         * The stage of the functionenvelope update allowing to specify ScriptRootPathHref.
         */
        interface WithScriptRootPathHref {
            /**
             * Specifies scriptRootPathHref.
             * @param scriptRootPathHref Script root path URI
             * @return the next update stage
             */
            Update withScriptRootPathHref(String scriptRootPathHref);
        }

        /**
         * The stage of the functionenvelope update allowing to specify SecretsFileHref.
         */
        interface WithSecretsFileHref {
            /**
             * Specifies secretsFileHref.
             * @param secretsFileHref Secrets file URI
             * @return the next update stage
             */
            Update withSecretsFileHref(String secretsFileHref);
        }

        /**
         * The stage of the functionenvelope update allowing to specify TestData.
         */
        interface WithTestData {
            /**
             * Specifies testData.
             * @param testData Test data used when testing via the Azure Portal
             * @return the next update stage
             */
            Update withTestData(String testData);
        }

        /**
         * The stage of the functionenvelope update allowing to specify TestDataHref.
         */
        interface WithTestDataHref {
            /**
             * Specifies testDataHref.
             * @param testDataHref Test data URI
             * @return the next update stage
             */
            Update withTestDataHref(String testDataHref);
        }

    }
}
