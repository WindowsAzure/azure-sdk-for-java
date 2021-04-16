// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a profile type participating in an interaction. */
@Fluent
public final class Participant {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Participant.class);

    /*
     * Profile type name.
     */
    @JsonProperty(value = "profileTypeName", required = true)
    private String profileTypeName;

    /*
     * The property references.
     */
    @JsonProperty(value = "participantPropertyReferences", required = true)
    private List<ParticipantPropertyReference> participantPropertyReferences;

    /*
     * Participant name.
     */
    @JsonProperty(value = "participantName", required = true)
    private String participantName;

    /*
     * Localized display name.
     */
    @JsonProperty(value = "displayName")
    private Map<String, String> displayName;

    /*
     * Localized descriptions.
     */
    @JsonProperty(value = "description")
    private Map<String, String> description;

    /*
     * The role that the participant is playing in the interaction.
     */
    @JsonProperty(value = "role")
    private String role;

    /**
     * Get the profileTypeName property: Profile type name.
     *
     * @return the profileTypeName value.
     */
    public String profileTypeName() {
        return this.profileTypeName;
    }

    /**
     * Set the profileTypeName property: Profile type name.
     *
     * @param profileTypeName the profileTypeName value to set.
     * @return the Participant object itself.
     */
    public Participant withProfileTypeName(String profileTypeName) {
        this.profileTypeName = profileTypeName;
        return this;
    }

    /**
     * Get the participantPropertyReferences property: The property references.
     *
     * @return the participantPropertyReferences value.
     */
    public List<ParticipantPropertyReference> participantPropertyReferences() {
        return this.participantPropertyReferences;
    }

    /**
     * Set the participantPropertyReferences property: The property references.
     *
     * @param participantPropertyReferences the participantPropertyReferences value to set.
     * @return the Participant object itself.
     */
    public Participant withParticipantPropertyReferences(
        List<ParticipantPropertyReference> participantPropertyReferences) {
        this.participantPropertyReferences = participantPropertyReferences;
        return this;
    }

    /**
     * Get the participantName property: Participant name.
     *
     * @return the participantName value.
     */
    public String participantName() {
        return this.participantName;
    }

    /**
     * Set the participantName property: Participant name.
     *
     * @param participantName the participantName value to set.
     * @return the Participant object itself.
     */
    public Participant withParticipantName(String participantName) {
        this.participantName = participantName;
        return this;
    }

    /**
     * Get the displayName property: Localized display name.
     *
     * @return the displayName value.
     */
    public Map<String, String> displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized display name.
     *
     * @param displayName the displayName value to set.
     * @return the Participant object itself.
     */
    public Participant withDisplayName(Map<String, String> displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: Localized descriptions.
     *
     * @return the description value.
     */
    public Map<String, String> description() {
        return this.description;
    }

    /**
     * Set the description property: Localized descriptions.
     *
     * @param description the description value to set.
     * @return the Participant object itself.
     */
    public Participant withDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    /**
     * Get the role property: The role that the participant is playing in the interaction.
     *
     * @return the role value.
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role property: The role that the participant is playing in the interaction.
     *
     * @param role the role value to set.
     * @return the Participant object itself.
     */
    public Participant withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (profileTypeName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property profileTypeName in model Participant"));
        }
        if (participantPropertyReferences() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property participantPropertyReferences in model Participant"));
        } else {
            participantPropertyReferences().forEach(e -> e.validate());
        }
        if (participantName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property participantName in model Participant"));
        }
    }
}
