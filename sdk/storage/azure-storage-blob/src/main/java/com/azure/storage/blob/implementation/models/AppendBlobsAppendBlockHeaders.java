// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The AppendBlobsAppendBlockHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class AppendBlobsAppendBlockHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-content-crc64 property.
     */
    @JsonProperty(value = "x-ms-content-crc64")
    private byte[] xMsContentCrc64;

    /*
     * The x-ms-blob-committed-block-count property.
     */
    @JsonProperty(value = "x-ms-blob-committed-block-count")
    private Integer xMsBlobCommittedBlockCount;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-encryption-key-sha256 property.
     */
    @JsonProperty(value = "x-ms-encryption-key-sha256")
    private String xMsEncryptionKeySha256;

    /*
     * The x-ms-request-server-encrypted property.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean xMsRequestServerEncrypted;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The Content-MD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The x-ms-blob-append-offset property.
     */
    @JsonProperty(value = "x-ms-blob-append-offset")
    private String xMsBlobAppendOffset;

    /*
     * The x-ms-encryption-scope property.
     */
    @JsonProperty(value = "x-ms-encryption-scope")
    private String xMsEncryptionScope;

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsContentCrc64 property: The x-ms-content-crc64 property.
     *
     * @return the xMsContentCrc64 value.
     */
    public byte[] getXMsContentCrc64() {
        return CoreUtils.clone(this.xMsContentCrc64);
    }

    /**
     * Set the xMsContentCrc64 property: The x-ms-content-crc64 property.
     *
     * @param xMsContentCrc64 the xMsContentCrc64 value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsContentCrc64(byte[] xMsContentCrc64) {
        this.xMsContentCrc64 = CoreUtils.clone(xMsContentCrc64);
        return this;
    }

    /**
     * Get the xMsBlobCommittedBlockCount property: The x-ms-blob-committed-block-count property.
     *
     * @return the xMsBlobCommittedBlockCount value.
     */
    public Integer getXMsBlobCommittedBlockCount() {
        return this.xMsBlobCommittedBlockCount;
    }

    /**
     * Set the xMsBlobCommittedBlockCount property: The x-ms-blob-committed-block-count property.
     *
     * @param xMsBlobCommittedBlockCount the xMsBlobCommittedBlockCount value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsBlobCommittedBlockCount(Integer xMsBlobCommittedBlockCount) {
        this.xMsBlobCommittedBlockCount = xMsBlobCommittedBlockCount;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @return the xMsEncryptionKeySha256 value.
     */
    public String getXMsEncryptionKeySha256() {
        return this.xMsEncryptionKeySha256;
    }

    /**
     * Set the xMsEncryptionKeySha256 property: The x-ms-encryption-key-sha256 property.
     *
     * @param xMsEncryptionKeySha256 the xMsEncryptionKeySha256 value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
        return this;
    }

    /**
     * Get the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @return the xMsRequestServerEncrypted value.
     */
    public Boolean isXMsRequestServerEncrypted() {
        return this.xMsRequestServerEncrypted;
    }

    /**
     * Set the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     *
     * @param xMsRequestServerEncrypted the xMsRequestServerEncrypted value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     *
     * @return the contentMD5 value.
     */
    public byte[] getContentMD5() {
        return CoreUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the xMsBlobAppendOffset property: The x-ms-blob-append-offset property.
     *
     * @return the xMsBlobAppendOffset value.
     */
    public String getXMsBlobAppendOffset() {
        return this.xMsBlobAppendOffset;
    }

    /**
     * Set the xMsBlobAppendOffset property: The x-ms-blob-append-offset property.
     *
     * @param xMsBlobAppendOffset the xMsBlobAppendOffset value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsBlobAppendOffset(String xMsBlobAppendOffset) {
        this.xMsBlobAppendOffset = xMsBlobAppendOffset;
        return this;
    }

    /**
     * Get the xMsEncryptionScope property: The x-ms-encryption-scope property.
     *
     * @return the xMsEncryptionScope value.
     */
    public String getXMsEncryptionScope() {
        return this.xMsEncryptionScope;
    }

    /**
     * Set the xMsEncryptionScope property: The x-ms-encryption-scope property.
     *
     * @param xMsEncryptionScope the xMsEncryptionScope value to set.
     * @return the AppendBlobsAppendBlockHeaders object itself.
     */
    public AppendBlobsAppendBlockHeaders setXMsEncryptionScope(String xMsEncryptionScope) {
        this.xMsEncryptionScope = xMsEncryptionScope;
        return this;
    }
}
