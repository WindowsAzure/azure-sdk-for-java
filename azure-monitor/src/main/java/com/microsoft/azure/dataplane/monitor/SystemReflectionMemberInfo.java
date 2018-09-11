/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.dataplane.monitor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SystemReflectionMemberInfo model.
 */
public class SystemReflectionMemberInfo {
    /**
     * Possible values include: 'Constructor', 'Event', 'Field', 'Method',
     * 'Property', 'TypeInfo', 'Custom', 'NestedType', 'All'.
     */
    @JsonProperty(value = "MemberType")
    private String memberType;

    /**
     * The name property.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The declaringType property.
     */
    @JsonProperty(value = "DeclaringType")
    private SystemType declaringType;

    /**
     * The reflectedType property.
     */
    @JsonProperty(value = "ReflectedType")
    private SystemType reflectedType;

    /**
     * The customAttributes property.
     */
    @JsonProperty(value = "CustomAttributes")
    private List<SystemReflectionCustomAttributeData> customAttributes;

    /**
     * The metadataToken property.
     */
    @JsonProperty(value = "MetadataToken")
    private Integer metadataToken;

    /**
     * The module property.
     */
    @JsonProperty(value = "Module")
    private SystemReflectionModule module;

    /**
     * Get possible values include: 'Constructor', 'Event', 'Field', 'Method', 'Property', 'TypeInfo', 'Custom', 'NestedType', 'All'.
     *
     * @return the memberType value
     */
    public String memberType() {
        return this.memberType;
    }

    /**
     * Set possible values include: 'Constructor', 'Event', 'Field', 'Method', 'Property', 'TypeInfo', 'Custom', 'NestedType', 'All'.
     *
     * @param memberType the memberType value to set
     * @return the SystemReflectionMemberInfo object itself.
     */
    public SystemReflectionMemberInfo withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SystemReflectionMemberInfo object itself.
     */
    public SystemReflectionMemberInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the declaringType value.
     *
     * @return the declaringType value
     */
    public SystemType declaringType() {
        return this.declaringType;
    }

    /**
     * Set the declaringType value.
     *
     * @param declaringType the declaringType value to set
     * @return the SystemReflectionMemberInfo object itself.
     */
    public SystemReflectionMemberInfo withDeclaringType(SystemType declaringType) {
        this.declaringType = declaringType;
        return this;
    }

    /**
     * Get the reflectedType value.
     *
     * @return the reflectedType value
     */
    public SystemType reflectedType() {
        return this.reflectedType;
    }

    /**
     * Set the reflectedType value.
     *
     * @param reflectedType the reflectedType value to set
     * @return the SystemReflectionMemberInfo object itself.
     */
    public SystemReflectionMemberInfo withReflectedType(SystemType reflectedType) {
        this.reflectedType = reflectedType;
        return this;
    }

    /**
     * Get the customAttributes value.
     *
     * @return the customAttributes value
     */
    public List<SystemReflectionCustomAttributeData> customAttributes() {
        return this.customAttributes;
    }

    /**
     * Set the customAttributes value.
     *
     * @param customAttributes the customAttributes value to set
     * @return the SystemReflectionMemberInfo object itself.
     */
    public SystemReflectionMemberInfo withCustomAttributes(List<SystemReflectionCustomAttributeData> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    /**
     * Get the metadataToken value.
     *
     * @return the metadataToken value
     */
    public Integer metadataToken() {
        return this.metadataToken;
    }

    /**
     * Set the metadataToken value.
     *
     * @param metadataToken the metadataToken value to set
     * @return the SystemReflectionMemberInfo object itself.
     */
    public SystemReflectionMemberInfo withMetadataToken(Integer metadataToken) {
        this.metadataToken = metadataToken;
        return this;
    }

    /**
     * Get the module value.
     *
     * @return the module value
     */
    public SystemReflectionModule module() {
        return this.module;
    }

    /**
     * Set the module value.
     *
     * @param module the module value to set
     * @return the SystemReflectionMemberInfo object itself.
     */
    public SystemReflectionMemberInfo withModule(SystemReflectionModule module) {
        this.module = module;
        return this;
    }

}
