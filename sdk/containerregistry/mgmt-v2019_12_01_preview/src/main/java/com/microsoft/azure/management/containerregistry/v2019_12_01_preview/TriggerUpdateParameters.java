/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties for updating triggers.
 */
public class TriggerUpdateParameters {
    /**
     * The collection of timer triggers.
     */
    @JsonProperty(value = "timerTriggers")
    private List<TimerTriggerUpdateParameters> timerTriggers;

    /**
     * The collection of triggers based on source code repository.
     */
    @JsonProperty(value = "sourceTriggers")
    private List<SourceTriggerUpdateParameters> sourceTriggers;

    /**
     * The trigger based on base image dependencies.
     */
    @JsonProperty(value = "baseImageTrigger")
    private BaseImageTriggerUpdateParameters baseImageTrigger;

    /**
     * Get the collection of timer triggers.
     *
     * @return the timerTriggers value
     */
    public List<TimerTriggerUpdateParameters> timerTriggers() {
        return this.timerTriggers;
    }

    /**
     * Set the collection of timer triggers.
     *
     * @param timerTriggers the timerTriggers value to set
     * @return the TriggerUpdateParameters object itself.
     */
    public TriggerUpdateParameters withTimerTriggers(List<TimerTriggerUpdateParameters> timerTriggers) {
        this.timerTriggers = timerTriggers;
        return this;
    }

    /**
     * Get the collection of triggers based on source code repository.
     *
     * @return the sourceTriggers value
     */
    public List<SourceTriggerUpdateParameters> sourceTriggers() {
        return this.sourceTriggers;
    }

    /**
     * Set the collection of triggers based on source code repository.
     *
     * @param sourceTriggers the sourceTriggers value to set
     * @return the TriggerUpdateParameters object itself.
     */
    public TriggerUpdateParameters withSourceTriggers(List<SourceTriggerUpdateParameters> sourceTriggers) {
        this.sourceTriggers = sourceTriggers;
        return this;
    }

    /**
     * Get the trigger based on base image dependencies.
     *
     * @return the baseImageTrigger value
     */
    public BaseImageTriggerUpdateParameters baseImageTrigger() {
        return this.baseImageTrigger;
    }

    /**
     * Set the trigger based on base image dependencies.
     *
     * @param baseImageTrigger the baseImageTrigger value to set
     * @return the TriggerUpdateParameters object itself.
     */
    public TriggerUpdateParameters withBaseImageTrigger(BaseImageTriggerUpdateParameters baseImageTrigger) {
        this.baseImageTrigger = baseImageTrigger;
        return this;
    }

}
