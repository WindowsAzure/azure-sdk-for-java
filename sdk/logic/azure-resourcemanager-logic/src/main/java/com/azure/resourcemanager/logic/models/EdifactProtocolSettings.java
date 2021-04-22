// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Edifact agreement protocol settings. */
@Fluent
public final class EdifactProtocolSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdifactProtocolSettings.class);

    /*
     * The EDIFACT validation settings.
     */
    @JsonProperty(value = "validationSettings", required = true)
    private EdifactValidationSettings validationSettings;

    /*
     * The EDIFACT framing settings.
     */
    @JsonProperty(value = "framingSettings", required = true)
    private EdifactFramingSettings framingSettings;

    /*
     * The EDIFACT envelope settings.
     */
    @JsonProperty(value = "envelopeSettings", required = true)
    private EdifactEnvelopeSettings envelopeSettings;

    /*
     * The EDIFACT acknowledgement settings.
     */
    @JsonProperty(value = "acknowledgementSettings", required = true)
    private EdifactAcknowledgementSettings acknowledgementSettings;

    /*
     * The EDIFACT message filter.
     */
    @JsonProperty(value = "messageFilter", required = true)
    private EdifactMessageFilter messageFilter;

    /*
     * The EDIFACT processing Settings.
     */
    @JsonProperty(value = "processingSettings", required = true)
    private EdifactProcessingSettings processingSettings;

    /*
     * The EDIFACT envelope override settings.
     */
    @JsonProperty(value = "envelopeOverrides")
    private List<EdifactEnvelopeOverride> envelopeOverrides;

    /*
     * The EDIFACT message filter list.
     */
    @JsonProperty(value = "messageFilterList")
    private List<EdifactMessageIdentifier> messageFilterList;

    /*
     * The EDIFACT schema references.
     */
    @JsonProperty(value = "schemaReferences", required = true)
    private List<EdifactSchemaReference> schemaReferences;

    /*
     * The EDIFACT validation override settings.
     */
    @JsonProperty(value = "validationOverrides")
    private List<EdifactValidationOverride> validationOverrides;

    /*
     * The EDIFACT delimiter override settings.
     */
    @JsonProperty(value = "edifactDelimiterOverrides")
    private List<EdifactDelimiterOverride> edifactDelimiterOverrides;

    /**
     * Get the validationSettings property: The EDIFACT validation settings.
     *
     * @return the validationSettings value.
     */
    public EdifactValidationSettings validationSettings() {
        return this.validationSettings;
    }

    /**
     * Set the validationSettings property: The EDIFACT validation settings.
     *
     * @param validationSettings the validationSettings value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withValidationSettings(EdifactValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
        return this;
    }

    /**
     * Get the framingSettings property: The EDIFACT framing settings.
     *
     * @return the framingSettings value.
     */
    public EdifactFramingSettings framingSettings() {
        return this.framingSettings;
    }

    /**
     * Set the framingSettings property: The EDIFACT framing settings.
     *
     * @param framingSettings the framingSettings value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withFramingSettings(EdifactFramingSettings framingSettings) {
        this.framingSettings = framingSettings;
        return this;
    }

    /**
     * Get the envelopeSettings property: The EDIFACT envelope settings.
     *
     * @return the envelopeSettings value.
     */
    public EdifactEnvelopeSettings envelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * Set the envelopeSettings property: The EDIFACT envelope settings.
     *
     * @param envelopeSettings the envelopeSettings value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withEnvelopeSettings(EdifactEnvelopeSettings envelopeSettings) {
        this.envelopeSettings = envelopeSettings;
        return this;
    }

    /**
     * Get the acknowledgementSettings property: The EDIFACT acknowledgement settings.
     *
     * @return the acknowledgementSettings value.
     */
    public EdifactAcknowledgementSettings acknowledgementSettings() {
        return this.acknowledgementSettings;
    }

    /**
     * Set the acknowledgementSettings property: The EDIFACT acknowledgement settings.
     *
     * @param acknowledgementSettings the acknowledgementSettings value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withAcknowledgementSettings(EdifactAcknowledgementSettings acknowledgementSettings) {
        this.acknowledgementSettings = acknowledgementSettings;
        return this;
    }

    /**
     * Get the messageFilter property: The EDIFACT message filter.
     *
     * @return the messageFilter value.
     */
    public EdifactMessageFilter messageFilter() {
        return this.messageFilter;
    }

    /**
     * Set the messageFilter property: The EDIFACT message filter.
     *
     * @param messageFilter the messageFilter value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withMessageFilter(EdifactMessageFilter messageFilter) {
        this.messageFilter = messageFilter;
        return this;
    }

    /**
     * Get the processingSettings property: The EDIFACT processing Settings.
     *
     * @return the processingSettings value.
     */
    public EdifactProcessingSettings processingSettings() {
        return this.processingSettings;
    }

    /**
     * Set the processingSettings property: The EDIFACT processing Settings.
     *
     * @param processingSettings the processingSettings value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withProcessingSettings(EdifactProcessingSettings processingSettings) {
        this.processingSettings = processingSettings;
        return this;
    }

    /**
     * Get the envelopeOverrides property: The EDIFACT envelope override settings.
     *
     * @return the envelopeOverrides value.
     */
    public List<EdifactEnvelopeOverride> envelopeOverrides() {
        return this.envelopeOverrides;
    }

    /**
     * Set the envelopeOverrides property: The EDIFACT envelope override settings.
     *
     * @param envelopeOverrides the envelopeOverrides value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withEnvelopeOverrides(List<EdifactEnvelopeOverride> envelopeOverrides) {
        this.envelopeOverrides = envelopeOverrides;
        return this;
    }

    /**
     * Get the messageFilterList property: The EDIFACT message filter list.
     *
     * @return the messageFilterList value.
     */
    public List<EdifactMessageIdentifier> messageFilterList() {
        return this.messageFilterList;
    }

    /**
     * Set the messageFilterList property: The EDIFACT message filter list.
     *
     * @param messageFilterList the messageFilterList value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withMessageFilterList(List<EdifactMessageIdentifier> messageFilterList) {
        this.messageFilterList = messageFilterList;
        return this;
    }

    /**
     * Get the schemaReferences property: The EDIFACT schema references.
     *
     * @return the schemaReferences value.
     */
    public List<EdifactSchemaReference> schemaReferences() {
        return this.schemaReferences;
    }

    /**
     * Set the schemaReferences property: The EDIFACT schema references.
     *
     * @param schemaReferences the schemaReferences value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withSchemaReferences(List<EdifactSchemaReference> schemaReferences) {
        this.schemaReferences = schemaReferences;
        return this;
    }

    /**
     * Get the validationOverrides property: The EDIFACT validation override settings.
     *
     * @return the validationOverrides value.
     */
    public List<EdifactValidationOverride> validationOverrides() {
        return this.validationOverrides;
    }

    /**
     * Set the validationOverrides property: The EDIFACT validation override settings.
     *
     * @param validationOverrides the validationOverrides value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withValidationOverrides(List<EdifactValidationOverride> validationOverrides) {
        this.validationOverrides = validationOverrides;
        return this;
    }

    /**
     * Get the edifactDelimiterOverrides property: The EDIFACT delimiter override settings.
     *
     * @return the edifactDelimiterOverrides value.
     */
    public List<EdifactDelimiterOverride> edifactDelimiterOverrides() {
        return this.edifactDelimiterOverrides;
    }

    /**
     * Set the edifactDelimiterOverrides property: The EDIFACT delimiter override settings.
     *
     * @param edifactDelimiterOverrides the edifactDelimiterOverrides value to set.
     * @return the EdifactProtocolSettings object itself.
     */
    public EdifactProtocolSettings withEdifactDelimiterOverrides(
        List<EdifactDelimiterOverride> edifactDelimiterOverrides) {
        this.edifactDelimiterOverrides = edifactDelimiterOverrides;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationSettings() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property validationSettings in model EdifactProtocolSettings"));
        } else {
            validationSettings().validate();
        }
        if (framingSettings() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property framingSettings in model EdifactProtocolSettings"));
        } else {
            framingSettings().validate();
        }
        if (envelopeSettings() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property envelopeSettings in model EdifactProtocolSettings"));
        } else {
            envelopeSettings().validate();
        }
        if (acknowledgementSettings() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property acknowledgementSettings in model EdifactProtocolSettings"));
        } else {
            acknowledgementSettings().validate();
        }
        if (messageFilter() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property messageFilter in model EdifactProtocolSettings"));
        } else {
            messageFilter().validate();
        }
        if (processingSettings() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property processingSettings in model EdifactProtocolSettings"));
        } else {
            processingSettings().validate();
        }
        if (envelopeOverrides() != null) {
            envelopeOverrides().forEach(e -> e.validate());
        }
        if (messageFilterList() != null) {
            messageFilterList().forEach(e -> e.validate());
        }
        if (schemaReferences() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schemaReferences in model EdifactProtocolSettings"));
        } else {
            schemaReferences().forEach(e -> e.validate());
        }
        if (validationOverrides() != null) {
            validationOverrides().forEach(e -> e.validate());
        }
        if (edifactDelimiterOverrides() != null) {
            edifactDelimiterOverrides().forEach(e -> e.validate());
        }
    }
}