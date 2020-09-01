/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2020_08_02;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a hybrid machine.
 */
public class MachineProperties {
    /**
     * The locationData property.
     */
    @JsonProperty(value = "locationData")
    private LocationData locationData;

    /**
     * Specifies the operating system settings for the hybrid machine.
     */
    @JsonProperty(value = "osProfile")
    private MachinePropertiesOsProfile osProfile;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The status of the hybrid machine agent. Possible values include:
     * 'Connected', 'Disconnected', 'Error'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private StatusTypes status;

    /**
     * The time of the last status change.
     */
    @JsonProperty(value = "lastStatusChange", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastStatusChange;

    /**
     * Details about the error state.
     */
    @JsonProperty(value = "errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorDetail> errorDetails;

    /**
     * The hybrid machine agent full version.
     */
    @JsonProperty(value = "agentVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String agentVersion;

    /**
     * Specifies the hybrid machine unique ID.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /**
     * Specifies the hybrid machine display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Specifies the hybrid machine FQDN.
     */
    @JsonProperty(value = "machineFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String machineFqdn;

    /**
     * Public Key that the client provides to be used during initial resource
     * onboarding.
     */
    @JsonProperty(value = "clientPublicKey")
    private String clientPublicKey;

    /**
     * The Operating System running on the hybrid machine.
     */
    @JsonProperty(value = "osName", access = JsonProperty.Access.WRITE_ONLY)
    private String osName;

    /**
     * The version of Operating System running on the hybrid machine.
     */
    @JsonProperty(value = "osVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String osVersion;

    /**
     * Specifies the Arc Machine's unique SMBIOS ID.
     */
    @JsonProperty(value = "vmUuid", access = JsonProperty.Access.WRITE_ONLY)
    private String vmUuid;

    /**
     * Machine Extensions information.
     */
    @JsonProperty(value = "extensions")
    private List<MachineExtensionInstanceView> extensions;

    /**
     * Specifies the Operating System product SKU.
     */
    @JsonProperty(value = "osSku", access = JsonProperty.Access.WRITE_ONLY)
    private String osSku;

    /**
     * Specifies the Windows domain name.
     */
    @JsonProperty(value = "domainName", access = JsonProperty.Access.WRITE_ONLY)
    private String domainName;

    /**
     * Specifies the AD fully qualified display name.
     */
    @JsonProperty(value = "adFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String adFqdn;

    /**
     * Specifies the DNS fully qualified display name.
     */
    @JsonProperty(value = "dnsFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String dnsFqdn;

    /**
     * Get the locationData value.
     *
     * @return the locationData value
     */
    public LocationData locationData() {
        return this.locationData;
    }

    /**
     * Set the locationData value.
     *
     * @param locationData the locationData value to set
     * @return the MachineProperties object itself.
     */
    public MachineProperties withLocationData(LocationData locationData) {
        this.locationData = locationData;
        return this;
    }

    /**
     * Get specifies the operating system settings for the hybrid machine.
     *
     * @return the osProfile value
     */
    public MachinePropertiesOsProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set specifies the operating system settings for the hybrid machine.
     *
     * @param osProfile the osProfile value to set
     * @return the MachineProperties object itself.
     */
    public MachineProperties withOsProfile(MachinePropertiesOsProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status of the hybrid machine agent. Possible values include: 'Connected', 'Disconnected', 'Error'.
     *
     * @return the status value
     */
    public StatusTypes status() {
        return this.status;
    }

    /**
     * Get the time of the last status change.
     *
     * @return the lastStatusChange value
     */
    public DateTime lastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * Get details about the error state.
     *
     * @return the errorDetails value
     */
    public List<ErrorDetail> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Get the hybrid machine agent full version.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Get specifies the hybrid machine unique ID.
     *
     * @return the vmId value
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set specifies the hybrid machine unique ID.
     *
     * @param vmId the vmId value to set
     * @return the MachineProperties object itself.
     */
    public MachineProperties withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get specifies the hybrid machine display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get specifies the hybrid machine FQDN.
     *
     * @return the machineFqdn value
     */
    public String machineFqdn() {
        return this.machineFqdn;
    }

    /**
     * Get public Key that the client provides to be used during initial resource onboarding.
     *
     * @return the clientPublicKey value
     */
    public String clientPublicKey() {
        return this.clientPublicKey;
    }

    /**
     * Set public Key that the client provides to be used during initial resource onboarding.
     *
     * @param clientPublicKey the clientPublicKey value to set
     * @return the MachineProperties object itself.
     */
    public MachineProperties withClientPublicKey(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
        return this;
    }

    /**
     * Get the Operating System running on the hybrid machine.
     *
     * @return the osName value
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Get the version of Operating System running on the hybrid machine.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Get specifies the Arc Machine's unique SMBIOS ID.
     *
     * @return the vmUuid value
     */
    public String vmUuid() {
        return this.vmUuid;
    }

    /**
     * Get machine Extensions information.
     *
     * @return the extensions value
     */
    public List<MachineExtensionInstanceView> extensions() {
        return this.extensions;
    }

    /**
     * Set machine Extensions information.
     *
     * @param extensions the extensions value to set
     * @return the MachineProperties object itself.
     */
    public MachineProperties withExtensions(List<MachineExtensionInstanceView> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get specifies the Operating System product SKU.
     *
     * @return the osSku value
     */
    public String osSku() {
        return this.osSku;
    }

    /**
     * Get specifies the Windows domain name.
     *
     * @return the domainName value
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get specifies the AD fully qualified display name.
     *
     * @return the adFqdn value
     */
    public String adFqdn() {
        return this.adFqdn;
    }

    /**
     * Get specifies the DNS fully qualified display name.
     *
     * @return the dnsFqdn value
     */
    public String dnsFqdn() {
        return this.dnsFqdn;
    }

}
