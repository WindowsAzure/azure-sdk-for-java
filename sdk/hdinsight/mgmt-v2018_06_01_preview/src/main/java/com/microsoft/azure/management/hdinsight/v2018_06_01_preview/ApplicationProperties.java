/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The HDInsight cluster application GET response.
 */
public class ApplicationProperties {
    /**
     * The list of roles in the cluster.
     */
    @JsonProperty(value = "computeProfile")
    private ComputeProfile computeProfile;

    /**
     * The list of install script actions.
     */
    @JsonProperty(value = "installScriptActions")
    private List<RuntimeScriptAction> installScriptActions;

    /**
     * The list of uninstall script actions.
     */
    @JsonProperty(value = "uninstallScriptActions")
    private List<RuntimeScriptAction> uninstallScriptActions;

    /**
     * The list of application HTTPS endpoints.
     */
    @JsonProperty(value = "httpsEndpoints")
    private List<ApplicationGetHttpsEndpoint> httpsEndpoints;

    /**
     * The list of application SSH endpoints.
     */
    @JsonProperty(value = "sshEndpoints")
    private List<ApplicationGetEndpoint> sshEndpoints;

    /**
     * The provisioning state of the application.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The application type.
     */
    @JsonProperty(value = "applicationType")
    private String applicationType;

    /**
     * The application state.
     */
    @JsonProperty(value = "applicationState", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationState;

    /**
     * The list of errors.
     */
    @JsonProperty(value = "errors")
    private List<Errors> errors;

    /**
     * The application create date time.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private String createdDate;

    /**
     * The marketplace identifier.
     */
    @JsonProperty(value = "marketplaceIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String marketplaceIdentifier;

    /**
     * Get the list of roles in the cluster.
     *
     * @return the computeProfile value
     */
    public ComputeProfile computeProfile() {
        return this.computeProfile;
    }

    /**
     * Set the list of roles in the cluster.
     *
     * @param computeProfile the computeProfile value to set
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withComputeProfile(ComputeProfile computeProfile) {
        this.computeProfile = computeProfile;
        return this;
    }

    /**
     * Get the list of install script actions.
     *
     * @return the installScriptActions value
     */
    public List<RuntimeScriptAction> installScriptActions() {
        return this.installScriptActions;
    }

    /**
     * Set the list of install script actions.
     *
     * @param installScriptActions the installScriptActions value to set
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withInstallScriptActions(List<RuntimeScriptAction> installScriptActions) {
        this.installScriptActions = installScriptActions;
        return this;
    }

    /**
     * Get the list of uninstall script actions.
     *
     * @return the uninstallScriptActions value
     */
    public List<RuntimeScriptAction> uninstallScriptActions() {
        return this.uninstallScriptActions;
    }

    /**
     * Set the list of uninstall script actions.
     *
     * @param uninstallScriptActions the uninstallScriptActions value to set
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withUninstallScriptActions(List<RuntimeScriptAction> uninstallScriptActions) {
        this.uninstallScriptActions = uninstallScriptActions;
        return this;
    }

    /**
     * Get the list of application HTTPS endpoints.
     *
     * @return the httpsEndpoints value
     */
    public List<ApplicationGetHttpsEndpoint> httpsEndpoints() {
        return this.httpsEndpoints;
    }

    /**
     * Set the list of application HTTPS endpoints.
     *
     * @param httpsEndpoints the httpsEndpoints value to set
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withHttpsEndpoints(List<ApplicationGetHttpsEndpoint> httpsEndpoints) {
        this.httpsEndpoints = httpsEndpoints;
        return this;
    }

    /**
     * Get the list of application SSH endpoints.
     *
     * @return the sshEndpoints value
     */
    public List<ApplicationGetEndpoint> sshEndpoints() {
        return this.sshEndpoints;
    }

    /**
     * Set the list of application SSH endpoints.
     *
     * @param sshEndpoints the sshEndpoints value to set
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withSshEndpoints(List<ApplicationGetEndpoint> sshEndpoints) {
        this.sshEndpoints = sshEndpoints;
        return this;
    }

    /**
     * Get the provisioning state of the application.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the application type.
     *
     * @return the applicationType value
     */
    public String applicationType() {
        return this.applicationType;
    }

    /**
     * Set the application type.
     *
     * @param applicationType the applicationType value to set
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Get the application state.
     *
     * @return the applicationState value
     */
    public String applicationState() {
        return this.applicationState;
    }

    /**
     * Get the list of errors.
     *
     * @return the errors value
     */
    public List<Errors> errors() {
        return this.errors;
    }

    /**
     * Set the list of errors.
     *
     * @param errors the errors value to set
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withErrors(List<Errors> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the application create date time.
     *
     * @return the createdDate value
     */
    public String createdDate() {
        return this.createdDate;
    }

    /**
     * Get the marketplace identifier.
     *
     * @return the marketplaceIdentifier value
     */
    public String marketplaceIdentifier() {
        return this.marketplaceIdentifier;
    }

}
