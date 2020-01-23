/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_05_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataFormat.
 */
public final class DataFormat extends ExpandableStringEnum<DataFormat> {
    /** Static value MULTIJSON for DataFormat. */
    public static final DataFormat MULTIJSON = fromString("MULTIJSON");

    /** Static value JSON for DataFormat. */
    public static final DataFormat JSON = fromString("JSON");

    /** Static value CSV for DataFormat. */
    public static final DataFormat CSV = fromString("CSV");

    /** Static value TSV for DataFormat. */
    public static final DataFormat TSV = fromString("TSV");

    /** Static value SCSV for DataFormat. */
    public static final DataFormat SCSV = fromString("SCSV");

    /** Static value SOHSV for DataFormat. */
    public static final DataFormat SOHSV = fromString("SOHSV");

    /** Static value PSV for DataFormat. */
    public static final DataFormat PSV = fromString("PSV");

    /** Static value TXT for DataFormat. */
    public static final DataFormat TXT = fromString("TXT");

    /** Static value RAW for DataFormat. */
    public static final DataFormat RAW = fromString("RAW");

    /** Static value SINGLEJSON for DataFormat. */
    public static final DataFormat SINGLEJSON = fromString("SINGLEJSON");

    /** Static value AVRO for DataFormat. */
    public static final DataFormat AVRO = fromString("AVRO");

    /** Static value TSVE for DataFormat. */
    public static final DataFormat TSVE = fromString("TSVE");

    /**
     * Creates or finds a DataFormat from its string representation.
     * @param name a name to look for
     * @return the corresponding DataFormat
     */
    @JsonCreator
    public static DataFormat fromString(String name) {
        return fromString(name, DataFormat.class);
    }

    /**
     * @return known DataFormat values
     */
    public static Collection<DataFormat> values() {
        return values(DataFormat.class);
    }
}
