// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.annotation.Fluent;
import com.azure.core.implementation.annotation.HeaderCollection;
import com.azure.core.implementation.util.ImplUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Defines headers for GetProperties operation.
 */
@JacksonXmlRootElement(localName = "File-GetProperties-Headers")
@Fluent
public final class FileGetPropertiesHeaders {
    /*
     * Returns the date and time the file was last modified. The date format
     * follows RFC 1123. Any operation that modifies the file or its properties
     * updates the last modified time.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The metadata property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> metadata;

    /*
     * Returns the type File. Reserved for future use. Possible values include:
     * 'File'
     */
    @JsonProperty(value = "x-ms-type")
    private String fileType;

    /*
     * The size of the file in bytes. This header returns the value of the
     * 'x-ms-content-length' header that is stored with the file.
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
     * The ETag contains a value that you can use to perform operations
     * conditionally, in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * If the Content-MD5 header has been set for the file, the Content-MD5
     * response header is returned so that the client can check for message
     * content integrity.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * If the Content-Encoding request header has previously been set for the
     * file, the Content-Encoding value is returned in this header.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * If the Cache-Control request header has previously been set for the
     * file, the Cache-Control value is returned in this header.
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
     * last modified. The date format follows RFC 1123. Any operation that
     * modifies the file or its properties updates the last modified time.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the file was
     * last modified. The date format follows RFC 1123. Any operation that
     * modifies the file or its properties updates the last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders lastModified(OffsetDateTime lastModified) {
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
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the fileType property: Returns the type File. Reserved for future
     * use. Possible values include: 'File'.
     *
     * @return the fileType value.
     */
    public String fileType() {
        return this.fileType;
    }

    /**
     * Set the fileType property: Returns the type File. Reserved for future
     * use. Possible values include: 'File'.
     *
     * @param fileType the fileType value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get the contentLength property: The size of the file in bytes. This
     * header returns the value of the 'x-ms-content-length' header that is
     * stored with the file.
     *
     * @return the contentLength value.
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The size of the file in bytes. This
     * header returns the value of the 'x-ms-content-length' header that is
     * stored with the file.
     *
     * @param contentLength the contentLength value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders contentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType property: The content type specified for the file.
     * The default content type is 'application/octet-stream'.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type specified for the file.
     * The default content type is 'application/octet-stream'.
     *
     * @param contentType the contentType value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders eTag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentMD5 property: If the Content-MD5 header has been set for
     * the file, the Content-MD5 response header is returned so that the client
     * can check for message content integrity.
     *
     * @return the contentMD5 value.
     */
    public byte[] contentMD5() {
        return ImplUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: If the Content-MD5 header has been set for
     * the file, the Content-MD5 response header is returned so that the client
     * can check for message content integrity.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders contentMD5(byte[] contentMD5) {
        this.contentMD5 = ImplUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the contentEncoding property: If the Content-Encoding request header
     * has previously been set for the file, the Content-Encoding value is
     * returned in this header.
     *
     * @return the contentEncoding value.
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: If the Content-Encoding request header
     * has previously been set for the file, the Content-Encoding value is
     * returned in this header.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders contentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the cacheControl property: If the Cache-Control request header has
     * previously been set for the file, the Cache-Control value is returned in
     * this header.
     *
     * @return the cacheControl value.
     */
    public String cacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: If the Cache-Control request header has
     * previously been set for the file, the Cache-Control value is returned in
     * this header.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders cacheControl(String cacheControl) {
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
    public String contentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: Returns the value that was
     * specified for the 'x-ms-content-disposition' header and specifies how to
     * process the response.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders contentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentLanguage property: Returns the value that was specified
     * for the Content-Language request header.
     *
     * @return the contentLanguage value.
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: Returns the value that was specified
     * for the Content-Language request header.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders contentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
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
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
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
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders dateProperty(OffsetDateTime dateProperty) {
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
    public OffsetDateTime copyCompletionTime() {
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
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders copyCompletionTime(OffsetDateTime copyCompletionTime) {
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
    public String copyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes cause of fatal or
     * non-fatal copy operation failure.
     *
     * @param copyStatusDescription the copyStatusDescription value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders copyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the copyId property: String identifier for the last attempted Copy
     * File operation where this file was the destination file.
     *
     * @return the copyId value.
     */
    public String copyId() {
        return this.copyId;
    }

    /**
     * Set the copyId property: String identifier for the last attempted Copy
     * File operation where this file was the destination file.
     *
     * @param copyId the copyId value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders copyId(String copyId) {
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
    public String copyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy File operation
     * where this file was the destination file. Can show between 0 and
     * Content-Length bytes copied.
     *
     * @param copyProgress the copyProgress value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders copyProgress(String copyProgress) {
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
    public String copySource() {
        return this.copySource;
    }

    /**
     * Set the copySource property: URL up to 2KB in length that specifies the
     * source file used in the last attempted Copy File operation where this
     * file was the destination file.
     *
     * @param copySource the copySource value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders copySource(String copySource) {
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
    public CopyStatusType copyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus property: State of the copy operation identified by
     * 'x-ms-copy-id'. Possible values include: 'pending', 'success',
     * 'aborted', 'failed'.
     *
     * @param copyStatus the copyStatus value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders copyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
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
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders isServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the fileAttributes property: Attributes set for the file.
     *
     * @return the fileAttributes value.
     */
    public String fileAttributes() {
        return this.fileAttributes;
    }

    /**
     * Set the fileAttributes property: Attributes set for the file.
     *
     * @param fileAttributes the fileAttributes value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders fileAttributes(String fileAttributes) {
        this.fileAttributes = fileAttributes;
        return this;
    }

    /**
     * Get the fileCreationTime property: Creation time for the file.
     *
     * @return the fileCreationTime value.
     */
    public OffsetDateTime fileCreationTime() {
        return this.fileCreationTime;
    }

    /**
     * Set the fileCreationTime property: Creation time for the file.
     *
     * @param fileCreationTime the fileCreationTime value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders fileCreationTime(OffsetDateTime fileCreationTime) {
        this.fileCreationTime = fileCreationTime;
        return this;
    }

    /**
     * Get the fileLastWriteTime property: Last write time for the file.
     *
     * @return the fileLastWriteTime value.
     */
    public OffsetDateTime fileLastWriteTime() {
        return this.fileLastWriteTime;
    }

    /**
     * Set the fileLastWriteTime property: Last write time for the file.
     *
     * @param fileLastWriteTime the fileLastWriteTime value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders fileLastWriteTime(OffsetDateTime fileLastWriteTime) {
        this.fileLastWriteTime = fileLastWriteTime;
        return this;
    }

    /**
     * Get the fileChangeTime property: Change time for the file.
     *
     * @return the fileChangeTime value.
     */
    public OffsetDateTime fileChangeTime() {
        return this.fileChangeTime;
    }

    /**
     * Set the fileChangeTime property: Change time for the file.
     *
     * @param fileChangeTime the fileChangeTime value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders fileChangeTime(OffsetDateTime fileChangeTime) {
        this.fileChangeTime = fileChangeTime;
        return this;
    }

    /**
     * Get the filePermissionKey property: Key of the permission set for the
     * file.
     *
     * @return the filePermissionKey value.
     */
    public String filePermissionKey() {
        return this.filePermissionKey;
    }

    /**
     * Set the filePermissionKey property: Key of the permission set for the
     * file.
     *
     * @param filePermissionKey the filePermissionKey value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders filePermissionKey(String filePermissionKey) {
        this.filePermissionKey = filePermissionKey;
        return this;
    }

    /**
     * Get the fileId property: The fileId of the file.
     *
     * @return the fileId value.
     */
    public String fileId() {
        return this.fileId;
    }

    /**
     * Set the fileId property: The fileId of the file.
     *
     * @param fileId the fileId value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get the fileParentId property: The parent fileId of the file.
     *
     * @return the fileParentId value.
     */
    public String fileParentId() {
        return this.fileParentId;
    }

    /**
     * Set the fileParentId property: The parent fileId of the file.
     *
     * @param fileParentId the fileParentId value to set.
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders fileParentId(String fileParentId) {
        this.fileParentId = fileParentId;
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
     * @return the FileGetPropertiesHeaders object itself.
     */
    public FileGetPropertiesHeaders errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
