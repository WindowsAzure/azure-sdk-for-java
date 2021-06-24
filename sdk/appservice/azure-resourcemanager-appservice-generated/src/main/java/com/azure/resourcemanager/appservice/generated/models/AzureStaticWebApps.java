// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the Azure Static Web Apps provider. */
@JsonFlatten
@Fluent
public class AzureStaticWebApps extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureStaticWebApps.class);

    /*
     * <code>false</code> if the Azure Static Web Apps provider should not be
     * enabled despite the set registration; otherwise, <code>true</code>.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * The configuration settings of the Azure Static Web Apps registration.
     */
    @JsonProperty(value = "properties.registration")
    private AzureStaticWebAppsRegistration registration;

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param enabled the enabled value to set.
     * @return the AzureStaticWebApps object itself.
     */
    public AzureStaticWebApps withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the Azure Static Web Apps registration.
     *
     * @return the registration value.
     */
    public AzureStaticWebAppsRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the Azure Static Web Apps registration.
     *
     * @param registration the registration value to set.
     * @return the AzureStaticWebApps object itself.
     */
    public AzureStaticWebApps withRegistration(AzureStaticWebAppsRegistration registration) {
        this.registration = registration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureStaticWebApps withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (registration() != null) {
            registration().validate();
        }
    }
}
