/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2019_05_01_preview;

import rx.Observable;
import com.microsoft.azure.management.support.v2019_05_01_preview.implementation.ProblemClassificationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProblemClassifications.
 */
public interface ProblemClassifications extends HasInner<ProblemClassificationsInner> {
    /**
     * Gets the details of a specific problem classification for a specific Azure service.
     *
     * @param serviceName Name of Azure service available for support.
     * @param problemClassificationName Name of problem classification.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProblemClassification> getAsync(String serviceName, String problemClassificationName);

    /**
     * Lists all the problem classifications (categories) available for a specific Azure service.&lt;br/&gt;&lt;br/&gt; Always use the service and problem classifications obtained programmatically. This practice ensures that you always have the most recent set of service and problem classification Ids.
     *
     * @param serviceName Name of Azure service for which the problem classifications need to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProblemClassification> listAsync(String serviceName);

}
