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

/** messageRulePredicates. */
@Fluent
public final class MicrosoftGraphMessageRulePredicates {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphMessageRulePredicates.class);

    /*
     * Represents the strings that should appear in the body of an incoming
     * message in order for the condition or exception to apply.
     */
    @JsonProperty(value = "bodyContains")
    private List<String> bodyContains;

    /*
     * Represents the strings that should appear in the body or subject of an
     * incoming message in order for the condition or exception to apply.
     */
    @JsonProperty(value = "bodyOrSubjectContains")
    private List<String> bodyOrSubjectContains;

    /*
     * Represents the categories that an incoming message should be labeled
     * with in order for the condition or exception to apply.
     */
    @JsonProperty(value = "categories")
    private List<String> categories;

    /*
     * Represents the specific sender email addresses of an incoming message in
     * order for the condition or exception to apply.
     */
    @JsonProperty(value = "fromAddresses")
    private List<MicrosoftGraphRecipient> fromAddresses;

    /*
     * Indicates whether an incoming message must have attachments in order for
     * the condition or exception to apply.
     */
    @JsonProperty(value = "hasAttachments")
    private Boolean hasAttachments;

    /*
     * Represents the strings that appear in the headers of an incoming message
     * in order for the condition or exception to apply.
     */
    @JsonProperty(value = "headerContains")
    private List<String> headerContains;

    /*
     * The importance property.
     */
    @JsonProperty(value = "importance")
    private MicrosoftGraphImportance importance;

    /*
     * Indicates whether an incoming message must be an approval request in
     * order for the condition or exception to apply.
     */
    @JsonProperty(value = "isApprovalRequest")
    private Boolean isApprovalRequest;

    /*
     * Indicates whether an incoming message must be automatically forwarded in
     * order for the condition or exception to apply.
     */
    @JsonProperty(value = "isAutomaticForward")
    private Boolean isAutomaticForward;

    /*
     * Indicates whether an incoming message must be an auto reply in order for
     * the condition or exception to apply.
     */
    @JsonProperty(value = "isAutomaticReply")
    private Boolean isAutomaticReply;

    /*
     * Indicates whether an incoming message must be encrypted in order for the
     * condition or exception to apply.
     */
    @JsonProperty(value = "isEncrypted")
    private Boolean isEncrypted;

    /*
     * Indicates whether an incoming message must be a meeting request in order
     * for the condition or exception to apply.
     */
    @JsonProperty(value = "isMeetingRequest")
    private Boolean isMeetingRequest;

    /*
     * Indicates whether an incoming message must be a meeting response in
     * order for the condition or exception to apply.
     */
    @JsonProperty(value = "isMeetingResponse")
    private Boolean isMeetingResponse;

    /*
     * Indicates whether an incoming message must be a non-delivery report in
     * order for the condition or exception to apply.
     */
    @JsonProperty(value = "isNonDeliveryReport")
    private Boolean isNonDeliveryReport;

    /*
     * Indicates whether an incoming message must be permission controlled
     * (RMS-protected) in order for the condition or exception to apply.
     */
    @JsonProperty(value = "isPermissionControlled")
    private Boolean isPermissionControlled;

    /*
     * Indicates whether an incoming message must be a read receipt in order
     * for the condition or exception to apply.
     */
    @JsonProperty(value = "isReadReceipt")
    private Boolean isReadReceipt;

    /*
     * Indicates whether an incoming message must be S/MIME-signed in order for
     * the condition or exception to apply.
     */
    @JsonProperty(value = "isSigned")
    private Boolean isSigned;

    /*
     * Indicates whether an incoming message must be a voice mail in order for
     * the condition or exception to apply.
     */
    @JsonProperty(value = "isVoicemail")
    private Boolean isVoicemail;

    /*
     * The messageActionFlag property.
     */
    @JsonProperty(value = "messageActionFlag")
    private MicrosoftGraphMessageActionFlag messageActionFlag;

    /*
     * Indicates whether the owner of the mailbox must not be a recipient of an
     * incoming message in order for the condition or exception to apply.
     */
    @JsonProperty(value = "notSentToMe")
    private Boolean notSentToMe;

    /*
     * Represents the strings that appear in either the toRecipients or
     * ccRecipients properties of an incoming message in order for the
     * condition or exception to apply.
     */
    @JsonProperty(value = "recipientContains")
    private List<String> recipientContains;

    /*
     * Represents the strings that appear in the from property of an incoming
     * message in order for the condition or exception to apply.
     */
    @JsonProperty(value = "senderContains")
    private List<String> senderContains;

    /*
     * The sensitivity property.
     */
    @JsonProperty(value = "sensitivity")
    private MicrosoftGraphSensitivity sensitivity;

    /*
     * Indicates whether the owner of the mailbox must be in the ccRecipients
     * property of an incoming message in order for the condition or exception
     * to apply.
     */
    @JsonProperty(value = "sentCcMe")
    private Boolean sentCcMe;

    /*
     * Indicates whether the owner of the mailbox must be the only recipient in
     * an incoming message in order for the condition or exception to apply.
     */
    @JsonProperty(value = "sentOnlyToMe")
    private Boolean sentOnlyToMe;

    /*
     * Represents the email addresses that an incoming message must have been
     * sent to in order for the condition or exception to apply.
     */
    @JsonProperty(value = "sentToAddresses")
    private List<MicrosoftGraphRecipient> sentToAddresses;

    /*
     * Indicates whether the owner of the mailbox must be in the toRecipients
     * property of an incoming message in order for the condition or exception
     * to apply.
     */
    @JsonProperty(value = "sentToMe")
    private Boolean sentToMe;

    /*
     * Indicates whether the owner of the mailbox must be in either a
     * toRecipients or ccRecipients property of an incoming message in order
     * for the condition or exception to apply.
     */
    @JsonProperty(value = "sentToOrCcMe")
    private Boolean sentToOrCcMe;

    /*
     * Represents the strings that appear in the subject of an incoming message
     * in order for the condition or exception to apply.
     */
    @JsonProperty(value = "subjectContains")
    private List<String> subjectContains;

    /*
     * sizeRange
     */
    @JsonProperty(value = "withinSizeRange")
    private MicrosoftGraphSizeRange withinSizeRange;

    /*
     * messageRulePredicates
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the bodyContains property: Represents the strings that should appear in the body of an incoming message in
     * order for the condition or exception to apply.
     *
     * @return the bodyContains value.
     */
    public List<String> bodyContains() {
        return this.bodyContains;
    }

    /**
     * Set the bodyContains property: Represents the strings that should appear in the body of an incoming message in
     * order for the condition or exception to apply.
     *
     * @param bodyContains the bodyContains value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withBodyContains(List<String> bodyContains) {
        this.bodyContains = bodyContains;
        return this;
    }

    /**
     * Get the bodyOrSubjectContains property: Represents the strings that should appear in the body or subject of an
     * incoming message in order for the condition or exception to apply.
     *
     * @return the bodyOrSubjectContains value.
     */
    public List<String> bodyOrSubjectContains() {
        return this.bodyOrSubjectContains;
    }

    /**
     * Set the bodyOrSubjectContains property: Represents the strings that should appear in the body or subject of an
     * incoming message in order for the condition or exception to apply.
     *
     * @param bodyOrSubjectContains the bodyOrSubjectContains value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withBodyOrSubjectContains(List<String> bodyOrSubjectContains) {
        this.bodyOrSubjectContains = bodyOrSubjectContains;
        return this;
    }

    /**
     * Get the categories property: Represents the categories that an incoming message should be labeled with in order
     * for the condition or exception to apply.
     *
     * @return the categories value.
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * Set the categories property: Represents the categories that an incoming message should be labeled with in order
     * for the condition or exception to apply.
     *
     * @param categories the categories value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the fromAddresses property: Represents the specific sender email addresses of an incoming message in order
     * for the condition or exception to apply.
     *
     * @return the fromAddresses value.
     */
    public List<MicrosoftGraphRecipient> fromAddresses() {
        return this.fromAddresses;
    }

    /**
     * Set the fromAddresses property: Represents the specific sender email addresses of an incoming message in order
     * for the condition or exception to apply.
     *
     * @param fromAddresses the fromAddresses value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withFromAddresses(List<MicrosoftGraphRecipient> fromAddresses) {
        this.fromAddresses = fromAddresses;
        return this;
    }

    /**
     * Get the hasAttachments property: Indicates whether an incoming message must have attachments in order for the
     * condition or exception to apply.
     *
     * @return the hasAttachments value.
     */
    public Boolean hasAttachments() {
        return this.hasAttachments;
    }

    /**
     * Set the hasAttachments property: Indicates whether an incoming message must have attachments in order for the
     * condition or exception to apply.
     *
     * @param hasAttachments the hasAttachments value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
        return this;
    }

    /**
     * Get the headerContains property: Represents the strings that appear in the headers of an incoming message in
     * order for the condition or exception to apply.
     *
     * @return the headerContains value.
     */
    public List<String> headerContains() {
        return this.headerContains;
    }

    /**
     * Set the headerContains property: Represents the strings that appear in the headers of an incoming message in
     * order for the condition or exception to apply.
     *
     * @param headerContains the headerContains value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withHeaderContains(List<String> headerContains) {
        this.headerContains = headerContains;
        return this;
    }

    /**
     * Get the importance property: The importance property.
     *
     * @return the importance value.
     */
    public MicrosoftGraphImportance importance() {
        return this.importance;
    }

    /**
     * Set the importance property: The importance property.
     *
     * @param importance the importance value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withImportance(MicrosoftGraphImportance importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get the isApprovalRequest property: Indicates whether an incoming message must be an approval request in order
     * for the condition or exception to apply.
     *
     * @return the isApprovalRequest value.
     */
    public Boolean isApprovalRequest() {
        return this.isApprovalRequest;
    }

    /**
     * Set the isApprovalRequest property: Indicates whether an incoming message must be an approval request in order
     * for the condition or exception to apply.
     *
     * @param isApprovalRequest the isApprovalRequest value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsApprovalRequest(Boolean isApprovalRequest) {
        this.isApprovalRequest = isApprovalRequest;
        return this;
    }

    /**
     * Get the isAutomaticForward property: Indicates whether an incoming message must be automatically forwarded in
     * order for the condition or exception to apply.
     *
     * @return the isAutomaticForward value.
     */
    public Boolean isAutomaticForward() {
        return this.isAutomaticForward;
    }

    /**
     * Set the isAutomaticForward property: Indicates whether an incoming message must be automatically forwarded in
     * order for the condition or exception to apply.
     *
     * @param isAutomaticForward the isAutomaticForward value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsAutomaticForward(Boolean isAutomaticForward) {
        this.isAutomaticForward = isAutomaticForward;
        return this;
    }

    /**
     * Get the isAutomaticReply property: Indicates whether an incoming message must be an auto reply in order for the
     * condition or exception to apply.
     *
     * @return the isAutomaticReply value.
     */
    public Boolean isAutomaticReply() {
        return this.isAutomaticReply;
    }

    /**
     * Set the isAutomaticReply property: Indicates whether an incoming message must be an auto reply in order for the
     * condition or exception to apply.
     *
     * @param isAutomaticReply the isAutomaticReply value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsAutomaticReply(Boolean isAutomaticReply) {
        this.isAutomaticReply = isAutomaticReply;
        return this;
    }

    /**
     * Get the isEncrypted property: Indicates whether an incoming message must be encrypted in order for the condition
     * or exception to apply.
     *
     * @return the isEncrypted value.
     */
    public Boolean isEncrypted() {
        return this.isEncrypted;
    }

    /**
     * Set the isEncrypted property: Indicates whether an incoming message must be encrypted in order for the condition
     * or exception to apply.
     *
     * @param isEncrypted the isEncrypted value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
        return this;
    }

    /**
     * Get the isMeetingRequest property: Indicates whether an incoming message must be a meeting request in order for
     * the condition or exception to apply.
     *
     * @return the isMeetingRequest value.
     */
    public Boolean isMeetingRequest() {
        return this.isMeetingRequest;
    }

    /**
     * Set the isMeetingRequest property: Indicates whether an incoming message must be a meeting request in order for
     * the condition or exception to apply.
     *
     * @param isMeetingRequest the isMeetingRequest value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsMeetingRequest(Boolean isMeetingRequest) {
        this.isMeetingRequest = isMeetingRequest;
        return this;
    }

    /**
     * Get the isMeetingResponse property: Indicates whether an incoming message must be a meeting response in order for
     * the condition or exception to apply.
     *
     * @return the isMeetingResponse value.
     */
    public Boolean isMeetingResponse() {
        return this.isMeetingResponse;
    }

    /**
     * Set the isMeetingResponse property: Indicates whether an incoming message must be a meeting response in order for
     * the condition or exception to apply.
     *
     * @param isMeetingResponse the isMeetingResponse value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsMeetingResponse(Boolean isMeetingResponse) {
        this.isMeetingResponse = isMeetingResponse;
        return this;
    }

    /**
     * Get the isNonDeliveryReport property: Indicates whether an incoming message must be a non-delivery report in
     * order for the condition or exception to apply.
     *
     * @return the isNonDeliveryReport value.
     */
    public Boolean isNonDeliveryReport() {
        return this.isNonDeliveryReport;
    }

    /**
     * Set the isNonDeliveryReport property: Indicates whether an incoming message must be a non-delivery report in
     * order for the condition or exception to apply.
     *
     * @param isNonDeliveryReport the isNonDeliveryReport value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsNonDeliveryReport(Boolean isNonDeliveryReport) {
        this.isNonDeliveryReport = isNonDeliveryReport;
        return this;
    }

    /**
     * Get the isPermissionControlled property: Indicates whether an incoming message must be permission controlled
     * (RMS-protected) in order for the condition or exception to apply.
     *
     * @return the isPermissionControlled value.
     */
    public Boolean isPermissionControlled() {
        return this.isPermissionControlled;
    }

    /**
     * Set the isPermissionControlled property: Indicates whether an incoming message must be permission controlled
     * (RMS-protected) in order for the condition or exception to apply.
     *
     * @param isPermissionControlled the isPermissionControlled value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsPermissionControlled(Boolean isPermissionControlled) {
        this.isPermissionControlled = isPermissionControlled;
        return this;
    }

    /**
     * Get the isReadReceipt property: Indicates whether an incoming message must be a read receipt in order for the
     * condition or exception to apply.
     *
     * @return the isReadReceipt value.
     */
    public Boolean isReadReceipt() {
        return this.isReadReceipt;
    }

    /**
     * Set the isReadReceipt property: Indicates whether an incoming message must be a read receipt in order for the
     * condition or exception to apply.
     *
     * @param isReadReceipt the isReadReceipt value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsReadReceipt(Boolean isReadReceipt) {
        this.isReadReceipt = isReadReceipt;
        return this;
    }

    /**
     * Get the isSigned property: Indicates whether an incoming message must be S/MIME-signed in order for the condition
     * or exception to apply.
     *
     * @return the isSigned value.
     */
    public Boolean isSigned() {
        return this.isSigned;
    }

    /**
     * Set the isSigned property: Indicates whether an incoming message must be S/MIME-signed in order for the condition
     * or exception to apply.
     *
     * @param isSigned the isSigned value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
        return this;
    }

    /**
     * Get the isVoicemail property: Indicates whether an incoming message must be a voice mail in order for the
     * condition or exception to apply.
     *
     * @return the isVoicemail value.
     */
    public Boolean isVoicemail() {
        return this.isVoicemail;
    }

    /**
     * Set the isVoicemail property: Indicates whether an incoming message must be a voice mail in order for the
     * condition or exception to apply.
     *
     * @param isVoicemail the isVoicemail value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withIsVoicemail(Boolean isVoicemail) {
        this.isVoicemail = isVoicemail;
        return this;
    }

    /**
     * Get the messageActionFlag property: The messageActionFlag property.
     *
     * @return the messageActionFlag value.
     */
    public MicrosoftGraphMessageActionFlag messageActionFlag() {
        return this.messageActionFlag;
    }

    /**
     * Set the messageActionFlag property: The messageActionFlag property.
     *
     * @param messageActionFlag the messageActionFlag value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withMessageActionFlag(
        MicrosoftGraphMessageActionFlag messageActionFlag) {
        this.messageActionFlag = messageActionFlag;
        return this;
    }

    /**
     * Get the notSentToMe property: Indicates whether the owner of the mailbox must not be a recipient of an incoming
     * message in order for the condition or exception to apply.
     *
     * @return the notSentToMe value.
     */
    public Boolean notSentToMe() {
        return this.notSentToMe;
    }

    /**
     * Set the notSentToMe property: Indicates whether the owner of the mailbox must not be a recipient of an incoming
     * message in order for the condition or exception to apply.
     *
     * @param notSentToMe the notSentToMe value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withNotSentToMe(Boolean notSentToMe) {
        this.notSentToMe = notSentToMe;
        return this;
    }

    /**
     * Get the recipientContains property: Represents the strings that appear in either the toRecipients or ccRecipients
     * properties of an incoming message in order for the condition or exception to apply.
     *
     * @return the recipientContains value.
     */
    public List<String> recipientContains() {
        return this.recipientContains;
    }

    /**
     * Set the recipientContains property: Represents the strings that appear in either the toRecipients or ccRecipients
     * properties of an incoming message in order for the condition or exception to apply.
     *
     * @param recipientContains the recipientContains value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withRecipientContains(List<String> recipientContains) {
        this.recipientContains = recipientContains;
        return this;
    }

    /**
     * Get the senderContains property: Represents the strings that appear in the from property of an incoming message
     * in order for the condition or exception to apply.
     *
     * @return the senderContains value.
     */
    public List<String> senderContains() {
        return this.senderContains;
    }

    /**
     * Set the senderContains property: Represents the strings that appear in the from property of an incoming message
     * in order for the condition or exception to apply.
     *
     * @param senderContains the senderContains value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSenderContains(List<String> senderContains) {
        this.senderContains = senderContains;
        return this;
    }

    /**
     * Get the sensitivity property: The sensitivity property.
     *
     * @return the sensitivity value.
     */
    public MicrosoftGraphSensitivity sensitivity() {
        return this.sensitivity;
    }

    /**
     * Set the sensitivity property: The sensitivity property.
     *
     * @param sensitivity the sensitivity value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSensitivity(MicrosoftGraphSensitivity sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    /**
     * Get the sentCcMe property: Indicates whether the owner of the mailbox must be in the ccRecipients property of an
     * incoming message in order for the condition or exception to apply.
     *
     * @return the sentCcMe value.
     */
    public Boolean sentCcMe() {
        return this.sentCcMe;
    }

    /**
     * Set the sentCcMe property: Indicates whether the owner of the mailbox must be in the ccRecipients property of an
     * incoming message in order for the condition or exception to apply.
     *
     * @param sentCcMe the sentCcMe value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSentCcMe(Boolean sentCcMe) {
        this.sentCcMe = sentCcMe;
        return this;
    }

    /**
     * Get the sentOnlyToMe property: Indicates whether the owner of the mailbox must be the only recipient in an
     * incoming message in order for the condition or exception to apply.
     *
     * @return the sentOnlyToMe value.
     */
    public Boolean sentOnlyToMe() {
        return this.sentOnlyToMe;
    }

    /**
     * Set the sentOnlyToMe property: Indicates whether the owner of the mailbox must be the only recipient in an
     * incoming message in order for the condition or exception to apply.
     *
     * @param sentOnlyToMe the sentOnlyToMe value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSentOnlyToMe(Boolean sentOnlyToMe) {
        this.sentOnlyToMe = sentOnlyToMe;
        return this;
    }

    /**
     * Get the sentToAddresses property: Represents the email addresses that an incoming message must have been sent to
     * in order for the condition or exception to apply.
     *
     * @return the sentToAddresses value.
     */
    public List<MicrosoftGraphRecipient> sentToAddresses() {
        return this.sentToAddresses;
    }

    /**
     * Set the sentToAddresses property: Represents the email addresses that an incoming message must have been sent to
     * in order for the condition or exception to apply.
     *
     * @param sentToAddresses the sentToAddresses value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSentToAddresses(List<MicrosoftGraphRecipient> sentToAddresses) {
        this.sentToAddresses = sentToAddresses;
        return this;
    }

    /**
     * Get the sentToMe property: Indicates whether the owner of the mailbox must be in the toRecipients property of an
     * incoming message in order for the condition or exception to apply.
     *
     * @return the sentToMe value.
     */
    public Boolean sentToMe() {
        return this.sentToMe;
    }

    /**
     * Set the sentToMe property: Indicates whether the owner of the mailbox must be in the toRecipients property of an
     * incoming message in order for the condition or exception to apply.
     *
     * @param sentToMe the sentToMe value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSentToMe(Boolean sentToMe) {
        this.sentToMe = sentToMe;
        return this;
    }

    /**
     * Get the sentToOrCcMe property: Indicates whether the owner of the mailbox must be in either a toRecipients or
     * ccRecipients property of an incoming message in order for the condition or exception to apply.
     *
     * @return the sentToOrCcMe value.
     */
    public Boolean sentToOrCcMe() {
        return this.sentToOrCcMe;
    }

    /**
     * Set the sentToOrCcMe property: Indicates whether the owner of the mailbox must be in either a toRecipients or
     * ccRecipients property of an incoming message in order for the condition or exception to apply.
     *
     * @param sentToOrCcMe the sentToOrCcMe value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSentToOrCcMe(Boolean sentToOrCcMe) {
        this.sentToOrCcMe = sentToOrCcMe;
        return this;
    }

    /**
     * Get the subjectContains property: Represents the strings that appear in the subject of an incoming message in
     * order for the condition or exception to apply.
     *
     * @return the subjectContains value.
     */
    public List<String> subjectContains() {
        return this.subjectContains;
    }

    /**
     * Set the subjectContains property: Represents the strings that appear in the subject of an incoming message in
     * order for the condition or exception to apply.
     *
     * @param subjectContains the subjectContains value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withSubjectContains(List<String> subjectContains) {
        this.subjectContains = subjectContains;
        return this;
    }

    /**
     * Get the withinSizeRange property: sizeRange.
     *
     * @return the withinSizeRange value.
     */
    public MicrosoftGraphSizeRange withinSizeRange() {
        return this.withinSizeRange;
    }

    /**
     * Set the withinSizeRange property: sizeRange.
     *
     * @param withinSizeRange the withinSizeRange value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withWithinSizeRange(MicrosoftGraphSizeRange withinSizeRange) {
        this.withinSizeRange = withinSizeRange;
        return this;
    }

    /**
     * Get the additionalProperties property: messageRulePredicates.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: messageRulePredicates.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphMessageRulePredicates object itself.
     */
    public MicrosoftGraphMessageRulePredicates withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (fromAddresses() != null) {
            fromAddresses().forEach(e -> e.validate());
        }
        if (sentToAddresses() != null) {
            sentToAddresses().forEach(e -> e.validate());
        }
        if (withinSizeRange() != null) {
            withinSizeRange().validate();
        }
    }
}
