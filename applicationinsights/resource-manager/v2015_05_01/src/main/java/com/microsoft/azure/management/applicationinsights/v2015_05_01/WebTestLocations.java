/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.WebTestLocationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WebTestLocations.
 */
public interface WebTestLocations extends HasInner<WebTestLocationsInner> {
    /**
     * Gets a list of web test locations available to this Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentWebTestLocation> listAsync(String resourceGroupName, String resourceName);

}
