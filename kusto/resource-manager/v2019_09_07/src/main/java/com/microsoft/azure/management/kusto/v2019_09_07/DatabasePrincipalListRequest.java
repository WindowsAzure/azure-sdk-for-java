/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_09_07;

import java.util.List;
import com.microsoft.azure.management.kusto.v2019_09_07.implementation.DatabasePrincipalInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list Kusto database principals operation request.
 */
public class DatabasePrincipalListRequest {
    /**
     * The list of Kusto database principals.
     */
    @JsonProperty(value = "value")
    private List<DatabasePrincipalInner> value;

    /**
     * Get the list of Kusto database principals.
     *
     * @return the value value
     */
    public List<DatabasePrincipalInner> value() {
        return this.value;
    }

    /**
     * Set the list of Kusto database principals.
     *
     * @param value the value value to set
     * @return the DatabasePrincipalListRequest object itself.
     */
    public DatabasePrincipalListRequest withValue(List<DatabasePrincipalInner> value) {
        this.value = value;
        return this;
    }

}
