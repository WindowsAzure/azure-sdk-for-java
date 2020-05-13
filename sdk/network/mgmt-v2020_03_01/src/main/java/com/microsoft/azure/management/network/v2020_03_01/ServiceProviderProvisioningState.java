/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ServiceProviderProvisioningState.
 */
public final class ServiceProviderProvisioningState extends ExpandableStringEnum<ServiceProviderProvisioningState> {
    /** Static value NotProvisioned for ServiceProviderProvisioningState. */
    public static final ServiceProviderProvisioningState NOT_PROVISIONED = fromString("NotProvisioned");

    /** Static value Provisioning for ServiceProviderProvisioningState. */
    public static final ServiceProviderProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Provisioned for ServiceProviderProvisioningState. */
    public static final ServiceProviderProvisioningState PROVISIONED = fromString("Provisioned");

    /** Static value Deprovisioning for ServiceProviderProvisioningState. */
    public static final ServiceProviderProvisioningState DEPROVISIONING = fromString("Deprovisioning");

    /**
     * Creates or finds a ServiceProviderProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding ServiceProviderProvisioningState
     */
    @JsonCreator
    public static ServiceProviderProvisioningState fromString(String name) {
        return fromString(name, ServiceProviderProvisioningState.class);
    }

    /**
     * @return known ServiceProviderProvisioningState values
     */
    public static Collection<ServiceProviderProvisioningState> values() {
        return values(ServiceProviderProvisioningState.class);
    }
}
