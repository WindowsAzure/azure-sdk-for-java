/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.BatchAIManager;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.RemoteLoginInformationInner;

/**
 * Type representing RemoteLoginInformation.
 */
public interface RemoteLoginInformation extends HasInner<RemoteLoginInformationInner>, HasManager<BatchAIManager> {
    /**
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * @return the nodeId value.
     */
    String nodeId();

    /**
     * @return the port value.
     */
    Double port();

}
