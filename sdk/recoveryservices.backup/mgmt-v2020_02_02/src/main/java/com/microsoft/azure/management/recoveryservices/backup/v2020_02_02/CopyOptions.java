/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CopyOptions.
 */
public final class CopyOptions extends ExpandableStringEnum<CopyOptions> {
    /** Static value Invalid for CopyOptions. */
    public static final CopyOptions INVALID = fromString("Invalid");

    /** Static value CreateCopy for CopyOptions. */
    public static final CopyOptions CREATE_COPY = fromString("CreateCopy");

    /** Static value Skip for CopyOptions. */
    public static final CopyOptions SKIP = fromString("Skip");

    /** Static value Overwrite for CopyOptions. */
    public static final CopyOptions OVERWRITE = fromString("Overwrite");

    /** Static value FailOnConflict for CopyOptions. */
    public static final CopyOptions FAIL_ON_CONFLICT = fromString("FailOnConflict");

    /**
     * Creates or finds a CopyOptions from its string representation.
     * @param name a name to look for
     * @return the corresponding CopyOptions
     */
    @JsonCreator
    public static CopyOptions fromString(String name) {
        return fromString(name, CopyOptions.class);
    }

    /**
     * @return known CopyOptions values
     */
    public static Collection<CopyOptions> values() {
        return values(CopyOptions.class);
    }
}
