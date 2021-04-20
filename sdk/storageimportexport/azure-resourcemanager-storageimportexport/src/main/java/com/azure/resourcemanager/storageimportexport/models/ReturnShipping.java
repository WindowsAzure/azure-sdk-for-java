// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the return carrier and customer's account with the carrier. */
@Fluent
public final class ReturnShipping {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReturnShipping.class);

    /*
     * The carrier's name.
     */
    @JsonProperty(value = "carrierName", required = true)
    private String carrierName;

    /*
     * The customer's account number with the carrier.
     */
    @JsonProperty(value = "carrierAccountNumber", required = true)
    private String carrierAccountNumber;

    /**
     * Get the carrierName property: The carrier's name.
     *
     * @return the carrierName value.
     */
    public String carrierName() {
        return this.carrierName;
    }

    /**
     * Set the carrierName property: The carrier's name.
     *
     * @param carrierName the carrierName value to set.
     * @return the ReturnShipping object itself.
     */
    public ReturnShipping withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get the carrierAccountNumber property: The customer's account number with the carrier.
     *
     * @return the carrierAccountNumber value.
     */
    public String carrierAccountNumber() {
        return this.carrierAccountNumber;
    }

    /**
     * Set the carrierAccountNumber property: The customer's account number with the carrier.
     *
     * @param carrierAccountNumber the carrierAccountNumber value to set.
     * @return the ReturnShipping object itself.
     */
    public ReturnShipping withCarrierAccountNumber(String carrierAccountNumber) {
        this.carrierAccountNumber = carrierAccountNumber;
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
                    new IllegalArgumentException("Missing required property carrierName in model ReturnShipping"));
        }
        if (carrierAccountNumber() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property carrierAccountNumber in model ReturnShipping"));
        }
    }
}
