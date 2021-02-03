// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SendSmsOptions model. */
@Fluent
public final class SendSmsOptions {
    /*
     * Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     */
    @JsonProperty(value = "enableDeliveryReport")
    private Boolean enableDeliveryReport;

    /*
     * Use this field to provide metadata that will then be sent back in the
     * corresponding Delivery Report.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the enableDeliveryReport property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     *
     * @return the enableDeliveryReport value.
     */
    public Boolean isDeliveryReportEnabled() {
        return this.enableDeliveryReport;
    }

    /**
     * Set the enableDeliveryReport property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     *
     * @param enableDeliveryReport the enableDeliveryReport value to set.
     * @return the SendSmsOptions object itself.
     */
    public SendSmsOptions setEnableDeliveryReportEnabled(Boolean enableDeliveryReport) {
        this.enableDeliveryReport = enableDeliveryReport;
        return this;
    }

    /**
     * Get the tag property: Use this field to provide metadata that will then be sent back in the corresponding
     * Delivery Report.
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: Use this field to provide metadata that will then be sent back in the corresponding
     * Delivery Report.
     *
     * @param tag the tag value to set.
     * @return the SendSmsOptions object itself.
     */
    public SendSmsOptions setTag(String tag) {
        this.tag = tag;
        return this;
    }
}
