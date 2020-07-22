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
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.SwiftVirtualNetworkInner;

/**
 * Type representing SwiftVirtualNetwork.
 */
public interface SwiftVirtualNetwork extends HasInner<SwiftVirtualNetworkInner>, HasManager<CertificateRegistrationManager> {
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
     * @return the subnetResourceId value.
     */
    String subnetResourceId();

    /**
     * @return the swiftSupported value.
     */
    Boolean swiftSupported();

    /**
     * @return the type value.
     */
    String type();

}
