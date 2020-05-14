/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.consumption.v2018_03_31.implementation;

import com.microsoft.azure.management.consumption.v2018_03_31.Budget;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.consumption.v2018_03_31.CategoryType;
import java.math.BigDecimal;
import com.microsoft.azure.management.consumption.v2018_03_31.TimeGrainType;
import com.microsoft.azure.management.consumption.v2018_03_31.BudgetTimePeriod;
import com.microsoft.azure.management.consumption.v2018_03_31.Filters;
import com.microsoft.azure.management.consumption.v2018_03_31.CurrentSpend;
import java.util.Map;
import com.microsoft.azure.management.consumption.v2018_03_31.Notification;

class BudgetImpl extends CreatableUpdatableImpl<Budget, BudgetInner, BudgetImpl> implements Budget, Budget.Definition, Budget.Update {
    private String resourceGroupName;
    private String budgetName;
    private final ConsumptionManager manager;

    BudgetImpl(String name, ConsumptionManager manager) {
        super(name, new BudgetInner());
        this.manager = manager;
        // Set resource name
        this.budgetName = name;
        //
    }

    BudgetImpl(BudgetInner inner, ConsumptionManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.budgetName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.budgetName = IdParsingUtils.getValueFromIdByName(inner.id(), "budgets");
        // set other parameters for create and update
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Budget> createResourceAsync() {
        BudgetsInner client = this.manager().inner().budgets();
        return client.createOrUpdateByResourceGroupNameAsync(this.resourceGroupName, this.budgetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Budget> updateResourceAsync() {
        BudgetsInner client = this.manager().inner().budgets();
        return client.createOrUpdateByResourceGroupNameAsync(this.resourceGroupName, this.budgetName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BudgetInner> getInnerAsync() {
        BudgetsInner client = this.manager().inner().budgets();
        return client.getByResourceGroupAsync(this.resourceGroupName, this.budgetName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public BigDecimal amount() {
        return this.inner().amount();
    }

    @Override
    public CategoryType category() {
        return this.inner().category();
    }

    @Override
    public CurrentSpend currentSpend() {
        return this.inner().currentSpend();
    }

    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public Filters filters() {
        return this.inner().filters();
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
    public Map<String, Notification> notifications() {
        return this.inner().notifications();
    }

    @Override
    public TimeGrainType timeGrain() {
        return this.inner().timeGrain();
    }

    @Override
    public BudgetTimePeriod timePeriod() {
        return this.inner().timePeriod();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BudgetImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public BudgetImpl withAmount(BigDecimal amount) {
        this.inner().withAmount(amount);
        return this;
    }

    @Override
    public BudgetImpl withCategory(CategoryType category) {
        this.inner().withCategory(category);
        return this;
    }

    @Override
    public BudgetImpl withTimeGrain(TimeGrainType timeGrain) {
        this.inner().withTimeGrain(timeGrain);
        return this;
    }

    @Override
    public BudgetImpl withTimePeriod(BudgetTimePeriod timePeriod) {
        this.inner().withTimePeriod(timePeriod);
        return this;
    }

    @Override
    public BudgetImpl withETag(String eTag) {
        this.inner().withETag(eTag);
        return this;
    }

    @Override
    public BudgetImpl withFilters(Filters filters) {
        this.inner().withFilters(filters);
        return this;
    }

    @Override
    public BudgetImpl withNotifications(Map<String, Notification> notifications) {
        this.inner().withNotifications(notifications);
        return this;
    }

}
