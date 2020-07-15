/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_06_14;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IotHubDataFormat.
 */
public final class IotHubDataFormat extends ExpandableStringEnum<IotHubDataFormat> {
    /** Static value MULTIJSON for IotHubDataFormat. */
    public static final IotHubDataFormat MULTIJSON = fromString("MULTIJSON");

    /** Static value JSON for IotHubDataFormat. */
    public static final IotHubDataFormat JSON = fromString("JSON");

    /** Static value CSV for IotHubDataFormat. */
    public static final IotHubDataFormat CSV = fromString("CSV");

    /** Static value TSV for IotHubDataFormat. */
    public static final IotHubDataFormat TSV = fromString("TSV");

    /** Static value SCSV for IotHubDataFormat. */
    public static final IotHubDataFormat SCSV = fromString("SCSV");

    /** Static value SOHSV for IotHubDataFormat. */
    public static final IotHubDataFormat SOHSV = fromString("SOHSV");

    /** Static value PSV for IotHubDataFormat. */
    public static final IotHubDataFormat PSV = fromString("PSV");

    /** Static value TXT for IotHubDataFormat. */
    public static final IotHubDataFormat TXT = fromString("TXT");

    /** Static value RAW for IotHubDataFormat. */
    public static final IotHubDataFormat RAW = fromString("RAW");

    /** Static value SINGLEJSON for IotHubDataFormat. */
    public static final IotHubDataFormat SINGLEJSON = fromString("SINGLEJSON");

    /** Static value AVRO for IotHubDataFormat. */
    public static final IotHubDataFormat AVRO = fromString("AVRO");

    /** Static value TSVE for IotHubDataFormat. */
    public static final IotHubDataFormat TSVE = fromString("TSVE");

    /** Static value PARQUET for IotHubDataFormat. */
    public static final IotHubDataFormat PARQUET = fromString("PARQUET");

    /** Static value ORC for IotHubDataFormat. */
    public static final IotHubDataFormat ORC = fromString("ORC");

    /** Static value APACHEAVRO for IotHubDataFormat. */
    public static final IotHubDataFormat APACHEAVRO = fromString("APACHEAVRO");

    /** Static value W3CLOGFILE for IotHubDataFormat. */
    public static final IotHubDataFormat W3CLOGFILE = fromString("W3CLOGFILE");

    /**
     * Creates or finds a IotHubDataFormat from its string representation.
     * @param name a name to look for
     * @return the corresponding IotHubDataFormat
     */
    @JsonCreator
    public static IotHubDataFormat fromString(String name) {
        return fromString(name, IotHubDataFormat.class);
    }

    /**
     * @return known IotHubDataFormat values
     */
    public static Collection<IotHubDataFormat> values() {
        return values(IotHubDataFormat.class);
    }
}
