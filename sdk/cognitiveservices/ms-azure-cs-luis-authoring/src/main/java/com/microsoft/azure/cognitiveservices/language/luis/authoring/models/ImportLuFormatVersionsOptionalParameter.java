/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;


/**
 * The ImportLuFormatVersionsOptionalParameter model.
 */
public class ImportLuFormatVersionsOptionalParameter {
    /**
     * The new versionId to import. If not specified, the versionId will be
     * read from the imported object.
     */
    private String versionId;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the versionId value.
     *
     * @return the versionId value
     */
    public String versionId() {
        return this.versionId;
    }

    /**
     * Set the versionId value.
     *
     * @param versionId the versionId value to set
     * @return the ImportLuFormatVersionsOptionalParameter object itself.
     */
    public ImportLuFormatVersionsOptionalParameter withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the ImportLuFormatVersionsOptionalParameter object itself.
     */
    public ImportLuFormatVersionsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
