/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.containerinstance;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.containerinstance.implementation.ContainerGroupInner;
import com.microsoft.azure.management.containerinstance.implementation.ContainerInstanceManager;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.model.Attachable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;

import java.util.Map;

/**
 * An immutable client-side representation of an Azure Container Group.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_2_0)
public interface ContainerGroup extends
    GroupableResource<ContainerInstanceManager, ContainerGroupInner>,
    Refreshable<ContainerGroup> {

    /***********************************************************
     * Getters
     ***********************************************************/


    /***********************************************************
     * Actions
     ***********************************************************/


    /**
     * The entirety of the Azure Container Instance service container group definition.
     */
    interface Definition extends
        DefinitionStages.Blank,
        DefinitionStages.WithGroup,
        DefinitionStages.WithOsType,
        DefinitionStages.WithPrivateImageRegistry,
        DefinitionStages.WithVolume,
        DefinitionStages.WithFirstContainerInstance,
        DefinitionStages.WithNextContainerInstance,
        DefinitionStages.WithCreate {
    }

    /**
     * Grouping of the container group definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the container group definition.
         */
        interface Blank
            extends GroupableResource.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the container group definition allowing to specify the resource group.
         */
        interface WithGroup
            extends GroupableResource.DefinitionStages.WithGroup<DefinitionStages.WithOsType> {
        }

        /**
         * The stage of the container group definition allowing to specify the OS type.
         */
        interface WithOsType {
            /**
             * Specifies this is a Linux container group.
             *
             * @return the next stage of the definition
             */
            WithPrivateImageRegistry withLinux();

            /**
             * Specifies this is a Windows container group.
             *
             * @return the next stage of the definition
             */
            WithPrivateImageRegistry withWindows();
        }

        /**
         * The stage of the container group definition allowing to specify a private image registry.
         */
        interface WithPrivateImageRegistry extends WithVolume {
            /**
             * Specifies the private container image registry server login for the container group.
             *
             * @param server Docker image registry server, without protocol such as "http" and "https"
             * @param username the username for the private registry
             * @param password the password for the private registry
             * @return the next stage of the definition
             */
            WithVolume withPrivateImageRegistry(String server, String username, String password);
        }

        /**
         * The stage of the container group definition allowing to specify a volume to be mounted inside a container instance.
         */
        interface WithVolume extends WithFirstContainerInstance {
            /**
             * Begins the definition of a volume to be made available to the container instances for mounting.
             *
             * <p>
             * The definition must be completed with a call to {@link VolumeDefinitionStages.WithAttach#attach()}
             * @param name the name of the volume
             * @return the next stage of the definition
             */
            VolumeDefinitionStages.Blank<WithVolume> defineVolume(String name);
        }

        /**
         * Grouping of volume definition stages.
         */
        interface VolumeDefinitionStages {
            /**
             * The first stage of the volume definition.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface Blank<ParentT> extends WithAzureFileShare<ParentT> {
            }

            /**
             * The stage of the volume definition allowing to specify a read only Azure File Share name.
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithAzureFileShare<ParentT> {
                /**
                 * Specifies an existing Azure file share name.
                 *
                 * @param shareName an existing Azure file share name
                 * @return the next stage of the definition
                 */
                WithStorageAccountName<ParentT> withExistingReadWriteAzureFileShare(String shareName);

                /**
                 * Specifies an existing Azure file share name.
                 *
                 * @param shareName an existing Azure file share name
                 * @return the next stage of the definition
                 */
                WithStorageAccountName<ParentT> withExistingReadOnlyAzureFileShare(String shareName);

                /**
                 * Specifies an existing Azure file share name.
                 *
                 * @param shareName the Azure file share name to be created
                 * @return the next stage of the definition
                 */
                WithAttach<ParentT> withNewAzureFileShare(String shareName);
            }

            /**
             * The stage of the volume definition allowing to specify the storage account name to access to the Azure file.
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithStorageAccountName<ParentT> {
                /**
                 * Specifies the storage account name to access to the Azure file.
                 *
                 * @param storageAccountName the storage account name
                 * @return the next stage of the definition
                 */
                WithStorageAccountKey<ParentT> withStorageAccountName(String storageAccountName);
            }

            /**
             * The stage of the volume definition allowing to specify the storage account key to access to the Azure file.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithStorageAccountKey<ParentT> {
                /**
                 * Specifies the storage account key to access to the Azure file.
                 *
                 * @param storageAccountKey the storage account key
                 * @return the next stage of the definition
                 */
                WithAttach<ParentT> withStorageAccountKey(String storageAccountKey);
            }

            /** The final stage of the volume definition.
             * <p>
             * At this stage, any remaining optional settings can be specified, or the subnet definition
             * can be attached to the parent virtual network definition.
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithAttach<ParentT> extends
                Attachable.InDefinition<ParentT> {
            }

            /**
             * Grouping of the container group's volume definition stages.
             */
            interface VolumeDefinition<ParentT> extends
                WithAzureFileShare<ParentT>,
                WithStorageAccountName<ParentT>,
                WithStorageAccountKey<ParentT>,
                WithAttach<ParentT> {
            }
        }

        /**
         * The stage of the container group definition allowing to specify first required container instance.
         */
        interface WithFirstContainerInstance {
            /**
             * Begins the definition of a container instance.
             *
             * <p>
             * The definition must be completed with a call to {@link ContainerInstanceDefinitionStages.WithAttach#attach()}
             * @param name the name of the volume
             * @return the next stage of the definition
             */
            ContainerInstanceDefinitionStages.Blank<WithNextContainerInstance> defineContainerInstance(String name);
        }

        /**
         * The stage of the container group definition allowing to specify a container instance.
         */
        interface WithNextContainerInstance extends WithCreate {
            /**
             * Begins the definition of a container instance.
             *
             * <p>
             * The definition must be completed with a call to {@link ContainerInstanceDefinitionStages.WithAttach#attach()}
             * @param name the name of the volume
             * @return the next stage of the definition
             */
            ContainerInstanceDefinitionStages.Blank<WithNextContainerInstance> defineContainerInstance(String name);
        }

        /**
         * Grouping of volume definition stages.
         */
        interface ContainerInstanceDefinitionStages {
            /**
             * The first stage of the container instance definition.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface Blank<ParentT> extends WithImage<ParentT> {
            }

            /**
             * The stage of the container instance definition allowing to specify the container image.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithImage<ParentT> {
                /**
                 * Specifies the container image to be used.
                 *
                 * @param imageName the container image
                 * @return the next stage of the definition
                 */
                WithCPUCoreCount<ParentT> withImage(String imageName);
            }

            /**
             * The stage of the container instance definition allowing to specify the number of CPU cores.
             * <p>
             * The CPU cores can be specified as a fraction, i.e. 1.5 represents one and a half atomic CPU cores
             *   will be assigned to this container instance.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithCPUCoreCount<ParentT> {
                /**
                 * Specifies the number of CPU cores assigned to this container instance.
                 *
                 * @param cpuCoreCount the number of CPU cores
                 * @return the next stage of the definition
                 */
                WithMemorySize<ParentT> withCPUCoreCount(double cpuCoreCount);
            }

            /**
             * The stage of the container instance definition allowing to specify the memory size in GB.
             * <p>
             * The memory size can be specified as a fraction, i.e. 1.5 represents one and a half GB of memory.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithMemorySize<ParentT> {
                /**
                 * Specifies the memory size in GB assigned to this container instance.
                 *
                 * @param memorySize the memory size in GB
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withMemorySizeInGB(double memorySize);
            }

            /**
             * The stage of the container instance definition allowing to specify the container ports.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithPorts<ParentT> extends WithStartingCommandLine<ParentT> {
                /**
                 * Specifies the container's TCP ports available to external clients.
                 * <p>
                 * A public IP address will be create to allow external clients to reach the containers within the group.
                 * To enable external clients to reach a container within the group, you must expose the port on the
                 *   IP address and from the container. Because containers within the group share a port namespace, port
                 *   mapping is not supported.
                 *
                 * @param ports array of TCP ports to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withExternalTcpPorts(int... ports);

                /**
                 * Specifies the container's TCP port available to external clients.
                 * <p>
                 * A public IP address will be create to allow external clients to reach the containers within the group.
                 * To enable external clients to reach a container within the group, you must expose the port on the
                 *   IP address and from the container. Because containers within the group share a port namespace, port
                 *   mapping is not supported.
                 *
                 * @param port TCP port to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withExternalTcpPort(int port);

                /**
                 * Specifies the container's UDP ports available to external clients.
                 * <p>
                 * A public IP address will be create to allow external clients to reach the containers within the group.
                 * To enable external clients to reach a container within the group, you must expose the port on the
                 *   IP address and from the container. Because containers within the group share a port namespace, port
                 *   mapping is not supported.
                 *
                 * @param ports array of UDP ports to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withExternalUdpPorts(int... ports);

                /**
                 * Specifies the container's UDP port available to external clients.
                 * <p>
                 * A public IP address will be create to allow external clients to reach the containers within the group.
                 * To enable external clients to reach a container within the group, you must expose the port on the
                 *   IP address and from the container. Because containers within the group share a port namespace, port
                 *   mapping is not supported.
                 *
                 * @param port UDP port to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withExternalUdpPort(int port);

                /**
                 * Specifies the container's TCP ports available to internal clients (other container instances within the container group).
                 * <p>
                 * Containers within a group can reach each other via localhost on the ports that they have exposed,
                 *   even if those ports are not exposed externally on the group's IP address.
                 *
                 * @param ports array of TCP ports to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withInternalTcpPorts(int... ports);

                /**
                 * Specifies the container's TCP port available to internal clients (other container instances within the container group).
                 * <p>
                 * Containers within a group can reach each other via localhost on the ports that they have exposed,
                 *   even if those ports are not exposed externally on the group's IP address.
                 *
                 * @param port TCP port to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withInternalTcpPort(int port);

                /**
                 * Specifies the container's UDP ports available to internal clients (other container instances within the container group).
                 * <p>
                 * Containers within a group can reach each other via localhost on the ports that they have exposed,
                 *   even if those ports are not exposed externally on the group's IP address.
                 *
                 * @param ports array of UDP ports to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withInternalUdpPorts(int... ports);

                /**
                 * Specifies the container's UDP port available to internal clients (other container instances within the container group).
                 * <p>
                 * Containers within a group can reach each other via localhost on the ports that they have exposed,
                 *   even if those ports are not exposed externally on the group's IP address.
                 *
                 * @param port UDP port to be exposed externally
                 * @return the next stage of the definition
                 */
                WithPorts<ParentT> withInternalUdpPort(int port);
            }

            /**
             * The stage of the container instance definition allowing to specify the starting command line.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithStartingCommandLine<ParentT> extends WithEnvironmentVariables<ParentT> {
                /**
                 * Specifies the starting command lines.
                 *
                 * @param commandLines the starting command lines the container will execute after it gets initialized
                 * @return the next stage of the definition
                 */
                WithStartingCommandLine<ParentT> withStartingCommandLines(String... commandLines);

                /**
                 * Specifies the starting command line.
                 *
                 * @param commandLine the starting command line the container will execute after it gets initialized
                 * @return the next stage of the definition
                 */
                WithStartingCommandLine<ParentT> withStartingCommandLine(String commandLine);
            }

            /**
             * The stage of the container instance definition allowing to specify the environment variables.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithEnvironmentVariables<ParentT> extends WithVolumeMountSetting<ParentT> {
                /**
                 * Specifies the environment variables.
                 *
                 * @param environmentVariables the environment variables in a name and value pair to be set after the container gets initialized
                 * @return the next stage of the definition
                 */
                WithEnvironmentVariables<ParentT> withEnvironmentVariables(Map<String, String> environmentVariables);

                /**
                 * Specifies the environment variable.
                 *
                 * @param envName the environment variable name
                 * @param envValue the environment variable value
                 * @return the next stage of the definition
                 */
                WithEnvironmentVariables<ParentT> withEnvironmentVariable(String envName, String envValue);
            }

            /**
             * The stage of the container instance definition allowing to specify volume mount setting.
             *
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithVolumeMountSetting<ParentT> extends WithAttach<ParentT> {
                /**
                 * Specifies the container group's volume to be mounted by the container instance at a specified mount path.
                 * <p>
                 * Mounting an Azure file share as a volume in a container is a two-step process. First, you provide
                 *   the details of the share as part of defining the container group, then you specify how you wan
                 *   the volume mounted within one or more of the containers in the group.
                 *
                 * @param volumeName the volume name as defined in the volumes of the container group
                 * @param mountPath the local path the volume will be mounted at
                 * @return the next stage of the definition
                 */
                WithVolumeMountSetting<ParentT> withVolumeMountSetting(String volumeName, String mountPath);

                /**
                 * Specifies the container group's volume to be mounted by the container instance at a specified mount path.
                 * <p>
                 * Mounting an Azure file share as a volume in a container is a two-step process. First, you provide
                 *   the details of the share as part of defining the container group, then you specify how you wan
                 *   the volume mounted within one or more of the containers in the group.
                 *
                 * @param volumeMountSetting the name and value pair representing volume names as defined in the volumes of the container group and the local paths the volume will be mounted at
                 * @return the next stage of the definition
                 */
                WithVolumeMountSetting<ParentT> withVolumeMountSetting(Map<String, String> volumeMountSetting);

                /**
                 * Specifies the container group's volume to be mounted by the container instance at a specified mount path.
                 * <p>
                 * Mounting an Azure file share as a volume in a container is a two-step process. First, you provide
                 *   the details of the share as part of defining the container group, then you specify how you wan
                 *   the volume mounted within one or more of the containers in the group.
                 *
                 * @param volumeName the volume name as defined in the volumes of the container group
                 * @param mountPath the local path the volume will be mounted at
                 * @return the next stage of the definition
                 */
                WithVolumeMountSetting<ParentT> withReadOnlyVolumeMountSetting(String volumeName, String mountPath);

                /**
                 * Specifies the container group's volume to be mounted by the container instance at a specified mount path.
                 * <p>
                 * Mounting an Azure file share as a volume in a container is a two-step process. First, you provide
                 *   the details of the share as part of defining the container group, then you specify how you wan
                 *   the volume mounted within one or more of the containers in the group.
                 *
                 * @param volumeMountSetting the name and value pair representing volume names as defined in the volumes of the container group and the local paths the volume will be mounted at
                 * @return the next stage of the definition
                 */
                WithVolumeMountSetting<ParentT> withReadOnlyVolumeMountSetting(Map<String, String> volumeMountSetting);
            }

            /** The final stage of the container instance definition.
             * <p>
             * At this stage, any remaining optional settings can be specified, or the subnet definition
             * can be attached to the parent virtual network definition.
             * @param <ParentT> the stage of the parent definition to return to after attaching this definition
             */
            interface WithAttach<ParentT> extends
                Attachable.InDefinition<ParentT> {
            }

            /**
             * Grouping of the container group's volume definition stages.
             */
            interface ContainerInstanceDefinition<ParentT> extends
                WithImage<ParentT>,
                WithCPUCoreCount<ParentT>,
                WithMemorySize<ParentT>,
                WithPorts<ParentT>,
                WithStartingCommandLine<ParentT>,
                WithEnvironmentVariables<ParentT>,
                WithVolumeMountSetting<ParentT>,
                WithAttach<ParentT> {
            }
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for the resource to be created
         *   (via {@link WithCreate#create()}), but also allows for any other optional settings to be specified.
         */
        interface WithCreate extends
            Creatable<ContainerGroup>,
            Resource.DefinitionWithTags<WithCreate> {
        }
    }
}
