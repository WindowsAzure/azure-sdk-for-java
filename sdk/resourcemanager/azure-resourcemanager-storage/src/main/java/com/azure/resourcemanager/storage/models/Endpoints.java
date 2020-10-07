// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The URIs that are used to perform a retrieval of a public blob, queue, table, web or dfs object. */
@Fluent
public final class Endpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Endpoints.class);

    /*
     * Gets the blob endpoint.
     */
    @JsonProperty(value = "blob", access = JsonProperty.Access.WRITE_ONLY)
    private String blob;

    /*
     * Gets the queue endpoint.
     */
    @JsonProperty(value = "queue", access = JsonProperty.Access.WRITE_ONLY)
    private String queue;

    /*
     * Gets the table endpoint.
     */
    @JsonProperty(value = "table", access = JsonProperty.Access.WRITE_ONLY)
    private String table;

    /*
     * Gets the file endpoint.
     */
    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)
    private String file;

    /*
     * Gets the web endpoint.
     */
    @JsonProperty(value = "web", access = JsonProperty.Access.WRITE_ONLY)
    private String web;

    /*
     * Gets the dfs endpoint.
     */
    @JsonProperty(value = "dfs", access = JsonProperty.Access.WRITE_ONLY)
    private String dfs;

    /*
     * Gets the microsoft routing storage endpoints.
     */
    @JsonProperty(value = "microsoftEndpoints")
    private StorageAccountMicrosoftEndpoints microsoftEndpoints;

    /*
     * Gets the internet routing storage endpoints
     */
    @JsonProperty(value = "internetEndpoints")
    private StorageAccountInternetEndpoints internetEndpoints;

    /**
     * Get the blob property: Gets the blob endpoint.
     *
     * @return the blob value.
     */
    public String blob() {
        return this.blob;
    }

    /**
     * Get the queue property: Gets the queue endpoint.
     *
     * @return the queue value.
     */
    public String queue() {
        return this.queue;
    }

    /**
     * Get the table property: Gets the table endpoint.
     *
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Get the file property: Gets the file endpoint.
     *
     * @return the file value.
     */
    public String file() {
        return this.file;
    }

    /**
     * Get the web property: Gets the web endpoint.
     *
     * @return the web value.
     */
    public String web() {
        return this.web;
    }

    /**
     * Get the dfs property: Gets the dfs endpoint.
     *
     * @return the dfs value.
     */
    public String dfs() {
        return this.dfs;
    }

    /**
     * Get the microsoftEndpoints property: Gets the microsoft routing storage endpoints.
     *
     * @return the microsoftEndpoints value.
     */
    public StorageAccountMicrosoftEndpoints microsoftEndpoints() {
        return this.microsoftEndpoints;
    }

    /**
     * Set the microsoftEndpoints property: Gets the microsoft routing storage endpoints.
     *
     * @param microsoftEndpoints the microsoftEndpoints value to set.
     * @return the Endpoints object itself.
     */
    public Endpoints withMicrosoftEndpoints(StorageAccountMicrosoftEndpoints microsoftEndpoints) {
        this.microsoftEndpoints = microsoftEndpoints;
        return this;
    }

    /**
     * Get the internetEndpoints property: Gets the internet routing storage endpoints.
     *
     * @return the internetEndpoints value.
     */
    public StorageAccountInternetEndpoints internetEndpoints() {
        return this.internetEndpoints;
    }

    /**
     * Set the internetEndpoints property: Gets the internet routing storage endpoints.
     *
     * @param internetEndpoints the internetEndpoints value to set.
     * @return the Endpoints object itself.
     */
    public Endpoints withInternetEndpoints(StorageAccountInternetEndpoints internetEndpoints) {
        this.internetEndpoints = internetEndpoints;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (microsoftEndpoints() != null) {
            microsoftEndpoints().validate();
        }
        if (internetEndpoints() != null) {
            internetEndpoints().validate();
        }
    }
}
