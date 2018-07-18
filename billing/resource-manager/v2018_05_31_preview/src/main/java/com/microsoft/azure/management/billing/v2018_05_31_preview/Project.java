/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_05_31_preview.implementation.ProjectInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_05_31_preview.implementation.BillingManager;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_05_31_preview.implementation.EligibleOfferInner;

/**
 * Type representing Project.
 */
public interface Project extends HasInner<ProjectInner>, Indexable, Refreshable<Project>, Updatable<Project.Update>, HasManager<BillingManager> {
    /**
     * @return the costCenter value.
     */
    String costCenter();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the eligibleOffers value.
     */
    List<EligibleOffer> eligibleOffers();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a Project update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Project>, UpdateStages.WithCostCenter, UpdateStages.WithDisplayName, UpdateStages.WithEligibleOffers {
    }

    /**
     * Grouping of Project update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the project update allowing to specify CostCenter.
         */
        interface WithCostCenter {
            /**
             * Specifies costCenter.
             */
            Update withCostCenter(String costCenter);
        }

        /**
         * The stage of the project update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the project update allowing to specify EligibleOffers.
         */
        interface WithEligibleOffers {
            /**
             * Specifies eligibleOffers.
             */
            Update withEligibleOffers(List<EligibleOfferInner> eligibleOffers);
        }

    }
}
