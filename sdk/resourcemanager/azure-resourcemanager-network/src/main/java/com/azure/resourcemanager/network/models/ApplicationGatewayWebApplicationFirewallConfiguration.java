// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application gateway web application firewall configuration. */
@Fluent
public final class ApplicationGatewayWebApplicationFirewallConfiguration {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayWebApplicationFirewallConfiguration.class);

    /*
     * Whether the web application firewall is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * Web application firewall mode.
     */
    @JsonProperty(value = "firewallMode", required = true)
    private ApplicationGatewayFirewallMode firewallMode;

    /*
     * The type of the web application firewall rule set. Possible values are:
     * 'OWASP'.
     */
    @JsonProperty(value = "ruleSetType", required = true)
    private String ruleSetType;

    /*
     * The version of the rule set type.
     */
    @JsonProperty(value = "ruleSetVersion", required = true)
    private String ruleSetVersion;

    /*
     * The disabled rule groups.
     */
    @JsonProperty(value = "disabledRuleGroups")
    private List<ApplicationGatewayFirewallDisabledRuleGroup> disabledRuleGroups;

    /*
     * Whether allow WAF to check request Body.
     */
    @JsonProperty(value = "requestBodyCheck")
    private Boolean requestBodyCheck;

    /*
     * Maximum request body size for WAF.
     */
    @JsonProperty(value = "maxRequestBodySize")
    private Integer maxRequestBodySize;

    /*
     * Maximum request body size in Kb for WAF.
     */
    @JsonProperty(value = "maxRequestBodySizeInKb")
    private Integer maxRequestBodySizeInKb;

    /*
     * Maximum file upload size in Mb for WAF.
     */
    @JsonProperty(value = "fileUploadLimitInMb")
    private Integer fileUploadLimitInMb;

    /*
     * The exclusion list.
     */
    @JsonProperty(value = "exclusions")
    private List<ApplicationGatewayFirewallExclusion> exclusions;

    /**
     * Get the enabled property: Whether the web application firewall is enabled or not.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the web application firewall is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the firewallMode property: Web application firewall mode.
     *
     * @return the firewallMode value.
     */
    public ApplicationGatewayFirewallMode firewallMode() {
        return this.firewallMode;
    }

    /**
     * Set the firewallMode property: Web application firewall mode.
     *
     * @param firewallMode the firewallMode value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withFirewallMode(
        ApplicationGatewayFirewallMode firewallMode) {
        this.firewallMode = firewallMode;
        return this;
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall rule set. Possible values are: 'OWASP'.
     *
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall rule set. Possible values are: 'OWASP'.
     *
     * @param ruleSetType the ruleSetType value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the rule set type.
     *
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: The version of the rule set type.
     *
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the disabledRuleGroups property: The disabled rule groups.
     *
     * @return the disabledRuleGroups value.
     */
    public List<ApplicationGatewayFirewallDisabledRuleGroup> disabledRuleGroups() {
        return this.disabledRuleGroups;
    }

    /**
     * Set the disabledRuleGroups property: The disabled rule groups.
     *
     * @param disabledRuleGroups the disabledRuleGroups value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withDisabledRuleGroups(
        List<ApplicationGatewayFirewallDisabledRuleGroup> disabledRuleGroups) {
        this.disabledRuleGroups = disabledRuleGroups;
        return this;
    }

    /**
     * Get the requestBodyCheck property: Whether allow WAF to check request Body.
     *
     * @return the requestBodyCheck value.
     */
    public Boolean requestBodyCheck() {
        return this.requestBodyCheck;
    }

    /**
     * Set the requestBodyCheck property: Whether allow WAF to check request Body.
     *
     * @param requestBodyCheck the requestBodyCheck value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withRequestBodyCheck(Boolean requestBodyCheck) {
        this.requestBodyCheck = requestBodyCheck;
        return this;
    }

    /**
     * Get the maxRequestBodySize property: Maximum request body size for WAF.
     *
     * @return the maxRequestBodySize value.
     */
    public Integer maxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    /**
     * Set the maxRequestBodySize property: Maximum request body size for WAF.
     *
     * @param maxRequestBodySize the maxRequestBodySize value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withMaxRequestBodySize(Integer maxRequestBodySize) {
        this.maxRequestBodySize = maxRequestBodySize;
        return this;
    }

    /**
     * Get the maxRequestBodySizeInKb property: Maximum request body size in Kb for WAF.
     *
     * @return the maxRequestBodySizeInKb value.
     */
    public Integer maxRequestBodySizeInKb() {
        return this.maxRequestBodySizeInKb;
    }

    /**
     * Set the maxRequestBodySizeInKb property: Maximum request body size in Kb for WAF.
     *
     * @param maxRequestBodySizeInKb the maxRequestBodySizeInKb value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withMaxRequestBodySizeInKb(
        Integer maxRequestBodySizeInKb) {
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        return this;
    }

    /**
     * Get the fileUploadLimitInMb property: Maximum file upload size in Mb for WAF.
     *
     * @return the fileUploadLimitInMb value.
     */
    public Integer fileUploadLimitInMb() {
        return this.fileUploadLimitInMb;
    }

    /**
     * Set the fileUploadLimitInMb property: Maximum file upload size in Mb for WAF.
     *
     * @param fileUploadLimitInMb the fileUploadLimitInMb value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withFileUploadLimitInMb(Integer fileUploadLimitInMb) {
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        return this;
    }

    /**
     * Get the exclusions property: The exclusion list.
     *
     * @return the exclusions value.
     */
    public List<ApplicationGatewayFirewallExclusion> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: The exclusion list.
     *
     * @param exclusions the exclusions value to set.
     * @return the ApplicationGatewayWebApplicationFirewallConfiguration object itself.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration withExclusions(
        List<ApplicationGatewayFirewallExclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (firewallMode() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property firewallMode in model"
                            + " ApplicationGatewayWebApplicationFirewallConfiguration"));
        }
        if (ruleSetType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleSetType in model"
                            + " ApplicationGatewayWebApplicationFirewallConfiguration"));
        }
        if (ruleSetVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleSetVersion in model"
                            + " ApplicationGatewayWebApplicationFirewallConfiguration"));
        }
        if (disabledRuleGroups() != null) {
            disabledRuleGroups().forEach(e -> e.validate());
        }
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
    }
}
