// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.GroupsCalendarsClient;
import com.azure.resourcemanager.authorization.fluent.models.GroupsCalendarGetScheduleRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphCalendarRoleType;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphScheduleInformationInner;
import com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GroupsCalendarsClient. */
public final class GroupsCalendarsClientImpl implements GroupsCalendarsClient {
    private final ClientLogger logger = new ClientLogger(GroupsCalendarsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GroupsCalendarsService service;

    /** The service client containing this operation class. */
    private final MicrosoftGraphClientImpl client;

    /**
     * Initializes an instance of GroupsCalendarsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GroupsCalendarsClientImpl(MicrosoftGraphClientImpl client) {
        this.service =
            RestProxy.create(GroupsCalendarsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftGraphClientGroupsCalendars to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftGraphClient")
    private interface GroupsCalendarsService {
        @Headers({"Content-Type: application/json"})
        @Get("/groups/{group-id}/calendar/microsoft.graph.allowedCalendarSharingRoles(User='{User}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<List<MicrosoftGraphCalendarRoleType>>> allowedCalendarSharingRoles(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("User") String user,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/groups/{group-id}/calendar/microsoft.graph.getSchedule")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<List<MicrosoftGraphScheduleInformationInner>>> getSchedule(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @BodyParam("application/json") GroupsCalendarGetScheduleRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Invoke function allowedCalendarSharingRoles.
     *
     * @param groupId key: id of group.
     * @param user The user parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of MicrosoftGraphCalendarRoleType.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<MicrosoftGraphCalendarRoleType>>> allowedCalendarSharingRolesWithResponseAsync(
        String groupId, String user) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (user == null) {
            return Mono.error(new IllegalArgumentException("Parameter user is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service.allowedCalendarSharingRoles(this.client.getEndpoint(), groupId, user, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke function allowedCalendarSharingRoles.
     *
     * @param groupId key: id of group.
     * @param user The user parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of MicrosoftGraphCalendarRoleType.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<MicrosoftGraphCalendarRoleType>>> allowedCalendarSharingRolesWithResponseAsync(
        String groupId, String user, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (user == null) {
            return Mono.error(new IllegalArgumentException("Parameter user is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.allowedCalendarSharingRoles(this.client.getEndpoint(), groupId, user, accept, context);
    }

    /**
     * Invoke function allowedCalendarSharingRoles.
     *
     * @param groupId key: id of group.
     * @param user The user parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of MicrosoftGraphCalendarRoleType.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<MicrosoftGraphCalendarRoleType>> allowedCalendarSharingRolesAsync(String groupId, String user) {
        return allowedCalendarSharingRolesWithResponseAsync(groupId, user)
            .flatMap(
                (Response<List<MicrosoftGraphCalendarRoleType>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Invoke function allowedCalendarSharingRoles.
     *
     * @param groupId key: id of group.
     * @param user The user parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of MicrosoftGraphCalendarRoleType.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<MicrosoftGraphCalendarRoleType> allowedCalendarSharingRoles(String groupId, String user) {
        return allowedCalendarSharingRolesAsync(groupId, user).block();
    }

    /**
     * Invoke function allowedCalendarSharingRoles.
     *
     * @param groupId key: id of group.
     * @param user The user parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of MicrosoftGraphCalendarRoleType.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<MicrosoftGraphCalendarRoleType>> allowedCalendarSharingRolesWithResponse(
        String groupId, String user, Context context) {
        return allowedCalendarSharingRolesWithResponseAsync(groupId, user, context).block();
    }

    /**
     * Invoke action getSchedule.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<MicrosoftGraphScheduleInformationInner>>> getScheduleWithResponseAsync(
        String groupId, GroupsCalendarGetScheduleRequestBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.getSchedule(this.client.getEndpoint(), groupId, body, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action getSchedule.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<MicrosoftGraphScheduleInformationInner>>> getScheduleWithResponseAsync(
        String groupId, GroupsCalendarGetScheduleRequestBody body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getSchedule(this.client.getEndpoint(), groupId, body, accept, context);
    }

    /**
     * Invoke action getSchedule.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<MicrosoftGraphScheduleInformationInner>> getScheduleAsync(
        String groupId, GroupsCalendarGetScheduleRequestBody body) {
        return getScheduleWithResponseAsync(groupId, body)
            .flatMap(
                (Response<List<MicrosoftGraphScheduleInformationInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Invoke action getSchedule.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<MicrosoftGraphScheduleInformationInner> getSchedule(
        String groupId, GroupsCalendarGetScheduleRequestBody body) {
        return getScheduleAsync(groupId, body).block();
    }

    /**
     * Invoke action getSchedule.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<MicrosoftGraphScheduleInformationInner>> getScheduleWithResponse(
        String groupId, GroupsCalendarGetScheduleRequestBody body, Context context) {
        return getScheduleWithResponseAsync(groupId, body, context).block();
    }
}
