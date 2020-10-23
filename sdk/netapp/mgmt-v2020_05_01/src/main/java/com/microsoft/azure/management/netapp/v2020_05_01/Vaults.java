/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_05_01;

import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_05_01.implementation.VaultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Vaults.
 */
public interface Vaults extends HasInner<VaultsInner> {
    /**
     * List vaults.
     * List vaults for a Netapp Account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Vault> listAsync(String resourceGroupName, String accountName);

}
