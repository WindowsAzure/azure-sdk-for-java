/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.IntegrationAccountSessionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing IntegrationAccountSession.
 */
public interface IntegrationAccountSession extends HasInner<IntegrationAccountSessionInner>, Indexable, Refreshable<IntegrationAccountSession>, Updatable<IntegrationAccountSession.Update>, HasManager<LogicManager> {
    /**
     * @return the changedTime value.
     */
    DateTime changedTime();

    /**
     * @return the content value.
     */
    Object content();

    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the IntegrationAccountSession definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithIntegrationAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IntegrationAccountSession definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IntegrationAccountSession definition.
         */
        interface Blank extends WithIntegrationAccount {
        }

        /**
         * The stage of the integrationaccountsession definition allowing to specify IntegrationAccount.
         */
        interface WithIntegrationAccount {
           /**
            * Specifies resourceGroupName, integrationAccountName.
            */
            WithCreate withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName);
        }

        /**
         * The stage of the integrationaccountsession definition allowing to specify Content.
         */
        interface WithContent {
            /**
             * Specifies content.
             */
            WithCreate withContent(Object content);
        }

        /**
         * The stage of the integrationaccountsession definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the integrationaccountsession definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IntegrationAccountSession>, DefinitionStages.WithContent, DefinitionStages.WithLocation, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a IntegrationAccountSession update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IntegrationAccountSession>, UpdateStages.WithContent, UpdateStages.WithLocation, UpdateStages.WithTags {
    }

    /**
     * Grouping of IntegrationAccountSession update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the integrationaccountsession update allowing to specify Content.
         */
        interface WithContent {
            /**
             * Specifies content.
             */
            Update withContent(Object content);
        }

        /**
         * The stage of the integrationaccountsession update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the integrationaccountsession update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
