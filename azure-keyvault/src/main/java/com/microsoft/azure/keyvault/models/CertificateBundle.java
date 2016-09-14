/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import com.microsoft.azure.keyvault.CertificateIdentifier;
import com.microsoft.azure.keyvault.KeyIdentifier;
import com.microsoft.azure.keyvault.SecretIdentifier;
import com.microsoft.azure.serializer.AzureJacksonMapperAdapter;
import com.microsoft.rest.Base64Url;

import java.io.IOException;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * A certificate bundle consists of a certificate (X509) plus its attributes.
 */
public class CertificateBundle {
    /**
     * The certificate id.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The key id.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String kid;

    /**
     * The secret id.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String sid;

    /**
     * Thumbprint of the certificate.
     */
    @JsonProperty(value = "x5t", access = JsonProperty.Access.WRITE_ONLY)
    private Base64Url x509Thumbprint;

    /**
     * The management policy.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private CertificatePolicy policy;

    /**
     * CER contents of x509 certificate.
     */
    private byte[] cer;

    /**
     * The content type of the secret.
     */
    private String contentType;

    /**
     * The certificate attributes.
     */
    private CertificateAttributes attributes;

    /**
     * Application-specific metadata in the form of key-value pairs.
     */
    private Map<String, String> tags;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the kid value.
     *
     * @return the kid value
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Get the sid value.
     *
     * @return the sid value
     */
    public String sid() {
        return this.sid;
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
        return this.x509Thumbprint.getDecodedBytes();
    }

    /**
     * Get the policy value.
     *
     * @return the policy value
     */
    public CertificatePolicy policy() {
        return this.policy;
    }

    /**
     * Get the cer value.
     *
     * @return the cer value
     */
    public byte[] cer() {
        return this.cer;
    }

    /**
     * Set the cer value.
     *
     * @param cer the cer value to set
     * @return the CertificateBundle object itself.
     */
    public CertificateBundle withCer(byte[] cer) {
        this.cer = cer;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the CertificateBundle object itself.
     */
    public CertificateBundle withContentType(String contentType) {
        this.contentType = contentType;
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
     * @return the CertificateBundle object itself.
     */
    public CertificateBundle withAttributes(CertificateAttributes attributes) {
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
     * @return the CertificateBundle object itself.
     */
    public CertificateBundle withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * The certificate identifier.
     * @return certificate identifier
     */
    public CertificateIdentifier certificateIdentifier() {
        if (id() == null || id().isEmpty()) {
            return null;
        }
        return new CertificateIdentifier(id());
    }

    /**
     * The secret identifier.
     * @return secret identifier
     */
    public SecretIdentifier secretIdentifier() {
        if (sid() == null || sid().isEmpty()) {
            return null;
        }
        return new SecretIdentifier(sid());
    }

    /**
     * The key identifier.
     * @return key identifier
     */
    public KeyIdentifier keyIdentifier() {
        if (kid() == null || kid().isEmpty()) {
            return null;
        }
        return new KeyIdentifier(kid());
    }

    @Override
    public String toString() {
        AzureJacksonMapperAdapter mapperAdapter = new AzureJacksonMapperAdapter();
        ObjectMapper mapper = mapperAdapter.getObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonGenerationException e) {
            throw new IllegalStateException(e);
        } catch (JsonMappingException e) {
            throw new IllegalStateException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
