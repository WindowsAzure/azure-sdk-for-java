/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.WorkbooksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Workbooks.
 */
public interface Workbooks extends SupportsCreating<Workbook.DefinitionStages.Blank>, HasInner<WorkbooksInner> {
    /**
     * Get a single workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Workbook> getAsync(String resourceGroupName, String resourceName);

    /**
     * Delete a workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String resourceName);

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Workbook> listByResourceGroupAsync(String resourceGroupName, CategoryType category);

}
