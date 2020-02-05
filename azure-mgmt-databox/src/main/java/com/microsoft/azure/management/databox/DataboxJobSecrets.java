/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The secrets related to a databox job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobSecretsType", defaultImpl = DataboxJobSecrets.class)
@JsonTypeName("DataBox")
public class DataboxJobSecrets extends JobSecrets {
    /**
     * Contains the list of secret objects for a job.
     */
    @JsonProperty(value = "podSecrets")
    private List<DataBoxSecret> podSecrets;

    /**
     * Get contains the list of secret objects for a job.
     *
     * @return the podSecrets value
     */
    public List<DataBoxSecret> podSecrets() {
        return this.podSecrets;
    }

    /**
     * Set contains the list of secret objects for a job.
     *
     * @param podSecrets the podSecrets value to set
     * @return the DataboxJobSecrets object itself.
     */
    public DataboxJobSecrets withPodSecrets(List<DataBoxSecret> podSecrets) {
        this.podSecrets = podSecrets;
        return this;
    }

}
