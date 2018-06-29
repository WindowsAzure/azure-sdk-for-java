/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ClientDiscoveryDisplay;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.ClientDiscoveryForProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available operation details.
 */
public class ClientDiscoveryValueForSingleApiInner {
    /**
     * Name of the Operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Contains the localized display information for this particular
     * operation.
     */
    @JsonProperty(value = "display")
    private ClientDiscoveryDisplay display;

    /**
     * The intended executor of the operation;governs the display of the
     * operation in the RBAC UX and the audit logs UX.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * ShoeBox properties for the given operation.
     */
    @JsonProperty(value = "properties")
    private ClientDiscoveryForProperties properties;

    /**
     * Get name of the Operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Operation.
     *
     * @param name the name value to set
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get contains the localized display information for this particular operation.
     *
     * @return the display value
     */
    public ClientDiscoveryDisplay display() {
        return this.display;
    }

    /**
     * Set contains the localized display information for this particular operation.
     *
     * @param display the display value to set
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withDisplay(ClientDiscoveryDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the intended executor of the operation;governs the display of the operation in the RBAC UX and the audit logs UX.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the intended executor of the operation;governs the display of the operation in the RBAC UX and the audit logs UX.
     *
     * @param origin the origin value to set
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get shoeBox properties for the given operation.
     *
     * @return the properties value
     */
    public ClientDiscoveryForProperties properties() {
        return this.properties;
    }

    /**
     * Set shoeBox properties for the given operation.
     *
     * @param properties the properties value to set
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withProperties(ClientDiscoveryForProperties properties) {
        this.properties = properties;
        return this;
    }

}
