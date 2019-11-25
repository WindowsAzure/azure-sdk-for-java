/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SupportStatus.
 */
public final class SupportStatus extends ExpandableStringEnum<SupportStatus> {
    /** Static value Invalid for SupportStatus. */
    public static final SupportStatus INVALID = fromString("Invalid");

    /** Static value Supported for SupportStatus. */
    public static final SupportStatus SUPPORTED = fromString("Supported");

    /** Static value DefaultOFF for SupportStatus. */
    public static final SupportStatus DEFAULT_OFF = fromString("DefaultOFF");

    /** Static value DefaultON for SupportStatus. */
    public static final SupportStatus DEFAULT_ON = fromString("DefaultON");

    /** Static value NotSupported for SupportStatus. */
    public static final SupportStatus NOT_SUPPORTED = fromString("NotSupported");

    /**
     * Creates or finds a SupportStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding SupportStatus
     */
    @JsonCreator
    public static SupportStatus fromString(String name) {
        return fromString(name, SupportStatus.class);
    }

    /**
     * @return known SupportStatus values
     */
    public static Collection<SupportStatus> values() {
        return values(SupportStatus.class);
    }
}
