// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Parameter group. */
@Fluent
@JacksonXmlRootElement(localName = "blob-http-headers")
public final class BlobHttpHeaders {
    /*
     * Optional. Sets the blob's cache control. If specified, this property is
     * stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "cacheControl")
    private String cacheControl;

    /*
     * Optional. Sets the blob's content type. If specified, this property is
     * stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * Optional. An MD5 hash of the blob content. Note that this hash is not
     * validated, as the hashes for the individual blocks were validated when
     * each was uploaded.
     */
    @JsonProperty(value = "contentMd5")
    private byte[] contentMd5;

    /*
     * Optional. Sets the blob's content encoding. If specified, this property
     * is stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "contentEncoding")
    private String contentEncoding;

    /*
     * Optional. Set the blob's content language. If specified, this property
     * is stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "contentLanguage")
    private String contentLanguage;

    /*
     * Optional. Sets the blob's Content-Disposition header.
     */
    @JsonProperty(value = "contentDisposition")
    private String contentDisposition;

    /**
     * Get the cacheControl property: Optional. Sets the blob's cache control. If specified, this property is stored
     * with the blob and returned with a read request.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: Optional. Sets the blob's cache control. If specified, this property is stored
     * with the blob and returned with a read request.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the BlobHttpHeaders object itself.
     */
    public BlobHttpHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentType property: Optional. Sets the blob's content type. If specified, this property is stored with
     * the blob and returned with a read request.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Optional. Sets the blob's content type. If specified, this property is stored with
     * the blob and returned with a read request.
     *
     * @param contentType the contentType value to set.
     * @return the BlobHttpHeaders object itself.
     */
    public BlobHttpHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentMd5 property: Optional. An MD5 hash of the blob content. Note that this hash is not validated, as
     * the hashes for the individual blocks were validated when each was uploaded. The value does not need to be base64
     * encoded as the SDK will perform the encoding.
     *
     * @return the contentMd5 value.
     */
    public byte[] getContentMd5() {
        return CoreUtils.clone(this.contentMd5);
    }

    /**
     * Set the contentMd5 property: Optional. An MD5 hash of the blob content. Note that this hash is not validated, as
     * the hashes for the individual blocks were validated when each was uploaded. The value does not need to be base64
     * encoded as the SDK will perform the encoding.
     *
     * @param contentMd5 the contentMd5 value to set.
     * @return the BlobHttpHeaders object itself.
     */
    public BlobHttpHeaders setContentMd5(byte[] contentMd5) {
        this.contentMd5 = CoreUtils.clone(contentMd5);
        return this;
    }

    /**
     * Get the contentEncoding property: Optional. Sets the blob's content encoding. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: Optional. Sets the blob's content encoding. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the BlobHttpHeaders object itself.
     */
    public BlobHttpHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLanguage property: Optional. Set the blob's content language. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: Optional. Set the blob's content language. If specified, this property is
     * stored with the blob and returned with a read request.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the BlobHttpHeaders object itself.
     */
    public BlobHttpHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentDisposition property: Optional. Sets the blob's Content-Disposition header.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: Optional. Sets the blob's Content-Disposition header.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the BlobHttpHeaders object itself.
     */
    public BlobHttpHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }
}
