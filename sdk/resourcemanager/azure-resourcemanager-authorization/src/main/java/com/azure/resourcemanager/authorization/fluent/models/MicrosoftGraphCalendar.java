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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** calendar. */
@Fluent
public final class MicrosoftGraphCalendar extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphCalendar.class);

    /*
     * Represent the online meeting service providers that can be used to
     * create online meetings in this calendar. Possible values are: unknown,
     * skypeForBusiness, skypeForConsumer, teamsForBusiness.
     */
    @JsonProperty(value = "allowedOnlineMeetingProviders")
    private List<MicrosoftGraphOnlineMeetingProviderType> allowedOnlineMeetingProviders;

    /*
     * True if the user can write to the calendar, false otherwise. This
     * property is true for the user who created the calendar. This property is
     * also true for a user who has been shared a calendar and granted write
     * access.
     */
    @JsonProperty(value = "canEdit")
    private Boolean canEdit;

    /*
     * True if the user has the permission to share the calendar, false
     * otherwise. Only the user who created the calendar can share it.
     */
    @JsonProperty(value = "canShare")
    private Boolean canShare;

    /*
     * True if the user can read calendar items that have been marked private,
     * false otherwise.
     */
    @JsonProperty(value = "canViewPrivateItems")
    private Boolean canViewPrivateItems;

    /*
     * Identifies the version of the calendar object. Every time the calendar
     * is changed, changeKey changes as well. This allows Exchange to apply
     * changes to the correct version of the object. Read-only.
     */
    @JsonProperty(value = "changeKey")
    private String changeKey;

    /*
     * The color property.
     */
    @JsonProperty(value = "color")
    private MicrosoftGraphCalendarColor color;

    /*
     * The defaultOnlineMeetingProvider property.
     */
    @JsonProperty(value = "defaultOnlineMeetingProvider")
    private MicrosoftGraphOnlineMeetingProviderType defaultOnlineMeetingProvider;

    /*
     * The hexColor property.
     */
    @JsonProperty(value = "hexColor")
    private String hexColor;

    /*
     * The isDefaultCalendar property.
     */
    @JsonProperty(value = "isDefaultCalendar")
    private Boolean isDefaultCalendar;

    /*
     * Indicates whether this user calendar can be deleted from the user
     * mailbox.
     */
    @JsonProperty(value = "isRemovable")
    private Boolean isRemovable;

    /*
     * Indicates whether this user calendar supports tracking of meeting
     * responses. Only meeting invites sent from users' primary calendars
     * support tracking of meeting responses.
     */
    @JsonProperty(value = "isTallyingResponses")
    private Boolean isTallyingResponses;

    /*
     * The calendar name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * emailAddress
     */
    @JsonProperty(value = "owner")
    private MicrosoftGraphEmailAddress owner;

    /*
     * The permissions of the users with whom the calendar is shared.
     */
    @JsonProperty(value = "calendarPermissions")
    private List<MicrosoftGraphCalendarPermission> calendarPermissions;

    /*
     * The calendar view for the calendar. Navigation property. Read-only.
     */
    @JsonProperty(value = "calendarView")
    private List<MicrosoftGraphEventInner> calendarView;

    /*
     * The events in the calendar. Navigation property. Read-only.
     */
    @JsonProperty(value = "events")
    private List<MicrosoftGraphEventInner> events;

    /*
     * The collection of multi-value extended properties defined for the
     * calendar. Read-only. Nullable.
     */
    @JsonProperty(value = "multiValueExtendedProperties")
    private List<MicrosoftGraphMultiValueLegacyExtendedPropertyInner> multiValueExtendedProperties;

    /*
     * The collection of single-value extended properties defined for the
     * calendar. Read-only. Nullable.
     */
    @JsonProperty(value = "singleValueExtendedProperties")
    private List<MicrosoftGraphSingleValueLegacyExtendedPropertyInner> singleValueExtendedProperties;

    /*
     * calendar
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowedOnlineMeetingProviders property: Represent the online meeting service providers that can be used
     * to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer,
     * teamsForBusiness.
     *
     * @return the allowedOnlineMeetingProviders value.
     */
    public List<MicrosoftGraphOnlineMeetingProviderType> allowedOnlineMeetingProviders() {
        return this.allowedOnlineMeetingProviders;
    }

    /**
     * Set the allowedOnlineMeetingProviders property: Represent the online meeting service providers that can be used
     * to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer,
     * teamsForBusiness.
     *
     * @param allowedOnlineMeetingProviders the allowedOnlineMeetingProviders value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withAllowedOnlineMeetingProviders(
        List<MicrosoftGraphOnlineMeetingProviderType> allowedOnlineMeetingProviders) {
        this.allowedOnlineMeetingProviders = allowedOnlineMeetingProviders;
        return this;
    }

    /**
     * Get the canEdit property: True if the user can write to the calendar, false otherwise. This property is true for
     * the user who created the calendar. This property is also true for a user who has been shared a calendar and
     * granted write access.
     *
     * @return the canEdit value.
     */
    public Boolean canEdit() {
        return this.canEdit;
    }

    /**
     * Set the canEdit property: True if the user can write to the calendar, false otherwise. This property is true for
     * the user who created the calendar. This property is also true for a user who has been shared a calendar and
     * granted write access.
     *
     * @param canEdit the canEdit value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * Get the canShare property: True if the user has the permission to share the calendar, false otherwise. Only the
     * user who created the calendar can share it.
     *
     * @return the canShare value.
     */
    public Boolean canShare() {
        return this.canShare;
    }

    /**
     * Set the canShare property: True if the user has the permission to share the calendar, false otherwise. Only the
     * user who created the calendar can share it.
     *
     * @param canShare the canShare value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCanShare(Boolean canShare) {
        this.canShare = canShare;
        return this;
    }

    /**
     * Get the canViewPrivateItems property: True if the user can read calendar items that have been marked private,
     * false otherwise.
     *
     * @return the canViewPrivateItems value.
     */
    public Boolean canViewPrivateItems() {
        return this.canViewPrivateItems;
    }

    /**
     * Set the canViewPrivateItems property: True if the user can read calendar items that have been marked private,
     * false otherwise.
     *
     * @param canViewPrivateItems the canViewPrivateItems value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCanViewPrivateItems(Boolean canViewPrivateItems) {
        this.canViewPrivateItems = canViewPrivateItems;
        return this;
    }

    /**
     * Get the changeKey property: Identifies the version of the calendar object. Every time the calendar is changed,
     * changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     *
     * @return the changeKey value.
     */
    public String changeKey() {
        return this.changeKey;
    }

    /**
     * Set the changeKey property: Identifies the version of the calendar object. Every time the calendar is changed,
     * changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     *
     * @param changeKey the changeKey value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withChangeKey(String changeKey) {
        this.changeKey = changeKey;
        return this;
    }

    /**
     * Get the color property: The color property.
     *
     * @return the color value.
     */
    public MicrosoftGraphCalendarColor color() {
        return this.color;
    }

    /**
     * Set the color property: The color property.
     *
     * @param color the color value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withColor(MicrosoftGraphCalendarColor color) {
        this.color = color;
        return this;
    }

    /**
     * Get the defaultOnlineMeetingProvider property: The defaultOnlineMeetingProvider property.
     *
     * @return the defaultOnlineMeetingProvider value.
     */
    public MicrosoftGraphOnlineMeetingProviderType defaultOnlineMeetingProvider() {
        return this.defaultOnlineMeetingProvider;
    }

    /**
     * Set the defaultOnlineMeetingProvider property: The defaultOnlineMeetingProvider property.
     *
     * @param defaultOnlineMeetingProvider the defaultOnlineMeetingProvider value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withDefaultOnlineMeetingProvider(
        MicrosoftGraphOnlineMeetingProviderType defaultOnlineMeetingProvider) {
        this.defaultOnlineMeetingProvider = defaultOnlineMeetingProvider;
        return this;
    }

    /**
     * Get the hexColor property: The hexColor property.
     *
     * @return the hexColor value.
     */
    public String hexColor() {
        return this.hexColor;
    }

    /**
     * Set the hexColor property: The hexColor property.
     *
     * @param hexColor the hexColor value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withHexColor(String hexColor) {
        this.hexColor = hexColor;
        return this;
    }

    /**
     * Get the isDefaultCalendar property: The isDefaultCalendar property.
     *
     * @return the isDefaultCalendar value.
     */
    public Boolean isDefaultCalendar() {
        return this.isDefaultCalendar;
    }

    /**
     * Set the isDefaultCalendar property: The isDefaultCalendar property.
     *
     * @param isDefaultCalendar the isDefaultCalendar value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withIsDefaultCalendar(Boolean isDefaultCalendar) {
        this.isDefaultCalendar = isDefaultCalendar;
        return this;
    }

    /**
     * Get the isRemovable property: Indicates whether this user calendar can be deleted from the user mailbox.
     *
     * @return the isRemovable value.
     */
    public Boolean isRemovable() {
        return this.isRemovable;
    }

    /**
     * Set the isRemovable property: Indicates whether this user calendar can be deleted from the user mailbox.
     *
     * @param isRemovable the isRemovable value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withIsRemovable(Boolean isRemovable) {
        this.isRemovable = isRemovable;
        return this;
    }

    /**
     * Get the isTallyingResponses property: Indicates whether this user calendar supports tracking of meeting
     * responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     *
     * @return the isTallyingResponses value.
     */
    public Boolean isTallyingResponses() {
        return this.isTallyingResponses;
    }

    /**
     * Set the isTallyingResponses property: Indicates whether this user calendar supports tracking of meeting
     * responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     *
     * @param isTallyingResponses the isTallyingResponses value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withIsTallyingResponses(Boolean isTallyingResponses) {
        this.isTallyingResponses = isTallyingResponses;
        return this;
    }

    /**
     * Get the name property: The calendar name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The calendar name.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the owner property: emailAddress.
     *
     * @return the owner value.
     */
    public MicrosoftGraphEmailAddress owner() {
        return this.owner;
    }

    /**
     * Set the owner property: emailAddress.
     *
     * @param owner the owner value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withOwner(MicrosoftGraphEmailAddress owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the calendarPermissions property: The permissions of the users with whom the calendar is shared.
     *
     * @return the calendarPermissions value.
     */
    public List<MicrosoftGraphCalendarPermission> calendarPermissions() {
        return this.calendarPermissions;
    }

    /**
     * Set the calendarPermissions property: The permissions of the users with whom the calendar is shared.
     *
     * @param calendarPermissions the calendarPermissions value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCalendarPermissions(List<MicrosoftGraphCalendarPermission> calendarPermissions) {
        this.calendarPermissions = calendarPermissions;
        return this;
    }

    /**
     * Get the calendarView property: The calendar view for the calendar. Navigation property. Read-only.
     *
     * @return the calendarView value.
     */
    public List<MicrosoftGraphEventInner> calendarView() {
        return this.calendarView;
    }

    /**
     * Set the calendarView property: The calendar view for the calendar. Navigation property. Read-only.
     *
     * @param calendarView the calendarView value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withCalendarView(List<MicrosoftGraphEventInner> calendarView) {
        this.calendarView = calendarView;
        return this;
    }

    /**
     * Get the events property: The events in the calendar. Navigation property. Read-only.
     *
     * @return the events value.
     */
    public List<MicrosoftGraphEventInner> events() {
        return this.events;
    }

    /**
     * Set the events property: The events in the calendar. Navigation property. Read-only.
     *
     * @param events the events value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withEvents(List<MicrosoftGraphEventInner> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the multiValueExtendedProperties property: The collection of multi-value extended properties defined for the
     * calendar. Read-only. Nullable.
     *
     * @return the multiValueExtendedProperties value.
     */
    public List<MicrosoftGraphMultiValueLegacyExtendedPropertyInner> multiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }

    /**
     * Set the multiValueExtendedProperties property: The collection of multi-value extended properties defined for the
     * calendar. Read-only. Nullable.
     *
     * @param multiValueExtendedProperties the multiValueExtendedProperties value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withMultiValueExtendedProperties(
        List<MicrosoftGraphMultiValueLegacyExtendedPropertyInner> multiValueExtendedProperties) {
        this.multiValueExtendedProperties = multiValueExtendedProperties;
        return this;
    }

    /**
     * Get the singleValueExtendedProperties property: The collection of single-value extended properties defined for
     * the calendar. Read-only. Nullable.
     *
     * @return the singleValueExtendedProperties value.
     */
    public List<MicrosoftGraphSingleValueLegacyExtendedPropertyInner> singleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }

    /**
     * Set the singleValueExtendedProperties property: The collection of single-value extended properties defined for
     * the calendar. Read-only. Nullable.
     *
     * @param singleValueExtendedProperties the singleValueExtendedProperties value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withSingleValueExtendedProperties(
        List<MicrosoftGraphSingleValueLegacyExtendedPropertyInner> singleValueExtendedProperties) {
        this.singleValueExtendedProperties = singleValueExtendedProperties;
        return this;
    }

    /**
     * Get the additionalProperties property: calendar.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: calendar.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphCalendar object itself.
     */
    public MicrosoftGraphCalendar withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphCalendar withId(String id) {
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
        if (owner() != null) {
            owner().validate();
        }
        if (calendarPermissions() != null) {
            calendarPermissions().forEach(e -> e.validate());
        }
        if (calendarView() != null) {
            calendarView().forEach(e -> e.validate());
        }
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
        if (multiValueExtendedProperties() != null) {
            multiValueExtendedProperties().forEach(e -> e.validate());
        }
        if (singleValueExtendedProperties() != null) {
            singleValueExtendedProperties().forEach(e -> e.validate());
        }
    }
}
