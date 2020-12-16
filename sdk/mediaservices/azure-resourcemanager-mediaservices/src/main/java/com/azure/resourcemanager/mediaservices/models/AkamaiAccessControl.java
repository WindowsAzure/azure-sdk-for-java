// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Akamai access control. */
@Fluent
public final class AkamaiAccessControl {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AkamaiAccessControl.class);

    /*
     * authentication key list
     */
    @JsonProperty(value = "akamaiSignatureHeaderAuthenticationKeyList")
    private List<AkamaiSignatureHeaderAuthenticationKey> akamaiSignatureHeaderAuthenticationKeyList;

    /**
     * Get the akamaiSignatureHeaderAuthenticationKeyList property: authentication key list.
     *
     * @return the akamaiSignatureHeaderAuthenticationKeyList value.
     */
    public List<AkamaiSignatureHeaderAuthenticationKey> akamaiSignatureHeaderAuthenticationKeyList() {
        return this.akamaiSignatureHeaderAuthenticationKeyList;
    }

    /**
     * Set the akamaiSignatureHeaderAuthenticationKeyList property: authentication key list.
     *
     * @param akamaiSignatureHeaderAuthenticationKeyList the akamaiSignatureHeaderAuthenticationKeyList value to set.
     * @return the AkamaiAccessControl object itself.
     */
    public AkamaiAccessControl withAkamaiSignatureHeaderAuthenticationKeyList(
        List<AkamaiSignatureHeaderAuthenticationKey> akamaiSignatureHeaderAuthenticationKeyList) {
        this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (akamaiSignatureHeaderAuthenticationKeyList() != null) {
            akamaiSignatureHeaderAuthenticationKeyList().forEach(e -> e.validate());
        }
    }
}
