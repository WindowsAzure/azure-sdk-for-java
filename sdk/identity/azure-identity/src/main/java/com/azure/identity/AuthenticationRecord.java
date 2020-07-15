// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Represents the account information relating to an authentication request
 */
public class AuthenticationRecord {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @JsonProperty("authority")
    private String authority;

    @JsonProperty("homeAccountId")
    private String homeAccountId;

    @JsonProperty("tenantId")
    private String tenantId;

    @JsonProperty("username")
    private String username;


    AuthenticationRecord() { }

    AuthenticationRecord(IAuthenticationResult authenticationResult, String tenantId) {
        authority = authenticationResult.account().environment();
        homeAccountId = authenticationResult.account().homeAccountId();
        username = authenticationResult.account().username();
        this.tenantId = tenantId;
    }

    /**
     * Get the authority host used to authenticate the account.
     *
     * @return the authority host.
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Get the unique identifier of the account.
     *
     * @return the account id.
     */
    public String getHomeAccountId() {
        return homeAccountId;
    }

    /**
     * Get the tenant, which the account authenticated in.
     *
     * @return the tenant id.
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Get the user principal name of the account.
     *
     * @return the username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Serializes the {@link AuthenticationRecord} to the specified {@link OutputStream}
     *
     * @param outputStream The {@link OutputStream} to which the serialized record will be written to.
     * @return A {@link Mono} containing {@link Void}
     */
    public Mono<OutputStream> serialize(OutputStream outputStream) {
        return Mono.defer(() -> {
            try {
                OBJECT_MAPPER.writeValue(outputStream, this);
            } catch (IOException e) {
                return Mono.error(e);
            }
            return Mono.just(outputStream);
        });
    }

    /**
     * Deserializes the {@link AuthenticationRecord} from the specified {@link InputStream}
     *
     * @param inputStream The {@link InputStream} from which the serialized record will be read.
     * @return A {@link Mono} containing the {@link AuthenticationRecord} object.
     */
    public static Mono<AuthenticationRecord> deserialize(InputStream inputStream) {
        return Mono.defer(() -> {
            AuthenticationRecord authenticationRecord;
            try {
                authenticationRecord =
                    OBJECT_MAPPER.readValue(inputStream, AuthenticationRecord.class);
            } catch (IOException e) {
                return Mono.error(e);
            }
            return Mono.just(authenticationRecord);
        });
    }
}
