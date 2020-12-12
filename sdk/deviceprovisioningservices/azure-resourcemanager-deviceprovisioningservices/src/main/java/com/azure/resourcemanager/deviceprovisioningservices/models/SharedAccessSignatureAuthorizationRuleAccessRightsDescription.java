// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionInner;

/** An immutable client-side representation of SharedAccessSignatureAuthorizationRuleAccessRightsDescription. */
public interface SharedAccessSignatureAuthorizationRuleAccessRightsDescription {
    /**
     * Gets the keyName property: Name of the key.
     *
     * @return the keyName value.
     */
    String keyName();

    /**
     * Gets the primaryKey property: Primary SAS key value.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: Secondary SAS key value.
     *
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the rights property: Rights that this key has.
     *
     * @return the rights value.
     */
    AccessRightsDescription rights();

    /**
     * Gets the inner
     * com.azure.resourcemanager.deviceprovisioningservices.fluent.models.SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionInner
     * object.
     *
     * @return the inner object.
     */
    SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionInner innerModel();
}
