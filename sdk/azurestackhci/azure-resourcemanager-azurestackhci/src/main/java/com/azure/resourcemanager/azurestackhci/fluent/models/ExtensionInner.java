// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestackhci.models.CreatedByType;
import com.azure.resourcemanager.azurestackhci.models.ExtensionAggregateState;
import com.azure.resourcemanager.azurestackhci.models.PerNodeExtensionState;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Details of a particular extension in HCI Cluster. */
@JsonFlatten
@Fluent
public class ExtensionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExtensionInner.class);

    /*
     * Provisioning state of the Extension proxy resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     */
    @JsonProperty(value = "properties.aggregateState", access = JsonProperty.Access.WRITE_ONLY)
    private ExtensionAggregateState aggregateState;

    /*
     * State of Arc Extension in each of the nodes.
     */
    @JsonProperty(value = "properties.perNodeExtensionDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<PerNodeExtensionState> perNodeExtensionDetails;

    /*
     * How the extension handler should be forced to update even if the
     * extension configuration has not changed.
     */
    @JsonProperty(value = "properties.extensionParameters.forceUpdateTag")
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "properties.extensionParameters.publisher")
    private String publisher;

    /*
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "properties.extensionParameters.type")
    private String typePropertiesExtensionParametersType;

    /*
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "properties.extensionParameters.typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension
     * will not upgrade minor versions unless redeployed, even with this
     * property set to true.
     */
    @JsonProperty(value = "properties.extensionParameters.autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * Json formatted public settings for the extension.
     */
    @JsonProperty(value = "properties.extensionParameters.settings")
    private Object settings;

    /*
     * Protected settings (may contain secrets).
     */
    @JsonProperty(value = "properties.extensionParameters.protectedSettings")
    private Object protectedSettings;

    /*
     * The identity that created the resource.
     */
    @JsonProperty(value = "systemData.createdBy")
    private String createdBy;

    /*
     * The type of identity that created the resource.
     */
    @JsonProperty(value = "systemData.createdByType")
    private CreatedByType createdByType;

    /*
     * The timestamp of resource creation (UTC).
     */
    @JsonProperty(value = "systemData.createdAt")
    private OffsetDateTime createdAt;

    /*
     * The identity that last modified the resource.
     */
    @JsonProperty(value = "systemData.lastModifiedBy")
    private String lastModifiedBy;

    /*
     * The type of identity that last modified the resource.
     */
    @JsonProperty(value = "systemData.lastModifiedByType")
    private CreatedByType lastModifiedByType;

    /*
     * The timestamp of resource last modification (UTC)
     */
    @JsonProperty(value = "systemData.lastModifiedAt")
    private OffsetDateTime lastModifiedAt;

    /**
     * Get the provisioningState property: Provisioning state of the Extension proxy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the aggregateState property: Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     *
     * @return the aggregateState value.
     */
    public ExtensionAggregateState aggregateState() {
        return this.aggregateState;
    }

    /**
     * Get the perNodeExtensionDetails property: State of Arc Extension in each of the nodes.
     *
     * @return the perNodeExtensionDetails value.
     */
    public List<PerNodeExtensionState> perNodeExtensionDetails() {
        return this.perNodeExtensionDetails;
    }

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the typePropertiesExtensionParametersType property: Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     *
     * @return the typePropertiesExtensionParametersType value.
     */
    public String typePropertiesExtensionParametersType() {
        return this.typePropertiesExtensionParametersType;
    }

    /**
     * Set the typePropertiesExtensionParametersType property: Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     *
     * @param typePropertiesExtensionParametersType the typePropertiesExtensionParametersType value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withTypePropertiesExtensionParametersType(String typePropertiesExtensionParametersType) {
        this.typePropertiesExtensionParametersType = typePropertiesExtensionParametersType;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     *
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: Protected settings (may contain secrets).
     *
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: Protected settings (may contain secrets).
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the createdBy property: The identity that created the resource.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The identity that created the resource.
     *
     * @param createdBy the createdBy value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the createdByType property: The type of identity that created the resource.
     *
     * @return the createdByType value.
     */
    public CreatedByType createdByType() {
        return this.createdByType;
    }

    /**
     * Set the createdByType property: The type of identity that created the resource.
     *
     * @param createdByType the createdByType value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withCreatedByType(CreatedByType createdByType) {
        this.createdByType = createdByType;
        return this;
    }

    /**
     * Get the createdAt property: The timestamp of resource creation (UTC).
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The timestamp of resource creation (UTC).
     *
     * @param createdAt the createdAt value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the lastModifiedBy property: The identity that last modified the resource.
     *
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: The identity that last modified the resource.
     *
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the lastModifiedByType property: The type of identity that last modified the resource.
     *
     * @return the lastModifiedByType value.
     */
    public CreatedByType lastModifiedByType() {
        return this.lastModifiedByType;
    }

    /**
     * Set the lastModifiedByType property: The type of identity that last modified the resource.
     *
     * @param lastModifiedByType the lastModifiedByType value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withLastModifiedByType(CreatedByType lastModifiedByType) {
        this.lastModifiedByType = lastModifiedByType;
        return this;
    }

    /**
     * Get the lastModifiedAt property: The timestamp of resource last modification (UTC).
     *
     * @return the lastModifiedAt value.
     */
    public OffsetDateTime lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Set the lastModifiedAt property: The timestamp of resource last modification (UTC).
     *
     * @param lastModifiedAt the lastModifiedAt value to set.
     * @return the ExtensionInner object itself.
     */
    public ExtensionInner withLastModifiedAt(OffsetDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (perNodeExtensionDetails() != null) {
            perNodeExtensionDetails().forEach(e -> e.validate());
        }
    }
}
