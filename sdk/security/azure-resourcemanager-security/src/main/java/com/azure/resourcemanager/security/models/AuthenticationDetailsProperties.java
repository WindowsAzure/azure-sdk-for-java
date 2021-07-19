// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Settings for cloud authentication management. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "authenticationType",
    defaultImpl = AuthenticationDetailsProperties.class)
@JsonTypeName("AuthenticationDetailsProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "awsCreds", value = AwsCredsAuthenticationDetailsProperties.class),
    @JsonSubTypes.Type(name = "awsAssumeRole", value = AwAssumeRoleAuthenticationDetailsProperties.class),
    @JsonSubTypes.Type(name = "gcpCredentials", value = GcpCredentialsDetailsProperties.class)
})
@Immutable
public class AuthenticationDetailsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AuthenticationDetailsProperties.class);

    /*
     * State of the multi-cloud connector
     */
    @JsonProperty(value = "authenticationProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AuthenticationProvisioningState authenticationProvisioningState;

    /*
     * The permissions detected in the cloud account.
     */
    @JsonProperty(value = "grantedPermissions", access = JsonProperty.Access.WRITE_ONLY)
    private List<PermissionProperty> grantedPermissions;

    /**
     * Get the authenticationProvisioningState property: State of the multi-cloud connector.
     *
     * @return the authenticationProvisioningState value.
     */
    public AuthenticationProvisioningState authenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }

    /**
     * Get the grantedPermissions property: The permissions detected in the cloud account.
     *
     * @return the grantedPermissions value.
     */
    public List<PermissionProperty> grantedPermissions() {
        return this.grantedPermissions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
