// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of an alert. */
@Fluent
public final class AlertProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertProperties.class);

    /*
     * A value indicating whether to send email to subscription administrator.
     */
    @JsonProperty(value = "sendToOwners")
    private String sendToOwners;

    /*
     * The custom email address for sending emails.
     */
    @JsonProperty(value = "customEmailAddresses")
    private List<String> customEmailAddresses;

    /*
     * The locale for the email notification.
     */
    @JsonProperty(value = "locale")
    private String locale;

    /**
     * Get the sendToOwners property: A value indicating whether to send email to subscription administrator.
     *
     * @return the sendToOwners value.
     */
    public String sendToOwners() {
        return this.sendToOwners;
    }

    /**
     * Set the sendToOwners property: A value indicating whether to send email to subscription administrator.
     *
     * @param sendToOwners the sendToOwners value to set.
     * @return the AlertProperties object itself.
     */
    public AlertProperties withSendToOwners(String sendToOwners) {
        this.sendToOwners = sendToOwners;
        return this;
    }

    /**
     * Get the customEmailAddresses property: The custom email address for sending emails.
     *
     * @return the customEmailAddresses value.
     */
    public List<String> customEmailAddresses() {
        return this.customEmailAddresses;
    }

    /**
     * Set the customEmailAddresses property: The custom email address for sending emails.
     *
     * @param customEmailAddresses the customEmailAddresses value to set.
     * @return the AlertProperties object itself.
     */
    public AlertProperties withCustomEmailAddresses(List<String> customEmailAddresses) {
        this.customEmailAddresses = customEmailAddresses;
        return this;
    }

    /**
     * Get the locale property: The locale for the email notification.
     *
     * @return the locale value.
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale property: The locale for the email notification.
     *
     * @param locale the locale value to set.
     * @return the AlertProperties object itself.
     */
    public AlertProperties withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
