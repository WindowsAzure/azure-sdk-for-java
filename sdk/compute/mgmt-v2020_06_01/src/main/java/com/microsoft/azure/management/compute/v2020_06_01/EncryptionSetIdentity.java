/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The managed identity for the disk encryption set. It should be given
 * permission on the key vault before it can be used to encrypt disks.
 */
public class EncryptionSetIdentity {
    /**
     * The type of Managed Identity used by the DiskEncryptionSet. Only
     * SystemAssigned is supported. Possible values include: 'SystemAssigned'.
     */
    @JsonProperty(value = "type")
    private DiskEncryptionSetIdentityType type;

    /**
     * The object id of the Managed Identity Resource. This will be sent to the
     * RP from ARM via the x-ms-identity-principal-id header in the PUT request
     * if the resource has a systemAssigned(implicit) identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant id of the Managed Identity Resource. This will be sent to the
     * RP from ARM via the x-ms-client-tenant-id header in the PUT request if
     * the resource has a systemAssigned(implicit) identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is supported. Possible values include: 'SystemAssigned'.
     *
     * @return the type value
     */
    public DiskEncryptionSetIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is supported. Possible values include: 'SystemAssigned'.
     *
     * @param type the type value to set
     * @return the EncryptionSetIdentity object itself.
     */
    public EncryptionSetIdentity withType(DiskEncryptionSetIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the object id of the Managed Identity Resource. This will be sent to the RP from ARM via the x-ms-identity-principal-id header in the PUT request if the resource has a systemAssigned(implicit) identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant id of the Managed Identity Resource. This will be sent to the RP from ARM via the x-ms-client-tenant-id header in the PUT request if the resource has a systemAssigned(implicit) identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

}
