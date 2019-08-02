/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AS2 agreement envelope settings.
 */
public class AS2EnvelopeSettings {
    /**
     * The message content type.
     */
    @JsonProperty(value = "messageContentType", required = true)
    private String messageContentType;

    /**
     * The value indicating whether to transmit file name in mime header.
     */
    @JsonProperty(value = "transmitFileNameInMimeHeader", required = true)
    private boolean transmitFileNameInMimeHeader;

    /**
     * The template for file name.
     */
    @JsonProperty(value = "fileNameTemplate", required = true)
    private String fileNameTemplate;

    /**
     * The value indicating whether to suspend message on file name generation
     * error.
     */
    @JsonProperty(value = "suspendMessageOnFileNameGenerationError", required = true)
    private boolean suspendMessageOnFileNameGenerationError;

    /**
     * The value indicating whether to auto generate file name.
     */
    @JsonProperty(value = "autogenerateFileName", required = true)
    private boolean autogenerateFileName;

    /**
     * Get the message content type.
     *
     * @return the messageContentType value
     */
    public String messageContentType() {
        return this.messageContentType;
    }

    /**
     * Set the message content type.
     *
     * @param messageContentType the messageContentType value to set
     * @return the AS2EnvelopeSettings object itself.
     */
    public AS2EnvelopeSettings withMessageContentType(String messageContentType) {
        this.messageContentType = messageContentType;
        return this;
    }

    /**
     * Get the value indicating whether to transmit file name in mime header.
     *
     * @return the transmitFileNameInMimeHeader value
     */
    public boolean transmitFileNameInMimeHeader() {
        return this.transmitFileNameInMimeHeader;
    }

    /**
     * Set the value indicating whether to transmit file name in mime header.
     *
     * @param transmitFileNameInMimeHeader the transmitFileNameInMimeHeader value to set
     * @return the AS2EnvelopeSettings object itself.
     */
    public AS2EnvelopeSettings withTransmitFileNameInMimeHeader(boolean transmitFileNameInMimeHeader) {
        this.transmitFileNameInMimeHeader = transmitFileNameInMimeHeader;
        return this;
    }

    /**
     * Get the template for file name.
     *
     * @return the fileNameTemplate value
     */
    public String fileNameTemplate() {
        return this.fileNameTemplate;
    }

    /**
     * Set the template for file name.
     *
     * @param fileNameTemplate the fileNameTemplate value to set
     * @return the AS2EnvelopeSettings object itself.
     */
    public AS2EnvelopeSettings withFileNameTemplate(String fileNameTemplate) {
        this.fileNameTemplate = fileNameTemplate;
        return this;
    }

    /**
     * Get the value indicating whether to suspend message on file name generation error.
     *
     * @return the suspendMessageOnFileNameGenerationError value
     */
    public boolean suspendMessageOnFileNameGenerationError() {
        return this.suspendMessageOnFileNameGenerationError;
    }

    /**
     * Set the value indicating whether to suspend message on file name generation error.
     *
     * @param suspendMessageOnFileNameGenerationError the suspendMessageOnFileNameGenerationError value to set
     * @return the AS2EnvelopeSettings object itself.
     */
    public AS2EnvelopeSettings withSuspendMessageOnFileNameGenerationError(boolean suspendMessageOnFileNameGenerationError) {
        this.suspendMessageOnFileNameGenerationError = suspendMessageOnFileNameGenerationError;
        return this;
    }

    /**
     * Get the value indicating whether to auto generate file name.
     *
     * @return the autogenerateFileName value
     */
    public boolean autogenerateFileName() {
        return this.autogenerateFileName;
    }

    /**
     * Set the value indicating whether to auto generate file name.
     *
     * @param autogenerateFileName the autogenerateFileName value to set
     * @return the AS2EnvelopeSettings object itself.
     */
    public AS2EnvelopeSettings withAutogenerateFileName(boolean autogenerateFileName) {
        this.autogenerateFileName = autogenerateFileName;
        return this;
    }

}
