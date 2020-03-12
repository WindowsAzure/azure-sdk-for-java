/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MinimalTlsVersionEnum.
 */
public final class MinimalTlsVersionEnum extends ExpandableStringEnum<MinimalTlsVersionEnum> {
    /** Static value TLS1_0 for MinimalTlsVersionEnum. */
    public static final MinimalTlsVersionEnum TLS1_0 = fromString("TLS1_0");

    /** Static value TLS1_1 for MinimalTlsVersionEnum. */
    public static final MinimalTlsVersionEnum TLS1_1 = fromString("TLS1_1");

    /** Static value TLS1_2 for MinimalTlsVersionEnum. */
    public static final MinimalTlsVersionEnum TLS1_2 = fromString("TLS1_2");

    /** Static value TLSEnforcementDisabled for MinimalTlsVersionEnum. */
    public static final MinimalTlsVersionEnum TLSENFORCEMENT_DISABLED = fromString("TLSEnforcementDisabled");

    /**
     * Creates or finds a MinimalTlsVersionEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding MinimalTlsVersionEnum
     */
    @JsonCreator
    public static MinimalTlsVersionEnum fromString(String name) {
        return fromString(name, MinimalTlsVersionEnum.class);
    }

    /**
     * @return known MinimalTlsVersionEnum values
     */
    public static Collection<MinimalTlsVersionEnum> values() {
        return values(MinimalTlsVersionEnum.class);
    }
}
