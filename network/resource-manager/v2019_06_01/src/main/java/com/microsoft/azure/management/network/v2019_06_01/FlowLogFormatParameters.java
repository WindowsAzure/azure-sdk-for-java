/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the flow log format.
 */
public class FlowLogFormatParameters {
    /**
     * The file type of flow log. Possible values include: 'JSON'.
     */
    @JsonProperty(value = "type")
    private FlowLogFormatType type;

    /**
     * The version (revision) of the flow log.
     */
    @JsonProperty(value = "version")
    private Integer version;

    /**
     * Get the file type of flow log. Possible values include: 'JSON'.
     *
     * @return the type value
     */
    public FlowLogFormatType type() {
        return this.type;
    }

    /**
     * Set the file type of flow log. Possible values include: 'JSON'.
     *
     * @param type the type value to set
     * @return the FlowLogFormatParameters object itself.
     */
    public FlowLogFormatParameters withType(FlowLogFormatType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version (revision) of the flow log.
     *
     * @return the version value
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version (revision) of the flow log.
     *
     * @param version the version value to set
     * @return the FlowLogFormatParameters object itself.
     */
    public FlowLogFormatParameters withVersion(Integer version) {
        this.version = version;
        return this;
    }

}
