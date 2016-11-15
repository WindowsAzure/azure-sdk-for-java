/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.cdn;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByGroup;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;

import java.util.List;

/**
 * Entry point for CDN profile management API.
 */
@Fluent
public interface CdnProfiles extends
        SupportsCreating<CdnProfile.DefinitionStages.Blank>,
        SupportsListing<CdnProfile>,
        SupportsListingByGroup<CdnProfile>,
        SupportsGettingByGroup<CdnProfile>,
        SupportsGettingById<CdnProfile>,
        SupportsDeletingById,
        SupportsDeletingByGroup,
        SupportsBatchCreation<CdnProfile> {

    /**
     * Generates a dynamic SSO URI used to sign in to the CDN Supplemental Portal used for advanced management tasks.
     *
     * @return The URI used to login to third party web portal.
     */
    String generateSsoUri(String resourceGroupName, String profileName);

    CheckNameAvailabilityResult checkEndpointNameAvailability(String name);

    PagedList<Operation> listOperations();

    void endpointStart(String resourceGroupName, String profileName, String endpointName);
    void endpointStop(String resourceGroupName, String profileName, String endpointName);
    void endpointPurgeContent(String resourceGroupName, String profileName, String endpointName, List<String> contentPaths);
    void endpointLoadContent(String resourceGroupName, String profileName, String endpointName, List<String> contentPaths);
}
