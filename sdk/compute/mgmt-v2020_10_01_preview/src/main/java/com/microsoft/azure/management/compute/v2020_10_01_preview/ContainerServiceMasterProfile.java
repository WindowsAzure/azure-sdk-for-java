/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for the container service master.
 */
public class ContainerServiceMasterProfile {
    /**
     * Number of masters (VMs) in the container service cluster. Allowed values
     * are 1, 3, and 5. The default value is 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * DNS prefix to be used to create the FQDN for master.
     */
    @JsonProperty(value = "dnsPrefix", required = true)
    private String dnsPrefix;

    /**
     * FQDN for the master.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get number of masters (VMs) in the container service cluster. Allowed values are 1, 3, and 5. The default value is 1.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set number of masters (VMs) in the container service cluster. Allowed values are 1, 3, and 5. The default value is 1.
     *
     * @param count the count value to set
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get dNS prefix to be used to create the FQDN for master.
     *
     * @return the dnsPrefix value
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }

    /**
     * Set dNS prefix to be used to create the FQDN for master.
     *
     * @param dnsPrefix the dnsPrefix value to set
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withDnsPrefix(String dnsPrefix) {
        this.dnsPrefix = dnsPrefix;
        return this;
    }

    /**
     * Get fQDN for the master.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

}
