// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.annotation.Fluent;
import com.azure.core.implementation.util.ImplUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for StageBlockFromURL operation.
 */
@JacksonXmlRootElement(localName = "BlockBlob-StageBlockFromURL-Headers")
@Fluent
public final class BlockBlobStageBlockFromURLHeaders {
    /*
     * This header is returned so that the client can check for message content
     * integrity. The value of this header is computed by the Blob service; it
     * is not necessarily the same value specified in the request headers.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * This header is returned so that the client can check for message content
     * integrity. The value of this header is computed by the Blob service; it
     * is not necessarily the same value specified in the request headers.
     */
    @JsonProperty(value = "x-ms-content-crc64")
    private byte[] xMsContentCrc64;

    /*
     * If a client request id header is sent in the request, this header will
     * be present in the response with the same value.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String clientRequestId;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The value of this header is set to true if the contents of the request
     * are successfully encrypted using the specified algorithm, and false
     * otherwise.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean isServerEncrypted;

    /*
     * The SHA-256 hash of the encryption key used to encrypt the block. This
     * header is only returned when the block was encrypted with a
     * customer-provided key.
     */
    @JsonProperty(value = "x-ms-encryption-key-sha256")
    private String encryptionKeySha256;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the contentMD5 property: This header is returned so that the client
     * can check for message content integrity. The value of this header is
     * computed by the Blob service; it is not necessarily the same value
     * specified in the request headers.
     *
     * @return the contentMD5 value.
     */
    public byte[] contentMD5() {
        return ImplUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: This header is returned so that the client
     * can check for message content integrity. The value of this header is
     * computed by the Blob service; it is not necessarily the same value
     * specified in the request headers.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders contentMD5(byte[] contentMD5) {
        this.contentMD5 = ImplUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the xMsContentCrc64 property: This header is returned so that the
     * client can check for message content integrity. The value of this header
     * is computed by the Blob service; it is not necessarily the same value
     * specified in the request headers.
     *
     * @return the xMsContentCrc64 value.
     */
    public byte[] xMsContentCrc64() {
        return ImplUtils.clone(this.xMsContentCrc64);
    }

    /**
     * Set the xMsContentCrc64 property: This header is returned so that the
     * client can check for message content integrity. The value of this header
     * is computed by the Blob service; it is not necessarily the same value
     * specified in the request headers.
     *
     * @param xMsContentCrc64 the xMsContentCrc64 value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders xMsContentCrc64(byte[] xMsContentCrc64) {
        this.xMsContentCrc64 = ImplUtils.clone(xMsContentCrc64);
        return this;
    }

    /**
     * Get the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @return the clientRequestId value.
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders clientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @param version the version value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders dateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the contents of the request are successfully encrypted using the
     * specified algorithm, and false otherwise.
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the contents of the request are successfully encrypted using the
     * specified algorithm, and false otherwise.
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders isServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the encryptionKeySha256 property: The SHA-256 hash of the encryption
     * key used to encrypt the block. This header is only returned when the
     * block was encrypted with a customer-provided key.
     *
     * @return the encryptionKeySha256 value.
     */
    public String encryptionKeySha256() {
        return this.encryptionKeySha256;
    }

    /**
     * Set the encryptionKeySha256 property: The SHA-256 hash of the encryption
     * key used to encrypt the block. This header is only returned when the
     * block was encrypted with a customer-provided key.
     *
     * @param encryptionKeySha256 the encryptionKeySha256 value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders encryptionKeySha256(String encryptionKeySha256) {
        this.encryptionKeySha256 = encryptionKeySha256;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the BlockBlobStageBlockFromURLHeaders object itself.
     */
    public BlockBlobStageBlockFromURLHeaders errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
