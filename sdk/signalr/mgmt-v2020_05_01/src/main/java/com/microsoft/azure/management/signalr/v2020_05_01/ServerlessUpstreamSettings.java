/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings for the Upstream when the Azure SignalR is in server-less mode.
 */
public class ServerlessUpstreamSettings {
    /**
     * Gets or sets the list of Upstream URL templates. Order matters, and the
     * first matching template takes effects.
     */
    @JsonProperty(value = "templates")
    private List<UpstreamTemplate> templates;

    /**
     * Get gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
     *
     * @return the templates value
     */
    public List<UpstreamTemplate> templates() {
        return this.templates;
    }

    /**
     * Set gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
     *
     * @param templates the templates value to set
     * @return the ServerlessUpstreamSettings object itself.
     */
    public ServerlessUpstreamSettings withTemplates(List<UpstreamTemplate> templates) {
        this.templates = templates;
        return this;
    }

}
