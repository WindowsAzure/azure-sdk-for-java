/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * This class represents the group task details when parent child relationship
 * exists in the drill down.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = GroupTaskDetails.class)
@JsonTypeName("GroupTaskDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "InlineWorkflowTaskDetails", value = InlineWorkflowTaskDetails.class),
    @JsonSubTypes.Type(name = "RecoveryPlanGroupTaskDetails", value = RecoveryPlanGroupTaskDetails.class),
    @JsonSubTypes.Type(name = "RecoveryPlanShutdownGroupTaskDetails", value = RecoveryPlanShutdownGroupTaskDetails.class)
})
public class GroupTaskDetails {
    /**
     * The child tasks.
     */
    @JsonProperty(value = "childTasks")
    private List<ASRTask> childTasks;

    /**
     * Get the child tasks.
     *
     * @return the childTasks value
     */
    public List<ASRTask> childTasks() {
        return this.childTasks;
    }

    /**
     * Set the child tasks.
     *
     * @param childTasks the childTasks value to set
     * @return the GroupTaskDetails object itself.
     */
    public GroupTaskDetails withChildTasks(List<ASRTask> childTasks) {
        this.childTasks = childTasks;
        return this;
    }

}
