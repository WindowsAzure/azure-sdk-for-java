/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.RestorePointInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import org.joda.time.DateTime;

/**
 * Type representing RestorePoint.
 */
public interface RestorePoint extends HasInner<RestorePointInner>, HasManager<SqlManager> {
    /**
     * @return the earliestRestoreDate value.
     */
    DateTime earliestRestoreDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the restorePointCreationDate value.
     */
    DateTime restorePointCreationDate();

    /**
     * @return the restorePointType value.
     */
    RestorePointType restorePointType();

    /**
     * @return the type value.
     */
    String type();

}
