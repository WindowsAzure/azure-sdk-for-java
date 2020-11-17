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
 * Defines values for SparkAuthenticationType.
 */
public final class SparkAuthenticationType extends ExpandableStringEnum<SparkAuthenticationType> {
    /** Static value Anonymous for SparkAuthenticationType. */
    public static final SparkAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Username for SparkAuthenticationType. */
    public static final SparkAuthenticationType USERNAME = fromString("Username");

    /** Static value UsernameAndPassword for SparkAuthenticationType. */
    public static final SparkAuthenticationType USERNAME_AND_PASSWORD = fromString("UsernameAndPassword");

    /** Static value WindowsAzureHDInsightService for SparkAuthenticationType. */
    public static final SparkAuthenticationType WINDOWS_AZURE_HDINSIGHT_SERVICE = fromString("WindowsAzureHDInsightService");

    /**
     * Creates or finds a SparkAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding SparkAuthenticationType
     */
    @JsonCreator
    public static SparkAuthenticationType fromString(String name) {
        return fromString(name, SparkAuthenticationType.class);
    }

    /**
     * @return known SparkAuthenticationType values
     */
    public static Collection<SparkAuthenticationType> values() {
        return values(SparkAuthenticationType.class);
    }
}
