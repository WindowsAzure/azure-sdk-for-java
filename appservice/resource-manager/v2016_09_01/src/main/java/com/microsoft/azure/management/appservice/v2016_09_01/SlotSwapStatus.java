/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of the last successful slot swap operation.
 */
public class SlotSwapStatus {
    /**
     * The time the last successful slot swap completed.
     */
    @JsonProperty(value = "timestampUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestampUtc;

    /**
     * The source slot of the last swap operation.
     */
    @JsonProperty(value = "sourceSlotName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceSlotName;

    /**
     * The destination slot of the last swap operation.
     */
    @JsonProperty(value = "destinationSlotName", access = JsonProperty.Access.WRITE_ONLY)
    private String destinationSlotName;

    /**
     * Get the time the last successful slot swap completed.
     *
     * @return the timestampUtc value
     */
    public DateTime timestampUtc() {
        return this.timestampUtc;
    }

    /**
     * Get the source slot of the last swap operation.
     *
     * @return the sourceSlotName value
     */
    public String sourceSlotName() {
        return this.sourceSlotName;
    }

    /**
     * Get the destination slot of the last swap operation.
     *
     * @return the destinationSlotName value
     */
    public String destinationSlotName() {
        return this.destinationSlotName;
    }

}
