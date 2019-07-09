// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * A user delegation key.
 */
@JacksonXmlRootElement(localName = "UserDelegationKey")
public final class UserDelegationKey {
    /*
     * The Azure Active Directory object ID in GUID format.
     */
    @JsonProperty(value = "SignedOid", required = true)
    private String signedOid;

    /*
     * The Azure Active Directory tenant ID in GUID format
     */
    @JsonProperty(value = "SignedTid", required = true)
    private String signedTid;

    /*
     * The date-time the key is active
     */
    @JsonProperty(value = "SignedStart", required = true)
    private OffsetDateTime signedStart;

    /*
     * The date-time the key expires
     */
    @JsonProperty(value = "SignedExpiry", required = true)
    private OffsetDateTime signedExpiry;

    /*
     * Abbreviation of the Azure Storage service that accepts the key
     */
    @JsonProperty(value = "SignedService", required = true)
    private String signedService;

    /*
     * The service version that created the key
     */
    @JsonProperty(value = "SignedVersion", required = true)
    private String signedVersion;

    /*
     * The key as a base64 string
     */
    @JsonProperty(value = "Value", required = true)
    private String value;

    /**
     * Get the signedOid property: The Azure Active Directory object ID in GUID
     * format.
     *
     * @return the signedOid value.
     */
    public String signedOid() {
        return this.signedOid;
    }

    /**
     * Set the signedOid property: The Azure Active Directory object ID in GUID
     * format.
     *
     * @param signedOid the signedOid value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey signedOid(String signedOid) {
        this.signedOid = signedOid;
        return this;
    }

    /**
     * Get the signedTid property: The Azure Active Directory tenant ID in GUID
     * format.
     *
     * @return the signedTid value.
     */
    public String signedTid() {
        return this.signedTid;
    }

    /**
     * Set the signedTid property: The Azure Active Directory tenant ID in GUID
     * format.
     *
     * @param signedTid the signedTid value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey signedTid(String signedTid) {
        this.signedTid = signedTid;
        return this;
    }

    /**
     * Get the signedStart property: The date-time the key is active.
     *
     * @return the signedStart value.
     */
    public OffsetDateTime signedStart() {
        return this.signedStart;
    }

    /**
     * Set the signedStart property: The date-time the key is active.
     *
     * @param signedStart the signedStart value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey signedStart(OffsetDateTime signedStart) {
        this.signedStart = signedStart;
        return this;
    }

    /**
     * Get the signedExpiry property: The date-time the key expires.
     *
     * @return the signedExpiry value.
     */
    public OffsetDateTime signedExpiry() {
        return this.signedExpiry;
    }

    /**
     * Set the signedExpiry property: The date-time the key expires.
     *
     * @param signedExpiry the signedExpiry value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey signedExpiry(OffsetDateTime signedExpiry) {
        this.signedExpiry = signedExpiry;
        return this;
    }

    /**
     * Get the signedService property: Abbreviation of the Azure Storage
     * service that accepts the key.
     *
     * @return the signedService value.
     */
    public String signedService() {
        return this.signedService;
    }

    /**
     * Set the signedService property: Abbreviation of the Azure Storage
     * service that accepts the key.
     *
     * @param signedService the signedService value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey signedService(String signedService) {
        this.signedService = signedService;
        return this;
    }

    /**
     * Get the signedVersion property: The service version that created the
     * key.
     *
     * @return the signedVersion value.
     */
    public String signedVersion() {
        return this.signedVersion;
    }

    /**
     * Set the signedVersion property: The service version that created the
     * key.
     *
     * @param signedVersion the signedVersion value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey signedVersion(String signedVersion) {
        this.signedVersion = signedVersion;
        return this;
    }

    /**
     * Get the value property: The key as a base64 string.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The key as a base64 string.
     *
     * @param value the value value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey value(String value) {
        this.value = value;
        return this;
    }
}
