/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01;

import java.util.UUID;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the price sheet.
 */
public class PriceSheetProperties {
    /**
     * The id of the billing period resource that the usage belongs to.
     */
    @JsonProperty(value = "billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /**
     * The meter id (GUID).
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /**
     * The details about the meter. By default this is not populated, unless
     * it's specified in $expand.
     */
    @JsonProperty(value = "meterDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MeterDetails meterDetails;

    /**
     * Unit of measure.
     */
    @JsonProperty(value = "unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /**
     * Included quality for an offer.
     */
    @JsonProperty(value = "includedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal includedQuantity;

    /**
     * Part Number.
     */
    @JsonProperty(value = "partNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String partNumber;

    /**
     * Unit Price.
     */
    @JsonProperty(value = "unitPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal unitPrice;

    /**
     * Currency Code.
     */
    @JsonProperty(value = "currencyCode", access = JsonProperty.Access.WRITE_ONLY)
    private String currencyCode;

    /**
     * Offer Id.
     */
    @JsonProperty(value = "offerId", access = JsonProperty.Access.WRITE_ONLY)
    private String offerId;

    /**
     * Get the id of the billing period resource that the usage belongs to.
     *
     * @return the billingPeriodId value
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
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
     * Get the details about the meter. By default this is not populated, unless it's specified in $expand.
     *
     * @return the meterDetails value
     */
    public MeterDetails meterDetails() {
        return this.meterDetails;
    }

    /**
     * Get unit of measure.
     *
     * @return the unitOfMeasure value
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get included quality for an offer.
     *
     * @return the includedQuantity value
     */
    public BigDecimal includedQuantity() {
        return this.includedQuantity;
    }

    /**
     * Get part Number.
     *
     * @return the partNumber value
     */
    public String partNumber() {
        return this.partNumber;
    }

    /**
     * Get unit Price.
     *
     * @return the unitPrice value
     */
    public BigDecimal unitPrice() {
        return this.unitPrice;
    }

    /**
     * Get currency Code.
     *
     * @return the currencyCode value
     */
    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Get offer Id.
     *
     * @return the offerId value
     */
    public String offerId() {
        return this.offerId;
    }

}
