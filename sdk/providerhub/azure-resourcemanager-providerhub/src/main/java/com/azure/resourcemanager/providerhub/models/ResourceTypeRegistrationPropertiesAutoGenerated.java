// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceTypeRegistrationPropertiesAutoGenerated model. */
@Fluent
public class ResourceTypeRegistrationPropertiesAutoGenerated {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ResourceTypeRegistrationPropertiesAutoGenerated.class);

    /*
     * The routingType property.
     */
    @JsonProperty(value = "routingType")
    private RoutingType routingType;

    /*
     * The regionality property.
     */
    @JsonProperty(value = "regionality")
    private Regionality regionality;

    /*
     * The endpoints property.
     */
    @JsonProperty(value = "endpoints")
    private List<ResourceTypeEndpoint> endpoints;

    /*
     * The extensionOptions property.
     */
    @JsonProperty(value = "extensionOptions")
    private ResourceTypeRegistrationPropertiesExtensionOptions extensionOptions;

    /*
     * The marketplaceType property.
     */
    @JsonProperty(value = "marketplaceType")
    private ResourceTypeRegistrationPropertiesMarketplaceType marketplaceType;

    /*
     * The swaggerSpecifications property.
     */
    @JsonProperty(value = "swaggerSpecifications")
    private List<SwaggerSpecification> swaggerSpecifications;

    /*
     * The allowedUnauthorizedActions property.
     */
    @JsonProperty(value = "allowedUnauthorizedActions")
    private List<String> allowedUnauthorizedActions;

    /*
     * The authorizationActionMappings property.
     */
    @JsonProperty(value = "authorizationActionMappings")
    private List<AuthorizationActionMapping> authorizationActionMappings;

    /*
     * The linkedAccessChecks property.
     */
    @JsonProperty(value = "linkedAccessChecks")
    private List<LinkedAccessCheck> linkedAccessChecks;

    /*
     * The defaultApiVersion property.
     */
    @JsonProperty(value = "defaultApiVersion")
    private String defaultApiVersion;

    /*
     * The loggingRules property.
     */
    @JsonProperty(value = "loggingRules")
    private List<LoggingRule> loggingRules;

    /*
     * The throttlingRules property.
     */
    @JsonProperty(value = "throttlingRules")
    private List<ThrottlingRule> throttlingRules;

    /*
     * The requiredFeatures property.
     */
    @JsonProperty(value = "requiredFeatures")
    private List<String> requiredFeatures;

    /*
     * The featuresRule property.
     */
    @JsonProperty(value = "featuresRule")
    private ResourceTypeRegistrationPropertiesFeaturesRule featuresRule;

    /*
     * The enableAsyncOperation property.
     */
    @JsonProperty(value = "enableAsyncOperation")
    private Boolean enableAsyncOperation;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The enableThirdPartyS2S property.
     */
    @JsonProperty(value = "enableThirdPartyS2S")
    private Boolean enableThirdPartyS2S;

    /*
     * The subscriptionLifecycleNotificationSpecifications property.
     */
    @JsonProperty(value = "subscriptionLifecycleNotificationSpecifications")
    private ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecifications
        subscriptionLifecycleNotificationSpecifications;

    /*
     * The isPureProxy property.
     */
    @JsonProperty(value = "isPureProxy")
    private Boolean isPureProxy;

    /*
     * The identityManagement property.
     */
    @JsonProperty(value = "identityManagement")
    private ResourceTypeRegistrationPropertiesIdentityManagement identityManagement;

    /*
     * The checkNameAvailabilitySpecifications property.
     */
    @JsonProperty(value = "checkNameAvailabilitySpecifications")
    private ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecifications checkNameAvailabilitySpecifications;

    /*
     * The disallowedActionVerbs property.
     */
    @JsonProperty(value = "disallowedActionVerbs")
    private List<String> disallowedActionVerbs;

    /*
     * The serviceTreeInfos property.
     */
    @JsonProperty(value = "serviceTreeInfos")
    private List<ServiceTreeInfo> serviceTreeInfos;

    /*
     * The requestHeaderOptions property.
     */
    @JsonProperty(value = "requestHeaderOptions")
    private ResourceTypeRegistrationPropertiesRequestHeaderOptions requestHeaderOptions;

    /*
     * The subscriptionStateRules property.
     */
    @JsonProperty(value = "subscriptionStateRules")
    private List<SubscriptionStateRule> subscriptionStateRules;

    /*
     * The templateDeploymentOptions property.
     */
    @JsonProperty(value = "templateDeploymentOptions")
    private ResourceTypeRegistrationPropertiesTemplateDeploymentOptions templateDeploymentOptions;

    /*
     * The extendedLocations property.
     */
    @JsonProperty(value = "extendedLocations")
    private List<ExtendedLocationOptions> extendedLocations;

    /*
     * The resourceMovePolicy property.
     */
    @JsonProperty(value = "resourceMovePolicy")
    private ResourceTypeRegistrationPropertiesResourceMovePolicy resourceMovePolicy;

    /*
     * The resourceDeletionPolicy property.
     */
    @JsonProperty(value = "resourceDeletionPolicy")
    private ResourceDeletionPolicy resourceDeletionPolicy;

    /**
     * Get the routingType property: The routingType property.
     *
     * @return the routingType value.
     */
    public RoutingType routingType() {
        return this.routingType;
    }

    /**
     * Set the routingType property: The routingType property.
     *
     * @param routingType the routingType value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withRoutingType(RoutingType routingType) {
        this.routingType = routingType;
        return this;
    }

    /**
     * Get the regionality property: The regionality property.
     *
     * @return the regionality value.
     */
    public Regionality regionality() {
        return this.regionality;
    }

    /**
     * Set the regionality property: The regionality property.
     *
     * @param regionality the regionality value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withRegionality(Regionality regionality) {
        this.regionality = regionality;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints property.
     *
     * @return the endpoints value.
     */
    public List<ResourceTypeEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints property.
     *
     * @param endpoints the endpoints value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withEndpoints(List<ResourceTypeEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the extensionOptions property: The extensionOptions property.
     *
     * @return the extensionOptions value.
     */
    public ResourceTypeRegistrationPropertiesExtensionOptions extensionOptions() {
        return this.extensionOptions;
    }

    /**
     * Set the extensionOptions property: The extensionOptions property.
     *
     * @param extensionOptions the extensionOptions value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withExtensionOptions(
        ResourceTypeRegistrationPropertiesExtensionOptions extensionOptions) {
        this.extensionOptions = extensionOptions;
        return this;
    }

    /**
     * Get the marketplaceType property: The marketplaceType property.
     *
     * @return the marketplaceType value.
     */
    public ResourceTypeRegistrationPropertiesMarketplaceType marketplaceType() {
        return this.marketplaceType;
    }

    /**
     * Set the marketplaceType property: The marketplaceType property.
     *
     * @param marketplaceType the marketplaceType value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withMarketplaceType(
        ResourceTypeRegistrationPropertiesMarketplaceType marketplaceType) {
        this.marketplaceType = marketplaceType;
        return this;
    }

    /**
     * Get the swaggerSpecifications property: The swaggerSpecifications property.
     *
     * @return the swaggerSpecifications value.
     */
    public List<SwaggerSpecification> swaggerSpecifications() {
        return this.swaggerSpecifications;
    }

    /**
     * Set the swaggerSpecifications property: The swaggerSpecifications property.
     *
     * @param swaggerSpecifications the swaggerSpecifications value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withSwaggerSpecifications(
        List<SwaggerSpecification> swaggerSpecifications) {
        this.swaggerSpecifications = swaggerSpecifications;
        return this;
    }

    /**
     * Get the allowedUnauthorizedActions property: The allowedUnauthorizedActions property.
     *
     * @return the allowedUnauthorizedActions value.
     */
    public List<String> allowedUnauthorizedActions() {
        return this.allowedUnauthorizedActions;
    }

    /**
     * Set the allowedUnauthorizedActions property: The allowedUnauthorizedActions property.
     *
     * @param allowedUnauthorizedActions the allowedUnauthorizedActions value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withAllowedUnauthorizedActions(
        List<String> allowedUnauthorizedActions) {
        this.allowedUnauthorizedActions = allowedUnauthorizedActions;
        return this;
    }

    /**
     * Get the authorizationActionMappings property: The authorizationActionMappings property.
     *
     * @return the authorizationActionMappings value.
     */
    public List<AuthorizationActionMapping> authorizationActionMappings() {
        return this.authorizationActionMappings;
    }

    /**
     * Set the authorizationActionMappings property: The authorizationActionMappings property.
     *
     * @param authorizationActionMappings the authorizationActionMappings value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withAuthorizationActionMappings(
        List<AuthorizationActionMapping> authorizationActionMappings) {
        this.authorizationActionMappings = authorizationActionMappings;
        return this;
    }

    /**
     * Get the linkedAccessChecks property: The linkedAccessChecks property.
     *
     * @return the linkedAccessChecks value.
     */
    public List<LinkedAccessCheck> linkedAccessChecks() {
        return this.linkedAccessChecks;
    }

    /**
     * Set the linkedAccessChecks property: The linkedAccessChecks property.
     *
     * @param linkedAccessChecks the linkedAccessChecks value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withLinkedAccessChecks(
        List<LinkedAccessCheck> linkedAccessChecks) {
        this.linkedAccessChecks = linkedAccessChecks;
        return this;
    }

    /**
     * Get the defaultApiVersion property: The defaultApiVersion property.
     *
     * @return the defaultApiVersion value.
     */
    public String defaultApiVersion() {
        return this.defaultApiVersion;
    }

    /**
     * Set the defaultApiVersion property: The defaultApiVersion property.
     *
     * @param defaultApiVersion the defaultApiVersion value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withDefaultApiVersion(String defaultApiVersion) {
        this.defaultApiVersion = defaultApiVersion;
        return this;
    }

    /**
     * Get the loggingRules property: The loggingRules property.
     *
     * @return the loggingRules value.
     */
    public List<LoggingRule> loggingRules() {
        return this.loggingRules;
    }

    /**
     * Set the loggingRules property: The loggingRules property.
     *
     * @param loggingRules the loggingRules value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withLoggingRules(List<LoggingRule> loggingRules) {
        this.loggingRules = loggingRules;
        return this;
    }

    /**
     * Get the throttlingRules property: The throttlingRules property.
     *
     * @return the throttlingRules value.
     */
    public List<ThrottlingRule> throttlingRules() {
        return this.throttlingRules;
    }

    /**
     * Set the throttlingRules property: The throttlingRules property.
     *
     * @param throttlingRules the throttlingRules value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withThrottlingRules(List<ThrottlingRule> throttlingRules) {
        this.throttlingRules = throttlingRules;
        return this;
    }

    /**
     * Get the requiredFeatures property: The requiredFeatures property.
     *
     * @return the requiredFeatures value.
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Set the requiredFeatures property: The requiredFeatures property.
     *
     * @param requiredFeatures the requiredFeatures value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withRequiredFeatures(List<String> requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
        return this;
    }

    /**
     * Get the featuresRule property: The featuresRule property.
     *
     * @return the featuresRule value.
     */
    public ResourceTypeRegistrationPropertiesFeaturesRule featuresRule() {
        return this.featuresRule;
    }

    /**
     * Set the featuresRule property: The featuresRule property.
     *
     * @param featuresRule the featuresRule value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withFeaturesRule(
        ResourceTypeRegistrationPropertiesFeaturesRule featuresRule) {
        this.featuresRule = featuresRule;
        return this;
    }

    /**
     * Get the enableAsyncOperation property: The enableAsyncOperation property.
     *
     * @return the enableAsyncOperation value.
     */
    public Boolean enableAsyncOperation() {
        return this.enableAsyncOperation;
    }

    /**
     * Set the enableAsyncOperation property: The enableAsyncOperation property.
     *
     * @param enableAsyncOperation the enableAsyncOperation value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withEnableAsyncOperation(Boolean enableAsyncOperation) {
        this.enableAsyncOperation = enableAsyncOperation;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioningState property.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the enableThirdPartyS2S property: The enableThirdPartyS2S property.
     *
     * @return the enableThirdPartyS2S value.
     */
    public Boolean enableThirdPartyS2S() {
        return this.enableThirdPartyS2S;
    }

    /**
     * Set the enableThirdPartyS2S property: The enableThirdPartyS2S property.
     *
     * @param enableThirdPartyS2S the enableThirdPartyS2S value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withEnableThirdPartyS2S(Boolean enableThirdPartyS2S) {
        this.enableThirdPartyS2S = enableThirdPartyS2S;
        return this;
    }

    /**
     * Get the subscriptionLifecycleNotificationSpecifications property: The
     * subscriptionLifecycleNotificationSpecifications property.
     *
     * @return the subscriptionLifecycleNotificationSpecifications value.
     */
    public ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecifications
        subscriptionLifecycleNotificationSpecifications() {
        return this.subscriptionLifecycleNotificationSpecifications;
    }

    /**
     * Set the subscriptionLifecycleNotificationSpecifications property: The
     * subscriptionLifecycleNotificationSpecifications property.
     *
     * @param subscriptionLifecycleNotificationSpecifications the subscriptionLifecycleNotificationSpecifications value
     *     to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withSubscriptionLifecycleNotificationSpecifications(
        ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecifications
            subscriptionLifecycleNotificationSpecifications) {
        this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
        return this;
    }

    /**
     * Get the isPureProxy property: The isPureProxy property.
     *
     * @return the isPureProxy value.
     */
    public Boolean isPureProxy() {
        return this.isPureProxy;
    }

    /**
     * Set the isPureProxy property: The isPureProxy property.
     *
     * @param isPureProxy the isPureProxy value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withIsPureProxy(Boolean isPureProxy) {
        this.isPureProxy = isPureProxy;
        return this;
    }

    /**
     * Get the identityManagement property: The identityManagement property.
     *
     * @return the identityManagement value.
     */
    public ResourceTypeRegistrationPropertiesIdentityManagement identityManagement() {
        return this.identityManagement;
    }

    /**
     * Set the identityManagement property: The identityManagement property.
     *
     * @param identityManagement the identityManagement value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withIdentityManagement(
        ResourceTypeRegistrationPropertiesIdentityManagement identityManagement) {
        this.identityManagement = identityManagement;
        return this;
    }

    /**
     * Get the checkNameAvailabilitySpecifications property: The checkNameAvailabilitySpecifications property.
     *
     * @return the checkNameAvailabilitySpecifications value.
     */
    public ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecifications checkNameAvailabilitySpecifications() {
        return this.checkNameAvailabilitySpecifications;
    }

    /**
     * Set the checkNameAvailabilitySpecifications property: The checkNameAvailabilitySpecifications property.
     *
     * @param checkNameAvailabilitySpecifications the checkNameAvailabilitySpecifications value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withCheckNameAvailabilitySpecifications(
        ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecifications checkNameAvailabilitySpecifications) {
        this.checkNameAvailabilitySpecifications = checkNameAvailabilitySpecifications;
        return this;
    }

    /**
     * Get the disallowedActionVerbs property: The disallowedActionVerbs property.
     *
     * @return the disallowedActionVerbs value.
     */
    public List<String> disallowedActionVerbs() {
        return this.disallowedActionVerbs;
    }

    /**
     * Set the disallowedActionVerbs property: The disallowedActionVerbs property.
     *
     * @param disallowedActionVerbs the disallowedActionVerbs value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withDisallowedActionVerbs(
        List<String> disallowedActionVerbs) {
        this.disallowedActionVerbs = disallowedActionVerbs;
        return this;
    }

    /**
     * Get the serviceTreeInfos property: The serviceTreeInfos property.
     *
     * @return the serviceTreeInfos value.
     */
    public List<ServiceTreeInfo> serviceTreeInfos() {
        return this.serviceTreeInfos;
    }

    /**
     * Set the serviceTreeInfos property: The serviceTreeInfos property.
     *
     * @param serviceTreeInfos the serviceTreeInfos value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withServiceTreeInfos(
        List<ServiceTreeInfo> serviceTreeInfos) {
        this.serviceTreeInfos = serviceTreeInfos;
        return this;
    }

    /**
     * Get the requestHeaderOptions property: The requestHeaderOptions property.
     *
     * @return the requestHeaderOptions value.
     */
    public ResourceTypeRegistrationPropertiesRequestHeaderOptions requestHeaderOptions() {
        return this.requestHeaderOptions;
    }

    /**
     * Set the requestHeaderOptions property: The requestHeaderOptions property.
     *
     * @param requestHeaderOptions the requestHeaderOptions value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withRequestHeaderOptions(
        ResourceTypeRegistrationPropertiesRequestHeaderOptions requestHeaderOptions) {
        this.requestHeaderOptions = requestHeaderOptions;
        return this;
    }

    /**
     * Get the subscriptionStateRules property: The subscriptionStateRules property.
     *
     * @return the subscriptionStateRules value.
     */
    public List<SubscriptionStateRule> subscriptionStateRules() {
        return this.subscriptionStateRules;
    }

    /**
     * Set the subscriptionStateRules property: The subscriptionStateRules property.
     *
     * @param subscriptionStateRules the subscriptionStateRules value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withSubscriptionStateRules(
        List<SubscriptionStateRule> subscriptionStateRules) {
        this.subscriptionStateRules = subscriptionStateRules;
        return this;
    }

    /**
     * Get the templateDeploymentOptions property: The templateDeploymentOptions property.
     *
     * @return the templateDeploymentOptions value.
     */
    public ResourceTypeRegistrationPropertiesTemplateDeploymentOptions templateDeploymentOptions() {
        return this.templateDeploymentOptions;
    }

    /**
     * Set the templateDeploymentOptions property: The templateDeploymentOptions property.
     *
     * @param templateDeploymentOptions the templateDeploymentOptions value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withTemplateDeploymentOptions(
        ResourceTypeRegistrationPropertiesTemplateDeploymentOptions templateDeploymentOptions) {
        this.templateDeploymentOptions = templateDeploymentOptions;
        return this;
    }

    /**
     * Get the extendedLocations property: The extendedLocations property.
     *
     * @return the extendedLocations value.
     */
    public List<ExtendedLocationOptions> extendedLocations() {
        return this.extendedLocations;
    }

    /**
     * Set the extendedLocations property: The extendedLocations property.
     *
     * @param extendedLocations the extendedLocations value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withExtendedLocations(
        List<ExtendedLocationOptions> extendedLocations) {
        this.extendedLocations = extendedLocations;
        return this;
    }

    /**
     * Get the resourceMovePolicy property: The resourceMovePolicy property.
     *
     * @return the resourceMovePolicy value.
     */
    public ResourceTypeRegistrationPropertiesResourceMovePolicy resourceMovePolicy() {
        return this.resourceMovePolicy;
    }

    /**
     * Set the resourceMovePolicy property: The resourceMovePolicy property.
     *
     * @param resourceMovePolicy the resourceMovePolicy value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withResourceMovePolicy(
        ResourceTypeRegistrationPropertiesResourceMovePolicy resourceMovePolicy) {
        this.resourceMovePolicy = resourceMovePolicy;
        return this;
    }

    /**
     * Get the resourceDeletionPolicy property: The resourceDeletionPolicy property.
     *
     * @return the resourceDeletionPolicy value.
     */
    public ResourceDeletionPolicy resourceDeletionPolicy() {
        return this.resourceDeletionPolicy;
    }

    /**
     * Set the resourceDeletionPolicy property: The resourceDeletionPolicy property.
     *
     * @param resourceDeletionPolicy the resourceDeletionPolicy value to set.
     * @return the ResourceTypeRegistrationPropertiesAutoGenerated object itself.
     */
    public ResourceTypeRegistrationPropertiesAutoGenerated withResourceDeletionPolicy(
        ResourceDeletionPolicy resourceDeletionPolicy) {
        this.resourceDeletionPolicy = resourceDeletionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (extensionOptions() != null) {
            extensionOptions().validate();
        }
        if (swaggerSpecifications() != null) {
            swaggerSpecifications().forEach(e -> e.validate());
        }
        if (authorizationActionMappings() != null) {
            authorizationActionMappings().forEach(e -> e.validate());
        }
        if (linkedAccessChecks() != null) {
            linkedAccessChecks().forEach(e -> e.validate());
        }
        if (loggingRules() != null) {
            loggingRules().forEach(e -> e.validate());
        }
        if (throttlingRules() != null) {
            throttlingRules().forEach(e -> e.validate());
        }
        if (featuresRule() != null) {
            featuresRule().validate();
        }
        if (subscriptionLifecycleNotificationSpecifications() != null) {
            subscriptionLifecycleNotificationSpecifications().validate();
        }
        if (identityManagement() != null) {
            identityManagement().validate();
        }
        if (checkNameAvailabilitySpecifications() != null) {
            checkNameAvailabilitySpecifications().validate();
        }
        if (serviceTreeInfos() != null) {
            serviceTreeInfos().forEach(e -> e.validate());
        }
        if (requestHeaderOptions() != null) {
            requestHeaderOptions().validate();
        }
        if (subscriptionStateRules() != null) {
            subscriptionStateRules().forEach(e -> e.validate());
        }
        if (templateDeploymentOptions() != null) {
            templateDeploymentOptions().validate();
        }
        if (extendedLocations() != null) {
            extendedLocations().forEach(e -> e.validate());
        }
        if (resourceMovePolicy() != null) {
            resourceMovePolicy().validate();
        }
    }
}
