/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.confluent.v2020_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.implementation.ConfluentManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.implementation.OrganizationResourceInner;

/**
 * Type representing OrganizationResource.
 */
public interface OrganizationResource extends HasInner<OrganizationResourceInner>, Resource, GroupableResourceCore<ConfluentManager, OrganizationResourceInner>, HasResourceGroup, Refreshable<OrganizationResource>, Updatable<OrganizationResource.Update>, HasManager<ConfluentManager> {
    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the offerDetail value.
     */
    OrganizationResourcePropertiesOfferDetail offerDetail();

    /**
     * @return the organizationId value.
     */
    String organizationId();

    /**
     * @return the provisioningState value.
     */
    ProvisionState provisioningState();

    /**
     * @return the ssoUrl value.
     */
    String ssoUrl();

    /**
     * @return the userDetail value.
     */
    OrganizationResourcePropertiesUserDetail userDetail();

    /**
     * The entirety of the OrganizationResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of OrganizationResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a OrganizationResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the OrganizationResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the organizationresource definition allowing to specify OfferDetail.
         */
        interface WithOfferDetail {
            /**
             * Specifies offerDetail.
             * @param offerDetail Confluent offer detail
             * @return the next definition stage
             */
            WithCreate withOfferDetail(OrganizationResourcePropertiesOfferDetail offerDetail);
        }

        /**
         * The stage of the organizationresource definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState Provision states for confluent RP. Possible values include: 'Accepted', 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled', 'Deleted', 'NotSpecified'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(ProvisionState provisioningState);
        }

        /**
         * The stage of the organizationresource definition allowing to specify UserDetail.
         */
        interface WithUserDetail {
            /**
             * Specifies userDetail.
             * @param userDetail Subscriber detail
             * @return the next definition stage
             */
            WithCreate withUserDetail(OrganizationResourcePropertiesUserDetail userDetail);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<OrganizationResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithOfferDetail, DefinitionStages.WithProvisioningState, DefinitionStages.WithUserDetail {
        }
    }
    /**
     * The template for a OrganizationResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<OrganizationResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithOfferDetail, UpdateStages.WithProvisioningState, UpdateStages.WithUserDetail {
    }

    /**
     * Grouping of OrganizationResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the organizationresource update allowing to specify OfferDetail.
         */
        interface WithOfferDetail {
            /**
             * Specifies offerDetail.
             * @param offerDetail Confluent offer detail
             * @return the next update stage
             */
            Update withOfferDetail(OrganizationResourcePropertiesOfferDetail offerDetail);
        }

        /**
         * The stage of the organizationresource update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState Provision states for confluent RP. Possible values include: 'Accepted', 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled', 'Deleted', 'NotSpecified'
             * @return the next update stage
             */
            Update withProvisioningState(ProvisionState provisioningState);
        }

        /**
         * The stage of the organizationresource update allowing to specify UserDetail.
         */
        interface WithUserDetail {
            /**
             * Specifies userDetail.
             * @param userDetail Subscriber detail
             * @return the next update stage
             */
            Update withUserDetail(OrganizationResourcePropertiesUserDetail userDetail);
        }

    }
}
