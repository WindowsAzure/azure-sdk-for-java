// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LoginType. */
public final class LoginType extends ExpandableStringEnum<LoginType> {
    /** Static value WindowsUser for LoginType. */
    public static final LoginType WINDOWS_USER = fromString("WindowsUser");

    /** Static value WindowsGroup for LoginType. */
    public static final LoginType WINDOWS_GROUP = fromString("WindowsGroup");

    /** Static value SqlLogin for LoginType. */
    public static final LoginType SQL_LOGIN = fromString("SqlLogin");

    /** Static value Certificate for LoginType. */
    public static final LoginType CERTIFICATE = fromString("Certificate");

    /** Static value AsymmetricKey for LoginType. */
    public static final LoginType ASYMMETRIC_KEY = fromString("AsymmetricKey");

    /** Static value ExternalUser for LoginType. */
    public static final LoginType EXTERNAL_USER = fromString("ExternalUser");

    /** Static value ExternalGroup for LoginType. */
    public static final LoginType EXTERNAL_GROUP = fromString("ExternalGroup");

    /**
     * Creates or finds a LoginType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoginType.
     */
    @JsonCreator
    public static LoginType fromString(String name) {
        return fromString(name, LoginType.class);
    }

    /** @return known LoginType values. */
    public static Collection<LoginType> values() {
        return values(LoginType.class);
    }
}
