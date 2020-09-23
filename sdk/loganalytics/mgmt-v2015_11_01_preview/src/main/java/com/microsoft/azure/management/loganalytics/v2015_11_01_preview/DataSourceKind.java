/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DataSourceKind.
 */
public final class DataSourceKind extends ExpandableStringEnum<DataSourceKind> {
    /** Static value AzureActivityLog for DataSourceKind. */
    public static final DataSourceKind AZURE_ACTIVITY_LOG = fromString("AzureActivityLog");

    /** Static value ChangeTrackingPath for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_PATH = fromString("ChangeTrackingPath");

    /** Static value ChangeTrackingDefaultPath for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_DEFAULT_PATH = fromString("ChangeTrackingDefaultPath");

    /** Static value ChangeTrackingDefaultRegistry for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_DEFAULT_REGISTRY = fromString("ChangeTrackingDefaultRegistry");

    /** Static value ChangeTrackingCustomRegistry for DataSourceKind. */
    public static final DataSourceKind CHANGE_TRACKING_CUSTOM_REGISTRY = fromString("ChangeTrackingCustomRegistry");

    /** Static value CustomLog for DataSourceKind. */
    public static final DataSourceKind CUSTOM_LOG = fromString("CustomLog");

    /** Static value CustomLogCollection for DataSourceKind. */
    public static final DataSourceKind CUSTOM_LOG_COLLECTION = fromString("CustomLogCollection");

    /** Static value GenericDataSource for DataSourceKind. */
    public static final DataSourceKind GENERIC_DATA_SOURCE = fromString("GenericDataSource");

    /** Static value IISLogs for DataSourceKind. */
    public static final DataSourceKind IISLOGS = fromString("IISLogs");

    /** Static value LinuxPerformanceObject for DataSourceKind. */
    public static final DataSourceKind LINUX_PERFORMANCE_OBJECT = fromString("LinuxPerformanceObject");

    /** Static value LinuxPerformanceCollection for DataSourceKind. */
    public static final DataSourceKind LINUX_PERFORMANCE_COLLECTION = fromString("LinuxPerformanceCollection");

    /** Static value LinuxSyslog for DataSourceKind. */
    public static final DataSourceKind LINUX_SYSLOG = fromString("LinuxSyslog");

    /** Static value LinuxSyslogCollection for DataSourceKind. */
    public static final DataSourceKind LINUX_SYSLOG_COLLECTION = fromString("LinuxSyslogCollection");

    /** Static value WindowsEvent for DataSourceKind. */
    public static final DataSourceKind WINDOWS_EVENT = fromString("WindowsEvent");

    /** Static value WindowsPerformanceCounter for DataSourceKind. */
    public static final DataSourceKind WINDOWS_PERFORMANCE_COUNTER = fromString("WindowsPerformanceCounter");

    /**
     * Creates or finds a DataSourceKind from its string representation.
     * @param name a name to look for
     * @return the corresponding DataSourceKind
     */
    @JsonCreator
    public static DataSourceKind fromString(String name) {
        return fromString(name, DataSourceKind.class);
    }

    /**
     * @return known DataSourceKind values
     */
    public static Collection<DataSourceKind> values() {
        return values(DataSourceKind.class);
    }
}
