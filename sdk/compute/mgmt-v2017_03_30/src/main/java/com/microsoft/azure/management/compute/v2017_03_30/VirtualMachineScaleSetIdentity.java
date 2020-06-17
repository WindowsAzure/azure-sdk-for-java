/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity for the virtual machine scale set.
 */
public class VirtualMachineScaleSetIdentity {
    /**
     * The principal id of virtual machine scale set identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant id associated with the virtual machine scale set.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The type of identity used for the virtual machine scale set. Currently,
     * the only supported type is 'SystemAssigned', which implicitly creates an
     * identity. Possible values include: 'SystemAssigned'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Get the principal id of virtual machine scale set identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant id associated with the virtual machine scale set.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type of identity used for the virtual machine scale set. Currently, the only supported type is 'SystemAssigned', which implicitly creates an identity. Possible values include: 'SystemAssigned'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of identity used for the virtual machine scale set. Currently, the only supported type is 'SystemAssigned', which implicitly creates an identity. Possible values include: 'SystemAssigned'.
     *
     * @param type the type value to set
     * @return the VirtualMachineScaleSetIdentity object itself.
     */
    public VirtualMachineScaleSetIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

}
