// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.ArchiveStatus;
import com.azure.storage.blob.models.BlobType;
import com.azure.storage.blob.models.CopyStatusType;
import com.azure.storage.blob.models.LeaseDurationType;
import com.azure.storage.blob.models.LeaseStateType;
import com.azure.storage.blob.models.LeaseStatusType;
import com.azure.storage.blob.models.RehydratePriority;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** Properties of a blob. */
@JacksonXmlRootElement(localName = "Properties")
@Fluent
public final class BlobItemPropertiesInternal {
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
    private String eTag;

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
    private byte[] contentMd5;

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
     * The BlobType property.
     */
    @JsonProperty(value = "BlobType")
    private BlobType blobType;

    /*
     * The LeaseStatus property.
     */
    @JsonProperty(value = "LeaseStatus")
    private LeaseStatusType leaseStatus;

    /*
     * The LeaseState property.
     */
    @JsonProperty(value = "LeaseState")
    private LeaseStateType leaseState;

    /*
     * The LeaseDuration property.
     */
    @JsonProperty(value = "LeaseDuration")
    private LeaseDurationType leaseDuration;

    /*
     * The CopyId property.
     */
    @JsonProperty(value = "CopyId")
    private String copyId;

    /*
     * The CopyStatus property.
     */
    @JsonProperty(value = "CopyStatus")
    private CopyStatusType copyStatus;

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
     * The AccessTier property.
     */
    @JsonProperty(value = "AccessTier")
    private AccessTier accessTier;

    /*
     * The AccessTierInferred property.
     */
    @JsonProperty(value = "AccessTierInferred")
    private Boolean accessTierInferred;

    /*
     * The ArchiveStatus property.
     */
    @JsonProperty(value = "ArchiveStatus")
    private ArchiveStatus archiveStatus;

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
     * If an object is in rehydrate pending state then this header is returned
     * with priority of rehydrate. Valid values are High and Standard.
     */
    @JsonProperty(value = "RehydratePriority")
    private RehydratePriority rehydratePriority;

    /*
     * The LastAccessTime property.
     */
    @JsonProperty(value = "LastAccessTime")
    private DateTimeRfc1123 lastAccessedOn;

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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCreationTime(OffsetDateTime creationTime) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the eTag property: The Etag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The Etag property.
     *
     * @param eTag the eTag value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setETag(String eTag) {
        this.eTag = eTag;
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setContentLength(Long contentLength) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setContentType(String contentType) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setContentEncoding(String contentEncoding) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentMd5 property: The Content-MD5 property.
     *
     * @return the contentMd5 value.
     */
    public byte[] getContentMd5() {
        return CoreUtils.clone(this.contentMd5);
    }

    /**
     * Set the contentMd5 property: The Content-MD5 property.
     *
     * @param contentMd5 the contentMd5 value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setContentMd5(byte[] contentMd5) {
        this.contentMd5 = CoreUtils.clone(contentMd5);
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setContentDisposition(String contentDisposition) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCacheControl(String cacheControl) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setBlobSequenceNumber(Long blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
        return this;
    }

    /**
     * Get the blobType property: The BlobType property.
     *
     * @return the blobType value.
     */
    public BlobType getBlobType() {
        return this.blobType;
    }

    /**
     * Set the blobType property: The BlobType property.
     *
     * @param blobType the blobType value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setBlobType(BlobType blobType) {
        this.blobType = blobType;
        return this;
    }

    /**
     * Get the leaseStatus property: The LeaseStatus property.
     *
     * @return the leaseStatus value.
     */
    public LeaseStatusType getLeaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus property: The LeaseStatus property.
     *
     * @param leaseStatus the leaseStatus value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the leaseState property: The LeaseState property.
     *
     * @return the leaseState value.
     */
    public LeaseStateType getLeaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState property: The LeaseState property.
     *
     * @param leaseState the leaseState value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseDuration property: The LeaseDuration property.
     *
     * @return the leaseDuration value.
     */
    public LeaseDurationType getLeaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: The LeaseDuration property.
     *
     * @param leaseDuration the leaseDuration value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCopyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copyStatus property: The CopyStatus property.
     *
     * @return the copyStatus value.
     */
    public CopyStatusType getCopyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus property: The CopyStatus property.
     *
     * @param copyStatus the copyStatus value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCopyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCopySource(String copySource) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCopyProgress(String copyProgress) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCopyCompletionTime(OffsetDateTime copyCompletionTime) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCopyStatusDescription(String copyStatusDescription) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setServerEncrypted(Boolean serverEncrypted) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setIncrementalCopy(Boolean incrementalCopy) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setDestinationSnapshot(String destinationSnapshot) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setDeletedTime(OffsetDateTime deletedTime) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setRemainingRetentionDays(Integer remainingRetentionDays) {
        this.remainingRetentionDays = remainingRetentionDays;
        return this;
    }

    /**
     * Get the accessTier property: The AccessTier property.
     *
     * @return the accessTier value.
     */
    public AccessTier getAccessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier property: The AccessTier property.
     *
     * @param accessTier the accessTier value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setAccessTierInferred(Boolean accessTierInferred) {
        this.accessTierInferred = accessTierInferred;
        return this;
    }

    /**
     * Get the archiveStatus property: The ArchiveStatus property.
     *
     * @return the archiveStatus value.
     */
    public ArchiveStatus getArchiveStatus() {
        return this.archiveStatus;
    }

    /**
     * Set the archiveStatus property: The ArchiveStatus property.
     *
     * @param archiveStatus the archiveStatus value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setArchiveStatus(ArchiveStatus archiveStatus) {
        this.archiveStatus = archiveStatus;
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setCustomerProvidedKeySha256(String customerProvidedKeySha256) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setEncryptionScope(String encryptionScope) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setAccessTierChangeTime(OffsetDateTime accessTierChangeTime) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setTagCount(Integer tagCount) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setExpiresOn(OffsetDateTime expiresOn) {
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setIsSealed(Boolean isSealed) {
        this.isSealed = isSealed;
        return this;
    }

    /**
     * Get the rehydratePriority property: If an object is in rehydrate pending state then this header is returned with
     * priority of rehydrate. Valid values are High and Standard.
     *
     * @return the rehydratePriority value.
     */
    public RehydratePriority getRehydratePriority() {
        return this.rehydratePriority;
    }

    /**
     * Set the rehydratePriority property: If an object is in rehydrate pending state then this header is returned with
     * priority of rehydrate. Valid values are High and Standard.
     *
     * @param rehydratePriority the rehydratePriority value to set.
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setRehydratePriority(RehydratePriority rehydratePriority) {
        this.rehydratePriority = rehydratePriority;
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
     * @return the BlobItemPropertiesInternal object itself.
     */
    public BlobItemPropertiesInternal setLastAccessedOn(OffsetDateTime lastAccessedOn) {
        if (lastAccessedOn == null) {
            this.lastAccessedOn = null;
        } else {
            this.lastAccessedOn = new DateTimeRfc1123(lastAccessedOn);
        }
        return this;
    }
}
