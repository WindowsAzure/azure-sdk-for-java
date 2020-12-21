// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.FeatureSupportsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AzureVMResourceFeatureSupportResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.FeatureSupportRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FeatureSupportsClient. */
public final class FeatureSupportsClientImpl implements FeatureSupportsClient {
    private final ClientLogger logger = new ClientLogger(FeatureSupportsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final FeatureSupportsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of FeatureSupportsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FeatureSupportsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy.create(FeatureSupportsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientFeatureSupports to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface FeatureSupportsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/Subscriptions/{subscriptionId}/providers/Microsoft.RecoveryServices/locations/{azureRegion}"
                + "/backupValidateFeatures")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AzureVMResourceFeatureSupportResponseInner>> validate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("azureRegion") String azureRegion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") FeatureSupportRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * It will validate if given feature with resource properties is supported in service.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Feature support request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for feature support requests for Azure IaasVm.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AzureVMResourceFeatureSupportResponseInner>> validateWithResponseAsync(
        String azureRegion, FeatureSupportRequest parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (azureRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter azureRegion is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-07-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .validate(
                            this.client.getEndpoint(),
                            apiVersion,
                            azureRegion,
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * It will validate if given feature with resource properties is supported in service.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Feature support request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for feature support requests for Azure IaasVm.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AzureVMResourceFeatureSupportResponseInner>> validateWithResponseAsync(
        String azureRegion, FeatureSupportRequest parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (azureRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter azureRegion is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2017-07-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .validate(
                this.client.getEndpoint(),
                apiVersion,
                azureRegion,
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * It will validate if given feature with resource properties is supported in service.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Feature support request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for feature support requests for Azure IaasVm.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AzureVMResourceFeatureSupportResponseInner> validateAsync(
        String azureRegion, FeatureSupportRequest parameters) {
        return validateWithResponseAsync(azureRegion, parameters)
            .flatMap(
                (Response<AzureVMResourceFeatureSupportResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * It will validate if given feature with resource properties is supported in service.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Feature support request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for feature support requests for Azure IaasVm.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AzureVMResourceFeatureSupportResponseInner validate(String azureRegion, FeatureSupportRequest parameters) {
        return validateAsync(azureRegion, parameters).block();
    }

    /**
     * It will validate if given feature with resource properties is supported in service.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Feature support request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for feature support requests for Azure IaasVm.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AzureVMResourceFeatureSupportResponseInner> validateWithResponse(
        String azureRegion, FeatureSupportRequest parameters, Context context) {
        return validateWithResponseAsync(azureRegion, parameters, context).block();
    }
}
