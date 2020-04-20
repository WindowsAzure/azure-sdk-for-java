/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import rx.Observable;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AddsserviceServiceMemberModel;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ServiceMemberInner;

/**
 * Type representing AddsServicesServiceMembers.
 */
public interface AddsServicesServiceMembers {
    /**
     * Gets the details of the servers, for a given Active Directory Domain Controller service, that are onboarded to Azure Active Directory Connect Health Service.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AddsserviceServiceMemberModel> listAsync(final String serviceName);

    /**
     * Onboards  a server, for a given Active Directory Domain Controller service, to Azure Active Directory Connect Health Service.
     *
     * @param serviceName The name of the service under which the server is to be onboarded.
     * @param serviceMember The server object.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AddsserviceServiceMember> addAsync(String serviceName, ServiceMemberInner serviceMember);

}
