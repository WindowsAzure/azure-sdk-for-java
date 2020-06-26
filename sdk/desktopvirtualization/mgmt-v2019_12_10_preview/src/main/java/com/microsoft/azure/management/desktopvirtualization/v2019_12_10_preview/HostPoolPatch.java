/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * HostPool properties that can be patched.
 */
@JsonFlatten
public class HostPoolPatch extends ProxyResource {
    /**
     * tags to be updated.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Friendly name of HostPool.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Description of HostPool.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Custom rdp property of HostPool.
     */
    @JsonProperty(value = "properties.customRdpProperty")
    private String customRdpProperty;

    /**
     * The max session limit of HostPool.
     */
    @JsonProperty(value = "properties.maxSessionLimit")
    private Integer maxSessionLimit;

    /**
     * PersonalDesktopAssignment type for HostPool. Possible values include:
     * 'Automatic', 'Direct'.
     */
    @JsonProperty(value = "properties.personalDesktopAssignmentType")
    private PersonalDesktopAssignmentType personalDesktopAssignmentType;

    /**
     * The type of the load balancer. Possible values include: 'BreadthFirst',
     * 'DepthFirst', 'Persistent'.
     */
    @JsonProperty(value = "properties.loadBalancerType")
    private LoadBalancerType loadBalancerType;

    /**
     * The ring number of HostPool.
     */
    @JsonProperty(value = "properties.ring")
    private Integer ring;

    /**
     * Is validation environment.
     */
    @JsonProperty(value = "properties.validationEnvironment")
    private Boolean validationEnvironment;

    /**
     * The registration info of HostPool.
     */
    @JsonProperty(value = "properties.registrationInfo")
    private RegistrationInfoPatch registrationInfo;

    /**
     * Path to keyvault containing ssoContext secret.
     */
    @JsonProperty(value = "properties.ssoContext")
    private String ssoContext;

    /**
     * The type of preferred application group type, default to Desktop
     * Application Group. Possible values include: 'None', 'Desktop',
     * 'RailApplications'.
     */
    @JsonProperty(value = "properties.preferredAppGroupType")
    private PreferredAppGroupType preferredAppGroupType;

    /**
     * Get tags to be updated.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set tags to be updated.
     *
     * @param tags the tags value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get friendly name of HostPool.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of HostPool.
     *
     * @param friendlyName the friendlyName value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get description of HostPool.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of HostPool.
     *
     * @param description the description value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get custom rdp property of HostPool.
     *
     * @return the customRdpProperty value
     */
    public String customRdpProperty() {
        return this.customRdpProperty;
    }

    /**
     * Set custom rdp property of HostPool.
     *
     * @param customRdpProperty the customRdpProperty value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withCustomRdpProperty(String customRdpProperty) {
        this.customRdpProperty = customRdpProperty;
        return this;
    }

    /**
     * Get the max session limit of HostPool.
     *
     * @return the maxSessionLimit value
     */
    public Integer maxSessionLimit() {
        return this.maxSessionLimit;
    }

    /**
     * Set the max session limit of HostPool.
     *
     * @param maxSessionLimit the maxSessionLimit value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withMaxSessionLimit(Integer maxSessionLimit) {
        this.maxSessionLimit = maxSessionLimit;
        return this;
    }

    /**
     * Get personalDesktopAssignment type for HostPool. Possible values include: 'Automatic', 'Direct'.
     *
     * @return the personalDesktopAssignmentType value
     */
    public PersonalDesktopAssignmentType personalDesktopAssignmentType() {
        return this.personalDesktopAssignmentType;
    }

    /**
     * Set personalDesktopAssignment type for HostPool. Possible values include: 'Automatic', 'Direct'.
     *
     * @param personalDesktopAssignmentType the personalDesktopAssignmentType value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPersonalDesktopAssignmentType(PersonalDesktopAssignmentType personalDesktopAssignmentType) {
        this.personalDesktopAssignmentType = personalDesktopAssignmentType;
        return this;
    }

    /**
     * Get the type of the load balancer. Possible values include: 'BreadthFirst', 'DepthFirst', 'Persistent'.
     *
     * @return the loadBalancerType value
     */
    public LoadBalancerType loadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * Set the type of the load balancer. Possible values include: 'BreadthFirst', 'DepthFirst', 'Persistent'.
     *
     * @param loadBalancerType the loadBalancerType value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withLoadBalancerType(LoadBalancerType loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }

    /**
     * Get the ring number of HostPool.
     *
     * @return the ring value
     */
    public Integer ring() {
        return this.ring;
    }

    /**
     * Set the ring number of HostPool.
     *
     * @param ring the ring value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withRing(Integer ring) {
        this.ring = ring;
        return this;
    }

    /**
     * Get is validation environment.
     *
     * @return the validationEnvironment value
     */
    public Boolean validationEnvironment() {
        return this.validationEnvironment;
    }

    /**
     * Set is validation environment.
     *
     * @param validationEnvironment the validationEnvironment value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withValidationEnvironment(Boolean validationEnvironment) {
        this.validationEnvironment = validationEnvironment;
        return this;
    }

    /**
     * Get the registration info of HostPool.
     *
     * @return the registrationInfo value
     */
    public RegistrationInfoPatch registrationInfo() {
        return this.registrationInfo;
    }

    /**
     * Set the registration info of HostPool.
     *
     * @param registrationInfo the registrationInfo value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withRegistrationInfo(RegistrationInfoPatch registrationInfo) {
        this.registrationInfo = registrationInfo;
        return this;
    }

    /**
     * Get path to keyvault containing ssoContext secret.
     *
     * @return the ssoContext value
     */
    public String ssoContext() {
        return this.ssoContext;
    }

    /**
     * Set path to keyvault containing ssoContext secret.
     *
     * @param ssoContext the ssoContext value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withSsoContext(String ssoContext) {
        this.ssoContext = ssoContext;
        return this;
    }

    /**
     * Get the type of preferred application group type, default to Desktop Application Group. Possible values include: 'None', 'Desktop', 'RailApplications'.
     *
     * @return the preferredAppGroupType value
     */
    public PreferredAppGroupType preferredAppGroupType() {
        return this.preferredAppGroupType;
    }

    /**
     * Set the type of preferred application group type, default to Desktop Application Group. Possible values include: 'None', 'Desktop', 'RailApplications'.
     *
     * @param preferredAppGroupType the preferredAppGroupType value to set
     * @return the HostPoolPatch object itself.
     */
    public HostPoolPatch withPreferredAppGroupType(PreferredAppGroupType preferredAppGroupType) {
        this.preferredAppGroupType = preferredAppGroupType;
        return this;
    }

}
