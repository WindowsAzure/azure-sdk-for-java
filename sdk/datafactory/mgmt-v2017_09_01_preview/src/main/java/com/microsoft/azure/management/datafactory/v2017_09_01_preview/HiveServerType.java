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
 * Defines values for HiveServerType.
 */
public final class HiveServerType extends ExpandableStringEnum<HiveServerType> {
    /** Static value HiveServer1 for HiveServerType. */
    public static final HiveServerType HIVE_SERVER1 = fromString("HiveServer1");

    /** Static value HiveServer2 for HiveServerType. */
    public static final HiveServerType HIVE_SERVER2 = fromString("HiveServer2");

    /** Static value HiveThriftServer for HiveServerType. */
    public static final HiveServerType HIVE_THRIFT_SERVER = fromString("HiveThriftServer");

    /**
     * Creates or finds a HiveServerType from its string representation.
     * @param name a name to look for
     * @return the corresponding HiveServerType
     */
    @JsonCreator
    public static HiveServerType fromString(String name) {
        return fromString(name, HiveServerType.class);
    }

    /**
     * @return known HiveServerType values
     */
    public static Collection<HiveServerType> values() {
        return values(HiveServerType.class);
    }
}
