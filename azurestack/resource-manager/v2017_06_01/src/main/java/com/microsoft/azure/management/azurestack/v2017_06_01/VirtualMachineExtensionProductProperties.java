/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Product information.
 */
@JsonFlatten
public class VirtualMachineExtensionProductProperties {
    /**
     * Specifies kind of compute role inclided in the package. Possible values
     * include: 'None', 'IaaS', 'PaaS'.
     */
    @JsonProperty(value = "computeRole", access = JsonProperty.Access.WRITE_ONLY)
    private ComputeRole computeRole;

    /**
     * Specifies if product is a Virtual Machine Extension.
     */
    @JsonProperty(value = "isSystemExtension", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSystemExtension;

    /**
     * The URI.
     */
    @JsonProperty(value = "sourceBlob.uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /**
     * Indicates if specified product supports multiple extensions.
     */
    @JsonProperty(value = "supportMultipleExtensions", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean supportMultipleExtensions;

    /**
     * Specifies product version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Specifies operating system used by the product. Possible values include:
     * 'None', 'Windows', 'Linux'.
     */
    @JsonProperty(value = "vmOsType", access = JsonProperty.Access.WRITE_ONLY)
    private OperatingSystem vmOsType;

    /**
     * Indicates if virtual machine Scale Set is enabled in the specified
     * product.
     */
    @JsonProperty(value = "vmScaleSetEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean vmScaleSetEnabled;

    /**
     * Get specifies kind of compute role inclided in the package. Possible values include: 'None', 'IaaS', 'PaaS'.
     *
     * @return the computeRole value
     */
    public ComputeRole computeRole() {
        return this.computeRole;
    }

    /**
     * Get specifies if product is a Virtual Machine Extension.
     *
     * @return the isSystemExtension value
     */
    public Boolean isSystemExtension() {
        return this.isSystemExtension;
    }

    /**
     * Get the URI.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get indicates if specified product supports multiple extensions.
     *
     * @return the supportMultipleExtensions value
     */
    public Boolean supportMultipleExtensions() {
        return this.supportMultipleExtensions;
    }

    /**
     * Get specifies product version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get specifies operating system used by the product. Possible values include: 'None', 'Windows', 'Linux'.
     *
     * @return the vmOsType value
     */
    public OperatingSystem vmOsType() {
        return this.vmOsType;
    }

    /**
     * Get indicates if virtual machine Scale Set is enabled in the specified product.
     *
     * @return the vmScaleSetEnabled value
     */
    public Boolean vmScaleSetEnabled() {
        return this.vmScaleSetEnabled;
    }

}
