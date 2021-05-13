// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.models.RegistryListCredentialsResult;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ListWorkspaceKeysResult model. */
@Immutable
public final class ListWorkspaceKeysResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListWorkspaceKeysResultInner.class);

    /*
     * The userStorageKey property.
     */
    @JsonProperty(value = "userStorageKey", access = JsonProperty.Access.WRITE_ONLY)
    private String userStorageKey;

    /*
     * The userStorageResourceId property.
     */
    @JsonProperty(value = "userStorageResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String userStorageResourceId;

    /*
     * The appInsightsInstrumentationKey property.
     */
    @JsonProperty(value = "appInsightsInstrumentationKey", access = JsonProperty.Access.WRITE_ONLY)
    private String appInsightsInstrumentationKey;

    /*
     * The containerRegistryCredentials property.
     */
    @JsonProperty(value = "containerRegistryCredentials", access = JsonProperty.Access.WRITE_ONLY)
    private RegistryListCredentialsResult containerRegistryCredentials;

    /*
     * The notebookAccessKeys property.
     */
    @JsonProperty(value = "notebookAccessKeys", access = JsonProperty.Access.WRITE_ONLY)
    private ListNotebookKeysResultInner notebookAccessKeys;

    /**
     * Get the userStorageKey property: The userStorageKey property.
     *
     * @return the userStorageKey value.
     */
    public String userStorageKey() {
        return this.userStorageKey;
    }

    /**
     * Get the userStorageResourceId property: The userStorageResourceId property.
     *
     * @return the userStorageResourceId value.
     */
    public String userStorageResourceId() {
        return this.userStorageResourceId;
    }

    /**
     * Get the appInsightsInstrumentationKey property: The appInsightsInstrumentationKey property.
     *
     * @return the appInsightsInstrumentationKey value.
     */
    public String appInsightsInstrumentationKey() {
        return this.appInsightsInstrumentationKey;
    }

    /**
     * Get the containerRegistryCredentials property: The containerRegistryCredentials property.
     *
     * @return the containerRegistryCredentials value.
     */
    public RegistryListCredentialsResult containerRegistryCredentials() {
        return this.containerRegistryCredentials;
    }

    /**
     * Get the notebookAccessKeys property: The notebookAccessKeys property.
     *
     * @return the notebookAccessKeys value.
     */
    public ListNotebookKeysResultInner notebookAccessKeys() {
        return this.notebookAccessKeys;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerRegistryCredentials() != null) {
            containerRegistryCredentials().validate();
        }
        if (notebookAccessKeys() != null) {
            notebookAccessKeys().validate();
        }
    }
}
