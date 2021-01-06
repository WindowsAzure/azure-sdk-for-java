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

/** chatMessagePolicyViolation. */
@Fluent
public final class MicrosoftGraphChatMessagePolicyViolation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphChatMessagePolicyViolation.class);

    /*
     * The dlpAction property.
     */
    @JsonProperty(value = "dlpAction")
    private MicrosoftGraphChatMessagePolicyViolationDlpActionTypes dlpAction;

    /*
     * Justification text provided by the sender of the message when overriding
     * a policy violation.
     */
    @JsonProperty(value = "justificationText")
    private String justificationText;

    /*
     * chatMessagePolicyViolationPolicyTip
     */
    @JsonProperty(value = "policyTip")
    private MicrosoftGraphChatMessagePolicyViolationPolicyTip policyTip;

    /*
     * The userAction property.
     */
    @JsonProperty(value = "userAction")
    private MicrosoftGraphChatMessagePolicyViolationUserActionTypes userAction;

    /*
     * The verdictDetails property.
     */
    @JsonProperty(value = "verdictDetails")
    private MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes verdictDetails;

    /*
     * chatMessagePolicyViolation
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the dlpAction property: The dlpAction property.
     *
     * @return the dlpAction value.
     */
    public MicrosoftGraphChatMessagePolicyViolationDlpActionTypes dlpAction() {
        return this.dlpAction;
    }

    /**
     * Set the dlpAction property: The dlpAction property.
     *
     * @param dlpAction the dlpAction value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolation object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolation withDlpAction(
        MicrosoftGraphChatMessagePolicyViolationDlpActionTypes dlpAction) {
        this.dlpAction = dlpAction;
        return this;
    }

    /**
     * Get the justificationText property: Justification text provided by the sender of the message when overriding a
     * policy violation.
     *
     * @return the justificationText value.
     */
    public String justificationText() {
        return this.justificationText;
    }

    /**
     * Set the justificationText property: Justification text provided by the sender of the message when overriding a
     * policy violation.
     *
     * @param justificationText the justificationText value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolation object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolation withJustificationText(String justificationText) {
        this.justificationText = justificationText;
        return this;
    }

    /**
     * Get the policyTip property: chatMessagePolicyViolationPolicyTip.
     *
     * @return the policyTip value.
     */
    public MicrosoftGraphChatMessagePolicyViolationPolicyTip policyTip() {
        return this.policyTip;
    }

    /**
     * Set the policyTip property: chatMessagePolicyViolationPolicyTip.
     *
     * @param policyTip the policyTip value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolation object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolation withPolicyTip(
        MicrosoftGraphChatMessagePolicyViolationPolicyTip policyTip) {
        this.policyTip = policyTip;
        return this;
    }

    /**
     * Get the userAction property: The userAction property.
     *
     * @return the userAction value.
     */
    public MicrosoftGraphChatMessagePolicyViolationUserActionTypes userAction() {
        return this.userAction;
    }

    /**
     * Set the userAction property: The userAction property.
     *
     * @param userAction the userAction value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolation object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolation withUserAction(
        MicrosoftGraphChatMessagePolicyViolationUserActionTypes userAction) {
        this.userAction = userAction;
        return this;
    }

    /**
     * Get the verdictDetails property: The verdictDetails property.
     *
     * @return the verdictDetails value.
     */
    public MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes verdictDetails() {
        return this.verdictDetails;
    }

    /**
     * Set the verdictDetails property: The verdictDetails property.
     *
     * @param verdictDetails the verdictDetails value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolation object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolation withVerdictDetails(
        MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes verdictDetails) {
        this.verdictDetails = verdictDetails;
        return this;
    }

    /**
     * Get the additionalProperties property: chatMessagePolicyViolation.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: chatMessagePolicyViolation.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolation object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolation withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (policyTip() != null) {
            policyTip().validate();
        }
    }
}
