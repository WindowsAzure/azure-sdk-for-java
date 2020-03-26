// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.JobTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The JobTargetGroup model.
 */
@JsonFlatten
@Fluent
public class JobTargetGroupInner extends ProxyResource {
    /*
     * Members of the target group.
     */
    @JsonProperty(value = "properties.members")
    private List<JobTarget> members;

    /**
     * Get the members property: Members of the target group.
     * 
     * @return the members value.
     */
    public List<JobTarget> members() {
        return this.members;
    }

    /**
     * Set the members property: Members of the target group.
     * 
     * @param members the members value to set.
     * @return the JobTargetGroupInner object itself.
     */
    public JobTargetGroupInner withMembers(List<JobTarget> members) {
        this.members = members;
        return this;
    }
}
