/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Custom activity type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = CustomActivity.class)
@JsonTypeName("Custom")
@JsonFlatten
public class CustomActivity extends ExecutionActivity {
    /**
     * Command for custom activity Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.command", required = true)
    private Object command;

    /**
     * Resource linked service reference.
     */
    @JsonProperty(value = "typeProperties.resourceLinkedService")
    private LinkedServiceReference resourceLinkedService;

    /**
     * Folder path for resource files Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /**
     * Reference objects.
     */
    @JsonProperty(value = "typeProperties.referenceObjects")
    private CustomActivityReferenceObject referenceObjects;

    /**
     * User defined property bag. There is no restriction on the keys or values
     * that can be used. The user specified custom activity has the full
     * responsibility to consume and interpret the content defined.
     */
    @JsonProperty(value = "typeProperties.extendedProperties")
    private Map<String, Object> extendedProperties;

    /**
     * The retention time for the files submitted for custom activity. Type:
     * double (or Expression with resultType double).
     */
    @JsonProperty(value = "typeProperties.retentionTimeInDays")
    private Object retentionTimeInDays;

    /**
     * Elevation level and scope for the user, default is nonadmin task. Type:
     * string (or Expression with resultType double).
     */
    @JsonProperty(value = "typeProperties.autoUserSpecification")
    private Object autoUserSpecification;

    /**
     * Get command for custom activity Type: string (or Expression with resultType string).
     *
     * @return the command value
     */
    public Object command() {
        return this.command;
    }

    /**
     * Set command for custom activity Type: string (or Expression with resultType string).
     *
     * @param command the command value to set
     * @return the CustomActivity object itself.
     */
    public CustomActivity withCommand(Object command) {
        this.command = command;
        return this;
    }

    /**
     * Get resource linked service reference.
     *
     * @return the resourceLinkedService value
     */
    public LinkedServiceReference resourceLinkedService() {
        return this.resourceLinkedService;
    }

    /**
     * Set resource linked service reference.
     *
     * @param resourceLinkedService the resourceLinkedService value to set
     * @return the CustomActivity object itself.
     */
    public CustomActivity withResourceLinkedService(LinkedServiceReference resourceLinkedService) {
        this.resourceLinkedService = resourceLinkedService;
        return this;
    }

    /**
     * Get folder path for resource files Type: string (or Expression with resultType string).
     *
     * @return the folderPath value
     */
    public Object folderPath() {
        return this.folderPath;
    }

    /**
     * Set folder path for resource files Type: string (or Expression with resultType string).
     *
     * @param folderPath the folderPath value to set
     * @return the CustomActivity object itself.
     */
    public CustomActivity withFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get reference objects.
     *
     * @return the referenceObjects value
     */
    public CustomActivityReferenceObject referenceObjects() {
        return this.referenceObjects;
    }

    /**
     * Set reference objects.
     *
     * @param referenceObjects the referenceObjects value to set
     * @return the CustomActivity object itself.
     */
    public CustomActivity withReferenceObjects(CustomActivityReferenceObject referenceObjects) {
        this.referenceObjects = referenceObjects;
        return this;
    }

    /**
     * Get user defined property bag. There is no restriction on the keys or values that can be used. The user specified custom activity has the full responsibility to consume and interpret the content defined.
     *
     * @return the extendedProperties value
     */
    public Map<String, Object> extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set user defined property bag. There is no restriction on the keys or values that can be used. The user specified custom activity has the full responsibility to consume and interpret the content defined.
     *
     * @param extendedProperties the extendedProperties value to set
     * @return the CustomActivity object itself.
     */
    public CustomActivity withExtendedProperties(Map<String, Object> extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

    /**
     * Get the retention time for the files submitted for custom activity. Type: double (or Expression with resultType double).
     *
     * @return the retentionTimeInDays value
     */
    public Object retentionTimeInDays() {
        return this.retentionTimeInDays;
    }

    /**
     * Set the retention time for the files submitted for custom activity. Type: double (or Expression with resultType double).
     *
     * @param retentionTimeInDays the retentionTimeInDays value to set
     * @return the CustomActivity object itself.
     */
    public CustomActivity withRetentionTimeInDays(Object retentionTimeInDays) {
        this.retentionTimeInDays = retentionTimeInDays;
        return this;
    }

    /**
     * Get elevation level and scope for the user, default is nonadmin task. Type: string (or Expression with resultType double).
     *
     * @return the autoUserSpecification value
     */
    public Object autoUserSpecification() {
        return this.autoUserSpecification;
    }

    /**
     * Set elevation level and scope for the user, default is nonadmin task. Type: string (or Expression with resultType double).
     *
     * @param autoUserSpecification the autoUserSpecification value to set
     * @return the CustomActivity object itself.
     */
    public CustomActivity withAutoUserSpecification(Object autoUserSpecification) {
        this.autoUserSpecification = autoUserSpecification;
        return this;
    }

}
