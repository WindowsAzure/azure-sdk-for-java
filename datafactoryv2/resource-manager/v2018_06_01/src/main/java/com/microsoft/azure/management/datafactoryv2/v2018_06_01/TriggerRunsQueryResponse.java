/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.TriggerRunsQueryResponseInner;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.TriggerRunInner;
import java.util.List;

/**
 * Type representing TriggerRunsQueryResponse.
 */
public interface TriggerRunsQueryResponse extends HasInner<TriggerRunsQueryResponseInner>, HasManager<DataFactoryManager> {
    /**
     * @return the continuationToken value.
     */
    String continuationToken();

    /**
     * @return the value value.
     */
    List<TriggerRunInner> value();

}
