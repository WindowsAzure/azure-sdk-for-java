/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BlobRestoreProgressStatus.
 */
public final class BlobRestoreProgressStatus extends ExpandableStringEnum<BlobRestoreProgressStatus> {
    /** Static value InProgress for BlobRestoreProgressStatus. */
    public static final BlobRestoreProgressStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Complete for BlobRestoreProgressStatus. */
    public static final BlobRestoreProgressStatus COMPLETE = fromString("Complete");

    /** Static value Failed for BlobRestoreProgressStatus. */
    public static final BlobRestoreProgressStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a BlobRestoreProgressStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding BlobRestoreProgressStatus
     */
    @JsonCreator
    public static BlobRestoreProgressStatus fromString(String name) {
        return fromString(name, BlobRestoreProgressStatus.class);
    }

    /**
     * @return known BlobRestoreProgressStatus values
     */
    public static Collection<BlobRestoreProgressStatus> values() {
        return values(BlobRestoreProgressStatus.class);
    }
}
