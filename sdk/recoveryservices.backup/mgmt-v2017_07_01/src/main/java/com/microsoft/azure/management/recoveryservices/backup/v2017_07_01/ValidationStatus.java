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
 * Defines values for ValidationStatus.
 */
public final class ValidationStatus extends ExpandableStringEnum<ValidationStatus> {
    /** Static value Invalid for ValidationStatus. */
    public static final ValidationStatus INVALID = fromString("Invalid");

    /** Static value Succeeded for ValidationStatus. */
    public static final ValidationStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ValidationStatus. */
    public static final ValidationStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ValidationStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ValidationStatus
     */
    @JsonCreator
    public static ValidationStatus fromString(String name) {
        return fromString(name, ValidationStatus.class);
    }

    /**
     * @return known ValidationStatus values
     */
    public static Collection<ValidationStatus> values() {
        return values(ValidationStatus.class);
    }
}
