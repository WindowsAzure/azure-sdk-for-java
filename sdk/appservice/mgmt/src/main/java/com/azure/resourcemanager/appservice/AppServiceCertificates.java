// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.implementation.AppServiceManager;
import com.azure.resourcemanager.appservice.models.CertificatesInner;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingById;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasManager;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsCreating;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsDeletingById;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListing;
import com.azure.resourcemanager.resources.fluentcore.model.HasInner;

/** Entry point for certificate management API. */
@Fluent
public interface AppServiceCertificates
    extends SupportsCreating<AppServiceCertificate.DefinitionStages.Blank>,
        SupportsDeletingById,
        SupportsListingByResourceGroup<AppServiceCertificate>,
        SupportsListing<AppServiceCertificate>,
        SupportsGettingByResourceGroup<AppServiceCertificate>,
        SupportsGettingById<AppServiceCertificate>,
        SupportsDeletingByResourceGroup,
        HasManager<AppServiceManager>,
        HasInner<CertificatesInner> {
}
