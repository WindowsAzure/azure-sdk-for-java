/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OpenShiftAgentPoolProfileRole.
 */
public final class OpenShiftAgentPoolProfileRole extends ExpandableStringEnum<OpenShiftAgentPoolProfileRole> {
    /** Static value compute for OpenShiftAgentPoolProfileRole. */
    public static final OpenShiftAgentPoolProfileRole COMPUTE = fromString("compute");

    /** Static value infra for OpenShiftAgentPoolProfileRole. */
    public static final OpenShiftAgentPoolProfileRole INFRA = fromString("infra");

    /**
     * Creates or finds a OpenShiftAgentPoolProfileRole from its string representation.
     * @param name a name to look for
     * @return the corresponding OpenShiftAgentPoolProfileRole
     */
    @JsonCreator
    public static OpenShiftAgentPoolProfileRole fromString(String name) {
        return fromString(name, OpenShiftAgentPoolProfileRole.class);
    }

    /**
     * @return known OpenShiftAgentPoolProfileRole values
     */
    public static Collection<OpenShiftAgentPoolProfileRole> values() {
        return values(OpenShiftAgentPoolProfileRole.class);
    }
}
