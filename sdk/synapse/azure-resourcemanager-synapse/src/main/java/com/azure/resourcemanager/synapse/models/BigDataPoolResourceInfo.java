// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.BigDataPoolResourceInfoInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of BigDataPoolResourceInfo. */
public interface BigDataPoolResourceInfo {
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
     * Gets the provisioningState property: The state of the Big Data pool.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the autoScale property: Auto-scaling properties.
     *
     * @return the autoScale value.
     */
    AutoScaleProperties autoScale();

    /**
     * Gets the creationDate property: The time when the Big Data pool was created.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the autoPause property: Auto-pausing properties.
     *
     * @return the autoPause value.
     */
    AutoPauseProperties autoPause();

    /**
     * Gets the isComputeIsolationEnabled property: Whether compute isolation is required or not.
     *
     * @return the isComputeIsolationEnabled value.
     */
    Boolean isComputeIsolationEnabled();

    /**
     * Gets the sessionLevelPackagesEnabled property: Whether session level packages enabled.
     *
     * @return the sessionLevelPackagesEnabled value.
     */
    Boolean sessionLevelPackagesEnabled();

    /**
     * Gets the cacheSize property: The cache size.
     *
     * @return the cacheSize value.
     */
    Integer cacheSize();

    /**
     * Gets the dynamicExecutorAllocation property: Dynamic Executor Allocation.
     *
     * @return the dynamicExecutorAllocation value.
     */
    DynamicExecutorAllocation dynamicExecutorAllocation();

    /**
     * Gets the sparkEventsFolder property: The Spark events folder.
     *
     * @return the sparkEventsFolder value.
     */
    String sparkEventsFolder();

    /**
     * Gets the nodeCount property: The number of nodes in the Big Data pool.
     *
     * @return the nodeCount value.
     */
    Integer nodeCount();

    /**
     * Gets the libraryRequirements property: Library version requirements.
     *
     * @return the libraryRequirements value.
     */
    LibraryRequirements libraryRequirements();

    /**
     * Gets the customLibraries property: List of custom libraries/packages associated with the spark pool.
     *
     * @return the customLibraries value.
     */
    List<LibraryInfo> customLibraries();

    /**
     * Gets the sparkConfigProperties property: Spark configuration file to specify additional properties.
     *
     * @return the sparkConfigProperties value.
     */
    LibraryRequirements sparkConfigProperties();

    /**
     * Gets the sparkVersion property: The Apache Spark version.
     *
     * @return the sparkVersion value.
     */
    String sparkVersion();

    /**
     * Gets the defaultSparkLogFolder property: The default folder where Spark logs will be written.
     *
     * @return the defaultSparkLogFolder value.
     */
    String defaultSparkLogFolder();

    /**
     * Gets the nodeSize property: The level of compute power that each node in the Big Data pool has.
     *
     * @return the nodeSize value.
     */
    NodeSize nodeSize();

    /**
     * Gets the nodeSizeFamily property: The kind of nodes that the Big Data pool provides.
     *
     * @return the nodeSizeFamily value.
     */
    NodeSizeFamily nodeSizeFamily();

    /**
     * Gets the lastSucceededTimestamp property: The time when the Big Data pool was updated successfully.
     *
     * @return the lastSucceededTimestamp value.
     */
    OffsetDateTime lastSucceededTimestamp();

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
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.BigDataPoolResourceInfoInner object.
     *
     * @return the inner object.
     */
    BigDataPoolResourceInfoInner innerModel();

    /** The entirety of the BigDataPoolResourceInfo definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The BigDataPoolResourceInfo definition stages. */
    interface DefinitionStages {
        /** The first stage of the BigDataPoolResourceInfo definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /**
         * The stage of the BigDataPoolResourceInfo definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithProvisioningState,
                DefinitionStages.WithAutoScale,
                DefinitionStages.WithCreationDate,
                DefinitionStages.WithAutoPause,
                DefinitionStages.WithIsComputeIsolationEnabled,
                DefinitionStages.WithSessionLevelPackagesEnabled,
                DefinitionStages.WithCacheSize,
                DefinitionStages.WithDynamicExecutorAllocation,
                DefinitionStages.WithSparkEventsFolder,
                DefinitionStages.WithNodeCount,
                DefinitionStages.WithLibraryRequirements,
                DefinitionStages.WithCustomLibraries,
                DefinitionStages.WithSparkConfigProperties,
                DefinitionStages.WithSparkVersion,
                DefinitionStages.WithDefaultSparkLogFolder,
                DefinitionStages.WithNodeSize,
                DefinitionStages.WithNodeSizeFamily,
                DefinitionStages.WithForce {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BigDataPoolResourceInfo create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BigDataPoolResourceInfo create(Context context);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The state of the Big Data pool..
             *
             * @param provisioningState The state of the Big Data pool.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(String provisioningState);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify autoScale. */
        interface WithAutoScale {
            /**
             * Specifies the autoScale property: Auto-scaling properties.
             *
             * @param autoScale Auto-scaling properties.
             * @return the next definition stage.
             */
            WithCreate withAutoScale(AutoScaleProperties autoScale);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify creationDate. */
        interface WithCreationDate {
            /**
             * Specifies the creationDate property: The time when the Big Data pool was created..
             *
             * @param creationDate The time when the Big Data pool was created.
             * @return the next definition stage.
             */
            WithCreate withCreationDate(OffsetDateTime creationDate);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify autoPause. */
        interface WithAutoPause {
            /**
             * Specifies the autoPause property: Auto-pausing properties.
             *
             * @param autoPause Auto-pausing properties.
             * @return the next definition stage.
             */
            WithCreate withAutoPause(AutoPauseProperties autoPause);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify isComputeIsolationEnabled. */
        interface WithIsComputeIsolationEnabled {
            /**
             * Specifies the isComputeIsolationEnabled property: Whether compute isolation is required or not..
             *
             * @param isComputeIsolationEnabled Whether compute isolation is required or not.
             * @return the next definition stage.
             */
            WithCreate withIsComputeIsolationEnabled(Boolean isComputeIsolationEnabled);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify sessionLevelPackagesEnabled. */
        interface WithSessionLevelPackagesEnabled {
            /**
             * Specifies the sessionLevelPackagesEnabled property: Whether session level packages enabled..
             *
             * @param sessionLevelPackagesEnabled Whether session level packages enabled.
             * @return the next definition stage.
             */
            WithCreate withSessionLevelPackagesEnabled(Boolean sessionLevelPackagesEnabled);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify cacheSize. */
        interface WithCacheSize {
            /**
             * Specifies the cacheSize property: The cache size.
             *
             * @param cacheSize The cache size.
             * @return the next definition stage.
             */
            WithCreate withCacheSize(Integer cacheSize);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify dynamicExecutorAllocation. */
        interface WithDynamicExecutorAllocation {
            /**
             * Specifies the dynamicExecutorAllocation property: Dynamic Executor Allocation.
             *
             * @param dynamicExecutorAllocation Dynamic Executor Allocation.
             * @return the next definition stage.
             */
            WithCreate withDynamicExecutorAllocation(DynamicExecutorAllocation dynamicExecutorAllocation);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify sparkEventsFolder. */
        interface WithSparkEventsFolder {
            /**
             * Specifies the sparkEventsFolder property: The Spark events folder.
             *
             * @param sparkEventsFolder The Spark events folder.
             * @return the next definition stage.
             */
            WithCreate withSparkEventsFolder(String sparkEventsFolder);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify nodeCount. */
        interface WithNodeCount {
            /**
             * Specifies the nodeCount property: The number of nodes in the Big Data pool..
             *
             * @param nodeCount The number of nodes in the Big Data pool.
             * @return the next definition stage.
             */
            WithCreate withNodeCount(Integer nodeCount);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify libraryRequirements. */
        interface WithLibraryRequirements {
            /**
             * Specifies the libraryRequirements property: Library version requirements.
             *
             * @param libraryRequirements Library version requirements.
             * @return the next definition stage.
             */
            WithCreate withLibraryRequirements(LibraryRequirements libraryRequirements);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify customLibraries. */
        interface WithCustomLibraries {
            /**
             * Specifies the customLibraries property: List of custom libraries/packages associated with the spark
             * pool..
             *
             * @param customLibraries List of custom libraries/packages associated with the spark pool.
             * @return the next definition stage.
             */
            WithCreate withCustomLibraries(List<LibraryInfo> customLibraries);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify sparkConfigProperties. */
        interface WithSparkConfigProperties {
            /**
             * Specifies the sparkConfigProperties property: Spark configuration file to specify additional properties.
             *
             * @param sparkConfigProperties Spark configuration file to specify additional properties.
             * @return the next definition stage.
             */
            WithCreate withSparkConfigProperties(LibraryRequirements sparkConfigProperties);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify sparkVersion. */
        interface WithSparkVersion {
            /**
             * Specifies the sparkVersion property: The Apache Spark version..
             *
             * @param sparkVersion The Apache Spark version.
             * @return the next definition stage.
             */
            WithCreate withSparkVersion(String sparkVersion);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify defaultSparkLogFolder. */
        interface WithDefaultSparkLogFolder {
            /**
             * Specifies the defaultSparkLogFolder property: The default folder where Spark logs will be written..
             *
             * @param defaultSparkLogFolder The default folder where Spark logs will be written.
             * @return the next definition stage.
             */
            WithCreate withDefaultSparkLogFolder(String defaultSparkLogFolder);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify nodeSize. */
        interface WithNodeSize {
            /**
             * Specifies the nodeSize property: The level of compute power that each node in the Big Data pool has..
             *
             * @param nodeSize The level of compute power that each node in the Big Data pool has.
             * @return the next definition stage.
             */
            WithCreate withNodeSize(NodeSize nodeSize);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify nodeSizeFamily. */
        interface WithNodeSizeFamily {
            /**
             * Specifies the nodeSizeFamily property: The kind of nodes that the Big Data pool provides..
             *
             * @param nodeSizeFamily The kind of nodes that the Big Data pool provides.
             * @return the next definition stage.
             */
            WithCreate withNodeSizeFamily(NodeSizeFamily nodeSizeFamily);
        }
        /** The stage of the BigDataPoolResourceInfo definition allowing to specify force. */
        interface WithForce {
            /**
             * Specifies the force property: Whether to stop any running jobs in the Big Data pool.
             *
             * @param force Whether to stop any running jobs in the Big Data pool.
             * @return the next definition stage.
             */
            WithCreate withForce(Boolean force);
        }
    }
    /**
     * Begins update for the BigDataPoolResourceInfo resource.
     *
     * @return the stage of resource update.
     */
    BigDataPoolResourceInfo.Update update();

    /** The template for BigDataPoolResourceInfo update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BigDataPoolResourceInfo apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BigDataPoolResourceInfo apply(Context context);
    }
    /** The BigDataPoolResourceInfo update stages. */
    interface UpdateStages {
        /** The stage of the BigDataPoolResourceInfo update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Updated tags for the Big Data pool.
             *
             * @param tags Updated tags for the Big Data pool.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BigDataPoolResourceInfo refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BigDataPoolResourceInfo refresh(Context context);
}
