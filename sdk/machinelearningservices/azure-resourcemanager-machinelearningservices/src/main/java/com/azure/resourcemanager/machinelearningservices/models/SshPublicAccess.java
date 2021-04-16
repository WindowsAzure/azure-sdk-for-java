// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SshPublicAccess. */
public final class SshPublicAccess extends ExpandableStringEnum<SshPublicAccess> {
    /** Static value Enabled for SshPublicAccess. */
    public static final SshPublicAccess ENABLED = fromString("Enabled");

    /** Static value Disabled for SshPublicAccess. */
    public static final SshPublicAccess DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SshPublicAccess from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SshPublicAccess.
     */
    @JsonCreator
    public static SshPublicAccess fromString(String name) {
        return fromString(name, SshPublicAccess.class);
    }

    /** @return known SshPublicAccess values. */
    public static Collection<SshPublicAccess> values() {
        return values(SshPublicAccess.class);
    }
}
