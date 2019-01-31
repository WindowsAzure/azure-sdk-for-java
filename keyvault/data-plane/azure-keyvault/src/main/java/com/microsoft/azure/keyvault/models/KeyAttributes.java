// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The attributes of a key managed by the key vault service.
 */
public class KeyAttributes extends Attributes {
    /**
     * Reflects the deletion recovery level currently in effect for keys in the
     * current vault. If it contains 'Purgeable' the key can be permanently
     * deleted by a privileged user; otherwise, only the system can purge the
     * key, at the end of the retention interval. Possible values include:
     * 'Purgeable', 'Recoverable+Purgeable', 'Recoverable',
     * 'Recoverable+ProtectedSubscription'.
     */
    @JsonProperty(value = "recoveryLevel", access = JsonProperty.Access.WRITE_ONLY)
    private DeletionRecoveryLevel recoveryLevel;

    /**
     * Get the recoveryLevel value.
     *
     * @return the recoveryLevel value
     */
    public DeletionRecoveryLevel recoveryLevel() {
        return this.recoveryLevel;
    }

}
