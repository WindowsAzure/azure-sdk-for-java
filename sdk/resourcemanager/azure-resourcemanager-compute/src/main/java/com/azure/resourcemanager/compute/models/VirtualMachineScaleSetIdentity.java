// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Identity for the virtual machine scale set. */
@Fluent
public class VirtualMachineScaleSetIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetIdentity.class);

    /*
     * The principal id of virtual machine scale set identity. This property
     * will only be provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant id associated with the virtual machine scale set. This
     * property will only be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The type of identity used for the virtual machine scale set. The type
     * 'SystemAssigned, UserAssigned' includes both an implicitly created
     * identity and a set of user assigned identities. The type 'None' will
     * remove any identities from the virtual machine scale set.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /*
     * The list of user identities associated with the virtual machine scale
     * set. The user identity dictionary key references will be ARM resource
     * ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonInclude(content = JsonInclude.Include.ALWAYS)
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, VirtualMachineScaleSetIdentityUserAssignedIdentities> userAssignedIdentities;

    /**
     * Get the principalId property: The principal id of virtual machine scale set identity. This property will only be
     * provided for a system assigned identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id associated with the virtual machine scale set. This property will only
     * be provided for a system assigned identity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the virtual machine scale set. The type 'SystemAssigned,
     * UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None'
     * will remove any identities from the virtual machine scale set.
     *
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the virtual machine scale set. The type 'SystemAssigned,
     * UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None'
     * will remove any identities from the virtual machine scale set.
     *
     * @param type the type value to set.
     * @return the VirtualMachineScaleSetIdentity object itself.
     */
    public VirtualMachineScaleSetIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the virtual machine scale
     * set. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, VirtualMachineScaleSetIdentityUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the virtual machine scale
     * set. The user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the VirtualMachineScaleSetIdentity object itself.
     */
    public VirtualMachineScaleSetIdentity withUserAssignedIdentities(
        Map<String, VirtualMachineScaleSetIdentityUserAssignedIdentities> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
