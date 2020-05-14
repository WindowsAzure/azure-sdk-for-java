/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import com.microsoft.azure.management.consumption.v2019_01_01.ManagementGroupAggregatedCostResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

class ManagementGroupAggregatedCostResultImpl extends WrapperImpl<ManagementGroupAggregatedCostResultInner> implements ManagementGroupAggregatedCostResult {
    private final ConsumptionManager manager;
    ManagementGroupAggregatedCostResultImpl(ManagementGroupAggregatedCostResultInner inner, ConsumptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public BigDecimal azureCharges() {
        return this.inner().azureCharges();
    }

    @Override
    public String billingPeriodId() {
        return this.inner().billingPeriodId();
    }

    @Override
    public BigDecimal chargesBilledSeparately() {
        return this.inner().chargesBilledSeparately();
    }

    @Override
    public List<ManagementGroupAggregatedCostResultInner> children() {
        return this.inner().children();
    }

    @Override
    public String currency() {
        return this.inner().currency();
    }

    @Override
    public List<String> excludedSubscriptions() {
        return this.inner().excludedSubscriptions();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<String> includedSubscriptions() {
        return this.inner().includedSubscriptions();
    }

    @Override
    public BigDecimal marketplaceCharges() {
        return this.inner().marketplaceCharges();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime usageEnd() {
        return this.inner().usageEnd();
    }

    @Override
    public DateTime usageStart() {
        return this.inner().usageStart();
    }

}
