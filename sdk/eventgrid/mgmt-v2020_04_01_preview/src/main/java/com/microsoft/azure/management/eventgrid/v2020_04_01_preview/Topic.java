/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.EventGridManager;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.TopicInner;

/**
 * Type representing Topic.
 */
public interface Topic extends HasInner<TopicInner>, Resource, GroupableResourceCore<EventGridManager, TopicInner>, HasResourceGroup, Refreshable<Topic>, Updatable<Topic.Update>, HasManager<EventGridManager> {
    /**
     * @return the allowTrafficFromAllIPs value.
     */
    Boolean allowTrafficFromAllIPs();

    /**
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * @return the inboundIpRules value.
     */
    List<InboundIpRule> inboundIpRules();

    /**
     * @return the inputSchema value.
     */
    InputSchema inputSchema();

    /**
     * @return the inputSchemaMapping value.
     */
    InputSchemaMapping inputSchemaMapping();

    /**
     * @return the metricResourceId value.
     */
    String metricResourceId();

    /**
     * @return the provisioningState value.
     */
    TopicProvisioningState provisioningState();

    /**
     * The entirety of the Topic definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Topic definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Topic definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Topic definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the topic definition allowing to specify AllowTrafficFromAllIPs.
         */
        interface WithAllowTrafficFromAllIPs {
            /**
             * Specifies allowTrafficFromAllIPs.
             * @param allowTrafficFromAllIPs This determines if IP filtering rules ought to be evaluated or not. By default it will not evaluate and will allow traffic from all IPs
             * @return the next definition stage
             */
            WithCreate withAllowTrafficFromAllIPs(Boolean allowTrafficFromAllIPs);
        }

        /**
         * The stage of the topic definition allowing to specify InboundIpRules.
         */
        interface WithInboundIpRules {
            /**
             * Specifies inboundIpRules.
             * @param inboundIpRules This determines the IP filtering rules that ought to be applied when events are received on this topic
             * @return the next definition stage
             */
            WithCreate withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }

        /**
         * The stage of the topic definition allowing to specify InputSchema.
         */
        interface WithInputSchema {
            /**
             * Specifies inputSchema.
             * @param inputSchema This determines the format that Event Grid should expect for incoming events published to the topic. Possible values include: 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'
             * @return the next definition stage
             */
            WithCreate withInputSchema(InputSchema inputSchema);
        }

        /**
         * The stage of the topic definition allowing to specify InputSchemaMapping.
         */
        interface WithInputSchemaMapping {
            /**
             * Specifies inputSchemaMapping.
             * @param inputSchemaMapping This enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema
             * @return the next definition stage
             */
            WithCreate withInputSchemaMapping(InputSchemaMapping inputSchemaMapping);
        }

        /**
         * The stage of the topic definition allowing to specify MetricResourceId.
         */
        interface WithMetricResourceId {
            /**
             * Specifies metricResourceId.
             * @param metricResourceId Metric resource id for the topic
             * @return the next definition stage
             */
            WithCreate withMetricResourceId(String metricResourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Topic>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAllowTrafficFromAllIPs, DefinitionStages.WithInboundIpRules, DefinitionStages.WithInputSchema, DefinitionStages.WithInputSchemaMapping, DefinitionStages.WithMetricResourceId {
        }
    }
    /**
     * The template for a Topic update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Topic>, Resource.UpdateWithTags<Update>, UpdateStages.WithAllowTrafficFromAllIPs, UpdateStages.WithInboundIpRules, UpdateStages.WithInputSchema, UpdateStages.WithInputSchemaMapping, UpdateStages.WithMetricResourceId {
    }

    /**
     * Grouping of Topic update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the topic update allowing to specify AllowTrafficFromAllIPs.
         */
        interface WithAllowTrafficFromAllIPs {
            /**
             * Specifies allowTrafficFromAllIPs.
             * @param allowTrafficFromAllIPs This determines if IP filtering rules ought to be evaluated or not. By default it will not evaluate and will allow traffic from all IPs
             * @return the next update stage
             */
            Update withAllowTrafficFromAllIPs(Boolean allowTrafficFromAllIPs);
        }

        /**
         * The stage of the topic update allowing to specify InboundIpRules.
         */
        interface WithInboundIpRules {
            /**
             * Specifies inboundIpRules.
             * @param inboundIpRules This determines the IP filtering rules that ought to be applied when events are received on this topic
             * @return the next update stage
             */
            Update withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }

        /**
         * The stage of the topic update allowing to specify InputSchema.
         */
        interface WithInputSchema {
            /**
             * Specifies inputSchema.
             * @param inputSchema This determines the format that Event Grid should expect for incoming events published to the topic. Possible values include: 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'
             * @return the next update stage
             */
            Update withInputSchema(InputSchema inputSchema);
        }

        /**
         * The stage of the topic update allowing to specify InputSchemaMapping.
         */
        interface WithInputSchemaMapping {
            /**
             * Specifies inputSchemaMapping.
             * @param inputSchemaMapping This enables publishing using custom event schemas. An InputSchemaMapping can be specified to map various properties of a source schema to various required properties of the EventGridEvent schema
             * @return the next update stage
             */
            Update withInputSchemaMapping(InputSchemaMapping inputSchemaMapping);
        }

        /**
         * The stage of the topic update allowing to specify MetricResourceId.
         */
        interface WithMetricResourceId {
            /**
             * Specifies metricResourceId.
             * @param metricResourceId Metric resource id for the topic
             * @return the next update stage
             */
            Update withMetricResourceId(String metricResourceId);
        }

    }
}
