/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A sensitivity label.
 */
@JsonFlatten
public class SensitivityLabelInner extends ProxyResource {
    /**
     * The label name.
     */
    @JsonProperty(value = "properties.labelName")
    private String labelName;

    /**
     * The label ID.
     */
    @JsonProperty(value = "properties.labelId")
    private String labelId;

    /**
     * The information type.
     */
    @JsonProperty(value = "properties.informationType")
    private String informationType;

    /**
     * The information type ID.
     */
    @JsonProperty(value = "properties.informationTypeId")
    private String informationTypeId;

    /**
     * Get the label name.
     *
     * @return the labelName value
     */
    public String labelName() {
        return this.labelName;
    }

    /**
     * Set the label name.
     *
     * @param labelName the labelName value to set
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * Get the label ID.
     *
     * @return the labelId value
     */
    public String labelId() {
        return this.labelId;
    }

    /**
     * Set the label ID.
     *
     * @param labelId the labelId value to set
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * Get the information type.
     *
     * @return the informationType value
     */
    public String informationType() {
        return this.informationType;
    }

    /**
     * Set the information type.
     *
     * @param informationType the informationType value to set
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withInformationType(String informationType) {
        this.informationType = informationType;
        return this;
    }

    /**
     * Get the information type ID.
     *
     * @return the informationTypeId value
     */
    public String informationTypeId() {
        return this.informationTypeId;
    }

    /**
     * Set the information type ID.
     *
     * @param informationTypeId the informationTypeId value to set
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withInformationTypeId(String informationTypeId) {
        this.informationTypeId = informationTypeId;
        return this;
    }

}
