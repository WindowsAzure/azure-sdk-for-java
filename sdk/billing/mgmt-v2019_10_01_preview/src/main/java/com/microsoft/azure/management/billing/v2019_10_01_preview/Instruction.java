/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.InstructionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import org.joda.time.DateTime;

/**
 * Type representing Instruction.
 */
public interface Instruction extends HasInner<InstructionInner>, Indexable, Refreshable<Instruction>, Updatable<Instruction.Update>, HasManager<BillingManager> {
    /**
     * @return the amount value.
     */
    double amount();

    /**
     * @return the endDate value.
     */
    DateTime endDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startDate value.
     */
    DateTime startDate();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Instruction definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithBillingProfile, DefinitionStages.WithAmount, DefinitionStages.WithEndDate, DefinitionStages.WithStartDate, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Instruction definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Instruction definition.
         */
        interface Blank extends WithBillingProfile {
        }

        /**
         * The stage of the instruction definition allowing to specify BillingProfile.
         */
        interface WithBillingProfile {
           /**
            * Specifies billingAccountName, billingProfileName.
            * @param billingAccountName billing Account Id
            * @param billingProfileName Billing Profile Id
            * @return the next definition stage
            */
            WithAmount withExistingBillingProfile(String billingAccountName, String billingProfileName);
        }

        /**
         * The stage of the instruction definition allowing to specify Amount.
         */
        interface WithAmount {
           /**
            * Specifies amount.
            * @param amount The amount budgeted for this billing instruction
            * @return the next definition stage
            */
            WithEndDate withAmount(double amount);
        }

        /**
         * The stage of the instruction definition allowing to specify EndDate.
         */
        interface WithEndDate {
           /**
            * Specifies endDate.
            * @param endDate The date this billing instruction is no longer in effect
            * @return the next definition stage
            */
            WithStartDate withEndDate(DateTime endDate);
        }

        /**
         * The stage of the instruction definition allowing to specify StartDate.
         */
        interface WithStartDate {
           /**
            * Specifies startDate.
            * @param startDate The date this billing instruction goes into effect
            * @return the next definition stage
            */
            WithCreate withStartDate(DateTime startDate);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Instruction> {
        }
    }
    /**
     * The template for a Instruction update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Instruction> {
    }

    /**
     * Grouping of Instruction update stages.
     */
    interface UpdateStages {
    }
}
