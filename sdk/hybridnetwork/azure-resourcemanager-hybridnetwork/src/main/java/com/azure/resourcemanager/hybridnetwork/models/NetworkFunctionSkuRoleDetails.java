// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionSkuRoleDetailsInner;
import java.util.List;

/** An immutable client-side representation of NetworkFunctionSkuRoleDetails. */
public interface NetworkFunctionSkuRoleDetails {
    /**
     * Gets the roleName property: The name of the network function role.
     *
     * @return the roleName value.
     */
    String roleName();

    /**
     * Gets the userDataTemplate property: The user data template for customers.
     *
     * @return the userDataTemplate value.
     */
    Object userDataTemplate();

    /**
     * Gets the userDataParameters property: The user parameters for customers.
     *
     * @return the userDataParameters value.
     */
    Object userDataParameters();

    /**
     * Gets the networkInterfaces property: The network interface configuration.
     *
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionSkuRoleDetailsInner object.
     *
     * @return the inner object.
     */
    NetworkFunctionSkuRoleDetailsInner innerModel();
}
