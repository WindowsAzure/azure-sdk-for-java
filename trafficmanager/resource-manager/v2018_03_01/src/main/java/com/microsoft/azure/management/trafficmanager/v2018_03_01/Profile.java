/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2018_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.trafficmanager.v2018_03_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.trafficmanager.v2018_03_01.implementation.EndpointInner;
import com.microsoft.azure.management.trafficmanager.v2018_03_01.implementation.ProfileInner;

/**
 * Type representing Profile.
 */
public interface Profile extends HasInner<ProfileInner>, Resource, GroupableResourceCore<NetworkManager, ProfileInner>, HasResourceGroup, Refreshable<Profile>, Updatable<Profile.Update>, HasManager<NetworkManager> {
    /**
     * @return the dnsConfig value.
     */
    DnsConfig dnsConfig();

    /**
     * @return the endpoints value.
     */
    List<Endpoint> endpoints();

    /**
     * @return the monitorConfig value.
     */
    MonitorConfig monitorConfig();

    /**
     * @return the profileStatus value.
     */
    ProfileStatus profileStatus();

    /**
     * @return the trafficRoutingMethod value.
     */
    TrafficRoutingMethod trafficRoutingMethod();

    /**
     * @return the trafficViewEnrollmentStatus value.
     */
    TrafficViewEnrollmentStatus trafficViewEnrollmentStatus();

    /**
     * The entirety of the Profile definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Profile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Profile definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Profile definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the profile update allowing to specify DnsConfig.
         */
        interface WithDnsConfig {
            /**
             * Specifies dnsConfig.
             */
            WithCreate withDnsConfig(DnsConfig dnsConfig);
        }

        /**
         * The stage of the profile update allowing to specify Endpoints.
         */
        interface WithEndpoints {
            /**
             * Specifies endpoints.
             */
            WithCreate withEndpoints(List<EndpointInner> endpoints);
        }

        /**
         * The stage of the profile update allowing to specify MonitorConfig.
         */
        interface WithMonitorConfig {
            /**
             * Specifies monitorConfig.
             */
            WithCreate withMonitorConfig(MonitorConfig monitorConfig);
        }

        /**
         * The stage of the profile update allowing to specify ProfileStatus.
         */
        interface WithProfileStatus {
            /**
             * Specifies profileStatus.
             */
            WithCreate withProfileStatus(ProfileStatus profileStatus);
        }

        /**
         * The stage of the profile update allowing to specify TrafficRoutingMethod.
         */
        interface WithTrafficRoutingMethod {
            /**
             * Specifies trafficRoutingMethod.
             */
            WithCreate withTrafficRoutingMethod(TrafficRoutingMethod trafficRoutingMethod);
        }

        /**
         * The stage of the profile update allowing to specify TrafficViewEnrollmentStatus.
         */
        interface WithTrafficViewEnrollmentStatus {
            /**
             * Specifies trafficViewEnrollmentStatus.
             */
            WithCreate withTrafficViewEnrollmentStatus(TrafficViewEnrollmentStatus trafficViewEnrollmentStatus);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Profile>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDnsConfig, DefinitionStages.WithEndpoints, DefinitionStages.WithMonitorConfig, DefinitionStages.WithProfileStatus, DefinitionStages.WithTrafficRoutingMethod, DefinitionStages.WithTrafficViewEnrollmentStatus {
        }
    }
    /**
     * The template for a Profile update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Profile>, Resource.UpdateWithTags<Update>, UpdateStages.WithDnsConfig, UpdateStages.WithEndpoints, UpdateStages.WithMonitorConfig, UpdateStages.WithProfileStatus, UpdateStages.WithTrafficRoutingMethod, UpdateStages.WithTrafficViewEnrollmentStatus {
    }

    /**
     * Grouping of Profile update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the profile {0} allowing to specify DnsConfig.
         */
        interface WithDnsConfig {
            /**
             * Specifies dnsConfig.
             */
            Update withDnsConfig(DnsConfig dnsConfig);
        }

        /**
         * The stage of the profile {0} allowing to specify Endpoints.
         */
        interface WithEndpoints {
            /**
             * Specifies endpoints.
             */
            Update withEndpoints(List<EndpointInner> endpoints);
        }

        /**
         * The stage of the profile {0} allowing to specify MonitorConfig.
         */
        interface WithMonitorConfig {
            /**
             * Specifies monitorConfig.
             */
            Update withMonitorConfig(MonitorConfig monitorConfig);
        }

        /**
         * The stage of the profile {0} allowing to specify ProfileStatus.
         */
        interface WithProfileStatus {
            /**
             * Specifies profileStatus.
             */
            Update withProfileStatus(ProfileStatus profileStatus);
        }

        /**
         * The stage of the profile {0} allowing to specify TrafficRoutingMethod.
         */
        interface WithTrafficRoutingMethod {
            /**
             * Specifies trafficRoutingMethod.
             */
            Update withTrafficRoutingMethod(TrafficRoutingMethod trafficRoutingMethod);
        }

        /**
         * The stage of the profile {0} allowing to specify TrafficViewEnrollmentStatus.
         */
        interface WithTrafficViewEnrollmentStatus {
            /**
             * Specifies trafficViewEnrollmentStatus.
             */
            Update withTrafficViewEnrollmentStatus(TrafficViewEnrollmentStatus trafficViewEnrollmentStatus);
        }

    }
}
