// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains information about the delivery package being shipped by the customer to the Microsoft data center. */
@Fluent
public final class DeliveryPackageInformation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeliveryPackageInformation.class);

    /*
     * The name of the carrier that is used to ship the import or export
     * drives.
     */
    @JsonProperty(value = "carrierName", required = true)
    private String carrierName;

    /*
     * The tracking number of the package.
     */
    @JsonProperty(value = "trackingNumber", required = true)
    private String trackingNumber;

    /*
     * The number of drives included in the package.
     */
    @JsonProperty(value = "driveCount")
    private Long driveCount;

    /*
     * The date when the package is shipped.
     */
    @JsonProperty(value = "shipDate")
    private String shipDate;

    /**
     * Get the carrierName property: The name of the carrier that is used to ship the import or export drives.
     *
     * @return the carrierName value.
     */
    public String carrierName() {
        return this.carrierName;
    }

    /**
     * Set the carrierName property: The name of the carrier that is used to ship the import or export drives.
     *
     * @param carrierName the carrierName value to set.
     * @return the DeliveryPackageInformation object itself.
     */
    public DeliveryPackageInformation withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get the trackingNumber property: The tracking number of the package.
     *
     * @return the trackingNumber value.
     */
    public String trackingNumber() {
        return this.trackingNumber;
    }

    /**
     * Set the trackingNumber property: The tracking number of the package.
     *
     * @param trackingNumber the trackingNumber value to set.
     * @return the DeliveryPackageInformation object itself.
     */
    public DeliveryPackageInformation withTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     * Get the driveCount property: The number of drives included in the package.
     *
     * @return the driveCount value.
     */
    public Long driveCount() {
        return this.driveCount;
    }

    /**
     * Set the driveCount property: The number of drives included in the package.
     *
     * @param driveCount the driveCount value to set.
     * @return the DeliveryPackageInformation object itself.
     */
    public DeliveryPackageInformation withDriveCount(Long driveCount) {
        this.driveCount = driveCount;
        return this;
    }

    /**
     * Get the shipDate property: The date when the package is shipped.
     *
     * @return the shipDate value.
     */
    public String shipDate() {
        return this.shipDate;
    }

    /**
     * Set the shipDate property: The date when the package is shipped.
     *
     * @param shipDate the shipDate value to set.
     * @return the DeliveryPackageInformation object itself.
     */
    public DeliveryPackageInformation withShipDate(String shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (carrierName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property carrierName in model DeliveryPackageInformation"));
        }
        if (trackingNumber() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property trackingNumber in model DeliveryPackageInformation"));
        }
    }
}
