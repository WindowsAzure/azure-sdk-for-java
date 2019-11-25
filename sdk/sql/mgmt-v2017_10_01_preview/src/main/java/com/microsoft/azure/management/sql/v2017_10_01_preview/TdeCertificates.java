/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import rx.Completable;
import com.microsoft.azure.management.sql.v2017_10_01_preview.implementation.TdeCertificateInner;
import com.microsoft.azure.management.sql.v2017_10_01_preview.implementation.TdeCertificatesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TdeCertificates.
 */
public interface TdeCertificates extends HasInner<TdeCertificatesInner> {
    /**
     * Creates a TDE certificate for a given server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested TDE certificate to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable createAsync(String resourceGroupName, String serverName, TdeCertificateInner parameters);

}
