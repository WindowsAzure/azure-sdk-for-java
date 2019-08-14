/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SsisMigrationStage.
 */
public final class SsisMigrationStage extends ExpandableStringEnum<SsisMigrationStage> {
    /** Static value None for SsisMigrationStage. */
    public static final SsisMigrationStage NONE = fromString("None");

    /** Static value Initialize for SsisMigrationStage. */
    public static final SsisMigrationStage INITIALIZE = fromString("Initialize");

    /** Static value InProgress for SsisMigrationStage. */
    public static final SsisMigrationStage IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for SsisMigrationStage. */
    public static final SsisMigrationStage COMPLETED = fromString("Completed");

    /**
     * Creates or finds a SsisMigrationStage from its string representation.
     * @param name a name to look for
     * @return the corresponding SsisMigrationStage
     */
    @JsonCreator
    public static SsisMigrationStage fromString(String name) {
        return fromString(name, SsisMigrationStage.class);
    }

    /**
     * @return known SsisMigrationStage values
     */
    public static Collection<SsisMigrationStage> values() {
        return values(SsisMigrationStage.class);
    }
}
