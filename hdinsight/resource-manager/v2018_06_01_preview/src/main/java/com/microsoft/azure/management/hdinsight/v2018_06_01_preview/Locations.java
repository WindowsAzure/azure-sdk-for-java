/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import rx.Observable;

/**
 * Type representing Locations.
 */
public interface Locations {
    /**
     * Gets the capabilities for the specified location.
     *
     * @param location The Azure location (region) for which to make the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CapabilitiesResult> getCapabilitiesAsync(String location);

    /**
     * Lists the usages for the specified location.
     *
     * @param location The Azure location (region) for which to make the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsagesListResult> listUsagesAsync(String location);

    /**
     * Lists the billingSpecs for the specified subscription and location.
     *
     * @param location The Azure location (region) for which to make the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingResponseListResult> listBillingSpecsAsync(String location);

}
