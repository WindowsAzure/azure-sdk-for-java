/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import rx.Observable;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.TriggerRunsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TriggerRuns.
 */
public interface TriggerRuns extends HasInner<TriggerRunsInner> {
    /**
     * Query trigger runs.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TriggerRunsQueryResponse> queryByFactoryAsync(String resourceGroupName, String factoryName, RunFilterParameters filterParameters);

}
