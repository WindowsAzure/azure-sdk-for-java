/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.support.v2020_04_01.implementation.ProblemClassificationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.support.v2020_04_01.implementation.SupportManager;

/**
 * Type representing ProblemClassification.
 */
public interface ProblemClassification extends HasInner<ProblemClassificationInner>, Indexable, Refreshable<ProblemClassification>, HasManager<SupportManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

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
