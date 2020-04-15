// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetNetworkProfile model. */
@Fluent
public final class VirtualMachineScaleSetNetworkProfile {
    /*
     * A reference to a load balancer probe used to determine the health of an
     * instance in the virtual machine scale set. The reference will be in the
     * form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     */
    @JsonProperty(value = "healthProbe")
    private ApiEntityReference healthProbe;

    /*
     * The list of network configurations.
     */
    @JsonProperty(value = "networkInterfaceConfigurations")
    private List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations;

    /**
     * Get the healthProbe property: A reference to a load balancer probe used to determine the health of an instance in
     * the virtual machine scale set. The reference will be in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     *
     * @return the healthProbe value.
     */
    public ApiEntityReference healthProbe() {
        return this.healthProbe;
    }

    /**
     * Set the healthProbe property: A reference to a load balancer probe used to determine the health of an instance in
     * the virtual machine scale set. The reference will be in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/probes/{probeName}'.
     *
     * @param healthProbe the healthProbe value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withHealthProbe(ApiEntityReference healthProbe) {
        this.healthProbe = healthProbe;
        return this;
    }

    /**
     * Get the networkInterfaceConfigurations property: The list of network configurations.
     *
     * @return the networkInterfaceConfigurations value.
     */
    public List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations;
    }

    /**
     * Set the networkInterfaceConfigurations property: The list of network configurations.
     *
     * @param networkInterfaceConfigurations the networkInterfaceConfigurations value to set.
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withNetworkInterfaceConfigurations(
        List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
        return this;
    }
}
