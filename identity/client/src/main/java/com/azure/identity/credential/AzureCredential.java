package com.azure.identity.credential;

import com.azure.core.credentials.TokenCredential;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.TokenCredentialPolicy;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * The base class for a token credential to be used in an Azure client library.
 */
public abstract class AzureCredential extends TokenCredential {

    /**
     * The default AzureCredential instance to use. This will use AZURE_CLIENT_ID,
     * AZURE_CLIENT_SECRET, and AZURE_TENANT_ID environment variables to create a
     * ClientSecretCredential.
     */
    public static final AzureCredential DEFAULT = createDefault();

    /**
     * Creates a default AzureCredential with Bearer token scheme.
     */
    protected AzureCredential() {
        super();
    }

    /**
     * Creates an AzureCredential with the given token scheme.
     * @param scheme the token scheme
     */
    protected AzureCredential(String scheme) {
        super(scheme);
    }

    private static AzureCredential createDefault() {
        EnvironmentCredential provider = new EnvironmentCredential();
        return new AzureCredential() {
            @Override
            public Mono<String> getTokenAsync(String resource) {
                return provider.getTokenAsync(resource);
            }
        };
    }

    /**
     * Creates a list of HttpPipelinePolicy that's capable of authenticating an HTTP request
     * with this credential.
     * @return the list of HttpPipelinePolicy.
     */
    public List<HttpPipelinePolicy> createDefaultPipelinePolicies() {
        return Arrays.asList(new TokenCredentialPolicy(this));
    }
}
