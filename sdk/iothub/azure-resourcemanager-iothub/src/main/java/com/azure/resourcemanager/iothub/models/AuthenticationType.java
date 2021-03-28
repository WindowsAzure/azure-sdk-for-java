// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AuthenticationType. */
public final class AuthenticationType extends ExpandableStringEnum<AuthenticationType> {
    /** Static value keyBased for AuthenticationType. */
    public static final AuthenticationType KEY_BASED = fromString("keyBased");

    /** Static value identityBased for AuthenticationType. */
    public static final AuthenticationType IDENTITY_BASED = fromString("identityBased");

    /**
     * Creates or finds a AuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuthenticationType.
     */
    @JsonCreator
    public static AuthenticationType fromString(String name) {
        return fromString(name, AuthenticationType.class);
    }

    /** @return known AuthenticationType values. */
    public static Collection<AuthenticationType> values() {
        return values(AuthenticationType.class);
    }
}
