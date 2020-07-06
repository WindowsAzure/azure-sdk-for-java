// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AuthenticationMethod. */
public final class AuthenticationMethod extends ExpandableStringEnum<AuthenticationMethod> {
    /** Static value EAPTLS for AuthenticationMethod. */
    public static final AuthenticationMethod EAPTLS = fromString("EAPTLS");

    /** Static value EAPMSCHAPv2 for AuthenticationMethod. */
    public static final AuthenticationMethod EAPMSCHAPV2 = fromString("EAPMSCHAPv2");

    /**
     * Creates or finds a AuthenticationMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuthenticationMethod.
     */
    @JsonCreator
    public static AuthenticationMethod fromString(String name) {
        return fromString(name, AuthenticationMethod.class);
    }

    /** @return known AuthenticationMethod values. */
    public static Collection<AuthenticationMethod> values() {
        return values(AuthenticationMethod.class);
    }
}
