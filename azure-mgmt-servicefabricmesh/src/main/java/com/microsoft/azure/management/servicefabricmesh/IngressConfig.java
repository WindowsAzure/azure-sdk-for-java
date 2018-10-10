/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes public connectivity configuration for the network.
 */
public class IngressConfig {
    /**
     * The QoS tier for ingress. Possible values include: 'Bronze'.
     */
    @JsonProperty(value = "qosLevel")
    private IngressQoSLevel qosLevel;

    /**
     * Configuration for layer4 public connectivity for this network.
     */
    @JsonProperty(value = "layer4")
    private List<Layer4IngressConfig> layer4;

    /**
     * The public IP address for reaching this network.
     */
    @JsonProperty(value = "publicIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIPAddress;

    /**
     * Get the QoS tier for ingress. Possible values include: 'Bronze'.
     *
     * @return the qosLevel value
     */
    public IngressQoSLevel qosLevel() {
        return this.qosLevel;
    }

    /**
     * Set the QoS tier for ingress. Possible values include: 'Bronze'.
     *
     * @param qosLevel the qosLevel value to set
     * @return the IngressConfig object itself.
     */
    public IngressConfig withQosLevel(IngressQoSLevel qosLevel) {
        this.qosLevel = qosLevel;
        return this;
    }

    /**
     * Get configuration for layer4 public connectivity for this network.
     *
     * @return the layer4 value
     */
    public List<Layer4IngressConfig> layer4() {
        return this.layer4;
    }

    /**
     * Set configuration for layer4 public connectivity for this network.
     *
     * @param layer4 the layer4 value to set
     * @return the IngressConfig object itself.
     */
    public IngressConfig withLayer4(List<Layer4IngressConfig> layer4) {
        this.layer4 = layer4;
        return this;
    }

    /**
     * Get the public IP address for reaching this network.
     *
     * @return the publicIPAddress value
     */
    public String publicIPAddress() {
        return this.publicIPAddress;
    }

}
