/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2019_11_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2019_11_01.implementation.CredentialResultsInner;
import java.util.List;

/**
 * Type representing CredentialResults.
 */
public interface CredentialResults extends HasInner<CredentialResultsInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the kubeconfigs value.
     */
    List<CredentialResult> kubeconfigs();

}
