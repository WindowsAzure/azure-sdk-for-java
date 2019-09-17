/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2019_08_01.implementation.ContainerServiceManager;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_08_01.implementation.OpenShiftManagedClusterInner;

/**
 * Type representing OpenShiftManagedCluster.
 */
public interface OpenShiftManagedCluster extends HasInner<OpenShiftManagedClusterInner>, Resource, GroupableResourceCore<ContainerServiceManager, OpenShiftManagedClusterInner>, HasResourceGroup, Refreshable<OpenShiftManagedCluster>, Updatable<OpenShiftManagedCluster.Update>, HasManager<ContainerServiceManager> {
    /**
     * @return the agentPoolProfiles value.
     */
    List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles();

    /**
     * @return the authProfile value.
     */
    OpenShiftManagedClusterAuthProfile authProfile();

    /**
     * @return the clusterVersion value.
     */
    String clusterVersion();

    /**
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * @return the masterPoolProfile value.
     */
    OpenShiftManagedClusterMasterPoolProfile masterPoolProfile();

    /**
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * @return the openShiftVersion value.
     */
    String openShiftVersion();

    /**
     * @return the plan value.
     */
    PurchasePlan plan();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publicHostname value.
     */
    String publicHostname();

    /**
     * @return the routerProfiles value.
     */
    List<OpenShiftRouterProfile> routerProfiles();

    /**
     * The entirety of the OpenShiftManagedCluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithOpenShiftVersion, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of OpenShiftManagedCluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a OpenShiftManagedCluster definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the OpenShiftManagedCluster definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithOpenShiftVersion> {
        }

        /**
         * The stage of the openshiftmanagedcluster definition allowing to specify OpenShiftVersion.
         */
        interface WithOpenShiftVersion {
           /**
            * Specifies openShiftVersion.
            * @param openShiftVersion Version of OpenShift specified when creating the cluster
            * @return the next definition stage
*/
            WithCreate withOpenShiftVersion(String openShiftVersion);
        }

        /**
         * The stage of the openshiftmanagedcluster definition allowing to specify AgentPoolProfiles.
         */
        interface WithAgentPoolProfiles {
            /**
             * Specifies agentPoolProfiles.
             * @param agentPoolProfiles Configuration of OpenShift cluster VMs
             * @return the next definition stage
             */
            WithCreate withAgentPoolProfiles(List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles);
        }

        /**
         * The stage of the openshiftmanagedcluster definition allowing to specify AuthProfile.
         */
        interface WithAuthProfile {
            /**
             * Specifies authProfile.
             * @param authProfile Configures OpenShift authentication
             * @return the next definition stage
             */
            WithCreate withAuthProfile(OpenShiftManagedClusterAuthProfile authProfile);
        }

        /**
         * The stage of the openshiftmanagedcluster definition allowing to specify MasterPoolProfile.
         */
        interface WithMasterPoolProfile {
            /**
             * Specifies masterPoolProfile.
             * @param masterPoolProfile Configuration for OpenShift master VMs
             * @return the next definition stage
             */
            WithCreate withMasterPoolProfile(OpenShiftManagedClusterMasterPoolProfile masterPoolProfile);
        }

        /**
         * The stage of the openshiftmanagedcluster definition allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             * @param networkProfile Configuration for OpenShift networking
             * @return the next definition stage
             */
            WithCreate withNetworkProfile(NetworkProfile networkProfile);
        }

        /**
         * The stage of the openshiftmanagedcluster definition allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             * @param plan Define the resource plan as required by ARM for billing purposes
             * @return the next definition stage
             */
            WithCreate withPlan(PurchasePlan plan);
        }

        /**
         * The stage of the openshiftmanagedcluster definition allowing to specify RouterProfiles.
         */
        interface WithRouterProfiles {
            /**
             * Specifies routerProfiles.
             * @param routerProfiles Configuration for OpenShift router(s)
             * @return the next definition stage
             */
            WithCreate withRouterProfiles(List<OpenShiftRouterProfile> routerProfiles);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<OpenShiftManagedCluster>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAgentPoolProfiles, DefinitionStages.WithAuthProfile, DefinitionStages.WithMasterPoolProfile, DefinitionStages.WithNetworkProfile, DefinitionStages.WithPlan, DefinitionStages.WithRouterProfiles {
        }
    }
    /**
     * The template for a OpenShiftManagedCluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<OpenShiftManagedCluster>, Resource.UpdateWithTags<Update>, UpdateStages.WithAgentPoolProfiles, UpdateStages.WithAuthProfile, UpdateStages.WithMasterPoolProfile, UpdateStages.WithNetworkProfile, UpdateStages.WithPlan, UpdateStages.WithRouterProfiles {
    }

    /**
     * Grouping of OpenShiftManagedCluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the openshiftmanagedcluster update allowing to specify AgentPoolProfiles.
         */
        interface WithAgentPoolProfiles {
            /**
             * Specifies agentPoolProfiles.
             * @param agentPoolProfiles Configuration of OpenShift cluster VMs
             * @return the next update stage
             */
            Update withAgentPoolProfiles(List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles);
        }

        /**
         * The stage of the openshiftmanagedcluster update allowing to specify AuthProfile.
         */
        interface WithAuthProfile {
            /**
             * Specifies authProfile.
             * @param authProfile Configures OpenShift authentication
             * @return the next update stage
             */
            Update withAuthProfile(OpenShiftManagedClusterAuthProfile authProfile);
        }

        /**
         * The stage of the openshiftmanagedcluster update allowing to specify MasterPoolProfile.
         */
        interface WithMasterPoolProfile {
            /**
             * Specifies masterPoolProfile.
             * @param masterPoolProfile Configuration for OpenShift master VMs
             * @return the next update stage
             */
            Update withMasterPoolProfile(OpenShiftManagedClusterMasterPoolProfile masterPoolProfile);
        }

        /**
         * The stage of the openshiftmanagedcluster update allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             * @param networkProfile Configuration for OpenShift networking
             * @return the next update stage
             */
            Update withNetworkProfile(NetworkProfile networkProfile);
        }

        /**
         * The stage of the openshiftmanagedcluster update allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             * @param plan Define the resource plan as required by ARM for billing purposes
             * @return the next update stage
             */
            Update withPlan(PurchasePlan plan);
        }

        /**
         * The stage of the openshiftmanagedcluster update allowing to specify RouterProfiles.
         */
        interface WithRouterProfiles {
            /**
             * Specifies routerProfiles.
             * @param routerProfiles Configuration for OpenShift router(s)
             * @return the next update stage
             */
            Update withRouterProfiles(List<OpenShiftRouterProfile> routerProfiles);
        }

    }
}
