/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2017_04_19;

import rx.Observable;
import com.microsoft.azure.management.advisor.v2017_04_19.implementation.RecommendationMetadatasInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RecommendationMetadatas.
 */
public interface RecommendationMetadatas extends HasInner<RecommendationMetadatasInner> {
    /**
     * Gets the metadata entity.
     *
     * @param name Name of metadata entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> getAsync(String name);

    /**
     * Gets the list of metadata entities.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MetadataEntity> listAsync();

}
