/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SqlPoolSchemaInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SynapseManager;

/**
 * Type representing SqlPoolSchema.
 */
public interface SqlPoolSchema extends HasInner<SqlPoolSchemaInner>, Indexable, Refreshable<SqlPoolSchema>, HasManager<SynapseManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
