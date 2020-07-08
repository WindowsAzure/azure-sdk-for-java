// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.annotation.Beta;
import com.azure.resourcemanager.appplatform.AppPlatformManager;
import com.azure.resourcemanager.appplatform.fluent.CustomDomainsClient;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingById;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingByName;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasManager;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasParent;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsDeletingById;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsDeletingByName;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListing;
import com.azure.resourcemanager.resources.fluentcore.model.HasInner;
import reactor.core.publisher.Mono;

/** Entry point for Spring App Custom Domains API. */
@Fluent
@Beta
public interface SpringAppDomains
    extends HasManager<AppPlatformManager>,
    HasInner<CustomDomainsClient>,
    HasParent<SpringApp>,
    SupportsGettingById<SpringAppDomain>,
    SupportsGettingByName<SpringAppDomain>,
    SupportsListing<SpringAppDomain>,
    SupportsDeletingById,
    SupportsDeletingByName {
    /** @return the domain is validate for the parent app or not */
    Boolean validate(String domain);

    /** @return the domain is validate for the parent app or not */
    Mono<Boolean> validateAsync(String domain);
}
