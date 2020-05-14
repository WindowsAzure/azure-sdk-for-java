/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The tracking event.
 */
public class TrackingEvent {
    /**
     * The event level. Possible values include: 'LogAlways', 'Critical',
     * 'Error', 'Warning', 'Informational', 'Verbose'.
     */
    @JsonProperty(value = "eventLevel", required = true)
    private EventLevel eventLevel;

    /**
     * The event time.
     */
    @JsonProperty(value = "eventTime", required = true)
    private DateTime eventTime;

    /**
     * The record type. Possible values include: 'NotSpecified', 'Custom',
     * 'AS2Message', 'AS2MDN', 'X12Interchange', 'X12FunctionalGroup',
     * 'X12TransactionSet', 'X12InterchangeAcknowledgment',
     * 'X12FunctionalGroupAcknowledgment', 'X12TransactionSetAcknowledgment',
     * 'EdifactInterchange', 'EdifactFunctionalGroup', 'EdifactTransactionSet',
     * 'EdifactInterchangeAcknowledgment',
     * 'EdifactFunctionalGroupAcknowledgment',
     * 'EdifactTransactionSetAcknowledgment'.
     */
    @JsonProperty(value = "recordType", required = true)
    private TrackingRecordType recordType;

    /**
     * The record.
     */
    @JsonProperty(value = "record")
    private Object record;

    /**
     * The error.
     */
    @JsonProperty(value = "error")
    private TrackingEventErrorInfo error;

    /**
     * Get the event level. Possible values include: 'LogAlways', 'Critical', 'Error', 'Warning', 'Informational', 'Verbose'.
     *
     * @return the eventLevel value
     */
    public EventLevel eventLevel() {
        return this.eventLevel;
    }

    /**
     * Set the event level. Possible values include: 'LogAlways', 'Critical', 'Error', 'Warning', 'Informational', 'Verbose'.
     *
     * @param eventLevel the eventLevel value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withEventLevel(EventLevel eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * Get the event time.
     *
     * @return the eventTime value
     */
    public DateTime eventTime() {
        return this.eventTime;
    }

    /**
     * Set the event time.
     *
     * @param eventTime the eventTime value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withEventTime(DateTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get the record type. Possible values include: 'NotSpecified', 'Custom', 'AS2Message', 'AS2MDN', 'X12Interchange', 'X12FunctionalGroup', 'X12TransactionSet', 'X12InterchangeAcknowledgment', 'X12FunctionalGroupAcknowledgment', 'X12TransactionSetAcknowledgment', 'EdifactInterchange', 'EdifactFunctionalGroup', 'EdifactTransactionSet', 'EdifactInterchangeAcknowledgment', 'EdifactFunctionalGroupAcknowledgment', 'EdifactTransactionSetAcknowledgment'.
     *
     * @return the recordType value
     */
    public TrackingRecordType recordType() {
        return this.recordType;
    }

    /**
     * Set the record type. Possible values include: 'NotSpecified', 'Custom', 'AS2Message', 'AS2MDN', 'X12Interchange', 'X12FunctionalGroup', 'X12TransactionSet', 'X12InterchangeAcknowledgment', 'X12FunctionalGroupAcknowledgment', 'X12TransactionSetAcknowledgment', 'EdifactInterchange', 'EdifactFunctionalGroup', 'EdifactTransactionSet', 'EdifactInterchangeAcknowledgment', 'EdifactFunctionalGroupAcknowledgment', 'EdifactTransactionSetAcknowledgment'.
     *
     * @param recordType the recordType value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withRecordType(TrackingRecordType recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get the record.
     *
     * @return the record value
     */
    public Object record() {
        return this.record;
    }

    /**
     * Set the record.
     *
     * @param record the record value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withRecord(Object record) {
        this.record = record;
        return this;
    }

    /**
     * Get the error.
     *
     * @return the error value
     */
    public TrackingEventErrorInfo error() {
        return this.error;
    }

    /**
     * Set the error.
     *
     * @param error the error value to set
     * @return the TrackingEvent object itself.
     */
    public TrackingEvent withError(TrackingEventErrorInfo error) {
        this.error = error;
        return this;
    }

}
