// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The DefaultCognitiveServicesAccount model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.DefaultCognitiveServices")
@JsonFlatten
@Immutable
<<<<<<< HEAD
public class DefaultCognitiveServicesAccount extends CognitiveServicesAccount {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
=======
public class DefaultCognitiveServicesAccount extends CognitiveServicesAccount {}
>>>>>>> b58ce026c9fe5fc4ad488b3aa7c0985968f73487
