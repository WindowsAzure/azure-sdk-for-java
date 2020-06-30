/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2019_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of the init container. Only valid in response.
 */
public class InitContainerPropertiesDefinitionInstanceView {
    /**
     * The number of times that the init container has been restarted.
     */
    @JsonProperty(value = "restartCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer restartCount;

    /**
     * The current state of the init container.
     */
    @JsonProperty(value = "currentState", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerState currentState;

    /**
     * The previous state of the init container.
     */
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerState previousState;

    /**
     * The events of the init container.
     */
    @JsonProperty(value = "events", access = JsonProperty.Access.WRITE_ONLY)
    private List<Event> events;

    /**
     * Get the number of times that the init container has been restarted.
     *
     * @return the restartCount value
     */
    public Integer restartCount() {
        return this.restartCount;
    }

    /**
     * Get the current state of the init container.
     *
     * @return the currentState value
     */
    public ContainerState currentState() {
        return this.currentState;
    }

    /**
     * Get the previous state of the init container.
     *
     * @return the previousState value
     */
    public ContainerState previousState() {
        return this.previousState;
    }

    /**
     * Get the events of the init container.
     *
     * @return the events value
     */
    public List<Event> events() {
        return this.events;
    }

}
