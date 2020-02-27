/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The X12 agreement framing settings.
 */
public class X12FramingSettings {
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
     * The value indicating whether to replace separators in payload.
     */
    @JsonProperty(value = "replaceSeparatorsInPayload", required = true)
    private boolean replaceSeparatorsInPayload;

    /**
     * The replacement character.
     */
    @JsonProperty(value = "replaceCharacter", required = true)
    private int replaceCharacter;

    /**
     * The segment terminator.
     */
    @JsonProperty(value = "segmentTerminator", required = true)
    private int segmentTerminator;

    /**
     * The X12 character set. Possible values include: 'NotSpecified', 'Basic',
     * 'Extended', 'UTF8'.
     */
    @JsonProperty(value = "characterSet", required = true)
    private X12CharacterSet characterSet;

    /**
     * The segment terminator suffix. Possible values include: 'NotSpecified',
     * 'None', 'CR', 'LF', 'CRLF'.
     */
    @JsonProperty(value = "segmentTerminatorSuffix", required = true)
    private SegmentTerminatorSuffix segmentTerminatorSuffix;

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
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withDataElementSeparator(int dataElementSeparator) {
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
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withComponentSeparator(int componentSeparator) {
        this.componentSeparator = componentSeparator;
        return this;
    }

    /**
     * Get the value indicating whether to replace separators in payload.
     *
     * @return the replaceSeparatorsInPayload value
     */
    public boolean replaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * Set the value indicating whether to replace separators in payload.
     *
     * @param replaceSeparatorsInPayload the replaceSeparatorsInPayload value to set
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withReplaceSeparatorsInPayload(boolean replaceSeparatorsInPayload) {
        this.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
        return this;
    }

    /**
     * Get the replacement character.
     *
     * @return the replaceCharacter value
     */
    public int replaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * Set the replacement character.
     *
     * @param replaceCharacter the replaceCharacter value to set
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withReplaceCharacter(int replaceCharacter) {
        this.replaceCharacter = replaceCharacter;
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
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withSegmentTerminator(int segmentTerminator) {
        this.segmentTerminator = segmentTerminator;
        return this;
    }

    /**
     * Get the X12 character set. Possible values include: 'NotSpecified', 'Basic', 'Extended', 'UTF8'.
     *
     * @return the characterSet value
     */
    public X12CharacterSet characterSet() {
        return this.characterSet;
    }

    /**
     * Set the X12 character set. Possible values include: 'NotSpecified', 'Basic', 'Extended', 'UTF8'.
     *
     * @param characterSet the characterSet value to set
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withCharacterSet(X12CharacterSet characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    /**
     * Get the segment terminator suffix. Possible values include: 'NotSpecified', 'None', 'CR', 'LF', 'CRLF'.
     *
     * @return the segmentTerminatorSuffix value
     */
    public SegmentTerminatorSuffix segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * Set the segment terminator suffix. Possible values include: 'NotSpecified', 'None', 'CR', 'LF', 'CRLF'.
     *
     * @param segmentTerminatorSuffix the segmentTerminatorSuffix value to set
     * @return the X12FramingSettings object itself.
     */
    public X12FramingSettings withSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
        this.segmentTerminatorSuffix = segmentTerminatorSuffix;
        return this;
    }

}
