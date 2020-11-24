/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation.ContainerRegistryManager;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation.RegistryListCredentialsResultInner;
import java.util.List;

/**
 * Type representing RegistryListCredentialsResult.
 */
public interface RegistryListCredentialsResult extends HasInner<RegistryListCredentialsResultInner>, HasManager<ContainerRegistryManager> {
    /**
     * @return the passwords value.
     */
    List<RegistryPassword> passwords();

    /**
     * @return the username value.
     */
    String username();

}
