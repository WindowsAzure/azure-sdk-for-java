/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.CosmosDBManager;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.DatabaseAccountGetResultsInner;

/**
 * Type representing DatabaseAccountGetResults.
 */
public interface DatabaseAccountGetResults extends HasInner<DatabaseAccountGetResultsInner>, Resource, GroupableResourceCore<CosmosDBManager, DatabaseAccountGetResultsInner>, HasResourceGroup, Refreshable<DatabaseAccountGetResults>, Updatable<DatabaseAccountGetResults.Update>, HasManager<CosmosDBManager> {
    /**
     * @return the capabilities value.
     */
    List<Capability> capabilities();

    /**
     * @return the connectorOffer value.
     */
    ConnectorOffer connectorOffer();

    /**
     * @return the consistencyPolicy value.
     */
    ConsistencyPolicy consistencyPolicy();

    /**
     * @return the databaseAccountOfferType value.
     */
    DatabaseAccountOfferType databaseAccountOfferType();

    /**
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    Boolean disableKeyBasedMetadataWriteAccess();

    /**
     * @return the documentEndpoint value.
     */
    String documentEndpoint();

    /**
     * @return the enableAutomaticFailover value.
     */
    Boolean enableAutomaticFailover();

    /**
     * @return the enableCassandraConnector value.
     */
    Boolean enableCassandraConnector();

    /**
     * @return the enableMultipleWriteLocations value.
     */
    Boolean enableMultipleWriteLocations();

    /**
     * @return the failoverPolicies value.
     */
    List<FailoverPolicy> failoverPolicies();

    /**
     * @return the ipRangeFilter value.
     */
    String ipRangeFilter();

    /**
     * @return the isVirtualNetworkFilterEnabled value.
     */
    Boolean isVirtualNetworkFilterEnabled();

    /**
     * @return the keyVaultKeyUri value.
     */
    String keyVaultKeyUri();

    /**
     * @return the kind value.
     */
    DatabaseAccountKind kind();

    /**
     * @return the locations value.
     */
    List<Location> locations();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the readLocations value.
     */
    List<Location> readLocations();

    /**
     * @return the virtualNetworkRules value.
     */
    List<VirtualNetworkRule> virtualNetworkRules();

    /**
     * @return the writeLocations value.
     */
    List<Location> writeLocations();

    /**
     * The entirety of the DatabaseAccountGetResults definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithDatabaseAccountOfferType, DefinitionStages.WithLocations, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatabaseAccountGetResults definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatabaseAccountGetResults definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DatabaseAccountGetResults definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithDatabaseAccountOfferType> {
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify DatabaseAccountOfferType.
         */
        interface WithDatabaseAccountOfferType {
           /**
            * Specifies databaseAccountOfferType.
            * @param databaseAccountOfferType The offer type for the database
            * @return the next definition stage
*/
            WithLocations withDatabaseAccountOfferType(String databaseAccountOfferType);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify Locations.
         */
        interface WithLocations {
           /**
            * Specifies locations.
            * @param locations An array that contains the georeplication locations enabled for the Cosmos DB account
            * @return the next definition stage
*/
            WithCreate withLocations(List<Location> locations);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify Capabilities.
         */
        interface WithCapabilities {
            /**
             * Specifies capabilities.
             * @param capabilities List of Cosmos DB capabilities for the account
             * @return the next definition stage
             */
            WithCreate withCapabilities(List<Capability> capabilities);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify ConnectorOffer.
         */
        interface WithConnectorOffer {
            /**
             * Specifies connectorOffer.
             * @param connectorOffer The cassandra connector offer type for the Cosmos DB database C* account. Possible values include: 'Small'
             * @return the next definition stage
             */
            WithCreate withConnectorOffer(ConnectorOffer connectorOffer);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify ConsistencyPolicy.
         */
        interface WithConsistencyPolicy {
            /**
             * Specifies consistencyPolicy.
             * @param consistencyPolicy The consistency policy for the Cosmos DB account
             * @return the next definition stage
             */
            WithCreate withConsistencyPolicy(ConsistencyPolicy consistencyPolicy);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify DisableKeyBasedMetadataWriteAccess.
         */
        interface WithDisableKeyBasedMetadataWriteAccess {
            /**
             * Specifies disableKeyBasedMetadataWriteAccess.
             * @param disableKeyBasedMetadataWriteAccess Disable write operations on metadata resources (databases, containers, throughput) via account keys
             * @return the next definition stage
             */
            WithCreate withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify EnableAutomaticFailover.
         */
        interface WithEnableAutomaticFailover {
            /**
             * Specifies enableAutomaticFailover.
             * @param enableAutomaticFailover Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account
             * @return the next definition stage
             */
            WithCreate withEnableAutomaticFailover(Boolean enableAutomaticFailover);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify EnableCassandraConnector.
         */
        interface WithEnableCassandraConnector {
            /**
             * Specifies enableCassandraConnector.
             * @param enableCassandraConnector Enables the cassandra connector on the Cosmos DB C* account
             * @return the next definition stage
             */
            WithCreate withEnableCassandraConnector(Boolean enableCassandraConnector);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify EnableMultipleWriteLocations.
         */
        interface WithEnableMultipleWriteLocations {
            /**
             * Specifies enableMultipleWriteLocations.
             * @param enableMultipleWriteLocations Enables the account to write in multiple locations
             * @return the next definition stage
             */
            WithCreate withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify IpRangeFilter.
         */
        interface WithIpRangeFilter {
            /**
             * Specifies ipRangeFilter.
             * @param ipRangeFilter Cosmos DB Firewall Support: This value specifies the set of IP addresses or IP address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP addresses/ranges must be comma separated and must not contain any spaces
             * @return the next definition stage
             */
            WithCreate withIpRangeFilter(String ipRangeFilter);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify IsVirtualNetworkFilterEnabled.
         */
        interface WithIsVirtualNetworkFilterEnabled {
            /**
             * Specifies isVirtualNetworkFilterEnabled.
             * @param isVirtualNetworkFilterEnabled Flag to indicate whether to enable/disable Virtual Network ACL rules
             * @return the next definition stage
             */
            WithCreate withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify KeyVaultKeyUri.
         */
        interface WithKeyVaultKeyUri {
            /**
             * Specifies keyVaultKeyUri.
             * @param keyVaultKeyUri The URI of the key vault
             * @return the next definition stage
             */
            WithCreate withKeyVaultKeyUri(String keyVaultKeyUri);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Indicates the type of database account. This can only be set at database account creation. Possible values include: 'GlobalDocumentDB', 'MongoDB', 'Parse'
             * @return the next definition stage
             */
            WithCreate withKind(DatabaseAccountKind kind);
        }

        /**
         * The stage of the databaseaccountgetresults definition allowing to specify VirtualNetworkRules.
         */
        interface WithVirtualNetworkRules {
            /**
             * Specifies virtualNetworkRules.
             * @param virtualNetworkRules List of Virtual Network ACL rules configured for the Cosmos DB account
             * @return the next definition stage
             */
            WithCreate withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatabaseAccountGetResults>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCapabilities, DefinitionStages.WithConnectorOffer, DefinitionStages.WithConsistencyPolicy, DefinitionStages.WithDisableKeyBasedMetadataWriteAccess, DefinitionStages.WithEnableAutomaticFailover, DefinitionStages.WithEnableCassandraConnector, DefinitionStages.WithEnableMultipleWriteLocations, DefinitionStages.WithIpRangeFilter, DefinitionStages.WithIsVirtualNetworkFilterEnabled, DefinitionStages.WithKeyVaultKeyUri, DefinitionStages.WithKind, DefinitionStages.WithVirtualNetworkRules {
        }
    }
    /**
     * The template for a DatabaseAccountGetResults update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatabaseAccountGetResults>, Resource.UpdateWithTags<Update>, UpdateStages.WithCapabilities, UpdateStages.WithConnectorOffer, UpdateStages.WithConsistencyPolicy, UpdateStages.WithDisableKeyBasedMetadataWriteAccess, UpdateStages.WithEnableAutomaticFailover, UpdateStages.WithEnableCassandraConnector, UpdateStages.WithEnableMultipleWriteLocations, UpdateStages.WithIpRangeFilter, UpdateStages.WithIsVirtualNetworkFilterEnabled, UpdateStages.WithKeyVaultKeyUri, UpdateStages.WithLocations, UpdateStages.WithVirtualNetworkRules {
    }

    /**
     * Grouping of DatabaseAccountGetResults update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the databaseaccountgetresults update allowing to specify Capabilities.
         */
        interface WithCapabilities {
            /**
             * Specifies capabilities.
             * @param capabilities List of Cosmos DB capabilities for the account
             * @return the next update stage
             */
            Update withCapabilities(List<Capability> capabilities);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify ConnectorOffer.
         */
        interface WithConnectorOffer {
            /**
             * Specifies connectorOffer.
             * @param connectorOffer The cassandra connector offer type for the Cosmos DB database C* account. Possible values include: 'Small'
             * @return the next update stage
             */
            Update withConnectorOffer(ConnectorOffer connectorOffer);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify ConsistencyPolicy.
         */
        interface WithConsistencyPolicy {
            /**
             * Specifies consistencyPolicy.
             * @param consistencyPolicy The consistency policy for the Cosmos DB account
             * @return the next update stage
             */
            Update withConsistencyPolicy(ConsistencyPolicy consistencyPolicy);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify DisableKeyBasedMetadataWriteAccess.
         */
        interface WithDisableKeyBasedMetadataWriteAccess {
            /**
             * Specifies disableKeyBasedMetadataWriteAccess.
             * @param disableKeyBasedMetadataWriteAccess Disable write operations on metadata resources (databases, containers, throughput) via account keys
             * @return the next update stage
             */
            Update withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify EnableAutomaticFailover.
         */
        interface WithEnableAutomaticFailover {
            /**
             * Specifies enableAutomaticFailover.
             * @param enableAutomaticFailover Enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account
             * @return the next update stage
             */
            Update withEnableAutomaticFailover(Boolean enableAutomaticFailover);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify EnableCassandraConnector.
         */
        interface WithEnableCassandraConnector {
            /**
             * Specifies enableCassandraConnector.
             * @param enableCassandraConnector Enables the cassandra connector on the Cosmos DB C* account
             * @return the next update stage
             */
            Update withEnableCassandraConnector(Boolean enableCassandraConnector);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify EnableMultipleWriteLocations.
         */
        interface WithEnableMultipleWriteLocations {
            /**
             * Specifies enableMultipleWriteLocations.
             * @param enableMultipleWriteLocations Enables the account to write in multiple locations
             * @return the next update stage
             */
            Update withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify IpRangeFilter.
         */
        interface WithIpRangeFilter {
            /**
             * Specifies ipRangeFilter.
             * @param ipRangeFilter Cosmos DB Firewall Support: This value specifies the set of IP addresses or IP address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP addresses/ranges must be comma separated and must not contain any spaces
             * @return the next update stage
             */
            Update withIpRangeFilter(String ipRangeFilter);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify IsVirtualNetworkFilterEnabled.
         */
        interface WithIsVirtualNetworkFilterEnabled {
            /**
             * Specifies isVirtualNetworkFilterEnabled.
             * @param isVirtualNetworkFilterEnabled Flag to indicate whether to enable/disable Virtual Network ACL rules
             * @return the next update stage
             */
            Update withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify KeyVaultKeyUri.
         */
        interface WithKeyVaultKeyUri {
            /**
             * Specifies keyVaultKeyUri.
             * @param keyVaultKeyUri The URI of the key vault
             * @return the next update stage
             */
            Update withKeyVaultKeyUri(String keyVaultKeyUri);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify Locations.
         */
        interface WithLocations {
            /**
             * Specifies locations.
             * @param locations An array that contains the georeplication locations enabled for the Cosmos DB account
             * @return the next update stage
             */
            Update withLocations(List<Location> locations);
        }

        /**
         * The stage of the databaseaccountgetresults update allowing to specify VirtualNetworkRules.
         */
        interface WithVirtualNetworkRules {
            /**
             * Specifies virtualNetworkRules.
             * @param virtualNetworkRules List of Virtual Network ACL rules configured for the Cosmos DB account
             * @return the next update stage
             */
            Update withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules);
        }

    }
}
