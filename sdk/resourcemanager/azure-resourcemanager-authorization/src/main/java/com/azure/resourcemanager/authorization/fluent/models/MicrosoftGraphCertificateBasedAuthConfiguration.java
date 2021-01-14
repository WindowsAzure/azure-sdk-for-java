// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** certificateBasedAuthConfiguration. */
@Fluent
public final class MicrosoftGraphCertificateBasedAuthConfiguration extends MicrosoftGraphEntity {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MicrosoftGraphCertificateBasedAuthConfiguration.class);

    /*
     * Collection of certificate authorities which creates a trusted
     * certificate chain.
     */
    @JsonProperty(value = "certificateAuthorities")
    private List<MicrosoftGraphCertificateAuthority> certificateAuthorities;

    /*
     * certificateBasedAuthConfiguration
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the certificateAuthorities property: Collection of certificate authorities which creates a trusted
     * certificate chain.
     *
     * @return the certificateAuthorities value.
     */
    public List<MicrosoftGraphCertificateAuthority> certificateAuthorities() {
        return this.certificateAuthorities;
    }

    /**
     * Set the certificateAuthorities property: Collection of certificate authorities which creates a trusted
     * certificate chain.
     *
     * @param certificateAuthorities the certificateAuthorities value to set.
     * @return the MicrosoftGraphCertificateBasedAuthConfiguration object itself.
     */
    public MicrosoftGraphCertificateBasedAuthConfiguration withCertificateAuthorities(
        List<MicrosoftGraphCertificateAuthority> certificateAuthorities) {
        this.certificateAuthorities = certificateAuthorities;
        return this;
    }

    /**
     * Get the additionalProperties property: certificateBasedAuthConfiguration.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: certificateBasedAuthConfiguration.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphCertificateBasedAuthConfiguration object itself.
     */
    public MicrosoftGraphCertificateBasedAuthConfiguration withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphCertificateBasedAuthConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (certificateAuthorities() != null) {
            certificateAuthorities().forEach(e -> e.validate());
        }
    }
}
