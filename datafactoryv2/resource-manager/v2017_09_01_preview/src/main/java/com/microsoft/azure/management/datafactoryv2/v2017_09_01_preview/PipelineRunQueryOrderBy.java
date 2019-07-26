/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object to provide order by options for listing pipeline runs.
 */
public class PipelineRunQueryOrderBy {
    /**
     * Parameter name to be used for order by. Possible values include:
     * 'RunStart', 'RunEnd'.
     */
    @JsonProperty(value = "orderBy", required = true)
    private PipelineRunQueryOrderByField orderBy;

    /**
     * Sorting order of the parameter. Possible values include: 'ASC', 'DESC'.
     */
    @JsonProperty(value = "order", required = true)
    private PipelineRunQueryOrder order;

    /**
     * Get parameter name to be used for order by. Possible values include: 'RunStart', 'RunEnd'.
     *
     * @return the orderBy value
     */
    public PipelineRunQueryOrderByField orderBy() {
        return this.orderBy;
    }

    /**
     * Set parameter name to be used for order by. Possible values include: 'RunStart', 'RunEnd'.
     *
     * @param orderBy the orderBy value to set
     * @return the PipelineRunQueryOrderBy object itself.
     */
    public PipelineRunQueryOrderBy withOrderBy(PipelineRunQueryOrderByField orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get sorting order of the parameter. Possible values include: 'ASC', 'DESC'.
     *
     * @return the order value
     */
    public PipelineRunQueryOrder order() {
        return this.order;
    }

    /**
     * Set sorting order of the parameter. Possible values include: 'ASC', 'DESC'.
     *
     * @param order the order value to set
     * @return the PipelineRunQueryOrderBy object itself.
     */
    public PipelineRunQueryOrderBy withOrder(PipelineRunQueryOrder order) {
        this.order = order;
        return this;
    }

}
