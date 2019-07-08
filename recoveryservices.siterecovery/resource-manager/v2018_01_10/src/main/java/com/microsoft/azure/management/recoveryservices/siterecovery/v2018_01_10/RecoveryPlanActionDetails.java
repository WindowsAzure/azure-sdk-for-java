/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Recovery plan action custom details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("RecoveryPlanActionDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AutomationRunbookActionDetails", value = RecoveryPlanAutomationRunbookActionDetails.class),
    @JsonSubTypes.Type(name = "ManualActionDetails", value = RecoveryPlanManualActionDetails.class),
    @JsonSubTypes.Type(name = "ScriptActionDetails", value = RecoveryPlanScriptActionDetails.class)
})
public class RecoveryPlanActionDetails {
}
