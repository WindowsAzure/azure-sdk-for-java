/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.InstructionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Instructions.
 */
public interface Instructions extends SupportsCreating<Instruction.DefinitionStages.Blank>, HasInner<InstructionsInner> {
    /**
     * Get the instruction by name. These are custom billing instructions and are only applicable for certain customers.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param instructionName Instruction Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Instruction> getAsync(String billingAccountName, String billingProfileName, String instructionName);

    /**
     * Lists the instructions by billing profile id.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Instruction> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName);

}
