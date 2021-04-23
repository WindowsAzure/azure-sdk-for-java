// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TransparentDataEncryptionName. */
public final class TransparentDataEncryptionName extends ExpandableStringEnum<TransparentDataEncryptionName> {
    /** Static value current for TransparentDataEncryptionName. */
    public static final TransparentDataEncryptionName CURRENT = fromString("current");

    /**
     * Creates or finds a TransparentDataEncryptionName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TransparentDataEncryptionName.
     */
    @JsonCreator
    public static TransparentDataEncryptionName fromString(String name) {
        return fromString(name, TransparentDataEncryptionName.class);
    }

    /** @return known TransparentDataEncryptionName values. */
    public static Collection<TransparentDataEncryptionName> values() {
        return values(TransparentDataEncryptionName.class);
    }
}
