/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PhoenixAuthenticationType.
 */
public final class PhoenixAuthenticationType extends ExpandableStringEnum<PhoenixAuthenticationType> {
    /** Static value Anonymous for PhoenixAuthenticationType. */
    public static final PhoenixAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value UsernameAndPassword for PhoenixAuthenticationType. */
    public static final PhoenixAuthenticationType USERNAME_AND_PASSWORD = fromString("UsernameAndPassword");

    /** Static value WindowsAzureHDInsightService for PhoenixAuthenticationType. */
    public static final PhoenixAuthenticationType WINDOWS_AZURE_HDINSIGHT_SERVICE = fromString("WindowsAzureHDInsightService");

    /**
     * Creates or finds a PhoenixAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding PhoenixAuthenticationType
     */
    @JsonCreator
    public static PhoenixAuthenticationType fromString(String name) {
        return fromString(name, PhoenixAuthenticationType.class);
    }

    /**
     * @return known PhoenixAuthenticationType values
     */
    public static Collection<PhoenixAuthenticationType> values() {
        return values(PhoenixAuthenticationType.class);
    }
}
