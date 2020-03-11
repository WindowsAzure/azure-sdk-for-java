/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CsmUsageQuotaInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import org.joda.time.DateTime;

/**
 * Type representing ServerfarmCsmUsageQuota.
 */
public interface ServerfarmCsmUsageQuota extends HasInner<CsmUsageQuotaInner>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * @return the limit value.
     */
    Long limit();

    /**
     * @return the name value.
     */
    LocalizableString name();

    /**
     * @return the nextResetTime value.
     */
    DateTime nextResetTime();

    /**
     * @return the unit value.
     */
    String unit();

}
