/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01;

import rx.Observable;
import com.microsoft.azure.management.servicefabric.v2018_02_01.implementation.ClusterVersionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ClusterVersions.
 */
public interface ClusterVersions extends HasInner<ClusterVersionsInner> {
    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ClusterCodeVersionsListResult> getByEnvironmentAsync(String location, String environment, String clusterVersion);

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ClusterCodeVersionsListResult> listAsync(String location);

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ClusterCodeVersionsListResult> listByEnvironmentAsync(String location, String environment);

    /**
     * Gets information about a Service Fabric cluster code version available in the specified location.
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ClusterCodeVersionsListResult> getAsync(String location, String clusterVersion);

}
