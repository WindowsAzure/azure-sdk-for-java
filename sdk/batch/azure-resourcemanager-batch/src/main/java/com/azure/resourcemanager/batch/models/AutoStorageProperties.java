// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Contains information about the auto-storage account associated with a Batch account. */
@Fluent
public final class AutoStorageProperties extends AutoStorageBaseProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoStorageProperties.class);

    /*
     * The UTC time at which storage keys were last synchronized with the Batch
     * account.
     */
    @JsonProperty(value = "lastKeySync", required = true)
    private OffsetDateTime lastKeySync;

    /**
     * Get the lastKeySync property: The UTC time at which storage keys were last synchronized with the Batch account.
     *
     * @return the lastKeySync value.
     */
    public OffsetDateTime lastKeySync() {
        return this.lastKeySync;
    }

    /**
     * Set the lastKeySync property: The UTC time at which storage keys were last synchronized with the Batch account.
     *
     * @param lastKeySync the lastKeySync value to set.
     * @return the AutoStorageProperties object itself.
     */
    public AutoStorageProperties withLastKeySync(OffsetDateTime lastKeySync) {
        this.lastKeySync = lastKeySync;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutoStorageProperties withStorageAccountId(String storageAccountId) {
        super.withStorageAccountId(storageAccountId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (lastKeySync() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property lastKeySync in model AutoStorageProperties"));
        }
    }
}
