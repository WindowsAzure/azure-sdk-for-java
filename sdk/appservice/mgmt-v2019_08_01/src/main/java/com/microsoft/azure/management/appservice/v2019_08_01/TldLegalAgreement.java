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
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.TldLegalAgreementInner;

/**
 * Type representing TldLegalAgreement.
 */
public interface TldLegalAgreement extends HasInner<TldLegalAgreementInner>, HasManager<AppServiceManager> {
    /**
     * @return the agreementKey value.
     */
    String agreementKey();

    /**
     * @return the content value.
     */
    String content();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the url value.
     */
    String url();

}
