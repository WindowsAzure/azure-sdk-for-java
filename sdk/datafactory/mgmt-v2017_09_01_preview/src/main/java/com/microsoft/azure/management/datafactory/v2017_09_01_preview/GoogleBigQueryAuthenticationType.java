/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for GoogleBigQueryAuthenticationType.
 */
public final class GoogleBigQueryAuthenticationType extends ExpandableStringEnum<GoogleBigQueryAuthenticationType> {
    /** Static value ServiceAuthentication for GoogleBigQueryAuthenticationType. */
    public static final GoogleBigQueryAuthenticationType SERVICE_AUTHENTICATION = fromString("ServiceAuthentication");

    /** Static value UserAuthentication for GoogleBigQueryAuthenticationType. */
    public static final GoogleBigQueryAuthenticationType USER_AUTHENTICATION = fromString("UserAuthentication");

    /**
     * Creates or finds a GoogleBigQueryAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding GoogleBigQueryAuthenticationType
     */
    @JsonCreator
    public static GoogleBigQueryAuthenticationType fromString(String name) {
        return fromString(name, GoogleBigQueryAuthenticationType.class);
    }

    /**
     * @return known GoogleBigQueryAuthenticationType values
     */
    public static Collection<GoogleBigQueryAuthenticationType> values() {
        return values(GoogleBigQueryAuthenticationType.class);
    }
}
