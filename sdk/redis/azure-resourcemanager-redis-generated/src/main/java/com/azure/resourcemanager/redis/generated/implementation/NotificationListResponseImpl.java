// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.implementation;

import com.azure.resourcemanager.redis.generated.RedisManager;
import com.azure.resourcemanager.redis.generated.fluent.models.NotificationListResponseInner;
import com.azure.resourcemanager.redis.generated.models.NotificationListResponse;
import com.azure.resourcemanager.redis.generated.models.UpgradeNotification;
import java.util.Collections;
import java.util.List;

public final class NotificationListResponseImpl implements NotificationListResponse {
    private NotificationListResponseInner innerObject;

    private final RedisManager serviceManager;

    public NotificationListResponseImpl(NotificationListResponseInner innerObject, RedisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<UpgradeNotification> value() {
        List<UpgradeNotification> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public NotificationListResponseInner innerModel() {
        return this.innerObject;
    }

    private RedisManager manager() {
        return this.serviceManager;
    }
}
