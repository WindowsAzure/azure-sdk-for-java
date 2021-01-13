// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This class contains the error details per object. */
@Fluent
public final class ProviderError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderError.class);

    /*
     * The Error code.
     */
    @JsonProperty(value = "errorCode")
    private Integer errorCode;

    /*
     * The Error message.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /*
     * The Provider error Id.
     */
    @JsonProperty(value = "errorId")
    private String errorId;

    /*
     * The possible causes for the error.
     */
    @JsonProperty(value = "possibleCauses")
    private String possibleCauses;

    /*
     * The recommended action to resolve the error.
     */
    @JsonProperty(value = "recommendedAction")
    private String recommendedAction;

    /**
     * Get the errorCode property: The Error code.
     *
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The Error code.
     *
     * @param errorCode the errorCode value to set.
     * @return the ProviderError object itself.
     */
    public ProviderError withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorMessage property: The Error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: The Error message.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the ProviderError object itself.
     */
    public ProviderError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the errorId property: The Provider error Id.
     *
     * @return the errorId value.
     */
    public String errorId() {
        return this.errorId;
    }

    /**
     * Set the errorId property: The Provider error Id.
     *
     * @param errorId the errorId value to set.
     * @return the ProviderError object itself.
     */
    public ProviderError withErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * Get the possibleCauses property: The possible causes for the error.
     *
     * @return the possibleCauses value.
     */
    public String possibleCauses() {
        return this.possibleCauses;
    }

    /**
     * Set the possibleCauses property: The possible causes for the error.
     *
     * @param possibleCauses the possibleCauses value to set.
     * @return the ProviderError object itself.
     */
    public ProviderError withPossibleCauses(String possibleCauses) {
        this.possibleCauses = possibleCauses;
        return this;
    }

    /**
     * Get the recommendedAction property: The recommended action to resolve the error.
     *
     * @return the recommendedAction value.
     */
    public String recommendedAction() {
        return this.recommendedAction;
    }

    /**
     * Set the recommendedAction property: The recommended action to resolve the error.
     *
     * @param recommendedAction the recommendedAction value to set.
     * @return the ProviderError object itself.
     */
    public ProviderError withRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
