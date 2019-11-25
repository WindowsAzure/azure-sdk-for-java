/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2017_07_01.implementation.ContainerServiceManager;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2017_07_01.implementation.ContainerServiceInner;

/**
 * Type representing ContainerService.
 */
public interface ContainerService extends HasInner<ContainerServiceInner>, Resource, GroupableResourceCore<ContainerServiceManager, ContainerServiceInner>, HasResourceGroup, Refreshable<ContainerService>, Updatable<ContainerService.Update>, HasManager<ContainerServiceManager> {
    /**
     * @return the agentPoolProfiles value.
     */
    List<ContainerServiceAgentPoolProfile> agentPoolProfiles();

    /**
     * @return the customProfile value.
     */
    ContainerServiceCustomProfile customProfile();

    /**
     * @return the diagnosticsProfile value.
     */
    ContainerServiceDiagnosticsProfile diagnosticsProfile();

    /**
     * @return the linuxProfile value.
     */
    ContainerServiceLinuxProfile linuxProfile();

    /**
     * @return the masterProfile value.
     */
    ContainerServiceMasterProfile masterProfile();

    /**
     * @return the orchestratorProfile value.
     */
    ContainerServiceOrchestratorProfile orchestratorProfile();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the servicePrincipalProfile value.
     */
    ContainerServiceServicePrincipalProfile servicePrincipalProfile();

    /**
     * @return the windowsProfile value.
     */
    ContainerServiceWindowsProfile windowsProfile();

    /**
     * The entirety of the ContainerService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithLinuxProfile, DefinitionStages.WithMasterProfile, DefinitionStages.WithOrchestratorProfile, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ContainerService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ContainerService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ContainerService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithLinuxProfile> {
        }

        /**
         * The stage of the containerservice definition allowing to specify LinuxProfile.
         */
        interface WithLinuxProfile {
           /**
            * Specifies linuxProfile.
            */
            WithMasterProfile withLinuxProfile(ContainerServiceLinuxProfile linuxProfile);
        }

        /**
         * The stage of the containerservice definition allowing to specify MasterProfile.
         */
        interface WithMasterProfile {
           /**
            * Specifies masterProfile.
            */
            WithOrchestratorProfile withMasterProfile(ContainerServiceMasterProfile masterProfile);
        }

        /**
         * The stage of the containerservice definition allowing to specify OrchestratorProfile.
         */
        interface WithOrchestratorProfile {
           /**
            * Specifies orchestratorProfile.
            */
            WithCreate withOrchestratorProfile(ContainerServiceOrchestratorProfile orchestratorProfile);
        }

        /**
         * The stage of the containerservice update allowing to specify AgentPoolProfiles.
         */
        interface WithAgentPoolProfiles {
            /**
             * Specifies agentPoolProfiles.
             */
            WithCreate withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles);
        }

        /**
         * The stage of the containerservice update allowing to specify CustomProfile.
         */
        interface WithCustomProfile {
            /**
             * Specifies customProfile.
             */
            WithCreate withCustomProfile(ContainerServiceCustomProfile customProfile);
        }

        /**
         * The stage of the containerservice update allowing to specify DiagnosticsProfile.
         */
        interface WithDiagnosticsProfile {
            /**
             * Specifies diagnosticsProfile.
             */
            WithCreate withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile);
        }

        /**
         * The stage of the containerservice update allowing to specify ServicePrincipalProfile.
         */
        interface WithServicePrincipalProfile {
            /**
             * Specifies servicePrincipalProfile.
             */
            WithCreate withServicePrincipalProfile(ContainerServiceServicePrincipalProfile servicePrincipalProfile);
        }

        /**
         * The stage of the containerservice update allowing to specify WindowsProfile.
         */
        interface WithWindowsProfile {
            /**
             * Specifies windowsProfile.
             */
            WithCreate withWindowsProfile(ContainerServiceWindowsProfile windowsProfile);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ContainerService>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAgentPoolProfiles, DefinitionStages.WithCustomProfile, DefinitionStages.WithDiagnosticsProfile, DefinitionStages.WithServicePrincipalProfile, DefinitionStages.WithWindowsProfile {
        }
    }
    /**
     * The template for a ContainerService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ContainerService>, Resource.UpdateWithTags<Update>, UpdateStages.WithAgentPoolProfiles, UpdateStages.WithCustomProfile, UpdateStages.WithDiagnosticsProfile, UpdateStages.WithServicePrincipalProfile, UpdateStages.WithWindowsProfile {
    }

    /**
     * Grouping of ContainerService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the containerservice {0} allowing to specify AgentPoolProfiles.
         */
        interface WithAgentPoolProfiles {
            /**
             * Specifies agentPoolProfiles.
             */
            Update withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles);
        }

        /**
         * The stage of the containerservice {0} allowing to specify CustomProfile.
         */
        interface WithCustomProfile {
            /**
             * Specifies customProfile.
             */
            Update withCustomProfile(ContainerServiceCustomProfile customProfile);
        }

        /**
         * The stage of the containerservice {0} allowing to specify DiagnosticsProfile.
         */
        interface WithDiagnosticsProfile {
            /**
             * Specifies diagnosticsProfile.
             */
            Update withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile);
        }

        /**
         * The stage of the containerservice {0} allowing to specify ServicePrincipalProfile.
         */
        interface WithServicePrincipalProfile {
            /**
             * Specifies servicePrincipalProfile.
             */
            Update withServicePrincipalProfile(ContainerServiceServicePrincipalProfile servicePrincipalProfile);
        }

        /**
         * The stage of the containerservice {0} allowing to specify WindowsProfile.
         */
        interface WithWindowsProfile {
            /**
             * Specifies windowsProfile.
             */
            Update withWindowsProfile(ContainerServiceWindowsProfile windowsProfile);
        }

    }
}
