/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationVaultHealthsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationVaultHealths.
 */
public interface ReplicationVaultHealths extends HasInner<ReplicationVaultHealthsInner> {
    /**
     * Gets the health summary for the vault.
     * Gets the health details of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VaultHealthDetails> getAsync();

    /**
     * Refreshes health summary of the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VaultHealthDetails> refreshAsync();

}
