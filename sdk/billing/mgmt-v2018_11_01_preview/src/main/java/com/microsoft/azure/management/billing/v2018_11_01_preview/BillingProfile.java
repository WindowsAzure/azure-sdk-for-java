/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingProfileInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.AddressInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSectionInner;

/**
 * Type representing BillingProfile.
 */
public interface BillingProfile extends HasInner<BillingProfileInner>, Indexable, Refreshable<BillingProfile>, Updatable<BillingProfile.Update>, HasManager<BillingManager> {
    /**
     * @return the address value.
     */
    AddressInner address();

    /**
     * @return the currency value.
     */
    String currency();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the enabledAzureSKUs value.
     */
    List<EnabledAzureSKUs> enabledAzureSKUs();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceDay value.
     */
    Integer invoiceDay();

    /**
     * @return the invoiceEmailOptIn value.
     */
    Boolean invoiceEmailOptIn();

    /**
     * @return the invoiceSections value.
     */
    List<InvoiceSection> invoiceSections();

    /**
     * @return the isClassic value.
     */
    Boolean isClassic();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the poNumber value.
     */
    String poNumber();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a BillingProfile update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BillingProfile>, UpdateStages.WithAddress, UpdateStages.WithDisplayName, UpdateStages.WithEnabledAzureSKUs, UpdateStages.WithInvoiceSections, UpdateStages.WithPoNumber {
    }

    /**
     * Grouping of BillingProfile update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the billingprofile update allowing to specify Address.
         */
        interface WithAddress {
            /**
             * Specifies address.
             * @param address Billing address
             * @return the next update stage
             */
            Update withAddress(AddressInner address);
        }

        /**
         * The stage of the billingprofile update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The billing profile name
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the billingprofile update allowing to specify EnabledAzureSKUs.
         */
        interface WithEnabledAzureSKUs {
            /**
             * Specifies enabledAzureSKUs.
             * @param enabledAzureSKUs Information about the product
             * @return the next update stage
             */
            Update withEnabledAzureSKUs(List<EnabledAzureSKUs> enabledAzureSKUs);
        }

        /**
         * The stage of the billingprofile update allowing to specify InvoiceSections.
         */
        interface WithInvoiceSections {
            /**
             * Specifies invoiceSections.
             * @param invoiceSections The invoice sections associated to the billing profile
             * @return the next update stage
             */
            Update withInvoiceSections(List<InvoiceSectionInner> invoiceSections);
        }

        /**
         * The stage of the billingprofile update allowing to specify PoNumber.
         */
        interface WithPoNumber {
            /**
             * Specifies poNumber.
             * @param poNumber Purchase order number
             * @return the next update stage
             */
            Update withPoNumber(String poNumber);
        }

    }
}
