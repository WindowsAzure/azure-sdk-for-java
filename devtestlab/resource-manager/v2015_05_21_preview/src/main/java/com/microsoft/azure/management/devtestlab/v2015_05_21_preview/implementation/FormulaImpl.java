/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation;

import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Formula;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.FormulaPropertiesFromVm;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.LabVirtualMachine;
import java.util.Map;

class FormulaImpl extends CreatableUpdatableImpl<Formula, FormulaInner, FormulaImpl> implements Formula, Formula.Definition, Formula.Update {
    private final DevTestLabManager manager;
    private String resourceGroupName;
    private String labName;
    private String name;

    FormulaImpl(String name, DevTestLabManager manager) {
        super(name, new FormulaInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    FormulaImpl(FormulaInner inner, DevTestLabManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "formulas");
        //
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Formula> createResourceAsync() {
        FormulasInner client = this.manager().inner().formulas();
        return client.createOrUpdateResourceAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Formula> updateResourceAsync() {
        FormulasInner client = this.manager().inner().formulas();
        return client.createOrUpdateResourceAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FormulaInner> getInnerAsync() {
        FormulasInner client = this.manager().inner().formulas();
        return client.getResourceAsync(this.resourceGroupName, this.labName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String author() {
        return this.inner().author();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public LabVirtualMachine formulaContent() {
        LabVirtualMachineInner inner = this.inner().formulaContent();
        if (inner != null) {
            return  new LabVirtualMachineImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FormulaPropertiesFromVm vm() {
        return this.inner().vm();
    }

    @Override
    public FormulaImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    @Override
    public FormulaImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public FormulaImpl withAuthor(String author) {
        this.inner().withAuthor(author);
        return this;
    }

    @Override
    public FormulaImpl withCreationDate(DateTime creationDate) {
        this.inner().withCreationDate(creationDate);
        return this;
    }

    @Override
    public FormulaImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public FormulaImpl withFormulaContent(LabVirtualMachineInner formulaContent) {
        this.inner().withFormulaContent(formulaContent);
        return this;
    }

    @Override
    public FormulaImpl withOsType(String osType) {
        this.inner().withOsType(osType);
        return this;
    }

    @Override
    public FormulaImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public FormulaImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public FormulaImpl withVm(FormulaPropertiesFromVm vm) {
        this.inner().withVm(vm);
        return this;
    }

}
