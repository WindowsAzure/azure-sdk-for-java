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
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.MSDeployLogInner;
import java.util.List;

/**
 * Type representing MSDeployLog.
 */
public interface MSDeployLog extends HasInner<MSDeployLogInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the entries value.
     */
    List<MSDeployLogEntry> entries();

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
