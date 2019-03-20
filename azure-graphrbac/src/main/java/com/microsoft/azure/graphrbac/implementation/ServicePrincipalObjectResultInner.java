/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service Principal Object Result.
 */
public class ServicePrincipalObjectResultInner {
    /**
     * The Object ID of the service principal with the specified application
     * ID.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * The URL representing edm equivalent.
     */
    @JsonProperty(value = "odata\\.metadata")
    private String odatametadata;

    /**
     * Get the Object ID of the service principal with the specified application ID.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the Object ID of the service principal with the specified application ID.
     *
     * @param value the value value to set
     * @return the ServicePrincipalObjectResultInner object itself.
     */
    public ServicePrincipalObjectResultInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URL representing edm equivalent.
     *
     * @return the odatametadata value
     */
    public String odatametadata() {
        return this.odatametadata;
    }

    /**
     * Set the URL representing edm equivalent.
     *
     * @param odatametadata the odatametadata value to set
     * @return the ServicePrincipalObjectResultInner object itself.
     */
    public ServicePrincipalObjectResultInner withOdatametadata(String odatametadata) {
        this.odatametadata = odatametadata;
        return this;
    }

}
