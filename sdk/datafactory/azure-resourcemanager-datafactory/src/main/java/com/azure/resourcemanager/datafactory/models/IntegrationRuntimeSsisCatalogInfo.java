// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Catalog information for managed dedicated integration runtime. */
@Fluent
public final class IntegrationRuntimeSsisCatalogInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeSsisCatalogInfo.class);

    /*
     * The catalog database server URL.
     */
    @JsonProperty(value = "catalogServerEndpoint")
    private String catalogServerEndpoint;

    /*
     * The administrator user name of catalog database.
     */
    @JsonProperty(value = "catalogAdminUserName")
    private String catalogAdminUsername;

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
     * The dual standby pair name of Azure-SSIS Integration Runtimes to support
     * SSISDB failover.
     */
    @JsonProperty(value = "dualStandbyPairName")
    private String dualStandbyPairName;

    /*
     * Catalog information for managed dedicated integration runtime.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the catalogServerEndpoint property: The catalog database server URL.
     *
     * @return the catalogServerEndpoint value.
     */
    public String catalogServerEndpoint() {
        return this.catalogServerEndpoint;
    }

    /**
     * Set the catalogServerEndpoint property: The catalog database server URL.
     *
     * @param catalogServerEndpoint the catalogServerEndpoint value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo withCatalogServerEndpoint(String catalogServerEndpoint) {
        this.catalogServerEndpoint = catalogServerEndpoint;
        return this;
    }

    /**
     * Get the catalogAdminUsername property: The administrator user name of catalog database.
     *
     * @return the catalogAdminUsername value.
     */
    public String catalogAdminUsername() {
        return this.catalogAdminUsername;
    }

    /**
     * Set the catalogAdminUsername property: The administrator user name of catalog database.
     *
     * @param catalogAdminUsername the catalogAdminUsername value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo withCatalogAdminUsername(String catalogAdminUsername) {
        this.catalogAdminUsername = catalogAdminUsername;
        return this;
    }

    /**
     * Get the catalogAdminPassword property: The password of the administrator user account of the catalog database.
     *
     * @return the catalogAdminPassword value.
     */
    public SecureString catalogAdminPassword() {
        return this.catalogAdminPassword;
    }

    /**
     * Set the catalogAdminPassword property: The password of the administrator user account of the catalog database.
     *
     * @param catalogAdminPassword the catalogAdminPassword value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo withCatalogAdminPassword(SecureString catalogAdminPassword) {
        this.catalogAdminPassword = catalogAdminPassword;
        return this;
    }

    /**
     * Get the catalogPricingTier property: The pricing tier for the catalog database. The valid values could be found
     * in https://azure.microsoft.com/en-us/pricing/details/sql-database/.
     *
     * @return the catalogPricingTier value.
     */
    public IntegrationRuntimeSsisCatalogPricingTier catalogPricingTier() {
        return this.catalogPricingTier;
    }

    /**
     * Set the catalogPricingTier property: The pricing tier for the catalog database. The valid values could be found
     * in https://azure.microsoft.com/en-us/pricing/details/sql-database/.
     *
     * @param catalogPricingTier the catalogPricingTier value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo withCatalogPricingTier(
        IntegrationRuntimeSsisCatalogPricingTier catalogPricingTier) {
        this.catalogPricingTier = catalogPricingTier;
        return this;
    }

    /**
     * Get the dualStandbyPairName property: The dual standby pair name of Azure-SSIS Integration Runtimes to support
     * SSISDB failover.
     *
     * @return the dualStandbyPairName value.
     */
    public String dualStandbyPairName() {
        return this.dualStandbyPairName;
    }

    /**
     * Set the dualStandbyPairName property: The dual standby pair name of Azure-SSIS Integration Runtimes to support
     * SSISDB failover.
     *
     * @param dualStandbyPairName the dualStandbyPairName value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo withDualStandbyPairName(String dualStandbyPairName) {
        this.dualStandbyPairName = dualStandbyPairName;
        return this;
    }

    /**
     * Get the additionalProperties property: Catalog information for managed dedicated integration runtime.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Catalog information for managed dedicated integration runtime.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeSsisCatalogInfo object itself.
     */
    public IntegrationRuntimeSsisCatalogInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (catalogAdminPassword() != null) {
            catalogAdminPassword().validate();
        }
    }
}
