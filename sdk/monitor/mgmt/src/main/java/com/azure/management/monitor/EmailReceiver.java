// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EmailReceiver model. */
@Fluent
public final class EmailReceiver {
    /*
     * The name of the email receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The email address of this receiver.
     */
    @JsonProperty(value = "emailAddress", required = true)
    private String emailAddress;

    /*
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema", required = true)
    private boolean useCommonAlertSchema;

    /*
     * The receiver status of the e-mail.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ReceiverStatus status;

    /**
     * Get the name property: The name of the email receiver. Names must be unique across all receivers within an action
     * group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the email receiver. Names must be unique across all receivers within an action
     * group.
     *
     * @param name the name value to set.
     * @return the EmailReceiver object itself.
     */
    public EmailReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the emailAddress property: The email address of this receiver.
     *
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: The email address of this receiver.
     *
     * @param emailAddress the emailAddress value to set.
     * @return the EmailReceiver object itself.
     */
    public EmailReceiver withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value.
     */
    public boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set.
     * @return the EmailReceiver object itself.
     */
    public EmailReceiver withUseCommonAlertSchema(boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Get the status property: The receiver status of the e-mail.
     *
     * @return the status value.
     */
    public ReceiverStatus status() {
        return this.status;
    }
}
