// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.HeaderCollection;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Defines headers for Download operation.
 */
@JacksonXmlRootElement(localName = "Share-File-Download-Headers")
@Fluent
public final class ShareFileDownloadHeaders {
    /*
     * Returns the date and time the file was last modified. Any operation that
     * modifies the file or its properties updates the last modified time.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The metadata property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> metadata;

    /*
     * The number of bytes present in the response body.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The content type specified for the file. The default content type is
     * 'application/octet-stream'
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /*
     * Indicates the range of bytes returned if the client requested a subset
     * of the file by setting the Range request header.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The ETag contains a value that you can use to perform operations
     * conditionally, in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * If the file has an MD5 hash and the request is to read the full file,
     * this response header is returned so that the client can check for
     * message content integrity. If the request is to read a specified range
     * and the 'x-ms-range-get-content-md5' is set to true, then the request
     * returns an MD5 hash for the range, as long as the range size is less
     * than or equal to 4 MB. If neither of these sets of conditions is true,
     * then no value is returned for the 'Content-MD5' header.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMd5;

    /*
     * Returns the value that was specified for the Content-Encoding request
     * header.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * Returned if it was previously specified for the file.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * Returns the value that was specified for the 'x-ms-content-disposition'
     * header and specifies how to process the response.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * Returns the value that was specified for the Content-Language request
     * header.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * Indicates that the service supports requests for partial file content.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * Conclusion time of the last attempted Copy File operation where this
     * file was the destination file. This value can specify the time of a
     * completed, aborted, or failed copy attempt.
     */
    @JsonProperty(value = "x-ms-copy-completion-time")
    private DateTimeRfc1123 copyCompletionTime;

    /*
     * Only appears when x-ms-copy-status is failed or pending. Describes cause
     * of fatal or non-fatal copy operation failure.
     */
    @JsonProperty(value = "x-ms-copy-status-description")
    private String copyStatusDescription;

    /*
     * String identifier for the last attempted Copy File operation where this
     * file was the destination file.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String copyId;

    /*
     * Contains the number of bytes copied and the total bytes in the source in
     * the last attempted Copy File operation where this file was the
     * destination file. Can show between 0 and Content-Length bytes copied.
     */
    @JsonProperty(value = "x-ms-copy-progress")
    private String copyProgress;

    /*
     * URL up to 2KB in length that specifies the source file used in the last
     * attempted Copy File operation where this file was the destination file.
     */
    @JsonProperty(value = "x-ms-copy-source")
    private String copySource;

    /*
     * State of the copy operation identified by 'x-ms-copy-id'. Possible
     * values include: 'pending', 'success', 'aborted', 'failed'
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType copyStatus;

    /*
     * If the file has a MD5 hash, and if request contains range header (Range
     * or x-ms-range), this response header is returned with the value of the
     * whole file's MD5 value. This value may or may not be equal to the value
     * returned in Content-MD5 header, with the latter calculated from the
     * requested range.
     */
    @JsonProperty(value = "x-ms-content-md5")
    private byte[] fileContentMd5;

    /*
     * The value of this header is set to true if the file data and application
     * metadata are completely encrypted using the specified algorithm.
     * Otherwise, the value is set to false (when the file is unencrypted, or
     * if only parts of the file/application metadata are encrypted).
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean isServerEncrypted;

    /*
     * Attributes set for the file.
     */
    @JsonProperty(value = "x-ms-file-attributes")
    private String fileAttributes;

    /*
     * Creation time for the file.
     */
    @JsonProperty(value = "x-ms-file-creation-time")
    private OffsetDateTime fileCreationTime;

    /*
     * Last write time for the file.
     */
    @JsonProperty(value = "x-ms-file-last-write-time")
    private OffsetDateTime fileLastWriteTime;

    /*
     * Change time for the file.
     */
    @JsonProperty(value = "x-ms-file-change-time")
    private OffsetDateTime fileChangeTime;

    /*
     * Key of the permission set for the file.
     */
    @JsonProperty(value = "x-ms-file-permission-key")
    private String filePermissionKey;

    /*
     * The fileId of the file.
     */
    @JsonProperty(value = "x-ms-file-id")
    private String fileId;

    /*
     * The parent fileId of the file.
     */
    @JsonProperty(value = "x-ms-file-parent-id")
    private String fileParentId;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the lastModified property: Returns the date and time the file was
     * last modified. Any operation that modifies the file or its properties
     * updates the last modified time.
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
     * Set the lastModified property: Returns the date and time the file was
     * last modified. Any operation that modifies the file or its properties
     * updates the last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the contentLength property: The number of bytes present in the
     * response body.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The number of bytes present in the
     * response body.
     *
     * @param contentLength the contentLength value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType property: The content type specified for the file.
     * The default content type is 'application/octet-stream'.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type specified for the file.
     * The default content type is 'application/octet-stream'.
     *
     * @param contentType the contentType value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentRange property: Indicates the range of bytes returned if
     * the client requested a subset of the file by setting the Range request
     * header.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: Indicates the range of bytes returned if
     * the client requested a subset of the file by setting the Range request
     * header.
     *
     * @param contentRange the contentRange value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentMd5 property: If the file has an MD5 hash and the request
     * is to read the full file, this response header is returned so that the
     * client can check for message content integrity. If the request is to
     * read a specified range and the 'x-ms-range-get-content-md5' is set to
     * true, then the request returns an MD5 hash for the range, as long as the
     * range size is less than or equal to 4 MB. If neither of these sets of
     * conditions is true, then no value is returned for the 'Content-MD5'
     * header.
     *
     * @return the contentMd5 value.
     */
    public byte[] getContentMd5() {
        return CoreUtils.clone(this.contentMd5);
    }

    /**
     * Set the contentMd5 property: If the file has an MD5 hash and the request
     * is to read the full file, this response header is returned so that the
     * client can check for message content integrity. If the request is to
     * read a specified range and the 'x-ms-range-get-content-md5' is set to
     * true, then the request returns an MD5 hash for the range, as long as the
     * range size is less than or equal to 4 MB. If neither of these sets of
     * conditions is true, then no value is returned for the 'Content-MD5'
     * header.
     *
     * @param contentMd5 the contentMd5 value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setContentMd5(byte[] contentMd5) {
        this.contentMd5 = CoreUtils.clone(contentMd5);
        return this;
    }

    /**
     * Get the contentEncoding property: Returns the value that was specified
     * for the Content-Encoding request header.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: Returns the value that was specified
     * for the Content-Encoding request header.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the cacheControl property: Returned if it was previously specified
     * for the file.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: Returned if it was previously specified
     * for the file.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentDisposition property: Returns the value that was
     * specified for the 'x-ms-content-disposition' header and specifies how to
     * process the response.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: Returns the value that was
     * specified for the 'x-ms-content-disposition' header and specifies how to
     * process the response.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentLanguage property: Returns the value that was specified
     * for the Content-Language request header.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: Returns the value that was specified
     * for the Content-Language request header.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
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
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the copyCompletionTime property: Conclusion time of the last
     * attempted Copy File operation where this file was the destination file.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt.
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
     * Set the copyCompletionTime property: Conclusion time of the last
     * attempted Copy File operation where this file was the destination file.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt.
     *
     * @param copyCompletionTime the copyCompletionTime value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setCopyCompletionTime(OffsetDateTime copyCompletionTime) {
        if (copyCompletionTime == null) {
            this.copyCompletionTime = null;
        } else {
            this.copyCompletionTime = new DateTimeRfc1123(copyCompletionTime);
        }
        return this;
    }

    /**
     * Get the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes cause of fatal or
     * non-fatal copy operation failure.
     *
     * @return the copyStatusDescription value.
     */
    public String getCopyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes cause of fatal or
     * non-fatal copy operation failure.
     *
     * @param copyStatusDescription the copyStatusDescription value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setCopyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the copyId property: String identifier for the last attempted Copy
     * File operation where this file was the destination file.
     *
     * @return the copyId value.
     */
    public String getCopyId() {
        return this.copyId;
    }

    /**
     * Set the copyId property: String identifier for the last attempted Copy
     * File operation where this file was the destination file.
     *
     * @param copyId the copyId value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setCopyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy File operation
     * where this file was the destination file. Can show between 0 and
     * Content-Length bytes copied.
     *
     * @return the copyProgress value.
     */
    public String getCopyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy File operation
     * where this file was the destination file. Can show between 0 and
     * Content-Length bytes copied.
     *
     * @param copyProgress the copyProgress value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setCopyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
        return this;
    }

    /**
     * Get the copySource property: URL up to 2KB in length that specifies the
     * source file used in the last attempted Copy File operation where this
     * file was the destination file.
     *
     * @return the copySource value.
     */
    public String getCopySource() {
        return this.copySource;
    }

    /**
     * Set the copySource property: URL up to 2KB in length that specifies the
     * source file used in the last attempted Copy File operation where this
     * file was the destination file.
     *
     * @param copySource the copySource value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * Get the copyStatus property: State of the copy operation identified by
     * 'x-ms-copy-id'. Possible values include: 'pending', 'success',
     * 'aborted', 'failed'.
     *
     * @return the copyStatus value.
     */
    public CopyStatusType getCopyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus property: State of the copy operation identified by
     * 'x-ms-copy-id'. Possible values include: 'pending', 'success',
     * 'aborted', 'failed'.
     *
     * @param copyStatus the copyStatus value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setCopyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }

    /**
     * Get the fileContentMd5 property: If the file has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole file's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @return the fileContentMd5 value.
     */
    public byte[] getFileContentMd5() {
        return CoreUtils.clone(this.fileContentMd5);
    }

    /**
     * Set the fileContentMd5 property: If the file has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole file's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @param fileContentMd5 the fileContentMd5 value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFileContentMd5(byte[] fileContentMd5) {
        this.fileContentMd5 = CoreUtils.clone(fileContentMd5);
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the file data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the file is unencrypted, or if only parts of the file/application
     * metadata are encrypted).
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the file data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the file is unencrypted, or if only parts of the file/application
     * metadata are encrypted).
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the fileAttributes property: Attributes set for the file.
     *
     * @return the fileAttributes value.
     */
    public String getFileAttributes() {
        return this.fileAttributes;
    }

    /**
     * Set the fileAttributes property: Attributes set for the file.
     *
     * @param fileAttributes the fileAttributes value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFileAttributes(String fileAttributes) {
        this.fileAttributes = fileAttributes;
        return this;
    }

    /**
     * Get the fileCreationTime property: Creation time for the file.
     *
     * @return the fileCreationTime value.
     */
    public OffsetDateTime getFileCreationTime() {
        return this.fileCreationTime;
    }

    /**
     * Set the fileCreationTime property: Creation time for the file.
     *
     * @param fileCreationTime the fileCreationTime value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFileCreationTime(OffsetDateTime fileCreationTime) {
        this.fileCreationTime = fileCreationTime;
        return this;
    }

    /**
     * Get the fileLastWriteTime property: Last write time for the file.
     *
     * @return the fileLastWriteTime value.
     */
    public OffsetDateTime getFileLastWriteTime() {
        return this.fileLastWriteTime;
    }

    /**
     * Set the fileLastWriteTime property: Last write time for the file.
     *
     * @param fileLastWriteTime the fileLastWriteTime value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFileLastWriteTime(OffsetDateTime fileLastWriteTime) {
        this.fileLastWriteTime = fileLastWriteTime;
        return this;
    }

    /**
     * Get the fileChangeTime property: Change time for the file.
     *
     * @return the fileChangeTime value.
     */
    public OffsetDateTime getFileChangeTime() {
        return this.fileChangeTime;
    }

    /**
     * Set the fileChangeTime property: Change time for the file.
     *
     * @param fileChangeTime the fileChangeTime value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFileChangeTime(OffsetDateTime fileChangeTime) {
        this.fileChangeTime = fileChangeTime;
        return this;
    }

    /**
     * Get the filePermissionKey property: Key of the permission set for the
     * file.
     *
     * @return the filePermissionKey value.
     */
    public String getFilePermissionKey() {
        return this.filePermissionKey;
    }

    /**
     * Set the filePermissionKey property: Key of the permission set for the
     * file.
     *
     * @param filePermissionKey the filePermissionKey value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFilePermissionKey(String filePermissionKey) {
        this.filePermissionKey = filePermissionKey;
        return this;
    }

    /**
     * Get the fileId property: The fileId of the file.
     *
     * @return the fileId value.
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: The fileId of the file.
     *
     * @param fileId the fileId value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the fileParentId property: The parent fileId of the file.
     *
     * @return the fileParentId value.
     */
    public String getFileParentId() {
        return this.fileParentId;
    }

    /**
     * Set the fileParentId property: The parent fileId of the file.
     *
     * @param fileParentId the fileParentId value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setFileParentId(String fileParentId) {
        this.fileParentId = fileParentId;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the ShareFileDownloadHeaders object itself.
     */
    public ShareFileDownloadHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
