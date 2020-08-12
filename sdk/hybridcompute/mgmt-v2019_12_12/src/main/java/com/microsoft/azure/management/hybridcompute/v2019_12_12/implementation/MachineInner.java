/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2019_12_12.implementation;

import com.microsoft.azure.management.hybridcompute.v2019_12_12.LocationData;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.MachinePropertiesOsProfile;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.StatusTypes;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.ErrorDetail;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.MachineExtensionInstanceView;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.MachineIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Describes a hybrid machine.
 */
@JsonFlatten
public class MachineInner extends Resource {
    /**
     * The locationData property.
     */
    @JsonProperty(value = "properties.locationData")
    private LocationData locationData;

    /**
     * Specifies the operating system settings for the hybrid machine.
     */
    @JsonProperty(value = "properties.osProfile")
    private MachinePropertiesOsProfile osProfile;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The status of the hybrid machine agent. Possible values include:
     * 'Connected', 'Disconnected', 'Error'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private StatusTypes status;

    /**
     * The time of the last status change.
     */
    @JsonProperty(value = "properties.lastStatusChange", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastStatusChange;

    /**
     * Details about the error state.
     */
    @JsonProperty(value = "properties.errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorDetail> errorDetails;

    /**
     * The hybrid machine agent full version.
     */
    @JsonProperty(value = "properties.agentVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String agentVersion;

    /**
     * Specifies the hybrid machine unique ID.
     */
    @JsonProperty(value = "properties.vmId")
    private String vmId;

    /**
     * Specifies the hybrid machine display name.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Specifies the hybrid machine FQDN.
     */
    @JsonProperty(value = "properties.machineFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String machineFqdn;

    /**
     * Public Key that the client provides to be used during initial resource
     * onboarding.
     */
    @JsonProperty(value = "properties.clientPublicKey")
    private String clientPublicKey;

    /**
     * The Operating System running on the hybrid machine.
     */
    @JsonProperty(value = "properties.osName", access = JsonProperty.Access.WRITE_ONLY)
    private String osName;

    /**
     * The version of Operating System running on the hybrid machine.
     */
    @JsonProperty(value = "properties.osVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String osVersion;

    /**
     * Machine Extensions information.
     */
    @JsonProperty(value = "properties.extensions")
    private List<MachineExtensionInstanceView> extensions;

    /**
     * The identity property.
     */
    @JsonProperty(value = "identity")
    private MachineIdentity identity;

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
     * @return the MachineInner object itself.
     */
    public MachineInner withLocationData(LocationData locationData) {
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
     * @return the MachineInner object itself.
     */
    public MachineInner withOsProfile(MachinePropertiesOsProfile osProfile) {
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
     * @return the MachineInner object itself.
     */
    public MachineInner withVmId(String vmId) {
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
     * @return the MachineInner object itself.
     */
    public MachineInner withClientPublicKey(String clientPublicKey) {
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
     * @return the MachineInner object itself.
     */
    public MachineInner withExtensions(List<MachineExtensionInstanceView> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public MachineIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the MachineInner object itself.
     */
    public MachineInner withIdentity(MachineIdentity identity) {
        this.identity = identity;
        return this;
    }

}
