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
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.PrivateAccessInner;
import java.util.List;

/**
 * Type representing PrivateAccess.
 */
public interface PrivateAccess extends HasInner<PrivateAccessInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the enabled value.
     */
    Boolean enabled();

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

    /**
     * @return the virtualNetworks value.
     */
    List<PrivateAccessVirtualNetwork> virtualNetworks();

}
