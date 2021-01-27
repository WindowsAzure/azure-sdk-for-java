// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** passwordCredential. */
@Fluent
public final class MicrosoftGraphPasswordCredentialInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPasswordCredentialInner.class);

    /*
     * Do not use.
     */
    @JsonProperty(value = "customKeyIdentifier")
    private Base64Url customKeyIdentifier;

    /*
     * Friendly name for the password. Optional.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The date and time at which the password expires represented using ISO
     * 8601 format and is always in UTC time. For example, midnight UTC on Jan
     * 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Optional.
     */
    @JsonProperty(value = "endDateTime")
    private OffsetDateTime endDateTime;

    /*
     * Contains the first three characters of the password. Read-only.
     */
    @JsonProperty(value = "hint")
    private String hint;

    /*
     * The unique identifier for the password.
     */
    @JsonProperty(value = "keyId")
    private UUID keyId;

    /*
     * Read-only; Contains the strong passwords generated by Azure AD that are
     * 16-64 characters in length. The generated password value is only
     * returned during the initial POST request to addPassword. There is no way
     * to retrieve this password in the future.
     */
    @JsonProperty(value = "secretText")
    private String secretText;

    /*
     * The date and time at which the password becomes valid. The Timestamp
     * type represents date and time information using ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'. Optional.
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * passwordCredential
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the customKeyIdentifier property: Do not use.
     *
     * @return the customKeyIdentifier value.
     */
    public byte[] customKeyIdentifier() {
        if (this.customKeyIdentifier == null) {
            return null;
        }
        return this.customKeyIdentifier.decodedBytes();
    }

    /**
     * Set the customKeyIdentifier property: Do not use.
     *
     * @param customKeyIdentifier the customKeyIdentifier value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withCustomKeyIdentifier(byte[] customKeyIdentifier) {
        if (customKeyIdentifier == null) {
            this.customKeyIdentifier = null;
        } else {
            this.customKeyIdentifier = Base64Url.encode(CoreUtils.clone(customKeyIdentifier));
        }
        return this;
    }

    /**
     * Get the displayName property: Friendly name for the password. Optional.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Friendly name for the password. Optional.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the endDateTime property: The date and time at which the password expires represented using ISO 8601 format
     * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     * Optional.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: The date and time at which the password expires represented using ISO 8601 format
     * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     * Optional.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get the hint property: Contains the first three characters of the password. Read-only.
     *
     * @return the hint value.
     */
    public String hint() {
        return this.hint;
    }

    /**
     * Set the hint property: Contains the first three characters of the password. Read-only.
     *
     * @param hint the hint value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withHint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * Get the keyId property: The unique identifier for the password.
     *
     * @return the keyId value.
     */
    public UUID keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: The unique identifier for the password.
     *
     * @param keyId the keyId value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withKeyId(UUID keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the secretText property: Read-only; Contains the strong passwords generated by Azure AD that are 16-64
     * characters in length. The generated password value is only returned during the initial POST request to
     * addPassword. There is no way to retrieve this password in the future.
     *
     * @return the secretText value.
     */
    public String secretText() {
        return this.secretText;
    }

    /**
     * Set the secretText property: Read-only; Contains the strong passwords generated by Azure AD that are 16-64
     * characters in length. The generated password value is only returned during the initial POST request to
     * addPassword. There is no way to retrieve this password in the future.
     *
     * @param secretText the secretText value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withSecretText(String secretText) {
        this.secretText = secretText;
        return this;
    }

    /**
     * Get the startDateTime property: The date and time at which the password becomes valid. The Timestamp type
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Optional.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The date and time at which the password becomes valid. The Timestamp type
     * represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC
     * on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Optional.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: passwordCredential.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: passwordCredential.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPasswordCredentialInner object itself.
     */
    public MicrosoftGraphPasswordCredentialInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
