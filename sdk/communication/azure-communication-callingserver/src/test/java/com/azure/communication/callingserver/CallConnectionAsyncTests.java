// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.communication.callingserver;

import java.util.UUID;

import com.azure.communication.callingserver.models.CallModality;
import com.azure.communication.callingserver.models.CancelAllMediaOperationsResult;
import com.azure.communication.callingserver.models.EventSubscriptionType;
import com.azure.communication.callingserver.models.CreateCallOptions;
import com.azure.communication.callingserver.models.JoinCallOptions;
import com.azure.communication.callingserver.models.PlayAudioResult;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Set the AZURE_TEST_MODE environment variable to either PLAYBACK or RECORD to determine if tests are playback or
 * live. By default, tests are run in playback mode.
 */
public class CallConnectionAsyncTests extends CallingServerTestBase {

    private String from = getRandomUserId();
    private String invitedUser = getRandomUserId();
    private String joinedUser = getRandomUserId();
    private String alternateId = "+11111111111";
    private String to = "+11111111111";
    private String callBackUri = "https://host.app/api/callback/calling";
    private String audioFileUri = "https://host.app/audio/bot-callcenter-intro.wav";

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreatePlayCancelHangupScenarioAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "runCreatePlayCancelHangupScenarioAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));

            CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
                new CommunicationUserIdentifier(from),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(to) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);

            // Play Audio
            String operationContext = UUID.randomUUID().toString();
            assert callConnectionAsync != null;
            PlayAudioResult playAudioResult = callConnectionAsync.playAudio(
                audioFileUri,
                false,
                UUID.randomUUID().toString(),
                null,
                operationContext).block();
            CallingServerTestUtils.validatePlayAudioResult(playAudioResult);

            // Cancel All Media Operations
            String cancelMediaOperationContext = UUID.randomUUID().toString();
            CancelAllMediaOperationsResult cancelAllMediaOperationsResult = callConnectionAsync.cancelAllMediaOperations(cancelMediaOperationContext).block();
            CallingServerTestUtils.validateCancelAllMediaOperations(cancelAllMediaOperationsResult);

            // Hang up
            callConnectionAsync.hangup().block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreatePlayCancelHangupScenarioWithResponseAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "runCreatePlayCancelHangupScenarioWithResponseAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));

            Response<CallConnectionAsync> callConnectionAsyncResponse = callingServerAsyncClient.createCallConnectionWithResponse(
                new CommunicationUserIdentifier(from),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(to) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsyncResponse(callConnectionAsyncResponse);
            assert callConnectionAsyncResponse != null;
            CallConnectionAsync callConnectionAsync = callConnectionAsyncResponse.getValue();

            // Play Audio
            String operationContext = UUID.randomUUID().toString();
            Response<PlayAudioResult> playAudioResponse =
                callConnectionAsync.playAudioWithResponse(
                    audioFileUri,
                    false,
                    UUID.randomUUID().toString(),
                    null,
                    operationContext).block();
            CallingServerTestUtils.validatePlayAudioResponse(playAudioResponse);

            // Cancel All Media Operations
            String cancelMediaOperationContext = UUID.randomUUID().toString();
            Response<CancelAllMediaOperationsResult> cancelAllMediaOperationsResult = callConnectionAsync.cancelAllMediaOperationsWithResponse(cancelMediaOperationContext).block();
            CallingServerTestUtils.validateCancelAllMediaOperationsResponse(cancelAllMediaOperationsResult);

            // Hang up
            Response<Void> hangupResponse = callConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreateAddRemoveHangupScenarioAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "runCreateAddRemoveHangupScenarioAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));

            CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
                new CommunicationUserIdentifier(from),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(to) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);

            // Invite User
            String operationContext = UUID.randomUUID().toString();
            assert callConnectionAsync != null;
            callConnectionAsync.addParticipant(new CommunicationUserIdentifier(invitedUser), null, operationContext).block();

            // Remove Participant
            /**
             * There is an update that we require to beable to get
             * the participantId from the service when a user is
             * added to a call. Until that is fixed this recorded
             * valuse needs to be used.
             */
            String participantId = "e3560385-776f-41d1-bf04-07ef738f2fc1";
            callConnectionAsync.removeParticipant(participantId).block();

            // Hang up
            callConnectionAsync.hangup().block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreateAddRemoveHangupScenarioWithResponseAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "runCreateAddRemoveHangupScenarioWithResponseAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));

            Response<CallConnectionAsync> callConnectionAsyncResponse = callingServerAsyncClient.createCallConnectionWithResponse(
                new CommunicationUserIdentifier(from),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(to) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsyncResponse(callConnectionAsyncResponse);
            assert callConnectionAsyncResponse != null;
            CallConnectionAsync callConnectionAsync = callConnectionAsyncResponse.getValue();

            // Invite User
            String operationContext = UUID.randomUUID().toString();
            Response<Void> inviteParticipantResponse = callConnectionAsync.addParticipantWithResponse(new CommunicationUserIdentifier(invitedUser), null, operationContext).block();
            CallingServerTestUtils.validateResponse(inviteParticipantResponse);

            // Remove Participant
            /**
             * There is an update that we require to beable to get
             * the participantId from the service when a user is
             * added to a call. Until that is fixed this recorded
             * valuse needs to be used.
             */            
            String participantId = "80238d5f-9eda-481a-b911-e2e12eba9eda";
            Response<Void> removeParticipantResponse = callConnectionAsync.removeParticipantWithResponse(participantId).block();
            CallingServerTestUtils.validateResponse(removeParticipantResponse);

            // Hang up
            Response<Void> hangupResponse = callConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreateJoinHangupScenarioAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "runCreateJoinHangupScenarioAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));

            CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
                new CommunicationUserIdentifier(from),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(to) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);

            // Join
            /**
             * Waiting for an upate to beable to get this serverCallId when using
             * createCallConnection()
             */
            String serverCallId = "aHR0cHM6Ly94LWNvbnYtdXN3ZS0wMS5jb252LnNreXBlLmNvbS9jb252L3VodHNzZEZ3NFVHX1J4d1lHYWlLRmc_aT0yJmU9NjM3NTg0Mzk2NDM5NzQ5NzY4";
            JoinCallOptions joinCallOptions = new JoinCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });
            CallConnectionAsync joinedCallConnectionAsync =
                callingServerAsyncClient.join(
                    serverCallId,
                    new CommunicationUserIdentifier(joinedUser),
                    joinCallOptions).block();
            CallingServerTestUtils.validateCallConnectionAsync(joinedCallConnectionAsync);

            //Hangup
            assert callConnectionAsync != null;
            callConnectionAsync.hangup().block();
            assert joinedCallConnectionAsync != null;
            joinedCallConnectionAsync.hangup().block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runCreateJoinHangupScenarioWithResponseAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getCallClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "runCreateJoinHangupScenarioWithResponseAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(alternateId));

            Response<CallConnectionAsync> callConnectionAsyncResponse = callingServerAsyncClient.createCallConnectionWithResponse(
                new CommunicationUserIdentifier(from),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(to) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsyncResponse(callConnectionAsyncResponse);
            assert callConnectionAsyncResponse != null;
            CallConnectionAsync callConnectionAsync = callConnectionAsyncResponse.getValue();

            // Join
            /**
             * Waiting for an upate to beable to get this serverCallId when using
             * createCallConnection()
             */            
            String serverCallId = "aHR0cHM6Ly94LWNvbnYtdXN3ZS0wMS5jb252LnNreXBlLmNvbS9jb252L3lKQXY0TnVlOEV5bUpYVm1IYklIeUE_aT0wJmU9NjM3NTg0MzkwMjcxMzg0MTc3";
            JoinCallOptions joinCallOptions = new JoinCallOptions(
                callBackUri,
                new CallModality[] { CallModality.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });
            Response<CallConnectionAsync> joinedCallConnectionAsyncResponse =
                callingServerAsyncClient.joinWithResponse(
                    serverCallId,
                    new CommunicationUserIdentifier(joinedUser),
                    joinCallOptions).block();
            CallingServerTestUtils.validateJoinCallConnectionAsyncResponse(joinedCallConnectionAsyncResponse);
            assert joinedCallConnectionAsyncResponse != null;
            CallConnectionAsync joinedCallConnectionAsync = joinedCallConnectionAsyncResponse.getValue();

            //Hangup
            Response<Void> hangupResponse = callConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
            hangupResponse = joinedCallConnectionAsync.hangupWithResponse().block();
            CallingServerTestUtils.validateResponse(hangupResponse);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    private CallingServerAsyncClient setupAsyncClient(CallingServerClientBuilder builder, String testName) {
        return addLoggingPolicy(builder, testName).buildAsyncClient();
    }

    protected CallingServerClientBuilder addLoggingPolicy(CallingServerClientBuilder builder, String testName) {
        return builder.addPolicy((context, next) -> logHeaders(testName, next));
    }
}

