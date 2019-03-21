/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an OpenShift router.
 */
public class OpenShiftRouterProfile {
    /**
     * Name of the router profile.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * DNS subdomain for OpenShift router.
     */
    @JsonProperty(value = "publicSubdomain")
    private String publicSubdomain;

    /**
     * Auto-allocated FQDN for the OpenShift router.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get name of the router profile.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the router profile.
     *
     * @param name the name value to set
     * @return the OpenShiftRouterProfile object itself.
     */
    public OpenShiftRouterProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get dNS subdomain for OpenShift router.
     *
     * @return the publicSubdomain value
     */
    public String publicSubdomain() {
        return this.publicSubdomain;
    }

    /**
     * Set dNS subdomain for OpenShift router.
     *
     * @param publicSubdomain the publicSubdomain value to set
     * @return the OpenShiftRouterProfile object itself.
     */
    public OpenShiftRouterProfile withPublicSubdomain(String publicSubdomain) {
        this.publicSubdomain = publicSubdomain;
        return this;
    }

    /**
     * Get auto-allocated FQDN for the OpenShift router.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

}
