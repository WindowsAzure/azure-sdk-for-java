/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DownloadPhase.
 */
public final class DownloadPhase extends ExpandableStringEnum<DownloadPhase> {
    /** Static value Unknown for DownloadPhase. */
    public static final DownloadPhase UNKNOWN = fromString("Unknown");

    /** Static value Initializing for DownloadPhase. */
    public static final DownloadPhase INITIALIZING = fromString("Initializing");

    /** Static value Downloading for DownloadPhase. */
    public static final DownloadPhase DOWNLOADING = fromString("Downloading");

    /** Static value Verifying for DownloadPhase. */
    public static final DownloadPhase VERIFYING = fromString("Verifying");

    /**
     * Creates or finds a DownloadPhase from its string representation.
     * @param name a name to look for
     * @return the corresponding DownloadPhase
     */
    @JsonCreator
    public static DownloadPhase fromString(String name) {
        return fromString(name, DownloadPhase.class);
    }

    /**
     * @return known DownloadPhase values
     */
    public static Collection<DownloadPhase> values() {
        return values(DownloadPhase.class);
    }
}
