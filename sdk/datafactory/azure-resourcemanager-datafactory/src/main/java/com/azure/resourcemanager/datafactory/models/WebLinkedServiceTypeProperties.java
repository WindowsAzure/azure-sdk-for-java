// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base definition of WebLinkedServiceTypeProperties, this typeProperties is polymorphic based on authenticationType, so
 * not flattened in SDK models.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "authenticationType",
    defaultImpl = WebLinkedServiceTypeProperties.class)
@JsonTypeName("WebLinkedServiceTypeProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Anonymous", value = WebAnonymousAuthentication.class),
    @JsonSubTypes.Type(name = "Basic", value = WebBasicAuthentication.class),
    @JsonSubTypes.Type(name = "ClientCertificate", value = WebClientCertificateAuthentication.class)
})
@Fluent
public class WebLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebLinkedServiceTypeProperties.class);

    /*
     * The URL of the web service endpoint, e.g. http://www.microsoft.com .
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /**
     * Get the url property: The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or
     * Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or
     * Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the WebLinkedServiceTypeProperties object itself.
     */
    public WebLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property url in model WebLinkedServiceTypeProperties"));
        }
    }
}
