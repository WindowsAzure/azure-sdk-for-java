// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Registry. */
public interface Registry {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The SKU of the container registry.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: The identity of the container registry.
     *
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the loginServer property: The URL that can be used to log into the container registry.
     *
     * @return the loginServer value.
     */
    String loginServer();

    /**
     * Gets the creationDate property: The creation date of the container registry in ISO8601 format.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the provisioningState property: The provisioning state of the container registry at the time the operation
     * was called.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the status property: The status of the container registry at the time the operation was called.
     *
     * @return the status value.
     */
    Status status();

    /**
     * Gets the adminUserEnabled property: The value that indicates whether the admin user is enabled.
     *
     * @return the adminUserEnabled value.
     */
    Boolean adminUserEnabled();

    /**
     * Gets the networkRuleSet property: The network rule set for a container registry.
     *
     * @return the networkRuleSet value.
     */
    NetworkRuleSet networkRuleSet();

    /**
     * Gets the policies property: The policies for a container registry.
     *
     * @return the policies value.
     */
    Policies policies();

    /**
     * Gets the encryption property: The encryption settings of container registry.
     *
     * @return the encryption value.
     */
    EncryptionProperty encryption();

    /**
     * Gets the dataEndpointEnabled property: Enable a single data endpoint per region for serving data.
     *
     * @return the dataEndpointEnabled value.
     */
    Boolean dataEndpointEnabled();

    /**
     * Gets the dataEndpointHostNames property: List of host names that will serve data when dataEndpointEnabled is
     * true.
     *
     * @return the dataEndpointHostNames value.
     */
    List<String> dataEndpointHostNames();

    /**
     * Gets the privateEndpointConnections property: List of private endpoint connections for a container registry.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the publicNetworkAccess property: Whether or not public network access is allowed for the container
     * registry.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the networkRuleBypassOptions property: Whether to allow trusted Azure services to access a network
     * restricted registry.
     *
     * @return the networkRuleBypassOptions value.
     */
    NetworkRuleBypassOptions networkRuleBypassOptions();

    /**
     * Gets the zoneRedundancy property: Whether or not zone redundancy is enabled for this container registry.
     *
     * @return the zoneRedundancy value.
     */
    ZoneRedundancy zoneRedundancy();

    /**
     * Gets the anonymousPullEnabled property: Enables registry-wide pull from unauthenticated clients.
     *
     * @return the anonymousPullEnabled value.
     */
    Boolean anonymousPullEnabled();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryInner object.
     *
     * @return the inner object.
     */
    RegistryInner innerModel();

    /** The entirety of the Registry definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The Registry definition stages. */
    interface DefinitionStages {
        /** The first stage of the Registry definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Registry definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Registry definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group to which the container registry belongs.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Registry definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the container registry..
             *
             * @param sku The SKU of the container registry.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the Registry definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithAdminUserEnabled,
                DefinitionStages.WithNetworkRuleSet,
                DefinitionStages.WithPolicies,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithDataEndpointEnabled,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithNetworkRuleBypassOptions,
                DefinitionStages.WithZoneRedundancy,
                DefinitionStages.WithAnonymousPullEnabled {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Registry create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Registry create(Context context);
        }
        /** The stage of the Registry definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Registry definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the container registry..
             *
             * @param identity The identity of the container registry.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
        /** The stage of the Registry definition allowing to specify adminUserEnabled. */
        interface WithAdminUserEnabled {
            /**
             * Specifies the adminUserEnabled property: The value that indicates whether the admin user is enabled..
             *
             * @param adminUserEnabled The value that indicates whether the admin user is enabled.
             * @return the next definition stage.
             */
            WithCreate withAdminUserEnabled(Boolean adminUserEnabled);
        }
        /** The stage of the Registry definition allowing to specify networkRuleSet. */
        interface WithNetworkRuleSet {
            /**
             * Specifies the networkRuleSet property: The network rule set for a container registry..
             *
             * @param networkRuleSet The network rule set for a container registry.
             * @return the next definition stage.
             */
            WithCreate withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }
        /** The stage of the Registry definition allowing to specify policies. */
        interface WithPolicies {
            /**
             * Specifies the policies property: The policies for a container registry..
             *
             * @param policies The policies for a container registry.
             * @return the next definition stage.
             */
            WithCreate withPolicies(Policies policies);
        }
        /** The stage of the Registry definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The encryption settings of container registry..
             *
             * @param encryption The encryption settings of container registry.
             * @return the next definition stage.
             */
            WithCreate withEncryption(EncryptionProperty encryption);
        }
        /** The stage of the Registry definition allowing to specify dataEndpointEnabled. */
        interface WithDataEndpointEnabled {
            /**
             * Specifies the dataEndpointEnabled property: Enable a single data endpoint per region for serving data..
             *
             * @param dataEndpointEnabled Enable a single data endpoint per region for serving data.
             * @return the next definition stage.
             */
            WithCreate withDataEndpointEnabled(Boolean dataEndpointEnabled);
        }
        /** The stage of the Registry definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether or not public network access is allowed for the
             * container registry..
             *
             * @param publicNetworkAccess Whether or not public network access is allowed for the container registry.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Registry definition allowing to specify networkRuleBypassOptions. */
        interface WithNetworkRuleBypassOptions {
            /**
             * Specifies the networkRuleBypassOptions property: Whether to allow trusted Azure services to access a
             * network restricted registry..
             *
             * @param networkRuleBypassOptions Whether to allow trusted Azure services to access a network restricted
             *     registry.
             * @return the next definition stage.
             */
            WithCreate withNetworkRuleBypassOptions(NetworkRuleBypassOptions networkRuleBypassOptions);
        }
        /** The stage of the Registry definition allowing to specify zoneRedundancy. */
        interface WithZoneRedundancy {
            /**
             * Specifies the zoneRedundancy property: Whether or not zone redundancy is enabled for this container
             * registry.
             *
             * @param zoneRedundancy Whether or not zone redundancy is enabled for this container registry.
             * @return the next definition stage.
             */
            WithCreate withZoneRedundancy(ZoneRedundancy zoneRedundancy);
        }
        /** The stage of the Registry definition allowing to specify anonymousPullEnabled. */
        interface WithAnonymousPullEnabled {
            /**
             * Specifies the anonymousPullEnabled property: Enables registry-wide pull from unauthenticated clients..
             *
             * @param anonymousPullEnabled Enables registry-wide pull from unauthenticated clients.
             * @return the next definition stage.
             */
            WithCreate withAnonymousPullEnabled(Boolean anonymousPullEnabled);
        }
    }
    /**
     * Begins update for the Registry resource.
     *
     * @return the stage of resource update.
     */
    Registry.Update update();

    /** The template for Registry update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithSku,
            UpdateStages.WithAdminUserEnabled,
            UpdateStages.WithNetworkRuleSet,
            UpdateStages.WithPolicies,
            UpdateStages.WithEncryption,
            UpdateStages.WithDataEndpointEnabled,
            UpdateStages.WithPublicNetworkAccess,
            UpdateStages.WithNetworkRuleBypassOptions,
            UpdateStages.WithAnonymousPullEnabled {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Registry apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Registry apply(Context context);
    }
    /** The Registry update stages. */
    interface UpdateStages {
        /** The stage of the Registry update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags for the container registry..
             *
             * @param tags The tags for the container registry.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Registry update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the container registry..
             *
             * @param identity The identity of the container registry.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityProperties identity);
        }
        /** The stage of the Registry update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the container registry..
             *
             * @param sku The SKU of the container registry.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the Registry update allowing to specify adminUserEnabled. */
        interface WithAdminUserEnabled {
            /**
             * Specifies the adminUserEnabled property: The value that indicates whether the admin user is enabled..
             *
             * @param adminUserEnabled The value that indicates whether the admin user is enabled.
             * @return the next definition stage.
             */
            Update withAdminUserEnabled(Boolean adminUserEnabled);
        }
        /** The stage of the Registry update allowing to specify networkRuleSet. */
        interface WithNetworkRuleSet {
            /**
             * Specifies the networkRuleSet property: The network rule set for a container registry..
             *
             * @param networkRuleSet The network rule set for a container registry.
             * @return the next definition stage.
             */
            Update withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }
        /** The stage of the Registry update allowing to specify policies. */
        interface WithPolicies {
            /**
             * Specifies the policies property: The policies for a container registry..
             *
             * @param policies The policies for a container registry.
             * @return the next definition stage.
             */
            Update withPolicies(Policies policies);
        }
        /** The stage of the Registry update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The encryption settings of container registry..
             *
             * @param encryption The encryption settings of container registry.
             * @return the next definition stage.
             */
            Update withEncryption(EncryptionProperty encryption);
        }
        /** The stage of the Registry update allowing to specify dataEndpointEnabled. */
        interface WithDataEndpointEnabled {
            /**
             * Specifies the dataEndpointEnabled property: Enable a single data endpoint per region for serving data..
             *
             * @param dataEndpointEnabled Enable a single data endpoint per region for serving data.
             * @return the next definition stage.
             */
            Update withDataEndpointEnabled(Boolean dataEndpointEnabled);
        }
        /** The stage of the Registry update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Whether or not public network access is allowed for the
             * container registry..
             *
             * @param publicNetworkAccess Whether or not public network access is allowed for the container registry.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Registry update allowing to specify networkRuleBypassOptions. */
        interface WithNetworkRuleBypassOptions {
            /**
             * Specifies the networkRuleBypassOptions property: Whether to allow trusted Azure services to access a
             * network restricted registry..
             *
             * @param networkRuleBypassOptions Whether to allow trusted Azure services to access a network restricted
             *     registry.
             * @return the next definition stage.
             */
            Update withNetworkRuleBypassOptions(NetworkRuleBypassOptions networkRuleBypassOptions);
        }
        /** The stage of the Registry update allowing to specify anonymousPullEnabled. */
        interface WithAnonymousPullEnabled {
            /**
             * Specifies the anonymousPullEnabled property: Enables registry-wide pull from unauthenticated clients..
             *
             * @param anonymousPullEnabled Enables registry-wide pull from unauthenticated clients.
             * @return the next definition stage.
             */
            Update withAnonymousPullEnabled(Boolean anonymousPullEnabled);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Registry refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Registry refresh(Context context);

    /**
     * Copies an image to this container registry from the specified container registry.
     *
     * @param parameters The parameters specifying the image to copy and the source container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void importImage(ImportImageParameters parameters);

    /**
     * Copies an image to this container registry from the specified container registry.
     *
     * @param parameters The parameters specifying the image to copy and the source container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void importImage(ImportImageParameters parameters, Context context);

    /**
     * Lists the login credentials for the specified container registry.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    RegistryListCredentialsResult listCredentials();

    /**
     * Lists the login credentials for the specified container registry.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    Response<RegistryListCredentialsResult> listCredentialsWithResponse(Context context);

    /**
     * Regenerates one of the login credentials for the specified container registry.
     *
     * @param regenerateCredentialParameters Specifies name of the password which should be regenerated -- password or
     *     password2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    RegistryListCredentialsResult regenerateCredential(RegenerateCredentialParameters regenerateCredentialParameters);

    /**
     * Regenerates one of the login credentials for the specified container registry.
     *
     * @param regenerateCredentialParameters Specifies name of the password which should be regenerated -- password or
     *     password2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListCredentials operation.
     */
    Response<RegistryListCredentialsResult> regenerateCredentialWithResponse(
        RegenerateCredentialParameters regenerateCredentialParameters, Context context);

    /**
     * Generate keys for a token of a specified container registry.
     *
     * @param generateCredentialsParameters The parameters for generating credentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the GenerateCredentials operation.
     */
    GenerateCredentialsResult generateCredentials(GenerateCredentialsParameters generateCredentialsParameters);

    /**
     * Generate keys for a token of a specified container registry.
     *
     * @param generateCredentialsParameters The parameters for generating credentials.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the GenerateCredentials operation.
     */
    GenerateCredentialsResult generateCredentials(
        GenerateCredentialsParameters generateCredentialsParameters, Context context);

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    Run scheduleRun(RunRequest runRequest);

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param runRequest The parameters of a run that needs to scheduled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return run resource properties.
     */
    Run scheduleRun(RunRequest runRequest, Context context);

    /**
     * Get the upload location for the user to be able to upload the source.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload location for the user to be able to upload the source.
     */
    SourceUploadDefinition getBuildSourceUploadUrl();

    /**
     * Get the upload location for the user to be able to upload the source.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload location for the user to be able to upload the source.
     */
    Response<SourceUploadDefinition> getBuildSourceUploadUrlWithResponse(Context context);
}
