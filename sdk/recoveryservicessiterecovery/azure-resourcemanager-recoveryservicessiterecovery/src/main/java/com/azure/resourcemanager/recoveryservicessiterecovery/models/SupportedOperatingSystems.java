// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.SupportedOperatingSystemsInner;

/** An immutable client-side representation of SupportedOperatingSystems. */
public interface SupportedOperatingSystems {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Properties model for supported OS API.
     *
     * @return the properties value.
     */
    SupportedOSProperties properties();

    /**
     * Gets the location property: Resource Location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the inner
     * com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.SupportedOperatingSystemsInner object.
     *
     * @return the inner object.
     */
    SupportedOperatingSystemsInner innerModel();
}
