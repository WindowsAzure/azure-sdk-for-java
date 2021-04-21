// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** A management group aggregated cost resource. */
@JsonFlatten
@Fluent
public class ManagementGroupAggregatedCostResultInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementGroupAggregatedCostResultInner.class);

    /*
     * The id of the billing period resource that the aggregated cost belongs
     * to.
     */
    @JsonProperty(value = "properties.billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /*
     * The start of the date time range covered by aggregated cost.
     */
    @JsonProperty(value = "properties.usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageStart;

    /*
     * The end of the date time range covered by the aggregated cost.
     */
    @JsonProperty(value = "properties.usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageEnd;

    /*
     * Azure Charges.
     */
    @JsonProperty(value = "properties.azureCharges", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal azureCharges;

    /*
     * Marketplace Charges.
     */
    @JsonProperty(value = "properties.marketplaceCharges", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal marketplaceCharges;

    /*
     * Charges Billed Separately.
     */
    @JsonProperty(value = "properties.chargesBilledSeparately", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal chargesBilledSeparately;

    /*
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * Children of a management group
     */
    @JsonProperty(value = "properties.children")
    private List<ManagementGroupAggregatedCostResultInner> children;

    /*
     * List of subscription Guids included in the calculation of aggregated
     * cost
     */
    @JsonProperty(value = "properties.includedSubscriptions")
    private List<String> includedSubscriptions;

    /*
     * List of subscription Guids excluded from the calculation of aggregated
     * cost
     */
    @JsonProperty(value = "properties.excludedSubscriptions")
    private List<String> excludedSubscriptions;

    /*
     * Resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the billingPeriodId property: The id of the billing period resource that the aggregated cost belongs to.
     *
     * @return the billingPeriodId value.
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
    }

    /**
     * Get the usageStart property: The start of the date time range covered by aggregated cost.
     *
     * @return the usageStart value.
     */
    public OffsetDateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get the usageEnd property: The end of the date time range covered by the aggregated cost.
     *
     * @return the usageEnd value.
     */
    public OffsetDateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the azureCharges property: Azure Charges.
     *
     * @return the azureCharges value.
     */
    public BigDecimal azureCharges() {
        return this.azureCharges;
    }

    /**
     * Get the marketplaceCharges property: Marketplace Charges.
     *
     * @return the marketplaceCharges value.
     */
    public BigDecimal marketplaceCharges() {
        return this.marketplaceCharges;
    }

    /**
     * Get the chargesBilledSeparately property: Charges Billed Separately.
     *
     * @return the chargesBilledSeparately value.
     */
    public BigDecimal chargesBilledSeparately() {
        return this.chargesBilledSeparately;
    }

    /**
     * Get the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the children property: Children of a management group.
     *
     * @return the children value.
     */
    public List<ManagementGroupAggregatedCostResultInner> children() {
        return this.children;
    }

    /**
     * Set the children property: Children of a management group.
     *
     * @param children the children value to set.
     * @return the ManagementGroupAggregatedCostResultInner object itself.
     */
    public ManagementGroupAggregatedCostResultInner withChildren(
        List<ManagementGroupAggregatedCostResultInner> children) {
        this.children = children;
        return this;
    }

    /**
     * Get the includedSubscriptions property: List of subscription Guids included in the calculation of aggregated
     * cost.
     *
     * @return the includedSubscriptions value.
     */
    public List<String> includedSubscriptions() {
        return this.includedSubscriptions;
    }

    /**
     * Set the includedSubscriptions property: List of subscription Guids included in the calculation of aggregated
     * cost.
     *
     * @param includedSubscriptions the includedSubscriptions value to set.
     * @return the ManagementGroupAggregatedCostResultInner object itself.
     */
    public ManagementGroupAggregatedCostResultInner withIncludedSubscriptions(List<String> includedSubscriptions) {
        this.includedSubscriptions = includedSubscriptions;
        return this;
    }

    /**
     * Get the excludedSubscriptions property: List of subscription Guids excluded from the calculation of aggregated
     * cost.
     *
     * @return the excludedSubscriptions value.
     */
    public List<String> excludedSubscriptions() {
        return this.excludedSubscriptions;
    }

    /**
     * Set the excludedSubscriptions property: List of subscription Guids excluded from the calculation of aggregated
     * cost.
     *
     * @param excludedSubscriptions the excludedSubscriptions value to set.
     * @return the ManagementGroupAggregatedCostResultInner object itself.
     */
    public ManagementGroupAggregatedCostResultInner withExcludedSubscriptions(List<String> excludedSubscriptions) {
        this.excludedSubscriptions = excludedSubscriptions;
        return this;
    }

    /**
     * Get the etag property: Resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (children() != null) {
            children().forEach(e -> e.validate());
        }
    }
}
