// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.AdditionalData;
import com.azure.resourcemanager.security.models.ResourceDetails;
import com.azure.resourcemanager.security.models.SubAssessmentStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Security sub-assessment on a resource. */
@JsonFlatten
@Fluent
public class SecuritySubAssessmentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecuritySubAssessmentInner.class);

    /*
     * Vulnerability ID
     */
    @JsonProperty(value = "properties.id", access = JsonProperty.Access.WRITE_ONLY)
    private String idPropertiesId;

    /*
     * User friendly display name of the sub-assessment
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Status of the sub-assessment
     */
    @JsonProperty(value = "properties.status")
    private SubAssessmentStatus status;

    /*
     * Information on how to remediate this sub-assessment
     */
    @JsonProperty(value = "properties.remediation", access = JsonProperty.Access.WRITE_ONLY)
    private String remediation;

    /*
     * Description of the impact of this sub-assessment
     */
    @JsonProperty(value = "properties.impact", access = JsonProperty.Access.WRITE_ONLY)
    private String impact;

    /*
     * Category of the sub-assessment
     */
    @JsonProperty(value = "properties.category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /*
     * Human readable description of the assessment status
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The date and time the sub-assessment was generated
     */
    @JsonProperty(value = "properties.timeGenerated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeGenerated;

    /*
     * Details of the resource that was assessed
     */
    @JsonProperty(value = "properties.resourceDetails")
    private ResourceDetails resourceDetails;

    /*
     * Details of the sub-assessment
     */
    @JsonProperty(value = "properties.additionalData")
    private AdditionalData additionalData;

    /**
     * Get the idPropertiesId property: Vulnerability ID.
     *
     * @return the idPropertiesId value.
     */
    public String idPropertiesId() {
        return this.idPropertiesId;
    }

    /**
     * Get the displayName property: User friendly display name of the sub-assessment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the status property: Status of the sub-assessment.
     *
     * @return the status value.
     */
    public SubAssessmentStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the sub-assessment.
     *
     * @param status the status value to set.
     * @return the SecuritySubAssessmentInner object itself.
     */
    public SecuritySubAssessmentInner withStatus(SubAssessmentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the remediation property: Information on how to remediate this sub-assessment.
     *
     * @return the remediation value.
     */
    public String remediation() {
        return this.remediation;
    }

    /**
     * Get the impact property: Description of the impact of this sub-assessment.
     *
     * @return the impact value.
     */
    public String impact() {
        return this.impact;
    }

    /**
     * Get the category property: Category of the sub-assessment.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the description property: Human readable description of the assessment status.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the timeGenerated property: The date and time the sub-assessment was generated.
     *
     * @return the timeGenerated value.
     */
    public OffsetDateTime timeGenerated() {
        return this.timeGenerated;
    }

    /**
     * Get the resourceDetails property: Details of the resource that was assessed.
     *
     * @return the resourceDetails value.
     */
    public ResourceDetails resourceDetails() {
        return this.resourceDetails;
    }

    /**
     * Set the resourceDetails property: Details of the resource that was assessed.
     *
     * @param resourceDetails the resourceDetails value to set.
     * @return the SecuritySubAssessmentInner object itself.
     */
    public SecuritySubAssessmentInner withResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * Get the additionalData property: Details of the sub-assessment.
     *
     * @return the additionalData value.
     */
    public AdditionalData additionalData() {
        return this.additionalData;
    }

    /**
     * Set the additionalData property: Details of the sub-assessment.
     *
     * @param additionalData the additionalData value to set.
     * @return the SecuritySubAssessmentInner object itself.
     */
    public SecuritySubAssessmentInner withAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
        if (resourceDetails() != null) {
            resourceDetails().validate();
        }
        if (additionalData() != null) {
            additionalData().validate();
        }
    }
}
