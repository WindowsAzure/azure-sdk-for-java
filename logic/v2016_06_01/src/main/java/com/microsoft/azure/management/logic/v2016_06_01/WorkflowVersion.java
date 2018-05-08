/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowVersionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing WorkflowVersion.
 */
public interface WorkflowVersion extends HasInner<WorkflowVersionInner>, Indexable, Refreshable<WorkflowVersion>, HasManager<LogicManager> {
    /**
     * @return the accessEndpoint value.
     */
    String accessEndpoint();

    /**
     * @return the changedTime value.
     */
    DateTime changedTime();

    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the definition value.
     */
    Object definition();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the integrationAccount value.
     */
    ResourceReference integrationAccount();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    Map<String, WorkflowParameter> parameters();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the state value.
     */
    WorkflowState state();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the version value.
     */
    String version();

}
