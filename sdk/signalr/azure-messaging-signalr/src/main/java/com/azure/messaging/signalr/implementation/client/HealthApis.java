package com.azure.messaging.signalr.implementation.client;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * HealthApis.
 */
public final class HealthApis {
    /**
     * The proxy service used to perform REST calls.
     */
    private HealthApisService service;

    /**
     * The service client containing this operation class.
     */
    private AzureWebSocketServiceRestAPI client;

    /**
     * Initializes an instance of HealthApis.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    HealthApis(AzureWebSocketServiceRestAPI client) {
        this.service = RestProxy.create(HealthApisService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * AzureWebSocketServiceRestAPIHealthApis to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureWebSocketServiceRestAPIHealthApis")
    private interface HealthApisService {
        @Head("/api/v1/health")
        @ExpectedResponses({200, 503})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> getHealth(@HostParam("$host") String host, Context context);
    }

    /**
     * Get service health status.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getHealthWithResponseAsync() {
        if (this.client.getHost() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return FluxUtil.withContext(context -> service.getHealth(this.client.getHost(), context));
    }

    /**
     * Get service health status.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> getHealthWithResponseAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        return service.getHealth(this.client.getHost(), context);
    }

    /**
     * Get service health status.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> getHealthAsync() {
        return getHealthWithResponseAsync()
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Get service health status.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void getHealth() {
        getHealthAsync().block();
    }
}
