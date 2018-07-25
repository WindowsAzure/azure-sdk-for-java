/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.management.azurestack.v2017_06_01.ComputeRole;
import com.microsoft.azure.management.azurestack.v2017_06_01.OperatingSystem;
import com.microsoft.azure.management.azurestack.v2017_06_01.OsDiskImage;
import java.util.List;
import com.microsoft.azure.management.azurestack.v2017_06_01.DataDiskImage;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Extended description about the product required for installing it into Azure
 * Stack.
 */
@JsonFlatten
public class ExtendedProductInner {
    /**
     * The URI to the .azpkg file that provides information required for
     * showing product in the gallery.
     */
    @JsonProperty(value = "galleryPackageBlobSasUri", access = JsonProperty.Access.WRITE_ONLY)
    private String galleryPackageBlobSasUri;

    /**
     * Specifies the kind of the product (virtualMachine or
     * virtualMachineExtension).
     */
    @JsonProperty(value = "productKind", access = JsonProperty.Access.WRITE_ONLY)
    private String productKind;

    /**
     * Specifies kind of compute role inclided in the package. Possible values
     * include: 'None', 'IaaS', 'PaaS'.
     */
    @JsonProperty(value = "properties.computeRole", access = JsonProperty.Access.WRITE_ONLY)
    private ComputeRole computeRole;

    /**
     * Specifies if product is a Virtual Machine Extension.
     */
    @JsonProperty(value = "properties.isSystemExtension", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSystemExtension;

    /**
     * The URI.
     */
    @JsonProperty(value = "properties.sourceBlob.uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /**
     * Indicates if specified product supports multiple extensions.
     */
    @JsonProperty(value = "properties.supportMultipleExtensions", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean supportMultipleExtensions;

    /**
     * Specifies product version.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Specifies operating system used by the product. Possible values include:
     * 'None', 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.vmOsType", access = JsonProperty.Access.WRITE_ONLY)
    private OperatingSystem vmOsType;

    /**
     * Indicates if virtual machine Scale Set is enabled in the specified
     * product.
     */
    @JsonProperty(value = "properties.vmScaleSetEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean vmScaleSetEnabled;

    /**
     * OS disk image used by product.
     */
    @JsonProperty(value = "properties.osDiskImage", access = JsonProperty.Access.WRITE_ONLY)
    private OsDiskImage osDiskImage;

    /**
     * List of attached data disks.
     */
    @JsonProperty(value = "properties.dataDiskImages", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataDiskImage> dataDiskImages;

    /**
     * Get the URI to the .azpkg file that provides information required for showing product in the gallery.
     *
     * @return the galleryPackageBlobSasUri value
     */
    public String galleryPackageBlobSasUri() {
        return this.galleryPackageBlobSasUri;
    }

    /**
     * Get specifies the kind of the product (virtualMachine or virtualMachineExtension).
     *
     * @return the productKind value
     */
    public String productKind() {
        return this.productKind;
    }

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

    /**
     * Get oS disk image used by product.
     *
     * @return the osDiskImage value
     */
    public OsDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Get list of attached data disks.
     *
     * @return the dataDiskImages value
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

}
