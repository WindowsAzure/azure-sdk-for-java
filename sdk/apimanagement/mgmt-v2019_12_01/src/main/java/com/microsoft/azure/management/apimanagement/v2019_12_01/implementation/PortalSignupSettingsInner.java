/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.TermsOfServiceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Sign-Up settings for a developer portal.
 */
@JsonFlatten
public class PortalSignupSettingsInner extends ProxyResource {
    /**
     * Allow users to sign up on a developer portal.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Terms of service contract properties.
     */
    @JsonProperty(value = "properties.termsOfService")
    private TermsOfServiceProperties termsOfService;

    /**
     * Get allow users to sign up on a developer portal.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set allow users to sign up on a developer portal.
     *
     * @param enabled the enabled value to set
     * @return the PortalSignupSettingsInner object itself.
     */
    public PortalSignupSettingsInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get terms of service contract properties.
     *
     * @return the termsOfService value
     */
    public TermsOfServiceProperties termsOfService() {
        return this.termsOfService;
    }

    /**
     * Set terms of service contract properties.
     *
     * @param termsOfService the termsOfService value to set
     * @return the PortalSignupSettingsInner object itself.
     */
    public PortalSignupSettingsInner withTermsOfService(TermsOfServiceProperties termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }

}
