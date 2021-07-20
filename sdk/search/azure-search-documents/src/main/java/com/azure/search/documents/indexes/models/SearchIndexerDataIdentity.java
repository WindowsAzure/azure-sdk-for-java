// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Abstract base type for data identities. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@odata.type",
        defaultImpl = SearchIndexerDataIdentity.class)
@JsonTypeName("SearchIndexerDataIdentity")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.SearchIndexerDataNoneIdentity",
            value = SearchIndexerDataNoneIdentity.class),
    @JsonSubTypes.Type(
            name = "#Microsoft.Azure.Search.SearchIndexerDataUserAssignedIdentity",
            value = SearchIndexerDataUserAssignedIdentity.class)
})
@Immutable
public abstract class SearchIndexerDataIdentity { }
