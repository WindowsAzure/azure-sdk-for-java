/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.CertificateRegistrationManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.SlotConfigNamesResourceInner;
import java.util.List;

/**
 * Type representing SlotConfigNamesResource.
 */
public interface SlotConfigNamesResource extends HasInner<SlotConfigNamesResourceInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the appSettingNames value.
     */
    List<String> appSettingNames();

    /**
     * @return the azureStorageConfigNames value.
     */
    List<String> azureStorageConfigNames();

    /**
     * @return the connectionStringNames value.
     */
    List<String> connectionStringNames();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
