/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.ReplaceAllFirewallRulesOperationResponseInner;

/**
 * Type representing ReplaceAllFirewallRulesOperationResponse.
 */
public interface ReplaceAllFirewallRulesOperationResponse extends HasInner<ReplaceAllFirewallRulesOperationResponseInner>, HasManager<SynapseManager> {
    /**
     * @return the operationId value.
     */
    String operationId();

}
