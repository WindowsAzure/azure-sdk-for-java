// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.azure.security.keyvault.keys.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Defines values for KeyCurveName.
 */
public final class KeyCurveName extends ExpandableStringEnum<KeyCurveName> {

    /**
     * Static value P-256 for KeyCurveName.
     */
    public static final KeyCurveName P_256 = fromString("P-256");

    /**
     * Static value P-384 for KeyCurveName.
     */
    public static final KeyCurveName P_384 = fromString("P-384");

    /**
     * Static value P-521 for KeyCurveName.
     */
    public static final KeyCurveName P_521 = fromString("P-521");

    /**
     * Static value P-256K for KeyCurve.
     */
    public static final KeyCurveName P_256K = fromString("P-256K");

    /**
     * Creates or finds a KeyCurveName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyCurve.
     */
    @JsonCreator
    public static KeyCurveName fromString(String name) {
        return fromString(name, KeyCurveName.class);
    }

    /**
     * @return known KeyCurveName values.
     */
    public static Collection<KeyCurveName> values() {
        return values(KeyCurveName.class);
    }
}
