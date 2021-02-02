/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Custom setup script properties for a managed dedicated integration runtime.
 */
public class IntegrationRuntimeCustomSetupScriptProperties {
    /**
     * The URI of the Azure blob container that contains the custom setup
     * script.
     */
    @JsonProperty(value = "blobContainerUri")
    private String blobContainerUri;

    /**
     * The SAS token of the Azure blob container.
     */
    @JsonProperty(value = "sasToken")
    private SecureString sasToken;

    /**
     * Get the URI of the Azure blob container that contains the custom setup script.
     *
     * @return the blobContainerUri value
     */
    public String blobContainerUri() {
        return this.blobContainerUri;
    }

    /**
     * Set the URI of the Azure blob container that contains the custom setup script.
     *
     * @param blobContainerUri the blobContainerUri value to set
     * @return the IntegrationRuntimeCustomSetupScriptProperties object itself.
     */
    public IntegrationRuntimeCustomSetupScriptProperties withBlobContainerUri(String blobContainerUri) {
        this.blobContainerUri = blobContainerUri;
        return this;
    }

    /**
     * Get the SAS token of the Azure blob container.
     *
     * @return the sasToken value
     */
    public SecureString sasToken() {
        return this.sasToken;
    }

    /**
     * Set the SAS token of the Azure blob container.
     *
     * @param sasToken the sasToken value to set
     * @return the IntegrationRuntimeCustomSetupScriptProperties object itself.
     */
    public IntegrationRuntimeCustomSetupScriptProperties withSasToken(SecureString sasToken) {
        this.sasToken = sasToken;
        return this;
    }

}
