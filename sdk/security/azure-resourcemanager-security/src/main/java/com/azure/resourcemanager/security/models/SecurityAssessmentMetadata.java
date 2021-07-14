// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.SecurityAssessmentMetadataInner;
import java.util.List;

/** An immutable client-side representation of SecurityAssessmentMetadata. */
public interface SecurityAssessmentMetadata {
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
     * Gets the displayName property: User friendly display name of the assessment.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the policyDefinitionId property: Azure resource ID of the policy definition that turns this assessment
     * calculation on.
     *
     * @return the policyDefinitionId value.
     */
    String policyDefinitionId();

    /**
     * Gets the description property: Human readable description of the assessment.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the remediationDescription property: Human readable description of what you should do to mitigate this
     * security issue.
     *
     * @return the remediationDescription value.
     */
    String remediationDescription();

    /**
     * Gets the categories property: The categories property.
     *
     * @return the categories value.
     */
    List<Categories> categories();

    /**
     * Gets the severity property: The severity level of the assessment.
     *
     * @return the severity value.
     */
    Severity severity();

    /**
     * Gets the userImpact property: The user impact of the assessment.
     *
     * @return the userImpact value.
     */
    UserImpact userImpact();

    /**
     * Gets the implementationEffort property: The implementation effort required to remediate this assessment.
     *
     * @return the implementationEffort value.
     */
    ImplementationEffort implementationEffort();

    /**
     * Gets the threats property: The threats property.
     *
     * @return the threats value.
     */
    List<Threats> threats();

    /**
     * Gets the preview property: True if this assessment is in preview release status.
     *
     * @return the preview value.
     */
    Boolean preview();

    /**
     * Gets the assessmentType property: BuiltIn if the assessment based on built-in Azure Policy definition, Custom if
     * the assessment based on custom Azure Policy definition.
     *
     * @return the assessmentType value.
     */
    AssessmentType assessmentType();

    /**
     * Gets the partnerData property: Describes the partner that created the assessment.
     *
     * @return the partnerData value.
     */
    SecurityAssessmentMetadataPartnerData partnerData();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.SecurityAssessmentMetadataInner object.
     *
     * @return the inner object.
     */
    SecurityAssessmentMetadataInner innerModel();

    /** The entirety of the SecurityAssessmentMetadata definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }
    /** The SecurityAssessmentMetadata definition stages. */
    interface DefinitionStages {
        /** The first stage of the SecurityAssessmentMetadata definition. */
        interface Blank extends WithCreate {
        }
        /**
         * The stage of the SecurityAssessmentMetadata definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDisplayName,
                DefinitionStages.WithDescription,
                DefinitionStages.WithRemediationDescription,
                DefinitionStages.WithCategories,
                DefinitionStages.WithSeverity,
                DefinitionStages.WithUserImpact,
                DefinitionStages.WithImplementationEffort,
                DefinitionStages.WithThreats,
                DefinitionStages.WithPreview,
                DefinitionStages.WithAssessmentType,
                DefinitionStages.WithPartnerData {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SecurityAssessmentMetadata create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SecurityAssessmentMetadata create(Context context);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: User friendly display name of the assessment.
             *
             * @param displayName User friendly display name of the assessment.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Human readable description of the assessment.
             *
             * @param description Human readable description of the assessment.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify remediationDescription. */
        interface WithRemediationDescription {
            /**
             * Specifies the remediationDescription property: Human readable description of what you should do to
             * mitigate this security issue.
             *
             * @param remediationDescription Human readable description of what you should do to mitigate this security
             *     issue.
             * @return the next definition stage.
             */
            WithCreate withRemediationDescription(String remediationDescription);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify categories. */
        interface WithCategories {
            /**
             * Specifies the categories property: The categories property..
             *
             * @param categories The categories property.
             * @return the next definition stage.
             */
            WithCreate withCategories(List<Categories> categories);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify severity. */
        interface WithSeverity {
            /**
             * Specifies the severity property: The severity level of the assessment.
             *
             * @param severity The severity level of the assessment.
             * @return the next definition stage.
             */
            WithCreate withSeverity(Severity severity);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify userImpact. */
        interface WithUserImpact {
            /**
             * Specifies the userImpact property: The user impact of the assessment.
             *
             * @param userImpact The user impact of the assessment.
             * @return the next definition stage.
             */
            WithCreate withUserImpact(UserImpact userImpact);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify implementationEffort. */
        interface WithImplementationEffort {
            /**
             * Specifies the implementationEffort property: The implementation effort required to remediate this
             * assessment.
             *
             * @param implementationEffort The implementation effort required to remediate this assessment.
             * @return the next definition stage.
             */
            WithCreate withImplementationEffort(ImplementationEffort implementationEffort);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify threats. */
        interface WithThreats {
            /**
             * Specifies the threats property: The threats property..
             *
             * @param threats The threats property.
             * @return the next definition stage.
             */
            WithCreate withThreats(List<Threats> threats);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify preview. */
        interface WithPreview {
            /**
             * Specifies the preview property: True if this assessment is in preview release status.
             *
             * @param preview True if this assessment is in preview release status.
             * @return the next definition stage.
             */
            WithCreate withPreview(Boolean preview);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify assessmentType. */
        interface WithAssessmentType {
            /**
             * Specifies the assessmentType property: BuiltIn if the assessment based on built-in Azure Policy
             * definition, Custom if the assessment based on custom Azure Policy definition.
             *
             * @param assessmentType BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the
             *     assessment based on custom Azure Policy definition.
             * @return the next definition stage.
             */
            WithCreate withAssessmentType(AssessmentType assessmentType);
        }
        /** The stage of the SecurityAssessmentMetadata definition allowing to specify partnerData. */
        interface WithPartnerData {
            /**
             * Specifies the partnerData property: Describes the partner that created the assessment.
             *
             * @param partnerData Describes the partner that created the assessment.
             * @return the next definition stage.
             */
            WithCreate withPartnerData(SecurityAssessmentMetadataPartnerData partnerData);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SecurityAssessmentMetadata refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SecurityAssessmentMetadata refresh(Context context);
}
