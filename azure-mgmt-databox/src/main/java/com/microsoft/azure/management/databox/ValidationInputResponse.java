/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Minimum properties that should be present in each individual validation
 * response.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType", defaultImpl = ValidationInputResponse.class)
@JsonTypeName("ValidationInputResponse")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ValidateCreateOrderLimit", value = CreateOrderLimitForSubscriptionValidationResponseProperties.class),
    @JsonSubTypes.Type(name = "ValidateDataDestinationDetails", value = DataDestinationDetailsValidationResponseProperties.class),
    @JsonSubTypes.Type(name = "ValidatePreferences", value = PreferencesValidationResponseProperties.class),
    @JsonSubTypes.Type(name = "ValidateSkuAvailability", value = SkuAvailabilityValidationResponseProperties.class),
    @JsonSubTypes.Type(name = "ValidateSubscriptionIsAllowedToCreateJob", value = SubscriptionIsAllowedToCreateJobValidationResponseProperties.class)
})
public class ValidationInputResponse {
    /**
     * Error code and message of validation response.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private Error error;

    /**
     * Get error code and message of validation response.
     *
     * @return the error value
     */
    public Error error() {
        return this.error;
    }

}
