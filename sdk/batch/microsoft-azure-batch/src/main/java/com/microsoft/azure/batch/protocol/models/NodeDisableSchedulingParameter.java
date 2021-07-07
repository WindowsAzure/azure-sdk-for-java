/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for disabling scheduling on a Compute Node.
 */
public class NodeDisableSchedulingParameter {
    /**
     * What to do with currently running Tasks when disabling Task scheduling
     * on the Compute Node. The default value is requeue. Possible values
     * include: 'requeue', 'terminate', 'taskCompletion'.
     */
    @JsonProperty(value = "nodeDisableSchedulingOption")
    private DisableComputeNodeSchedulingOption nodeDisableSchedulingOption;

    /**
     * Get what to do with currently running Tasks when disabling Task scheduling on the Compute Node. The default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion'.
     *
     * @return the nodeDisableSchedulingOption value
     */
    public DisableComputeNodeSchedulingOption nodeDisableSchedulingOption() {
        return this.nodeDisableSchedulingOption;
    }

    /**
     * Set what to do with currently running Tasks when disabling Task scheduling on the Compute Node. The default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion'.
     *
     * @param nodeDisableSchedulingOption the nodeDisableSchedulingOption value to set
     * @return the NodeDisableSchedulingParameter object itself.
     */
    public NodeDisableSchedulingParameter withNodeDisableSchedulingOption(DisableComputeNodeSchedulingOption nodeDisableSchedulingOption) {
        this.nodeDisableSchedulingOption = nodeDisableSchedulingOption;
        return this;
    }

}
