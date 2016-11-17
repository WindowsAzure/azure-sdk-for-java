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
     * Generates a dynamic SSO URI used to sign in to the CDN supplemental portal.
     * Supplemental portal is used to configure advanced feature capabilities that are not
     * yet available in the Azure portal, such as core reports in a standard profile;
     * rules engine, advanced HTTP reports, and real-time stats and alerts in a premium profile.
     * The SSO URI changes approximately every 10 minutes.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @return the SsoUri string if successful.
     */
    String generateSsoUri(String resourceGroupName, String profileName);

    /**
     * Check the availability of a endpoint name without creating the CDN Endpoint.
     *
     * @param name The endpoint resource name to validate.
     * @return the CheckNameAvailabilityResult object if successful.
     */
    CheckNameAvailabilityResult checkEndpointNameAvailability(String name);

    /**
     * Lists all of the available CDN REST API operations.
     *
     * @return the list of available CDN REST operations.
     */
    PagedList<Operation> listOperations();

    /**
     * Starts an existing stopped CDN endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     */
    void endpointStart(String resourceGroupName, String profileName, String endpointName);

    /**
     * Stops an existing running CDN endpoint.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     */
    void endpointStop(String resourceGroupName, String profileName, String endpointName);

    /**
     * Forcibly purges CDN endpoint content.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param contentPaths The path to the content to be purged. Can describe a file path or a wild card directory.
     */
    void endpointPurgeContent(String resourceGroupName, String profileName, String endpointName, List<String> contentPaths);

    /**
     * Forcibly pre-loads CDN endpoint content. Available for Verizon Profiles.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param endpointName Name of the endpoint under the profile which is unique globally.
     * @param contentPaths The path to the content to be loaded. Should describe a file path.
     */
    void endpointLoadContent(String resourceGroupName, String profileName, String endpointName, List<String> contentPaths);
}
