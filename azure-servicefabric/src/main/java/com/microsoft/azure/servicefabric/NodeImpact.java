/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the expected impact of a repair to a particular node.
 *
 * This type supports the Service Fabric platform; it is not meant to be used
 * directly from your code.
 */
public class NodeImpact {
    /**
     * The name of the impacted node.
     */
    @JsonProperty(value = "NodeName", required = true)
    private String nodeName;

    /**
     * The level of impact expected. Possible values include: 'Invalid',
     * 'None', 'Restart', 'RemoveData', 'RemoveNode'.
     */
    @JsonProperty(value = "ImpactLevel")
    private ImpactLevel impactLevel;

    /**
     * Get the name of the impacted node.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the name of the impacted node.
     *
     * @param nodeName the nodeName value to set
     * @return the NodeImpact object itself.
     */
    public NodeImpact withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the level of impact expected. Possible values include: 'Invalid', 'None', 'Restart', 'RemoveData', 'RemoveNode'.
     *
     * @return the impactLevel value
     */
    public ImpactLevel impactLevel() {
        return this.impactLevel;
    }

    /**
     * Set the level of impact expected. Possible values include: 'Invalid', 'None', 'Restart', 'RemoveData', 'RemoveNode'.
     *
     * @param impactLevel the impactLevel value to set
     * @return the NodeImpact object itself.
     */
    public NodeImpact withImpactLevel(ImpactLevel impactLevel) {
        this.impactLevel = impactLevel;
        return this;
    }

}
