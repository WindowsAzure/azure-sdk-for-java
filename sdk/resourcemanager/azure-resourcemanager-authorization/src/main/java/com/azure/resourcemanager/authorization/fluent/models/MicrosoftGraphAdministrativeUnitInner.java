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
 * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public final class MicrosoftGraphAdministrativeUnitInner extends MicrosoftGraphDirectoryObjectInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphAdministrativeUnitInner.class);

    /*
     * An optional description for the administrative unit.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Display name for the administrative unit.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Controls whether the administrative unit and its members are hidden or
     * public. Can be set to HiddenMembership or Public. If not set, default
     * behavior is Public. When set to HiddenMembership, only members of the
     * administrative unit can list other members of the adminstrative unit.
     */
    @JsonProperty(value = "visibility")
    private String visibility;

    /*
     * Users and groups that are members of this Adminsitrative Unit. HTTP
     * Methods: GET (list members), POST (add members), DELETE (remove
     * members).
     */
    @JsonProperty(value = "members")
    private List<MicrosoftGraphDirectoryObjectInner> members;

    /*
     * Scoped-role members of this Administrative Unit.  HTTP Methods: GET
     * (list scopedRoleMemberships), POST (add scopedRoleMembership), DELETE
     * (remove scopedRoleMembership).
     */
    @JsonProperty(value = "scopedRoleMembers")
    private List<MicrosoftGraphScopedRoleMembershipInner> scopedRoleMembers;

    /*
     * The extensions property.
     */
    @JsonProperty(value = "extensions")
    private List<MicrosoftGraphExtensionInner> extensions;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the description property: An optional description for the administrative unit.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: An optional description for the administrative unit.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphAdministrativeUnitInner object itself.
     */
    public MicrosoftGraphAdministrativeUnitInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Display name for the administrative unit.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the administrative unit.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphAdministrativeUnitInner object itself.
     */
    public MicrosoftGraphAdministrativeUnitInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the visibility property: Controls whether the administrative unit and its members are hidden or public. Can
     * be set to HiddenMembership or Public. If not set, default behavior is Public. When set to HiddenMembership, only
     * members of the administrative unit can list other members of the adminstrative unit.
     *
     * @return the visibility value.
     */
    public String visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: Controls whether the administrative unit and its members are hidden or public. Can
     * be set to HiddenMembership or Public. If not set, default behavior is Public. When set to HiddenMembership, only
     * members of the administrative unit can list other members of the adminstrative unit.
     *
     * @param visibility the visibility value to set.
     * @return the MicrosoftGraphAdministrativeUnitInner object itself.
     */
    public MicrosoftGraphAdministrativeUnitInner withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the members property: Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list
     * members), POST (add members), DELETE (remove members).
     *
     * @return the members value.
     */
    public List<MicrosoftGraphDirectoryObjectInner> members() {
        return this.members;
    }

    /**
     * Set the members property: Users and groups that are members of this Adminsitrative Unit. HTTP Methods: GET (list
     * members), POST (add members), DELETE (remove members).
     *
     * @param members the members value to set.
     * @return the MicrosoftGraphAdministrativeUnitInner object itself.
     */
    public MicrosoftGraphAdministrativeUnitInner withMembers(List<MicrosoftGraphDirectoryObjectInner> members) {
        this.members = members;
        return this;
    }

    /**
     * Get the scopedRoleMembers property: Scoped-role members of this Administrative Unit. HTTP Methods: GET (list
     * scopedRoleMemberships), POST (add scopedRoleMembership), DELETE (remove scopedRoleMembership).
     *
     * @return the scopedRoleMembers value.
     */
    public List<MicrosoftGraphScopedRoleMembershipInner> scopedRoleMembers() {
        return this.scopedRoleMembers;
    }

    /**
     * Set the scopedRoleMembers property: Scoped-role members of this Administrative Unit. HTTP Methods: GET (list
     * scopedRoleMemberships), POST (add scopedRoleMembership), DELETE (remove scopedRoleMembership).
     *
     * @param scopedRoleMembers the scopedRoleMembers value to set.
     * @return the MicrosoftGraphAdministrativeUnitInner object itself.
     */
    public MicrosoftGraphAdministrativeUnitInner withScopedRoleMembers(
        List<MicrosoftGraphScopedRoleMembershipInner> scopedRoleMembers) {
        this.scopedRoleMembers = scopedRoleMembers;
        return this;
    }

    /**
     * Get the extensions property: The extensions property.
     *
     * @return the extensions value.
     */
    public List<MicrosoftGraphExtensionInner> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The extensions property.
     *
     * @param extensions the extensions value to set.
     * @return the MicrosoftGraphAdministrativeUnitInner object itself.
     */
    public MicrosoftGraphAdministrativeUnitInner withExtensions(List<MicrosoftGraphExtensionInner> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAdministrativeUnitInner object itself.
     */
    public MicrosoftGraphAdministrativeUnitInner withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphAdministrativeUnitInner withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphAdministrativeUnitInner withId(String id) {
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
        if (members() != null) {
            members().forEach(e -> e.validate());
        }
        if (scopedRoleMembers() != null) {
            scopedRoleMembers().forEach(e -> e.validate());
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }
}
