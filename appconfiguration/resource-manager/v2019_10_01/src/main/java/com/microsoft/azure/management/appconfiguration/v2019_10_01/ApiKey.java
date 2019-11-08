/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appconfiguration.v2019_10_01.implementation.AppConfigurationManager;
import com.microsoft.azure.management.appconfiguration.v2019_10_01.implementation.ApiKeyInner;
import org.joda.time.DateTime;

/**
 * Type representing ApiKey.
 */
public interface ApiKey extends HasInner<ApiKeyInner>, HasManager<AppConfigurationManager> {
    /**
     * @return the connectionString value.
     */
    String connectionString();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the readOnly value.
     */
    Boolean readOnly();

    /**
     * @return the value value.
     */
    String value();

}
