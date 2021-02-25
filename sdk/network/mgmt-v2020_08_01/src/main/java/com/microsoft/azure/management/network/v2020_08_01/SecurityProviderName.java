/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SecurityProviderName.
 */
public final class SecurityProviderName extends ExpandableStringEnum<SecurityProviderName> {
    /** Static value ZScaler for SecurityProviderName. */
    public static final SecurityProviderName ZSCALER = fromString("ZScaler");

    /** Static value IBoss for SecurityProviderName. */
    public static final SecurityProviderName IBOSS = fromString("IBoss");

    /** Static value Checkpoint for SecurityProviderName. */
    public static final SecurityProviderName CHECKPOINT = fromString("Checkpoint");

    /**
     * Creates or finds a SecurityProviderName from its string representation.
     * @param name a name to look for
     * @return the corresponding SecurityProviderName
     */
    @JsonCreator
    public static SecurityProviderName fromString(String name) {
        return fromString(name, SecurityProviderName.class);
    }

    /**
     * @return known SecurityProviderName values
     */
    public static Collection<SecurityProviderName> values() {
        return values(SecurityProviderName.class);
    }
}
