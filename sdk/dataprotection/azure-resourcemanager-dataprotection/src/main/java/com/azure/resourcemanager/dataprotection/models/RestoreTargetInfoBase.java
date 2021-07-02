// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class common to RestoreTargetInfo and RestoreFilesTargetInfo. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = RestoreTargetInfoBase.class)
@JsonTypeName("RestoreTargetInfoBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ItemLevelRestoreTargetInfo", value = ItemLevelRestoreTargetInfo.class),
    @JsonSubTypes.Type(name = "RestoreFilesTargetInfo", value = RestoreFilesTargetInfo.class),
    @JsonSubTypes.Type(name = "RestoreTargetInfo", value = RestoreTargetInfo.class)
})
@Fluent
public class RestoreTargetInfoBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestoreTargetInfoBase.class);

    /*
     * Recovery Option
     */
    @JsonProperty(value = "recoveryOption", required = true)
    private RecoveryOption recoveryOption;

    /*
     * Target Restore region
     */
    @JsonProperty(value = "restoreLocation")
    private String restoreLocation;

    /**
     * Get the recoveryOption property: Recovery Option.
     *
     * @return the recoveryOption value.
     */
    public RecoveryOption recoveryOption() {
        return this.recoveryOption;
    }

    /**
     * Set the recoveryOption property: Recovery Option.
     *
     * @param recoveryOption the recoveryOption value to set.
     * @return the RestoreTargetInfoBase object itself.
     */
    public RestoreTargetInfoBase withRecoveryOption(RecoveryOption recoveryOption) {
        this.recoveryOption = recoveryOption;
        return this;
    }

    /**
     * Get the restoreLocation property: Target Restore region.
     *
     * @return the restoreLocation value.
     */
    public String restoreLocation() {
        return this.restoreLocation;
    }

    /**
     * Set the restoreLocation property: Target Restore region.
     *
     * @param restoreLocation the restoreLocation value to set.
     * @return the RestoreTargetInfoBase object itself.
     */
    public RestoreTargetInfoBase withRestoreLocation(String restoreLocation) {
        this.restoreLocation = restoreLocation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recoveryOption() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property recoveryOption in model RestoreTargetInfoBase"));
        }
    }
}
