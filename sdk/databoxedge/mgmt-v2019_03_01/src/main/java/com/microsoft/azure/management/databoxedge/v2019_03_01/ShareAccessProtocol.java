/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ShareAccessProtocol.
 */
public final class ShareAccessProtocol extends ExpandableStringEnum<ShareAccessProtocol> {
    /** Static value SMB for ShareAccessProtocol. */
    public static final ShareAccessProtocol SMB = fromString("SMB");

    /** Static value NFS for ShareAccessProtocol. */
    public static final ShareAccessProtocol NFS = fromString("NFS");

    /**
     * Creates or finds a ShareAccessProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding ShareAccessProtocol
     */
    @JsonCreator
    public static ShareAccessProtocol fromString(String name) {
        return fromString(name, ShareAccessProtocol.class);
    }

    /**
     * @return known ShareAccessProtocol values
     */
    public static Collection<ShareAccessProtocol> values() {
        return values(ShareAccessProtocol.class);
    }
}
