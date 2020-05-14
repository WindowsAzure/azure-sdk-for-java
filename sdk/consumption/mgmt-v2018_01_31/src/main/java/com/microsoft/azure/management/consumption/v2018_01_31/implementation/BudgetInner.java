/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_01_31.implementation;

import com.microsoft.azure.management.consumption.v2018_01_31.CategoryType;
import java.math.BigDecimal;
import com.microsoft.azure.management.consumption.v2018_01_31.TimeGrainType;
import com.microsoft.azure.management.consumption.v2018_01_31.BudgetTimePeriod;
import com.microsoft.azure.management.consumption.v2018_01_31.Filters;
import com.microsoft.azure.management.consumption.v2018_01_31.CurrentSpend;
import java.util.Map;
import com.microsoft.azure.management.consumption.v2018_01_31.Notification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A budget resource.
 */
@JsonFlatten
public class BudgetInner extends ProxyResource {
    /**
     * The category of the budget, whether the budget tracks cost or usage.
     * Possible values include: 'Cost', 'Usage'.
     */
    @JsonProperty(value = "properties.category", required = true)
    private CategoryType category;

    /**
     * The total amount of cost to track with the budget.
     */
    @JsonProperty(value = "properties.amount", required = true)
    private BigDecimal amount;

    /**
     * The time covered by a budget. Tracking of the amount will be reset based
     * on the time grain. Possible values include: 'Monthly', 'Quarterly',
     * 'Annually'.
     */
    @JsonProperty(value = "properties.timeGrain", required = true)
    private TimeGrainType timeGrain;

    /**
     * Has start and end date of the budget. The start date must be first of
     * the month and should be less than the end date. Budget start date must
     * be on or after June 1, 2017. Future start date should not be more than
     * three months. Past start date should  be selected within the timegrain
     * period. There are no restrictions on the end date.
     */
    @JsonProperty(value = "properties.timePeriod", required = true)
    private BudgetTimePeriod timePeriod;

    /**
     * May be used to filter budgets by resource group, resource, or meter.
     */
    @JsonProperty(value = "properties.filters")
    private Filters filters;

    /**
     * The current amount of cost which is being tracked for a budget.
     */
    @JsonProperty(value = "properties.currentSpend", access = JsonProperty.Access.WRITE_ONLY)
    private CurrentSpend currentSpend;

    /**
     * Dictionary of notifications associated with the budget. Budget can have
     * up to five notifications.
     */
    @JsonProperty(value = "properties.notifications")
    private Map<String, Notification> notifications;

    /**
     * eTag of the resource. To handle concurrent update scenario, this field
     * will be used to determine whether the user is updating the latest
     * version or not.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get the category of the budget, whether the budget tracks cost or usage. Possible values include: 'Cost', 'Usage'.
     *
     * @return the category value
     */
    public CategoryType category() {
        return this.category;
    }

    /**
     * Set the category of the budget, whether the budget tracks cost or usage. Possible values include: 'Cost', 'Usage'.
     *
     * @param category the category value to set
     * @return the BudgetInner object itself.
     */
    public BudgetInner withCategory(CategoryType category) {
        this.category = category;
        return this;
    }

    /**
     * Get the total amount of cost to track with the budget.
     *
     * @return the amount value
     */
    public BigDecimal amount() {
        return this.amount;
    }

    /**
     * Set the total amount of cost to track with the budget.
     *
     * @param amount the amount value to set
     * @return the BudgetInner object itself.
     */
    public BudgetInner withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get the time covered by a budget. Tracking of the amount will be reset based on the time grain. Possible values include: 'Monthly', 'Quarterly', 'Annually'.
     *
     * @return the timeGrain value
     */
    public TimeGrainType timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the time covered by a budget. Tracking of the amount will be reset based on the time grain. Possible values include: 'Monthly', 'Quarterly', 'Annually'.
     *
     * @param timeGrain the timeGrain value to set
     * @return the BudgetInner object itself.
     */
    public BudgetInner withTimeGrain(TimeGrainType timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get has start and end date of the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than three months. Past start date should  be selected within the timegrain period. There are no restrictions on the end date.
     *
     * @return the timePeriod value
     */
    public BudgetTimePeriod timePeriod() {
        return this.timePeriod;
    }

    /**
     * Set has start and end date of the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than three months. Past start date should  be selected within the timegrain period. There are no restrictions on the end date.
     *
     * @param timePeriod the timePeriod value to set
     * @return the BudgetInner object itself.
     */
    public BudgetInner withTimePeriod(BudgetTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get may be used to filter budgets by resource group, resource, or meter.
     *
     * @return the filters value
     */
    public Filters filters() {
        return this.filters;
    }

    /**
     * Set may be used to filter budgets by resource group, resource, or meter.
     *
     * @param filters the filters value to set
     * @return the BudgetInner object itself.
     */
    public BudgetInner withFilters(Filters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the current amount of cost which is being tracked for a budget.
     *
     * @return the currentSpend value
     */
    public CurrentSpend currentSpend() {
        return this.currentSpend;
    }

    /**
     * Get dictionary of notifications associated with the budget. Budget can have up to five notifications.
     *
     * @return the notifications value
     */
    public Map<String, Notification> notifications() {
        return this.notifications;
    }

    /**
     * Set dictionary of notifications associated with the budget. Budget can have up to five notifications.
     *
     * @param notifications the notifications value to set
     * @return the BudgetInner object itself.
     */
    public BudgetInner withNotifications(Map<String, Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Get eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     *
     * @param eTag the eTag value to set
     * @return the BudgetInner object itself.
     */
    public BudgetInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
