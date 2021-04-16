// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.resourcemanager.consumption.fluent.models.ManagementGroupAggregatedCostResultInner;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ManagementGroupAggregatedCostResult. */
public interface ManagementGroupAggregatedCostResult {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the billingPeriodId property: The id of the billing period resource that the aggregated cost belongs to.
     *
     * @return the billingPeriodId value.
     */
    String billingPeriodId();

    /**
     * Gets the usageStart property: The start of the date time range covered by aggregated cost.
     *
     * @return the usageStart value.
     */
    OffsetDateTime usageStart();

    /**
     * Gets the usageEnd property: The end of the date time range covered by the aggregated cost.
     *
     * @return the usageEnd value.
     */
    OffsetDateTime usageEnd();

    /**
     * Gets the azureCharges property: Azure Charges.
     *
     * @return the azureCharges value.
     */
    BigDecimal azureCharges();

    /**
     * Gets the marketplaceCharges property: Marketplace Charges.
     *
     * @return the marketplaceCharges value.
     */
    BigDecimal marketplaceCharges();

    /**
     * Gets the chargesBilledSeparately property: Charges Billed Separately.
     *
     * @return the chargesBilledSeparately value.
     */
    BigDecimal chargesBilledSeparately();

    /**
     * Gets the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the children property: Children of a management group.
     *
     * @return the children value.
     */
    List<ManagementGroupAggregatedCostResult> children();

    /**
     * Gets the includedSubscriptions property: List of subscription Guids included in the calculation of aggregated
     * cost.
     *
     * @return the includedSubscriptions value.
     */
    List<String> includedSubscriptions();

    /**
     * Gets the excludedSubscriptions property: List of subscription Guids excluded from the calculation of aggregated
     * cost.
     *
     * @return the excludedSubscriptions value.
     */
    List<String> excludedSubscriptions();

    /**
     * Gets the etag property: Resource etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.fluent.models.ManagementGroupAggregatedCostResultInner
     * object.
     *
     * @return the inner object.
     */
    ManagementGroupAggregatedCostResultInner innerModel();
}
