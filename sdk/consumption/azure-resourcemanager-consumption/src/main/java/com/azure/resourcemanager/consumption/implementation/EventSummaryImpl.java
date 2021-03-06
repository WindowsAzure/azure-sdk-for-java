// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.fluent.models.EventSummaryInner;
import com.azure.resourcemanager.consumption.models.Amount;
import com.azure.resourcemanager.consumption.models.AmountWithExchangeRate;
import com.azure.resourcemanager.consumption.models.EventSummary;
import com.azure.resourcemanager.consumption.models.EventType;
import com.azure.resourcemanager.consumption.models.Reseller;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class EventSummaryImpl implements EventSummary {
    private EventSummaryInner innerObject;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    EventSummaryImpl(
        EventSummaryInner innerObject, com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String creditCurrency() {
        return this.innerModel().creditCurrency();
    }

    public String billingCurrency() {
        return this.innerModel().billingCurrency();
    }

    public OffsetDateTime transactionDate() {
        return this.innerModel().transactionDate();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Amount newCredit() {
        return this.innerModel().newCredit();
    }

    public AmountWithExchangeRate newCreditInBillingCurrency() {
        return this.innerModel().newCreditInBillingCurrency();
    }

    public Amount adjustments() {
        return this.innerModel().adjustments();
    }

    public AmountWithExchangeRate adjustmentsInBillingCurrency() {
        return this.innerModel().adjustmentsInBillingCurrency();
    }

    public Amount creditExpired() {
        return this.innerModel().creditExpired();
    }

    public AmountWithExchangeRate creditExpiredInBillingCurrency() {
        return this.innerModel().creditExpiredInBillingCurrency();
    }

    public Amount charges() {
        return this.innerModel().charges();
    }

    public AmountWithExchangeRate chargesInBillingCurrency() {
        return this.innerModel().chargesInBillingCurrency();
    }

    public Amount closedBalance() {
        return this.innerModel().closedBalance();
    }

    public AmountWithExchangeRate closedBalanceInBillingCurrency() {
        return this.innerModel().closedBalanceInBillingCurrency();
    }

    public EventType eventType() {
        return this.innerModel().eventType();
    }

    public String invoiceNumber() {
        return this.innerModel().invoiceNumber();
    }

    public Reseller reseller() {
        return this.innerModel().reseller();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public EventSummaryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
