// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The TriggerProperties model.
 */
@Fluent
public final class TriggerProperties {
    /*
     * The collection of triggers based on source code repository.
     */
    @JsonProperty(value = "sourceTriggers")
    private List<SourceTrigger> sourceTriggers;

    /*
     * The trigger based on base image dependencies.
     */
    @JsonProperty(value = "baseImageTrigger")
    private BaseImageTrigger baseImageTrigger;

    /**
     * Get the sourceTriggers property: The collection of triggers based on
     * source code repository.
     * 
     * @return the sourceTriggers value.
     */
    public List<SourceTrigger> sourceTriggers() {
        return this.sourceTriggers;
    }

    /**
     * Set the sourceTriggers property: The collection of triggers based on
     * source code repository.
     * 
     * @param sourceTriggers the sourceTriggers value to set.
     * @return the TriggerProperties object itself.
     */
    public TriggerProperties withSourceTriggers(List<SourceTrigger> sourceTriggers) {
        this.sourceTriggers = sourceTriggers;
        return this;
    }

    /**
     * Get the baseImageTrigger property: The trigger based on base image
     * dependencies.
     * 
     * @return the baseImageTrigger value.
     */
    public BaseImageTrigger baseImageTrigger() {
        return this.baseImageTrigger;
    }

    /**
     * Set the baseImageTrigger property: The trigger based on base image
     * dependencies.
     * 
     * @param baseImageTrigger the baseImageTrigger value to set.
     * @return the TriggerProperties object itself.
     */
    public TriggerProperties withBaseImageTrigger(BaseImageTrigger baseImageTrigger) {
        this.baseImageTrigger = baseImageTrigger;
        return this;
    }
}
