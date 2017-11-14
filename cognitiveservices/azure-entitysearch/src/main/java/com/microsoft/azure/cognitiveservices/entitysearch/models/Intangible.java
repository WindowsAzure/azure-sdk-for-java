/**
 * MICROSOFT_MIT_NO_CODE
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The Intangible model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("Intangible")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StructuredValue", value = StructuredValue.class)
})
public class Intangible extends Thing {
}
