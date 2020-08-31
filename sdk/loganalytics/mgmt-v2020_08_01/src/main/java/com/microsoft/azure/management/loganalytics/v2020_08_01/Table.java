/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.TableInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.LogAnalyticsManager;

/**
 * Type representing Table.
 */
public interface Table extends HasInner<TableInner>, Indexable, Refreshable<Table>, Updatable<Table.Update>, HasManager<LogAnalyticsManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the retentionInDays value.
     */
    Integer retentionInDays();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a Table update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Table>, UpdateStages.WithRetentionInDays {
    }

    /**
     * Grouping of Table update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the table update allowing to specify RetentionInDays.
         */
        interface WithRetentionInDays {
            /**
             * Specifies retentionInDays.
             * @param retentionInDays The data table data retention in days, between 30 and 730. Setting this property to null will default to the workspace retention
             * @return the next update stage
             */
            Update withRetentionInDays(Integer retentionInDays);
        }

    }
}
