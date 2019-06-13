/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for GrantType.
 */
public final class GrantType extends ExpandableStringEnum<GrantType> {
    /** Static value authorizationCode for GrantType. */
    public static final GrantType AUTHORIZATION_CODE = fromString("authorizationCode");

    /** Static value implicit for GrantType. */
    public static final GrantType IMPLICIT = fromString("implicit");

    /** Static value resourceOwnerPassword for GrantType. */
    public static final GrantType RESOURCE_OWNER_PASSWORD = fromString("resourceOwnerPassword");

    /** Static value clientCredentials for GrantType. */
    public static final GrantType CLIENT_CREDENTIALS = fromString("clientCredentials");

    /**
     * Creates or finds a GrantType from its string representation.
     * @param name a name to look for
     * @return the corresponding GrantType
     */
    @JsonCreator
    public static GrantType fromString(String name) {
        return fromString(name, GrantType.class);
    }

    /**
     * @return known GrantType values
     */
    public static Collection<GrantType> values() {
        return values(GrantType.class);
    }
}
