/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The kafka rest proxy configuration which contains AAD security group
 * information.
 */
public class KafkaRestProperties {
    /**
     * The information of AAD security group.
     */
    @JsonProperty(value = "clientGroupInfo")
    private ClientGroupInfo clientGroupInfo;

    /**
     * Get the information of AAD security group.
     *
     * @return the clientGroupInfo value
     */
    public ClientGroupInfo clientGroupInfo() {
        return this.clientGroupInfo;
    }

    /**
     * Set the information of AAD security group.
     *
     * @param clientGroupInfo the clientGroupInfo value to set
     * @return the KafkaRestProperties object itself.
     */
    public KafkaRestProperties withClientGroupInfo(ClientGroupInfo clientGroupInfo) {
        this.clientGroupInfo = clientGroupInfo;
        return this;
    }

}
