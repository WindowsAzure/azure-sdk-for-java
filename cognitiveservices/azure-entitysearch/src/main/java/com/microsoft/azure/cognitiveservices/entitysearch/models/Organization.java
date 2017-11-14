/**
 * MICROSOFT_MIT_NO_CODE
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines an organization.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("Organization")
public class Organization extends Thing {
}
