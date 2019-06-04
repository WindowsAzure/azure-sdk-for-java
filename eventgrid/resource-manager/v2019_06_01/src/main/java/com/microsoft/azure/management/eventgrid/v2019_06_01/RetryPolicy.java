/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the retry policy for an event subscription.
 */
public class RetryPolicy {
    /**
     * Maximum number of delivery retry attempts for events.
     */
    @JsonProperty(value = "maxDeliveryAttempts")
    private Integer maxDeliveryAttempts;

    /**
     * Time To Live (in minutes) for events.
     */
    @JsonProperty(value = "eventTimeToLiveInMinutes")
    private Integer eventTimeToLiveInMinutes;

    /**
     * Get maximum number of delivery retry attempts for events.
     *
     * @return the maxDeliveryAttempts value
     */
    public Integer maxDeliveryAttempts() {
        return this.maxDeliveryAttempts;
    }

    /**
     * Set maximum number of delivery retry attempts for events.
     *
     * @param maxDeliveryAttempts the maxDeliveryAttempts value to set
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withMaxDeliveryAttempts(Integer maxDeliveryAttempts) {
        this.maxDeliveryAttempts = maxDeliveryAttempts;
        return this;
    }

    /**
     * Get time To Live (in minutes) for events.
     *
     * @return the eventTimeToLiveInMinutes value
     */
    public Integer eventTimeToLiveInMinutes() {
        return this.eventTimeToLiveInMinutes;
    }

    /**
     * Set time To Live (in minutes) for events.
     *
     * @param eventTimeToLiveInMinutes the eventTimeToLiveInMinutes value to set
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withEventTimeToLiveInMinutes(Integer eventTimeToLiveInMinutes) {
        this.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
        return this;
    }

}
