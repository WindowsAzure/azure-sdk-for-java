// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.identity;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.ClientCertificateCredentialBuilder;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.identity.CredentialUnavailableException;
import com.azure.identity.UsernamePasswordCredentialBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import reactor.core.publisher.Mono;

/**
 * A credential provider that provides token credentials based on {@link Environment}. The
 * environment variables expected are:
 * <ul>
 *     <li>azure.credential.tenant-id</li>
 *     <li>azure.credential.client-id</li>
 *     <li>azure.credential.client-secret</li>
 * </ul>
 * or:
 * <ul>
 *     <li>azure.credential.tenant-id</li>
 *     <li>azure.credential.client-id</li>
 *     <li>azure.credential.client-certificate-path</li>
 * </ul>
 * or:
 * <ul>
 *     <li>azure.credential.tenant-id</li>
 *     <li>azure.credential.client-id</li>
 *     <li>azure.credential.username</li>
 *     <li>azure.credential.password</li>
 * </ul>
 */
public class SpringEnvironmentCredential implements TokenCredential {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringEnvironmentCredential.class);
    private final AzureEnvironment azureEnvironment;
    private final TokenCredential tokenCredential;

    SpringEnvironmentCredential(Environment environment) {
        this.azureEnvironment = new AzureEnvironment(environment);
        this.tokenCredential = populateTokenCredential();
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        if (tokenCredential == null) {
            return Mono.error(() -> {
                                  final CredentialUnavailableException exception = new CredentialUnavailableException(
                                      "SpringEnvironmentCredential authentication unavailable. Environment variables "
                                          + "are not fully configured.");
                                  LOGGER.error(exception.getMessage(), exception);
                                  return exception;
                              }
            );
        } else {
            return tokenCredential.getToken(request);
        }
    }

    private TokenCredential populateTokenCredential() {
        String tenantId = azureEnvironment.getTenantId();
        String clientId = azureEnvironment.getClientId();
        String clientSecret = azureEnvironment.getClientSecret();

        if (tenantId != null && clientId != null && clientSecret != null) {
            return new ClientSecretCredentialBuilder().tenantId(tenantId)
                                                      .clientId(clientId)
                                                      .clientSecret(clientSecret)
                                                      .build();
        }

        String certPath = azureEnvironment.getClientCertificatePath();

        if (tenantId != null && clientId != null && certPath != null) {
            return new ClientCertificateCredentialBuilder().tenantId(tenantId)
                                                           .clientId(clientId)
                                                           .pemCertificate(certPath)
                                                           .build();
        }

        String username = azureEnvironment.getUsername();
        String password = azureEnvironment.getPassword();

        if (clientId != null && username != null && password != null) {// tenant-id is not required
            return new UsernamePasswordCredentialBuilder().tenantId(tenantId)
                                                          .clientId(clientId)
                                                          .username(username)
                                                          .password(password)
                                                          .build();
        }

        return null;
    }

}
