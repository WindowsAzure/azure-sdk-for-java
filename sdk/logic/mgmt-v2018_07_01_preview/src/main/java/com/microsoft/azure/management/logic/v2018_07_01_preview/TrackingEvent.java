/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TrackingEvent model.
 */
public class TrackingEvent {
    /**
     * Possible values include: 'LogAlways', 'Critical', 'Error', 'Warning',
     * 'Informational', 'Verbose'.
     */
    @JsonProperty(value = "eventLevel", required = true)
    private EventLevel eventLevel;

    /**
     * The eventTime property.
     */
    @JsonProperty(value = "eventTime", required = true)
    private DateTime eventTime;

    /**
     * Possible values include: 'NotSpecified', 'Custom', 'AS2Message',
     * 'AS2MDN', 'X12Interchange', 'X12FunctionalGroup', 'X12TransactionSet',
     * 'X12InterchangeAcknowledgment', 'X12FunctionalGroupAcknowledgment',
     * 'X12TransactionSetAcknowledgment', 'EdifactInterchange',
     * 'EdifactFunctionalGroup', 'EdifactTransactionSet',
     * 'EdifactInterchangeAcknowledgment',
     * 'EdifactFunctionalGroupAcknowledgment',
     * 'EdifactTransactionSetAcknowledgment'.
     */
    @JsonProperty(value = "recordType", required = true)
    private TrackingRecordType recordType;

    /**
     * The error property.
     */
    @JsonProperty(value = "error")
    private TrackingEventErrorInfo error;

    /**
     * Get possible values include: 'LogAlways', 'Critical', 'Error', 'Warning', 'Informational', 'Verbose'.
     *
     * @return the eventLevel value
     */
    public EventLevel eventLevel() {
        return this.eventLevel;
    }

    /**
     * Set possible values include: 'LogAlways', 'Critical', 'Error', 'Warning', 'Informational', 'Verbose'.
     *
     * @param eventLevel the eventLevel value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withEventLevel(EventLevel eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * Get the eventTime value.
     *
     * @return the eventTime value
     */
    public DateTime eventTime() {
        return this.eventTime;
    }

    /**
     * Set the eventTime value.
     *
     * @param eventTime the eventTime value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withEventTime(DateTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get possible values include: 'NotSpecified', 'Custom', 'AS2Message', 'AS2MDN', 'X12Interchange', 'X12FunctionalGroup', 'X12TransactionSet', 'X12InterchangeAcknowledgment', 'X12FunctionalGroupAcknowledgment', 'X12TransactionSetAcknowledgment', 'EdifactInterchange', 'EdifactFunctionalGroup', 'EdifactTransactionSet', 'EdifactInterchangeAcknowledgment', 'EdifactFunctionalGroupAcknowledgment', 'EdifactTransactionSetAcknowledgment'.
     *
     * @return the recordType value
     */
    public TrackingRecordType recordType() {
        return this.recordType;
    }

    /**
     * Set possible values include: 'NotSpecified', 'Custom', 'AS2Message', 'AS2MDN', 'X12Interchange', 'X12FunctionalGroup', 'X12TransactionSet', 'X12InterchangeAcknowledgment', 'X12FunctionalGroupAcknowledgment', 'X12TransactionSetAcknowledgment', 'EdifactInterchange', 'EdifactFunctionalGroup', 'EdifactTransactionSet', 'EdifactInterchangeAcknowledgment', 'EdifactFunctionalGroupAcknowledgment', 'EdifactTransactionSetAcknowledgment'.
     *
     * @param recordType the recordType value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withRecordType(TrackingRecordType recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public TrackingEventErrorInfo error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withError(TrackingEventErrorInfo error) {
        this.error = error;
        return this;
    }

}
