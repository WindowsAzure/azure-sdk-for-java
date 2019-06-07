/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IpFlowProtocol.
 */
public final class IpFlowProtocol extends ExpandableStringEnum<IpFlowProtocol> {
    /** Static value TCP for IpFlowProtocol. */
    public static final IpFlowProtocol TCP = fromString("TCP");

    /** Static value UDP for IpFlowProtocol. */
    public static final IpFlowProtocol UDP = fromString("UDP");

    /**
     * Creates or finds a IpFlowProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding IpFlowProtocol
     */
    @JsonCreator
    public static IpFlowProtocol fromString(String name) {
        return fromString(name, IpFlowProtocol.class);
    }

    /**
     * @return known IpFlowProtocol values
     */
    public static Collection<IpFlowProtocol> values() {
        return values(IpFlowProtocol.class);
    }
}
