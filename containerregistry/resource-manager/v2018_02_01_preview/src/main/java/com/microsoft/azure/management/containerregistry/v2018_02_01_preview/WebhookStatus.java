/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebhookStatus.
 */
public final class WebhookStatus extends ExpandableStringEnum<WebhookStatus> {
    /** Static value enabled for WebhookStatus. */
    public static final WebhookStatus ENABLED = fromString("enabled");

    /** Static value disabled for WebhookStatus. */
    public static final WebhookStatus DISABLED = fromString("disabled");

    /**
     * Creates or finds a WebhookStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding WebhookStatus
     */
    @JsonCreator
    public static WebhookStatus fromString(String name) {
        return fromString(name, WebhookStatus.class);
    }

    /**
     * @return known WebhookStatus values
     */
    public static Collection<WebhookStatus> values() {
        return values(WebhookStatus.class);
    }
}
