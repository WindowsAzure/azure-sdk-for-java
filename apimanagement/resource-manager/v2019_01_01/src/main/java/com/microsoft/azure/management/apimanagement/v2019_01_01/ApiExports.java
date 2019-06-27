/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiExportsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApiExports.
 */
public interface ApiExports extends HasInner<ApiExportsInner> {
    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl', 'Wadl', 'Openapi'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApiExportResult> getAsync(String resourceGroupName, String serviceName, String apiId, ExportFormat format);

}
