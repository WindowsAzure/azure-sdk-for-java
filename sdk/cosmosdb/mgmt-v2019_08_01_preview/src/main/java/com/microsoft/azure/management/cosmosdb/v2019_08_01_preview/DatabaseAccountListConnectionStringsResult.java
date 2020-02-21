/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation.CosmosDBManager;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation.DatabaseAccountListConnectionStringsResultInner;
import java.util.List;

/**
 * Type representing DatabaseAccountListConnectionStringsResult.
 */
public interface DatabaseAccountListConnectionStringsResult extends HasInner<DatabaseAccountListConnectionStringsResultInner>, HasManager<CosmosDBManager> {
    /**
     * @return the connectionStrings value.
     */
    List<DatabaseAccountConnectionString> connectionStrings();

}
