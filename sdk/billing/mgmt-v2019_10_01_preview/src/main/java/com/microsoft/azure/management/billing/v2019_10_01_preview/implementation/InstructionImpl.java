/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.Instruction;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;

class InstructionImpl extends CreatableUpdatableImpl<Instruction, InstructionInner, InstructionImpl> implements Instruction, Instruction.Definition, Instruction.Update {
    private final BillingManager manager;
    private String billingAccountName;
    private String billingProfileName;
    private String instructionName;

    InstructionImpl(String name, BillingManager manager) {
        super(name, new InstructionInner());
        this.manager = manager;
        // Set resource name
        this.instructionName = name;
        //
    }

    InstructionImpl(InstructionInner inner, BillingManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.instructionName = inner.name();
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.billingProfileName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingProfiles");
        this.instructionName = IdParsingUtils.getValueFromIdByName(inner.id(), "instructions");
        //
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Instruction> createResourceAsync() {
        InstructionsInner client = this.manager().inner().instructions();
        return client.putAsync(this.billingAccountName, this.billingProfileName, this.instructionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Instruction> updateResourceAsync() {
        InstructionsInner client = this.manager().inner().instructions();
        return client.putAsync(this.billingAccountName, this.billingProfileName, this.instructionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<InstructionInner> getInnerAsync() {
        InstructionsInner client = this.manager().inner().instructions();
        return client.getAsync(this.billingAccountName, this.billingProfileName, this.instructionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public double amount() {
        return this.inner().amount();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public DateTime endDate() {
        return this.inner().endDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime startDate() {
        return this.inner().startDate();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public InstructionImpl withExistingBillingProfile(String billingAccountName, String billingProfileName) {
        this.billingAccountName = billingAccountName;
        this.billingProfileName = billingProfileName;
        return this;
    }

    @Override
    public InstructionImpl withAmount(double amount) {
        this.inner().withAmount(amount);
        return this;
    }

    @Override
    public InstructionImpl withEndDate(DateTime endDate) {
        this.inner().withEndDate(endDate);
        return this;
    }

    @Override
    public InstructionImpl withStartDate(DateTime startDate) {
        this.inner().withStartDate(startDate);
        return this;
    }

    @Override
    public InstructionImpl withCreationDate(DateTime creationDate) {
        this.inner().withCreationDate(creationDate);
        return this;
    }

}
