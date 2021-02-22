package com.azure.core.perf;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.experimental.http.policy.BearerTokenAuthenticationChallengePolicy;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.perf.core.MockHttpClient;
import com.azure.core.perf.core.MyRestProxyService;
import com.azure.core.perf.models.MockHttpResponse;
import com.azure.core.util.CoreUtils;
import com.azure.perf.test.core.PerfStressOptions;
import com.azure.perf.test.core.PerfStressTest;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

/**
 * The Performance Test class for Bearer Token Authentication Challenge Policy.
 */
public class BearerTokenAuthenticationChallengePolicyTest extends PerfStressTest<PerfStressOptions> {
    private static final String CLAIMS_ACCESS_TOKEN = "CLAIMS-ACCESS-TOKEN";
    private static final String ACCESS_TOKEN = "ACCESS-TOKEN";
    private static final String AUTHORIZATION = "Authorization";
    private static final String APPLICATION_JSON = "application/json";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final String CAE_SESSIONS_REVOKED_CLAIMS_CHALLENGE = "Bearer authorization_uri="
        + "\"https://login.windows-ppe.net/\", error=\"invalid_token\","
        + " error_description=\"User session has been revoked\","
        + " claims=\"eyJhY2Nlc3NfdG9rZW4iOnsibmJmIjp7ImVzc2VudGlhbCI6dHJ1ZSwgInZhbHVlIjoiMTYwMzc0MjgwMCJ9fX0=\"";

    private final MockHttpClient mockHTTPClient;
    private final MyRestProxyService service;
    private boolean trigger = false;

    /**
     * Creates an instance of the BearerTokenAuthenticationChallengePolicyTest class.
     * @param options the command line options to run the performance test.
     */
    public BearerTokenAuthenticationChallengePolicyTest(PerfStressOptions options) {
        super(options);
        mockHTTPClient = new MockHttpClient((httpRequest) -> {
            String bearerToken = httpRequest.getHeaders().getValue(AUTHORIZATION);
            if (bearerToken.contains(CLAIMS_ACCESS_TOKEN)) {
                return createMockSuccessResponse(httpRequest, APPLICATION_JSON);
            } else {
                return createMockClaimsResponse(httpRequest, "application/json");
            }
        });
        final HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(new BearerTokenAuthenticationChallengePolicy(new TokenCredential() {
                @Override
                public Mono<AccessToken> getToken(TokenRequestContext request) {
                    return Mono.defer(() -> {
                        AccessToken token;
                        if (!CoreUtils.isNullOrEmpty(request.getClaims()) && request.getClaims().length() > 1) {
                            token = new AccessToken(CLAIMS_ACCESS_TOKEN, OffsetDateTime.now().plusDays(1));
                        } else {
                            token = new AccessToken(ACCESS_TOKEN, OffsetDateTime.now().plusDays(1));
                        }
                        return Mono.just(token);
                    });
                }
            }, "Dummy-Scope"))
            .httpClient(mockHTTPClient)
            .build();

        service = RestProxy.create(MyRestProxyService.class, pipeline);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Mono<Void> runAsync() {
        if(!trigger) {
            trigger = true;
            return service.listSubscriptions().then();
        } else {
            return Mono.empty();
        }

    }

    private HttpResponse createMockClaimsResponse(HttpRequest httpRequest, String contentType) {
        HttpHeaders headers = new HttpHeaders().put(CONTENT_TYPE, contentType);
        headers.put(BearerTokenAuthenticationChallengePolicy.WWW_AUTHENTICATE, CAE_SESSIONS_REVOKED_CLAIMS_CHALLENGE);
        HttpResponse res = new MockHttpResponse(httpRequest, 401, headers);
        return res;
    }

    private HttpResponse createMockSuccessResponse(HttpRequest httpRequest, String contentType) {
        HttpHeaders headers = new HttpHeaders().put(CONTENT_TYPE, contentType);
        HttpResponse res = new MockHttpResponse(httpRequest, 200, headers);
        return res;
    }
}
