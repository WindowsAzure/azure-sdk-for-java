// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.ApiKVReferenceInner;

/** An immutable client-side representation of ApiKVReference. */
public interface ApiKVReference {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the reference property: The reference property.
     *
     * @return the reference value.
     */
    String reference();

    /**
     * Gets the status property: The status property.
     *
     * @return the status value.
     */
    ResolveStatus status();

    /**
     * Gets the vaultName property: The vaultName property.
     *
     * @return the vaultName value.
     */
    String vaultName();

    /**
     * Gets the secretName property: The secretName property.
     *
     * @return the secretName value.
     */
    String secretName();

    /**
     * Gets the secretVersion property: The secretVersion property.
     *
     * @return the secretVersion value.
     */
    String secretVersion();

    /**
     * Gets the identityType property: Managed service identity.
     *
     * @return the identityType value.
     */
    ManagedServiceIdentity identityType();

    /**
     * Gets the details property: The details property.
     *
     * @return the details value.
     */
    String details();

    /**
     * Gets the source property: The source property.
     *
     * @return the source value.
     */
    ConfigReferenceSource source();

    /**
     * Gets the activeVersion property: The activeVersion property.
     *
     * @return the activeVersion value.
     */
    String activeVersion();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ApiKVReferenceInner object.
     *
     * @return the inner object.
     */
    ApiKVReferenceInner innerModel();
}
