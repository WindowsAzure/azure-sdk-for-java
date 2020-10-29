/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestackhci.v2020_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azurestackhci.v2020_10_01.implementation.AzureStackHCIManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.azurestackhci.v2020_10_01.implementation.ClusterInner;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Resource, GroupableResourceCore<AzureStackHCIManager, ClusterInner>, HasResourceGroup, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<AzureStackHCIManager> {
    /**
     * @return the aadClientId value.
     */
    String aadClientId();

    /**
     * @return the aadTenantId value.
     */
    String aadTenantId();

    /**
     * @return the billingModel value.
     */
    String billingModel();

    /**
     * @return the cloudId value.
     */
    String cloudId();

    /**
     * @return the lastBillingTimestamp value.
     */
    DateTime lastBillingTimestamp();

    /**
     * @return the lastSyncTimestamp value.
     */
    DateTime lastSyncTimestamp();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the registrationTimestamp value.
     */
    DateTime registrationTimestamp();

    /**
     * @return the reportedProperties value.
     */
    ClusterReportedProperties reportedProperties();

    /**
     * @return the status value.
     */
    Status status();

    /**
     * @return the trialDaysRemaining value.
     */
    Double trialDaysRemaining();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithAadClientId, DefinitionStages.WithAadTenantId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Cluster definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Cluster definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithAadClientId> {
        }

        /**
         * The stage of the cluster definition allowing to specify AadClientId.
         */
        interface WithAadClientId {
           /**
            * Specifies aadClientId.
            * @param aadClientId App id of cluster AAD identity
            * @return the next definition stage
*/
            WithAadTenantId withAadClientId(String aadClientId);
        }

        /**
         * The stage of the cluster definition allowing to specify AadTenantId.
         */
        interface WithAadTenantId {
           /**
            * Specifies aadTenantId.
            * @param aadTenantId Tenant id of cluster AAD identity
            * @return the next definition stage
*/
            WithCreate withAadTenantId(String aadTenantId);
        }

        /**
         * The stage of the cluster definition allowing to specify ReportedProperties.
         */
        interface WithReportedProperties {
            /**
             * Specifies reportedProperties.
             * @param reportedProperties Properties reported by cluster agent
             * @return the next definition stage
             */
            WithCreate withReportedProperties(ClusterReportedProperties reportedProperties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithReportedProperties {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, Resource.UpdateWithTags<Update>, UpdateStages.WithReportedProperties {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify ReportedProperties.
         */
        interface WithReportedProperties {
            /**
             * Specifies reportedProperties.
             * @param reportedProperties Properties reported by cluster agent
             * @return the next update stage
             */
            Update withReportedProperties(ClusterReportedProperties reportedProperties);
        }

    }
}
