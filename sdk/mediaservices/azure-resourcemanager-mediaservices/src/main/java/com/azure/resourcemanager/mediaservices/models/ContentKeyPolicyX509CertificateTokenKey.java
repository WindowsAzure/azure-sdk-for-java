// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Specifies a certificate for token validation. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey")
@JsonFlatten
@Fluent
public class ContentKeyPolicyX509CertificateTokenKey extends ContentKeyPolicyRestrictionTokenKey {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContentKeyPolicyX509CertificateTokenKey.class);

    /*
     * The raw data field of a certificate in PKCS 12 format (X509Certificate2
     * in .NET)
     */
    @JsonProperty(value = "rawBody", required = true)
    private byte[] rawBody;

    /**
     * Get the rawBody property: The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET).
     *
     * @return the rawBody value.
     */
    public byte[] rawBody() {
        return CoreUtils.clone(this.rawBody);
    }

    /**
     * Set the rawBody property: The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET).
     *
     * @param rawBody the rawBody value to set.
     * @return the ContentKeyPolicyX509CertificateTokenKey object itself.
     */
    public ContentKeyPolicyX509CertificateTokenKey withRawBody(byte[] rawBody) {
        this.rawBody = CoreUtils.clone(rawBody);
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
        if (rawBody() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rawBody in model ContentKeyPolicyX509CertificateTokenKey"));
        }
    }
}
