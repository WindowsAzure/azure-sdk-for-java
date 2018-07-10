/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Analytics catalog secret creation and update parameters. This is
 * deprecated and will be removed in the next release. Please use
 * DataLakeAnalyticsCatalogCredentialCreateOrUpdateParameters instead.
 */
public class DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters {
    /**
     * the password for the secret to pass in.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * the URI identifier for the secret in the format
     * &lt;hostname&gt;:&lt;port&gt;.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get the password for the secret to pass in.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password for the secret to pass in.
     *
     * @param password the password value to set
     * @return the DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the URI identifier for the secret in the format &lt;hostname&gt;:&lt;port&gt;.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI identifier for the secret in the format &lt;hostname&gt;:&lt;port&gt;.
     *
     * @param uri the uri value to set
     * @return the DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters object itself.
     */
    public DataLakeAnalyticsCatalogSecretCreateOrUpdateParameters withUri(String uri) {
        this.uri = uri;
        return this;
    }

}
