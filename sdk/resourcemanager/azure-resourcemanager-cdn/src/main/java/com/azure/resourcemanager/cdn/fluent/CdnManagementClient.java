// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.cdn.fluent.inner.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.fluent.inner.ValidateProbeOutputInner;
import com.azure.resourcemanager.cdn.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.cdn.models.ValidateProbeInput;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the CdnManagementClient type. */
@ServiceClient(builder = CdnManagementClientBuilder.class)
public final class CdnManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(CdnManagementClient.class);

    /** The proxy service used to perform REST calls. */
    private final CdnManagementClientService service;

    /** Azure Subscription ID. */
    private final String subscriptionId;

    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The ProfilesClient object to access its operations. */
    private final ProfilesClient profiles;

    /**
     * Gets the ProfilesClient object to access its operations.
     *
     * @return the ProfilesClient object.
     */
    public ProfilesClient getProfiles() {
        return this.profiles;
    }

    /** The EndpointsClient object to access its operations. */
    private final EndpointsClient endpoints;

    /**
     * Gets the EndpointsClient object to access its operations.
     *
     * @return the EndpointsClient object.
     */
    public EndpointsClient getEndpoints() {
        return this.endpoints;
    }

    /** The OriginsClient object to access its operations. */
    private final OriginsClient origins;

    /**
     * Gets the OriginsClient object to access its operations.
     *
     * @return the OriginsClient object.
     */
    public OriginsClient getOrigins() {
        return this.origins;
    }

    /** The CustomDomainsClient object to access its operations. */
    private final CustomDomainsClient customDomains;

    /**
     * Gets the CustomDomainsClient object to access its operations.
     *
     * @return the CustomDomainsClient object.
     */
    public CustomDomainsClient getCustomDomains() {
        return this.customDomains;
    }

    /** The ResourceUsagesClient object to access its operations. */
    private final ResourceUsagesClient resourceUsages;

    /**
     * Gets the ResourceUsagesClient object to access its operations.
     *
     * @return the ResourceUsagesClient object.
     */
    public ResourceUsagesClient getResourceUsages() {
        return this.resourceUsages;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The EdgeNodesClient object to access its operations. */
    private final EdgeNodesClient edgeNodes;

    /**
     * Gets the EdgeNodesClient object to access its operations.
     *
     * @return the EdgeNodesClient object.
     */
    public EdgeNodesClient getEdgeNodes() {
        return this.edgeNodes;
    }

    /**
     * Initializes an instance of CdnManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     */
    CdnManagementClient(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2017-10-12";
        this.profiles = new ProfilesClient(this);
        this.endpoints = new EndpointsClient(this);
        this.origins = new OriginsClient(this);
        this.customDomains = new CustomDomainsClient(this);
        this.resourceUsages = new ResourceUsagesClient(this);
        this.operations = new OperationsClient(this);
        this.edgeNodes = new EdgeNodesClient(this);
        this.service =
            RestProxy.create(CdnManagementClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for CdnManagementClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CdnManagementClient")
    private interface CdnManagementClientService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post("/providers/Microsoft.Cdn/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityInput checkNameAvailabilityInput,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Cdn/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithSubscription(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityInput checkNameAvailabilityInput,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Cdn/validateProbe")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ValidateProbeOutputInner>> validateProbe(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ValidateProbeInput validateProbeInput,
            Context context);
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithResponseAsync(String name) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        CheckNameAvailabilityInput checkNameAvailabilityInput = new CheckNameAvailabilityInput();
        checkNameAvailabilityInput.withName(name);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.getEndpoint(), this.getApiVersion(), checkNameAvailabilityInput, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.getContext())));
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithResponseAsync(
        String name, Context context) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        CheckNameAvailabilityInput checkNameAvailabilityInput = new CheckNameAvailabilityInput();
        checkNameAvailabilityInput.withName(name);
        context = this.mergeContext(context);
        return service
            .checkNameAvailability(this.getEndpoint(), this.getApiVersion(), checkNameAvailabilityInput, context);
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckNameAvailabilityOutputInner> checkNameAvailabilityAsync(String name) {
        return checkNameAvailabilityWithResponseAsync(name)
            .flatMap(
                (Response<CheckNameAvailabilityOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckNameAvailabilityOutputInner> checkNameAvailabilityAsync(String name, Context context) {
        return checkNameAvailabilityWithResponseAsync(name, context)
            .flatMap(
                (Response<CheckNameAvailabilityOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityOutputInner checkNameAvailability(String name) {
        return checkNameAvailabilityAsync(name).block();
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityOutputInner checkNameAvailability(String name, Context context) {
        return checkNameAvailabilityAsync(name, context).block();
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithSubscriptionWithResponseAsync(
        String name) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        CheckNameAvailabilityInput checkNameAvailabilityInput = new CheckNameAvailabilityInput();
        checkNameAvailabilityInput.withName(name);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailabilityWithSubscription(
                            this.getEndpoint(),
                            this.getSubscriptionId(),
                            this.getApiVersion(),
                            checkNameAvailabilityInput,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.getContext())));
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithSubscriptionWithResponseAsync(
        String name, Context context) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        CheckNameAvailabilityInput checkNameAvailabilityInput = new CheckNameAvailabilityInput();
        checkNameAvailabilityInput.withName(name);
        context = this.mergeContext(context);
        return service
            .checkNameAvailabilityWithSubscription(
                this.getEndpoint(),
                this.getSubscriptionId(),
                this.getApiVersion(),
                checkNameAvailabilityInput,
                context);
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionAsync(String name) {
        return checkNameAvailabilityWithSubscriptionWithResponseAsync(name)
            .flatMap(
                (Response<CheckNameAvailabilityOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionAsync(
        String name, Context context) {
        return checkNameAvailabilityWithSubscriptionWithResponseAsync(name, context)
            .flatMap(
                (Response<CheckNameAvailabilityOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityOutputInner checkNameAvailabilityWithSubscription(String name) {
        return checkNameAvailabilityWithSubscriptionAsync(name).block();
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a
     * CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityOutputInner checkNameAvailabilityWithSubscription(String name, Context context) {
        return checkNameAvailabilityWithSubscriptionAsync(name, context).block();
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param probeUrl The probe URL to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ValidateProbeOutputInner>> validateProbeWithResponseAsync(String probeUrl) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (probeUrl == null) {
            return Mono.error(new IllegalArgumentException("Parameter probeUrl is required and cannot be null."));
        }
        ValidateProbeInput validateProbeInput = new ValidateProbeInput();
        validateProbeInput.withProbeUrl(probeUrl);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .validateProbe(
                            this.getEndpoint(),
                            this.getSubscriptionId(),
                            this.getApiVersion(),
                            validateProbeInput,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.getContext())));
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param probeUrl The probe URL to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ValidateProbeOutputInner>> validateProbeWithResponseAsync(String probeUrl, Context context) {
        if (this.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.getEndpoint() is required and cannot be null."));
        }
        if (this.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
        }
        if (probeUrl == null) {
            return Mono.error(new IllegalArgumentException("Parameter probeUrl is required and cannot be null."));
        }
        ValidateProbeInput validateProbeInput = new ValidateProbeInput();
        validateProbeInput.withProbeUrl(probeUrl);
        context = this.mergeContext(context);
        return service
            .validateProbe(
                this.getEndpoint(), this.getSubscriptionId(), this.getApiVersion(), validateProbeInput, context);
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param probeUrl The probe URL to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ValidateProbeOutputInner> validateProbeAsync(String probeUrl) {
        return validateProbeWithResponseAsync(probeUrl)
            .flatMap(
                (Response<ValidateProbeOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param probeUrl The probe URL to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ValidateProbeOutputInner> validateProbeAsync(String probeUrl, Context context) {
        return validateProbeWithResponseAsync(probeUrl, context)
            .flatMap(
                (Response<ValidateProbeOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param probeUrl The probe URL to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ValidateProbeOutputInner validateProbe(String probeUrl) {
        return validateProbeAsync(probeUrl).block();
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on
     * the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative
     * to the origin path specified in the endpoint configuration.
     *
     * @param probeUrl The probe URL to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validate probe API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ValidateProbeOutputInner validateProbe(String probeUrl, Context context) {
        return validateProbeAsync(probeUrl, context).block();
    }
}
