// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the Azure Active directory provider. */
@JsonFlatten
@Fluent
public class AzureActiveDirectory extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureActiveDirectory.class);

    /*
     * <code>false</code> if the Azure Active Directory provider should not be
     * enabled despite the set registration; otherwise, <code>true</code>.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * The configuration settings of the Azure Active Directory app
     * registration.
     */
    @JsonProperty(value = "properties.registration")
    private AzureActiveDirectoryRegistration registration;

    /*
     * The configuration settings of the Azure Active Directory login flow.
     */
    @JsonProperty(value = "properties.login")
    private AzureActiveDirectoryLogin login;

    /*
     * The configuration settings of the Azure Active Directory token
     * validation flow.
     */
    @JsonProperty(value = "properties.validation")
    private AzureActiveDirectoryValidation validation;

    /*
     * Gets a value indicating whether the Azure AD configuration was
     * auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure
     * Management Portal. Users should not
     * read or write to this property.
     */
    @JsonProperty(value = "properties.isAutoProvisioned")
    private Boolean isAutoProvisioned;

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param enabled the enabled value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the Azure Active Directory app registration.
     *
     * @return the registration value.
     */
    public AzureActiveDirectoryRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the Azure Active Directory app registration.
     *
     * @param registration the registration value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withRegistration(AzureActiveDirectoryRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the Azure Active Directory login flow.
     *
     * @return the login value.
     */
    public AzureActiveDirectoryLogin login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the Azure Active Directory login flow.
     *
     * @param login the login value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withLogin(AzureActiveDirectoryLogin login) {
        this.login = login;
        return this;
    }

    /**
     * Get the validation property: The configuration settings of the Azure Active Directory token validation flow.
     *
     * @return the validation value.
     */
    public AzureActiveDirectoryValidation validation() {
        return this.validation;
    }

    /**
     * Set the validation property: The configuration settings of the Azure Active Directory token validation flow.
     *
     * @param validation the validation value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withValidation(AzureActiveDirectoryValidation validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Get the isAutoProvisioned property: Gets a value indicating whether the Azure AD configuration was
     * auto-provisioned using 1st party tooling. This is an internal flag primarily intended to support the Azure
     * Management Portal. Users should not read or write to this property.
     *
     * @return the isAutoProvisioned value.
     */
    public Boolean isAutoProvisioned() {
        return this.isAutoProvisioned;
    }

    /**
     * Set the isAutoProvisioned property: Gets a value indicating whether the Azure AD configuration was
     * auto-provisioned using 1st party tooling. This is an internal flag primarily intended to support the Azure
     * Management Portal. Users should not read or write to this property.
     *
     * @param isAutoProvisioned the isAutoProvisioned value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withIsAutoProvisioned(Boolean isAutoProvisioned) {
        this.isAutoProvisioned = isAutoProvisioned;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureActiveDirectory withKind(String kind) {
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
        if (login() != null) {
            login().validate();
        }
        if (validation() != null) {
            validation().validate();
        }
    }
}
