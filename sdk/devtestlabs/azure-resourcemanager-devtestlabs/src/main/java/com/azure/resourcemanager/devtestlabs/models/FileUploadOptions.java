// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FileUploadOptions. */
public final class FileUploadOptions extends ExpandableStringEnum<FileUploadOptions> {
    /** Static value UploadFilesAndGenerateSasTokens for FileUploadOptions. */
    public static final FileUploadOptions UPLOAD_FILES_AND_GENERATE_SAS_TOKENS =
        fromString("UploadFilesAndGenerateSasTokens");

    /** Static value None for FileUploadOptions. */
    public static final FileUploadOptions NONE = fromString("None");

    /**
     * Creates or finds a FileUploadOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileUploadOptions.
     */
    @JsonCreator
    public static FileUploadOptions fromString(String name) {
        return fromString(name, FileUploadOptions.class);
    }

    /** @return known FileUploadOptions values. */
    public static Collection<FileUploadOptions> values() {
        return values(FileUploadOptions.class);
    }
}
