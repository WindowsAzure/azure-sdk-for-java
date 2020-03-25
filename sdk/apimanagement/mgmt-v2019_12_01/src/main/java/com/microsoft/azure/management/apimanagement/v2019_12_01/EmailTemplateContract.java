/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.EmailTemplateContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;
import java.util.List;

/**
 * Type representing EmailTemplateContract.
 */
public interface EmailTemplateContract extends HasInner<EmailTemplateContractInner>, Indexable, Updatable<EmailTemplateContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the body value.
     */
    String body();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isDefault value.
     */
    Boolean isDefault();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    List<EmailTemplateParametersContractProperties> parameters();

    /**
     * @return the subject value.
     */
    String subject();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the EmailTemplateContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of EmailTemplateContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a EmailTemplateContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify Body.
         */
        interface WithBody {
            /**
             * Specifies body.
             * @param body Email Template Body. This should be a valid XDocument
             * @return the next definition stage
             */
            WithCreate withBody(String body);
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the Email Template
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             * @param parameters Email Template Parameter values
             * @return the next definition stage
             */
            WithCreate withParameters(List<EmailTemplateParametersContractProperties> parameters);
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify Subject.
         */
        interface WithSubject {
            /**
             * Specifies subject.
             * @param subject Subject of the Template
             * @return the next definition stage
             */
            WithCreate withSubject(String subject);
        }

        /**
         * The stage of the emailtemplatecontract definition allowing to specify Title.
         */
        interface WithTitle {
            /**
             * Specifies title.
             * @param title Title of the Template
             * @return the next definition stage
             */
            WithCreate withTitle(String title);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<EmailTemplateContract>, DefinitionStages.WithBody, DefinitionStages.WithDescription, DefinitionStages.WithParameters, DefinitionStages.WithSubject, DefinitionStages.WithTitle {
        }
    }
    /**
     * The template for a EmailTemplateContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<EmailTemplateContract>, UpdateStages.WithIfMatch, UpdateStages.WithBody, UpdateStages.WithDescription, UpdateStages.WithParameters, UpdateStages.WithSubject, UpdateStages.WithTitle {
    }

    /**
     * Grouping of EmailTemplateContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the emailtemplatecontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the emailtemplatecontract update allowing to specify Body.
         */
        interface WithBody {
            /**
             * Specifies body.
             * @param body Email Template Body. This should be a valid XDocument
             * @return the next update stage
             */
            Update withBody(String body);
        }

        /**
         * The stage of the emailtemplatecontract update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the Email Template
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the emailtemplatecontract update allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             * @param parameters Email Template Parameter values
             * @return the next update stage
             */
            Update withParameters(List<EmailTemplateParametersContractProperties> parameters);
        }

        /**
         * The stage of the emailtemplatecontract update allowing to specify Subject.
         */
        interface WithSubject {
            /**
             * Specifies subject.
             * @param subject Subject of the Template
             * @return the next update stage
             */
            Update withSubject(String subject);
        }

        /**
         * The stage of the emailtemplatecontract update allowing to specify Title.
         */
        interface WithTitle {
            /**
             * Specifies title.
             * @param title Title of the Template
             * @return the next update stage
             */
            Update withTitle(String title);
        }

    }
}
