/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview.implementation.IoTCentralManager;
import com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview.implementation.AppInner;

/**
 * Type representing App.
 */
public interface App extends HasInner<AppInner>, Resource, GroupableResourceCore<IoTCentralManager, AppInner>, HasResourceGroup, Refreshable<App>, Updatable<App.Update>, HasManager<IoTCentralManager> {
    /**
     * @return the applicationId value.
     */
    String applicationId();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the sku value.
     */
    AppSkuInfo sku();

    /**
     * @return the subdomain value.
     */
    String subdomain();

    /**
     * @return the template value.
     */
    String template();

    /**
     * The entirety of the App definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of App definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a App definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the App definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the app definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku A valid instance SKU
            * @return the next definition stage
*/
            WithCreate withSku(AppSkuInfo sku);
        }

        /**
         * The stage of the app definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The display name of the application
             * @return the next definition stage
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the app definition allowing to specify Subdomain.
         */
        interface WithSubdomain {
            /**
             * Specifies subdomain.
             * @param subdomain The subdomain of the application
             * @return the next definition stage
             */
            WithCreate withSubdomain(String subdomain);
        }

        /**
         * The stage of the app definition allowing to specify Template.
         */
        interface WithTemplate {
            /**
             * Specifies template.
             * @param template The ID of the application template, which is a blueprint that defines the characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined from scratch
             * @return the next definition stage
             */
            WithCreate withTemplate(String template);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<App>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDisplayName, DefinitionStages.WithSubdomain, DefinitionStages.WithTemplate {
        }
    }
    /**
     * The template for a App update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<App>, Resource.UpdateWithTags<Update>, UpdateStages.WithDisplayName, UpdateStages.WithSubdomain, UpdateStages.WithTemplate {
    }

    /**
     * Grouping of App update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the app update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The display name of the application
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the app update allowing to specify Subdomain.
         */
        interface WithSubdomain {
            /**
             * Specifies subdomain.
             * @param subdomain The subdomain of the application
             * @return the next update stage
             */
            Update withSubdomain(String subdomain);
        }

        /**
         * The stage of the app update allowing to specify Template.
         */
        interface WithTemplate {
            /**
             * Specifies template.
             * @param template The ID of the application template, which is a blueprint that defines the characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and allows the application to be defined from scratch
             * @return the next update stage
             */
            Update withTemplate(String template);
        }

    }
}
