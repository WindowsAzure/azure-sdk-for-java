/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.LabInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.LabServicesManager;
import java.util.Map;
import org.joda.time.Period;
import org.joda.time.DateTime;

/**
 * Type representing Lab.
 */
public interface Lab extends HasInner<LabInner>, Indexable, Refreshable<Lab>, Updatable<Lab.Update>, HasManager<LabServicesManager> {
    /**
     * @return the createdByObjectId value.
     */
    String createdByObjectId();

    /**
     * @return the createdByUserPrincipalName value.
     */
    String createdByUserPrincipalName();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invitationCode value.
     */
    String invitationCode();

    /**
     * @return the latestOperationResult value.
     */
    LatestOperationResult latestOperationResult();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maxUsersInLab value.
     */
    Integer maxUsersInLab();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the usageQuota value.
     */
    Period usageQuota();

    /**
     * @return the userAccessMode value.
     */
    LabUserAccessMode userAccessMode();

    /**
     * @return the userQuota value.
     */
    Integer userQuota();

    /**
     * The entirety of the Lab definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLabaccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Lab definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Lab definition.
         */
        interface Blank extends WithLabaccount {
        }

        /**
         * The stage of the lab definition allowing to specify Labaccount.
         */
        interface WithLabaccount {
           /**
            * Specifies resourceGroupName, labAccountName.
            * @param resourceGroupName The name of the resource group
            * @param labAccountName The name of the lab Account
            * @return the next definition stage
            */
            WithCreate withExistingLabaccount(String resourceGroupName, String labAccountName);
        }

        /**
         * The stage of the lab definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the lab definition allowing to specify MaxUsersInLab.
         */
        interface WithMaxUsersInLab {
            /**
             * Specifies maxUsersInLab.
             * @param maxUsersInLab Maximum number of users allowed in the lab
             * @return the next definition stage
             */
            WithCreate withMaxUsersInLab(Integer maxUsersInLab);
        }

        /**
         * The stage of the lab definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the lab definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the lab definition allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next definition stage
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the lab definition allowing to specify UsageQuota.
         */
        interface WithUsageQuota {
            /**
             * Specifies usageQuota.
             * @param usageQuota Maximum duration a user can use an environment for in the lab
             * @return the next definition stage
             */
            WithCreate withUsageQuota(Period usageQuota);
        }

        /**
         * The stage of the lab definition allowing to specify UserAccessMode.
         */
        interface WithUserAccessMode {
            /**
             * Specifies userAccessMode.
             * @param userAccessMode Lab user access mode (open to all vs. restricted to those listed on the lab). Possible values include: 'Restricted', 'Open'
             * @return the next definition stage
             */
            WithCreate withUserAccessMode(LabUserAccessMode userAccessMode);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Lab>, DefinitionStages.WithLocation, DefinitionStages.WithMaxUsersInLab, DefinitionStages.WithProvisioningState, DefinitionStages.WithTags, DefinitionStages.WithUniqueIdentifier, DefinitionStages.WithUsageQuota, DefinitionStages.WithUserAccessMode {
        }
    }
    /**
     * The template for a Lab update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Lab>, UpdateStages.WithLocation, UpdateStages.WithMaxUsersInLab, UpdateStages.WithProvisioningState, UpdateStages.WithTags, UpdateStages.WithUniqueIdentifier, UpdateStages.WithUsageQuota, UpdateStages.WithUserAccessMode {
    }

    /**
     * Grouping of Lab update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the lab update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the lab update allowing to specify MaxUsersInLab.
         */
        interface WithMaxUsersInLab {
            /**
             * Specifies maxUsersInLab.
             * @param maxUsersInLab Maximum number of users allowed in the lab
             * @return the next update stage
             */
            Update withMaxUsersInLab(Integer maxUsersInLab);
        }

        /**
         * The stage of the lab update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the lab update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the lab update allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next update stage
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the lab update allowing to specify UsageQuota.
         */
        interface WithUsageQuota {
            /**
             * Specifies usageQuota.
             * @param usageQuota Maximum duration a user can use an environment for in the lab
             * @return the next update stage
             */
            Update withUsageQuota(Period usageQuota);
        }

        /**
         * The stage of the lab update allowing to specify UserAccessMode.
         */
        interface WithUserAccessMode {
            /**
             * Specifies userAccessMode.
             * @param userAccessMode Lab user access mode (open to all vs. restricted to those listed on the lab). Possible values include: 'Restricted', 'Open'
             * @return the next update stage
             */
            Update withUserAccessMode(LabUserAccessMode userAccessMode);
        }

    }
}
