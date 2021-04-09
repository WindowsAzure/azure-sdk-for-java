// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.models.DeadLetterDestination;
import com.azure.resourcemanager.eventgrid.models.EventDeliverySchema;
import com.azure.resourcemanager.eventgrid.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFilter;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFullUrl;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionProvisioningState;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.RetryPolicy;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class EventSubscriptionImpl
    implements EventSubscription, EventSubscription.Definition, EventSubscription.Update {
    private EventSubscriptionInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String topic() {
        return this.innerModel().topic();
    }

    public EventSubscriptionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public EventSubscriptionDestination destination() {
        return this.innerModel().destination();
    }

    public EventSubscriptionFilter filter() {
        return this.innerModel().filter();
    }

    public List<String> labels() {
        List<String> inner = this.innerModel().labels();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime expirationTimeUtc() {
        return this.innerModel().expirationTimeUtc();
    }

    public EventDeliverySchema eventDeliverySchema() {
        return this.innerModel().eventDeliverySchema();
    }

    public RetryPolicy retryPolicy() {
        return this.innerModel().retryPolicy();
    }

    public DeadLetterDestination deadLetterDestination() {
        return this.innerModel().deadLetterDestination();
    }

    public EventSubscriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String eventSubscriptionName;

    private EventSubscriptionUpdateParameters updateEventSubscriptionUpdateParameters;

    public EventSubscriptionImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public EventSubscription create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventSubscriptions()
                .createOrUpdate(scope, eventSubscriptionName, this.innerModel(), Context.NONE);
        return this;
    }

    public EventSubscription create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventSubscriptions()
                .createOrUpdate(scope, eventSubscriptionName, this.innerModel(), context);
        return this;
    }

    EventSubscriptionImpl(String name, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = new EventSubscriptionInner();
        this.serviceManager = serviceManager;
        this.eventSubscriptionName = name;
    }

    public EventSubscriptionImpl update() {
        this.updateEventSubscriptionUpdateParameters = new EventSubscriptionUpdateParameters();
        return this;
    }

    public EventSubscription apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventSubscriptions()
                .update(scope, eventSubscriptionName, updateEventSubscriptionUpdateParameters, Context.NONE);
        return this;
    }

    public EventSubscription apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventSubscriptions()
                .update(scope, eventSubscriptionName, updateEventSubscriptionUpdateParameters, context);
        return this;
    }

    EventSubscriptionImpl(
        EventSubscriptionInner innerObject, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.scope =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}",
                    "scope");
        this.eventSubscriptionName =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}",
                    "eventSubscriptionName");
    }

    public EventSubscription refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventSubscriptions()
                .getWithResponse(scope, eventSubscriptionName, Context.NONE)
                .getValue();
        return this;
    }

    public EventSubscription refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEventSubscriptions()
                .getWithResponse(scope, eventSubscriptionName, context)
                .getValue();
        return this;
    }

    public EventSubscriptionFullUrl getFullUrl() {
        return serviceManager.eventSubscriptions().getFullUrl(scope, eventSubscriptionName);
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(Context context) {
        return serviceManager.eventSubscriptions().getFullUrlWithResponse(scope, eventSubscriptionName, context);
    }

    public EventSubscriptionImpl withDestination(EventSubscriptionDestination destination) {
        if (isInCreateMode()) {
            this.innerModel().withDestination(destination);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withDestination(destination);
            return this;
        }
    }

    public EventSubscriptionImpl withFilter(EventSubscriptionFilter filter) {
        if (isInCreateMode()) {
            this.innerModel().withFilter(filter);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withFilter(filter);
            return this;
        }
    }

    public EventSubscriptionImpl withLabels(List<String> labels) {
        if (isInCreateMode()) {
            this.innerModel().withLabels(labels);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withLabels(labels);
            return this;
        }
    }

    public EventSubscriptionImpl withExpirationTimeUtc(OffsetDateTime expirationTimeUtc) {
        if (isInCreateMode()) {
            this.innerModel().withExpirationTimeUtc(expirationTimeUtc);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withExpirationTimeUtc(expirationTimeUtc);
            return this;
        }
    }

    public EventSubscriptionImpl withEventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
        if (isInCreateMode()) {
            this.innerModel().withEventDeliverySchema(eventDeliverySchema);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withEventDeliverySchema(eventDeliverySchema);
            return this;
        }
    }

    public EventSubscriptionImpl withRetryPolicy(RetryPolicy retryPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withRetryPolicy(retryPolicy);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withRetryPolicy(retryPolicy);
            return this;
        }
    }

    public EventSubscriptionImpl withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        if (isInCreateMode()) {
            this.innerModel().withDeadLetterDestination(deadLetterDestination);
            return this;
        } else {
            this.updateEventSubscriptionUpdateParameters.withDeadLetterDestination(deadLetterDestination);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
