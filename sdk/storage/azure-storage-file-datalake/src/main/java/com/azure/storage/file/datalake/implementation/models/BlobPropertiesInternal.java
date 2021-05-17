// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** Properties of a blob. */
@JacksonXmlRootElement(localName = "Properties")
@Fluent
public final class BlobPropertiesInternal {
    /*
     * The Creation-Time property.
     */
    @JsonProperty(value = "Creation-Time")
    private DateTimeRfc1123 creationTime;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified", required = true)
    private DateTimeRfc1123 lastModified;

    /*
     * The Etag property.
     */
    @JsonProperty(value = "Etag", required = true)
    private String etag;

    /*
     * Size in bytes
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The Content-Type property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * The Content-Encoding property.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * The Content-Language property.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * The Content-MD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * The Content-Disposition property.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * The Cache-Control property.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * The x-ms-blob-sequence-number property.
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private Long blobSequenceNumber;

    /*
     * The CopyId property.
     */
    @JsonProperty(value = "CopyId")
    private String copyId;

    /*
     * The CopySource property.
     */
    @JsonProperty(value = "CopySource")
    private String copySource;

    /*
     * The CopyProgress property.
     */
    @JsonProperty(value = "CopyProgress")
    private String copyProgress;

    /*
     * The CopyCompletionTime property.
     */
    @JsonProperty(value = "CopyCompletionTime")
    private DateTimeRfc1123 copyCompletionTime;

    /*
     * The CopyStatusDescription property.
     */
    @JsonProperty(value = "CopyStatusDescription")
    private String copyStatusDescription;

    /*
     * The ServerEncrypted property.
     */
    @JsonProperty(value = "ServerEncrypted")
    private Boolean serverEncrypted;

    /*
     * The IncrementalCopy property.
     */
    @JsonProperty(value = "IncrementalCopy")
    private Boolean incrementalCopy;

    /*
     * The DestinationSnapshot property.
     */
    @JsonProperty(value = "DestinationSnapshot")
    private String destinationSnapshot;

    /*
     * The DeletedTime property.
     */
    @JsonProperty(value = "DeletedTime")
    private DateTimeRfc1123 deletedTime;

    /*
     * The RemainingRetentionDays property.
     */
    @JsonProperty(value = "RemainingRetentionDays")
    private Integer remainingRetentionDays;

    /*
     * The AccessTierInferred property.
     */
    @JsonProperty(value = "AccessTierInferred")
    private Boolean accessTierInferred;

    /*
     * The CustomerProvidedKeySha256 property.
     */
    @JsonProperty(value = "CustomerProvidedKeySha256")
    private String customerProvidedKeySha256;

    /*
     * The name of the encryption scope under which the blob is encrypted.
     */
    @JsonProperty(value = "EncryptionScope")
    private String encryptionScope;

    /*
     * The AccessTierChangeTime property.
     */
    @JsonProperty(value = "AccessTierChangeTime")
    private DateTimeRfc1123 accessTierChangeTime;

    /*
     * The TagCount property.
     */
    @JsonProperty(value = "TagCount")
    private Integer tagCount;

    /*
     * The Expiry-Time property.
     */
    @JsonProperty(value = "Expiry-Time")
    private DateTimeRfc1123 expiresOn;

    /*
     * The Sealed property.
     */
    @JsonProperty(value = "Sealed")
    private Boolean isSealed;

    /*
     * The LastAccessTime property.
     */
    @JsonProperty(value = "LastAccessTime")
    private DateTimeRfc1123 lastAccessedOn;

    /*
     * The DeleteTime property.
     */
    @JsonProperty(value = "DeleteTime")
    private DateTimeRfc1123 deleteTime;

    /**
     * Get the creationTime property: The Creation-Time property.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        if (this.creationTime == null) {
            return null;
        }
        return this.creationTime.getDateTime();
    }

    /**
     * Set the creationTime property: The Creation-Time property.
     *
     * @param creationTime the creationTime value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCreationTime(OffsetDateTime creationTime) {
        if (creationTime == null) {
            this.creationTime = null;
        } else {
            this.creationTime = new DateTimeRfc1123(creationTime);
        }
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
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the etag property: The Etag property.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag property.
     *
     * @param etag the etag value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the contentLength property: Size in bytes.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: Size in bytes.
     *
     * @param contentLength the contentLength value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType property: The Content-Type property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     *
     * @param contentType the contentType value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentEncoding property: The Content-Encoding property.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The Content-Encoding property.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLanguage property: The Content-Language property.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The Content-Language property.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
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
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the contentDisposition property: The Content-Disposition property.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The Content-Disposition property.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the cacheControl property: The Cache-Control property.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The Cache-Control property.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the blobSequenceNumber property: The x-ms-blob-sequence-number property.
     *
     * @return the blobSequenceNumber value.
     */
    public Long getBlobSequenceNumber() {
        return this.blobSequenceNumber;
    }

    /**
     * Set the blobSequenceNumber property: The x-ms-blob-sequence-number property.
     *
     * @param blobSequenceNumber the blobSequenceNumber value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setBlobSequenceNumber(Long blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
        return this;
    }

    /**
     * Get the copyId property: The CopyId property.
     *
     * @return the copyId value.
     */
    public String getCopyId() {
        return this.copyId;
    }

    /**
     * Set the copyId property: The CopyId property.
     *
     * @param copyId the copyId value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCopyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copySource property: The CopySource property.
     *
     * @return the copySource value.
     */
    public String getCopySource() {
        return this.copySource;
    }

    /**
     * Set the copySource property: The CopySource property.
     *
     * @param copySource the copySource value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * Get the copyProgress property: The CopyProgress property.
     *
     * @return the copyProgress value.
     */
    public String getCopyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress property: The CopyProgress property.
     *
     * @param copyProgress the copyProgress value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCopyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
        return this;
    }

    /**
     * Get the copyCompletionTime property: The CopyCompletionTime property.
     *
     * @return the copyCompletionTime value.
     */
    public OffsetDateTime getCopyCompletionTime() {
        if (this.copyCompletionTime == null) {
            return null;
        }
        return this.copyCompletionTime.getDateTime();
    }

    /**
     * Set the copyCompletionTime property: The CopyCompletionTime property.
     *
     * @param copyCompletionTime the copyCompletionTime value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCopyCompletionTime(OffsetDateTime copyCompletionTime) {
        if (copyCompletionTime == null) {
            this.copyCompletionTime = null;
        } else {
            this.copyCompletionTime = new DateTimeRfc1123(copyCompletionTime);
        }
        return this;
    }

    /**
     * Get the copyStatusDescription property: The CopyStatusDescription property.
     *
     * @return the copyStatusDescription value.
     */
    public String getCopyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription property: The CopyStatusDescription property.
     *
     * @param copyStatusDescription the copyStatusDescription value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCopyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the serverEncrypted property: The ServerEncrypted property.
     *
     * @return the serverEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.serverEncrypted;
    }

    /**
     * Set the serverEncrypted property: The ServerEncrypted property.
     *
     * @param serverEncrypted the serverEncrypted value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setServerEncrypted(Boolean serverEncrypted) {
        this.serverEncrypted = serverEncrypted;
        return this;
    }

    /**
     * Get the incrementalCopy property: The IncrementalCopy property.
     *
     * @return the incrementalCopy value.
     */
    public Boolean isIncrementalCopy() {
        return this.incrementalCopy;
    }

    /**
     * Set the incrementalCopy property: The IncrementalCopy property.
     *
     * @param incrementalCopy the incrementalCopy value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setIncrementalCopy(Boolean incrementalCopy) {
        this.incrementalCopy = incrementalCopy;
        return this;
    }

    /**
     * Get the destinationSnapshot property: The DestinationSnapshot property.
     *
     * @return the destinationSnapshot value.
     */
    public String getDestinationSnapshot() {
        return this.destinationSnapshot;
    }

    /**
     * Set the destinationSnapshot property: The DestinationSnapshot property.
     *
     * @param destinationSnapshot the destinationSnapshot value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setDestinationSnapshot(String destinationSnapshot) {
        this.destinationSnapshot = destinationSnapshot;
        return this;
    }

    /**
     * Get the deletedTime property: The DeletedTime property.
     *
     * @return the deletedTime value.
     */
    public OffsetDateTime getDeletedTime() {
        if (this.deletedTime == null) {
            return null;
        }
        return this.deletedTime.getDateTime();
    }

    /**
     * Set the deletedTime property: The DeletedTime property.
     *
     * @param deletedTime the deletedTime value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setDeletedTime(OffsetDateTime deletedTime) {
        if (deletedTime == null) {
            this.deletedTime = null;
        } else {
            this.deletedTime = new DateTimeRfc1123(deletedTime);
        }
        return this;
    }

    /**
     * Get the remainingRetentionDays property: The RemainingRetentionDays property.
     *
     * @return the remainingRetentionDays value.
     */
    public Integer getRemainingRetentionDays() {
        return this.remainingRetentionDays;
    }

    /**
     * Set the remainingRetentionDays property: The RemainingRetentionDays property.
     *
     * @param remainingRetentionDays the remainingRetentionDays value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setRemainingRetentionDays(Integer remainingRetentionDays) {
        this.remainingRetentionDays = remainingRetentionDays;
        return this;
    }

    /**
     * Get the accessTierInferred property: The AccessTierInferred property.
     *
     * @return the accessTierInferred value.
     */
    public Boolean isAccessTierInferred() {
        return this.accessTierInferred;
    }

    /**
     * Set the accessTierInferred property: The AccessTierInferred property.
     *
     * @param accessTierInferred the accessTierInferred value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setAccessTierInferred(Boolean accessTierInferred) {
        this.accessTierInferred = accessTierInferred;
        return this;
    }

    /**
     * Get the customerProvidedKeySha256 property: The CustomerProvidedKeySha256 property.
     *
     * @return the customerProvidedKeySha256 value.
     */
    public String getCustomerProvidedKeySha256() {
        return this.customerProvidedKeySha256;
    }

    /**
     * Set the customerProvidedKeySha256 property: The CustomerProvidedKeySha256 property.
     *
     * @param customerProvidedKeySha256 the customerProvidedKeySha256 value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setCustomerProvidedKeySha256(String customerProvidedKeySha256) {
        this.customerProvidedKeySha256 = customerProvidedKeySha256;
        return this;
    }

    /**
     * Get the encryptionScope property: The name of the encryption scope under which the blob is encrypted.
     *
     * @return the encryptionScope value.
     */
    public String getEncryptionScope() {
        return this.encryptionScope;
    }

    /**
     * Set the encryptionScope property: The name of the encryption scope under which the blob is encrypted.
     *
     * @param encryptionScope the encryptionScope value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setEncryptionScope(String encryptionScope) {
        this.encryptionScope = encryptionScope;
        return this;
    }

    /**
     * Get the accessTierChangeTime property: The AccessTierChangeTime property.
     *
     * @return the accessTierChangeTime value.
     */
    public OffsetDateTime getAccessTierChangeTime() {
        if (this.accessTierChangeTime == null) {
            return null;
        }
        return this.accessTierChangeTime.getDateTime();
    }

    /**
     * Set the accessTierChangeTime property: The AccessTierChangeTime property.
     *
     * @param accessTierChangeTime the accessTierChangeTime value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setAccessTierChangeTime(OffsetDateTime accessTierChangeTime) {
        if (accessTierChangeTime == null) {
            this.accessTierChangeTime = null;
        } else {
            this.accessTierChangeTime = new DateTimeRfc1123(accessTierChangeTime);
        }
        return this;
    }

    /**
     * Get the tagCount property: The TagCount property.
     *
     * @return the tagCount value.
     */
    public Integer getTagCount() {
        return this.tagCount;
    }

    /**
     * Set the tagCount property: The TagCount property.
     *
     * @param tagCount the tagCount value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }

    /**
     * Get the expiresOn property: The Expiry-Time property.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime getExpiresOn() {
        if (this.expiresOn == null) {
            return null;
        }
        return this.expiresOn.getDateTime();
    }

    /**
     * Set the expiresOn property: The Expiry-Time property.
     *
     * @param expiresOn the expiresOn value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setExpiresOn(OffsetDateTime expiresOn) {
        if (expiresOn == null) {
            this.expiresOn = null;
        } else {
            this.expiresOn = new DateTimeRfc1123(expiresOn);
        }
        return this;
    }

    /**
     * Get the isSealed property: The Sealed property.
     *
     * @return the isSealed value.
     */
    public Boolean isSealed() {
        return this.isSealed;
    }

    /**
     * Set the isSealed property: The Sealed property.
     *
     * @param isSealed the isSealed value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setIsSealed(Boolean isSealed) {
        this.isSealed = isSealed;
        return this;
    }

    /**
     * Get the lastAccessedOn property: The LastAccessTime property.
     *
     * @return the lastAccessedOn value.
     */
    public OffsetDateTime getLastAccessedOn() {
        if (this.lastAccessedOn == null) {
            return null;
        }
        return this.lastAccessedOn.getDateTime();
    }

    /**
     * Set the lastAccessedOn property: The LastAccessTime property.
     *
     * @param lastAccessedOn the lastAccessedOn value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setLastAccessedOn(OffsetDateTime lastAccessedOn) {
        if (lastAccessedOn == null) {
            this.lastAccessedOn = null;
        } else {
            this.lastAccessedOn = new DateTimeRfc1123(lastAccessedOn);
        }
        return this;
    }

    /**
     * Get the deleteTime property: The DeleteTime property.
     *
     * @return the deleteTime value.
     */
    public OffsetDateTime getDeleteTime() {
        if (this.deleteTime == null) {
            return null;
        }
        return this.deleteTime.getDateTime();
    }

    /**
     * Set the deleteTime property: The DeleteTime property.
     *
     * @param deleteTime the deleteTime value to set.
     * @return the BlobPropertiesInternal object itself.
     */
    public BlobPropertiesInternal setDeleteTime(OffsetDateTime deleteTime) {
        if (deleteTime == null) {
            this.deleteTime = null;
        } else {
            this.deleteTime = new DateTimeRfc1123(deleteTime);
        }
        return this;
    }
}
