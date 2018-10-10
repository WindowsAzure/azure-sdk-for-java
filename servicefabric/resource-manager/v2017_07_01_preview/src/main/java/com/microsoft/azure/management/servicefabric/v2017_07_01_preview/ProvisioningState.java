/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProvisioningState.
 */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /** Static value Updating for ProvisioningState. */
    public static final ProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for ProvisioningState. */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ProvisioningState. */
    public static final ProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ProvisioningState. */
    public static final ProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a ProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding ProvisioningState
     */
    @JsonCreator
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /**
     * @return known ProvisioningState values
     */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
