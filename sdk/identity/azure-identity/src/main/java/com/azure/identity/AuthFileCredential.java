// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.annotation.Immutable;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.identity.implementation.IdentityClientOptions;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.InvalidPathException;
import java.util.Map;
import java.util.Objects;

/**
 * Enables authentication to Azure Active Directory using configuration
 * information stored Azure SDK Auth File.
 *
 * An Azaure SDK Auth file may be generated by passing <code>--sdk-auth</code>
 * when generating an service principal with
 * <code>az ad sp create-for-rbac</code>. At this time
 * <see cref="AuthFileCredential"/> only supports SDK Auth Files which contain a
 * client secret, client certificates are not supported at this time.
 */
@Immutable
public class AuthFileCredential implements TokenCredential {
    /* The file path value. */
    private static final ClientLogger logger = new ClientLogger(AuthFileCredential.class);
    private static final  SerializerAdapter SERIALIZER_ADAPTER = JacksonAdapter.createDefaultSerializerAdapter();
    private static final String CLIENT_ID = "clientId";
    private static final String CLIENT_SECRET = "clientSecret";
    private static final String TENANT_ID    = "tenantId";
    private final String filepath;
    private IdentityClientOptions identityClientOptions;
    private TokenCredential credential;
    
    /**
     * Creates an instance of the SdkAuthFileCredential class based on information
     * in given SDK Auth file. If the file is not found or there are errors parsing
     * it, <see cref="GetToken(TokenRequestContext)"/> and
     * <see cref="GetToken(TokenRequestContext)"/> will throw a
     * <see cref="Exception"/> with details on why the file could not be used.
     *
     * @param filepath              The path to the SDK Auth file.
     * @param identityClientOptions the options for configuring the identity client
     */
    AuthFileCredential(String filepath, IdentityClientOptions identityClientOptions) {
        Objects.requireNonNull(filepath, "'filepath' cannot be null.");
        Objects.requireNonNull(identityClientOptions, "'identityClientOptions' cannot be null.");
        this.filepath = filepath;
        this.identityClientOptions = identityClientOptions;
    }

    /**
     * Obtains a token from the Azure Active Directory service, using the specified
     * client detailed specified in the SDK Auth file. This method is called by
     * Azure SDK clients. It isn't intended for use in application code. If the SDK
     * Auth file is missing or invalid, this method throws a
     * <see cref="RuntimeException"/> exception.
     * <param name="requestContext">The details of the authentication
     * request</param> <returns>An <see cref="AccessToken"/> which can be used to
     * authenticate service client calls.</returns>
     */
    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        try {
            ensureCredential();
        } catch (Exception e) {
            return Mono.error(e);
        }
        return credential.getToken(request);
    }

    /**
     * Ensures that credential information is loaded from the SDK Auth file. This
     * method should be called to initialize <code>_credential</code> before it is
     * used. If the SDK Auth file is not found or invalid, this method will throw
     * <see cref="RuntimeException"/>. <returns>A method that will
     * ensure <code>credential</code> has been initialized</returns>
     */
    void ensureCredential() {
        if (credential == null) {
            try {  
                credential = buildCredentialForCredentialsFile(parseCredentialsFile(filepath));
            } catch (Exception e) {
                throw logger.logExceptionAsError(new RuntimeException("Error parsing SDK Auth File", e));
            }
        }
    }

    private static Map<String, String> parseCredentialsFile(String filePath) throws IOException 
    {
        FileInputStream inputStream=null;
        File file = new File(filePath);
        if (!file.exists()) {
            throw logger.logExceptionAsError(new InvalidPathException(filePath,"Auth File doesn't exist"));
        }
        try {
            inputStream = new FileInputStream(file);
            int length = inputStream.available();
            byte bytes[] = new byte[length];
            inputStream.read(bytes);
            String result = new String(bytes, StandardCharsets.UTF_8);
            return SERIALIZER_ADAPTER.deserialize(result,Map.class , SerializerEncoding.JSON);
        } catch (IOException e) {
            throw logger.logExceptionAsError(new IllegalStateException(e));
        }finally{
            inputStream.close();
        }
    }

    private  TokenCredential buildCredentialForCredentialsFile(Map<String, String> authData) 
    {
        String clientId = authData.get(CLIENT_ID);
        String clientSecret = authData.get(CLIENT_SECRET);
        String tenantId = authData.get(TENANT_ID);
        String activeDirectoryEndpointUrl = authData.get("activeDirectoryEndpointUrl");

        if (clientId == null || clientSecret == null || tenantId == null || activeDirectoryEndpointUrl == null)
        {
            throw logger.logExceptionAsError(new ClientAuthenticationException("Malformed Azure SDK Auth file. The file should contain 'clientId', 'clientSecret', 'tenantId' and 'activeDirectoryEndpointUrl' values.",null));
        }

        return new ClientSecretCredential(tenantId, clientId, clientSecret, identityClientOptions.setAuthorityHost(activeDirectoryEndpointUrl));
    }
}
