/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TlsStatus.
 */
public final class TlsStatus extends ExpandableStringEnum<TlsStatus> {
    /** Static value Enabled for TlsStatus. */
    public static final TlsStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for TlsStatus. */
    public static final TlsStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a TlsStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding TlsStatus
     */
    @JsonCreator
    public static TlsStatus fromString(String name) {
        return fromString(name, TlsStatus.class);
    }

    /**
     * @return known TlsStatus values
     */
    public static Collection<TlsStatus> values() {
        return values(TlsStatus.class);
    }
}
