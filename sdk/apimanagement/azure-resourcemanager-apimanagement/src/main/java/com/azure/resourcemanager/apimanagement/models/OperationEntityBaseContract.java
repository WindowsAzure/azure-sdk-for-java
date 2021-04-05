// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Api Operation Entity Base Contract details. */
@Fluent
public class OperationEntityBaseContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationEntityBaseContract.class);

    /*
     * Collection of URL template parameters.
     */
    @JsonProperty(value = "templateParameters")
    private List<ParameterContract> templateParameters;

    /*
     * Description of the operation. May include HTML formatting tags.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * An entity containing request details.
     */
    @JsonProperty(value = "request")
    private RequestContract request;

    /*
     * Array of Operation responses.
     */
    @JsonProperty(value = "responses")
    private List<ResponseContract> responses;

    /*
     * Operation Policies
     */
    @JsonProperty(value = "policies")
    private String policies;

    /**
     * Get the templateParameters property: Collection of URL template parameters.
     *
     * @return the templateParameters value.
     */
    public List<ParameterContract> templateParameters() {
        return this.templateParameters;
    }

    /**
     * Set the templateParameters property: Collection of URL template parameters.
     *
     * @param templateParameters the templateParameters value to set.
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withTemplateParameters(List<ParameterContract> templateParameters) {
        this.templateParameters = templateParameters;
        return this;
    }

    /**
     * Get the description property: Description of the operation. May include HTML formatting tags.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the operation. May include HTML formatting tags.
     *
     * @param description the description value to set.
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the request property: An entity containing request details.
     *
     * @return the request value.
     */
    public RequestContract request() {
        return this.request;
    }

    /**
     * Set the request property: An entity containing request details.
     *
     * @param request the request value to set.
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withRequest(RequestContract request) {
        this.request = request;
        return this;
    }

    /**
     * Get the responses property: Array of Operation responses.
     *
     * @return the responses value.
     */
    public List<ResponseContract> responses() {
        return this.responses;
    }

    /**
     * Set the responses property: Array of Operation responses.
     *
     * @param responses the responses value to set.
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withResponses(List<ResponseContract> responses) {
        this.responses = responses;
        return this;
    }

    /**
     * Get the policies property: Operation Policies.
     *
     * @return the policies value.
     */
    public String policies() {
        return this.policies;
    }

    /**
     * Set the policies property: Operation Policies.
     *
     * @param policies the policies value to set.
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withPolicies(String policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (templateParameters() != null) {
            templateParameters().forEach(e -> e.validate());
        }
        if (request() != null) {
            request().validate();
        }
        if (responses() != null) {
            responses().forEach(e -> e.validate());
        }
    }
}
