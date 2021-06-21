// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Specifies the action to send email when the rule condition is evaluated. The discriminator is always RuleEmailAction
 * in this case.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata\\.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.RuleEmailAction")
@JsonFlatten
@Fluent
public class RuleEmailAction extends RuleAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleEmailAction.class);

    /*
     * Whether the administrators (service and co-administrators) of the
     * service should be notified when the alert is activated.
     */
    @JsonProperty(value = "sendToServiceOwners")
    private Boolean sendToServiceOwners;

    /*
     * the list of administrator's custom email addresses to notify of the
     * activation of the alert.
     */
    @JsonProperty(value = "customEmails")
    private List<String> customEmails;

    /**
     * Get the sendToServiceOwners property: Whether the administrators (service and co-administrators) of the service
     * should be notified when the alert is activated.
     *
     * @return the sendToServiceOwners value.
     */
    public Boolean sendToServiceOwners() {
        return this.sendToServiceOwners;
    }

    /**
     * Set the sendToServiceOwners property: Whether the administrators (service and co-administrators) of the service
     * should be notified when the alert is activated.
     *
     * @param sendToServiceOwners the sendToServiceOwners value to set.
     * @return the RuleEmailAction object itself.
     */
    public RuleEmailAction withSendToServiceOwners(Boolean sendToServiceOwners) {
        this.sendToServiceOwners = sendToServiceOwners;
        return this;
    }

    /**
     * Get the customEmails property: the list of administrator's custom email addresses to notify of the activation of
     * the alert.
     *
     * @return the customEmails value.
     */
    public List<String> customEmails() {
        return this.customEmails;
    }

    /**
     * Set the customEmails property: the list of administrator's custom email addresses to notify of the activation of
     * the alert.
     *
     * @param customEmails the customEmails value to set.
     * @return the RuleEmailAction object itself.
     */
    public RuleEmailAction withCustomEmails(List<String> customEmails) {
        this.customEmails = customEmails;
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
    }
}
