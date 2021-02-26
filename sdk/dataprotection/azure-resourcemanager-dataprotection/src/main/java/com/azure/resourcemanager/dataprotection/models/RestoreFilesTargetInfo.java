// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Class encapsulating restore as files target parameters. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("RestoreFilesTargetInfo")
@Fluent
public final class RestoreFilesTargetInfo extends RestoreTargetInfoBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestoreFilesTargetInfo.class);

    /*
     * Destination of RestoreAsFiles operation, when destination is not a
     * datasource
     */
    @JsonProperty(value = "targetDetails", required = true)
    private TargetDetails targetDetails;

    /**
     * Get the targetDetails property: Destination of RestoreAsFiles operation, when destination is not a datasource.
     *
     * @return the targetDetails value.
     */
    public TargetDetails targetDetails() {
        return this.targetDetails;
    }

    /**
     * Set the targetDetails property: Destination of RestoreAsFiles operation, when destination is not a datasource.
     *
     * @param targetDetails the targetDetails value to set.
     * @return the RestoreFilesTargetInfo object itself.
     */
    public RestoreFilesTargetInfo withTargetDetails(TargetDetails targetDetails) {
        this.targetDetails = targetDetails;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestoreFilesTargetInfo withRecoveryOption(RecoveryOption recoveryOption) {
        super.withRecoveryOption(recoveryOption);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestoreFilesTargetInfo withRestoreLocation(String restoreLocation) {
        super.withRestoreLocation(restoreLocation);
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
        if (targetDetails() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetDetails in model RestoreFilesTargetInfo"));
        } else {
            targetDetails().validate();
        }
    }
}
