// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The organization resource represents an instance of global settings and resources which operate and are provisioned
 * at the tenant-level.
 */
@Fluent
public final class MicrosoftGraphOrganizationInner extends MicrosoftGraphDirectoryObjectInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOrganizationInner.class);

    /*
     * The collection of service plans associated with the tenant. Not
     * nullable.
     */
    @JsonProperty(value = "assignedPlans")
    private List<MicrosoftGraphAssignedPlan> assignedPlans;

    /*
     * Telephone number for the organization. NOTE: Although this is a string
     * collection, only one number can be set for this property.
     */
    @JsonProperty(value = "businessPhones")
    private List<String> businessPhones;

    /*
     * City name of the address for the organization.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * Country/region name of the address for the organization.
     */
    @JsonProperty(value = "country")
    private String country;

    /*
     * Country/region abbreviation for the organization.
     */
    @JsonProperty(value = "countryLetterCode")
    private String countryLetterCode;

    /*
     * Timestamp of when the organization was created. The value cannot be
     * modified and is automatically populated when the organization is
     * created. The Timestamp type represents date and time information using
     * ISO 8601 format and is always in UTC time. For example, midnight UTC on
     * Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * The display name for the tenant.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Not nullable.
     */
    @JsonProperty(value = "marketingNotificationEmails")
    private List<String> marketingNotificationEmails;

    /*
     * The time and date at which the tenant was last synced with the
     * on-premise directory. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For
     * example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'. Read-only.
     */
    @JsonProperty(value = "onPremisesLastSyncDateTime")
    private OffsetDateTime onPremisesLastSyncDateTime;

    /*
     * true if this object is synced from an on-premises directory; false if
     * this object was originally synced from an on-premises directory but is
     * no longer synced; null if this object has never been synced from an
     * on-premises directory (default).
     */
    @JsonProperty(value = "onPremisesSyncEnabled")
    private Boolean onPremisesSyncEnabled;

    /*
     * Postal code of the address for the organization.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /*
     * The preferred language for the organization. Should follow ISO 639-1
     * Code; for example 'en'.
     */
    @JsonProperty(value = "preferredLanguage")
    private String preferredLanguage;

    /*
     * privacyProfile
     */
    @JsonProperty(value = "privacyProfile")
    private MicrosoftGraphPrivacyProfile privacyProfile;

    /*
     * Not nullable.
     */
    @JsonProperty(value = "provisionedPlans")
    private List<MicrosoftGraphProvisionedPlan> provisionedPlans;

    /*
     * The securityComplianceNotificationMails property.
     */
    @JsonProperty(value = "securityComplianceNotificationMails")
    private List<String> securityComplianceNotificationMails;

    /*
     * The securityComplianceNotificationPhones property.
     */
    @JsonProperty(value = "securityComplianceNotificationPhones")
    private List<String> securityComplianceNotificationPhones;

    /*
     * State name of the address for the organization.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Street name of the address for organization.
     */
    @JsonProperty(value = "street")
    private String street;

    /*
     * Not nullable.
     */
    @JsonProperty(value = "technicalNotificationMails")
    private List<String> technicalNotificationMails;

    /*
     * The tenantType property.
     */
    @JsonProperty(value = "tenantType")
    private String tenantType;

    /*
     * The collection of domains associated with this tenant. Not nullable.
     */
    @JsonProperty(value = "verifiedDomains")
    private List<MicrosoftGraphVerifiedDomain> verifiedDomains;

    /*
     * mdmAuthority
     */
    @JsonProperty(value = "mobileDeviceManagementAuthority")
    private MicrosoftGraphMdmAuthority mobileDeviceManagementAuthority;

    /*
     * Navigation property to manage certificate-based authentication
     * configuration. Only a single instance of
     * certificateBasedAuthConfiguration can be created in the collection.
     */
    @JsonProperty(value = "certificateBasedAuthConfiguration")
    private List<MicrosoftGraphCertificateBasedAuthConfiguration> certificateBasedAuthConfiguration;

    /*
     * The collection of open extensions defined for the organization.
     * Read-only. Nullable.
     */
    @JsonProperty(value = "extensions")
    private List<MicrosoftGraphExtensionInner> extensions;

    /*
     * The organization resource represents an instance of global settings and
     * resources which operate and are provisioned at the tenant-level.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the assignedPlans property: The collection of service plans associated with the tenant. Not nullable.
     *
     * @return the assignedPlans value.
     */
    public List<MicrosoftGraphAssignedPlan> assignedPlans() {
        return this.assignedPlans;
    }

    /**
     * Set the assignedPlans property: The collection of service plans associated with the tenant. Not nullable.
     *
     * @param assignedPlans the assignedPlans value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withAssignedPlans(List<MicrosoftGraphAssignedPlan> assignedPlans) {
        this.assignedPlans = assignedPlans;
        return this;
    }

    /**
     * Get the businessPhones property: Telephone number for the organization. NOTE: Although this is a string
     * collection, only one number can be set for this property.
     *
     * @return the businessPhones value.
     */
    public List<String> businessPhones() {
        return this.businessPhones;
    }

    /**
     * Set the businessPhones property: Telephone number for the organization. NOTE: Although this is a string
     * collection, only one number can be set for this property.
     *
     * @param businessPhones the businessPhones value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withBusinessPhones(List<String> businessPhones) {
        this.businessPhones = businessPhones;
        return this;
    }

    /**
     * Get the city property: City name of the address for the organization.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: City name of the address for the organization.
     *
     * @param city the city value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the country property: Country/region name of the address for the organization.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country/region name of the address for the organization.
     *
     * @param country the country value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the countryLetterCode property: Country/region abbreviation for the organization.
     *
     * @return the countryLetterCode value.
     */
    public String countryLetterCode() {
        return this.countryLetterCode;
    }

    /**
     * Set the countryLetterCode property: Country/region abbreviation for the organization.
     *
     * @param countryLetterCode the countryLetterCode value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withCountryLetterCode(String countryLetterCode) {
        this.countryLetterCode = countryLetterCode;
        return this;
    }

    /**
     * Get the createdDateTime property: Timestamp of when the organization was created. The value cannot be modified
     * and is automatically populated when the organization is created. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'. Read-only.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Timestamp of when the organization was created. The value cannot be modified
     * and is automatically populated when the organization is created. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look
     * like this: '2014-01-01T00:00:00Z'. Read-only.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the displayName property: The display name for the tenant.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the tenant.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the marketingNotificationEmails property: Not nullable.
     *
     * @return the marketingNotificationEmails value.
     */
    public List<String> marketingNotificationEmails() {
        return this.marketingNotificationEmails;
    }

    /**
     * Set the marketingNotificationEmails property: Not nullable.
     *
     * @param marketingNotificationEmails the marketingNotificationEmails value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withMarketingNotificationEmails(List<String> marketingNotificationEmails) {
        this.marketingNotificationEmails = marketingNotificationEmails;
        return this;
    }

    /**
     * Get the onPremisesLastSyncDateTime property: The time and date at which the tenant was last synced with the
     * on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     *
     * @return the onPremisesLastSyncDateTime value.
     */
    public OffsetDateTime onPremisesLastSyncDateTime() {
        return this.onPremisesLastSyncDateTime;
    }

    /**
     * Set the onPremisesLastSyncDateTime property: The time and date at which the tenant was last synced with the
     * on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     *
     * @param onPremisesLastSyncDateTime the onPremisesLastSyncDateTime value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withOnPremisesLastSyncDateTime(OffsetDateTime onPremisesLastSyncDateTime) {
        this.onPremisesLastSyncDateTime = onPremisesLastSyncDateTime;
        return this;
    }

    /**
     * Get the onPremisesSyncEnabled property: true if this object is synced from an on-premises directory; false if
     * this object was originally synced from an on-premises directory but is no longer synced; null if this object has
     * never been synced from an on-premises directory (default).
     *
     * @return the onPremisesSyncEnabled value.
     */
    public Boolean onPremisesSyncEnabled() {
        return this.onPremisesSyncEnabled;
    }

    /**
     * Set the onPremisesSyncEnabled property: true if this object is synced from an on-premises directory; false if
     * this object was originally synced from an on-premises directory but is no longer synced; null if this object has
     * never been synced from an on-premises directory (default).
     *
     * @param onPremisesSyncEnabled the onPremisesSyncEnabled value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withOnPremisesSyncEnabled(Boolean onPremisesSyncEnabled) {
        this.onPremisesSyncEnabled = onPremisesSyncEnabled;
        return this;
    }

    /**
     * Get the postalCode property: Postal code of the address for the organization.
     *
     * @return the postalCode value.
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: Postal code of the address for the organization.
     *
     * @param postalCode the postalCode value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the preferredLanguage property: The preferred language for the organization. Should follow ISO 639-1 Code;
     * for example 'en'.
     *
     * @return the preferredLanguage value.
     */
    public String preferredLanguage() {
        return this.preferredLanguage;
    }

    /**
     * Set the preferredLanguage property: The preferred language for the organization. Should follow ISO 639-1 Code;
     * for example 'en'.
     *
     * @param preferredLanguage the preferredLanguage value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }

    /**
     * Get the privacyProfile property: privacyProfile.
     *
     * @return the privacyProfile value.
     */
    public MicrosoftGraphPrivacyProfile privacyProfile() {
        return this.privacyProfile;
    }

    /**
     * Set the privacyProfile property: privacyProfile.
     *
     * @param privacyProfile the privacyProfile value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withPrivacyProfile(MicrosoftGraphPrivacyProfile privacyProfile) {
        this.privacyProfile = privacyProfile;
        return this;
    }

    /**
     * Get the provisionedPlans property: Not nullable.
     *
     * @return the provisionedPlans value.
     */
    public List<MicrosoftGraphProvisionedPlan> provisionedPlans() {
        return this.provisionedPlans;
    }

    /**
     * Set the provisionedPlans property: Not nullable.
     *
     * @param provisionedPlans the provisionedPlans value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withProvisionedPlans(List<MicrosoftGraphProvisionedPlan> provisionedPlans) {
        this.provisionedPlans = provisionedPlans;
        return this;
    }

    /**
     * Get the securityComplianceNotificationMails property: The securityComplianceNotificationMails property.
     *
     * @return the securityComplianceNotificationMails value.
     */
    public List<String> securityComplianceNotificationMails() {
        return this.securityComplianceNotificationMails;
    }

    /**
     * Set the securityComplianceNotificationMails property: The securityComplianceNotificationMails property.
     *
     * @param securityComplianceNotificationMails the securityComplianceNotificationMails value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withSecurityComplianceNotificationMails(
        List<String> securityComplianceNotificationMails) {
        this.securityComplianceNotificationMails = securityComplianceNotificationMails;
        return this;
    }

    /**
     * Get the securityComplianceNotificationPhones property: The securityComplianceNotificationPhones property.
     *
     * @return the securityComplianceNotificationPhones value.
     */
    public List<String> securityComplianceNotificationPhones() {
        return this.securityComplianceNotificationPhones;
    }

    /**
     * Set the securityComplianceNotificationPhones property: The securityComplianceNotificationPhones property.
     *
     * @param securityComplianceNotificationPhones the securityComplianceNotificationPhones value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withSecurityComplianceNotificationPhones(
        List<String> securityComplianceNotificationPhones) {
        this.securityComplianceNotificationPhones = securityComplianceNotificationPhones;
        return this;
    }

    /**
     * Get the state property: State name of the address for the organization.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State name of the address for the organization.
     *
     * @param state the state value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the street property: Street name of the address for organization.
     *
     * @return the street value.
     */
    public String street() {
        return this.street;
    }

    /**
     * Set the street property: Street name of the address for organization.
     *
     * @param street the street value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Get the technicalNotificationMails property: Not nullable.
     *
     * @return the technicalNotificationMails value.
     */
    public List<String> technicalNotificationMails() {
        return this.technicalNotificationMails;
    }

    /**
     * Set the technicalNotificationMails property: Not nullable.
     *
     * @param technicalNotificationMails the technicalNotificationMails value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withTechnicalNotificationMails(List<String> technicalNotificationMails) {
        this.technicalNotificationMails = technicalNotificationMails;
        return this;
    }

    /**
     * Get the tenantType property: The tenantType property.
     *
     * @return the tenantType value.
     */
    public String tenantType() {
        return this.tenantType;
    }

    /**
     * Set the tenantType property: The tenantType property.
     *
     * @param tenantType the tenantType value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }

    /**
     * Get the verifiedDomains property: The collection of domains associated with this tenant. Not nullable.
     *
     * @return the verifiedDomains value.
     */
    public List<MicrosoftGraphVerifiedDomain> verifiedDomains() {
        return this.verifiedDomains;
    }

    /**
     * Set the verifiedDomains property: The collection of domains associated with this tenant. Not nullable.
     *
     * @param verifiedDomains the verifiedDomains value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withVerifiedDomains(List<MicrosoftGraphVerifiedDomain> verifiedDomains) {
        this.verifiedDomains = verifiedDomains;
        return this;
    }

    /**
     * Get the mobileDeviceManagementAuthority property: mdmAuthority.
     *
     * @return the mobileDeviceManagementAuthority value.
     */
    public MicrosoftGraphMdmAuthority mobileDeviceManagementAuthority() {
        return this.mobileDeviceManagementAuthority;
    }

    /**
     * Set the mobileDeviceManagementAuthority property: mdmAuthority.
     *
     * @param mobileDeviceManagementAuthority the mobileDeviceManagementAuthority value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withMobileDeviceManagementAuthority(
        MicrosoftGraphMdmAuthority mobileDeviceManagementAuthority) {
        this.mobileDeviceManagementAuthority = mobileDeviceManagementAuthority;
        return this;
    }

    /**
     * Get the certificateBasedAuthConfiguration property: Navigation property to manage certificate-based
     * authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the
     * collection.
     *
     * @return the certificateBasedAuthConfiguration value.
     */
    public List<MicrosoftGraphCertificateBasedAuthConfiguration> certificateBasedAuthConfiguration() {
        return this.certificateBasedAuthConfiguration;
    }

    /**
     * Set the certificateBasedAuthConfiguration property: Navigation property to manage certificate-based
     * authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the
     * collection.
     *
     * @param certificateBasedAuthConfiguration the certificateBasedAuthConfiguration value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withCertificateBasedAuthConfiguration(
        List<MicrosoftGraphCertificateBasedAuthConfiguration> certificateBasedAuthConfiguration) {
        this.certificateBasedAuthConfiguration = certificateBasedAuthConfiguration;
        return this;
    }

    /**
     * Get the extensions property: The collection of open extensions defined for the organization. Read-only. Nullable.
     *
     * @return the extensions value.
     */
    public List<MicrosoftGraphExtensionInner> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The collection of open extensions defined for the organization. Read-only. Nullable.
     *
     * @param extensions the extensions value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withExtensions(List<MicrosoftGraphExtensionInner> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the additionalProperties property: The organization resource represents an instance of global settings and
     * resources which operate and are provisioned at the tenant-level.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The organization resource represents an instance of global settings and
     * resources which operate and are provisioned at the tenant-level.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOrganizationInner object itself.
     */
    public MicrosoftGraphOrganizationInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOrganizationInner withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphOrganizationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (assignedPlans() != null) {
            assignedPlans().forEach(e -> e.validate());
        }
        if (privacyProfile() != null) {
            privacyProfile().validate();
        }
        if (provisionedPlans() != null) {
            provisionedPlans().forEach(e -> e.validate());
        }
        if (verifiedDomains() != null) {
            verifiedDomains().forEach(e -> e.validate());
        }
        if (certificateBasedAuthConfiguration() != null) {
            certificateBasedAuthConfiguration().forEach(e -> e.validate());
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }
}
