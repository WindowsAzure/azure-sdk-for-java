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

/** schedule. */
@Fluent
public final class MicrosoftGraphSchedule extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphSchedule.class);

    /*
     * Indicates whether the schedule is enabled for the team. Required.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Indicates whether offer shift requests are enabled for the schedule.
     */
    @JsonProperty(value = "offerShiftRequestsEnabled")
    private Boolean offerShiftRequestsEnabled;

    /*
     * Indicates whether open shifts are enabled for the schedule.
     */
    @JsonProperty(value = "openShiftsEnabled")
    private Boolean openShiftsEnabled;

    /*
     * The provisionStatus property.
     */
    @JsonProperty(value = "provisionStatus")
    private MicrosoftGraphOperationStatus provisionStatus;

    /*
     * Additional information about why schedule provisioning failed.
     */
    @JsonProperty(value = "provisionStatusCode")
    private String provisionStatusCode;

    /*
     * Indicates whether swap shifts requests are enabled for the schedule.
     */
    @JsonProperty(value = "swapShiftsRequestsEnabled")
    private Boolean swapShiftsRequestsEnabled;

    /*
     * Indicates whether time clock is enabled for the schedule.
     */
    @JsonProperty(value = "timeClockEnabled")
    private Boolean timeClockEnabled;

    /*
     * Indicates whether time off requests are enabled for the schedule.
     */
    @JsonProperty(value = "timeOffRequestsEnabled")
    private Boolean timeOffRequestsEnabled;

    /*
     * Indicates the time zone of the schedule team using tz database format.
     * Required.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * The workforceIntegrationIds property.
     */
    @JsonProperty(value = "workforceIntegrationIds")
    private List<String> workforceIntegrationIds;

    /*
     * The offerShiftRequests property.
     */
    @JsonProperty(value = "offerShiftRequests")
    private List<MicrosoftGraphOfferShiftRequest> offerShiftRequests;

    /*
     * The openShiftChangeRequests property.
     */
    @JsonProperty(value = "openShiftChangeRequests")
    private List<MicrosoftGraphOpenShiftChangeRequest> openShiftChangeRequests;

    /*
     * The openShifts property.
     */
    @JsonProperty(value = "openShifts")
    private List<MicrosoftGraphOpenShift> openShifts;

    /*
     * The logical grouping of users in the schedule (usually by role).
     */
    @JsonProperty(value = "schedulingGroups")
    private List<MicrosoftGraphSchedulingGroup> schedulingGroups;

    /*
     * The shifts in the schedule.
     */
    @JsonProperty(value = "shifts")
    private List<MicrosoftGraphShift> shifts;

    /*
     * The swapShiftsChangeRequests property.
     */
    @JsonProperty(value = "swapShiftsChangeRequests")
    private List<MicrosoftGraphSwapShiftsChangeRequest> swapShiftsChangeRequests;

    /*
     * The set of reasons for a time off in the schedule.
     */
    @JsonProperty(value = "timeOffReasons")
    private List<MicrosoftGraphTimeOffReason> timeOffReasons;

    /*
     * The timeOffRequests property.
     */
    @JsonProperty(value = "timeOffRequests")
    private List<MicrosoftGraphTimeOffRequest> timeOffRequests;

    /*
     * The instances of times off in the schedule.
     */
    @JsonProperty(value = "timesOff")
    private List<MicrosoftGraphTimeOff> timesOff;

    /*
     * schedule
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the enabled property: Indicates whether the schedule is enabled for the team. Required.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether the schedule is enabled for the team. Required.
     *
     * @param enabled the enabled value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the offerShiftRequestsEnabled property: Indicates whether offer shift requests are enabled for the schedule.
     *
     * @return the offerShiftRequestsEnabled value.
     */
    public Boolean offerShiftRequestsEnabled() {
        return this.offerShiftRequestsEnabled;
    }

    /**
     * Set the offerShiftRequestsEnabled property: Indicates whether offer shift requests are enabled for the schedule.
     *
     * @param offerShiftRequestsEnabled the offerShiftRequestsEnabled value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withOfferShiftRequestsEnabled(Boolean offerShiftRequestsEnabled) {
        this.offerShiftRequestsEnabled = offerShiftRequestsEnabled;
        return this;
    }

    /**
     * Get the openShiftsEnabled property: Indicates whether open shifts are enabled for the schedule.
     *
     * @return the openShiftsEnabled value.
     */
    public Boolean openShiftsEnabled() {
        return this.openShiftsEnabled;
    }

    /**
     * Set the openShiftsEnabled property: Indicates whether open shifts are enabled for the schedule.
     *
     * @param openShiftsEnabled the openShiftsEnabled value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withOpenShiftsEnabled(Boolean openShiftsEnabled) {
        this.openShiftsEnabled = openShiftsEnabled;
        return this;
    }

    /**
     * Get the provisionStatus property: The provisionStatus property.
     *
     * @return the provisionStatus value.
     */
    public MicrosoftGraphOperationStatus provisionStatus() {
        return this.provisionStatus;
    }

    /**
     * Set the provisionStatus property: The provisionStatus property.
     *
     * @param provisionStatus the provisionStatus value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withProvisionStatus(MicrosoftGraphOperationStatus provisionStatus) {
        this.provisionStatus = provisionStatus;
        return this;
    }

    /**
     * Get the provisionStatusCode property: Additional information about why schedule provisioning failed.
     *
     * @return the provisionStatusCode value.
     */
    public String provisionStatusCode() {
        return this.provisionStatusCode;
    }

    /**
     * Set the provisionStatusCode property: Additional information about why schedule provisioning failed.
     *
     * @param provisionStatusCode the provisionStatusCode value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withProvisionStatusCode(String provisionStatusCode) {
        this.provisionStatusCode = provisionStatusCode;
        return this;
    }

    /**
     * Get the swapShiftsRequestsEnabled property: Indicates whether swap shifts requests are enabled for the schedule.
     *
     * @return the swapShiftsRequestsEnabled value.
     */
    public Boolean swapShiftsRequestsEnabled() {
        return this.swapShiftsRequestsEnabled;
    }

    /**
     * Set the swapShiftsRequestsEnabled property: Indicates whether swap shifts requests are enabled for the schedule.
     *
     * @param swapShiftsRequestsEnabled the swapShiftsRequestsEnabled value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withSwapShiftsRequestsEnabled(Boolean swapShiftsRequestsEnabled) {
        this.swapShiftsRequestsEnabled = swapShiftsRequestsEnabled;
        return this;
    }

    /**
     * Get the timeClockEnabled property: Indicates whether time clock is enabled for the schedule.
     *
     * @return the timeClockEnabled value.
     */
    public Boolean timeClockEnabled() {
        return this.timeClockEnabled;
    }

    /**
     * Set the timeClockEnabled property: Indicates whether time clock is enabled for the schedule.
     *
     * @param timeClockEnabled the timeClockEnabled value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withTimeClockEnabled(Boolean timeClockEnabled) {
        this.timeClockEnabled = timeClockEnabled;
        return this;
    }

    /**
     * Get the timeOffRequestsEnabled property: Indicates whether time off requests are enabled for the schedule.
     *
     * @return the timeOffRequestsEnabled value.
     */
    public Boolean timeOffRequestsEnabled() {
        return this.timeOffRequestsEnabled;
    }

    /**
     * Set the timeOffRequestsEnabled property: Indicates whether time off requests are enabled for the schedule.
     *
     * @param timeOffRequestsEnabled the timeOffRequestsEnabled value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withTimeOffRequestsEnabled(Boolean timeOffRequestsEnabled) {
        this.timeOffRequestsEnabled = timeOffRequestsEnabled;
        return this;
    }

    /**
     * Get the timeZone property: Indicates the time zone of the schedule team using tz database format. Required.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Indicates the time zone of the schedule team using tz database format. Required.
     *
     * @param timeZone the timeZone value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the workforceIntegrationIds property: The workforceIntegrationIds property.
     *
     * @return the workforceIntegrationIds value.
     */
    public List<String> workforceIntegrationIds() {
        return this.workforceIntegrationIds;
    }

    /**
     * Set the workforceIntegrationIds property: The workforceIntegrationIds property.
     *
     * @param workforceIntegrationIds the workforceIntegrationIds value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withWorkforceIntegrationIds(List<String> workforceIntegrationIds) {
        this.workforceIntegrationIds = workforceIntegrationIds;
        return this;
    }

    /**
     * Get the offerShiftRequests property: The offerShiftRequests property.
     *
     * @return the offerShiftRequests value.
     */
    public List<MicrosoftGraphOfferShiftRequest> offerShiftRequests() {
        return this.offerShiftRequests;
    }

    /**
     * Set the offerShiftRequests property: The offerShiftRequests property.
     *
     * @param offerShiftRequests the offerShiftRequests value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withOfferShiftRequests(List<MicrosoftGraphOfferShiftRequest> offerShiftRequests) {
        this.offerShiftRequests = offerShiftRequests;
        return this;
    }

    /**
     * Get the openShiftChangeRequests property: The openShiftChangeRequests property.
     *
     * @return the openShiftChangeRequests value.
     */
    public List<MicrosoftGraphOpenShiftChangeRequest> openShiftChangeRequests() {
        return this.openShiftChangeRequests;
    }

    /**
     * Set the openShiftChangeRequests property: The openShiftChangeRequests property.
     *
     * @param openShiftChangeRequests the openShiftChangeRequests value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withOpenShiftChangeRequests(
        List<MicrosoftGraphOpenShiftChangeRequest> openShiftChangeRequests) {
        this.openShiftChangeRequests = openShiftChangeRequests;
        return this;
    }

    /**
     * Get the openShifts property: The openShifts property.
     *
     * @return the openShifts value.
     */
    public List<MicrosoftGraphOpenShift> openShifts() {
        return this.openShifts;
    }

    /**
     * Set the openShifts property: The openShifts property.
     *
     * @param openShifts the openShifts value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withOpenShifts(List<MicrosoftGraphOpenShift> openShifts) {
        this.openShifts = openShifts;
        return this;
    }

    /**
     * Get the schedulingGroups property: The logical grouping of users in the schedule (usually by role).
     *
     * @return the schedulingGroups value.
     */
    public List<MicrosoftGraphSchedulingGroup> schedulingGroups() {
        return this.schedulingGroups;
    }

    /**
     * Set the schedulingGroups property: The logical grouping of users in the schedule (usually by role).
     *
     * @param schedulingGroups the schedulingGroups value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withSchedulingGroups(List<MicrosoftGraphSchedulingGroup> schedulingGroups) {
        this.schedulingGroups = schedulingGroups;
        return this;
    }

    /**
     * Get the shifts property: The shifts in the schedule.
     *
     * @return the shifts value.
     */
    public List<MicrosoftGraphShift> shifts() {
        return this.shifts;
    }

    /**
     * Set the shifts property: The shifts in the schedule.
     *
     * @param shifts the shifts value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withShifts(List<MicrosoftGraphShift> shifts) {
        this.shifts = shifts;
        return this;
    }

    /**
     * Get the swapShiftsChangeRequests property: The swapShiftsChangeRequests property.
     *
     * @return the swapShiftsChangeRequests value.
     */
    public List<MicrosoftGraphSwapShiftsChangeRequest> swapShiftsChangeRequests() {
        return this.swapShiftsChangeRequests;
    }

    /**
     * Set the swapShiftsChangeRequests property: The swapShiftsChangeRequests property.
     *
     * @param swapShiftsChangeRequests the swapShiftsChangeRequests value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withSwapShiftsChangeRequests(
        List<MicrosoftGraphSwapShiftsChangeRequest> swapShiftsChangeRequests) {
        this.swapShiftsChangeRequests = swapShiftsChangeRequests;
        return this;
    }

    /**
     * Get the timeOffReasons property: The set of reasons for a time off in the schedule.
     *
     * @return the timeOffReasons value.
     */
    public List<MicrosoftGraphTimeOffReason> timeOffReasons() {
        return this.timeOffReasons;
    }

    /**
     * Set the timeOffReasons property: The set of reasons for a time off in the schedule.
     *
     * @param timeOffReasons the timeOffReasons value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withTimeOffReasons(List<MicrosoftGraphTimeOffReason> timeOffReasons) {
        this.timeOffReasons = timeOffReasons;
        return this;
    }

    /**
     * Get the timeOffRequests property: The timeOffRequests property.
     *
     * @return the timeOffRequests value.
     */
    public List<MicrosoftGraphTimeOffRequest> timeOffRequests() {
        return this.timeOffRequests;
    }

    /**
     * Set the timeOffRequests property: The timeOffRequests property.
     *
     * @param timeOffRequests the timeOffRequests value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withTimeOffRequests(List<MicrosoftGraphTimeOffRequest> timeOffRequests) {
        this.timeOffRequests = timeOffRequests;
        return this;
    }

    /**
     * Get the timesOff property: The instances of times off in the schedule.
     *
     * @return the timesOff value.
     */
    public List<MicrosoftGraphTimeOff> timesOff() {
        return this.timesOff;
    }

    /**
     * Set the timesOff property: The instances of times off in the schedule.
     *
     * @param timesOff the timesOff value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withTimesOff(List<MicrosoftGraphTimeOff> timesOff) {
        this.timesOff = timesOff;
        return this;
    }

    /**
     * Get the additionalProperties property: schedule.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: schedule.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSchedule object itself.
     */
    public MicrosoftGraphSchedule withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphSchedule withId(String id) {
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
        if (offerShiftRequests() != null) {
            offerShiftRequests().forEach(e -> e.validate());
        }
        if (openShiftChangeRequests() != null) {
            openShiftChangeRequests().forEach(e -> e.validate());
        }
        if (openShifts() != null) {
            openShifts().forEach(e -> e.validate());
        }
        if (schedulingGroups() != null) {
            schedulingGroups().forEach(e -> e.validate());
        }
        if (shifts() != null) {
            shifts().forEach(e -> e.validate());
        }
        if (swapShiftsChangeRequests() != null) {
            swapShiftsChangeRequests().forEach(e -> e.validate());
        }
        if (timeOffReasons() != null) {
            timeOffReasons().forEach(e -> e.validate());
        }
        if (timeOffRequests() != null) {
            timeOffRequests().forEach(e -> e.validate());
        }
        if (timesOff() != null) {
            timesOff().forEach(e -> e.validate());
        }
    }
}
