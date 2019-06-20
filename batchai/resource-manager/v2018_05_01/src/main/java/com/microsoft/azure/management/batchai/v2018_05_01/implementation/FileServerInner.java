/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01.implementation;

import com.microsoft.azure.management.batchai.v2018_05_01.SshConfiguration;
import com.microsoft.azure.management.batchai.v2018_05_01.DataDisks;
import com.microsoft.azure.management.batchai.v2018_05_01.ResourceId;
import com.microsoft.azure.management.batchai.v2018_05_01.MountSettings;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.v2018_05_01.FileServerProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * File Server information.
 */
@JsonFlatten
public class FileServerInner extends ProxyResource {
    /**
     * VM size.
     * VM size of the File Server.
     */
    @JsonProperty(value = "properties.vmSize")
    private String vmSize;

    /**
     * SSH configuration.
     * SSH configuration for accessing the File Server node.
     */
    @JsonProperty(value = "properties.sshConfiguration")
    private SshConfiguration sshConfiguration;

    /**
     * Data disks configuration.
     * Information about disks attached to File Server VM.
     */
    @JsonProperty(value = "properties.dataDisks")
    private DataDisks dataDisks;

    /**
     * Subnet.
     * File Server virtual network subnet resource ID.
     */
    @JsonProperty(value = "properties.subnet")
    private ResourceId subnet;

    /**
     * Mount settings.
     * File Server mount settings.
     */
    @JsonProperty(value = "properties.mountSettings", access = JsonProperty.Access.WRITE_ONLY)
    private MountSettings mountSettings;

    /**
     * Provisioning State Transition time.
     * Time when the provisioning state was changed.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningStateTransitionTime;

    /**
     * Creation time.
     * Time when the FileServer was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Provisioning state.
     * Provisioning state of the File Server. Possible values: creating - The
     * File Server is getting created; updating - The File Server creation has
     * been accepted and it is getting updated; deleting - The user has
     * requested that the File Server be deleted, and it is in the process of
     * being deleted; failed - The File Server creation has failed with the
     * specified error code. Details about the error code are specified in the
     * message field; succeeded - The File Server creation has succeeded.
     * Possible values include: 'creating', 'updating', 'deleting',
     * 'succeeded', 'failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private FileServerProvisioningState provisioningState;

    /**
     * Get vM size of the File Server.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set vM size of the File Server.
     *
     * @param vmSize the vmSize value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get sSH configuration for accessing the File Server node.
     *
     * @return the sshConfiguration value
     */
    public SshConfiguration sshConfiguration() {
        return this.sshConfiguration;
    }

    /**
     * Set sSH configuration for accessing the File Server node.
     *
     * @param sshConfiguration the sshConfiguration value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withSshConfiguration(SshConfiguration sshConfiguration) {
        this.sshConfiguration = sshConfiguration;
        return this;
    }

    /**
     * Get information about disks attached to File Server VM.
     *
     * @return the dataDisks value
     */
    public DataDisks dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set information about disks attached to File Server VM.
     *
     * @param dataDisks the dataDisks value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withDataDisks(DataDisks dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get file Server virtual network subnet resource ID.
     *
     * @return the subnet value
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set file Server virtual network subnet resource ID.
     *
     * @param subnet the subnet value to set
     * @return the FileServerInner object itself.
     */
    public FileServerInner withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get file Server mount settings.
     *
     * @return the mountSettings value
     */
    public MountSettings mountSettings() {
        return this.mountSettings;
    }

    /**
     * Get time when the provisioning state was changed.
     *
     * @return the provisioningStateTransitionTime value
     */
    public DateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get time when the FileServer was created.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get provisioning state of the File Server. Possible values: creating - The File Server is getting created; updating - The File Server creation has been accepted and it is getting updated; deleting - The user has requested that the File Server be deleted, and it is in the process of being deleted; failed - The File Server creation has failed with the specified error code. Details about the error code are specified in the message field; succeeded - The File Server creation has succeeded. Possible values include: 'creating', 'updating', 'deleting', 'succeeded', 'failed'.
     *
     * @return the provisioningState value
     */
    public FileServerProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
