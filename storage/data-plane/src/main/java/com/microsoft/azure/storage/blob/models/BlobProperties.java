// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * Properties of a blob.
 */
@JacksonXmlRootElement(localName = "Properties")
public final class BlobProperties {
    /**
     * The creationTime property.
     */
    @JsonProperty(value = "Creation-Time")
    private DateTimeRfc1123 creationTime;

    /**
     * The lastModified property.
     */
    @JsonProperty(value = "Last-Modified", required = true)
    private DateTimeRfc1123 lastModified;

    /**
     * The etag property.
     */
    @JsonProperty(value = "Etag", required = true)
    private String etag;

    /**
     * Size in bytes.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /**
     * The contentType property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * The contentEncoding property.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /**
     * The contentLanguage property.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /**
     * The contentMD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /**
     * The contentDisposition property.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /**
     * The cacheControl property.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /**
     * The blobSequenceNumber property.
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private Long blobSequenceNumber;

    /**
     * Possible values include: 'BlockBlob', 'PageBlob', 'AppendBlob'.
     */
    @JsonProperty(value = "BlobType")
    private BlobType blobType;

    /**
     * Possible values include: 'locked', 'unlocked'.
     */
    @JsonProperty(value = "LeaseStatus")
    private LeaseStatusType leaseStatus;

    /**
     * Possible values include: 'available', 'leased', 'expired', 'breaking',
     * 'broken'.
     */
    @JsonProperty(value = "LeaseState")
    private LeaseStateType leaseState;

    /**
     * Possible values include: 'infinite', 'fixed'.
     */
    @JsonProperty(value = "LeaseDuration")
    private LeaseDurationType leaseDuration;

    /**
     * The copyId property.
     */
    @JsonProperty(value = "CopyId")
    private String copyId;

    /**
     * Possible values include: 'pending', 'success', 'aborted', 'failed'.
     */
    @JsonProperty(value = "CopyStatus")
    private CopyStatusType copyStatus;

    /**
     * The copySource property.
     */
    @JsonProperty(value = "CopySource")
    private String copySource;

    /**
     * The copyProgress property.
     */
    @JsonProperty(value = "CopyProgress")
    private String copyProgress;

    /**
     * The copyCompletionTime property.
     */
    @JsonProperty(value = "CopyCompletionTime")
    private DateTimeRfc1123 copyCompletionTime;

    /**
     * The copyStatusDescription property.
     */
    @JsonProperty(value = "CopyStatusDescription")
    private String copyStatusDescription;

    /**
     * The serverEncrypted property.
     */
    @JsonProperty(value = "ServerEncrypted")
    private Boolean serverEncrypted;

    /**
     * The incrementalCopy property.
     */
    @JsonProperty(value = "IncrementalCopy")
    private Boolean incrementalCopy;

    /**
     * The destinationSnapshot property.
     */
    @JsonProperty(value = "DestinationSnapshot")
    private String destinationSnapshot;

    /**
     * The deletedTime property.
     */
    @JsonProperty(value = "DeletedTime")
    private DateTimeRfc1123 deletedTime;

    /**
     * The remainingRetentionDays property.
     */
    @JsonProperty(value = "RemainingRetentionDays")
    private Integer remainingRetentionDays;

    /**
     * Possible values include: 'P4', 'P6', 'P10', 'P20', 'P30', 'P40', 'P50',
     * 'Hot', 'Cool', 'Archive'.
     */
    @JsonProperty(value = "AccessTier")
    private AccessTier accessTier;

    /**
     * The accessTierInferred property.
     */
    @JsonProperty(value = "AccessTierInferred")
    private Boolean accessTierInferred;

    /**
     * Possible values include: 'rehydrate-pending-to-hot',
     * 'rehydrate-pending-to-cool'.
     */
    @JsonProperty(value = "ArchiveStatus")
    private ArchiveStatus archiveStatus;

    /**
     * The accessTierChangeTime property.
     */
    @JsonProperty(value = "AccessTierChangeTime")
    private DateTimeRfc1123 accessTierChangeTime;

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        if (this.creationTime == null) {
            return null;
        }
        return this.creationTime.dateTime();
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCreationTime(OffsetDateTime creationTime) {
        if (creationTime == null) {
            this.creationTime = null;
        } else {
            this.creationTime = new DateTimeRfc1123(creationTime);
        }
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the contentLength value.
     *
     * @return the contentLength value.
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength value.
     *
     * @param contentLength the contentLength value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentEncoding value.
     *
     * @return the contentEncoding value.
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding value.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLanguage value.
     *
     * @return the contentLanguage value.
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage value.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentMD5 value.
     *
     * @return the contentMD5 value.
     */
    public byte[] contentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 value.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withContentMD5(byte[] contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the contentDisposition value.
     *
     * @return the contentDisposition value.
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition value.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the cacheControl value.
     *
     * @return the cacheControl value.
     */
    public String cacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl value.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the blobSequenceNumber value.
     *
     * @return the blobSequenceNumber value.
     */
    public Long blobSequenceNumber() {
        return this.blobSequenceNumber;
    }

    /**
     * Set the blobSequenceNumber value.
     *
     * @param blobSequenceNumber the blobSequenceNumber value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withBlobSequenceNumber(Long blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
        return this;
    }

    /**
     * Get the blobType value.
     *
     * @return the blobType value.
     */
    public BlobType blobType() {
        return this.blobType;
    }

    /**
     * Set the blobType value.
     *
     * @param blobType the blobType value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withBlobType(BlobType blobType) {
        this.blobType = blobType;
        return this;
    }

    /**
     * Get the leaseStatus value.
     *
     * @return the leaseStatus value.
     */
    public LeaseStatusType leaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus value.
     *
     * @param leaseStatus the leaseStatus value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the leaseState value.
     *
     * @return the leaseState value.
     */
    public LeaseStateType leaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState value.
     *
     * @param leaseState the leaseState value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseDuration value.
     *
     * @return the leaseDuration value.
     */
    public LeaseDurationType leaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration value.
     *
     * @param leaseDuration the leaseDuration value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the copyId value.
     *
     * @return the copyId value.
     */
    public String copyId() {
        return this.copyId;
    }

    /**
     * Set the copyId value.
     *
     * @param copyId the copyId value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCopyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copyStatus value.
     *
     * @return the copyStatus value.
     */
    public CopyStatusType copyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus value.
     *
     * @param copyStatus the copyStatus value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCopyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }

    /**
     * Get the copySource value.
     *
     * @return the copySource value.
     */
    public String copySource() {
        return this.copySource;
    }

    /**
     * Set the copySource value.
     *
     * @param copySource the copySource value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * Get the copyProgress value.
     *
     * @return the copyProgress value.
     */
    public String copyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress value.
     *
     * @param copyProgress the copyProgress value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCopyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
        return this;
    }

    /**
     * Get the copyCompletionTime value.
     *
     * @return the copyCompletionTime value.
     */
    public OffsetDateTime copyCompletionTime() {
        if (this.copyCompletionTime == null) {
            return null;
        }
        return this.copyCompletionTime.dateTime();
    }

    /**
     * Set the copyCompletionTime value.
     *
     * @param copyCompletionTime the copyCompletionTime value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCopyCompletionTime(OffsetDateTime copyCompletionTime) {
        if (copyCompletionTime == null) {
            this.copyCompletionTime = null;
        } else {
            this.copyCompletionTime = new DateTimeRfc1123(copyCompletionTime);
        }
        return this;
    }

    /**
     * Get the copyStatusDescription value.
     *
     * @return the copyStatusDescription value.
     */
    public String copyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription value.
     *
     * @param copyStatusDescription the copyStatusDescription value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withCopyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the serverEncrypted value.
     *
     * @return the serverEncrypted value.
     */
    public Boolean serverEncrypted() {
        return this.serverEncrypted;
    }

    /**
     * Set the serverEncrypted value.
     *
     * @param serverEncrypted the serverEncrypted value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withServerEncrypted(Boolean serverEncrypted) {
        this.serverEncrypted = serverEncrypted;
        return this;
    }

    /**
     * Get the incrementalCopy value.
     *
     * @return the incrementalCopy value.
     */
    public Boolean incrementalCopy() {
        return this.incrementalCopy;
    }

    /**
     * Set the incrementalCopy value.
     *
     * @param incrementalCopy the incrementalCopy value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withIncrementalCopy(Boolean incrementalCopy) {
        this.incrementalCopy = incrementalCopy;
        return this;
    }

    /**
     * Get the destinationSnapshot value.
     *
     * @return the destinationSnapshot value.
     */
    public String destinationSnapshot() {
        return this.destinationSnapshot;
    }

    /**
     * Set the destinationSnapshot value.
     *
     * @param destinationSnapshot the destinationSnapshot value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withDestinationSnapshot(String destinationSnapshot) {
        this.destinationSnapshot = destinationSnapshot;
        return this;
    }

    /**
     * Get the deletedTime value.
     *
     * @return the deletedTime value.
     */
    public OffsetDateTime deletedTime() {
        if (this.deletedTime == null) {
            return null;
        }
        return this.deletedTime.dateTime();
    }

    /**
     * Set the deletedTime value.
     *
     * @param deletedTime the deletedTime value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withDeletedTime(OffsetDateTime deletedTime) {
        if (deletedTime == null) {
            this.deletedTime = null;
        } else {
            this.deletedTime = new DateTimeRfc1123(deletedTime);
        }
        return this;
    }

    /**
     * Get the remainingRetentionDays value.
     *
     * @return the remainingRetentionDays value.
     */
    public Integer remainingRetentionDays() {
        return this.remainingRetentionDays;
    }

    /**
     * Set the remainingRetentionDays value.
     *
     * @param remainingRetentionDays the remainingRetentionDays value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withRemainingRetentionDays(Integer remainingRetentionDays) {
        this.remainingRetentionDays = remainingRetentionDays;
        return this;
    }

    /**
     * Get the accessTier value.
     *
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier value.
     *
     * @param accessTier the accessTier value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the accessTierInferred value.
     *
     * @return the accessTierInferred value.
     */
    public Boolean accessTierInferred() {
        return this.accessTierInferred;
    }

    /**
     * Set the accessTierInferred value.
     *
     * @param accessTierInferred the accessTierInferred value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withAccessTierInferred(Boolean accessTierInferred) {
        this.accessTierInferred = accessTierInferred;
        return this;
    }

    /**
     * Get the archiveStatus value.
     *
     * @return the archiveStatus value.
     */
    public ArchiveStatus archiveStatus() {
        return this.archiveStatus;
    }

    /**
     * Set the archiveStatus value.
     *
     * @param archiveStatus the archiveStatus value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withArchiveStatus(ArchiveStatus archiveStatus) {
        this.archiveStatus = archiveStatus;
        return this;
    }

    /**
     * Get the accessTierChangeTime value.
     *
     * @return the accessTierChangeTime value.
     */
    public OffsetDateTime accessTierChangeTime() {
        if (this.accessTierChangeTime == null) {
            return null;
        }
        return this.accessTierChangeTime.dateTime();
    }

    /**
     * Set the accessTierChangeTime value.
     *
     * @param accessTierChangeTime the accessTierChangeTime value to set.
     * @return the BlobProperties object itself.
     */
    public BlobProperties withAccessTierChangeTime(OffsetDateTime accessTierChangeTime) {
        if (accessTierChangeTime == null) {
            this.accessTierChangeTime = null;
        } else {
            this.accessTierChangeTime = new DateTimeRfc1123(accessTierChangeTime);
        }
        return this;
    }
}
