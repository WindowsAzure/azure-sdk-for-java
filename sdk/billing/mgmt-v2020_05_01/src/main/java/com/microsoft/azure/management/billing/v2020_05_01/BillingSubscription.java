/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingSubscriptionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingManager;
import java.util.UUID;

/**
 * Type representing BillingSubscription.
 */
public interface BillingSubscription extends HasInner<BillingSubscriptionInner>, Indexable, Updatable<BillingSubscription.Update>, HasManager<BillingManager> {
    /**
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the costCenter value.
     */
    String costCenter();

    /**
     * @return the customerDisplayName value.
     */
    String customerDisplayName();

    /**
     * @return the customerId value.
     */
    String customerId();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceSectionDisplayName value.
     */
    String invoiceSectionDisplayName();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * @return the lastMonthCharges value.
     */
    Amount lastMonthCharges();

    /**
     * @return the monthToDateCharges value.
     */
    Amount monthToDateCharges();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the reseller value.
     */
    Reseller reseller();

    /**
     * @return the skuDescription value.
     */
    String skuDescription();

    /**
     * @return the skuId value.
     */
    String skuId();

    /**
     * @return the subscriptionBillingStatus value.
     */
    BillingSubscriptionStatusType subscriptionBillingStatus();

    /**
     * @return the subscriptionId value.
     */
    UUID subscriptionId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a BillingSubscription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BillingSubscription>, UpdateStages.WithCostCenter, UpdateStages.WithSkuId, UpdateStages.WithSubscriptionBillingStatus {
    }

    /**
     * Grouping of BillingSubscription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the billingsubscription update allowing to specify CostCenter.
         */
        interface WithCostCenter {
            /**
             * Specifies costCenter.
             * @param costCenter The cost center applied to the subscription
             * @return the next update stage
             */
            Update withCostCenter(String costCenter);
        }

        /**
         * The stage of the billingsubscription update allowing to specify SkuId.
         */
        interface WithSkuId {
            /**
             * Specifies skuId.
             * @param skuId The sku ID of the Azure plan for the subscription
             * @return the next update stage
             */
            Update withSkuId(String skuId);
        }

        /**
         * The stage of the billingsubscription update allowing to specify SubscriptionBillingStatus.
         */
        interface WithSubscriptionBillingStatus {
            /**
             * Specifies subscriptionBillingStatus.
             * @param subscriptionBillingStatus The current billing status of the subscription. Possible values include: 'Active', 'Inactive', 'Abandoned', 'Deleted', 'Warning'
             * @return the next update stage
             */
            Update withSubscriptionBillingStatus(BillingSubscriptionStatusType subscriptionBillingStatus);
        }

    }
}
