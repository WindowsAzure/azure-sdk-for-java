// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** SSL certificate email. */
@JsonFlatten
@Fluent
public class CertificateEmailInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateEmailInner.class);

    /*
     * Email id.
     */
    @JsonProperty(value = "properties.emailId")
    private String emailId;

    /*
     * Time stamp.
     */
    @JsonProperty(value = "properties.timeStamp")
    private OffsetDateTime timestamp;

    /**
     * Get the emailId property: Email id.
     *
     * @return the emailId value.
     */
    public String emailId() {
        return this.emailId;
    }

    /**
     * Set the emailId property: Email id.
     *
     * @param emailId the emailId value to set.
     * @return the CertificateEmailInner object itself.
     */
    public CertificateEmailInner withEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    /**
     * Get the timestamp property: Time stamp.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: Time stamp.
     *
     * @param timestamp the timestamp value to set.
     * @return the CertificateEmailInner object itself.
     */
    public CertificateEmailInner withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CertificateEmailInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
