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
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CustomHostnameAnalysisResultInner;
import java.util.List;

/**
 * Type representing CustomHostnameAnalysisResult.
 */
public interface CustomHostnameAnalysisResult extends HasInner<CustomHostnameAnalysisResultInner>, HasManager<AppServiceManager> {
    /**
     * @return the alternateCNameRecords value.
     */
    List<String> alternateCNameRecords();

    /**
     * @return the alternateTxtRecords value.
     */
    List<String> alternateTxtRecords();

    /**
     * @return the aRecords value.
     */
    List<String> aRecords();

    /**
     * @return the cNameRecords value.
     */
    List<String> cNameRecords();

    /**
     * @return the conflictingAppResourceId value.
     */
    String conflictingAppResourceId();

    /**
     * @return the customDomainVerificationFailureInfo value.
     */
    ErrorEntity customDomainVerificationFailureInfo();

    /**
     * @return the customDomainVerificationTest value.
     */
    DnsVerificationTestResult customDomainVerificationTest();

    /**
     * @return the hasConflictAcrossSubscription value.
     */
    Boolean hasConflictAcrossSubscription();

    /**
     * @return the hasConflictOnScaleUnit value.
     */
    Boolean hasConflictOnScaleUnit();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isHostnameAlreadyVerified value.
     */
    Boolean isHostnameAlreadyVerified();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the txtRecords value.
     */
    List<String> txtRecords();

    /**
     * @return the type value.
     */
    String type();

}
