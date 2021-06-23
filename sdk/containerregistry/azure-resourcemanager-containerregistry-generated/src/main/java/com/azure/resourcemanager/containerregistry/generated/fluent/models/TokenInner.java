// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCredentialsProperties;
import com.azure.resourcemanager.containerregistry.generated.models.TokenStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An object that represents a token for a container registry. */
@JsonFlatten
@Fluent
public class TokenInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TokenInner.class);

    /*
     * The creation date of scope map.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The resource ID of the scope map to which the token will be associated
     * with.
     */
    @JsonProperty(value = "properties.scopeMapId")
    private String scopeMapId;

    /*
     * The credentials that can be used for authenticating the token.
     */
    @JsonProperty(value = "properties.credentials")
    private TokenCredentialsProperties credentials;

    /*
     * The status of the token example enabled or disabled.
     */
    @JsonProperty(value = "properties.status")
    private TokenStatus status;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the creationDate property: The creation date of scope map.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the scopeMapId property: The resource ID of the scope map to which the token will be associated with.
     *
     * @return the scopeMapId value.
     */
    public String scopeMapId() {
        return this.scopeMapId;
    }

    /**
     * Set the scopeMapId property: The resource ID of the scope map to which the token will be associated with.
     *
     * @param scopeMapId the scopeMapId value to set.
     * @return the TokenInner object itself.
     */
    public TokenInner withScopeMapId(String scopeMapId) {
        this.scopeMapId = scopeMapId;
        return this;
    }

    /**
     * Get the credentials property: The credentials that can be used for authenticating the token.
     *
     * @return the credentials value.
     */
    public TokenCredentialsProperties credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The credentials that can be used for authenticating the token.
     *
     * @param credentials the credentials value to set.
     * @return the TokenInner object itself.
     */
    public TokenInner withCredentials(TokenCredentialsProperties credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the status property: The status of the token example enabled or disabled.
     *
     * @return the status value.
     */
    public TokenStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the token example enabled or disabled.
     *
     * @param status the status value to set.
     * @return the TokenInner object itself.
     */
    public TokenInner withStatus(TokenStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
