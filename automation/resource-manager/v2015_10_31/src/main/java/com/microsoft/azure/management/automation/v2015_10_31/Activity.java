/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.ActivityInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Activity.
 */
public interface Activity extends HasInner<ActivityInner>, Indexable, Refreshable<Activity>, HasManager<AutomationManager> {
    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the definition value.
     */
    String definition();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outputTypes value.
     */
    List<ActivityOutputType> outputTypes();

    /**
     * @return the parameterSets value.
     */
    List<ActivityParameterSet> parameterSets();

}
