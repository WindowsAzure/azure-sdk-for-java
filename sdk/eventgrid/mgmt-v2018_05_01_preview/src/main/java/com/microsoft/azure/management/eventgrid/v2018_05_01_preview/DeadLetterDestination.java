/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Information about the dead letter destination for an event subscription. To
 * configure a deadletter destination, do not directly instantiate an object of
 * this class. Instead, instantiate an object of a derived class. Currently,
 * StorageBlobDeadLetterDestination is the only class that derives from this
 * class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("DeadLetterDestination")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StorageBlob", value = StorageBlobDeadLetterDestination.class)
})
public class DeadLetterDestination {
}
