/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.AzureStackManager;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.CloudManifestFileResponseInner;

/**
 * Type representing CloudManifestFileResponse.
 */
public interface CloudManifestFileResponse extends HasInner<CloudManifestFileResponseInner>, HasManager<AzureStackManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    CloudManifestFileProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
