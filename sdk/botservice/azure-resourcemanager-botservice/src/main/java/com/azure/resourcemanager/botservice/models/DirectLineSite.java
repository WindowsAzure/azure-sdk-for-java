// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A site for the Direct Line channel. */
@Fluent
public final class DirectLineSite {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DirectLineSite.class);

    /*
     * Site Id
     */
    @JsonProperty(value = "siteId", access = JsonProperty.Access.WRITE_ONLY)
    private String siteId;

    /*
     * Site name
     */
    @JsonProperty(value = "siteName", required = true)
    private String siteName;

    /*
     * Primary key. Value only returned through POST to the action Channel List
     * API, otherwise empty.
     */
    @JsonProperty(value = "key", access = JsonProperty.Access.WRITE_ONLY)
    private String key;

    /*
     * Secondary key. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     */
    @JsonProperty(value = "key2", access = JsonProperty.Access.WRITE_ONLY)
    private String key2;

    /*
     * Whether this site is enabled for DirectLine channel.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /*
     * Whether this site is enabled for Bot Framework V1 protocol.
     */
    @JsonProperty(value = "isV1Enabled", required = true)
    private boolean isV1Enabled;

    /*
     * Whether this site is enabled for Bot Framework V1 protocol.
     */
    @JsonProperty(value = "isV3Enabled", required = true)
    private boolean isV3Enabled;

    /*
     * Whether this site is enabled for authentication with Bot Framework.
     */
    @JsonProperty(value = "isSecureSiteEnabled")
    private Boolean isSecureSiteEnabled;

    /*
     * List of Trusted Origin URLs for this site. This field is applicable only
     * if isSecureSiteEnabled is True.
     */
    @JsonProperty(value = "trustedOrigins")
    private List<String> trustedOrigins;

    /**
     * Get the siteId property: Site Id.
     *
     * @return the siteId value.
     */
    public String siteId() {
        return this.siteId;
    }

    /**
     * Get the siteName property: Site name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: Site name.
     *
     * @param siteName the siteName value to set.
     * @return the DirectLineSite object itself.
     */
    public DirectLineSite withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the key property: Primary key. Value only returned through POST to the action Channel List API, otherwise
     * empty.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Get the key2 property: Secondary key. Value only returned through POST to the action Channel List API, otherwise
     * empty.
     *
     * @return the key2 value.
     */
    public String key2() {
        return this.key2;
    }

    /**
     * Get the isEnabled property: Whether this site is enabled for DirectLine channel.
     *
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this site is enabled for DirectLine channel.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the DirectLineSite object itself.
     */
    public DirectLineSite withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the isV1Enabled property: Whether this site is enabled for Bot Framework V1 protocol.
     *
     * @return the isV1Enabled value.
     */
    public boolean isV1Enabled() {
        return this.isV1Enabled;
    }

    /**
     * Set the isV1Enabled property: Whether this site is enabled for Bot Framework V1 protocol.
     *
     * @param isV1Enabled the isV1Enabled value to set.
     * @return the DirectLineSite object itself.
     */
    public DirectLineSite withIsV1Enabled(boolean isV1Enabled) {
        this.isV1Enabled = isV1Enabled;
        return this;
    }

    /**
     * Get the isV3Enabled property: Whether this site is enabled for Bot Framework V1 protocol.
     *
     * @return the isV3Enabled value.
     */
    public boolean isV3Enabled() {
        return this.isV3Enabled;
    }

    /**
     * Set the isV3Enabled property: Whether this site is enabled for Bot Framework V1 protocol.
     *
     * @param isV3Enabled the isV3Enabled value to set.
     * @return the DirectLineSite object itself.
     */
    public DirectLineSite withIsV3Enabled(boolean isV3Enabled) {
        this.isV3Enabled = isV3Enabled;
        return this;
    }

    /**
     * Get the isSecureSiteEnabled property: Whether this site is enabled for authentication with Bot Framework.
     *
     * @return the isSecureSiteEnabled value.
     */
    public Boolean isSecureSiteEnabled() {
        return this.isSecureSiteEnabled;
    }

    /**
     * Set the isSecureSiteEnabled property: Whether this site is enabled for authentication with Bot Framework.
     *
     * @param isSecureSiteEnabled the isSecureSiteEnabled value to set.
     * @return the DirectLineSite object itself.
     */
    public DirectLineSite withIsSecureSiteEnabled(Boolean isSecureSiteEnabled) {
        this.isSecureSiteEnabled = isSecureSiteEnabled;
        return this;
    }

    /**
     * Get the trustedOrigins property: List of Trusted Origin URLs for this site. This field is applicable only if
     * isSecureSiteEnabled is True.
     *
     * @return the trustedOrigins value.
     */
    public List<String> trustedOrigins() {
        return this.trustedOrigins;
    }

    /**
     * Set the trustedOrigins property: List of Trusted Origin URLs for this site. This field is applicable only if
     * isSecureSiteEnabled is True.
     *
     * @param trustedOrigins the trustedOrigins value to set.
     * @return the DirectLineSite object itself.
     */
    public DirectLineSite withTrustedOrigins(List<String> trustedOrigins) {
        this.trustedOrigins = trustedOrigins;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (siteName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property siteName in model DirectLineSite"));
        }
    }
}
