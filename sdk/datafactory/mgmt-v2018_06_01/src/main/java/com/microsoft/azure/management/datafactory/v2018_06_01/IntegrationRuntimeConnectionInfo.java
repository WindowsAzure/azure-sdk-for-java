/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.IntegrationRuntimeConnectionInfoInner;
import java.util.Map;

/**
 * Type representing IntegrationRuntimeConnectionInfo.
 */
public interface IntegrationRuntimeConnectionInfo extends HasInner<IntegrationRuntimeConnectionInfoInner>, HasManager<DataFactoryManager> {
    /**
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * @return the hostServiceUri value.
     */
    String hostServiceUri();

    /**
     * @return the identityCertThumbprint value.
     */
    String identityCertThumbprint();

    /**
     * @return the isIdentityCertExprired value.
     */
    Boolean isIdentityCertExprired();

    /**
     * @return the publicKey value.
     */
    String publicKey();

    /**
     * @return the serviceToken value.
     */
    String serviceToken();

    /**
     * @return the version value.
     */
    String version();

}
