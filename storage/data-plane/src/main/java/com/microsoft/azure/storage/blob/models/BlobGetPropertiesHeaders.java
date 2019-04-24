// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;
import com.microsoft.rest.v2.annotations.HeaderCollection;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Defines headers for GetProperties operation.
 */
@JacksonXmlRootElement(localName = "Blob-GetProperties-Headers")
public final class BlobGetPropertiesHeaders {
    /**
     * Returns the date and time the blob was last modified. Any operation that
     * modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * Returns the date and time the blob was created.
     */
    @JsonProperty(value = "x-ms-creation-time")
    private DateTimeRfc1123 creationTime;

    /**
     * The metadata property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> metadata;

    /**
     * The blob's type. Possible values include: 'BlockBlob', 'PageBlob',
     * 'AppendBlob'.
     */
    @JsonProperty(value = "x-ms-blob-type")
    private BlobType blobType;

    /**
     * Conclusion time of the last attempted Copy Blob operation where this
     * blob was the destination blob. This value can specify the time of a
     * completed, aborted, or failed copy attempt. This header does not appear
     * if a copy is pending, if this blob has never been the destination in a
     * Copy Blob operation, or if this blob has been modified after a concluded
     * Copy Blob operation using Set Blob Properties, Put Blob, or Put Block
     * List.
     */
    @JsonProperty(value = "x-ms-copy-completion-time")
    private DateTimeRfc1123 copyCompletionTime;

    /**
     * Only appears when x-ms-copy-status is failed or pending. Describes the
     * cause of the last fatal or non-fatal copy operation failure. This header
     * does not appear if this blob has never been the destination in a Copy
     * Blob operation, or if this blob has been modified after a concluded Copy
     * Blob operation using Set Blob Properties, Put Blob, or Put Block List.
     */
    @JsonProperty(value = "x-ms-copy-status-description")
    private String copyStatusDescription;

    /**
     * String identifier for this copy operation. Use with Get Blob Properties
     * to check the status of this copy operation, or pass to Abort Copy Blob
     * to abort a pending copy.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String copyId;

    /**
     * Contains the number of bytes copied and the total bytes in the source in
     * the last attempted Copy Blob operation where this blob was the
     * destination blob. Can show between 0 and Content-Length bytes copied.
     * This header does not appear if this blob has never been the destination
     * in a Copy Blob operation, or if this blob has been modified after a
     * concluded Copy Blob operation using Set Blob Properties, Put Blob, or
     * Put Block List.
     */
    @JsonProperty(value = "x-ms-copy-progress")
    private String copyProgress;

    /**
     * URL up to 2 KB in length that specifies the source blob or file used in
     * the last attempted Copy Blob operation where this blob was the
     * destination blob. This header does not appear if this blob has never
     * been the destination in a Copy Blob operation, or if this blob has been
     * modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     */
    @JsonProperty(value = "x-ms-copy-source")
    private String copySource;

    /**
     * State of the copy operation identified by x-ms-copy-id. Possible values
     * include: 'pending', 'success', 'aborted', 'failed'.
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType copyStatus;

    /**
     * Included if the blob is incremental copy blob.
     */
    @JsonProperty(value = "x-ms-incremental-copy")
    private Boolean isIncrementalCopy;

    /**
     * Included if the blob is incremental copy blob or incremental copy
     * snapshot, if x-ms-copy-status is success. Snapshot time of the last
     * successful incremental copy snapshot for this blob.
     */
    @JsonProperty(value = "x-ms-copy-destination-snapshot")
    private String destinationSnapshot;

    /**
     * When a blob is leased, specifies whether the lease is of infinite or
     * fixed duration. Possible values include: 'infinite', 'fixed'.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private LeaseDurationType leaseDuration;

    /**
     * Lease state of the blob. Possible values include: 'available', 'leased',
     * 'expired', 'breaking', 'broken'.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private LeaseStateType leaseState;

    /**
     * The current lease status of the blob. Possible values include: 'locked',
     * 'unlocked'.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType leaseStatus;

    /**
     * The number of bytes present in the response body.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /**
     * The content type specified for the blob. The default content type is
     * 'application/octet-stream'.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * If the blob has an MD5 hash and this operation is to read the full blob,
     * this response header is returned so that the client can check for
     * message content integrity.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /**
     * This header returns the value that was specified for the
     * Content-Encoding request header.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /**
     * This header returns the value that was specified for the
     * 'x-ms-blob-content-disposition' header. The Content-Disposition response
     * header field conveys additional information about how to process the
     * response payload, and also can be used to attach additional metadata.
     * For example, if set to attachment, it indicates that the user-agent
     * should not display the response, but instead show a Save As dialog with
     * a filename other than the blob name specified.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /**
     * This header returns the value that was specified for the
     * Content-Language request header.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /**
     * This header is returned if it was previously specified for the blob.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /**
     * The current sequence number for a page blob. This header is not returned
     * for block blobs or append blobs.
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private Long blobSequenceNumber;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /**
     * Indicates that the service supports requests for partial blob content.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /**
     * The number of committed blocks present in the blob. This header is
     * returned only for append blobs.
     */
    @JsonProperty(value = "x-ms-blob-committed-block-count")
    private Integer blobCommittedBlockCount;

    /**
     * The value of this header is set to true if the blob data and application
     * metadata are completely encrypted using the specified algorithm.
     * Otherwise, the value is set to false (when the blob is unencrypted, or
     * if only parts of the blob/application metadata are encrypted).
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean isServerEncrypted;

    /**
     * The tier of page blob on a premium storage account or tier of block blob
     * on blob storage LRS accounts. For a list of allowed premium page blob
     * tiers, see
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/premium-storage#features.
     * For blob storage LRS accounts, valid values are Hot/Cool/Archive.
     */
    @JsonProperty(value = "x-ms-access-tier")
    private String accessTier;

    /**
     * For page blobs on a premium storage account only. If the access tier is
     * not explicitly set on the blob, the tier is inferred based on its
     * content length and this header will be returned with true value.
     */
    @JsonProperty(value = "x-ms-access-tier-inferred")
    private Boolean accessTierInferred;

    /**
     * For blob storage LRS accounts, valid values are
     * rehydrate-pending-to-hot/rehydrate-pending-to-cool. If the blob is being
     * rehydrated and is not complete then this header is returned indicating
     * that rehydrate is pending and also tells the destination tier.
     */
    @JsonProperty(value = "x-ms-archive-status")
    private String archiveStatus;

    /**
     * The time the tier was changed on the object. This is only returned if
     * the tier on the block blob was ever set.
     */
    @JsonProperty(value = "x-ms-access-tier-change-time")
    private DateTimeRfc1123 accessTierChangeTime;

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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCreationTime(OffsetDateTime creationTime) {
        if (creationTime == null) {
            this.creationTime = null;
        } else {
            this.creationTime = new DateTimeRfc1123(creationTime);
        }
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withBlobType(BlobType blobType) {
        this.blobType = blobType;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCopyCompletionTime(OffsetDateTime copyCompletionTime) {
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCopyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCopyId(String copyId) {
        this.copyId = copyId;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCopyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCopySource(String copySource) {
        this.copySource = copySource;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCopyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }

    /**
     * Get the isIncrementalCopy value.
     *
     * @return the isIncrementalCopy value.
     */
    public Boolean isIncrementalCopy() {
        return this.isIncrementalCopy;
    }

    /**
     * Set the isIncrementalCopy value.
     *
     * @param isIncrementalCopy the isIncrementalCopy value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withIsIncrementalCopy(Boolean isIncrementalCopy) {
        this.isIncrementalCopy = isIncrementalCopy;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withDestinationSnapshot(String destinationSnapshot) {
        this.destinationSnapshot = destinationSnapshot;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withContentLength(Long contentLength) {
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withETag(String eTag) {
        this.eTag = eTag;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withContentMD5(byte[] contentMD5) {
        this.contentMD5 = contentMD5;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withCacheControl(String cacheControl) {
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withBlobSequenceNumber(Long blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the date value.
     *
     * @return the date value.
     */
    public OffsetDateTime date() {
        if (this.date == null) {
            return null;
        }
        return this.date.dateTime();
    }

    /**
     * Set the date value.
     *
     * @param date the date value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the acceptRanges value.
     *
     * @return the acceptRanges value.
     */
    public String acceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges value.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the blobCommittedBlockCount value.
     *
     * @return the blobCommittedBlockCount value.
     */
    public Integer blobCommittedBlockCount() {
        return this.blobCommittedBlockCount;
    }

    /**
     * Set the blobCommittedBlockCount value.
     *
     * @param blobCommittedBlockCount the blobCommittedBlockCount value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withBlobCommittedBlockCount(Integer blobCommittedBlockCount) {
        this.blobCommittedBlockCount = blobCommittedBlockCount;
        return this;
    }

    /**
     * Get the isServerEncrypted value.
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted value.
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the accessTier value.
     *
     * @return the accessTier value.
     */
    public String accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier value.
     *
     * @param accessTier the accessTier value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withAccessTier(String accessTier) {
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withAccessTierInferred(Boolean accessTierInferred) {
        this.accessTierInferred = accessTierInferred;
        return this;
    }

    /**
     * Get the archiveStatus value.
     *
     * @return the archiveStatus value.
     */
    public String archiveStatus() {
        return this.archiveStatus;
    }

    /**
     * Set the archiveStatus value.
     *
     * @param archiveStatus the archiveStatus value to set.
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withArchiveStatus(String archiveStatus) {
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
     * @return the BlobGetPropertiesHeaders object itself.
     */
    public BlobGetPropertiesHeaders withAccessTierChangeTime(OffsetDateTime accessTierChangeTime) {
        if (accessTierChangeTime == null) {
            this.accessTierChangeTime = null;
        } else {
            this.accessTierChangeTime = new DateTimeRfc1123(accessTierChangeTime);
        }
        return this;
    }
}
