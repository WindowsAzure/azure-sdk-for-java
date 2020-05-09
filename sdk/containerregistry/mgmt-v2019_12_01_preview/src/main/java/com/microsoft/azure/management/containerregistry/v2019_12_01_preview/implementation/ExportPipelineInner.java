/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.IdentityProperties;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ExportPipelineTargetProperties;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.PipelineOptions;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An object that represents an export pipeline for a container registry.
 */
@JsonFlatten
public class ExportPipelineInner extends ProxyResource {
    /**
     * The identity of the export pipeline.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /**
     * The target properties of the export pipeline.
     */
    @JsonProperty(value = "properties.target", required = true)
    private ExportPipelineTargetProperties target;

    /**
     * The list of all options configured for the pipeline.
     */
    @JsonProperty(value = "properties.options")
    private List<PipelineOptions> options;

    /**
     * The provisioning state of the pipeline at the time the operation was
     * called. Possible values include: 'Creating', 'Updating', 'Deleting',
     * 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the identity of the export pipeline.
     *
     * @return the identity value
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity of the export pipeline.
     *
     * @param identity the identity value to set
     * @return the ExportPipelineInner object itself.
     */
    public ExportPipelineInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the target properties of the export pipeline.
     *
     * @return the target value
     */
    public ExportPipelineTargetProperties target() {
        return this.target;
    }

    /**
     * Set the target properties of the export pipeline.
     *
     * @param target the target value to set
     * @return the ExportPipelineInner object itself.
     */
    public ExportPipelineInner withTarget(ExportPipelineTargetProperties target) {
        this.target = target;
        return this;
    }

    /**
     * Get the list of all options configured for the pipeline.
     *
     * @return the options value
     */
    public List<PipelineOptions> options() {
        return this.options;
    }

    /**
     * Set the list of all options configured for the pipeline.
     *
     * @param options the options value to set
     * @return the ExportPipelineInner object itself.
     */
    public ExportPipelineInner withOptions(List<PipelineOptions> options) {
        this.options = options;
        return this;
    }

    /**
     * Get the provisioning state of the pipeline at the time the operation was called. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
