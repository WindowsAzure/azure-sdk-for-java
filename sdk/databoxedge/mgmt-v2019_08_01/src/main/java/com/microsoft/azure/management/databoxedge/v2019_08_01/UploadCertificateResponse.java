/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.DataBoxEdgeManager;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.UploadCertificateResponseInner;

/**
 * Type representing UploadCertificateResponse.
 */
public interface UploadCertificateResponse extends HasInner<UploadCertificateResponseInner>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the aadAudience value.
     */
    String aadAudience();

    /**
     * @return the aadAuthority value.
     */
    String aadAuthority();

    /**
     * @return the aadTenantId value.
     */
    String aadTenantId();

    /**
     * @return the authType value.
     */
    AuthenticationType authType();

    /**
     * @return the azureManagementEndpointAudience value.
     */
    String azureManagementEndpointAudience();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the servicePrincipalClientId value.
     */
    String servicePrincipalClientId();

    /**
     * @return the servicePrincipalObjectId value.
     */
    String servicePrincipalObjectId();

}
