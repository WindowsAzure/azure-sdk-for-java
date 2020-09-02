/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.DevicesManager;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.CertificateWithNonceDescriptionInner;

/**
 * Type representing CertificateWithNonceDescription.
 */
public interface CertificateWithNonceDescription extends HasInner<CertificateWithNonceDescriptionInner>, HasManager<DevicesManager> {
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
    CertificatePropertiesWithNonce properties();

    /**
     * @return the type value.
     */
    String type();

}
