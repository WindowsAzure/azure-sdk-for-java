/**
 * MICROSOFT_MIT_NO_CODE
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the license under which the text or photo may be used.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("License")
public class License extends CreativeWork {
}
