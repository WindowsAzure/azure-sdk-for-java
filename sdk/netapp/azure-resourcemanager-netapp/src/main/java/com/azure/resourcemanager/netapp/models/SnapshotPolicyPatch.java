// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Snapshot policy Details for create and update. */
@JsonFlatten
@Fluent
public class SnapshotPolicyPatch {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotPolicyPatch.class);

    /*
     * Resource location
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource Id
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Snapshot policy name
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String namePropertiesName;

    /*
     * Schedule for hourly snapshots
     */
    @JsonProperty(value = "properties.hourlySchedule")
    private HourlySchedule hourlySchedule;

    /*
     * Schedule for daily snapshots
     */
    @JsonProperty(value = "properties.dailySchedule")
    private DailySchedule dailySchedule;

    /*
     * Schedule for weekly snapshots
     */
    @JsonProperty(value = "properties.weeklySchedule")
    private WeeklySchedule weeklySchedule;

    /*
     * Schedule for monthly snapshots
     */
    @JsonProperty(value = "properties.monthlySchedule")
    private MonthlySchedule monthlySchedule;

    /*
     * The property to decide policy is enabled or not
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the namePropertiesName property: Snapshot policy name.
     *
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Get the hourlySchedule property: Schedule for hourly snapshots.
     *
     * @return the hourlySchedule value.
     */
    public HourlySchedule hourlySchedule() {
        return this.hourlySchedule;
    }

    /**
     * Set the hourlySchedule property: Schedule for hourly snapshots.
     *
     * @param hourlySchedule the hourlySchedule value to set.
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withHourlySchedule(HourlySchedule hourlySchedule) {
        this.hourlySchedule = hourlySchedule;
        return this;
    }

    /**
     * Get the dailySchedule property: Schedule for daily snapshots.
     *
     * @return the dailySchedule value.
     */
    public DailySchedule dailySchedule() {
        return this.dailySchedule;
    }

    /**
     * Set the dailySchedule property: Schedule for daily snapshots.
     *
     * @param dailySchedule the dailySchedule value to set.
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withDailySchedule(DailySchedule dailySchedule) {
        this.dailySchedule = dailySchedule;
        return this;
    }

    /**
     * Get the weeklySchedule property: Schedule for weekly snapshots.
     *
     * @return the weeklySchedule value.
     */
    public WeeklySchedule weeklySchedule() {
        return this.weeklySchedule;
    }

    /**
     * Set the weeklySchedule property: Schedule for weekly snapshots.
     *
     * @param weeklySchedule the weeklySchedule value to set.
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withWeeklySchedule(WeeklySchedule weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
        return this;
    }

    /**
     * Get the monthlySchedule property: Schedule for monthly snapshots.
     *
     * @return the monthlySchedule value.
     */
    public MonthlySchedule monthlySchedule() {
        return this.monthlySchedule;
    }

    /**
     * Set the monthlySchedule property: Schedule for monthly snapshots.
     *
     * @param monthlySchedule the monthlySchedule value to set.
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withMonthlySchedule(MonthlySchedule monthlySchedule) {
        this.monthlySchedule = monthlySchedule;
        return this;
    }

    /**
     * Get the enabled property: The property to decide policy is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The property to decide policy is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the SnapshotPolicyPatch object itself.
     */
    public SnapshotPolicyPatch withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hourlySchedule() != null) {
            hourlySchedule().validate();
        }
        if (dailySchedule() != null) {
            dailySchedule().validate();
        }
        if (weeklySchedule() != null) {
            weeklySchedule().validate();
        }
        if (monthlySchedule() != null) {
            monthlySchedule().validate();
        }
    }
}
