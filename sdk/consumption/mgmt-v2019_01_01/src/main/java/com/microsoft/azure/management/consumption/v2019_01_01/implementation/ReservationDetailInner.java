/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * reservation detail resource.
 */
@JsonFlatten
public class ReservationDetailInner extends ProxyResource {
    /**
     * The reservation order ID is the identifier for a reservation purchase.
     * Each reservation order ID represents a single purchase transaction. A
     * reservation order contains reservations. The reservation order specifies
     * the VM size and region for the reservations.
     */
    @JsonProperty(value = "properties.reservationOrderId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationOrderId;

    /**
     * The reservation ID is the identifier of a reservation within a
     * reservation order. Each reservation is the grouping for applying the
     * benefit scope and also specifies the number of instances to which the
     * reservation benefit can be applied to.
     */
    @JsonProperty(value = "properties.reservationId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationId;

    /**
     * This is the ARM Sku name. It can be used to join with the serviceType
     * field in additional info in usage records.
     */
    @JsonProperty(value = "properties.skuName", access = JsonProperty.Access.WRITE_ONLY)
    private String skuName;

    /**
     * This is the total hours reserved for the day. E.g. if reservation for 1
     * instance was made on 1 PM, this will be 11 hours for that day and 24
     * hours from subsequent days.
     */
    @JsonProperty(value = "properties.reservedHours", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal reservedHours;

    /**
     * The date on which consumption occurred.
     */
    @JsonProperty(value = "properties.usageDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime usageDate;

    /**
     * This is the total hours used by the instance.
     */
    @JsonProperty(value = "properties.usedHours", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal usedHours;

    /**
     * This identifier is the name of the resource or the fully qualified
     * Resource ID.
     */
    @JsonProperty(value = "properties.instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /**
     * This is the total count of instances that are reserved for the
     * reservationId.
     */
    @JsonProperty(value = "properties.totalReservedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalReservedQuantity;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the reservation order ID is the identifier for a reservation purchase. Each reservation order ID represents a single purchase transaction. A reservation order contains reservations. The reservation order specifies the VM size and region for the reservations.
     *
     * @return the reservationOrderId value
     */
    public String reservationOrderId() {
        return this.reservationOrderId;
    }

    /**
     * Get the reservation ID is the identifier of a reservation within a reservation order. Each reservation is the grouping for applying the benefit scope and also specifies the number of instances to which the reservation benefit can be applied to.
     *
     * @return the reservationId value
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get this is the ARM Sku name. It can be used to join with the serviceType field in additional info in usage records.
     *
     * @return the skuName value
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Get this is the total hours reserved for the day. E.g. if reservation for 1 instance was made on 1 PM, this will be 11 hours for that day and 24 hours from subsequent days.
     *
     * @return the reservedHours value
     */
    public BigDecimal reservedHours() {
        return this.reservedHours;
    }

    /**
     * Get the date on which consumption occurred.
     *
     * @return the usageDate value
     */
    public DateTime usageDate() {
        return this.usageDate;
    }

    /**
     * Get this is the total hours used by the instance.
     *
     * @return the usedHours value
     */
    public BigDecimal usedHours() {
        return this.usedHours;
    }

    /**
     * Get this identifier is the name of the resource or the fully qualified Resource ID.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get this is the total count of instances that are reserved for the reservationId.
     *
     * @return the totalReservedQuantity value
     */
    public BigDecimal totalReservedQuantity() {
        return this.totalReservedQuantity;
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
