// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration for nodes in a pool based on the Azure Cloud Services
 * platform.
 */
public class CloudServiceConfiguration {
    /**
     * The Azure Guest OS family to be installed on the virtual machines in the
     * pool.
     * Possible values are:
     * 2 - OS Family 2, equivalent to Windows Server 2008 R2 SP1.
     * 3 - OS Family 3, equivalent to Windows Server 2012.
     * 4 - OS Family 4, equivalent to Windows Server 2012 R2.
     * 5 - OS Family 5, equivalent to Windows Server 2016. For more
     * information, see Azure Guest OS Releases
     * (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     */
    @JsonProperty(value = "osFamily", required = true)
    private String osFamily;

    /**
     * The Azure Guest OS version to be installed on the virtual machines in
     * the pool.
     * The default value is * which specifies the latest operating system
     * version for the specified OS family.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Get possible values are:
     2 - OS Family 2, equivalent to Windows Server 2008 R2 SP1.
     3 - OS Family 3, equivalent to Windows Server 2012.
     4 - OS Family 4, equivalent to Windows Server 2012 R2.
     5 - OS Family 5, equivalent to Windows Server 2016. For more information, see Azure Guest OS Releases (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     *
     * @return the osFamily value
     */
    public String osFamily() {
        return this.osFamily;
    }

    /**
     * Set possible values are:
     2 - OS Family 2, equivalent to Windows Server 2008 R2 SP1.
     3 - OS Family 3, equivalent to Windows Server 2012.
     4 - OS Family 4, equivalent to Windows Server 2012 R2.
     5 - OS Family 5, equivalent to Windows Server 2016. For more information, see Azure Guest OS Releases (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     *
     * @param osFamily the osFamily value to set
     * @return the CloudServiceConfiguration object itself.
     */
    public CloudServiceConfiguration withOsFamily(String osFamily) {
        this.osFamily = osFamily;
        return this;
    }

    /**
     * Get the default value is * which specifies the latest operating system version for the specified OS family.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the default value is * which specifies the latest operating system version for the specified OS family.
     *
     * @param osVersion the osVersion value to set
     * @return the CloudServiceConfiguration object itself.
     */
    public CloudServiceConfiguration withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

}
