/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.SchemasInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Schemas.
 */
public interface Schemas extends HasInner<SchemasInner> {
    /**
     * Gets the schema for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SearchGetSchemaResponse> getAsync(String resourceGroupName, String workspaceName);

}
