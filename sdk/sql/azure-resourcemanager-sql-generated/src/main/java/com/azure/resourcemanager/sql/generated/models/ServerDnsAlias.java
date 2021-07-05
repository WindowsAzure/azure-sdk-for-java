// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.ServerDnsAliasInner;

/** An immutable client-side representation of ServerDnsAlias. */
public interface ServerDnsAlias {
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
     * Gets the azureDnsRecord property: The fully qualified DNS record for alias.
     *
     * @return the azureDnsRecord value.
     */
    String azureDnsRecord();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ServerDnsAliasInner object.
     *
     * @return the inner object.
     */
    ServerDnsAliasInner innerModel();
}
