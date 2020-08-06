/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.SensitivityLabelRank;
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
     * Is sensitivity recommendation disabled. Applicable for recommended
     * sensitivity label only. Specifies whether the sensitivity recommendation
     * on this column is disabled (dismissed) or not.
     */
    @JsonProperty(value = "properties.isDisabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDisabled;

    /**
     * Possible values include: 'None', 'Low', 'Medium', 'High', 'Critical'.
     */
    @JsonProperty(value = "properties.rank")
    private SensitivityLabelRank rank;

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

    /**
     * Get is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     *
     * @return the isDisabled value
     */
    public Boolean isDisabled() {
        return this.isDisabled;
    }

    /**
     * Get possible values include: 'None', 'Low', 'Medium', 'High', 'Critical'.
     *
     * @return the rank value
     */
    public SensitivityLabelRank rank() {
        return this.rank;
    }

    /**
     * Set possible values include: 'None', 'Low', 'Medium', 'High', 'Critical'.
     *
     * @param rank the rank value to set
     * @return the SensitivityLabelInner object itself.
     */
    public SensitivityLabelInner withRank(SensitivityLabelRank rank) {
        this.rank = rank;
        return this;
    }

}
