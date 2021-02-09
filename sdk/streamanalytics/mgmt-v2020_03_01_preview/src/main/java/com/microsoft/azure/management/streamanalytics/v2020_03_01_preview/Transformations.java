/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation.TransformationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Transformations.
 */
public interface Transformations extends SupportsCreating<Transformation.DefinitionStages.Blank>, HasInner<TransformationsInner> {
    /**
     * Gets details about the specified transformation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Transformation> getAsync(String resourceGroupName, String jobName, String transformationName);

}
