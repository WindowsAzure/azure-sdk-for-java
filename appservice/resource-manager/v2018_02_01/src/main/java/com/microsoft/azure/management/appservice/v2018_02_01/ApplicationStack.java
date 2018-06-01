/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.ApplicationStackInner;
import java.util.List;

/**
 * Type representing ApplicationStack.
 */
public interface ApplicationStack extends HasInner<ApplicationStackInner>, HasManager<AppServiceManager> {
    /**
     * @return the dependency value.
     */
    String dependency();

    /**
     * @return the display value.
     */
    String display();

    /**
     * @return the frameworks value.
     */
    List<ApplicationStackInner> frameworks();

    /**
     * @return the majorVersions value.
     */
    List<StackMajorVersion> majorVersions();

    /**
     * @return the name value.
     */
    String name();

}
