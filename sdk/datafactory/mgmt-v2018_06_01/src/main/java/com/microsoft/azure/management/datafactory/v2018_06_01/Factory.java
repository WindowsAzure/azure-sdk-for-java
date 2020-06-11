/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DataFactoryManager;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.FactoryInner;

/**
 * Type representing Factory.
 */
public interface Factory extends HasInner<FactoryInner>, Resource, GroupableResourceCore<DataFactoryManager, FactoryInner>, HasResourceGroup, Refreshable<Factory>, Updatable<Factory.Update>, HasManager<DataFactoryManager> {
    /**
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * @return the createTime value.
     */
    DateTime createTime();

    /**
     * @return the eTag value.
     */
    String eTag();

    /**
     * @return the globalParameters value.
     */
    Map<String, GlobalParameterSpecification> globalParameters();

    /**
     * @return the identity value.
     */
    FactoryIdentity identity();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the repoConfiguration value.
     */
    FactoryRepoConfiguration repoConfiguration();

    /**
     * @return the version value.
     */
    String version();

    /**
     * The entirety of the Factory definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithIfMatch, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Factory definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Factory definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Factory definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithIfMatch> {
        }

        /**
         * The stage of the factory definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the factory entity. Should only be specified for update, for which it should match existing entity or can be * for unconditional update
            * @return the next definition stage
*/
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the factory definition allowing to specify AdditionalProperties.
         */
        interface WithAdditionalProperties {
            /**
             * Specifies additionalProperties.
             * @param additionalProperties Unmatched properties from the message are deserialized this collection
             * @return the next definition stage
             */
            WithCreate withAdditionalProperties(Map<String, Object> additionalProperties);
        }

        /**
         * The stage of the factory definition allowing to specify GlobalParameters.
         */
        interface WithGlobalParameters {
            /**
             * Specifies globalParameters.
             * @param globalParameters List of parameters for factory
             * @return the next definition stage
             */
            WithCreate withGlobalParameters(Map<String, GlobalParameterSpecification> globalParameters);
        }

        /**
         * The stage of the factory definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Managed service identity of the factory
             * @return the next definition stage
             */
            WithCreate withIdentity(FactoryIdentity identity);
        }

        /**
         * The stage of the factory definition allowing to specify RepoConfiguration.
         */
        interface WithRepoConfiguration {
            /**
             * Specifies repoConfiguration.
             * @param repoConfiguration Git repo information of the factory
             * @return the next definition stage
             */
            WithCreate withRepoConfiguration(FactoryRepoConfiguration repoConfiguration);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Factory>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdditionalProperties, DefinitionStages.WithGlobalParameters, DefinitionStages.WithIdentity, DefinitionStages.WithRepoConfiguration {
        }
    }
    /**
     * The template for a Factory update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Factory>, Resource.UpdateWithTags<Update>, UpdateStages.WithIdentity {
    }

    /**
     * Grouping of Factory update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the factory update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Managed service identity of the factory
             * @return the next update stage
             */
            Update withIdentity(FactoryIdentity identity);
        }

    }
}
