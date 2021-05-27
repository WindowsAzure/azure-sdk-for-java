// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models.events;

import com.azure.communication.callingserver.models.CommunicationParticipant;

import java.util.ArrayList;
import java.util.List;

/**
 * The invited participants result event.
 */
public final class ParticipantsUpdatedEvent extends CallEventBase
{
    /**
     * The event type.
     */
    public static final String EventType = "Microsoft.Communication.ParticipantsUpdated";

    /**
     * The call leg Id.
     */
    public String callLegId;

    /**
     * Get the call leg Id.
     *
     * @return the time of the recording started.
     */
    public String getCallLegId() {
        return this.callLegId;
    }

    /**
     * Set the call leg Id.
     *
     * @param callLegId the call leg id.
     * @return the ParticipantsUpdatedEvent object itself.
     */
    public ParticipantsUpdatedEvent setCallLegId(String callLegId) {
        this.callLegId = callLegId;
        return this;
    }

    /**
     * The list of participants.
     */
    public List<CommunicationParticipant> participants;

    /**
     * Get the list of participants.
     * @return the result info value.
     */
    public List<CommunicationParticipant> getParticipants() {
        return this.participants;
    }

    /**
     * Set the list of participants.
     * @param participants the list of participants.
     * @return the ParticipantsUpdatedEvent object itself.
     */
    public ParticipantsUpdatedEvent setParticipants(List<CommunicationParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Initializes a new instance of ParticipantsUpdatedEvent.
     * @param callLegId The call leg id.
     * @param participants The conversation id.
     */
    public ParticipantsUpdatedEvent(String callLegId, Iterable<CommunicationParticipant> participants)
    {
        if (callLegId == null || callLegId.isEmpty())
        {
            throw new IllegalArgumentException(String.format("object '%s' cannot be null", callLegId.getClass().getName()));
        }
        if (participants == null)
        {
            throw new IllegalArgumentException(String.format("object '%s' cannot be null", participants.getClass().getName()));
        }

        this.callLegId = callLegId;
        this.participants = new ArrayList<>();

        participants.forEach(this.participants::add);
        if (this.participants.size() == 0)
        {
            throw new IllegalArgumentException(String.format("object '%s' cannot be null", participants.getClass().getName()));
        }
    }
}
