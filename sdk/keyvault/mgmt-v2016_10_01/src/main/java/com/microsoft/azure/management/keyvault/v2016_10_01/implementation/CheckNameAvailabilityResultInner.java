/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.management.keyvault.v2016_10_01.Reason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CheckNameAvailability operation response.
 */
public class CheckNameAvailabilityResultInner {
    /**
     * A boolean value that indicates whether the name is available for you to
     * use. If true, the name is available. If false, the name has already been
     * taken or is invalid and cannot be used.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /**
     * The reason that a vault name could not be used. The Reason element is
     * only returned if NameAvailable is false. Possible values include:
     * 'AccountNameInvalid', 'AlreadyExists'.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private Reason reason;

    /**
     * An error message explaining the Reason value in more detail.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get a boolean value that indicates whether the name is available for you to use. If true, the name is available. If false, the name has already been taken or is invalid and cannot be used.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason that a vault name could not be used. The Reason element is only returned if NameAvailable is false. Possible values include: 'AccountNameInvalid', 'AlreadyExists'.
     *
     * @return the reason value
     */
    public Reason reason() {
        return this.reason;
    }

    /**
     * Get an error message explaining the Reason value in more detail.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
