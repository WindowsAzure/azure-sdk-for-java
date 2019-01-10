/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.QueryTextInner;

/**
 * Type representing QueryText.
 */
public interface QueryText extends HasInner<QueryTextInner>, HasManager<SqlManager> {
    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the queryText value.
     */
    String queryText();

    /**
     * @return the type value.
     */
    String type();

}
