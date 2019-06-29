// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.core.implementation.util.ImplUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for a set of operations.
 */
@JacksonXmlRootElement(localName = "blob-HTTP-headers")
public final class BlobHTTPHeaders {
    /*
     * Optional. Sets the blob's cache control. If specified, this property is
     * stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "blobCacheControl")
    private String blobCacheControl;

    /*
     * Optional. Sets the blob's content type. If specified, this property is
     * stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "blobContentType")
    private String blobContentType;

    /*
     * Optional. An MD5 hash of the blob content. Note that this hash is not
     * validated, as the hashes for the individual blocks were validated when
     * each was uploaded.
     */
    @JsonProperty(value = "blobContentMD5")
    private byte[] blobContentMD5;

    /*
     * Optional. Sets the blob's content encoding. If specified, this property
     * is stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "blobContentEncoding")
    private String blobContentEncoding;

    /*
     * Optional. Set the blob's content language. If specified, this property
     * is stored with the blob and returned with a read request.
     */
    @JsonProperty(value = "blobContentLanguage")
    private String blobContentLanguage;

    /*
     * Optional. Sets the blob's Content-Disposition header.
     */
    @JsonProperty(value = "blobContentDisposition")
    private String blobContentDisposition;

    /**
     * Get the blobCacheControl property: Optional. Sets the blob's cache
     * control. If specified, this property is stored with the blob and
     * returned with a read request.
     *
     * @return the blobCacheControl value.
     */
    public String blobCacheControl() {
        return this.blobCacheControl;
    }

    /**
     * Set the blobCacheControl property: Optional. Sets the blob's cache
     * control. If specified, this property is stored with the blob and
     * returned with a read request.
     *
     * @param blobCacheControl the blobCacheControl value to set.
     * @return the BlobHTTPHeaders object itself.
     */
    public BlobHTTPHeaders blobCacheControl(String blobCacheControl) {
        this.blobCacheControl = blobCacheControl;
        return this;
    }

    /**
     * Get the blobContentType property: Optional. Sets the blob's content
     * type. If specified, this property is stored with the blob and returned
     * with a read request.
     *
     * @return the blobContentType value.
     */
    public String blobContentType() {
        return this.blobContentType;
    }

    /**
     * Set the blobContentType property: Optional. Sets the blob's content
     * type. If specified, this property is stored with the blob and returned
     * with a read request.
     *
     * @param blobContentType the blobContentType value to set.
     * @return the BlobHTTPHeaders object itself.
     */
    public BlobHTTPHeaders blobContentType(String blobContentType) {
        this.blobContentType = blobContentType;
        return this;
    }

    /**
     * Get the blobContentMD5 property: Optional. An MD5 hash of the blob
     * content. Note that this hash is not validated, as the hashes for the
     * individual blocks were validated when each was uploaded.
     *
     * @return the blobContentMD5 value.
     */
    public byte[] blobContentMD5() {
        return ImplUtils.clone(this.blobContentMD5);
    }

    /**
     * Set the blobContentMD5 property: Optional. An MD5 hash of the blob
     * content. Note that this hash is not validated, as the hashes for the
     * individual blocks were validated when each was uploaded.
     *
     * @param blobContentMD5 the blobContentMD5 value to set.
     * @return the BlobHTTPHeaders object itself.
     */
    public BlobHTTPHeaders blobContentMD5(byte[] blobContentMD5) {
        this.blobContentMD5 = ImplUtils.clone(blobContentMD5);
        return this;
    }

    /**
     * Get the blobContentEncoding property: Optional. Sets the blob's content
     * encoding. If specified, this property is stored with the blob and
     * returned with a read request.
     *
     * @return the blobContentEncoding value.
     */
    public String blobContentEncoding() {
        return this.blobContentEncoding;
    }

    /**
     * Set the blobContentEncoding property: Optional. Sets the blob's content
     * encoding. If specified, this property is stored with the blob and
     * returned with a read request.
     *
     * @param blobContentEncoding the blobContentEncoding value to set.
     * @return the BlobHTTPHeaders object itself.
     */
    public BlobHTTPHeaders blobContentEncoding(String blobContentEncoding) {
        this.blobContentEncoding = blobContentEncoding;
        return this;
    }

    /**
     * Get the blobContentLanguage property: Optional. Set the blob's content
     * language. If specified, this property is stored with the blob and
     * returned with a read request.
     *
     * @return the blobContentLanguage value.
     */
    public String blobContentLanguage() {
        return this.blobContentLanguage;
    }

    /**
     * Set the blobContentLanguage property: Optional. Set the blob's content
     * language. If specified, this property is stored with the blob and
     * returned with a read request.
     *
     * @param blobContentLanguage the blobContentLanguage value to set.
     * @return the BlobHTTPHeaders object itself.
     */
    public BlobHTTPHeaders blobContentLanguage(String blobContentLanguage) {
        this.blobContentLanguage = blobContentLanguage;
        return this;
    }

    /**
     * Get the blobContentDisposition property: Optional. Sets the blob's
     * Content-Disposition header.
     *
     * @return the blobContentDisposition value.
     */
    public String blobContentDisposition() {
        return this.blobContentDisposition;
    }

    /**
     * Set the blobContentDisposition property: Optional. Sets the blob's
     * Content-Disposition header.
     *
     * @param blobContentDisposition the blobContentDisposition value to set.
     * @return the BlobHTTPHeaders object itself.
     */
    public BlobHTTPHeaders blobContentDisposition(String blobContentDisposition) {
        this.blobContentDisposition = blobContentDisposition;
        return this;
    }
}
