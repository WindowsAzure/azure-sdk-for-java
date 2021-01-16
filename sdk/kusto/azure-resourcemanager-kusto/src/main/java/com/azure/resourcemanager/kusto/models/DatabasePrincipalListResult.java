// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalListResultInner;
import java.util.List;

/** An immutable client-side representation of DatabasePrincipalListResult. */
public interface DatabasePrincipalListResult {
    /**
     * Gets the value property: The list of Kusto database principals.
     *
     * @return the value value.
     */
    List<DatabasePrincipal> value();

    /**
     * Gets the inner com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalListResultInner object.
     *
     * @return the inner object.
     */
    DatabasePrincipalListResultInner innerModel();
}
