// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.common;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CommunicationIdentifierModel model. */
@Fluent
public final class CommunicationIdentifierModel {
    /*
     * Raw Id of the identifier. Optional in requests, required in responses.
     */
    @JsonProperty(value = "rawId")
    private String rawId;

    /*
     * The communication user.
     */
    @JsonProperty(value = "communicationUser")
    private CommunicationUserIdentifierModel communicationUser;

    /*
     * The phone number.
     */
    @JsonProperty(value = "phoneNumber")
    private PhoneNumberIdentifierModel phoneNumber;

    /*
     * The Microsoft Teams user.
     */
    @JsonProperty(value = "microsoftTeamsUser")
    private MicrosoftTeamsUserIdentifierModel microsoftTeamsUser;

    /**
     * Get the rawId property: Raw Id of the identifier. Optional in requests, required in responses.
     *
     * @return the rawId value.
     */
    public String getRawId() {
        return this.rawId;
    }

    /**
     * Set the rawId property: Raw Id of the identifier. Optional in requests, required in responses.
     *
     * @param rawId the rawId value to set.
     * @return the CommunicationIdentifierModel object itself.
     */
    public CommunicationIdentifierModel setRawId(String rawId) {
        this.rawId = rawId;
        return this;
    }

    /**
     * Get the communicationUser property: The communication user.
     *
     * @return the communicationUser value.
     */
    public CommunicationUserIdentifierModel getCommunicationUser() {
        return this.communicationUser;
    }

    /**
     * Set the communicationUser property: The communication user.
     *
     * @param communicationUser the communicationUser value to set.
     * @return the CommunicationIdentifierModel object itself.
     */
    public CommunicationIdentifierModel setCommunicationUser(CommunicationUserIdentifierModel communicationUser) {
        this.communicationUser = communicationUser;
        return this;
    }

    /**
     * Get the phoneNumber property: The phone number.
     *
     * @return the phoneNumber value.
     */
    public PhoneNumberIdentifierModel getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: The phone number.
     *
     * @param phoneNumber the phoneNumber value to set.
     * @return the CommunicationIdentifierModel object itself.
     */
    public CommunicationIdentifierModel setPhoneNumber(PhoneNumberIdentifierModel phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get the microsoftTeamsUser property: The Microsoft Teams user.
     *
     * @return the microsoftTeamsUser value.
     */
    public MicrosoftTeamsUserIdentifierModel getMicrosoftTeamsUser() {
        return this.microsoftTeamsUser;
    }

    /**
     * Set the microsoftTeamsUser property: The Microsoft Teams user.
     *
     * @param microsoftTeamsUser the microsoftTeamsUser value to set.
     * @return the CommunicationIdentifierModel object itself.
     */
    public CommunicationIdentifierModel setMicrosoftTeamsUser(MicrosoftTeamsUserIdentifierModel microsoftTeamsUser) {
        this.microsoftTeamsUser = microsoftTeamsUser;
        return this;
    }
}
