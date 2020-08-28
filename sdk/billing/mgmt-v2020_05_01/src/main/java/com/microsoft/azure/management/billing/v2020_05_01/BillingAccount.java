/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingAccountInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingManager;
import java.util.List;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.EnrollmentAccountInner;

/**
 * Type representing BillingAccount.
 */
public interface BillingAccount extends HasInner<BillingAccountInner>, Indexable, Updatable<BillingAccount.Update>, Refreshable<BillingAccount>, HasManager<BillingManager> {
    /**
     * @return the accountStatus value.
     */
    AccountStatus accountStatus();

    /**
     * @return the accountType value.
     */
    AccountType accountType();

    /**
     * @return the agreementType value.
     */
    AgreementType agreementType();

    /**
     * @return the billingProfiles value.
     */
    BillingProfilesOnExpand billingProfiles();

    /**
     * @return the departments value.
     */
    List<Department> departments();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the enrollmentAccounts value.
     */
    List<EnrollmentAccountInner> enrollmentAccounts();

    /**
     * @return the enrollmentDetails value.
     */
    Enrollment enrollmentDetails();

    /**
     * @return the hasReadAccess value.
     */
    Boolean hasReadAccess();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the soldTo value.
     */
    AddressDetails soldTo();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a BillingAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BillingAccount>, UpdateStages.WithBillingProfiles, UpdateStages.WithDepartments, UpdateStages.WithDisplayName, UpdateStages.WithEnrollmentAccounts, UpdateStages.WithSoldTo {
    }

    /**
     * Grouping of BillingAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the billingaccount update allowing to specify BillingProfiles.
         */
        interface WithBillingProfiles {
            /**
             * Specifies billingProfiles.
             * @param billingProfiles The billing profiles associated with the billing account. By default this is not populated, unless it's specified in $expand
             * @return the next update stage
             */
            Update withBillingProfiles(BillingProfilesOnExpand billingProfiles);
        }

        /**
         * The stage of the billingaccount update allowing to specify Departments.
         */
        interface WithDepartments {
            /**
             * Specifies departments.
             * @param departments The departments associated to the enrollment
             * @return the next update stage
             */
            Update withDepartments(List<Department> departments);
        }

        /**
         * The stage of the billingaccount update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The billing account name
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the billingaccount update allowing to specify EnrollmentAccounts.
         */
        interface WithEnrollmentAccounts {
            /**
             * Specifies enrollmentAccounts.
             * @param enrollmentAccounts The accounts associated to the enrollment
             * @return the next update stage
             */
            Update withEnrollmentAccounts(List<EnrollmentAccountInner> enrollmentAccounts);
        }

        /**
         * The stage of the billingaccount update allowing to specify SoldTo.
         */
        interface WithSoldTo {
            /**
             * Specifies soldTo.
             * @param soldTo The address of the individual or organization that is responsible for the billing account
             * @return the next update stage
             */
            Update withSoldTo(AddressDetails soldTo);
        }

    }
}
