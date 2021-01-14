// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Catalog information for managed dedicated integration runtime. */
@Fluent
public final class IntegrationRuntimeSsisCatalogInfo {
    /*
     * The catalog database server URL.
     */
    @JsonProperty(value = "catalogServerEndpoint")
    private String catalogServerEndpoint;

    /*
     * The administrator user name of catalog database.
     */
    @JsonProperty(value = "catalogAdminUserName")
    private String catalogAdminUserName;

    /*
     * The password of the administrator user account of the catalog database.
     */
    @JsonProperty(value = "catalogAdminPassword")
    private SecureString catalogAdminPassword;

    /*
     * The pricing tier for the catalog database. The valid values could be
     * found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     */
    @JsonProperty(value = "catalogPricingTier")
    private IntegrationRuntimeSsisCatalogPricingTier catalogPricingTier;

    /*
     * Catalog information for managed dedicated integration runtime.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the catalogServerEndpoint property: The catalog database server URL.
     *
     * @return the catalogServerEndpoint value.
     */
    public String getCatalogServerEndpoint() {
        return this.catalogServerEndpoint;
    }

    /**
     * Set the catalogServerEndpoint property: The catalog database server URL.
     *
     * @param catalogServerEndpoint the catalogServerEndpoint value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo setCatalogServerEndpoint(String catalogServerEndpoint) {
        this.catalogServerEndpoint = catalogServerEndpoint;
        return this;
    }

    /**
     * Get the catalogAdminUserName property: The administrator user name of catalog database.
     *
     * @return the catalogAdminUserName value.
     */
    public String getCatalogAdminUserName() {
        return this.catalogAdminUserName;
    }

    /**
     * Set the catalogAdminUserName property: The administrator user name of catalog database.
     *
     * @param catalogAdminUserName the catalogAdminUserName value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo setCatalogAdminUserName(String catalogAdminUserName) {
        this.catalogAdminUserName = catalogAdminUserName;
        return this;
    }

    /**
     * Get the catalogAdminPassword property: The password of the administrator user account of the catalog database.
     *
     * @return the catalogAdminPassword value.
     */
    public SecureString getCatalogAdminPassword() {
        return this.catalogAdminPassword;
    }

    /**
     * Set the catalogAdminPassword property: The password of the administrator user account of the catalog database.
     *
     * @param catalogAdminPassword the catalogAdminPassword value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo setCatalogAdminPassword(SecureString catalogAdminPassword) {
        this.catalogAdminPassword = catalogAdminPassword;
        return this;
    }

    /**
     * Get the catalogPricingTier property: The pricing tier for the catalog database. The valid values could be found
     * in https://azure.microsoft.com/en-us/pricing/details/sql-database/.
     *
     * @return the catalogPricingTier value.
     */
    public IntegrationRuntimeSsisCatalogPricingTier getCatalogPricingTier() {
        return this.catalogPricingTier;
    }

    /**
     * Set the catalogPricingTier property: The pricing tier for the catalog database. The valid values could be found
     * in https://azure.microsoft.com/en-us/pricing/details/sql-database/.
     *
     * @param catalogPricingTier the catalogPricingTier value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo setCatalogPricingTier(
            IntegrationRuntimeSsisCatalogPricingTier catalogPricingTier) {
        this.catalogPricingTier = catalogPricingTier;
        return this;
    }

    /**
     * Get the additionalProperties property: Catalog information for managed dedicated integration runtime.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Catalog information for managed dedicated integration runtime.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
