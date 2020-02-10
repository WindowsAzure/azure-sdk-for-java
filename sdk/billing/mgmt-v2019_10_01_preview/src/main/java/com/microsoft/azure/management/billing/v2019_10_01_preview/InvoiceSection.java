/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.InvoiceSectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;

/**
 * Type representing InvoiceSection.
 */
public interface InvoiceSection extends HasInner<InvoiceSectionInner>, Indexable, Refreshable<InvoiceSection>, Updatable<InvoiceSection.Update>, HasManager<BillingManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

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
     * The entirety of the InvoiceSection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithBillingProfile, DefinitionStages.WithDisplayName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of InvoiceSection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a InvoiceSection definition.
         */
        interface Blank extends WithBillingProfile {
        }

        /**
         * The stage of the invoicesection definition allowing to specify BillingProfile.
         */
        interface WithBillingProfile {
           /**
            * Specifies billingAccountName, billingProfileName.
            * @param billingAccountName billing Account Id
            * @param billingProfileName Billing Profile Id
            * @return the next definition stage
            */
            WithDisplayName withExistingBillingProfile(String billingAccountName, String billingProfileName);
        }

        /**
         * The stage of the invoicesection definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
           /**
            * Specifies displayName.
            * @param displayName The name of the InvoiceSection
            * @return the next definition stage
            */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<InvoiceSection> {
        }
    }
    /**
     * The template for a InvoiceSection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<InvoiceSection>, UpdateStages.WithDisplayName {
    }

    /**
     * Grouping of InvoiceSection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the invoicesection update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The name of the InvoiceSection
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

    }
}
