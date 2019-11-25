/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerListCallbackUrlQueries;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow trigger callback URL.
 */
public class WorkflowTriggerCallbackUrlInner {
    /**
     * Gets the workflow trigger callback URL.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Gets the workflow trigger callback URL HTTP method.
     */
    @JsonProperty(value = "method", access = JsonProperty.Access.WRITE_ONLY)
    private String method;

    /**
     * Gets the workflow trigger callback URL base path.
     */
    @JsonProperty(value = "basePath", access = JsonProperty.Access.WRITE_ONLY)
    private String basePath;

    /**
     * Gets the workflow trigger callback URL relative path.
     */
    @JsonProperty(value = "relativePath", access = JsonProperty.Access.WRITE_ONLY)
    private String relativePath;

    /**
     * Gets the workflow trigger callback URL relative path parameters.
     */
    @JsonProperty(value = "relativePathParameters")
    private List<String> relativePathParameters;

    /**
     * Gets the workflow trigger callback URL query parameters.
     */
    @JsonProperty(value = "queries")
    private WorkflowTriggerListCallbackUrlQueries queries;

    /**
     * Get gets the workflow trigger callback URL.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Get gets the workflow trigger callback URL HTTP method.
     *
     * @return the method value
     */
    public String method() {
        return this.method;
    }

    /**
     * Get gets the workflow trigger callback URL base path.
     *
     * @return the basePath value
     */
    public String basePath() {
        return this.basePath;
    }

    /**
     * Get gets the workflow trigger callback URL relative path.
     *
     * @return the relativePath value
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Get gets the workflow trigger callback URL relative path parameters.
     *
     * @return the relativePathParameters value
     */
    public List<String> relativePathParameters() {
        return this.relativePathParameters;
    }

    /**
     * Set gets the workflow trigger callback URL relative path parameters.
     *
     * @param relativePathParameters the relativePathParameters value to set
     * @return the WorkflowTriggerCallbackUrlInner object itself.
     */
    public WorkflowTriggerCallbackUrlInner withRelativePathParameters(List<String> relativePathParameters) {
        this.relativePathParameters = relativePathParameters;
        return this;
    }

    /**
     * Get gets the workflow trigger callback URL query parameters.
     *
     * @return the queries value
     */
    public WorkflowTriggerListCallbackUrlQueries queries() {
        return this.queries;
    }

    /**
     * Set gets the workflow trigger callback URL query parameters.
     *
     * @param queries the queries value to set
     * @return the WorkflowTriggerCallbackUrlInner object itself.
     */
    public WorkflowTriggerCallbackUrlInner withQueries(WorkflowTriggerListCallbackUrlQueries queries) {
        this.queries = queries;
        return this;
    }

}
