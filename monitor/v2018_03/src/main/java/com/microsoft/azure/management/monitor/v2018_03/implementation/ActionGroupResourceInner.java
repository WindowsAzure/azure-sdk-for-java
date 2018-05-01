/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03.implementation;

import java.util.List;
import com.microsoft.azure.management.monitor.v2018_03.EmailReceiver;
import com.microsoft.azure.management.monitor.v2018_03.SmsReceiver;
import com.microsoft.azure.management.monitor.v2018_03.WebhookReceiver;
import com.microsoft.azure.management.monitor.v2018_03.ItsmReceiver;
import com.microsoft.azure.management.monitor.v2018_03.AzureAppPushReceiver;
import com.microsoft.azure.management.monitor.v2018_03.AutomationRunbookReceiver;
import com.microsoft.azure.management.monitor.v2018_03.VoiceReceiver;
import com.microsoft.azure.management.monitor.v2018_03.LogicAppReceiver;
import com.microsoft.azure.management.monitor.v2018_03.AzureFunctionReceiver;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An action group resource.
 */
@JsonFlatten
public class ActionGroupResourceInner extends Resource {
    /**
     * The short name of the action group. This will be used in SMS messages.
     */
    @JsonProperty(value = "properties.groupShortName", required = true)
    private String groupShortName;

    /**
     * Indicates whether this action group is enabled. If an action group is
     * not enabled, then none of its receivers will receive communications.
     */
    @JsonProperty(value = "properties.enabled", required = true)
    private boolean enabled;

    /**
     * The list of email receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.emailReceivers")
    private List<EmailReceiver> emailReceivers;

    /**
     * The list of SMS receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.smsReceivers")
    private List<SmsReceiver> smsReceivers;

    /**
     * The list of webhook receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.webhookReceivers")
    private List<WebhookReceiver> webhookReceivers;

    /**
     * The list of ITSM receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.itsmReceivers")
    private List<ItsmReceiver> itsmReceivers;

    /**
     * The list of AzureAppPush receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.azureAppPushReceivers")
    private List<AzureAppPushReceiver> azureAppPushReceivers;

    /**
     * The list of AutomationRunbook receivers that are part of this action
     * group.
     */
    @JsonProperty(value = "properties.automationRunbookReceivers")
    private List<AutomationRunbookReceiver> automationRunbookReceivers;

    /**
     * The list of voice receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.voiceReceivers")
    private List<VoiceReceiver> voiceReceivers;

    /**
     * The list of logic app receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.logicAppReceivers")
    private List<LogicAppReceiver> logicAppReceivers;

    /**
     * The list of azure function receivers that are part of this action group.
     */
    @JsonProperty(value = "properties.azureFunctionReceivers")
    private List<AzureFunctionReceiver> azureFunctionReceivers;

    /**
     * Get the groupShortName value.
     *
     * @return the groupShortName value
     */
    public String groupShortName() {
        return this.groupShortName;
    }

    /**
     * Set the groupShortName value.
     *
     * @param groupShortName the groupShortName value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withGroupShortName(String groupShortName) {
        this.groupShortName = groupShortName;
        return this;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the emailReceivers value.
     *
     * @return the emailReceivers value
     */
    public List<EmailReceiver> emailReceivers() {
        return this.emailReceivers;
    }

    /**
     * Set the emailReceivers value.
     *
     * @param emailReceivers the emailReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withEmailReceivers(List<EmailReceiver> emailReceivers) {
        this.emailReceivers = emailReceivers;
        return this;
    }

    /**
     * Get the smsReceivers value.
     *
     * @return the smsReceivers value
     */
    public List<SmsReceiver> smsReceivers() {
        return this.smsReceivers;
    }

    /**
     * Set the smsReceivers value.
     *
     * @param smsReceivers the smsReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withSmsReceivers(List<SmsReceiver> smsReceivers) {
        this.smsReceivers = smsReceivers;
        return this;
    }

    /**
     * Get the webhookReceivers value.
     *
     * @return the webhookReceivers value
     */
    public List<WebhookReceiver> webhookReceivers() {
        return this.webhookReceivers;
    }

    /**
     * Set the webhookReceivers value.
     *
     * @param webhookReceivers the webhookReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withWebhookReceivers(List<WebhookReceiver> webhookReceivers) {
        this.webhookReceivers = webhookReceivers;
        return this;
    }

    /**
     * Get the itsmReceivers value.
     *
     * @return the itsmReceivers value
     */
    public List<ItsmReceiver> itsmReceivers() {
        return this.itsmReceivers;
    }

    /**
     * Set the itsmReceivers value.
     *
     * @param itsmReceivers the itsmReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withItsmReceivers(List<ItsmReceiver> itsmReceivers) {
        this.itsmReceivers = itsmReceivers;
        return this;
    }

    /**
     * Get the azureAppPushReceivers value.
     *
     * @return the azureAppPushReceivers value
     */
    public List<AzureAppPushReceiver> azureAppPushReceivers() {
        return this.azureAppPushReceivers;
    }

    /**
     * Set the azureAppPushReceivers value.
     *
     * @param azureAppPushReceivers the azureAppPushReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withAzureAppPushReceivers(List<AzureAppPushReceiver> azureAppPushReceivers) {
        this.azureAppPushReceivers = azureAppPushReceivers;
        return this;
    }

    /**
     * Get the automationRunbookReceivers value.
     *
     * @return the automationRunbookReceivers value
     */
    public List<AutomationRunbookReceiver> automationRunbookReceivers() {
        return this.automationRunbookReceivers;
    }

    /**
     * Set the automationRunbookReceivers value.
     *
     * @param automationRunbookReceivers the automationRunbookReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withAutomationRunbookReceivers(List<AutomationRunbookReceiver> automationRunbookReceivers) {
        this.automationRunbookReceivers = automationRunbookReceivers;
        return this;
    }

    /**
     * Get the voiceReceivers value.
     *
     * @return the voiceReceivers value
     */
    public List<VoiceReceiver> voiceReceivers() {
        return this.voiceReceivers;
    }

    /**
     * Set the voiceReceivers value.
     *
     * @param voiceReceivers the voiceReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withVoiceReceivers(List<VoiceReceiver> voiceReceivers) {
        this.voiceReceivers = voiceReceivers;
        return this;
    }

    /**
     * Get the logicAppReceivers value.
     *
     * @return the logicAppReceivers value
     */
    public List<LogicAppReceiver> logicAppReceivers() {
        return this.logicAppReceivers;
    }

    /**
     * Set the logicAppReceivers value.
     *
     * @param logicAppReceivers the logicAppReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withLogicAppReceivers(List<LogicAppReceiver> logicAppReceivers) {
        this.logicAppReceivers = logicAppReceivers;
        return this;
    }

    /**
     * Get the azureFunctionReceivers value.
     *
     * @return the azureFunctionReceivers value
     */
    public List<AzureFunctionReceiver> azureFunctionReceivers() {
        return this.azureFunctionReceivers;
    }

    /**
     * Set the azureFunctionReceivers value.
     *
     * @param azureFunctionReceivers the azureFunctionReceivers value to set
     * @return the ActionGroupResourceInner object itself.
     */
    public ActionGroupResourceInner withAzureFunctionReceivers(List<AzureFunctionReceiver> azureFunctionReceivers) {
        this.azureFunctionReceivers = azureFunctionReceivers;
        return this;
    }

}
