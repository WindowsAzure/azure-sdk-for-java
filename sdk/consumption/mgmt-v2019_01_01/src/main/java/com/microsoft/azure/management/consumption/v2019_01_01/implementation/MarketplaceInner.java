/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import org.joda.time.DateTime;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An marketplace resource.
 */
@JsonFlatten
public class MarketplaceInner extends ProxyResource {
    /**
     * The id of the billing period resource that the usage belongs to.
     */
    @JsonProperty(value = "properties.billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /**
     * The start of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageStart;

    /**
     * The end of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageEnd;

    /**
     * The marketplace resource rate.
     */
    @JsonProperty(value = "properties.resourceRate", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal resourceRate;

    /**
     * The type of offer.
     */
    @JsonProperty(value = "properties.offerName", access = JsonProperty.Access.WRITE_ONLY)
    private String offerName;

    /**
     * The name of resource group.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * The order number.
     */
    @JsonProperty(value = "properties.orderNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String orderNumber;

    /**
     * The name of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceName;

    /**
     * The uri of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /**
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /**
     * The quantity of usage.
     */
    @JsonProperty(value = "properties.consumedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal consumedQuantity;

    /**
     * The unit of measure.
     */
    @JsonProperty(value = "properties.unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /**
     * The amount of cost before tax.
     */
    @JsonProperty(value = "properties.pretaxCost", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal pretaxCost;

    /**
     * The estimated usage is subject to change.
     */
    @JsonProperty(value = "properties.isEstimated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEstimated;

    /**
     * The meter id (GUID).
     */
    @JsonProperty(value = "properties.meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /**
     * Subscription guid.
     */
    @JsonProperty(value = "properties.subscriptionGuid", access = JsonProperty.Access.WRITE_ONLY)
    private UUID subscriptionGuid;

    /**
     * Subscription name.
     */
    @JsonProperty(value = "properties.subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /**
     * Account name.
     */
    @JsonProperty(value = "properties.accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /**
     * Department name.
     */
    @JsonProperty(value = "properties.departmentName", access = JsonProperty.Access.WRITE_ONLY)
    private String departmentName;

    /**
     * Consumed service name.
     */
    @JsonProperty(value = "properties.consumedService", access = JsonProperty.Access.WRITE_ONLY)
    private String consumedService;

    /**
     * The cost center of this department if it is a department and a
     * costcenter exists.
     */
    @JsonProperty(value = "properties.costCenter", access = JsonProperty.Access.WRITE_ONLY)
    private String costCenter;

    /**
     * Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand.
     */
    @JsonProperty(value = "properties.additionalProperties", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalProperties;

    /**
     * The name of publisher.
     */
    @JsonProperty(value = "properties.publisherName", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherName;

    /**
     * The name of plan.
     */
    @JsonProperty(value = "properties.planName", access = JsonProperty.Access.WRITE_ONLY)
    private String planName;

    /**
     * Flag indicating whether this is a recurring charge or not.
     */
    @JsonProperty(value = "properties.isRecurringCharge", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isRecurringCharge;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the id of the billing period resource that the usage belongs to.
     *
     * @return the billingPeriodId value
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
    }

    /**
     * Get the start of the date time range covered by the usage detail.
     *
     * @return the usageStart value
     */
    public DateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get the end of the date time range covered by the usage detail.
     *
     * @return the usageEnd value
     */
    public DateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the marketplace resource rate.
     *
     * @return the resourceRate value
     */
    public BigDecimal resourceRate() {
        return this.resourceRate;
    }

    /**
     * Get the type of offer.
     *
     * @return the offerName value
     */
    public String offerName() {
        return this.offerName;
    }

    /**
     * Get the name of resource group.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the order number.
     *
     * @return the orderNumber value
     */
    public String orderNumber() {
        return this.orderNumber;
    }

    /**
     * Get the name of the resource instance that the usage is about.
     *
     * @return the instanceName value
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Get the uri of the resource instance that the usage is about.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the quantity of usage.
     *
     * @return the consumedQuantity value
     */
    public BigDecimal consumedQuantity() {
        return this.consumedQuantity;
    }

    /**
     * Get the unit of measure.
     *
     * @return the unitOfMeasure value
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get the amount of cost before tax.
     *
     * @return the pretaxCost value
     */
    public BigDecimal pretaxCost() {
        return this.pretaxCost;
    }

    /**
     * Get the estimated usage is subject to change.
     *
     * @return the isEstimated value
     */
    public Boolean isEstimated() {
        return this.isEstimated;
    }

    /**
     * Get the meter id (GUID).
     *
     * @return the meterId value
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get subscription guid.
     *
     * @return the subscriptionGuid value
     */
    public UUID subscriptionGuid() {
        return this.subscriptionGuid;
    }

    /**
     * Get subscription name.
     *
     * @return the subscriptionName value
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get account name.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get department name.
     *
     * @return the departmentName value
     */
    public String departmentName() {
        return this.departmentName;
    }

    /**
     * Get consumed service name.
     *
     * @return the consumedService value
     */
    public String consumedService() {
        return this.consumedService;
    }

    /**
     * Get the cost center of this department if it is a department and a costcenter exists.
     *
     * @return the costCenter value
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Get additional details of this usage item. By default this is not populated, unless it's specified in $expand.
     *
     * @return the additionalProperties value
     */
    public String additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Get the name of publisher.
     *
     * @return the publisherName value
     */
    public String publisherName() {
        return this.publisherName;
    }

    /**
     * Get the name of plan.
     *
     * @return the planName value
     */
    public String planName() {
        return this.planName;
    }

    /**
     * Get flag indicating whether this is a recurring charge or not.
     *
     * @return the isRecurringCharge value
     */
    public Boolean isRecurringCharge() {
        return this.isRecurringCharge;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
