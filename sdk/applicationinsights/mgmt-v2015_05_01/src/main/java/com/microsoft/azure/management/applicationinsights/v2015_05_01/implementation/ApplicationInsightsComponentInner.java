/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationType;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.FlowType;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.RequestSource;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.PrivateLinkScopedResource;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.IngestionMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentsResource;

/**
 * An Application Insights component definition.
 */
@JsonFlatten
public class ApplicationInsightsComponentInner extends ComponentsResource {
    /**
     * The kind of application that this component refers to, used to customize
     * UI. This value is a freeform string, values should typically be one of
     * the following: web, ios, other, store, java, phone.
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /**
     * The unique ID of your application. This field mirrors the 'Name' field
     * and cannot be changed.
     */
    @JsonProperty(value = "properties.ApplicationId", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationId;

    /**
     * Application Insights Unique ID for your Application.
     */
    @JsonProperty(value = "properties.AppId", access = JsonProperty.Access.WRITE_ONLY)
    private String appId;

    /**
     * Type of application being monitored. Possible values include: 'web',
     * 'other'.
     */
    @JsonProperty(value = "properties.Application_Type", required = true)
    private ApplicationType applicationType;

    /**
     * Used by the Application Insights system to determine what kind of flow
     * this component was created by. This is to be set to 'Bluefield' when
     * creating/updating a component via the REST API. Possible values include:
     * 'Bluefield'.
     */
    @JsonProperty(value = "properties.Flow_Type")
    private FlowType flowType;

    /**
     * Describes what tool created this Application Insights component.
     * Customers using this API should set this to the default 'rest'. Possible
     * values include: 'rest'.
     */
    @JsonProperty(value = "properties.Request_Source")
    private RequestSource requestSource;

    /**
     * Application Insights Instrumentation key. A read-only value that
     * applications can use to identify the destination for all telemetry sent
     * to Azure Application Insights. This value will be supplied upon
     * construction of each new Application Insights component.
     */
    @JsonProperty(value = "properties.InstrumentationKey", access = JsonProperty.Access.WRITE_ONLY)
    private String instrumentationKey;

    /**
     * Creation Date for the Application Insights component, in ISO 8601
     * format.
     */
    @JsonProperty(value = "properties.CreationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * Azure Tenant Id.
     */
    @JsonProperty(value = "properties.TenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The unique application ID created when a new application is added to
     * HockeyApp, used for communications with HockeyApp.
     */
    @JsonProperty(value = "properties.HockeyAppId")
    private String hockeyAppId;

    /**
     * Token used to authenticate communications with between Application
     * Insights and HockeyApp.
     */
    @JsonProperty(value = "properties.HockeyAppToken", access = JsonProperty.Access.WRITE_ONLY)
    private String hockeyAppToken;

    /**
     * Current state of this component: whether or not is has been provisioned
     * within the resource group it is defined. Users cannot change this value
     * but are able to read from it. Values will include Succeeded, Deploying,
     * Canceled, and Failed.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Percentage of the data produced by the application being monitored that
     * is being sampled for Application Insights telemetry.
     */
    @JsonProperty(value = "properties.SamplingPercentage")
    private Double samplingPercentage;

    /**
     * Application Insights component connection string.
     */
    @JsonProperty(value = "properties.ConnectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String connectionString;

    /**
     * Retention period in days.
     */
    @JsonProperty(value = "properties.RetentionInDays")
    private Integer retentionInDays;

    /**
     * Disable IP masking.
     */
    @JsonProperty(value = "properties.DisableIpMasking")
    private Boolean disableIpMasking;

    /**
     * Purge data immediately after 30 days.
     */
    @JsonProperty(value = "properties.ImmediatePurgeDataOn30Days")
    private Boolean immediatePurgeDataOn30Days;

    /**
     * List of linked private link scope resources.
     */
    @JsonProperty(value = "properties.PrivateLinkScopedResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateLinkScopedResource> privateLinkScopedResources;

    /**
     * Indicates the flow of the ingestion. Possible values include:
     * 'ApplicationInsights', 'ApplicationInsightsWithDiagnosticSettings',
     * 'LogAnalytics'.
     */
    @JsonProperty(value = "properties.IngestionMode")
    private IngestionMode ingestionMode;

    /**
     * Get the kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     *
     * @param kind the kind value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the unique ID of your application. This field mirrors the 'Name' field and cannot be changed.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Get application Insights Unique ID for your Application.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Get type of application being monitored. Possible values include: 'web', 'other'.
     *
     * @return the applicationType value
     */
    public ApplicationType applicationType() {
        return this.applicationType;
    }

    /**
     * Set type of application being monitored. Possible values include: 'web', 'other'.
     *
     * @param applicationType the applicationType value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withApplicationType(ApplicationType applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Get used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API. Possible values include: 'Bluefield'.
     *
     * @return the flowType value
     */
    public FlowType flowType() {
        return this.flowType;
    }

    /**
     * Set used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API. Possible values include: 'Bluefield'.
     *
     * @param flowType the flowType value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withFlowType(FlowType flowType) {
        this.flowType = flowType;
        return this;
    }

    /**
     * Get describes what tool created this Application Insights component. Customers using this API should set this to the default 'rest'. Possible values include: 'rest'.
     *
     * @return the requestSource value
     */
    public RequestSource requestSource() {
        return this.requestSource;
    }

    /**
     * Set describes what tool created this Application Insights component. Customers using this API should set this to the default 'rest'. Possible values include: 'rest'.
     *
     * @param requestSource the requestSource value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withRequestSource(RequestSource requestSource) {
        this.requestSource = requestSource;
        return this;
    }

    /**
     * Get application Insights Instrumentation key. A read-only value that applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value will be supplied upon construction of each new Application Insights component.
     *
     * @return the instrumentationKey value
     */
    public String instrumentationKey() {
        return this.instrumentationKey;
    }

    /**
     * Get creation Date for the Application Insights component, in ISO 8601 format.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get azure Tenant Id.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     *
     * @return the hockeyAppId value
     */
    public String hockeyAppId() {
        return this.hockeyAppId;
    }

    /**
     * Set the unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     *
     * @param hockeyAppId the hockeyAppId value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withHockeyAppId(String hockeyAppId) {
        this.hockeyAppId = hockeyAppId;
        return this;
    }

    /**
     * Get token used to authenticate communications with between Application Insights and HockeyApp.
     *
     * @return the hockeyAppToken value
     */
    public String hockeyAppToken() {
        return this.hockeyAppToken;
    }

    /**
     * Get current state of this component: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     *
     * @return the samplingPercentage value
     */
    public Double samplingPercentage() {
        return this.samplingPercentage;
    }

    /**
     * Set percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     *
     * @param samplingPercentage the samplingPercentage value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withSamplingPercentage(Double samplingPercentage) {
        this.samplingPercentage = samplingPercentage;
        return this;
    }

    /**
     * Get application Insights component connection string.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Get retention period in days.
     *
     * @return the retentionInDays value
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set retention period in days.
     *
     * @param retentionInDays the retentionInDays value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * Get disable IP masking.
     *
     * @return the disableIpMasking value
     */
    public Boolean disableIpMasking() {
        return this.disableIpMasking;
    }

    /**
     * Set disable IP masking.
     *
     * @param disableIpMasking the disableIpMasking value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withDisableIpMasking(Boolean disableIpMasking) {
        this.disableIpMasking = disableIpMasking;
        return this;
    }

    /**
     * Get purge data immediately after 30 days.
     *
     * @return the immediatePurgeDataOn30Days value
     */
    public Boolean immediatePurgeDataOn30Days() {
        return this.immediatePurgeDataOn30Days;
    }

    /**
     * Set purge data immediately after 30 days.
     *
     * @param immediatePurgeDataOn30Days the immediatePurgeDataOn30Days value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withImmediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days) {
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
        return this;
    }

    /**
     * Get list of linked private link scope resources.
     *
     * @return the privateLinkScopedResources value
     */
    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }

    /**
     * Get indicates the flow of the ingestion. Possible values include: 'ApplicationInsights', 'ApplicationInsightsWithDiagnosticSettings', 'LogAnalytics'.
     *
     * @return the ingestionMode value
     */
    public IngestionMode ingestionMode() {
        return this.ingestionMode;
    }

    /**
     * Set indicates the flow of the ingestion. Possible values include: 'ApplicationInsights', 'ApplicationInsightsWithDiagnosticSettings', 'LogAnalytics'.
     *
     * @param ingestionMode the ingestionMode value to set
     * @return the ApplicationInsightsComponentInner object itself.
     */
    public ApplicationInsightsComponentInner withIngestionMode(IngestionMode ingestionMode) {
        this.ingestionMode = ingestionMode;
        return this;
    }

}
