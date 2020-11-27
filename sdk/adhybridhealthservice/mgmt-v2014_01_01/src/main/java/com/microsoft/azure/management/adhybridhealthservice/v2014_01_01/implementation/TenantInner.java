/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details of the onboarded tenant.
 */
public class TenantInner {
    /**
     * The Id of the tenant.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The Azure Active Directory license of the tenant.
     */
    @JsonProperty(value = "aadLicense")
    private String aadLicense;

    /**
     * Indicate if the tenant has Azure Active Directory Premium license or
     * not.
     */
    @JsonProperty(value = "aadPremium")
    private Boolean aadPremium;

    /**
     * Indicates if the tenant is configured to automatically receive updates
     * for Azure Active Directory Connect Health client side features.
     */
    @JsonProperty(value = "agentAutoUpdate")
    private Boolean agentAutoUpdate;

    /**
     * The time in minutes after which an alert will be auto-suppressed.
     */
    @JsonProperty(value = "alertSuppressionTimeInMins")
    private Integer alertSuppressionTimeInMins;

    /**
     * Indicates if the tenant data can be seen by Microsoft through Azure
     * portal.
     */
    @JsonProperty(value = "consentedToMicrosoftDevOps")
    private Boolean consentedToMicrosoftDevOps;

    /**
     * The country letter code of the tenant.
     */
    @JsonProperty(value = "countryLetterCode")
    private String countryLetterCode;

    /**
     * The date, in UTC, when the tenant was onboarded to Azure Active
     * Directory Connect Health.
     */
    @JsonProperty(value = "createdDate")
    private DateTime createdDate;

    /**
     * The date and time, in UTC, till when the tenant data can be seen by
     * Microsoft through Azure portal.
     */
    @JsonProperty(value = "devOpsTtl")
    private DateTime devOpsTtl;

    /**
     * Indicates if the tenant is disabled in Azure Active Directory Connect
     * Health.
     */
    @JsonProperty(value = "disabled")
    private Boolean disabled;

    /**
     * The reason due to which the tenant was disabled in Azure Active
     * Directory Connect Health.
     */
    @JsonProperty(value = "disabledReason")
    private Integer disabledReason;

    /**
     * The list of global administrators for the tenant.
     */
    @JsonProperty(value = "globalAdminsEmail")
    private List<String> globalAdminsEmail;

    /**
     * The initial domain of the tenant.
     */
    @JsonProperty(value = "initialDomain")
    private String initialDomain;

    /**
     * The date and time, in UTC, when the tenant was last disabled in Azure
     * Active Directory Connect Health.
     */
    @JsonProperty(value = "lastDisabled")
    private DateTime lastDisabled;

    /**
     * The date and time, in UTC, when the tenant onboarding status in Azure
     * Active Directory Connect Health was last verified.
     */
    @JsonProperty(value = "lastVerified")
    private DateTime lastVerified;

    /**
     * Indicates if the tenant is allowed to  onboard to Azure Active Directory
     * Connect Health.
     */
    @JsonProperty(value = "onboardingAllowed")
    private Boolean onboardingAllowed;

    /**
     * Indicates if the tenant is already onboarded to Azure Active Directory
     * Connect Health.
     */
    @JsonProperty(value = "onboarded")
    private Boolean onboarded;

    /**
     * The certificate associated with the tenant to onboard data to Azure
     * Active Directory Connect Health.
     */
    @JsonProperty(value = "pksCertificate")
    private Object pksCertificate;

    /**
     * Indicates if the tenant has signed up for private preview of Azure
     * Active Directory Connect Health features.
     */
    @JsonProperty(value = "privatePreviewTenant")
    private Boolean privatePreviewTenant;

    /**
     * Indicates if data collection for this tenant is disabled or not.
     */
    @JsonProperty(value = "tenantInQuarantine")
    private Boolean tenantInQuarantine;

    /**
     * The name of the tenant.
     */
    @JsonProperty(value = "tenantName")
    private String tenantName;

    /**
     * Get the Id of the tenant.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the Id of the tenant.
     *
     * @param tenantId the tenantId value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the Azure Active Directory license of the tenant.
     *
     * @return the aadLicense value
     */
    public String aadLicense() {
        return this.aadLicense;
    }

    /**
     * Set the Azure Active Directory license of the tenant.
     *
     * @param aadLicense the aadLicense value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withAadLicense(String aadLicense) {
        this.aadLicense = aadLicense;
        return this;
    }

    /**
     * Get indicate if the tenant has Azure Active Directory Premium license or not.
     *
     * @return the aadPremium value
     */
    public Boolean aadPremium() {
        return this.aadPremium;
    }

    /**
     * Set indicate if the tenant has Azure Active Directory Premium license or not.
     *
     * @param aadPremium the aadPremium value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withAadPremium(Boolean aadPremium) {
        this.aadPremium = aadPremium;
        return this;
    }

    /**
     * Get indicates if the tenant is configured to automatically receive updates for Azure Active Directory Connect Health client side features.
     *
     * @return the agentAutoUpdate value
     */
    public Boolean agentAutoUpdate() {
        return this.agentAutoUpdate;
    }

    /**
     * Set indicates if the tenant is configured to automatically receive updates for Azure Active Directory Connect Health client side features.
     *
     * @param agentAutoUpdate the agentAutoUpdate value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withAgentAutoUpdate(Boolean agentAutoUpdate) {
        this.agentAutoUpdate = agentAutoUpdate;
        return this;
    }

    /**
     * Get the time in minutes after which an alert will be auto-suppressed.
     *
     * @return the alertSuppressionTimeInMins value
     */
    public Integer alertSuppressionTimeInMins() {
        return this.alertSuppressionTimeInMins;
    }

    /**
     * Set the time in minutes after which an alert will be auto-suppressed.
     *
     * @param alertSuppressionTimeInMins the alertSuppressionTimeInMins value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withAlertSuppressionTimeInMins(Integer alertSuppressionTimeInMins) {
        this.alertSuppressionTimeInMins = alertSuppressionTimeInMins;
        return this;
    }

    /**
     * Get indicates if the tenant data can be seen by Microsoft through Azure portal.
     *
     * @return the consentedToMicrosoftDevOps value
     */
    public Boolean consentedToMicrosoftDevOps() {
        return this.consentedToMicrosoftDevOps;
    }

    /**
     * Set indicates if the tenant data can be seen by Microsoft through Azure portal.
     *
     * @param consentedToMicrosoftDevOps the consentedToMicrosoftDevOps value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withConsentedToMicrosoftDevOps(Boolean consentedToMicrosoftDevOps) {
        this.consentedToMicrosoftDevOps = consentedToMicrosoftDevOps;
        return this;
    }

    /**
     * Get the country letter code of the tenant.
     *
     * @return the countryLetterCode value
     */
    public String countryLetterCode() {
        return this.countryLetterCode;
    }

    /**
     * Set the country letter code of the tenant.
     *
     * @param countryLetterCode the countryLetterCode value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withCountryLetterCode(String countryLetterCode) {
        this.countryLetterCode = countryLetterCode;
        return this;
    }

    /**
     * Get the date, in UTC, when the tenant was onboarded to Azure Active Directory Connect Health.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the date, in UTC, when the tenant was onboarded to Azure Active Directory Connect Health.
     *
     * @param createdDate the createdDate value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the date and time, in UTC, till when the tenant data can be seen by Microsoft through Azure portal.
     *
     * @return the devOpsTtl value
     */
    public DateTime devOpsTtl() {
        return this.devOpsTtl;
    }

    /**
     * Set the date and time, in UTC, till when the tenant data can be seen by Microsoft through Azure portal.
     *
     * @param devOpsTtl the devOpsTtl value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withDevOpsTtl(DateTime devOpsTtl) {
        this.devOpsTtl = devOpsTtl;
        return this;
    }

    /**
     * Get indicates if the tenant is disabled in Azure Active Directory Connect Health.
     *
     * @return the disabled value
     */
    public Boolean disabled() {
        return this.disabled;
    }

    /**
     * Set indicates if the tenant is disabled in Azure Active Directory Connect Health.
     *
     * @param disabled the disabled value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get the reason due to which the tenant was disabled in Azure Active Directory Connect Health.
     *
     * @return the disabledReason value
     */
    public Integer disabledReason() {
        return this.disabledReason;
    }

    /**
     * Set the reason due to which the tenant was disabled in Azure Active Directory Connect Health.
     *
     * @param disabledReason the disabledReason value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withDisabledReason(Integer disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    /**
     * Get the list of global administrators for the tenant.
     *
     * @return the globalAdminsEmail value
     */
    public List<String> globalAdminsEmail() {
        return this.globalAdminsEmail;
    }

    /**
     * Set the list of global administrators for the tenant.
     *
     * @param globalAdminsEmail the globalAdminsEmail value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withGlobalAdminsEmail(List<String> globalAdminsEmail) {
        this.globalAdminsEmail = globalAdminsEmail;
        return this;
    }

    /**
     * Get the initial domain of the tenant.
     *
     * @return the initialDomain value
     */
    public String initialDomain() {
        return this.initialDomain;
    }

    /**
     * Set the initial domain of the tenant.
     *
     * @param initialDomain the initialDomain value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withInitialDomain(String initialDomain) {
        this.initialDomain = initialDomain;
        return this;
    }

    /**
     * Get the date and time, in UTC, when the tenant was last disabled in Azure Active Directory Connect Health.
     *
     * @return the lastDisabled value
     */
    public DateTime lastDisabled() {
        return this.lastDisabled;
    }

    /**
     * Set the date and time, in UTC, when the tenant was last disabled in Azure Active Directory Connect Health.
     *
     * @param lastDisabled the lastDisabled value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withLastDisabled(DateTime lastDisabled) {
        this.lastDisabled = lastDisabled;
        return this;
    }

    /**
     * Get the date and time, in UTC, when the tenant onboarding status in Azure Active Directory Connect Health was last verified.
     *
     * @return the lastVerified value
     */
    public DateTime lastVerified() {
        return this.lastVerified;
    }

    /**
     * Set the date and time, in UTC, when the tenant onboarding status in Azure Active Directory Connect Health was last verified.
     *
     * @param lastVerified the lastVerified value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withLastVerified(DateTime lastVerified) {
        this.lastVerified = lastVerified;
        return this;
    }

    /**
     * Get indicates if the tenant is allowed to  onboard to Azure Active Directory Connect Health.
     *
     * @return the onboardingAllowed value
     */
    public Boolean onboardingAllowed() {
        return this.onboardingAllowed;
    }

    /**
     * Set indicates if the tenant is allowed to  onboard to Azure Active Directory Connect Health.
     *
     * @param onboardingAllowed the onboardingAllowed value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withOnboardingAllowed(Boolean onboardingAllowed) {
        this.onboardingAllowed = onboardingAllowed;
        return this;
    }

    /**
     * Get indicates if the tenant is already onboarded to Azure Active Directory Connect Health.
     *
     * @return the onboarded value
     */
    public Boolean onboarded() {
        return this.onboarded;
    }

    /**
     * Set indicates if the tenant is already onboarded to Azure Active Directory Connect Health.
     *
     * @param onboarded the onboarded value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withOnboarded(Boolean onboarded) {
        this.onboarded = onboarded;
        return this;
    }

    /**
     * Get the certificate associated with the tenant to onboard data to Azure Active Directory Connect Health.
     *
     * @return the pksCertificate value
     */
    public Object pksCertificate() {
        return this.pksCertificate;
    }

    /**
     * Set the certificate associated with the tenant to onboard data to Azure Active Directory Connect Health.
     *
     * @param pksCertificate the pksCertificate value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withPksCertificate(Object pksCertificate) {
        this.pksCertificate = pksCertificate;
        return this;
    }

    /**
     * Get indicates if the tenant has signed up for private preview of Azure Active Directory Connect Health features.
     *
     * @return the privatePreviewTenant value
     */
    public Boolean privatePreviewTenant() {
        return this.privatePreviewTenant;
    }

    /**
     * Set indicates if the tenant has signed up for private preview of Azure Active Directory Connect Health features.
     *
     * @param privatePreviewTenant the privatePreviewTenant value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withPrivatePreviewTenant(Boolean privatePreviewTenant) {
        this.privatePreviewTenant = privatePreviewTenant;
        return this;
    }

    /**
     * Get indicates if data collection for this tenant is disabled or not.
     *
     * @return the tenantInQuarantine value
     */
    public Boolean tenantInQuarantine() {
        return this.tenantInQuarantine;
    }

    /**
     * Set indicates if data collection for this tenant is disabled or not.
     *
     * @param tenantInQuarantine the tenantInQuarantine value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withTenantInQuarantine(Boolean tenantInQuarantine) {
        this.tenantInQuarantine = tenantInQuarantine;
        return this;
    }

    /**
     * Get the name of the tenant.
     *
     * @return the tenantName value
     */
    public String tenantName() {
        return this.tenantName;
    }

    /**
     * Set the name of the tenant.
     *
     * @param tenantName the tenantName value to set
     * @return the TenantInner object itself.
     */
    public TenantInner withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

}
