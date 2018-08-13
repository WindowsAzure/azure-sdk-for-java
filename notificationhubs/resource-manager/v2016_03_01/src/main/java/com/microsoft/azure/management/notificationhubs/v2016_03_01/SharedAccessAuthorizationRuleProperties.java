/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SharedAccessAuthorizationRule properties.
 */
public class SharedAccessAuthorizationRuleProperties {
    /**
     * The rights associated with the rule.
     */
    @JsonProperty(value = "rights")
    private List<AccessRights> rights;

    /**
     * Get the rights associated with the rule.
     *
     * @return the rights value
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights associated with the rule.
     *
     * @param rights the rights value to set
     * @return the SharedAccessAuthorizationRuleProperties object itself.
     */
    public SharedAccessAuthorizationRuleProperties withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

}
