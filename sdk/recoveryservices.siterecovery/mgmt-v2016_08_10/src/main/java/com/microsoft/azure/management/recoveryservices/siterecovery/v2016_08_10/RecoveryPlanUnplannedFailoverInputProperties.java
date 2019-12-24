/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan unplanned failover input properties.
 */
public class RecoveryPlanUnplannedFailoverInputProperties {
    /**
     * The failover direction. Possible values include: 'PrimaryToRecovery',
     * 'RecoveryToPrimary'.
     */
    @JsonProperty(value = "failoverDirection", required = true)
    private PossibleOperationsDirections failoverDirection;

    /**
     * A value indicating whether source site operations are required. Possible
     * values include: 'Required', 'NotRequired'.
     */
    @JsonProperty(value = "sourceSiteOperations", required = true)
    private SourceSiteOperations sourceSiteOperations;

    /**
     * The provider specific properties.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails;

    /**
     * Get the failover direction. Possible values include: 'PrimaryToRecovery', 'RecoveryToPrimary'.
     *
     * @return the failoverDirection value
     */
    public PossibleOperationsDirections failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failover direction. Possible values include: 'PrimaryToRecovery', 'RecoveryToPrimary'.
     *
     * @param failoverDirection the failoverDirection value to set
     * @return the RecoveryPlanUnplannedFailoverInputProperties object itself.
     */
    public RecoveryPlanUnplannedFailoverInputProperties withFailoverDirection(PossibleOperationsDirections failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get a value indicating whether source site operations are required. Possible values include: 'Required', 'NotRequired'.
     *
     * @return the sourceSiteOperations value
     */
    public SourceSiteOperations sourceSiteOperations() {
        return this.sourceSiteOperations;
    }

    /**
     * Set a value indicating whether source site operations are required. Possible values include: 'Required', 'NotRequired'.
     *
     * @param sourceSiteOperations the sourceSiteOperations value to set
     * @return the RecoveryPlanUnplannedFailoverInputProperties object itself.
     */
    public RecoveryPlanUnplannedFailoverInputProperties withSourceSiteOperations(SourceSiteOperations sourceSiteOperations) {
        this.sourceSiteOperations = sourceSiteOperations;
        return this;
    }

    /**
     * Get the provider specific properties.
     *
     * @return the providerSpecificDetails value
     */
    public List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the provider specific properties.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the RecoveryPlanUnplannedFailoverInputProperties object itself.
     */
    public RecoveryPlanUnplannedFailoverInputProperties withProviderSpecificDetails(List<RecoveryPlanProviderSpecificFailoverInput> providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}
