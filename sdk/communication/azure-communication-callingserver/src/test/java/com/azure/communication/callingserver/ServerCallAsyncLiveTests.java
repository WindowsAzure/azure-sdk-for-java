// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.azure.communication.callingserver.models.AddParticipantResult;
import com.azure.communication.callingserver.models.CallRecordingState;
import com.azure.communication.callingserver.models.CallRecordingProperties;
import com.azure.communication.callingserver.models.CallingServerErrorException;
import com.azure.communication.callingserver.models.CreateCallOptions;
import com.azure.communication.callingserver.models.EventSubscriptionType;
import com.azure.communication.callingserver.models.PlayAudioOptions;
import com.azure.communication.callingserver.models.MediaType;
import com.azure.communication.callingserver.models.PlayAudioResult;
import com.azure.communication.callingserver.models.StartCallRecordingResult;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.common.PhoneNumberIdentifier;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ServerCallAsyncLiveTests extends CallingServerTestBase {

    private final String fromUser = getNewUserId();
    private final String toUser = getNewUserId();

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runAllClientFunctionsAsync(HttpClient httpClient) {
        String groupId = getGroupId("runAllClientFunctionsAsync");
        CallingServerClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runAllClientFunctionsAsync");
        String recordingId = "";
        List<CallConnectionAsync> callConnections = new ArrayList<>();
        ServerCallAsync serverCall = null;

        try {
            callConnections = createAsyncCall(callingServerAsyncClient, groupId, fromUser, toUser, CALLBACK_URI);
            serverCall = callingServerAsyncClient.initializeServerCall(groupId);

            StartCallRecordingResult startCallRecordingResult = serverCall.startRecording(CALLBACK_URI).block();
            assert startCallRecordingResult != null;
            recordingId = startCallRecordingResult.getRecordingId();
            validateCallRecordingState(serverCall, recordingId, CallRecordingState.ACTIVE);

            serverCall.pauseRecording(recordingId).block();
            validateCallRecordingState(serverCall, recordingId, CallRecordingState.INACTIVE);

            serverCall.resumeRecording(recordingId).block();
            validateCallRecordingState(serverCall, recordingId, CallRecordingState.ACTIVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            if (serverCall != null) {
                try {
                    serverCall.stopRecording(recordingId).block();
                } catch (Exception e) {
                    System.out.println("Error stopping recording: " + e.getMessage());
                }
            }

            cleanUpConnectionsAsync(callConnections);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runAllClientFunctionsWithResponseAsync(HttpClient httpClient) {
        String groupId = getGroupId("runAllClientFunctionsWithResponseAsync");
        CallingServerClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runAllClientFunctionsWithResponseAsync");
        String recordingId = "";
        List<CallConnectionAsync> callConnections = new ArrayList<>();
        ServerCallAsync serverCallAsync = null;

        try {
            callConnections = createAsyncCall(callingServerAsyncClient, groupId, fromUser, toUser, CALLBACK_URI);
            serverCallAsync = callingServerAsyncClient.initializeServerCall(groupId);

            Response<StartCallRecordingResult> startRecordingResponse =
                serverCallAsync.startRecordingWithResponse(CALLBACK_URI).block();
            assert startRecordingResponse != null;
            assertEquals(startRecordingResponse.getStatusCode(), 200);
            StartCallRecordingResult startCallRecordingResult = startRecordingResponse.getValue();
            recordingId = startCallRecordingResult.getRecordingId();
            validateCallRecordingStateWithResponse(serverCallAsync, recordingId, CallRecordingState.ACTIVE);

            Response<Void> pauseResponse = serverCallAsync.pauseRecordingWithResponse(recordingId).block();
            assert pauseResponse != null;
            assertEquals(pauseResponse.getStatusCode(), 200);
            validateCallRecordingStateWithResponse(serverCallAsync, recordingId, CallRecordingState.INACTIVE);

            Response<Void> resumeResponse = serverCallAsync.resumeRecordingWithResponse(recordingId).block();
            assert resumeResponse != null;
            assertEquals(resumeResponse.getStatusCode(), 200);
            validateCallRecordingStateWithResponse(serverCallAsync, recordingId, CallRecordingState.ACTIVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            if (serverCallAsync != null) {
                try {
                    Response<Void> stopResponse = serverCallAsync.stopRecordingWithResponse(recordingId).block();
                    assert stopResponse != null;
                    assertEquals(stopResponse.getStatusCode(), 200);
                } catch (Exception e) {
                    System.out.println("Error stopping recording: " + e.getMessage());
                }
            }

            cleanUpConnectionsAsync(callConnections);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runPlayAudioFunctionAsync(HttpClient httpClient) {
        String groupId = getGroupId("runPlayAudioFunctionAsync");
        CallingServerClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runPlayAudioFunctionAsync");
        ServerCallAsync serverCallAsync;

        List<CallConnectionAsync> callConnections = new ArrayList<>();
        String operationContext = UUID.randomUUID().toString();

        try {
            callConnections = createAsyncCall(callingServerAsyncClient, groupId, fromUser, toUser, CALLBACK_URI);
            serverCallAsync = callingServerAsyncClient.initializeServerCall(groupId);

            PlayAudioResult playAudioResult =
                serverCallAsync.playAudio(AUDIO_FILE_URI, operationContext, CALLBACK_URI, operationContext).block();
            CallingServerTestUtils.validatePlayAudioResult(playAudioResult);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            cleanUpConnectionsAsync(callConnections);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runPlayAudioFunctionWithResponseAsync(HttpClient httpClient) {
        String groupId = getGroupId("runPlayAudioFunctionWithResponseAsync");
        CallingServerClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runPlayAudioFunctionWithResponseAsync");
        ServerCallAsync serverCallAsync;

        List<CallConnectionAsync> callConnections = new ArrayList<>();
        String operationContext = UUID.randomUUID().toString();

        try {
            callConnections = createAsyncCall(callingServerAsyncClient, groupId, fromUser, toUser, CALLBACK_URI);
            serverCallAsync = callingServerAsyncClient.initializeServerCall(groupId);

            PlayAudioOptions options = new PlayAudioOptions();
            options.setAudioFileId(UUID.randomUUID().toString());
            options.setCallbackUri(CALLBACK_URI);
            options.setOperationContext(operationContext);

            Response<PlayAudioResult> playAudioResult =
                serverCallAsync.playAudioWithResponse(
                    AUDIO_FILE_URI,
                    options).block();
            CallingServerTestUtils.validatePlayAudioResponse(playAudioResult);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            cleanUpConnectionsAsync(callConnections);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void startRecordingFailsAsync(HttpClient httpClient) {
        CallingServerClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "startRecordingFailsAsync");
        String invalidServerCallId = "aHR0cHM6Ly9jb252LXVzd2UtMDkuY29udi5za3lwZS5jb20vY29udi9EZVF2WEJGVVlFV1NNZkFXYno2azN3P2k9MTEmZT02Mzc1NzIyMjk0Mjc0NTI4Nzk=";
        ServerCallAsync serverCallAsync = callingServerAsyncClient.initializeServerCall(invalidServerCallId);

        try {
            Response<StartCallRecordingResult> response =
                serverCallAsync.startRecordingWithResponse(CALLBACK_URI).block();
            assert response != null;
            assertEquals(response.getStatusCode(), 400);
        } catch (CallingServerErrorException e) {
            assertEquals(e.getResponse().getStatusCode(), 400);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runAddRemoveScenarioAsync(HttpClient httpClient) {

        // This test requires human intervention to record and
        // will not function in live mode.
        if (this.getTestMode() == TestMode.LIVE) {
            System.out.println("Warning: Test is skipped, does not support live mode.");
            return;
        }

        CallingServerClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient =
            setupAsyncClient(builder, "runAddRemoveScenarioAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                CALLBACK_URI,
                new MediaType[] { MediaType.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

            CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
                new CommunicationUserIdentifier(fromUser),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(TO_PHONE_NUMBER) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);

            // Get Server Call
            /*
              Waiting for an update to be able to get this serverCallId when using
              createCallConnection()
             */
            String serverCallId = "aHR0cHM6Ly94LWNvbnYtdXN3ZS0wMS5jb252LnNreXBlLmNvbS9jb252L3NXdWxkazBmMEVpdnAxWjhiU2NuUHc_aT0yJmU9NjM3NTg0Mzk2NDM5NzQ5NzY4";
            ServerCallAsync serverCallAsync = callingServerAsyncClient.initializeServerCall(serverCallId);

            // Add User
            String operationContext = UUID.randomUUID().toString();
            serverCallAsync
                .addParticipant(
                    new CommunicationUserIdentifier(toUser),
                    null,
                    operationContext,
                    CALLBACK_URI)
                .block();

            // Remove User
            /*
              There is an update that we require to be able to get
              the participantId from the service when a user is
              added to a call. Until that is fixed this recorded
              value needs to be used.
             */
            String participantId = "206ac04a-1aae-4d82-9015-9c30cb174888";
            serverCallAsync.removeParticipant(participantId).block();

            // Hang up
            assert callConnectionAsync != null;
            callConnectionAsync.hangup().block();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    @ParameterizedTest
    @Disabled
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runAddRemoveScenarioWithResponseAsync(HttpClient httpClient) {

        // This test requires human intervention to record and
        // will not function in live mode.
        if (this.getTestMode() == TestMode.LIVE) {
            System.out.println("Warning: Test is skipped, does not support live mode.");
            return;
        }

        CallingServerClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        CallingServerAsyncClient callingServerAsyncClient = setupAsyncClient(builder, "runAddRemoveScenarioWithResponseAsync");

        try {
            // Establish a call
            CreateCallOptions options = new CreateCallOptions(
                CALLBACK_URI,
                new MediaType[] { MediaType.AUDIO },
                new EventSubscriptionType[] { EventSubscriptionType.PARTICIPANTS_UPDATED });

            options.setAlternateCallerId(new PhoneNumberIdentifier(FROM_PHONE_NUMBER));

            CallConnectionAsync callConnectionAsync = callingServerAsyncClient.createCallConnection(
                new CommunicationUserIdentifier(fromUser),
                new CommunicationIdentifier[] { new PhoneNumberIdentifier(TO_PHONE_NUMBER) },
                options).block();

            CallingServerTestUtils.validateCallConnectionAsync(callConnectionAsync);

            // Get Server Call
            /*
              Waiting for an update to be able to get this serverCallId when using
              createCallConnection()
             */
            String serverCallId = "aHR0cHM6Ly94LWNvbnYtdXN3ZS0wMS5jb252LnNreXBlLmNvbS9jb252L0NUT014YmNIRmttZ1BqbE5kYjExNlE_aT0yJmU9NjM3NTg0Mzk2NDM5NzQ5NzY4";
            ServerCallAsync serverCallAsync = callingServerAsyncClient.initializeServerCall(serverCallId);

            // Add User
            String operationContext = UUID.randomUUID().toString();
            Response<AddParticipantResult> addResponse =
                serverCallAsync
                    .addParticipantWithResponse(
                        new CommunicationUserIdentifier(toUser),
                        null,
                        operationContext,
                        CALLBACK_URI)
                    .block();
            CallingServerTestUtils.validateAddParticipantResponse(addResponse);

            // Remove User
            /*
              There is an update that we require to be able to get
              the participantId from the service when a user is
              added to a call. Until that is fixed this recorded
              value needs to be used.
             */
            String participantId = "b133b1f3-4a11-49e4-abe0-ac9fdd660634";
            Response<Void> removeResponse = serverCallAsync.removeParticipantWithResponse(participantId).block();
            CallingServerTestUtils.validateResponse(removeResponse);

            // Hang up
            assert callConnectionAsync != null;
            callConnectionAsync.hangup().block();
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

    private void validateCallRecordingState(ServerCallAsync serverCallAsync,
            String recordingId,
            CallRecordingState expectedCallRecordingState) {
        assertNotNull(serverCallAsync);
        assertNotNull(serverCallAsync.getServerCallId());
        assertNotNull(recordingId);


        // There is a delay between the action and when the state is available.
        // Waiting to make sure we get the updated state, when we are running
        // against a live service.
        sleepIfRunningAgainstService(6000);

        CallRecordingProperties callRecordingStateResult = serverCallAsync.getRecordingState(recordingId).block();
        assert callRecordingStateResult != null;
        assertEquals(callRecordingStateResult.getRecordingState(), expectedCallRecordingState);
    }

    protected void validateCallRecordingStateWithResponse(
        ServerCallAsync serverCallAsync,
        String recordingId,
        CallRecordingState expectedCallRecordingState) {
        assertNotNull(serverCallAsync);
        assertNotNull(serverCallAsync.getServerCallId());
        assertNotNull(recordingId);


        // There is a delay between the action and when the state is available.
        // Waiting to make sure we get the updated state, when we are running
        // against a live service.
        sleepIfRunningAgainstService(6000);

        Response<CallRecordingProperties> response =
            serverCallAsync.getRecordingStateWithResponse(recordingId).block();
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 200);
        assertNotNull(response.getValue());
        assertEquals(response.getValue().getRecordingState(), expectedCallRecordingState);
    }

    protected void cleanUpConnectionsAsync(List<CallConnectionAsync> connections) {
        if (connections == null) {
            return;
        }

        connections.forEach(c -> {
            if (c != null) {
                try {
                    c.hangup().block();
                } catch (Exception e) {
                    System.out.println("Error hanging up: " + e.getMessage());
                }
            }
        });
    }
}
