/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2019_11_09.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2019_11_09.implementation.DiagnoseVirtualNetworkResultInner;
import java.util.List;

/**
 * Type representing DiagnoseVirtualNetworkResult.
 */
public interface DiagnoseVirtualNetworkResult extends HasInner<DiagnoseVirtualNetworkResultInner>, HasManager<KustoManager> {
    /**
     * @return the findings value.
     */
    List<String> findings();

}
