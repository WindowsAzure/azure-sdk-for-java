/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.IdentityProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.RunRequest;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The task run that has the ARM resource and properties.
 * The task run will have the information of request and result of a run.
 */
@JsonFlatten
public class TaskRunInner extends ProxyResource {
    /**
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /**
     * The provisioning state of this task run. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The request (parameters) for the run.
     */
    @JsonProperty(value = "properties.runRequest")
    private RunRequest runRequest;

    /**
     * The result of this task run.
     */
    @JsonProperty(value = "properties.runResult", access = JsonProperty.Access.WRITE_ONLY)
    private RunInner runResult;

    /**
     * How the run should be forced to rerun even if the run request
     * configuration has not changed.
     */
    @JsonProperty(value = "properties.forceUpdateTag")
    private String forceUpdateTag;

    /**
     * The location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get identity for the resource.
     *
     * @return the identity value
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set identity for the resource.
     *
     * @param identity the identity value to set
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioning state of this task run. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the request (parameters) for the run.
     *
     * @return the runRequest value
     */
    public RunRequest runRequest() {
        return this.runRequest;
    }

    /**
     * Set the request (parameters) for the run.
     *
     * @param runRequest the runRequest value to set
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withRunRequest(RunRequest runRequest) {
        this.runRequest = runRequest;
        return this;
    }

    /**
     * Get the result of this task run.
     *
     * @return the runResult value
     */
    public RunInner runResult() {
        return this.runResult;
    }

    /**
     * Get how the run should be forced to rerun even if the run request configuration has not changed.
     *
     * @return the forceUpdateTag value
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set how the run should be forced to rerun even if the run request configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the resource.
     *
     * @param location the location value to set
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

}
