/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationRecoveryPlansInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationRecoveryPlans.
 */
public interface ReplicationRecoveryPlans extends SupportsCreating<RecoveryPlan.DefinitionStages.Blank>, HasInner<ReplicationRecoveryPlansInner> {
    /**
     * Execute commit failover of the recovery plan.
     * The operation to commit the fail over of a recovery plan.
     *
     * @param recoveryPlanName Recovery plan name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> failoverCommitAsync(String recoveryPlanName);

    /**
     * Execute planned failover of the recovery plan.
     * The operation to start the planned failover of a recovery plan.
     *
     * @param recoveryPlanName Recovery plan name.
     * @param properties The recovery plan planned failover input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> plannedFailoverAsync(String recoveryPlanName, RecoveryPlanPlannedFailoverInputProperties properties);

    /**
     * Execute reprotect of the recovery plan.
     * The operation to reprotect(reverse replicate) a recovery plan.
     *
     * @param recoveryPlanName Recovery plan name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> reprotectAsync(String recoveryPlanName);

    /**
     * Execute test failover of the recovery plan.
     * The operation to start the test failover of a recovery plan.
     *
     * @param recoveryPlanName Recovery plan name.
     * @param properties The recovery plan test failover input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> testFailoverAsync(String recoveryPlanName, RecoveryPlanTestFailoverInputProperties properties);

    /**
     * Execute test failover cleanup of the recovery plan.
     * The operation to cleanup test failover of a recovery plan.
     *
     * @param recoveryPlanName Recovery plan name.
     * @param properties The recovery plan test failover cleanup input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> testFailoverCleanupAsync(String recoveryPlanName, RecoveryPlanTestFailoverCleanupInputProperties properties);

    /**
     * Execute unplanned failover of the recovery plan.
     * The operation to start the failover of a recovery plan.
     *
     * @param recoveryPlanName Recovery plan name.
     * @param properties The recovery plan unplanned failover input properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> unplannedFailoverAsync(String recoveryPlanName, RecoveryPlanUnplannedFailoverInputProperties properties);

    /**
     * Gets the requested recovery plan.
     * Gets the details of the recovery plan.
     *
     * @param recoveryPlanName Name of the recovery plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> getAsync(String recoveryPlanName);

    /**
     * Gets the list of recovery plans.
     * Lists the recovery plans in the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPlan> listAsync();

    /**
     * Deletes the specified recovery plan.
     * Delete a recovery plan.
     *
     * @param recoveryPlanName Recovery plan name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String recoveryPlanName);

}
