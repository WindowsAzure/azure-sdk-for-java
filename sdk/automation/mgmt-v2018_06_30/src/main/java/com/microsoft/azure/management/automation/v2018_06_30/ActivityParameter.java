/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of the activity parameter.
 */
public class ActivityParameter {
    /**
     * Gets or sets the name of the activity parameter.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets or sets the type of the activity parameter.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Gets or sets a Boolean value that indicates true if the parameter is
     * required. If the value is false, the parameter is optional.
     */
    @JsonProperty(value = "isMandatory")
    private Boolean isMandatory;

    /**
     * Gets or sets a Boolean value that indicates true if the parameter is
     * dynamic.
     */
    @JsonProperty(value = "isDynamic")
    private Boolean isDynamic;

    /**
     * Gets or sets the position of the activity parameter.
     */
    @JsonProperty(value = "position")
    private Long position;

    /**
     * Gets or sets a Boolean value that indicates true if the parameter can
     * take values from the incoming pipeline objects. This setting is used if
     * the cmdlet must access the complete input object. false indicates that
     * the parameter cannot take values from the complete input object.
     */
    @JsonProperty(value = "valueFromPipeline")
    private Boolean valueFromPipeline;

    /**
     * Gets or sets a Boolean value that indicates true if the parameter can be
     * filled from a property of the incoming pipeline object that has the same
     * name as this parameter. false indicates that the parameter cannot be
     * filled from the incoming pipeline object property with the same name.
     */
    @JsonProperty(value = "valueFromPipelineByPropertyName")
    private Boolean valueFromPipelineByPropertyName;

    /**
     * Gets or sets a Boolean value that indicates true if the cmdlet parameter
     * accepts all the remaining command-line arguments that are associated
     * with this parameter in the form of an array. false if the cmdlet
     * parameter does not accept all the remaining argument values.
     */
    @JsonProperty(value = "valueFromRemainingArguments")
    private Boolean valueFromRemainingArguments;

    /**
     * Gets or sets the description of the activity parameter.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Gets or sets the validation set of activity parameter.
     */
    @JsonProperty(value = "validationSet")
    private List<ActivityParameterValidationSet> validationSet;

    /**
     * Get gets or sets the name of the activity parameter.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the activity parameter.
     *
     * @param name the name value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets or sets the type of the activity parameter.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set gets or sets the type of the activity parameter.
     *
     * @param type the type value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get gets or sets a Boolean value that indicates true if the parameter is required. If the value is false, the parameter is optional.
     *
     * @return the isMandatory value
     */
    public Boolean isMandatory() {
        return this.isMandatory;
    }

    /**
     * Set gets or sets a Boolean value that indicates true if the parameter is required. If the value is false, the parameter is optional.
     *
     * @param isMandatory the isMandatory value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
        return this;
    }

    /**
     * Get gets or sets a Boolean value that indicates true if the parameter is dynamic.
     *
     * @return the isDynamic value
     */
    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * Set gets or sets a Boolean value that indicates true if the parameter is dynamic.
     *
     * @param isDynamic the isDynamic value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * Get gets or sets the position of the activity parameter.
     *
     * @return the position value
     */
    public Long position() {
        return this.position;
    }

    /**
     * Set gets or sets the position of the activity parameter.
     *
     * @param position the position value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withPosition(Long position) {
        this.position = position;
        return this;
    }

    /**
     * Get gets or sets a Boolean value that indicates true if the parameter can take values from the incoming pipeline objects. This setting is used if the cmdlet must access the complete input object. false indicates that the parameter cannot take values from the complete input object.
     *
     * @return the valueFromPipeline value
     */
    public Boolean valueFromPipeline() {
        return this.valueFromPipeline;
    }

    /**
     * Set gets or sets a Boolean value that indicates true if the parameter can take values from the incoming pipeline objects. This setting is used if the cmdlet must access the complete input object. false indicates that the parameter cannot take values from the complete input object.
     *
     * @param valueFromPipeline the valueFromPipeline value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withValueFromPipeline(Boolean valueFromPipeline) {
        this.valueFromPipeline = valueFromPipeline;
        return this;
    }

    /**
     * Get gets or sets a Boolean value that indicates true if the parameter can be filled from a property of the incoming pipeline object that has the same name as this parameter. false indicates that the parameter cannot be filled from the incoming pipeline object property with the same name.
     *
     * @return the valueFromPipelineByPropertyName value
     */
    public Boolean valueFromPipelineByPropertyName() {
        return this.valueFromPipelineByPropertyName;
    }

    /**
     * Set gets or sets a Boolean value that indicates true if the parameter can be filled from a property of the incoming pipeline object that has the same name as this parameter. false indicates that the parameter cannot be filled from the incoming pipeline object property with the same name.
     *
     * @param valueFromPipelineByPropertyName the valueFromPipelineByPropertyName value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withValueFromPipelineByPropertyName(Boolean valueFromPipelineByPropertyName) {
        this.valueFromPipelineByPropertyName = valueFromPipelineByPropertyName;
        return this;
    }

    /**
     * Get gets or sets a Boolean value that indicates true if the cmdlet parameter accepts all the remaining command-line arguments that are associated with this parameter in the form of an array. false if the cmdlet parameter does not accept all the remaining argument values.
     *
     * @return the valueFromRemainingArguments value
     */
    public Boolean valueFromRemainingArguments() {
        return this.valueFromRemainingArguments;
    }

    /**
     * Set gets or sets a Boolean value that indicates true if the cmdlet parameter accepts all the remaining command-line arguments that are associated with this parameter in the form of an array. false if the cmdlet parameter does not accept all the remaining argument values.
     *
     * @param valueFromRemainingArguments the valueFromRemainingArguments value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withValueFromRemainingArguments(Boolean valueFromRemainingArguments) {
        this.valueFromRemainingArguments = valueFromRemainingArguments;
        return this;
    }

    /**
     * Get gets or sets the description of the activity parameter.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description of the activity parameter.
     *
     * @param description the description value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets the validation set of activity parameter.
     *
     * @return the validationSet value
     */
    public List<ActivityParameterValidationSet> validationSet() {
        return this.validationSet;
    }

    /**
     * Set gets or sets the validation set of activity parameter.
     *
     * @param validationSet the validationSet value to set
     * @return the ActivityParameter object itself.
     */
    public ActivityParameter withValidationSet(List<ActivityParameterValidationSet> validationSet) {
        this.validationSet = validationSet;
        return this;
    }

}
