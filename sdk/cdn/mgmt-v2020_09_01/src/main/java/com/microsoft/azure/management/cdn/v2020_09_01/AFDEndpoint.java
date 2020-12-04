/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.AFDEndpointInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.CdnManager;
import java.util.Map;

/**
 * Type representing AFDEndpoint.
 */
public interface AFDEndpoint extends HasInner<AFDEndpointInner>, Indexable, Refreshable<AFDEndpoint>, Updatable<AFDEndpoint.Update>, HasManager<CdnManager> {
    /**
     * @return the deploymentStatus value.
     */
    DeploymentStatus deploymentStatus();

    /**
     * @return the enabledState value.
     */
    EnabledState enabledState();

    /**
     * @return the hostName value.
     */
    String hostName();

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
     * @return the originResponseTimeoutSeconds value.
     */
    Integer originResponseTimeoutSeconds();

    /**
     * @return the provisioningState value.
     */
    AfdProvisioningState provisioningState();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AFDEndpoint definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProfile, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AFDEndpoint definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AFDEndpoint definition.
         */
        interface Blank extends WithProfile {
        }

        /**
         * The stage of the afdendpoint definition allowing to specify Profile.
         */
        interface WithProfile {
           /**
            * Specifies resourceGroupName, profileName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param profileName Name of the CDN profile which is unique within the resource group
            * @return the next definition stage
            */
            WithLocation withExistingProfile(String resourceGroupName, String profileName);
        }

        /**
         * The stage of the afdendpoint definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the afdendpoint definition allowing to specify EnabledState.
         */
        interface WithEnabledState {
            /**
             * Specifies enabledState.
             * @param enabledState Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'
             * @return the next definition stage
             */
            WithCreate withEnabledState(EnabledState enabledState);
        }

        /**
         * The stage of the afdendpoint definition allowing to specify OriginResponseTimeoutSeconds.
         */
        interface WithOriginResponseTimeoutSeconds {
            /**
             * Specifies originResponseTimeoutSeconds.
             * @param originResponseTimeoutSeconds Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns
             * @return the next definition stage
             */
            WithCreate withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds);
        }

        /**
         * The stage of the afdendpoint definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AFDEndpoint>, DefinitionStages.WithEnabledState, DefinitionStages.WithOriginResponseTimeoutSeconds, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a AFDEndpoint update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AFDEndpoint>, UpdateStages.WithEnabledState, UpdateStages.WithOriginResponseTimeoutSeconds, UpdateStages.WithTags {
    }

    /**
     * Grouping of AFDEndpoint update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the afdendpoint update allowing to specify EnabledState.
         */
        interface WithEnabledState {
            /**
             * Specifies enabledState.
             * @param enabledState Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withEnabledState(EnabledState enabledState);
        }

        /**
         * The stage of the afdendpoint update allowing to specify OriginResponseTimeoutSeconds.
         */
        interface WithOriginResponseTimeoutSeconds {
            /**
             * Specifies originResponseTimeoutSeconds.
             * @param originResponseTimeoutSeconds Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns
             * @return the next update stage
             */
            Update withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds);
        }

        /**
         * The stage of the afdendpoint update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Endpoint tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
