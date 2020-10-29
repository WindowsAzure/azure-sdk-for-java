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

/**
 * Properties of data destination details validation response.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType", defaultImpl = DataDestinationDetailsValidationResponseProperties.class)
@JsonTypeName("ValidateDataDestinationDetails")
public class DataDestinationDetailsValidationResponseProperties extends ValidationInputResponse {
    /**
     * Data destination details validation status. Possible values include:
     * 'Valid', 'Invalid', 'Skipped'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationStatus status;

    /**
     * Get data destination details validation status. Possible values include: 'Valid', 'Invalid', 'Skipped'.
     *
     * @return the status value
     */
    public ValidationStatus status() {
        return this.status;
    }

}
