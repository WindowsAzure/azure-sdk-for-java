// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The secrets related to a databox heavy job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobSecretsType")
@JsonTypeName("DataBoxHeavy")
@Immutable
public final class DataBoxHeavyJobSecrets extends JobSecrets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataBoxHeavyJobSecrets.class);

    /*
     * Contains the list of secret objects for a databox heavy job.
     */
    @JsonProperty(value = "cabinetPodSecrets", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataBoxHeavySecret> cabinetPodSecrets;

    /**
     * Get the cabinetPodSecrets property: Contains the list of secret objects for a databox heavy job.
     *
     * @return the cabinetPodSecrets value.
     */
    public List<DataBoxHeavySecret> cabinetPodSecrets() {
        return this.cabinetPodSecrets;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (cabinetPodSecrets() != null) {
            cabinetPodSecrets().forEach(e -> e.validate());
        }
    }
}
