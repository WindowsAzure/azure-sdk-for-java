/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create operation.
 */
@JsonFlatten
public class FileServerCreateParameters {
    /**
     * The region in which to create the File Server.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The user specified tags associated with the File Server.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The size of the virtual machine of the file server.
     * For information about available VM sizes for fileservers from the
     * Virtual Machines Marketplace, see Sizes for Virtual Machines (Linux).
     */
    @JsonProperty(value = "properties.vmSize", required = true)
    private String vmSize;

    /**
     * SSH settings for the file server.
     */
    @JsonProperty(value = "properties.sshConfiguration", required = true)
    private SshConfiguration sshConfiguration;

    /**
     * Settings for the data disk which would be created for the file server.
     */
    @JsonProperty(value = "properties.dataDisks", required = true)
    private DataDisks dataDisks;

    /**
     * Specifies the identifier of the subnet.
     */
    @JsonProperty(value = "properties.subnet")
    private ResourceId subnet;

    /**
     * Get the region in which to create the File Server.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the region in which to create the File Server.
     *
     * @param location the location value to set
     * @return the FileServerCreateParameters object itself.
     */
    public FileServerCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the user specified tags associated with the File Server.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the user specified tags associated with the File Server.
     *
     * @param tags the tags value to set
     * @return the FileServerCreateParameters object itself.
     */
    public FileServerCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get for information about available VM sizes for fileservers from the Virtual Machines Marketplace, see Sizes for Virtual Machines (Linux).
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set for information about available VM sizes for fileservers from the Virtual Machines Marketplace, see Sizes for Virtual Machines (Linux).
     *
     * @param vmSize the vmSize value to set
     * @return the FileServerCreateParameters object itself.
     */
    public FileServerCreateParameters withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the sshConfiguration value.
     *
     * @return the sshConfiguration value
     */
    public SshConfiguration sshConfiguration() {
        return this.sshConfiguration;
    }

    /**
     * Set the sshConfiguration value.
     *
     * @param sshConfiguration the sshConfiguration value to set
     * @return the FileServerCreateParameters object itself.
     */
    public FileServerCreateParameters withSshConfiguration(SshConfiguration sshConfiguration) {
        this.sshConfiguration = sshConfiguration;
        return this;
    }

    /**
     * Get the dataDisks value.
     *
     * @return the dataDisks value
     */
    public DataDisks dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks value.
     *
     * @param dataDisks the dataDisks value to set
     * @return the FileServerCreateParameters object itself.
     */
    public FileServerCreateParameters withDataDisks(DataDisks dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     * @return the FileServerCreateParameters object itself.
     */
    public FileServerCreateParameters withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

}
