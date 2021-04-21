// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.models.UsageDetailInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/** Modern usage detail. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("modern")
@JsonFlatten
@Immutable
public class ModernUsageDetail extends UsageDetailInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModernUsageDetail.class);

    /*
     * Billing Account identifier.
     */
    @JsonProperty(value = "properties.billingAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountId;

    /*
     * Name of the Billing Account.
     */
    @JsonProperty(value = "properties.billingAccountName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountName;

    /*
     * Billing Period Start Date as in the invoice.
     */
    @JsonProperty(value = "properties.billingPeriodStartDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime billingPeriodStartDate;

    /*
     * Billing Period End Date as in the invoice.
     */
    @JsonProperty(value = "properties.billingPeriodEndDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime billingPeriodEndDate;

    /*
     * Identifier for the billing profile that groups costs across invoices in
     * the a singular billing currency across across the customers who have
     * onboarded the Microsoft customer agreement and the customers in CSP who
     * have made entitlement purchases like SaaS, Marketplace, RI, etc.
     */
    @JsonProperty(value = "properties.billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * Name of the billing profile that groups costs across invoices in the a
     * singular billing currency across across the customers who have onboarded
     * the Microsoft customer agreement and the customers in CSP who have made
     * entitlement purchases like SaaS, Marketplace, RI, etc.
     */
    @JsonProperty(value = "properties.billingProfileName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileName;

    /*
     * Unique Microsoft generated identifier for the Azure Subscription.
     */
    @JsonProperty(value = "properties.subscriptionGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionGuid;

    /*
     * Name of the Azure Subscription.
     */
    @JsonProperty(value = "properties.subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /*
     * Date for the usage record.
     */
    @JsonProperty(value = "properties.date", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime date;

    /*
     * Name of the product that has accrued charges by consumption or purchase
     * as listed in the invoice. Not available for Marketplace.
     */
    @JsonProperty(value = "properties.product", access = JsonProperty.Access.WRITE_ONLY)
    private String product;

    /*
     * The meter id (GUID). Not available for marketplace. For reserved
     * instance this represents the primary meter for which the reservation was
     * purchased. For the actual VM Size for which the reservation is purchased
     * see productOrderName.
     */
    @JsonProperty(value = "properties.meterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /*
     * Identifies the name of the meter against which consumption is measured.
     */
    @JsonProperty(value = "properties.meterName", access = JsonProperty.Access.WRITE_ONLY)
    private String meterName;

    /*
     * Identifies the location of the datacenter for certain services that are
     * priced based on datacenter location.
     */
    @JsonProperty(value = "properties.meterRegion", access = JsonProperty.Access.WRITE_ONLY)
    private String meterRegion;

    /*
     * Identifies the top-level service for the usage.
     */
    @JsonProperty(value = "properties.meterCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterCategory;

    /*
     * Defines the type or sub-category of Azure service that can affect the
     * rate.
     */
    @JsonProperty(value = "properties.meterSubCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterSubCategory;

    /*
     * List the service family for the product purchased or charged (Example:
     * Storage ; Compute).
     */
    @JsonProperty(value = "properties.serviceFamily", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceFamily;

    /*
     * Measure the quantity purchased or consumed.The amount of the meter used
     * during the billing period.
     */
    @JsonProperty(value = "properties.quantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal quantity;

    /*
     * Identifies the Unit that the service is charged in. For example, GB,
     * hours, 10,000 s.
     */
    @JsonProperty(value = "properties.unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /*
     * Instance Name.
     */
    @JsonProperty(value = "properties.instanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceName;

    /*
     * Estimated extendedCost or blended cost before tax in USD.
     */
    @JsonProperty(value = "properties.costInUSD", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal costInUsd;

    /*
     * Unit Price is the price applicable to you. (your EA or other contract
     * price).
     */
    @JsonProperty(value = "properties.unitPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal unitPrice;

    /*
     * The currency defining the billed cost.
     */
    @JsonProperty(value = "properties.billingCurrencyCode", access = JsonProperty.Access.WRITE_ONLY)
    private String billingCurrencyCode;

    /*
     * Name of the resource location.
     */
    @JsonProperty(value = "properties.resourceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceLocation;

    /*
     * Consumed service name. Name of the azure resource provider that emits
     * the usage or was purchased. This value is not provided for marketplace
     * usage.
     */
    @JsonProperty(value = "properties.consumedService", access = JsonProperty.Access.WRITE_ONLY)
    private String consumedService;

    /*
     * Service Info 1.
     */
    @JsonProperty(value = "properties.serviceInfo1", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceInfo1;

    /*
     * Service Info 2.
     */
    @JsonProperty(value = "properties.serviceInfo2", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceInfo2;

    /*
     * Additional details of this usage item. Use this field to get usage line
     * item specific details such as the actual VM Size (ServiceType) or the
     * ratio in which the reservation discount is applied.
     */
    @JsonProperty(value = "properties.additionalInfo", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalInfo;

    /*
     * Identifier of the project that is being charged in the invoice. Not
     * applicable for Microsoft Customer Agreements onboarded by partners.
     */
    @JsonProperty(value = "properties.invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /*
     * Name of the project that is being charged in the invoice. Not applicable
     * for Microsoft Customer Agreements onboarded by partners.
     */
    @JsonProperty(value = "properties.invoiceSectionName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionName;

    /*
     * The cost center of this department if it is a department and a cost
     * center is provided.
     */
    @JsonProperty(value = "properties.costCenter", access = JsonProperty.Access.WRITE_ONLY)
    private String costCenter;

    /*
     * Name of the Azure resource group used for cohesive lifecycle management
     * of resources.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * ARM resource id of the reservation. Only applies to records relevant to
     * reservations.
     */
    @JsonProperty(value = "properties.reservationId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationId;

    /*
     * User provided display name of the reservation. Last known name for a
     * particular day is populated in the daily data. Only applies to records
     * relevant to reservations.
     */
    @JsonProperty(value = "properties.reservationName", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationName;

    /*
     * The identifier for the asset or Azure plan name that the subscription
     * belongs to. For example: Azure Plan. For reservations this is the
     * Reservation Order ID.
     */
    @JsonProperty(value = "properties.productOrderId", access = JsonProperty.Access.WRITE_ONLY)
    private String productOrderId;

    /*
     * Product Order Name. For reservations this is the SKU that was purchased.
     */
    @JsonProperty(value = "properties.productOrderName", access = JsonProperty.Access.WRITE_ONLY)
    private String productOrderName;

    /*
     * Determines if the cost is eligible to be paid for using Azure credits.
     */
    @JsonProperty(value = "properties.isAzureCreditEligible", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAzureCreditEligible;

    /*
     * Term (in months). Displays the term for the validity of the offer. For
     * example. In case of reserved instances it displays 12 months for yearly
     * term of reserved instance. For one time purchases or recurring
     * purchases, the terms displays 1 month; This is not applicable for Azure
     * consumption.
     */
    @JsonProperty(value = "properties.term", access = JsonProperty.Access.WRITE_ONLY)
    private String term;

    /*
     * Name of the publisher of the service including Microsoft or Third Party
     * publishers.
     */
    @JsonProperty(value = "properties.publisherName", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherName;

    /*
     * Type of publisher that identifies if the publisher is first party, third
     * party reseller or third party agency.
     */
    @JsonProperty(value = "properties.publisherType", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherType;

    /*
     * Indicates a charge represents credits, usage, a Marketplace purchase, a
     * reservation fee, or a refund.
     */
    @JsonProperty(value = "properties.chargeType", access = JsonProperty.Access.WRITE_ONLY)
    private String chargeType;

    /*
     * Indicates how frequently this charge will occur. OneTime for purchases
     * which only happen once, Monthly for fees which recur every month, and
     * UsageBased for charges based on how much a service is used.
     */
    @JsonProperty(value = "properties.frequency", access = JsonProperty.Access.WRITE_ONLY)
    private String frequency;

    /*
     * ExtendedCost or blended cost before tax in billed currency.
     */
    @JsonProperty(value = "properties.costInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal costInBillingCurrency;

    /*
     * ExtendedCost or blended cost before tax in pricing currency to correlate
     * with prices.
     */
    @JsonProperty(value = "properties.costInPricingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal costInPricingCurrency;

    /*
     * Exchange rate used in conversion from pricing currency to billing
     * currency.
     */
    @JsonProperty(value = "properties.exchangeRate", access = JsonProperty.Access.WRITE_ONLY)
    private String exchangeRate;

    /*
     * Date on which exchange rate used in conversion from pricing currency to
     * billing currency.
     */
    @JsonProperty(value = "properties.exchangeRateDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime exchangeRateDate;

    /*
     * Invoice ID as on the invoice where the specific transaction appears.
     */
    @JsonProperty(value = "properties.invoiceId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceId;

    /*
     * Reference to an original invoice there is a refund (negative cost). This
     * is populated only when there is a refund.
     */
    @JsonProperty(value = "properties.previousInvoiceId", access = JsonProperty.Access.WRITE_ONLY)
    private String previousInvoiceId;

    /*
     * Pricing Billing Currency.
     */
    @JsonProperty(value = "properties.pricingCurrencyCode", access = JsonProperty.Access.WRITE_ONLY)
    private String pricingCurrencyCode;

    /*
     * Identifier for the product that has accrued charges by consumption or
     * purchase . This is the concatenated key of productId and SkuId in
     * partner center.
     */
    @JsonProperty(value = "properties.productIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String productIdentifier;

    /*
     * Resource Location Normalized.
     */
    @JsonProperty(value = "properties.resourceLocationNormalized", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceLocationNormalized;

    /*
     * Start date for the rating period when the service usage was rated for
     * charges. The prices for Azure services are determined for the rating
     * period.
     */
    @JsonProperty(value = "properties.servicePeriodStartDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime servicePeriodStartDate;

    /*
     * End date for the period when the service usage was rated for charges.
     * The prices for Azure services are determined based on the rating period.
     */
    @JsonProperty(value = "properties.servicePeriodEndDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime servicePeriodEndDate;

    /*
     * Identifier of the customer's AAD tenant.
     */
    @JsonProperty(value = "properties.customerTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerTenantId;

    /*
     * Name of the customer's AAD tenant.
     */
    @JsonProperty(value = "properties.customerName", access = JsonProperty.Access.WRITE_ONLY)
    private String customerName;

    /*
     * Identifier for the partner's AAD tenant.
     */
    @JsonProperty(value = "properties.partnerTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerTenantId;

    /*
     * Name of the partner' AAD tenant.
     */
    @JsonProperty(value = "properties.partnerName", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerName;

    /*
     * MPNId for the reseller associated with the subscription.
     */
    @JsonProperty(value = "properties.resellerMpnId", access = JsonProperty.Access.WRITE_ONLY)
    private String resellerMpnId;

    /*
     * Reseller Name.
     */
    @JsonProperty(value = "properties.resellerName", access = JsonProperty.Access.WRITE_ONLY)
    private String resellerName;

    /*
     * Publisher Id.
     */
    @JsonProperty(value = "properties.publisherId", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherId;

    /*
     * Market Price that's charged for the usage.
     */
    @JsonProperty(value = "properties.marketPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal marketPrice;

    /*
     * Exchange Rate from pricing currency to billing currency.
     */
    @JsonProperty(value = "properties.exchangeRatePricingToBilling", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal exchangeRatePricingToBilling;

    /*
     * The amount of PayG cost before tax in billing currency.
     */
    @JsonProperty(value = "properties.paygCostInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal paygCostInBillingCurrency;

    /*
     * The amount of PayG cost before tax in US Dollar currency.
     */
    @JsonProperty(value = "properties.paygCostInUSD", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal paygCostInUsd;

    /*
     * Rate of discount applied if there is a partner earned credit (PEC) based
     * on partner admin link access.
     */
    @JsonProperty(value = "properties.partnerEarnedCreditRate", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal partnerEarnedCreditRate;

    /*
     * Flag to indicate if partner earned credit has been applied or not.
     */
    @JsonProperty(value = "properties.partnerEarnedCreditApplied", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerEarnedCreditApplied;

    /*
     * Retail price for the resource.
     */
    @JsonProperty(value = "properties.payGPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal payGPrice;

    /**
     * Get the billingAccountId property: Billing Account identifier.
     *
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get the billingAccountName property: Name of the Billing Account.
     *
     * @return the billingAccountName value.
     */
    public String billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * Get the billingPeriodStartDate property: Billing Period Start Date as in the invoice.
     *
     * @return the billingPeriodStartDate value.
     */
    public OffsetDateTime billingPeriodStartDate() {
        return this.billingPeriodStartDate;
    }

    /**
     * Get the billingPeriodEndDate property: Billing Period End Date as in the invoice.
     *
     * @return the billingPeriodEndDate value.
     */
    public OffsetDateTime billingPeriodEndDate() {
        return this.billingPeriodEndDate;
    }

    /**
     * Get the billingProfileId property: Identifier for the billing profile that groups costs across invoices in the a
     * singular billing currency across across the customers who have onboarded the Microsoft customer agreement and the
     * customers in CSP who have made entitlement purchases like SaaS, Marketplace, RI, etc.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileName property: Name of the billing profile that groups costs across invoices in the a
     * singular billing currency across across the customers who have onboarded the Microsoft customer agreement and the
     * customers in CSP who have made entitlement purchases like SaaS, Marketplace, RI, etc.
     *
     * @return the billingProfileName value.
     */
    public String billingProfileName() {
        return this.billingProfileName;
    }

    /**
     * Get the subscriptionGuid property: Unique Microsoft generated identifier for the Azure Subscription.
     *
     * @return the subscriptionGuid value.
     */
    public String subscriptionGuid() {
        return this.subscriptionGuid;
    }

    /**
     * Get the subscriptionName property: Name of the Azure Subscription.
     *
     * @return the subscriptionName value.
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get the date property: Date for the usage record.
     *
     * @return the date value.
     */
    public OffsetDateTime date() {
        return this.date;
    }

    /**
     * Get the product property: Name of the product that has accrued charges by consumption or purchase as listed in
     * the invoice. Not available for Marketplace.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Get the meterId property: The meter id (GUID). Not available for marketplace. For reserved instance this
     * represents the primary meter for which the reservation was purchased. For the actual VM Size for which the
     * reservation is purchased see productOrderName.
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the meterName property: Identifies the name of the meter against which consumption is measured.
     *
     * @return the meterName value.
     */
    public String meterName() {
        return this.meterName;
    }

    /**
     * Get the meterRegion property: Identifies the location of the datacenter for certain services that are priced
     * based on datacenter location.
     *
     * @return the meterRegion value.
     */
    public String meterRegion() {
        return this.meterRegion;
    }

    /**
     * Get the meterCategory property: Identifies the top-level service for the usage.
     *
     * @return the meterCategory value.
     */
    public String meterCategory() {
        return this.meterCategory;
    }

    /**
     * Get the meterSubCategory property: Defines the type or sub-category of Azure service that can affect the rate.
     *
     * @return the meterSubCategory value.
     */
    public String meterSubCategory() {
        return this.meterSubCategory;
    }

    /**
     * Get the serviceFamily property: List the service family for the product purchased or charged (Example: Storage ;
     * Compute).
     *
     * @return the serviceFamily value.
     */
    public String serviceFamily() {
        return this.serviceFamily;
    }

    /**
     * Get the quantity property: Measure the quantity purchased or consumed.The amount of the meter used during the
     * billing period.
     *
     * @return the quantity value.
     */
    public BigDecimal quantity() {
        return this.quantity;
    }

    /**
     * Get the unitOfMeasure property: Identifies the Unit that the service is charged in. For example, GB, hours,
     * 10,000 s.
     *
     * @return the unitOfMeasure value.
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get the instanceName property: Instance Name.
     *
     * @return the instanceName value.
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Get the costInUsd property: Estimated extendedCost or blended cost before tax in USD.
     *
     * @return the costInUsd value.
     */
    public BigDecimal costInUsd() {
        return this.costInUsd;
    }

    /**
     * Get the unitPrice property: Unit Price is the price applicable to you. (your EA or other contract price).
     *
     * @return the unitPrice value.
     */
    public BigDecimal unitPrice() {
        return this.unitPrice;
    }

    /**
     * Get the billingCurrencyCode property: The currency defining the billed cost.
     *
     * @return the billingCurrencyCode value.
     */
    public String billingCurrencyCode() {
        return this.billingCurrencyCode;
    }

    /**
     * Get the resourceLocation property: Name of the resource location.
     *
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Get the consumedService property: Consumed service name. Name of the azure resource provider that emits the usage
     * or was purchased. This value is not provided for marketplace usage.
     *
     * @return the consumedService value.
     */
    public String consumedService() {
        return this.consumedService;
    }

    /**
     * Get the serviceInfo1 property: Service Info 1.
     *
     * @return the serviceInfo1 value.
     */
    public String serviceInfo1() {
        return this.serviceInfo1;
    }

    /**
     * Get the serviceInfo2 property: Service Info 2.
     *
     * @return the serviceInfo2 value.
     */
    public String serviceInfo2() {
        return this.serviceInfo2;
    }

    /**
     * Get the additionalInfo property: Additional details of this usage item. Use this field to get usage line item
     * specific details such as the actual VM Size (ServiceType) or the ratio in which the reservation discount is
     * applied.
     *
     * @return the additionalInfo value.
     */
    public String additionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Get the invoiceSectionId property: Identifier of the project that is being charged in the invoice. Not applicable
     * for Microsoft Customer Agreements onboarded by partners.
     *
     * @return the invoiceSectionId value.
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get the invoiceSectionName property: Name of the project that is being charged in the invoice. Not applicable for
     * Microsoft Customer Agreements onboarded by partners.
     *
     * @return the invoiceSectionName value.
     */
    public String invoiceSectionName() {
        return this.invoiceSectionName;
    }

    /**
     * Get the costCenter property: The cost center of this department if it is a department and a cost center is
     * provided.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Get the resourceGroup property: Name of the Azure resource group used for cohesive lifecycle management of
     * resources.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the reservationId property: ARM resource id of the reservation. Only applies to records relevant to
     * reservations.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the reservationName property: User provided display name of the reservation. Last known name for a particular
     * day is populated in the daily data. Only applies to records relevant to reservations.
     *
     * @return the reservationName value.
     */
    public String reservationName() {
        return this.reservationName;
    }

    /**
     * Get the productOrderId property: The identifier for the asset or Azure plan name that the subscription belongs
     * to. For example: Azure Plan. For reservations this is the Reservation Order ID.
     *
     * @return the productOrderId value.
     */
    public String productOrderId() {
        return this.productOrderId;
    }

    /**
     * Get the productOrderName property: Product Order Name. For reservations this is the SKU that was purchased.
     *
     * @return the productOrderName value.
     */
    public String productOrderName() {
        return this.productOrderName;
    }

    /**
     * Get the isAzureCreditEligible property: Determines if the cost is eligible to be paid for using Azure credits.
     *
     * @return the isAzureCreditEligible value.
     */
    public Boolean isAzureCreditEligible() {
        return this.isAzureCreditEligible;
    }

    /**
     * Get the term property: Term (in months). Displays the term for the validity of the offer. For example. In case of
     * reserved instances it displays 12 months for yearly term of reserved instance. For one time purchases or
     * recurring purchases, the terms displays 1 month; This is not applicable for Azure consumption.
     *
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the publisherName property: Name of the publisher of the service including Microsoft or Third Party
     * publishers.
     *
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.publisherName;
    }

    /**
     * Get the publisherType property: Type of publisher that identifies if the publisher is first party, third party
     * reseller or third party agency.
     *
     * @return the publisherType value.
     */
    public String publisherType() {
        return this.publisherType;
    }

    /**
     * Get the chargeType property: Indicates a charge represents credits, usage, a Marketplace purchase, a reservation
     * fee, or a refund.
     *
     * @return the chargeType value.
     */
    public String chargeType() {
        return this.chargeType;
    }

    /**
     * Get the frequency property: Indicates how frequently this charge will occur. OneTime for purchases which only
     * happen once, Monthly for fees which recur every month, and UsageBased for charges based on how much a service is
     * used.
     *
     * @return the frequency value.
     */
    public String frequency() {
        return this.frequency;
    }

    /**
     * Get the costInBillingCurrency property: ExtendedCost or blended cost before tax in billed currency.
     *
     * @return the costInBillingCurrency value.
     */
    public BigDecimal costInBillingCurrency() {
        return this.costInBillingCurrency;
    }

    /**
     * Get the costInPricingCurrency property: ExtendedCost or blended cost before tax in pricing currency to correlate
     * with prices.
     *
     * @return the costInPricingCurrency value.
     */
    public BigDecimal costInPricingCurrency() {
        return this.costInPricingCurrency;
    }

    /**
     * Get the exchangeRate property: Exchange rate used in conversion from pricing currency to billing currency.
     *
     * @return the exchangeRate value.
     */
    public String exchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Get the exchangeRateDate property: Date on which exchange rate used in conversion from pricing currency to
     * billing currency.
     *
     * @return the exchangeRateDate value.
     */
    public OffsetDateTime exchangeRateDate() {
        return this.exchangeRateDate;
    }

    /**
     * Get the invoiceId property: Invoice ID as on the invoice where the specific transaction appears.
     *
     * @return the invoiceId value.
     */
    public String invoiceId() {
        return this.invoiceId;
    }

    /**
     * Get the previousInvoiceId property: Reference to an original invoice there is a refund (negative cost). This is
     * populated only when there is a refund.
     *
     * @return the previousInvoiceId value.
     */
    public String previousInvoiceId() {
        return this.previousInvoiceId;
    }

    /**
     * Get the pricingCurrencyCode property: Pricing Billing Currency.
     *
     * @return the pricingCurrencyCode value.
     */
    public String pricingCurrencyCode() {
        return this.pricingCurrencyCode;
    }

    /**
     * Get the productIdentifier property: Identifier for the product that has accrued charges by consumption or
     * purchase . This is the concatenated key of productId and SkuId in partner center.
     *
     * @return the productIdentifier value.
     */
    public String productIdentifier() {
        return this.productIdentifier;
    }

    /**
     * Get the resourceLocationNormalized property: Resource Location Normalized.
     *
     * @return the resourceLocationNormalized value.
     */
    public String resourceLocationNormalized() {
        return this.resourceLocationNormalized;
    }

    /**
     * Get the servicePeriodStartDate property: Start date for the rating period when the service usage was rated for
     * charges. The prices for Azure services are determined for the rating period.
     *
     * @return the servicePeriodStartDate value.
     */
    public OffsetDateTime servicePeriodStartDate() {
        return this.servicePeriodStartDate;
    }

    /**
     * Get the servicePeriodEndDate property: End date for the period when the service usage was rated for charges. The
     * prices for Azure services are determined based on the rating period.
     *
     * @return the servicePeriodEndDate value.
     */
    public OffsetDateTime servicePeriodEndDate() {
        return this.servicePeriodEndDate;
    }

    /**
     * Get the customerTenantId property: Identifier of the customer's AAD tenant.
     *
     * @return the customerTenantId value.
     */
    public String customerTenantId() {
        return this.customerTenantId;
    }

    /**
     * Get the customerName property: Name of the customer's AAD tenant.
     *
     * @return the customerName value.
     */
    public String customerName() {
        return this.customerName;
    }

    /**
     * Get the partnerTenantId property: Identifier for the partner's AAD tenant.
     *
     * @return the partnerTenantId value.
     */
    public String partnerTenantId() {
        return this.partnerTenantId;
    }

    /**
     * Get the partnerName property: Name of the partner' AAD tenant.
     *
     * @return the partnerName value.
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * Get the resellerMpnId property: MPNId for the reseller associated with the subscription.
     *
     * @return the resellerMpnId value.
     */
    public String resellerMpnId() {
        return this.resellerMpnId;
    }

    /**
     * Get the resellerName property: Reseller Name.
     *
     * @return the resellerName value.
     */
    public String resellerName() {
        return this.resellerName;
    }

    /**
     * Get the publisherId property: Publisher Id.
     *
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Get the marketPrice property: Market Price that's charged for the usage.
     *
     * @return the marketPrice value.
     */
    public BigDecimal marketPrice() {
        return this.marketPrice;
    }

    /**
     * Get the exchangeRatePricingToBilling property: Exchange Rate from pricing currency to billing currency.
     *
     * @return the exchangeRatePricingToBilling value.
     */
    public BigDecimal exchangeRatePricingToBilling() {
        return this.exchangeRatePricingToBilling;
    }

    /**
     * Get the paygCostInBillingCurrency property: The amount of PayG cost before tax in billing currency.
     *
     * @return the paygCostInBillingCurrency value.
     */
    public BigDecimal paygCostInBillingCurrency() {
        return this.paygCostInBillingCurrency;
    }

    /**
     * Get the paygCostInUsd property: The amount of PayG cost before tax in US Dollar currency.
     *
     * @return the paygCostInUsd value.
     */
    public BigDecimal paygCostInUsd() {
        return this.paygCostInUsd;
    }

    /**
     * Get the partnerEarnedCreditRate property: Rate of discount applied if there is a partner earned credit (PEC)
     * based on partner admin link access.
     *
     * @return the partnerEarnedCreditRate value.
     */
    public BigDecimal partnerEarnedCreditRate() {
        return this.partnerEarnedCreditRate;
    }

    /**
     * Get the partnerEarnedCreditApplied property: Flag to indicate if partner earned credit has been applied or not.
     *
     * @return the partnerEarnedCreditApplied value.
     */
    public String partnerEarnedCreditApplied() {
        return this.partnerEarnedCreditApplied;
    }

    /**
     * Get the payGPrice property: Retail price for the resource.
     *
     * @return the payGPrice value.
     */
    public BigDecimal payGPrice() {
        return this.payGPrice;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
