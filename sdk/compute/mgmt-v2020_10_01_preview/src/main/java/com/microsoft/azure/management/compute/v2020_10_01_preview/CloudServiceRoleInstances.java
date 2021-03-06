/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.RoleInstance;
import rx.Completable;

import java.io.InputStream;

/**
 * Type representing CloudServiceRoleInstances.
 */
public interface CloudServiceRoleInstances {
    /**
     * Gets a role instance from a cloud service.
     *
     * @param roleInstanceName Name of the role instance.
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleInstance> getAsync(String roleInstanceName, String resourceGroupName, String cloudServiceName);

    /**
     * Gets the list of all role instances in a cloud service. Use nextLink property in the response to get the next page of role instances. Do this till nextLink is null to fetch all the role instances.
     *
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleInstance> listAsync(final String resourceGroupName, final String cloudServiceName);

    /**
     * Deletes a role instance from a cloud service.
     *
     * @param roleInstanceName Name of the role instance.
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String roleInstanceName, String resourceGroupName, String cloudServiceName);

    /**
     * Retrieves information about the run-time state of a role instance in a cloud service.
     *
     * @param roleInstanceName Name of the role instance.
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleInstanceInstanceView> getInstanceViewAsync(String roleInstanceName, String resourceGroupName, String cloudServiceName);

    /**
     * The Reboot Role Instance asynchronous operation requests a reboot of a role instance in the cloud service.
     *
     * @param roleInstanceName Name of the role instance.
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable restartAsync(String roleInstanceName, String resourceGroupName, String cloudServiceName);

    /**
     * The Reimage Role Instance asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     *
     * @param roleInstanceName Name of the role instance.
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable reimageAsync(String roleInstanceName, String resourceGroupName, String cloudServiceName);

    /**
     * The Rebuild Role Instance asynchronous operation reinstalls the operating system on instances of web roles or worker roles and initializes the storage resources that are used by them. If you do not want to initialize storage resources, you can use Reimage Role Instance.
     *
     * @param roleInstanceName Name of the role instance.
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable rebuildAsync(String roleInstanceName, String resourceGroupName, String cloudServiceName);

    /**
     * Gets a remote desktop file for a role instance in a cloud service.
     *
     * @param roleInstanceName Name of the role instance.
     * @param resourceGroupName the String value
     * @param cloudServiceName the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InputStream> getRemoteDesktopFileAsync(String roleInstanceName, String resourceGroupName, String cloudServiceName);

}
