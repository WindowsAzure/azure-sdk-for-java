/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview;

import rx.Observable;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation.CheckNameAvailabilitysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing CheckNameAvailabilitys.
 */
public interface CheckNameAvailabilitys extends HasInner<CheckNameAvailabilitysInner> {
    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NameAvailability> executeAsync(NameAvailabilityRequest nameAvailabilityRequest);

}
