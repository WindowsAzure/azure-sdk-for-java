// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import java.time.OffsetDateTime;

/**
 * A user delegation key.
 */
public final class UserDelegationKey {
    /*
     * The Azure Active Directory object ID in GUID format.
     */
    private String signedObjectId;

    /*
     * The Azure Active Directory tenant ID in GUID format
     */
    private String signedTenantId;

    /*
     * The date-time the key is active
     */
    private OffsetDateTime signedStart;

    /*
     * The date-time the key expires
     */
    private OffsetDateTime signedExpiry;

    /*
     * Abbreviation of the Azure Storage service that accepts the key
     */
    private String signedService;

    /*
     * The service version that created the key
     */
    private String signedVersion;

    /*
     * The key as a base64 string
     */
    private String value;

    /**
     * Get the signedObjectId property: The Azure Active Directory object ID in
     * GUID format.
     *
     * @return the signedObjectId value.
     */
    public String getSignedObjectId() {
        return this.signedObjectId;
    }

    /**
     * Set the signedObjectId property: The Azure Active Directory object ID in
     * GUID format.
     *
     * @param signedObjectId the signedObjectId value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey setSignedObjectId(String signedObjectId) {
        this.signedObjectId = signedObjectId;
        return this;
    }

    /**
     * Get the signedTenantId property: The Azure Active Directory tenant ID in
     * GUID format.
     *
     * @return the signedTenantId value.
     */
    public String getSignedTenantId() {
        return this.signedTenantId;
    }

    /**
     * Set the signedTenantId property: The Azure Active Directory tenant ID in
     * GUID format.
     *
     * @param signedTenantId the signedTenantId value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey setSignedTenantId(String signedTenantId) {
        this.signedTenantId = signedTenantId;
        return this;
    }

    /**
     * Get the signedStart property: The date-time the key is active.
     *
     * @return the signedStart value.
     */
    public OffsetDateTime getSignedStart() {
        return this.signedStart;
    }

    /**
     * Set the signedStart property: The date-time the key is active.
     *
     * @param signedStart the signedStart value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey setSignedStart(OffsetDateTime signedStart) {
        this.signedStart = signedStart;
        return this;
    }

    /**
     * Get the signedExpiry property: The date-time the key expires.
     *
     * @return the signedExpiry value.
     */
    public OffsetDateTime getSignedExpiry() {
        return this.signedExpiry;
    }

    /**
     * Set the signedExpiry property: The date-time the key expires.
     *
     * @param signedExpiry the signedExpiry value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey setSignedExpiry(OffsetDateTime signedExpiry) {
        this.signedExpiry = signedExpiry;
        return this;
    }

    /**
     * Get the signedService property: Abbreviation of the Azure Storage
     * service that accepts the key.
     *
     * @return the signedService value.
     */
    public String getSignedService() {
        return this.signedService;
    }

    /**
     * Set the signedService property: Abbreviation of the Azure Storage
     * service that accepts the key.
     *
     * @param signedService the signedService value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey setSignedService(String signedService) {
        this.signedService = signedService;
        return this;
    }

    /**
     * Get the signedVersion property: The service version that created the
     * key.
     *
     * @return the signedVersion value.
     */
    public String getSignedVersion() {
        return this.signedVersion;
    }

    /**
     * Set the signedVersion property: The service version that created the
     * key.
     *
     * @param signedVersion the signedVersion value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey setSignedVersion(String signedVersion) {
        this.signedVersion = signedVersion;
        return this;
    }

    /**
     * Get the value property: The key as a base64 string.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The key as a base64 string.
     *
     * @param value the value value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey setValue(String value) {
        this.value = value;
        return this;
    }
}
