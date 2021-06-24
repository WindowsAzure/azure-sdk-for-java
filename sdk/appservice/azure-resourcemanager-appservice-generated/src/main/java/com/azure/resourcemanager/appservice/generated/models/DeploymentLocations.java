// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentLocationsInner;
import java.util.List;

/** An immutable client-side representation of DeploymentLocations. */
public interface DeploymentLocations {
    /**
     * Gets the locations property: Available regions.
     *
     * @return the locations value.
     */
    List<GeoRegion> locations();

    /**
     * Gets the hostingEnvironments property: Available App Service Environments with full descriptions of the
     * environments.
     *
     * @return the hostingEnvironments value.
     */
    List<AppServiceEnvironment> hostingEnvironments();

    /**
     * Gets the hostingEnvironmentDeploymentInfos property: Available App Service Environments with basic information.
     *
     * @return the hostingEnvironmentDeploymentInfos value.
     */
    List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentLocationsInner object.
     *
     * @return the inner object.
     */
    DeploymentLocationsInner innerModel();
}
