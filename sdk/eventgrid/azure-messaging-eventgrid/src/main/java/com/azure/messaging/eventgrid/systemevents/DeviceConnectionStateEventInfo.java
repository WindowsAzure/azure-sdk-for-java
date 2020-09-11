// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeviceConnectionStateEventInfo model. */
@Fluent
public final class DeviceConnectionStateEventInfo {
    /*
     * Sequence number is string representation of a hexadecimal number. string
     * compare can be used to identify the larger number because both in ASCII
     * and HEX numbers come after alphabets. If you are converting the string
     * to hex, then the number is a 256 bit number.
     */
    @JsonProperty(value = "sequenceNumber")
    private String sequenceNumber;

    /**
     * Get the sequenceNumber property: Sequence number is string representation of a hexadecimal number. string compare
     * can be used to identify the larger number because both in ASCII and HEX numbers come after alphabets. If you are
     * converting the string to hex, then the number is a 256 bit number.
     *
     * @return the sequenceNumber value.
     */
    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Set the sequenceNumber property: Sequence number is string representation of a hexadecimal number. string compare
     * can be used to identify the larger number because both in ASCII and HEX numbers come after alphabets. If you are
     * converting the string to hex, then the number is a 256 bit number.
     *
     * @param sequenceNumber the sequenceNumber value to set.
     * @return the DeviceConnectionStateEventInfo object itself.
     */
    public DeviceConnectionStateEventInfo setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
}
