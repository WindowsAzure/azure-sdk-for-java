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
import java.util.Map;

/** The ApplicationsAddKeyRequestBody model. */
@Fluent
public final class ApplicationsAddKeyRequestBodyInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationsAddKeyRequestBodyInner.class);

    /*
     * keyCredential
     */
    @JsonProperty(value = "keyCredential")
    private MicrosoftGraphKeyCredentialInner keyCredential;

    /*
     * passwordCredential
     */
    @JsonProperty(value = "passwordCredential")
    private MicrosoftGraphPasswordCredentialInner passwordCredential;

    /*
     * The proof property.
     */
    @JsonProperty(value = "proof")
    private String proof;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the keyCredential property: keyCredential.
     *
     * @return the keyCredential value.
     */
    public MicrosoftGraphKeyCredentialInner keyCredential() {
        return this.keyCredential;
    }

    /**
     * Set the keyCredential property: keyCredential.
     *
     * @param keyCredential the keyCredential value to set.
     * @return the ApplicationsAddKeyRequestBodyInner object itself.
     */
    public ApplicationsAddKeyRequestBodyInner withKeyCredential(MicrosoftGraphKeyCredentialInner keyCredential) {
        this.keyCredential = keyCredential;
        return this;
    }

    /**
     * Get the passwordCredential property: passwordCredential.
     *
     * @return the passwordCredential value.
     */
    public MicrosoftGraphPasswordCredentialInner passwordCredential() {
        return this.passwordCredential;
    }

    /**
     * Set the passwordCredential property: passwordCredential.
     *
     * @param passwordCredential the passwordCredential value to set.
     * @return the ApplicationsAddKeyRequestBodyInner object itself.
     */
    public ApplicationsAddKeyRequestBodyInner withPasswordCredential(
        MicrosoftGraphPasswordCredentialInner passwordCredential) {
        this.passwordCredential = passwordCredential;
        return this;
    }

    /**
     * Get the proof property: The proof property.
     *
     * @return the proof value.
     */
    public String proof() {
        return this.proof;
    }

    /**
     * Set the proof property: The proof property.
     *
     * @param proof the proof value to set.
     * @return the ApplicationsAddKeyRequestBodyInner object itself.
     */
    public ApplicationsAddKeyRequestBodyInner withProof(String proof) {
        this.proof = proof;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ApplicationsAddKeyRequestBodyInner object itself.
     */
    public ApplicationsAddKeyRequestBodyInner withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyCredential() != null) {
            keyCredential().validate();
        }
        if (passwordCredential() != null) {
            passwordCredential().validate();
        }
    }
}
