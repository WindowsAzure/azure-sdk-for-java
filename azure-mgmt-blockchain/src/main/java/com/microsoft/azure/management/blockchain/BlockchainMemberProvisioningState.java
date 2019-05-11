/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.blockchain;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BlockchainMemberProvisioningState.
 */
public final class BlockchainMemberProvisioningState extends ExpandableStringEnum<BlockchainMemberProvisioningState> {
    /** Static value NotSpecified for BlockchainMemberProvisioningState. */
    public static final BlockchainMemberProvisioningState NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Updating for BlockchainMemberProvisioningState. */
    public static final BlockchainMemberProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for BlockchainMemberProvisioningState. */
    public static final BlockchainMemberProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for BlockchainMemberProvisioningState. */
    public static final BlockchainMemberProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for BlockchainMemberProvisioningState. */
    public static final BlockchainMemberProvisioningState FAILED = fromString("Failed");

    /** Static value Stale for BlockchainMemberProvisioningState. */
    public static final BlockchainMemberProvisioningState STALE = fromString("Stale");

    /**
     * Creates or finds a BlockchainMemberProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding BlockchainMemberProvisioningState
     */
    @JsonCreator
    public static BlockchainMemberProvisioningState fromString(String name) {
        return fromString(name, BlockchainMemberProvisioningState.class);
    }

    /**
     * @return known BlockchainMemberProvisioningState values
     */
    public static Collection<BlockchainMemberProvisioningState> values() {
        return values(BlockchainMemberProvisioningState.class);
    }
}
