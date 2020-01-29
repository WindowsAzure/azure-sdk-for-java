/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation.ReplicationPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationPolicies.
 */
public interface ReplicationPolicies extends SupportsCreating<Policy.DefinitionStages.Blank>, HasInner<ReplicationPoliciesInner> {
    /**
     * Gets the requested policy.
     * Gets the details of a replication policy.
     *
     * @param policyName Replication policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Policy> getAsync(String policyName);

    /**
     * Gets the list of replication policies.
     * Lists the replication policies for a vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Policy> listAsync();

    /**
     * Delete the policy.
     * The operation to delete a replication policy.
     *
     * @param policyName Replication policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String policyName);

}
