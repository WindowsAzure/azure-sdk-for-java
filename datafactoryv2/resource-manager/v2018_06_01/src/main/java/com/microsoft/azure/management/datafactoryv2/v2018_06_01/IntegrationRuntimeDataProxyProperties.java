/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data proxy properties for a managed dedicated integration runtime.
 */
public class IntegrationRuntimeDataProxyProperties {
    /**
     * The self-hosted integration runtime reference.
     */
    @JsonProperty(value = "connectVia")
    private EntityReference connectVia;

    /**
     * The staging linked service reference.
     */
    @JsonProperty(value = "stagingLinkedService")
    private EntityReference stagingLinkedService;

    /**
     * The path to contain the staged data in the Blob storage.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the self-hosted integration runtime reference.
     *
     * @return the connectVia value
     */
    public EntityReference connectVia() {
        return this.connectVia;
    }

    /**
     * Set the self-hosted integration runtime reference.
     *
     * @param connectVia the connectVia value to set
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    public IntegrationRuntimeDataProxyProperties withConnectVia(EntityReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Get the staging linked service reference.
     *
     * @return the stagingLinkedService value
     */
    public EntityReference stagingLinkedService() {
        return this.stagingLinkedService;
    }

    /**
     * Set the staging linked service reference.
     *
     * @param stagingLinkedService the stagingLinkedService value to set
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    public IntegrationRuntimeDataProxyProperties withStagingLinkedService(EntityReference stagingLinkedService) {
        this.stagingLinkedService = stagingLinkedService;
        return this;
    }

    /**
     * Get the path to contain the staged data in the Blob storage.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path to contain the staged data in the Blob storage.
     *
     * @param path the path value to set
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    public IntegrationRuntimeDataProxyProperties withPath(String path) {
        this.path = path;
        return this;
    }

}
