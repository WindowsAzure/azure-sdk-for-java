/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_09_07;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2019_09_07.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2019_09_07.implementation.DatabasePrincipalListResultInner;
import com.microsoft.azure.management.kusto.v2019_09_07.implementation.DatabasePrincipalInner;
import java.util.List;

/**
 * Type representing DatabasePrincipalListResult.
 */
public interface DatabasePrincipalListResult extends HasInner<DatabasePrincipalListResultInner>, HasManager<KustoManager> {
    /**
     * @return the value value.
     */
    List<DatabasePrincipalInner> value();

}
