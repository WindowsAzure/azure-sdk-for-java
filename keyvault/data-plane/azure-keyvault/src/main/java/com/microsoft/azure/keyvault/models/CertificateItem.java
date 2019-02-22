// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The certificate item containing certificate metadata.
 */
public class CertificateItem {
    /**
     * Certificate identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The certificate management attributes.
     */
    @JsonProperty(value = "attributes")
    private CertificateAttributes attributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Thumbprint of the certificate.
     */
    @JsonProperty(value = "x5t")
    private Base64Url x509Thumbprint;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CertificateItem object itself.
     */
    public CertificateItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public CertificateAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes value.
     *
     * @param attributes the attributes value to set
     * @return the CertificateItem object itself.
     */
    public CertificateItem withAttributes(CertificateAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the CertificateItem object itself.
     */
    public CertificateItem withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the x509Thumbprint value.
     *
     * @return the x509Thumbprint value
     */
    public byte[] x509Thumbprint() {
        if (this.x509Thumbprint == null) {
            return null;
        }
        return this.x509Thumbprint.decodedBytes();
    }

    /**
     * Set the x509Thumbprint value.
     *
     * @param x509Thumbprint the x509Thumbprint value to set
     * @return the CertificateItem object itself.
     */
    public CertificateItem withX509Thumbprint(byte[] x509Thumbprint) {
        if (x509Thumbprint == null) {
            this.x509Thumbprint = null;
        } else {
            this.x509Thumbprint = Base64Url.encode(x509Thumbprint);
        }
        return this;
    }

}
