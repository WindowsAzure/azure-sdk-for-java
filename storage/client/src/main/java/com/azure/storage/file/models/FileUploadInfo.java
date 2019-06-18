// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.azure.core.implementation.util.ImplUtils;
import java.time.OffsetDateTime;

public final class FileUploadInfo {
    private String eTag;
    private OffsetDateTime lastModified;
    private byte[] contentMD5;
    private Boolean isServerEncrypted;

    public FileUploadInfo(final String eTag, final OffsetDateTime lastModified, final byte[] contentMD5, final Boolean isServerEncrypted) {
        this.eTag = eTag;
        this.lastModified = lastModified;
        this.contentMD5 = contentMD5;
        this.isServerEncrypted = isServerEncrypted;
    }

    public String eTag() {
        return eTag;
    }

    public String eTag(final String eTag) {
        this.eTag = eTag;
        return this.eTag;
    }

    public OffsetDateTime lastModified() {
        return lastModified;
    }

    public OffsetDateTime lastModified(final OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this.lastModified;
    }

    public byte[] contentMD5() {
        return contentMD5;
    }

    public byte[] contentMD5(final byte[] contentMD5) {
        this.contentMD5 = ImplUtils.clone(contentMD5);
        return this.contentMD5;
    }

    public Boolean isServerEncrypted() {
        return isServerEncrypted;
    }

    public Boolean isServerEncrypted(final Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this.isServerEncrypted;
    }
}
