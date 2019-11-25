/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes the data source that output will be written to.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OutputDataSource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.DataLake/Accounts", value = AzureDataLakeStoreOutputDataSource.class),
    @JsonSubTypes.Type(name = "PowerBI", value = PowerBIOutputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.ServiceBus/Topic", value = ServiceBusTopicOutputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.ServiceBus/Queue", value = ServiceBusQueueOutputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.Storage/DocumentDB", value = DocumentDbOutputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/Server/Database", value = AzureSqlDatabaseOutputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.ServiceBus/EventHub", value = EventHubOutputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.Storage/Table", value = AzureTableOutputDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.Storage/Blob", value = BlobOutputDataSource.class)
})
public class OutputDataSource {
}
