/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base class for the secrets.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobSecretsType", defaultImpl = JobSecrets.class)
@JsonTypeName("JobSecrets")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DataBoxDisk", value = DataBoxDiskJobSecrets.class),
    @JsonSubTypes.Type(name = "DataBoxHeavy", value = DataBoxHeavyJobSecrets.class),
    @JsonSubTypes.Type(name = "DataBox", value = DataboxJobSecrets.class)
})
public class JobSecrets {
    /**
     * Dc Access Security Code for Customer Managed Shipping.
     */
    @JsonProperty(value = "dcAccessSecurityCode")
    private DcAccessSecurityCode dcAccessSecurityCode;

    /**
     * Get dc Access Security Code for Customer Managed Shipping.
     *
     * @return the dcAccessSecurityCode value
     */
    public DcAccessSecurityCode dcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }

    /**
     * Set dc Access Security Code for Customer Managed Shipping.
     *
     * @param dcAccessSecurityCode the dcAccessSecurityCode value to set
     * @return the JobSecrets object itself.
     */
    public JobSecrets withDcAccessSecurityCode(DcAccessSecurityCode dcAccessSecurityCode) {
        this.dcAccessSecurityCode = dcAccessSecurityCode;
        return this;
    }

}
