/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.BigDataPoolResourceInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import java.util.Map;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing BigDataPoolResourceInfo.
 */
public interface BigDataPoolResourceInfo extends HasInner<BigDataPoolResourceInfoInner>, Indexable, Refreshable<BigDataPoolResourceInfo>, Updatable<BigDataPoolResourceInfo.Update>, HasManager<SynapseManager> {
    /**
     * @return the autoPause value.
     */
    AutoPauseProperties autoPause();

    /**
     * @return the autoScale value.
     */
    AutoScaleProperties autoScale();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the customLibraries value.
     */
    List<LibraryInfo> customLibraries();

    /**
     * @return the defaultSparkLogFolder value.
     */
    String defaultSparkLogFolder();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isComputeIsolationEnabled value.
     */
    Boolean isComputeIsolationEnabled();

    /**
     * @return the libraryRequirements value.
     */
    LibraryRequirements libraryRequirements();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nodeCount value.
     */
    Integer nodeCount();

    /**
     * @return the nodeSize value.
     */
    NodeSize nodeSize();

    /**
     * @return the nodeSizeFamily value.
     */
    NodeSizeFamily nodeSizeFamily();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sessionLevelPackagesEnabled value.
     */
    Boolean sessionLevelPackagesEnabled();

    /**
     * @return the sparkConfigProperties value.
     */
    LibraryRequirements sparkConfigProperties();

    /**
     * @return the sparkEventsFolder value.
     */
    String sparkEventsFolder();

    /**
     * @return the sparkVersion value.
     */
    String sparkVersion();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BigDataPoolResourceInfo definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithForce, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BigDataPoolResourceInfo definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BigDataPoolResourceInfo definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @return the next definition stage
            */
            WithForce withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify Force.
         */
        interface WithForce {
           /**
            * Specifies force.
            * @param force Whether to stop any running jobs in the Big Data pool
            * @return the next definition stage
            */
            WithLocation withForce(Boolean force);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The geo-location where the resource lives
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify AutoPause.
         */
        interface WithAutoPause {
            /**
             * Specifies autoPause.
             * @param autoPause Auto-pausing properties
             * @return the next definition stage
             */
            WithCreate withAutoPause(AutoPauseProperties autoPause);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify AutoScale.
         */
        interface WithAutoScale {
            /**
             * Specifies autoScale.
             * @param autoScale Auto-scaling properties
             * @return the next definition stage
             */
            WithCreate withAutoScale(AutoScaleProperties autoScale);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify CreationDate.
         */
        interface WithCreationDate {
            /**
             * Specifies creationDate.
             * @param creationDate The time when the Big Data pool was created
             * @return the next definition stage
             */
            WithCreate withCreationDate(DateTime creationDate);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify CustomLibraries.
         */
        interface WithCustomLibraries {
            /**
             * Specifies customLibraries.
             * @param customLibraries List of custom libraries/packages associated with the spark pool
             * @return the next definition stage
             */
            WithCreate withCustomLibraries(List<LibraryInfo> customLibraries);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify DefaultSparkLogFolder.
         */
        interface WithDefaultSparkLogFolder {
            /**
             * Specifies defaultSparkLogFolder.
             * @param defaultSparkLogFolder The default folder where Spark logs will be written
             * @return the next definition stage
             */
            WithCreate withDefaultSparkLogFolder(String defaultSparkLogFolder);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify IsComputeIsolationEnabled.
         */
        interface WithIsComputeIsolationEnabled {
            /**
             * Specifies isComputeIsolationEnabled.
             * @param isComputeIsolationEnabled Whether compute isolation is required or not
             * @return the next definition stage
             */
            WithCreate withIsComputeIsolationEnabled(Boolean isComputeIsolationEnabled);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify LibraryRequirements.
         */
        interface WithLibraryRequirements {
            /**
             * Specifies libraryRequirements.
             * @param libraryRequirements Library version requirements
             * @return the next definition stage
             */
            WithCreate withLibraryRequirements(LibraryRequirements libraryRequirements);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify NodeCount.
         */
        interface WithNodeCount {
            /**
             * Specifies nodeCount.
             * @param nodeCount The number of nodes in the Big Data pool
             * @return the next definition stage
             */
            WithCreate withNodeCount(Integer nodeCount);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify NodeSize.
         */
        interface WithNodeSize {
            /**
             * Specifies nodeSize.
             * @param nodeSize The level of compute power that each node in the Big Data pool has. Possible values include: 'None', 'Small', 'Medium', 'Large', 'XLarge', 'XXLarge', 'XXXLarge'
             * @return the next definition stage
             */
            WithCreate withNodeSize(NodeSize nodeSize);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify NodeSizeFamily.
         */
        interface WithNodeSizeFamily {
            /**
             * Specifies nodeSizeFamily.
             * @param nodeSizeFamily The kind of nodes that the Big Data pool provides. Possible values include: 'None', 'MemoryOptimized'
             * @return the next definition stage
             */
            WithCreate withNodeSizeFamily(NodeSizeFamily nodeSizeFamily);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The state of the Big Data pool
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify SessionLevelPackagesEnabled.
         */
        interface WithSessionLevelPackagesEnabled {
            /**
             * Specifies sessionLevelPackagesEnabled.
             * @param sessionLevelPackagesEnabled Whether session level library/package management is enabled or not
             * @return the next definition stage
             */
            WithCreate withSessionLevelPackagesEnabled(Boolean sessionLevelPackagesEnabled);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify SparkConfigProperties.
         */
        interface WithSparkConfigProperties {
            /**
             * Specifies sparkConfigProperties.
             * @param sparkConfigProperties Spark configuration file to specify additional properties
             * @return the next definition stage
             */
            WithCreate withSparkConfigProperties(LibraryRequirements sparkConfigProperties);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify SparkEventsFolder.
         */
        interface WithSparkEventsFolder {
            /**
             * Specifies sparkEventsFolder.
             * @param sparkEventsFolder The Spark events folder
             * @return the next definition stage
             */
            WithCreate withSparkEventsFolder(String sparkEventsFolder);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify SparkVersion.
         */
        interface WithSparkVersion {
            /**
             * Specifies sparkVersion.
             * @param sparkVersion The Apache Spark version
             * @return the next definition stage
             */
            WithCreate withSparkVersion(String sparkVersion);
        }

        /**
         * The stage of the bigdatapoolresourceinfo definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BigDataPoolResourceInfo>, DefinitionStages.WithAutoPause, DefinitionStages.WithAutoScale, DefinitionStages.WithCreationDate, DefinitionStages.WithCustomLibraries, DefinitionStages.WithDefaultSparkLogFolder, DefinitionStages.WithIsComputeIsolationEnabled, DefinitionStages.WithLibraryRequirements, DefinitionStages.WithNodeCount, DefinitionStages.WithNodeSize, DefinitionStages.WithNodeSizeFamily, DefinitionStages.WithProvisioningState, DefinitionStages.WithSessionLevelPackagesEnabled, DefinitionStages.WithSparkConfigProperties, DefinitionStages.WithSparkEventsFolder, DefinitionStages.WithSparkVersion, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a BigDataPoolResourceInfo update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BigDataPoolResourceInfo>, UpdateStages.WithForce, UpdateStages.WithAutoPause, UpdateStages.WithAutoScale, UpdateStages.WithCreationDate, UpdateStages.WithCustomLibraries, UpdateStages.WithDefaultSparkLogFolder, UpdateStages.WithIsComputeIsolationEnabled, UpdateStages.WithLibraryRequirements, UpdateStages.WithNodeCount, UpdateStages.WithNodeSize, UpdateStages.WithNodeSizeFamily, UpdateStages.WithProvisioningState, UpdateStages.WithSessionLevelPackagesEnabled, UpdateStages.WithSparkConfigProperties, UpdateStages.WithSparkEventsFolder, UpdateStages.WithSparkVersion, UpdateStages.WithTags {
    }

    /**
     * Grouping of BigDataPoolResourceInfo update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify Force.
         */
        interface WithForce {
            /**
             * Specifies force.
             * @param force Whether to stop any running jobs in the Big Data pool
             * @return the next update stage
             */
            Update withForce(Boolean force);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify AutoPause.
         */
        interface WithAutoPause {
            /**
             * Specifies autoPause.
             * @param autoPause Auto-pausing properties
             * @return the next update stage
             */
            Update withAutoPause(AutoPauseProperties autoPause);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify AutoScale.
         */
        interface WithAutoScale {
            /**
             * Specifies autoScale.
             * @param autoScale Auto-scaling properties
             * @return the next update stage
             */
            Update withAutoScale(AutoScaleProperties autoScale);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify CreationDate.
         */
        interface WithCreationDate {
            /**
             * Specifies creationDate.
             * @param creationDate The time when the Big Data pool was created
             * @return the next update stage
             */
            Update withCreationDate(DateTime creationDate);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify CustomLibraries.
         */
        interface WithCustomLibraries {
            /**
             * Specifies customLibraries.
             * @param customLibraries List of custom libraries/packages associated with the spark pool
             * @return the next update stage
             */
            Update withCustomLibraries(List<LibraryInfo> customLibraries);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify DefaultSparkLogFolder.
         */
        interface WithDefaultSparkLogFolder {
            /**
             * Specifies defaultSparkLogFolder.
             * @param defaultSparkLogFolder The default folder where Spark logs will be written
             * @return the next update stage
             */
            Update withDefaultSparkLogFolder(String defaultSparkLogFolder);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify IsComputeIsolationEnabled.
         */
        interface WithIsComputeIsolationEnabled {
            /**
             * Specifies isComputeIsolationEnabled.
             * @param isComputeIsolationEnabled Whether compute isolation is required or not
             * @return the next update stage
             */
            Update withIsComputeIsolationEnabled(Boolean isComputeIsolationEnabled);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify LibraryRequirements.
         */
        interface WithLibraryRequirements {
            /**
             * Specifies libraryRequirements.
             * @param libraryRequirements Library version requirements
             * @return the next update stage
             */
            Update withLibraryRequirements(LibraryRequirements libraryRequirements);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify NodeCount.
         */
        interface WithNodeCount {
            /**
             * Specifies nodeCount.
             * @param nodeCount The number of nodes in the Big Data pool
             * @return the next update stage
             */
            Update withNodeCount(Integer nodeCount);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify NodeSize.
         */
        interface WithNodeSize {
            /**
             * Specifies nodeSize.
             * @param nodeSize The level of compute power that each node in the Big Data pool has. Possible values include: 'None', 'Small', 'Medium', 'Large', 'XLarge', 'XXLarge', 'XXXLarge'
             * @return the next update stage
             */
            Update withNodeSize(NodeSize nodeSize);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify NodeSizeFamily.
         */
        interface WithNodeSizeFamily {
            /**
             * Specifies nodeSizeFamily.
             * @param nodeSizeFamily The kind of nodes that the Big Data pool provides. Possible values include: 'None', 'MemoryOptimized'
             * @return the next update stage
             */
            Update withNodeSizeFamily(NodeSizeFamily nodeSizeFamily);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The state of the Big Data pool
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify SessionLevelPackagesEnabled.
         */
        interface WithSessionLevelPackagesEnabled {
            /**
             * Specifies sessionLevelPackagesEnabled.
             * @param sessionLevelPackagesEnabled Whether session level library/package management is enabled or not
             * @return the next update stage
             */
            Update withSessionLevelPackagesEnabled(Boolean sessionLevelPackagesEnabled);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify SparkConfigProperties.
         */
        interface WithSparkConfigProperties {
            /**
             * Specifies sparkConfigProperties.
             * @param sparkConfigProperties Spark configuration file to specify additional properties
             * @return the next update stage
             */
            Update withSparkConfigProperties(LibraryRequirements sparkConfigProperties);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify SparkEventsFolder.
         */
        interface WithSparkEventsFolder {
            /**
             * Specifies sparkEventsFolder.
             * @param sparkEventsFolder The Spark events folder
             * @return the next update stage
             */
            Update withSparkEventsFolder(String sparkEventsFolder);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify SparkVersion.
         */
        interface WithSparkVersion {
            /**
             * Specifies sparkVersion.
             * @param sparkVersion The Apache Spark version
             * @return the next update stage
             */
            Update withSparkVersion(String sparkVersion);
        }

        /**
         * The stage of the bigdatapoolresourceinfo update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
