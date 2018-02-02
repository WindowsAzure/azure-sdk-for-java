/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.models;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * reservation details resource.
 */
@JsonFlatten
public class ReservationDetails extends Resource {
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
     * This is the ARM Sku name. It can be used to join with the servicetype
     * field in additoinalinfo in usage records.
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
     * reservationid.
     */
    @JsonProperty(value = "properties.totalReservedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalReservedQuantity;

    /**
     * Get the reservationOrderId value.
     *
     * @return the reservationOrderId value
     */
    public String reservationOrderId() {
        return this.reservationOrderId;
    }

    /**
     * Get the reservationId value.
     *
     * @return the reservationId value
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the skuName value.
     *
     * @return the skuName value
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Get the reservedHours value.
     *
     * @return the reservedHours value
     */
    public BigDecimal reservedHours() {
        return this.reservedHours;
    }

    /**
     * Get the usageDate value.
     *
     * @return the usageDate value
     */
    public DateTime usageDate() {
        return this.usageDate;
    }

    /**
     * Get the usedHours value.
     *
     * @return the usedHours value
     */
    public BigDecimal usedHours() {
        return this.usedHours;
    }

    /**
     * Get the instanceId value.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the totalReservedQuantity value.
     *
     * @return the totalReservedQuantity value
     */
    public BigDecimal totalReservedQuantity() {
        return this.totalReservedQuantity;
    }

}
