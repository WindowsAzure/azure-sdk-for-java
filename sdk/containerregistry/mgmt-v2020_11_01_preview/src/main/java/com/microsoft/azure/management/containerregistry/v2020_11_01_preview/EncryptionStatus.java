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
 * Defines values for EncryptionStatus.
 */
public final class EncryptionStatus extends ExpandableStringEnum<EncryptionStatus> {
    /** Static value enabled for EncryptionStatus. */
    public static final EncryptionStatus ENABLED = fromString("enabled");

    /** Static value disabled for EncryptionStatus. */
    public static final EncryptionStatus DISABLED = fromString("disabled");

    /**
     * Creates or finds a EncryptionStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding EncryptionStatus
     */
    @JsonCreator
    public static EncryptionStatus fromString(String name) {
        return fromString(name, EncryptionStatus.class);
    }

    /**
     * @return known EncryptionStatus values
     */
    public static Collection<EncryptionStatus> values() {
        return values(EncryptionStatus.class);
    }
}
