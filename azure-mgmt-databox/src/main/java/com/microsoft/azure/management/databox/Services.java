/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import rx.Observable;
import com.microsoft.azure.management.databox.implementation.ServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Services.
 */
public interface Services extends HasInner<ServicesInner> {
    /**
     * This method provides the list of available skus for the given subscription, resource group and location.
     *
     * @param resourceGroupName The Resource Group Name
     * @param location The location of the resource
     * @param availableSkuRequest Filters for showing the available skus.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SkuInformation> listAvailableSkusByResourceGroupAsync(final String resourceGroupName, final String location, final AvailableSkuRequest availableSkuRequest);

    /**
     * [DEPRECATED NOTICE: This operation will soon be removed]. This method validates the customer shipping address and provide alternate addresses if any.
     *
     * @param location The location of the resource
     * @param validateAddress Shipping address of the customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AddressValidationOutput> validateAddressMethodAsync(String location, ValidateAddress validateAddress);

    /**
     * This method does all necessary pre-job creation validation under resource group.
     *
     * @param resourceGroupName The Resource Group Name
     * @param location The location of the resource
     * @param validationRequest Inputs of the customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ValidationResponse> validateInputsByResourceGroupAsync(String resourceGroupName, String location, ValidationRequest validationRequest);

    /**
     * This method does all necessary pre-job creation validation under subscription.
     *
     * @param location The location of the resource
     * @param validationRequest Inputs of the customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ValidationResponse> validateInputsAsync(String location, ValidationRequest validationRequest);

    /**
     * This API provides configuration details specific to given region/location at Subscription level.
     *
     * @param location The location of the resource
     * @param regionConfigurationRequest Request body to get the configuration for the region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegionConfigurationResponse> regionConfigurationAsync(String location, RegionConfigurationRequest regionConfigurationRequest);

    /**
     * This API provides configuration details specific to given region/location at Resource group level.
     *
     * @param resourceGroupName The Resource Group Name
     * @param location The location of the resource
     * @param regionConfigurationRequest Request body to get the configuration for the region at resource group level.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegionConfigurationResponse> regionConfigurationByResourceGroupAsync(String resourceGroupName, String location, RegionConfigurationRequest regionConfigurationRequest);

}
