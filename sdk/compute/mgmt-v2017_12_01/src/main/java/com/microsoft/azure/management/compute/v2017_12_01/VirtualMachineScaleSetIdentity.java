/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity for the virtual machine scale set.
 */
public class VirtualMachineScaleSetIdentity {
    /**
     * The principal id of virtual machine scale set identity. This property
     * will only be provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant id associated with the virtual machine scale set. This
     * property will only be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The type of identity used for the virtual machine scale set. The type
     * 'SystemAssigned, UserAssigned' includes both an implicitly created
     * identity and a set of user assigned identities. The type 'None' will
     * remove any identities from the virtual machine scale set. Possible
     * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
     * UserAssigned', 'None'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * The list of user identities associated with the virtual machine scale
     * set. The user identity references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/identities/{identityName}'.
     */
    @JsonProperty(value = "identityIds")
    private List<String> identityIds;

    /**
     * Get the principal id of virtual machine scale set identity. This property will only be provided for a system assigned identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant id associated with the virtual machine scale set. This property will only be provided for a system assigned identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type of identity used for the virtual machine scale set. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the virtual machine scale set. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of identity used for the virtual machine scale set. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the virtual machine scale set. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the VirtualMachineScaleSetIdentity object itself.
     */
    public VirtualMachineScaleSetIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the list of user identities associated with the virtual machine scale set. The user identity references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/identities/{identityName}'.
     *
     * @return the identityIds value
     */
    public List<String> identityIds() {
        return this.identityIds;
    }

    /**
     * Set the list of user identities associated with the virtual machine scale set. The user identity references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/identities/{identityName}'.
     *
     * @param identityIds the identityIds value to set
     * @return the VirtualMachineScaleSetIdentity object itself.
     */
    public VirtualMachineScaleSetIdentity withIdentityIds(List<String> identityIds) {
        this.identityIds = identityIds;
        return this;
    }

}
