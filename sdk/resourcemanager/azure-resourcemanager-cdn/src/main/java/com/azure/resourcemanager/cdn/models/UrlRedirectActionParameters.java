// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the parameters for the url redirect action. */
@Fluent
public final class UrlRedirectActionParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UrlRedirectActionParameters.class);

    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * The redirect type the rule will use when redirecting traffic.
     */
    @JsonProperty(value = "redirectType", required = true)
    private RedirectType redirectType;

    /*
     * Protocol to use for the redirect. The default value is MatchRequest
     */
    @JsonProperty(value = "destinationProtocol")
    private DestinationProtocol destinationProtocol;

    /*
     * The full path to redirect. Path cannot be empty and must start with /.
     * Leave empty to use the incoming path as destination path.
     */
    @JsonProperty(value = "customPath")
    private String customPath;

    /*
     * Host to redirect. Leave empty to use the incoming host as the
     * destination host.
     */
    @JsonProperty(value = "customHostname")
    private String customHostname;

    /*
     * The set of query strings to be placed in the redirect URL. Setting this
     * value would replace any existing query string; leave empty to preserve
     * the incoming query string. Query string must be in <key>=<value> format.
     * ? and & will be added automatically so do not include them.
     */
    @JsonProperty(value = "customQueryString")
    private String customQueryString;

    /*
     * Fragment to add to the redirect URL. Fragment is the part of the URL
     * that comes after #. Do not include the #.
     */
    @JsonProperty(value = "customFragment")
    private String customFragment;

    /** Creates an instance of UrlRedirectActionParameters class. */
    public UrlRedirectActionParameters() {
        odataType = "#Microsoft.Azure.Cdn.Models.DeliveryRuleUrlRedirectActionParameters";
    }

    /**
     * Get the odataType property: The @odata.type property.
     *
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     *
     * @param odataType the odataType value to set.
     * @return the UrlRedirectActionParameters object itself.
     */
    public UrlRedirectActionParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the redirectType property: The redirect type the rule will use when redirecting traffic.
     *
     * @return the redirectType value.
     */
    public RedirectType redirectType() {
        return this.redirectType;
    }

    /**
     * Set the redirectType property: The redirect type the rule will use when redirecting traffic.
     *
     * @param redirectType the redirectType value to set.
     * @return the UrlRedirectActionParameters object itself.
     */
    public UrlRedirectActionParameters withRedirectType(RedirectType redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    /**
     * Get the destinationProtocol property: Protocol to use for the redirect. The default value is MatchRequest.
     *
     * @return the destinationProtocol value.
     */
    public DestinationProtocol destinationProtocol() {
        return this.destinationProtocol;
    }

    /**
     * Set the destinationProtocol property: Protocol to use for the redirect. The default value is MatchRequest.
     *
     * @param destinationProtocol the destinationProtocol value to set.
     * @return the UrlRedirectActionParameters object itself.
     */
    public UrlRedirectActionParameters withDestinationProtocol(DestinationProtocol destinationProtocol) {
        this.destinationProtocol = destinationProtocol;
        return this;
    }

    /**
     * Get the customPath property: The full path to redirect. Path cannot be empty and must start with /. Leave empty
     * to use the incoming path as destination path.
     *
     * @return the customPath value.
     */
    public String customPath() {
        return this.customPath;
    }

    /**
     * Set the customPath property: The full path to redirect. Path cannot be empty and must start with /. Leave empty
     * to use the incoming path as destination path.
     *
     * @param customPath the customPath value to set.
     * @return the UrlRedirectActionParameters object itself.
     */
    public UrlRedirectActionParameters withCustomPath(String customPath) {
        this.customPath = customPath;
        return this;
    }

    /**
     * Get the customHostname property: Host to redirect. Leave empty to use the incoming host as the destination host.
     *
     * @return the customHostname value.
     */
    public String customHostname() {
        return this.customHostname;
    }

    /**
     * Set the customHostname property: Host to redirect. Leave empty to use the incoming host as the destination host.
     *
     * @param customHostname the customHostname value to set.
     * @return the UrlRedirectActionParameters object itself.
     */
    public UrlRedirectActionParameters withCustomHostname(String customHostname) {
        this.customHostname = customHostname;
        return this;
    }

    /**
     * Get the customQueryString property: The set of query strings to be placed in the redirect URL. Setting this value
     * would replace any existing query string; leave empty to preserve the incoming query string. Query string must be
     * in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
     *
     * @return the customQueryString value.
     */
    public String customQueryString() {
        return this.customQueryString;
    }

    /**
     * Set the customQueryString property: The set of query strings to be placed in the redirect URL. Setting this value
     * would replace any existing query string; leave empty to preserve the incoming query string. Query string must be
     * in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
     *
     * @param customQueryString the customQueryString value to set.
     * @return the UrlRedirectActionParameters object itself.
     */
    public UrlRedirectActionParameters withCustomQueryString(String customQueryString) {
        this.customQueryString = customQueryString;
        return this;
    }

    /**
     * Get the customFragment property: Fragment to add to the redirect URL. Fragment is the part of the URL that comes
     * after #. Do not include the #.
     *
     * @return the customFragment value.
     */
    public String customFragment() {
        return this.customFragment;
    }

    /**
     * Set the customFragment property: Fragment to add to the redirect URL. Fragment is the part of the URL that comes
     * after #. Do not include the #.
     *
     * @param customFragment the customFragment value to set.
     * @return the UrlRedirectActionParameters object itself.
     */
    public UrlRedirectActionParameters withCustomFragment(String customFragment) {
        this.customFragment = customFragment;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (redirectType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property redirectType in model UrlRedirectActionParameters"));
        }
    }
}
