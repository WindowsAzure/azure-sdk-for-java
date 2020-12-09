// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BlobRestoreProgressStatus. */
public final class BlobRestoreProgressStatus extends ExpandableStringEnum<BlobRestoreProgressStatus> {
    /** Static value InProgress for BlobRestoreProgressStatus. */
    public static final BlobRestoreProgressStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Complete for BlobRestoreProgressStatus. */
    public static final BlobRestoreProgressStatus COMPLETE = fromString("Complete");

    /** Static value Failed for BlobRestoreProgressStatus. */
    public static final BlobRestoreProgressStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a BlobRestoreProgressStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobRestoreProgressStatus.
     */
    @JsonCreator
    public static BlobRestoreProgressStatus fromString(String name) {
        return fromString(name, BlobRestoreProgressStatus.class);
    }

    /** @return known BlobRestoreProgressStatus values. */
    public static Collection<BlobRestoreProgressStatus> values() {
        return values(BlobRestoreProgressStatus.class);
    }
}
