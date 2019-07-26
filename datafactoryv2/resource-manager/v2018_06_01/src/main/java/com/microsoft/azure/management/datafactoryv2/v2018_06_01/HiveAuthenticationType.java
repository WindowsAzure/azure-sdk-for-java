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
 * Defines values for HiveAuthenticationType.
 */
public final class HiveAuthenticationType extends ExpandableStringEnum<HiveAuthenticationType> {
    /** Static value Anonymous for HiveAuthenticationType. */
    public static final HiveAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Username for HiveAuthenticationType. */
    public static final HiveAuthenticationType USERNAME = fromString("Username");

    /** Static value UsernameAndPassword for HiveAuthenticationType. */
    public static final HiveAuthenticationType USERNAME_AND_PASSWORD = fromString("UsernameAndPassword");

    /** Static value WindowsAzureHDInsightService for HiveAuthenticationType. */
    public static final HiveAuthenticationType WINDOWS_AZURE_HDINSIGHT_SERVICE = fromString("WindowsAzureHDInsightService");

    /**
     * Creates or finds a HiveAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding HiveAuthenticationType
     */
    @JsonCreator
    public static HiveAuthenticationType fromString(String name) {
        return fromString(name, HiveAuthenticationType.class);
    }

    /**
     * @return known HiveAuthenticationType values
     */
    public static Collection<HiveAuthenticationType> values() {
        return values(HiveAuthenticationType.class);
    }
}
