/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AlternateLocationRecoveryOption.
 */
public final class AlternateLocationRecoveryOption extends ExpandableStringEnum<AlternateLocationRecoveryOption> {
    /** Static value CreateVmIfNotFound for AlternateLocationRecoveryOption. */
    public static final AlternateLocationRecoveryOption CREATE_VM_IF_NOT_FOUND = fromString("CreateVmIfNotFound");

    /** Static value NoAction for AlternateLocationRecoveryOption. */
    public static final AlternateLocationRecoveryOption NO_ACTION = fromString("NoAction");

    /**
     * Creates or finds a AlternateLocationRecoveryOption from its string representation.
     * @param name a name to look for
     * @return the corresponding AlternateLocationRecoveryOption
     */
    @JsonCreator
    public static AlternateLocationRecoveryOption fromString(String name) {
        return fromString(name, AlternateLocationRecoveryOption.class);
    }

    /**
     * @return known AlternateLocationRecoveryOption values
     */
    public static Collection<AlternateLocationRecoveryOption> values() {
        return values(AlternateLocationRecoveryOption.class);
    }
}
