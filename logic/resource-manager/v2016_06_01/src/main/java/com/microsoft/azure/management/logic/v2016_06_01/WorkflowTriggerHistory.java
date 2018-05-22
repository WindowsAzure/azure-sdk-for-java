/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.ResourceReferenceInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowTriggerHistoryInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import org.joda.time.DateTime;

/**
 * Type representing WorkflowTriggerHistory.
 */
public interface WorkflowTriggerHistory extends HasInner<WorkflowTriggerHistoryInner>, Indexable, Refreshable<WorkflowTriggerHistory>, HasManager<LogicManager> {
    /**
     * @return the code value.
     */
    String code();

    /**
     * @return the correlation value.
     */
    Correlation correlation();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the error value.
     */
    Object error();

    /**
     * @return the fired value.
     */
    Boolean fired();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the inputsLink value.
     */
    ContentLink inputsLink();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outputsLink value.
     */
    ContentLink outputsLink();

    /**
     * @return the run value.
     */
    ResourceReferenceInner run();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    WorkflowStatus status();

    /**
     * @return the trackingId value.
     */
    String trackingId();

    /**
     * @return the type value.
     */
    String type();

}
