// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The contact information of the peer. */
@Fluent
public final class ContactInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContactInfo.class);

    /*
     * The list of email addresses.
     */
    @JsonProperty(value = "emails")
    private List<String> emails;

    /*
     * The list of contact numbers.
     */
    @JsonProperty(value = "phone")
    private List<String> phone;

    /**
     * Get the emails property: The list of email addresses.
     *
     * @return the emails value.
     */
    public List<String> emails() {
        return this.emails;
    }

    /**
     * Set the emails property: The list of email addresses.
     *
     * @param emails the emails value to set.
     * @return the ContactInfo object itself.
     */
    public ContactInfo withEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get the phone property: The list of contact numbers.
     *
     * @return the phone value.
     */
    public List<String> phone() {
        return this.phone;
    }

    /**
     * Set the phone property: The list of contact numbers.
     *
     * @param phone the phone value to set.
     * @return the ContactInfo object itself.
     */
    public ContactInfo withPhone(List<String> phone) {
        this.phone = phone;
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
