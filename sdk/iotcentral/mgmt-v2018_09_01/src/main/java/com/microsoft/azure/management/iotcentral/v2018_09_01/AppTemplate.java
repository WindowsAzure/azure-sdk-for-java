/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iotcentral.v2018_09_01.implementation.IoTCentralManager;
import com.microsoft.azure.management.iotcentral.v2018_09_01.implementation.AppTemplateInner;

/**
 * Type representing AppTemplate.
 */
public interface AppTemplate extends HasInner<AppTemplateInner>, HasManager<IoTCentralManager> {
    /**
     * @return the appTemplateName value.
     */
    String appTemplateName();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the manifestId value.
     */
    String manifestId();

    /**
     * @return the manifestVersion value.
     */
    String manifestVersion();

    /**
     * @return the order value.
     */
    Double order();

    /**
     * @return the title value.
     */
    String title();

}
