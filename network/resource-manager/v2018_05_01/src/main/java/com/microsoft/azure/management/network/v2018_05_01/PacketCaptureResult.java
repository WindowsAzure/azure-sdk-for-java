/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_05_01.implementation.PacketCaptureResultInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing PacketCaptureResult.
 */
public interface PacketCaptureResult extends HasInner<PacketCaptureResultInner>, Indexable, Refreshable<PacketCaptureResult>, Updatable<PacketCaptureResult.Update>, HasManager<NetworkManager> {
    /**
     * @return the bytesToCapturePerPacket value.
     */
    Integer bytesToCapturePerPacket();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the filters value.
     */
    List<PacketCaptureFilter> filters();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the storageLocation value.
     */
    PacketCaptureStorageLocation storageLocation();

    /**
     * @return the target value.
     */
    String target();

    /**
     * @return the timeLimitInSeconds value.
     */
    Integer timeLimitInSeconds();

    /**
     * @return the totalBytesPerSession value.
     */
    Integer totalBytesPerSession();

    /**
     * The entirety of the PacketCaptureResult definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetworkWatcher, DefinitionStages.WithStorageLocation, DefinitionStages.WithTarget, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PacketCaptureResult definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PacketCaptureResult definition.
         */
        interface Blank extends WithNetworkWatcher {
        }

        /**
         * The stage of the packetcaptureresult definition allowing to specify NetworkWatcher.
         */
        interface WithNetworkWatcher {
           /**
            * Specifies resourceGroupName, networkWatcherName.
            * @param resourceGroupName The name of the resource group
            * @param networkWatcherName The name of the network watcher
            * @return the next definition stage
            */
            WithStorageLocation withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName);
        }

        /**
         * The stage of the packetcaptureresult definition allowing to specify StorageLocation.
         */
        interface WithStorageLocation {
           /**
            * Specifies storageLocation.
            * @param storageLocation the storageLocation parameter value
            * @return the next definition stage
            */
            WithTarget withStorageLocation(PacketCaptureStorageLocation storageLocation);
        }

        /**
         * The stage of the packetcaptureresult definition allowing to specify Target.
         */
        interface WithTarget {
           /**
            * Specifies target.
            * @param target The ID of the targeted resource, only VM is currently supported
            * @return the next definition stage
            */
            WithCreate withTarget(String target);
        }

        /**
         * The stage of the packetcaptureresult definition allowing to specify BytesToCapturePerPacket.
         */
        interface WithBytesToCapturePerPacket {
            /**
             * Specifies bytesToCapturePerPacket.
             * @param bytesToCapturePerPacket Number of bytes captured per packet, the remaining bytes are truncated
             * @return the next definition stage
             */
            WithCreate withBytesToCapturePerPacket(Integer bytesToCapturePerPacket);
        }

        /**
         * The stage of the packetcaptureresult definition allowing to specify Filters.
         */
        interface WithFilters {
            /**
             * Specifies filters.
             * @param filters the filters parameter value
             * @return the next definition stage
             */
            WithCreate withFilters(List<PacketCaptureFilter> filters);
        }

        /**
         * The stage of the packetcaptureresult definition allowing to specify TimeLimitInSeconds.
         */
        interface WithTimeLimitInSeconds {
            /**
             * Specifies timeLimitInSeconds.
             * @param timeLimitInSeconds Maximum duration of the capture session in seconds
             * @return the next definition stage
             */
            WithCreate withTimeLimitInSeconds(Integer timeLimitInSeconds);
        }

        /**
         * The stage of the packetcaptureresult definition allowing to specify TotalBytesPerSession.
         */
        interface WithTotalBytesPerSession {
            /**
             * Specifies totalBytesPerSession.
             * @param totalBytesPerSession Maximum size of the capture output
             * @return the next definition stage
             */
            WithCreate withTotalBytesPerSession(Integer totalBytesPerSession);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PacketCaptureResult>, DefinitionStages.WithBytesToCapturePerPacket, DefinitionStages.WithFilters, DefinitionStages.WithTimeLimitInSeconds, DefinitionStages.WithTotalBytesPerSession {
        }
    }
    /**
     * The template for a PacketCaptureResult update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PacketCaptureResult>, UpdateStages.WithBytesToCapturePerPacket, UpdateStages.WithFilters, UpdateStages.WithTimeLimitInSeconds, UpdateStages.WithTotalBytesPerSession {
    }

    /**
     * Grouping of PacketCaptureResult update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the packetcaptureresult update allowing to specify BytesToCapturePerPacket.
         */
        interface WithBytesToCapturePerPacket {
            /**
             * Specifies bytesToCapturePerPacket.
             * @param bytesToCapturePerPacket Number of bytes captured per packet, the remaining bytes are truncated
             * @return the next update stage
             */
            Update withBytesToCapturePerPacket(Integer bytesToCapturePerPacket);
        }

        /**
         * The stage of the packetcaptureresult update allowing to specify Filters.
         */
        interface WithFilters {
            /**
             * Specifies filters.
             * @param filters the filters parameter value
             * @return the next update stage
             */
            Update withFilters(List<PacketCaptureFilter> filters);
        }

        /**
         * The stage of the packetcaptureresult update allowing to specify TimeLimitInSeconds.
         */
        interface WithTimeLimitInSeconds {
            /**
             * Specifies timeLimitInSeconds.
             * @param timeLimitInSeconds Maximum duration of the capture session in seconds
             * @return the next update stage
             */
            Update withTimeLimitInSeconds(Integer timeLimitInSeconds);
        }

        /**
         * The stage of the packetcaptureresult update allowing to specify TotalBytesPerSession.
         */
        interface WithTotalBytesPerSession {
            /**
             * Specifies totalBytesPerSession.
             * @param totalBytesPerSession Maximum size of the capture output
             * @return the next update stage
             */
            Update withTotalBytesPerSession(Integer totalBytesPerSession);
        }

    }
}
