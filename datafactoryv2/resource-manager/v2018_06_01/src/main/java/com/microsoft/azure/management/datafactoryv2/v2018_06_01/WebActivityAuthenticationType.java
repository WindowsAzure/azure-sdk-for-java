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
 * Defines values for WebActivityAuthenticationType.
 */
public final class WebActivityAuthenticationType extends ExpandableStringEnum<WebActivityAuthenticationType> {
    /** Static value Basic for WebActivityAuthenticationType. */
    public static final WebActivityAuthenticationType BASIC = fromString("Basic");

    /** Static value ClientCertificate for WebActivityAuthenticationType. */
    public static final WebActivityAuthenticationType CLIENT_CERTIFICATE = fromString("ClientCertificate");

    /** Static value MSI for WebActivityAuthenticationType. */
    public static final WebActivityAuthenticationType MSI = fromString("MSI");

    /**
     * Creates or finds a WebActivityAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding WebActivityAuthenticationType
     */
    @JsonCreator
    public static WebActivityAuthenticationType fromString(String name) {
        return fromString(name, WebActivityAuthenticationType.class);
    }

    /**
     * @return known WebActivityAuthenticationType values
     */
    public static Collection<WebActivityAuthenticationType> values() {
        return values(WebActivityAuthenticationType.class);
    }
}
