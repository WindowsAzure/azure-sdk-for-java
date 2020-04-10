/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.batch.v2017_05_01.implementation.ApplicationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batch.v2017_05_01.implementation.BatchManager;
import java.util.List;

/**
 * Type representing Application.
 */
public interface Application extends HasInner<ApplicationInner>, Indexable, Refreshable<Application>, HasManager<BatchManager> {
    /**
     * @return the allowUpdates value.
     */
    Boolean allowUpdates();

    /**
     * @return the defaultVersion value.
     */
    String defaultVersion();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the packages value.
     */
    List<ApplicationPackage> packages();

}
