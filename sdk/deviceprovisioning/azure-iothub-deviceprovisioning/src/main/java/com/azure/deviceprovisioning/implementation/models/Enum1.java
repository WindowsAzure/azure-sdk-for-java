// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.deviceprovisioning.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Enum1. */
public final class Enum1 extends ExpandableStringEnum<Enum1> {
    /** Static value symmetricKey for Enum1. */
    public static final Enum1 SYMMETRIC_KEY = fromString("symmetricKey");

    /** Static value x509Certificate for Enum1. */
    public static final Enum1 X509CERTIFICATE = fromString("x509Certificate");

    /** Static value all for Enum1. */
    public static final Enum1 ALL = fromString("all");

    /**
     * Creates or finds a Enum1 from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enum1.
     */
    @JsonCreator
    public static Enum1 fromString(String name) {
        return fromString(name, Enum1.class);
    }

    /** @return known Enum1 values. */
    public static Collection<Enum1> values() {
        return values(Enum1.class);
    }
}
