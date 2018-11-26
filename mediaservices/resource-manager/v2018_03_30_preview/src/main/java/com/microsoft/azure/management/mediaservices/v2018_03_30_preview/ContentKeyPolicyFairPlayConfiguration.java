/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies a configuration for FairPlay licenses.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyFairPlayConfiguration")
public class ContentKeyPolicyFairPlayConfiguration extends ContentKeyPolicyConfiguration {
    /**
     * The key that must be used as FairPlay ASk.
     */
    @JsonProperty(value = "ask", required = true)
    private byte[] ask;

    /**
     * The password encrypting FairPlay certificate in PKCS 12 (pfx) format.
     */
    @JsonProperty(value = "fairPlayPfxPassword", required = true)
    private String fairPlayPfxPassword;

    /**
     * The Base64 representation of FairPlay certificate in PKCS 12 (pfx)
     * format (including private key).
     */
    @JsonProperty(value = "fairPlayPfx", required = true)
    private String fairPlayPfx;

    /**
     * The rental and lease key type. Possible values include: 'Unknown',
     * 'Undefined', 'PersistentUnlimited', 'PersistentLimited'.
     */
    @JsonProperty(value = "rentalAndLeaseKeyType", required = true)
    private ContentKeyPolicyFairPlayRentalAndLeaseKeyType rentalAndLeaseKeyType;

    /**
     * The rental duration. Must be greater than or equal to 0.
     */
    @JsonProperty(value = "rentalDuration", required = true)
    private long rentalDuration;

    /**
     * Get the key that must be used as FairPlay ASk.
     *
     * @return the ask value
     */
    public byte[] ask() {
        return this.ask;
    }

    /**
     * Set the key that must be used as FairPlay ASk.
     *
     * @param ask the ask value to set
     * @return the ContentKeyPolicyFairPlayConfiguration object itself.
     */
    public ContentKeyPolicyFairPlayConfiguration withAsk(byte[] ask) {
        this.ask = ask;
        return this;
    }

    /**
     * Get the password encrypting FairPlay certificate in PKCS 12 (pfx) format.
     *
     * @return the fairPlayPfxPassword value
     */
    public String fairPlayPfxPassword() {
        return this.fairPlayPfxPassword;
    }

    /**
     * Set the password encrypting FairPlay certificate in PKCS 12 (pfx) format.
     *
     * @param fairPlayPfxPassword the fairPlayPfxPassword value to set
     * @return the ContentKeyPolicyFairPlayConfiguration object itself.
     */
    public ContentKeyPolicyFairPlayConfiguration withFairPlayPfxPassword(String fairPlayPfxPassword) {
        this.fairPlayPfxPassword = fairPlayPfxPassword;
        return this;
    }

    /**
     * Get the Base64 representation of FairPlay certificate in PKCS 12 (pfx) format (including private key).
     *
     * @return the fairPlayPfx value
     */
    public String fairPlayPfx() {
        return this.fairPlayPfx;
    }

    /**
     * Set the Base64 representation of FairPlay certificate in PKCS 12 (pfx) format (including private key).
     *
     * @param fairPlayPfx the fairPlayPfx value to set
     * @return the ContentKeyPolicyFairPlayConfiguration object itself.
     */
    public ContentKeyPolicyFairPlayConfiguration withFairPlayPfx(String fairPlayPfx) {
        this.fairPlayPfx = fairPlayPfx;
        return this;
    }

    /**
     * Get the rental and lease key type. Possible values include: 'Unknown', 'Undefined', 'PersistentUnlimited', 'PersistentLimited'.
     *
     * @return the rentalAndLeaseKeyType value
     */
    public ContentKeyPolicyFairPlayRentalAndLeaseKeyType rentalAndLeaseKeyType() {
        return this.rentalAndLeaseKeyType;
    }

    /**
     * Set the rental and lease key type. Possible values include: 'Unknown', 'Undefined', 'PersistentUnlimited', 'PersistentLimited'.
     *
     * @param rentalAndLeaseKeyType the rentalAndLeaseKeyType value to set
     * @return the ContentKeyPolicyFairPlayConfiguration object itself.
     */
    public ContentKeyPolicyFairPlayConfiguration withRentalAndLeaseKeyType(ContentKeyPolicyFairPlayRentalAndLeaseKeyType rentalAndLeaseKeyType) {
        this.rentalAndLeaseKeyType = rentalAndLeaseKeyType;
        return this;
    }

    /**
     * Get the rental duration. Must be greater than or equal to 0.
     *
     * @return the rentalDuration value
     */
    public long rentalDuration() {
        return this.rentalDuration;
    }

    /**
     * Set the rental duration. Must be greater than or equal to 0.
     *
     * @param rentalDuration the rentalDuration value to set
     * @return the ContentKeyPolicyFairPlayConfiguration object itself.
     */
    public ContentKeyPolicyFairPlayConfiguration withRentalDuration(long rentalDuration) {
        this.rentalDuration = rentalDuration;
        return this;
    }

}
