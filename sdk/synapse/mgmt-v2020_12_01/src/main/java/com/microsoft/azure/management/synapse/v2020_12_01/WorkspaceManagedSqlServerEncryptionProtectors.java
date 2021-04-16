/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.EncryptionProtectorInner;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.WorkspaceManagedSqlServerEncryptionProtectorsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkspaceManagedSqlServerEncryptionProtectors.
 */
public interface WorkspaceManagedSqlServerEncryptionProtectors extends HasInner<WorkspaceManagedSqlServerEncryptionProtectorsInner> {
    /**
     * Get workspace server's encryption protector.
     * Get workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionProtector> getAsync(String resourceGroupName, String workspaceName);

    /**
     * Updates workspace server's encryption protector.
     * Updates workspace managed sql server's encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionProtector> createOrUpdateAsync(String resourceGroupName, String workspaceName, EncryptionProtectorInner parameters);

    /**
     * Get list of encryption protectors for the server.
     * Get list of encryption protectors for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EncryptionProtector> listAsync(final String resourceGroupName, final String workspaceName);

    /**
     * Revalidates server's existing encryption protector.
     * Revalidates workspace managed sql server's existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable revalidateAsync(String resourceGroupName, String workspaceName);

}
