/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The replication summary for the domain controller inbound neighbor.
 */
public class InboundReplicationNeighbor {
    /**
     * The name of the source domain controller.
     */
    @JsonProperty(value = "sourceDomainController")
    private String sourceDomainController;

    /**
     * The number of consecutive failure counts.
     */
    @JsonProperty(value = "consecutiveFailureCount")
    private Integer consecutiveFailureCount;

    /**
     * The naming context.
     */
    @JsonProperty(value = "namingContext")
    private String namingContext;

    /**
     * The health status for the domain controller.
     */
    @JsonProperty(value = "status")
    private Integer status;

    /**
     * The last time a sync was attempted on the domain controller.
     */
    @JsonProperty(value = "lastAttemptedSync")
    private DateTime lastAttemptedSync;

    /**
     * The last time when a successful sync happened.
     */
    @JsonProperty(value = "lastSuccessfulSync")
    private DateTime lastSuccessfulSync;

    /**
     * The last error code.
     */
    @JsonProperty(value = "lastErrorCode")
    private Integer lastErrorCode;

    /**
     * The error message of the last error.
     */
    @JsonProperty(value = "lastErrorMessage")
    private String lastErrorMessage;

    /**
     * The error title.
     */
    @JsonProperty(value = "errorTitle")
    private String errorTitle;

    /**
     * The error description.
     */
    @JsonProperty(value = "errorDescription")
    private String errorDescription;

    /**
     * The link for the fix of the error.
     */
    @JsonProperty(value = "fixLink")
    private String fixLink;

    /**
     * The details of the fix.
     */
    @JsonProperty(value = "fixDetails")
    private String fixDetails;

    /**
     * The additional details.
     */
    @JsonProperty(value = "additionalInfo")
    private String additionalInfo;

    /**
     * Get the name of the source domain controller.
     *
     * @return the sourceDomainController value
     */
    public String sourceDomainController() {
        return this.sourceDomainController;
    }

    /**
     * Set the name of the source domain controller.
     *
     * @param sourceDomainController the sourceDomainController value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withSourceDomainController(String sourceDomainController) {
        this.sourceDomainController = sourceDomainController;
        return this;
    }

    /**
     * Get the number of consecutive failure counts.
     *
     * @return the consecutiveFailureCount value
     */
    public Integer consecutiveFailureCount() {
        return this.consecutiveFailureCount;
    }

    /**
     * Set the number of consecutive failure counts.
     *
     * @param consecutiveFailureCount the consecutiveFailureCount value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withConsecutiveFailureCount(Integer consecutiveFailureCount) {
        this.consecutiveFailureCount = consecutiveFailureCount;
        return this;
    }

    /**
     * Get the naming context.
     *
     * @return the namingContext value
     */
    public String namingContext() {
        return this.namingContext;
    }

    /**
     * Set the naming context.
     *
     * @param namingContext the namingContext value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withNamingContext(String namingContext) {
        this.namingContext = namingContext;
        return this;
    }

    /**
     * Get the health status for the domain controller.
     *
     * @return the status value
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set the health status for the domain controller.
     *
     * @param status the status value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get the last time a sync was attempted on the domain controller.
     *
     * @return the lastAttemptedSync value
     */
    public DateTime lastAttemptedSync() {
        return this.lastAttemptedSync;
    }

    /**
     * Set the last time a sync was attempted on the domain controller.
     *
     * @param lastAttemptedSync the lastAttemptedSync value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withLastAttemptedSync(DateTime lastAttemptedSync) {
        this.lastAttemptedSync = lastAttemptedSync;
        return this;
    }

    /**
     * Get the last time when a successful sync happened.
     *
     * @return the lastSuccessfulSync value
     */
    public DateTime lastSuccessfulSync() {
        return this.lastSuccessfulSync;
    }

    /**
     * Set the last time when a successful sync happened.
     *
     * @param lastSuccessfulSync the lastSuccessfulSync value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withLastSuccessfulSync(DateTime lastSuccessfulSync) {
        this.lastSuccessfulSync = lastSuccessfulSync;
        return this;
    }

    /**
     * Get the last error code.
     *
     * @return the lastErrorCode value
     */
    public Integer lastErrorCode() {
        return this.lastErrorCode;
    }

    /**
     * Set the last error code.
     *
     * @param lastErrorCode the lastErrorCode value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withLastErrorCode(Integer lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
        return this;
    }

    /**
     * Get the error message of the last error.
     *
     * @return the lastErrorMessage value
     */
    public String lastErrorMessage() {
        return this.lastErrorMessage;
    }

    /**
     * Set the error message of the last error.
     *
     * @param lastErrorMessage the lastErrorMessage value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
        return this;
    }

    /**
     * Get the error title.
     *
     * @return the errorTitle value
     */
    public String errorTitle() {
        return this.errorTitle;
    }

    /**
     * Set the error title.
     *
     * @param errorTitle the errorTitle value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }

    /**
     * Get the error description.
     *
     * @return the errorDescription value
     */
    public String errorDescription() {
        return this.errorDescription;
    }

    /**
     * Set the error description.
     *
     * @param errorDescription the errorDescription value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * Get the link for the fix of the error.
     *
     * @return the fixLink value
     */
    public String fixLink() {
        return this.fixLink;
    }

    /**
     * Set the link for the fix of the error.
     *
     * @param fixLink the fixLink value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withFixLink(String fixLink) {
        this.fixLink = fixLink;
        return this;
    }

    /**
     * Get the details of the fix.
     *
     * @return the fixDetails value
     */
    public String fixDetails() {
        return this.fixDetails;
    }

    /**
     * Set the details of the fix.
     *
     * @param fixDetails the fixDetails value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withFixDetails(String fixDetails) {
        this.fixDetails = fixDetails;
        return this;
    }

    /**
     * Get the additional details.
     *
     * @return the additionalInfo value
     */
    public String additionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Set the additional details.
     *
     * @param additionalInfo the additionalInfo value to set
     * @return the InboundReplicationNeighbor object itself.
     */
    public InboundReplicationNeighbor withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

}
