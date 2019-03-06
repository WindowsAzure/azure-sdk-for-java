/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ODataAuthenticationType.
 */
public final class ODataAuthenticationType extends ExpandableStringEnum<ODataAuthenticationType> {
    /** Static value Basic for ODataAuthenticationType. */
    public static final ODataAuthenticationType BASIC = fromString("Basic");

    /** Static value Anonymous for ODataAuthenticationType. */
    public static final ODataAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Windows for ODataAuthenticationType. */
    public static final ODataAuthenticationType WINDOWS = fromString("Windows");

    /** Static value AadServicePrincipal for ODataAuthenticationType. */
    public static final ODataAuthenticationType AAD_SERVICE_PRINCIPAL = fromString("AadServicePrincipal");

    /** Static value ManagedServiceIdentity for ODataAuthenticationType. */
    public static final ODataAuthenticationType MANAGED_SERVICE_IDENTITY = fromString("ManagedServiceIdentity");

    /**
     * Creates or finds a ODataAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding ODataAuthenticationType
     */
    @JsonCreator
    public static ODataAuthenticationType fromString(String name) {
        return fromString(name, ODataAuthenticationType.class);
    }

    /**
     * @return known ODataAuthenticationType values
     */
    public static Collection<ODataAuthenticationType> values() {
        return values(ODataAuthenticationType.class);
    }
}
