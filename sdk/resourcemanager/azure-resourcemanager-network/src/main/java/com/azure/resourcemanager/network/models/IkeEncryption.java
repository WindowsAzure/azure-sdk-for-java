// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IkeEncryption. */
public final class IkeEncryption extends ExpandableStringEnum<IkeEncryption> {
    /** Static value DES for IkeEncryption. */
    public static final IkeEncryption DES = fromString("DES");

    /** Static value DES3 for IkeEncryption. */
    public static final IkeEncryption DES3 = fromString("DES3");

    /** Static value AES128 for IkeEncryption. */
    public static final IkeEncryption AES128 = fromString("AES128");

    /** Static value AES192 for IkeEncryption. */
    public static final IkeEncryption AES192 = fromString("AES192");

    /** Static value AES256 for IkeEncryption. */
    public static final IkeEncryption AES256 = fromString("AES256");

    /** Static value GCMAES256 for IkeEncryption. */
    public static final IkeEncryption GCMAES256 = fromString("GCMAES256");

    /** Static value GCMAES128 for IkeEncryption. */
    public static final IkeEncryption GCMAES128 = fromString("GCMAES128");

    /**
     * Creates or finds a IkeEncryption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IkeEncryption.
     */
    @JsonCreator
    public static IkeEncryption fromString(String name) {
        return fromString(name, IkeEncryption.class);
    }

    /** @return known IkeEncryption values. */
    public static Collection<IkeEncryption> values() {
        return values(IkeEncryption.class);
    }
}
