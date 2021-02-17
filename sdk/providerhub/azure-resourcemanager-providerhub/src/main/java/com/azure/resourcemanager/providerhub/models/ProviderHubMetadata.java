// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ProviderHubMetadata model. */
@Fluent
public class ProviderHubMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderHubMetadata.class);

    /*
     * The providerAuthorizations property.
     */
    @JsonProperty(value = "providerAuthorizations")
    private List<ResourceProviderAuthorization> providerAuthorizations;

    /*
     * The providerAuthentication property.
     */
    @JsonProperty(value = "providerAuthentication")
    private ResourceProviderAuthentication providerAuthentication;

    /*
     * The thirdPartyProviderAuthorization property.
     */
    @JsonProperty(value = "thirdPartyProviderAuthorization")
    private ThirdPartyProviderAuthorization thirdPartyProviderAuthorization;

    /**
     * Get the providerAuthorizations property: The providerAuthorizations property.
     *
     * @return the providerAuthorizations value.
     */
    public List<ResourceProviderAuthorization> providerAuthorizations() {
        return this.providerAuthorizations;
    }

    /**
     * Set the providerAuthorizations property: The providerAuthorizations property.
     *
     * @param providerAuthorizations the providerAuthorizations value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withProviderAuthorizations(List<ResourceProviderAuthorization> providerAuthorizations) {
        this.providerAuthorizations = providerAuthorizations;
        return this;
    }

    /**
     * Get the providerAuthentication property: The providerAuthentication property.
     *
     * @return the providerAuthentication value.
     */
    public ResourceProviderAuthentication providerAuthentication() {
        return this.providerAuthentication;
    }

    /**
     * Set the providerAuthentication property: The providerAuthentication property.
     *
     * @param providerAuthentication the providerAuthentication value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withProviderAuthentication(ResourceProviderAuthentication providerAuthentication) {
        this.providerAuthentication = providerAuthentication;
        return this;
    }

    /**
     * Get the thirdPartyProviderAuthorization property: The thirdPartyProviderAuthorization property.
     *
     * @return the thirdPartyProviderAuthorization value.
     */
    public ThirdPartyProviderAuthorization thirdPartyProviderAuthorization() {
        return this.thirdPartyProviderAuthorization;
    }

    /**
     * Set the thirdPartyProviderAuthorization property: The thirdPartyProviderAuthorization property.
     *
     * @param thirdPartyProviderAuthorization the thirdPartyProviderAuthorization value to set.
     * @return the ProviderHubMetadata object itself.
     */
    public ProviderHubMetadata withThirdPartyProviderAuthorization(
        ThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
        this.thirdPartyProviderAuthorization = thirdPartyProviderAuthorization;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerAuthorizations() != null) {
            providerAuthorizations().forEach(e -> e.validate());
        }
        if (providerAuthentication() != null) {
            providerAuthentication().validate();
        }
        if (thirdPartyProviderAuthorization() != null) {
            thirdPartyProviderAuthorization().validate();
        }
    }
}
