/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Job details for update.
 */
public class UpdateJobDetails {
    /**
     * Contact details for notification and shipping.
     */
    @JsonProperty(value = "contactDetails")
    private ContactDetails contactDetails;

    /**
     * Shipping address of the customer.
     */
    @JsonProperty(value = "shippingAddress")
    private ShippingAddress shippingAddress;

    /**
     * Get contact details for notification and shipping.
     *
     * @return the contactDetails value
     */
    public ContactDetails contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set contact details for notification and shipping.
     *
     * @param contactDetails the contactDetails value to set
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Get shipping address of the customer.
     *
     * @return the shippingAddress value
     */
    public ShippingAddress shippingAddress() {
        return this.shippingAddress;
    }

    /**
     * Set shipping address of the customer.
     *
     * @param shippingAddress the shippingAddress value to set
     * @return the UpdateJobDetails object itself.
     */
    public UpdateJobDetails withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

}
