/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cdn.v2020_04_15.implementation.OriginInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_04_15.implementation.CdnManager;
import java.util.Map;

/**
 * Type representing Origin.
 */
public interface Origin extends HasInner<OriginInner>, Indexable, Refreshable<Origin>, Updatable<Origin.Update>, HasManager<CdnManager> {
    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the hostName value.
     */
    String hostName();

    /**
     * @return the httpPort value.
     */
    Integer httpPort();

    /**
     * @return the httpsPort value.
     */
    Integer httpsPort();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the originHostHeader value.
     */
    String originHostHeader();

    /**
     * @return the priority value.
     */
    Integer priority();

    /**
     * @return the privateEndpointStatus value.
     */
    PrivateEndpointStatus privateEndpointStatus();

    /**
     * @return the privateLinkAlias value.
     */
    String privateLinkAlias();

    /**
     * @return the privateLinkApprovalMessage value.
     */
    String privateLinkApprovalMessage();

    /**
     * @return the privateLinkLocation value.
     */
    String privateLinkLocation();

    /**
     * @return the privateLinkResourceId value.
     */
    String privateLinkResourceId();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceState value.
     */
    OriginResourceState resourceState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the weight value.
     */
    Integer weight();

    /**
     * The entirety of the Origin definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithEndpoint, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Origin definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Origin definition.
         */
        interface Blank extends WithEndpoint {
        }

        /**
         * The stage of the origin definition allowing to specify Endpoint.
         */
        interface WithEndpoint {
           /**
            * Specifies resourceGroupName, profileName, endpointName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param profileName Name of the CDN profile which is unique within the resource group
            * @param endpointName Name of the endpoint under the profile which is unique globally
            * @return the next definition stage
            */
            WithLocation withExistingEndpoint(String resourceGroupName, String profileName, String endpointName);
        }

        /**
         * The stage of the origin definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the origin definition allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled Origin is enabled for load balancing or not
             * @return the next definition stage
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the origin definition allowing to specify HostName.
         */
        interface WithHostName {
            /**
             * Specifies hostName.
             * @param hostName The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint
             * @return the next definition stage
             */
            WithCreate withHostName(String hostName);
        }

        /**
         * The stage of the origin definition allowing to specify HttpPort.
         */
        interface WithHttpPort {
            /**
             * Specifies httpPort.
             * @param httpPort The value of the HTTP port. Must be between 1 and 65535
             * @return the next definition stage
             */
            WithCreate withHttpPort(Integer httpPort);
        }

        /**
         * The stage of the origin definition allowing to specify HttpsPort.
         */
        interface WithHttpsPort {
            /**
             * Specifies httpsPort.
             * @param httpsPort The value of the HTTPS port. Must be between 1 and 65535
             * @return the next definition stage
             */
            WithCreate withHttpsPort(Integer httpsPort);
        }

        /**
         * The stage of the origin definition allowing to specify OriginHostHeader.
         */
        interface WithOriginHostHeader {
            /**
             * Specifies originHostHeader.
             * @param originHostHeader The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
             * @return the next definition stage
             */
            WithCreate withOriginHostHeader(String originHostHeader);
        }

        /**
         * The stage of the origin definition allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
             * @return the next definition stage
             */
            WithCreate withPriority(Integer priority);
        }

        /**
         * The stage of the origin definition allowing to specify PrivateLinkAlias.
         */
        interface WithPrivateLinkAlias {
            /**
             * Specifies privateLinkAlias.
             * @param privateLinkAlias The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
             * @return the next definition stage
             */
            WithCreate withPrivateLinkAlias(String privateLinkAlias);
        }

        /**
         * The stage of the origin definition allowing to specify PrivateLinkApprovalMessage.
         */
        interface WithPrivateLinkApprovalMessage {
            /**
             * Specifies privateLinkApprovalMessage.
             * @param privateLinkApprovalMessage A custom message to be included in the approval request to connect to the Private Link
             * @return the next definition stage
             */
            WithCreate withPrivateLinkApprovalMessage(String privateLinkApprovalMessage);
        }

        /**
         * The stage of the origin definition allowing to specify PrivateLinkLocation.
         */
        interface WithPrivateLinkLocation {
            /**
             * Specifies privateLinkLocation.
             * @param privateLinkLocation The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
             * @return the next definition stage
             */
            WithCreate withPrivateLinkLocation(String privateLinkLocation);
        }

        /**
         * The stage of the origin definition allowing to specify PrivateLinkResourceId.
         */
        interface WithPrivateLinkResourceId {
            /**
             * Specifies privateLinkResourceId.
             * @param privateLinkResourceId The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
             * @return the next definition stage
             */
            WithCreate withPrivateLinkResourceId(String privateLinkResourceId);
        }

        /**
         * The stage of the origin definition allowing to specify Tags.
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
         * The stage of the origin definition allowing to specify Weight.
         */
        interface WithWeight {
            /**
             * Specifies weight.
             * @param weight Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
             * @return the next definition stage
             */
            WithCreate withWeight(Integer weight);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Origin>, DefinitionStages.WithEnabled, DefinitionStages.WithHostName, DefinitionStages.WithHttpPort, DefinitionStages.WithHttpsPort, DefinitionStages.WithOriginHostHeader, DefinitionStages.WithPriority, DefinitionStages.WithPrivateLinkAlias, DefinitionStages.WithPrivateLinkApprovalMessage, DefinitionStages.WithPrivateLinkLocation, DefinitionStages.WithPrivateLinkResourceId, DefinitionStages.WithTags, DefinitionStages.WithWeight {
        }
    }
    /**
     * The template for a Origin update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Origin>, UpdateStages.WithEnabled, UpdateStages.WithHostName, UpdateStages.WithHttpPort, UpdateStages.WithHttpsPort, UpdateStages.WithOriginHostHeader, UpdateStages.WithPriority, UpdateStages.WithPrivateLinkAlias, UpdateStages.WithPrivateLinkApprovalMessage, UpdateStages.WithPrivateLinkLocation, UpdateStages.WithPrivateLinkResourceId, UpdateStages.WithTags, UpdateStages.WithWeight {
    }

    /**
     * Grouping of Origin update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the origin update allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled Origin is enabled for load balancing or not
             * @return the next update stage
             */
            Update withEnabled(Boolean enabled);
        }

        /**
         * The stage of the origin update allowing to specify HostName.
         */
        interface WithHostName {
            /**
             * Specifies hostName.
             * @param hostName The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint
             * @return the next update stage
             */
            Update withHostName(String hostName);
        }

        /**
         * The stage of the origin update allowing to specify HttpPort.
         */
        interface WithHttpPort {
            /**
             * Specifies httpPort.
             * @param httpPort The value of the HTTP port. Must be between 1 and 65535
             * @return the next update stage
             */
            Update withHttpPort(Integer httpPort);
        }

        /**
         * The stage of the origin update allowing to specify HttpsPort.
         */
        interface WithHttpsPort {
            /**
             * Specifies httpsPort.
             * @param httpsPort The value of the HTTPS port. Must be between 1 and 65535
             * @return the next update stage
             */
            Update withHttpsPort(Integer httpsPort);
        }

        /**
         * The stage of the origin update allowing to specify OriginHostHeader.
         */
        interface WithOriginHostHeader {
            /**
             * Specifies originHostHeader.
             * @param originHostHeader The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
             * @return the next update stage
             */
            Update withOriginHostHeader(String originHostHeader);
        }

        /**
         * The stage of the origin update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
             * @return the next update stage
             */
            Update withPriority(Integer priority);
        }

        /**
         * The stage of the origin update allowing to specify PrivateLinkAlias.
         */
        interface WithPrivateLinkAlias {
            /**
             * Specifies privateLinkAlias.
             * @param privateLinkAlias The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
             * @return the next update stage
             */
            Update withPrivateLinkAlias(String privateLinkAlias);
        }

        /**
         * The stage of the origin update allowing to specify PrivateLinkApprovalMessage.
         */
        interface WithPrivateLinkApprovalMessage {
            /**
             * Specifies privateLinkApprovalMessage.
             * @param privateLinkApprovalMessage A custom message to be included in the approval request to connect to the Private Link
             * @return the next update stage
             */
            Update withPrivateLinkApprovalMessage(String privateLinkApprovalMessage);
        }

        /**
         * The stage of the origin update allowing to specify PrivateLinkLocation.
         */
        interface WithPrivateLinkLocation {
            /**
             * Specifies privateLinkLocation.
             * @param privateLinkLocation The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
             * @return the next update stage
             */
            Update withPrivateLinkLocation(String privateLinkLocation);
        }

        /**
         * The stage of the origin update allowing to specify PrivateLinkResourceId.
         */
        interface WithPrivateLinkResourceId {
            /**
             * Specifies privateLinkResourceId.
             * @param privateLinkResourceId The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
             * @return the next update stage
             */
            Update withPrivateLinkResourceId(String privateLinkResourceId);
        }

        /**
         * The stage of the origin update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Origin tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the origin update allowing to specify Weight.
         */
        interface WithWeight {
            /**
             * Specifies weight.
             * @param weight Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
             * @return the next update stage
             */
            Update withWeight(Integer weight);
        }

    }
}
