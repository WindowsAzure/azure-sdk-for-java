/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MongoDbReplication.
 */
public final class MongoDbReplication extends ExpandableStringEnum<MongoDbReplication> {
    /** Static value Disabled for MongoDbReplication. */
    public static final MongoDbReplication DISABLED = fromString("Disabled");

    /** Static value OneTime for MongoDbReplication. */
    public static final MongoDbReplication ONE_TIME = fromString("OneTime");

    /** Static value Continuous for MongoDbReplication. */
    public static final MongoDbReplication CONTINUOUS = fromString("Continuous");

    /**
     * Creates or finds a MongoDbReplication from its string representation.
     * @param name a name to look for
     * @return the corresponding MongoDbReplication
     */
    @JsonCreator
    public static MongoDbReplication fromString(String name) {
        return fromString(name, MongoDbReplication.class);
    }

    /**
     * @return known MongoDbReplication values
     */
    public static Collection<MongoDbReplication> values() {
        return values(MongoDbReplication.class);
    }
}
