// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridkubernetes.models.CredentialResult;
import com.azure.resourcemanager.hybridkubernetes.models.HybridConnectionConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of credential result response. */
@Immutable
public final class CredentialResultsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CredentialResultsInner.class);

    /*
     * Contains the REP (rendezvous endpoint) and “Sender” access token.
     */
    @JsonProperty(value = "hybridConnectionConfig", access = JsonProperty.Access.WRITE_ONLY)
    private HybridConnectionConfig hybridConnectionConfig;

    /*
     * Base64-encoded Kubernetes configuration file.
     */
    @JsonProperty(value = "kubeconfigs", access = JsonProperty.Access.WRITE_ONLY)
    private List<CredentialResult> kubeconfigs;

    /**
     * Get the hybridConnectionConfig property: Contains the REP (rendezvous endpoint) and “Sender” access token.
     *
     * @return the hybridConnectionConfig value.
     */
    public HybridConnectionConfig hybridConnectionConfig() {
        return this.hybridConnectionConfig;
    }

    /**
     * Get the kubeconfigs property: Base64-encoded Kubernetes configuration file.
     *
     * @return the kubeconfigs value.
     */
    public List<CredentialResult> kubeconfigs() {
        return this.kubeconfigs;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hybridConnectionConfig() != null) {
            hybridConnectionConfig().validate();
        }
        if (kubeconfigs() != null) {
            kubeconfigs().forEach(e -> e.validate());
        }
    }
}
