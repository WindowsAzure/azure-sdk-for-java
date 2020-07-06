package com.azure.messaging.eventgrid.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.messaging.eventgrid.EventGridClient;
import com.azure.messaging.eventgrid.models.CloudEvent;
import com.azure.messaging.eventgrid.models.EventGridEvent;

import java.util.List;

import reactor.core.publisher.Mono;

/** Initializes a new instance of the EventGridClient type. */
public final class EventGridClientImpl implements EventGridClient {
    /** The proxy service used to perform REST calls. */
    private final EventGridClientService service;

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** Initializes an instance of EventGridClient client. */
    EventGridClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build());
    }

    /**
     * Initializes an instance of EventGridClient client.
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    EventGridClientImpl(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.apiVersion = "2018-01-01";
        this.service = RestProxy.create(EventGridClientService.class, this.httpPipeline);
    }

    /**
     * The interface defining all the services for EventGridClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("https://{topicHostname}")
    @ServiceInterface(name = "EventGridClient")
    private interface EventGridClientService {
        @Post("/api/events")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> publishEvents(
            @HostParam("topicHostname") String topicHostname,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") List<EventGridEvent> events);

        @Post("/api/events")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> publishCloudEventEvents(
            @HostParam("topicHostname") String topicHostname,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") List<CloudEvent> events);

        @Post("/api/events")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> publishCustomEventEvents(
            @HostParam("topicHostname") String topicHostname,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") List<Object> events);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     * @param topicHostname simple string.
     * @param events        Array of EventGridEvent.
     *
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException    thrown if the request is rejected by server.
     * @throws RuntimeException         all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishEventsWithResponseAsync(String topicHostname, List<EventGridEvent> events) {
        return service.publishEvents(topicHostname, this.getApiVersion(), events);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     * @param topicHostname simple string.
     * @param events        Array of EventGridEvent.
     *
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException    thrown if the request is rejected by server.
     * @throws RuntimeException         all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishEventsAsync(String topicHostname, List<EventGridEvent> events) {
        return publishEventsWithResponseAsync(topicHostname, events).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     * @param topicHostname simple string.
     * @param events        Array of CloudEventEvent.
     *
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException    thrown if the request is rejected by server.
     * @throws RuntimeException         all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishCloudEventEventsWithResponseAsync(
        String topicHostname, List<CloudEvent> events) {
        return service.publishCloudEventEvents(topicHostname, this.getApiVersion(), events);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     * @param topicHostname simple string.
     * @param events        Array of CloudEventEvent.
     *
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException    thrown if the request is rejected by server.
     * @throws RuntimeException         all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishCloudEventEventsAsync(String topicHostname, List<CloudEvent> events) {
        return publishCloudEventEventsWithResponseAsync(topicHostname, events)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     * @param topicHostname simple string.
     * @param events        Array of any.
     *
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException    thrown if the request is rejected by server.
     * @throws RuntimeException         all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishCustomEventEventsWithResponseAsync(String topicHostname, List<Object> events) {
        return service.publishCustomEventEvents(topicHostname, this.getApiVersion(), events);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     * @param topicHostname simple string.
     * @param events        Array of any.
     *
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException    thrown if the request is rejected by server.
     * @throws RuntimeException         all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishCustomEventEventsAsync(String topicHostname, List<Object> events) {
        return publishCustomEventEventsWithResponseAsync(topicHostname, events)
            .flatMap((Response<Void> res) -> Mono.empty());
    }
}
