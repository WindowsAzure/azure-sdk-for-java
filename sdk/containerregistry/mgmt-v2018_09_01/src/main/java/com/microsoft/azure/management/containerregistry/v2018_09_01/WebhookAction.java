/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebhookAction.
 */
public final class WebhookAction extends ExpandableStringEnum<WebhookAction> {
    /** Static value push for WebhookAction. */
    public static final WebhookAction PUSH = fromString("push");

    /** Static value delete for WebhookAction. */
    public static final WebhookAction DELETE = fromString("delete");

    /** Static value quarantine for WebhookAction. */
    public static final WebhookAction QUARANTINE = fromString("quarantine");

    /**
     * Creates or finds a WebhookAction from its string representation.
     * @param name a name to look for
     * @return the corresponding WebhookAction
     */
    @JsonCreator
    public static WebhookAction fromString(String name) {
        return fromString(name, WebhookAction.class);
    }

    /**
     * @return known WebhookAction values
     */
    public static Collection<WebhookAction> values() {
        return values(WebhookAction.class);
    }
}
