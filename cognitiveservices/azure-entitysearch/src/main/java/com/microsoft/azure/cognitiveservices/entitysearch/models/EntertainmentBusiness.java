/**
 * MICROSOFT_MIT_NO_CODE
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The EntertainmentBusiness model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("EntertainmentBusiness")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "MovieTheater", value = MovieTheater.class)
})
public class EntertainmentBusiness extends LocalBusiness {
}
