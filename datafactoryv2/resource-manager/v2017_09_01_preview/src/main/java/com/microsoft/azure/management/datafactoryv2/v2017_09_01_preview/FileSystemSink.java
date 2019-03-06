/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity file system sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileSystemSink")
public class FileSystemSink extends CopySink {
    /**
     * The type of copy behavior for copy sink. Possible values include:
     * 'PreserveHierarchy', 'FlattenHierarchy', 'MergeFiles'.
     */
    @JsonProperty(value = "copyBehavior")
    private CopyBehaviorType copyBehavior;

    /**
     * Get the type of copy behavior for copy sink. Possible values include: 'PreserveHierarchy', 'FlattenHierarchy', 'MergeFiles'.
     *
     * @return the copyBehavior value
     */
    public CopyBehaviorType copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the type of copy behavior for copy sink. Possible values include: 'PreserveHierarchy', 'FlattenHierarchy', 'MergeFiles'.
     *
     * @param copyBehavior the copyBehavior value to set
     * @return the FileSystemSink object itself.
     */
    public FileSystemSink withCopyBehavior(CopyBehaviorType copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

}
