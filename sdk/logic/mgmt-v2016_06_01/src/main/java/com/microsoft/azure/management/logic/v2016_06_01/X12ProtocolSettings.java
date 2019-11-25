/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The X12 agreement protocol settings.
 */
public class X12ProtocolSettings {
    /**
     * The X12 validation settings.
     */
    @JsonProperty(value = "validationSettings", required = true)
    private X12ValidationSettings validationSettings;

    /**
     * The X12 framing settings.
     */
    @JsonProperty(value = "framingSettings", required = true)
    private X12FramingSettings framingSettings;

    /**
     * The X12 envelope settings.
     */
    @JsonProperty(value = "envelopeSettings", required = true)
    private X12EnvelopeSettings envelopeSettings;

    /**
     * The X12 acknowledgment settings.
     */
    @JsonProperty(value = "acknowledgementSettings", required = true)
    private X12AcknowledgementSettings acknowledgementSettings;

    /**
     * The X12 message filter.
     */
    @JsonProperty(value = "messageFilter", required = true)
    private X12MessageFilter messageFilter;

    /**
     * The X12 security settings.
     */
    @JsonProperty(value = "securitySettings", required = true)
    private X12SecuritySettings securitySettings;

    /**
     * The X12 processing settings.
     */
    @JsonProperty(value = "processingSettings", required = true)
    private X12ProcessingSettings processingSettings;

    /**
     * The X12 envelope override settings.
     */
    @JsonProperty(value = "envelopeOverrides")
    private List<X12EnvelopeOverride> envelopeOverrides;

    /**
     * The X12 validation override settings.
     */
    @JsonProperty(value = "validationOverrides")
    private List<X12ValidationOverride> validationOverrides;

    /**
     * The X12 message filter list.
     */
    @JsonProperty(value = "messageFilterList")
    private List<X12MessageIdentifier> messageFilterList;

    /**
     * The X12 schema references.
     */
    @JsonProperty(value = "schemaReferences", required = true)
    private List<X12SchemaReference> schemaReferences;

    /**
     * The X12 delimiter override settings.
     */
    @JsonProperty(value = "x12DelimiterOverrides")
    private List<X12DelimiterOverrides> x12DelimiterOverrides;

    /**
     * Get the X12 validation settings.
     *
     * @return the validationSettings value
     */
    public X12ValidationSettings validationSettings() {
        return this.validationSettings;
    }

    /**
     * Set the X12 validation settings.
     *
     * @param validationSettings the validationSettings value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withValidationSettings(X12ValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
        return this;
    }

    /**
     * Get the X12 framing settings.
     *
     * @return the framingSettings value
     */
    public X12FramingSettings framingSettings() {
        return this.framingSettings;
    }

    /**
     * Set the X12 framing settings.
     *
     * @param framingSettings the framingSettings value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withFramingSettings(X12FramingSettings framingSettings) {
        this.framingSettings = framingSettings;
        return this;
    }

    /**
     * Get the X12 envelope settings.
     *
     * @return the envelopeSettings value
     */
    public X12EnvelopeSettings envelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * Set the X12 envelope settings.
     *
     * @param envelopeSettings the envelopeSettings value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withEnvelopeSettings(X12EnvelopeSettings envelopeSettings) {
        this.envelopeSettings = envelopeSettings;
        return this;
    }

    /**
     * Get the X12 acknowledgment settings.
     *
     * @return the acknowledgementSettings value
     */
    public X12AcknowledgementSettings acknowledgementSettings() {
        return this.acknowledgementSettings;
    }

    /**
     * Set the X12 acknowledgment settings.
     *
     * @param acknowledgementSettings the acknowledgementSettings value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withAcknowledgementSettings(X12AcknowledgementSettings acknowledgementSettings) {
        this.acknowledgementSettings = acknowledgementSettings;
        return this;
    }

    /**
     * Get the X12 message filter.
     *
     * @return the messageFilter value
     */
    public X12MessageFilter messageFilter() {
        return this.messageFilter;
    }

    /**
     * Set the X12 message filter.
     *
     * @param messageFilter the messageFilter value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withMessageFilter(X12MessageFilter messageFilter) {
        this.messageFilter = messageFilter;
        return this;
    }

    /**
     * Get the X12 security settings.
     *
     * @return the securitySettings value
     */
    public X12SecuritySettings securitySettings() {
        return this.securitySettings;
    }

    /**
     * Set the X12 security settings.
     *
     * @param securitySettings the securitySettings value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withSecuritySettings(X12SecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
        return this;
    }

    /**
     * Get the X12 processing settings.
     *
     * @return the processingSettings value
     */
    public X12ProcessingSettings processingSettings() {
        return this.processingSettings;
    }

    /**
     * Set the X12 processing settings.
     *
     * @param processingSettings the processingSettings value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withProcessingSettings(X12ProcessingSettings processingSettings) {
        this.processingSettings = processingSettings;
        return this;
    }

    /**
     * Get the X12 envelope override settings.
     *
     * @return the envelopeOverrides value
     */
    public List<X12EnvelopeOverride> envelopeOverrides() {
        return this.envelopeOverrides;
    }

    /**
     * Set the X12 envelope override settings.
     *
     * @param envelopeOverrides the envelopeOverrides value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withEnvelopeOverrides(List<X12EnvelopeOverride> envelopeOverrides) {
        this.envelopeOverrides = envelopeOverrides;
        return this;
    }

    /**
     * Get the X12 validation override settings.
     *
     * @return the validationOverrides value
     */
    public List<X12ValidationOverride> validationOverrides() {
        return this.validationOverrides;
    }

    /**
     * Set the X12 validation override settings.
     *
     * @param validationOverrides the validationOverrides value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withValidationOverrides(List<X12ValidationOverride> validationOverrides) {
        this.validationOverrides = validationOverrides;
        return this;
    }

    /**
     * Get the X12 message filter list.
     *
     * @return the messageFilterList value
     */
    public List<X12MessageIdentifier> messageFilterList() {
        return this.messageFilterList;
    }

    /**
     * Set the X12 message filter list.
     *
     * @param messageFilterList the messageFilterList value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withMessageFilterList(List<X12MessageIdentifier> messageFilterList) {
        this.messageFilterList = messageFilterList;
        return this;
    }

    /**
     * Get the X12 schema references.
     *
     * @return the schemaReferences value
     */
    public List<X12SchemaReference> schemaReferences() {
        return this.schemaReferences;
    }

    /**
     * Set the X12 schema references.
     *
     * @param schemaReferences the schemaReferences value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withSchemaReferences(List<X12SchemaReference> schemaReferences) {
        this.schemaReferences = schemaReferences;
        return this;
    }

    /**
     * Get the X12 delimiter override settings.
     *
     * @return the x12DelimiterOverrides value
     */
    public List<X12DelimiterOverrides> x12DelimiterOverrides() {
        return this.x12DelimiterOverrides;
    }

    /**
     * Set the X12 delimiter override settings.
     *
     * @param x12DelimiterOverrides the x12DelimiterOverrides value to set
     * @return the X12ProtocolSettings object itself.
     */
    public X12ProtocolSettings withX12DelimiterOverrides(List<X12DelimiterOverrides> x12DelimiterOverrides) {
        this.x12DelimiterOverrides = x12DelimiterOverrides;
        return this;
    }

}
