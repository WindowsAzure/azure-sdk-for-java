/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_02_01.implementation.ServiceEndpointPolicyDefinitionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_02_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing ServiceEndpointPolicyDefinition.
 */
public interface ServiceEndpointPolicyDefinition extends HasInner<ServiceEndpointPolicyDefinitionInner>, Indexable, Refreshable<ServiceEndpointPolicyDefinition>, Updatable<ServiceEndpointPolicyDefinition.Update>, HasManager<NetworkManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the etag value.
     */
    String etag();

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
    String provisioningState();

    /**
     * @return the service value.
     */
    String service();

    /**
     * @return the serviceResources value.
     */
    List<String> serviceResources();

    /**
     * The entirety of the ServiceEndpointPolicyDefinition definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServiceEndpointPolicy, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServiceEndpointPolicyDefinition definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServiceEndpointPolicyDefinition definition.
         */
        interface Blank extends WithServiceEndpointPolicy {
        }

        /**
         * The stage of the serviceendpointpolicydefinition definition allowing to specify ServiceEndpointPolicy.
         */
        interface WithServiceEndpointPolicy {
           /**
            * Specifies resourceGroupName, serviceEndpointPolicyName.
            * @param resourceGroupName The name of the resource group
            * @param serviceEndpointPolicyName The name of the service endpoint policy
            * @return the next definition stage
            */
            WithCreate withExistingServiceEndpointPolicy(String resourceGroupName, String serviceEndpointPolicyName);
        }

        /**
         * The stage of the serviceendpointpolicydefinition definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description A description for this rule. Restricted to 140 chars
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the serviceendpointpolicydefinition definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the serviceendpointpolicydefinition definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the serviceendpointpolicydefinition definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the serviceendpointpolicydefinition definition allowing to specify Service.
         */
        interface WithService {
            /**
             * Specifies service.
             * @param service Service endpoint name
             * @return the next definition stage
             */
            WithCreate withService(String service);
        }

        /**
         * The stage of the serviceendpointpolicydefinition definition allowing to specify ServiceResources.
         */
        interface WithServiceResources {
            /**
             * Specifies serviceResources.
             * @param serviceResources A list of service resources
             * @return the next definition stage
             */
            WithCreate withServiceResources(List<String> serviceResources);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServiceEndpointPolicyDefinition>, DefinitionStages.WithDescription, DefinitionStages.WithEtag, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithService, DefinitionStages.WithServiceResources {
        }
    }
    /**
     * The template for a ServiceEndpointPolicyDefinition update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServiceEndpointPolicyDefinition>, UpdateStages.WithDescription, UpdateStages.WithEtag, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithService, UpdateStages.WithServiceResources {
    }

    /**
     * Grouping of ServiceEndpointPolicyDefinition update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serviceendpointpolicydefinition update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description A description for this rule. Restricted to 140 chars
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the serviceendpointpolicydefinition update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the serviceendpointpolicydefinition update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the serviceendpointpolicydefinition update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the serviceendpointpolicydefinition update allowing to specify Service.
         */
        interface WithService {
            /**
             * Specifies service.
             * @param service Service endpoint name
             * @return the next update stage
             */
            Update withService(String service);
        }

        /**
         * The stage of the serviceendpointpolicydefinition update allowing to specify ServiceResources.
         */
        interface WithServiceResources {
            /**
             * Specifies serviceResources.
             * @param serviceResources A list of service resources
             * @return the next update stage
             */
            Update withServiceResources(List<String> serviceResources);
        }

    }
}
