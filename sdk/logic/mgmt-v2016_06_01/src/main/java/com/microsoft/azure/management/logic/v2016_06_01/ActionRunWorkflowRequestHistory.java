/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.RequestHistoryInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import java.util.Map;

/**
 * Type representing ActionRunWorkflowRequestHistory.
 */
public interface ActionRunWorkflowRequestHistory extends HasInner<RequestHistoryInner>, Indexable, Refreshable<ActionRunWorkflowRequestHistory>, HasManager<LogicManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    RequestHistoryProperties properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
