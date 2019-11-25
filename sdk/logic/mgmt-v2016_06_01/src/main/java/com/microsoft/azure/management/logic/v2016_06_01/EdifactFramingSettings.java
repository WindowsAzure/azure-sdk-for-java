/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Edifact agreement framing settings.
 */
public class EdifactFramingSettings {
    /**
     * The service code list directory version.
     */
    @JsonProperty(value = "serviceCodeListDirectoryVersion")
    private String serviceCodeListDirectoryVersion;

    /**
     * The character encoding.
     */
    @JsonProperty(value = "characterEncoding")
    private String characterEncoding;

    /**
     * The protocol version.
     */
    @JsonProperty(value = "protocolVersion", required = true)
    private int protocolVersion;

    /**
     * The data element separator.
     */
    @JsonProperty(value = "dataElementSeparator", required = true)
    private int dataElementSeparator;

    /**
     * The component separator.
     */
    @JsonProperty(value = "componentSeparator", required = true)
    private int componentSeparator;

    /**
     * The segment terminator.
     */
    @JsonProperty(value = "segmentTerminator", required = true)
    private int segmentTerminator;

    /**
     * The release indicator.
     */
    @JsonProperty(value = "releaseIndicator", required = true)
    private int releaseIndicator;

    /**
     * The repetition separator.
     */
    @JsonProperty(value = "repetitionSeparator", required = true)
    private int repetitionSeparator;

    /**
     * The EDIFACT frame setting characterSet. Possible values include:
     * 'NotSpecified', 'UNOB', 'UNOA', 'UNOC', 'UNOD', 'UNOE', 'UNOF', 'UNOG',
     * 'UNOH', 'UNOI', 'UNOJ', 'UNOK', 'UNOX', 'UNOY', 'KECA'.
     */
    @JsonProperty(value = "characterSet", required = true)
    private EdifactCharacterSet characterSet;

    /**
     * The EDIFACT frame setting decimal indicator. Possible values include:
     * 'NotSpecified', 'Comma', 'Decimal'.
     */
    @JsonProperty(value = "decimalPointIndicator", required = true)
    private EdifactDecimalIndicator decimalPointIndicator;

    /**
     * The EDIFACT frame setting segment terminator suffix. Possible values
     * include: 'NotSpecified', 'None', 'CR', 'LF', 'CRLF'.
     */
    @JsonProperty(value = "segmentTerminatorSuffix", required = true)
    private SegmentTerminatorSuffix segmentTerminatorSuffix;

    /**
     * Get the service code list directory version.
     *
     * @return the serviceCodeListDirectoryVersion value
     */
    public String serviceCodeListDirectoryVersion() {
        return this.serviceCodeListDirectoryVersion;
    }

    /**
     * Set the service code list directory version.
     *
     * @param serviceCodeListDirectoryVersion the serviceCodeListDirectoryVersion value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withServiceCodeListDirectoryVersion(String serviceCodeListDirectoryVersion) {
        this.serviceCodeListDirectoryVersion = serviceCodeListDirectoryVersion;
        return this;
    }

    /**
     * Get the character encoding.
     *
     * @return the characterEncoding value
     */
    public String characterEncoding() {
        return this.characterEncoding;
    }

    /**
     * Set the character encoding.
     *
     * @param characterEncoding the characterEncoding value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withCharacterEncoding(String characterEncoding) {
        this.characterEncoding = characterEncoding;
        return this;
    }

    /**
     * Get the protocol version.
     *
     * @return the protocolVersion value
     */
    public int protocolVersion() {
        return this.protocolVersion;
    }

    /**
     * Set the protocol version.
     *
     * @param protocolVersion the protocolVersion value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withProtocolVersion(int protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * Get the data element separator.
     *
     * @return the dataElementSeparator value
     */
    public int dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * Set the data element separator.
     *
     * @param dataElementSeparator the dataElementSeparator value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withDataElementSeparator(int dataElementSeparator) {
        this.dataElementSeparator = dataElementSeparator;
        return this;
    }

    /**
     * Get the component separator.
     *
     * @return the componentSeparator value
     */
    public int componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * Set the component separator.
     *
     * @param componentSeparator the componentSeparator value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withComponentSeparator(int componentSeparator) {
        this.componentSeparator = componentSeparator;
        return this;
    }

    /**
     * Get the segment terminator.
     *
     * @return the segmentTerminator value
     */
    public int segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * Set the segment terminator.
     *
     * @param segmentTerminator the segmentTerminator value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withSegmentTerminator(int segmentTerminator) {
        this.segmentTerminator = segmentTerminator;
        return this;
    }

    /**
     * Get the release indicator.
     *
     * @return the releaseIndicator value
     */
    public int releaseIndicator() {
        return this.releaseIndicator;
    }

    /**
     * Set the release indicator.
     *
     * @param releaseIndicator the releaseIndicator value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withReleaseIndicator(int releaseIndicator) {
        this.releaseIndicator = releaseIndicator;
        return this;
    }

    /**
     * Get the repetition separator.
     *
     * @return the repetitionSeparator value
     */
    public int repetitionSeparator() {
        return this.repetitionSeparator;
    }

    /**
     * Set the repetition separator.
     *
     * @param repetitionSeparator the repetitionSeparator value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withRepetitionSeparator(int repetitionSeparator) {
        this.repetitionSeparator = repetitionSeparator;
        return this;
    }

    /**
     * Get the EDIFACT frame setting characterSet. Possible values include: 'NotSpecified', 'UNOB', 'UNOA', 'UNOC', 'UNOD', 'UNOE', 'UNOF', 'UNOG', 'UNOH', 'UNOI', 'UNOJ', 'UNOK', 'UNOX', 'UNOY', 'KECA'.
     *
     * @return the characterSet value
     */
    public EdifactCharacterSet characterSet() {
        return this.characterSet;
    }

    /**
     * Set the EDIFACT frame setting characterSet. Possible values include: 'NotSpecified', 'UNOB', 'UNOA', 'UNOC', 'UNOD', 'UNOE', 'UNOF', 'UNOG', 'UNOH', 'UNOI', 'UNOJ', 'UNOK', 'UNOX', 'UNOY', 'KECA'.
     *
     * @param characterSet the characterSet value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withCharacterSet(EdifactCharacterSet characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    /**
     * Get the EDIFACT frame setting decimal indicator. Possible values include: 'NotSpecified', 'Comma', 'Decimal'.
     *
     * @return the decimalPointIndicator value
     */
    public EdifactDecimalIndicator decimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    /**
     * Set the EDIFACT frame setting decimal indicator. Possible values include: 'NotSpecified', 'Comma', 'Decimal'.
     *
     * @param decimalPointIndicator the decimalPointIndicator value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withDecimalPointIndicator(EdifactDecimalIndicator decimalPointIndicator) {
        this.decimalPointIndicator = decimalPointIndicator;
        return this;
    }

    /**
     * Get the EDIFACT frame setting segment terminator suffix. Possible values include: 'NotSpecified', 'None', 'CR', 'LF', 'CRLF'.
     *
     * @return the segmentTerminatorSuffix value
     */
    public SegmentTerminatorSuffix segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * Set the EDIFACT frame setting segment terminator suffix. Possible values include: 'NotSpecified', 'None', 'CR', 'LF', 'CRLF'.
     *
     * @param segmentTerminatorSuffix the segmentTerminatorSuffix value to set
     * @return the EdifactFramingSettings object itself.
     */
    public EdifactFramingSettings withSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
        this.segmentTerminatorSuffix = segmentTerminatorSuffix;
        return this;
    }

}
