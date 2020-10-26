// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core;

import com.azure.core.http.HttpClient;
import com.azure.core.util.logging.ClientLogger;
import com.azure.digitaltwins.core.models.BasicDigitalTwin;
import com.azure.digitaltwins.core.models.BasicRelationship;
import com.azure.digitaltwins.core.models.IncomingRelationship;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static com.azure.digitaltwins.core.TestAssetDefaults.*;
import static com.azure.digitaltwins.core.TestAssetsHelper.*;
import static com.azure.digitaltwins.core.TestHelper.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.digitaltwins.core.TestHelper.assertRestException;
import static com.azure.digitaltwins.core.helpers.UniqueIdHelper.getUniqueDigitalTwinId;
import static com.azure.digitaltwins.core.helpers.UniqueIdHelper.getUniqueModelId;
import static java.net.HttpURLConnection.HTTP_NOT_FOUND;
import static java.net.HttpURLConnection.HTTP_PRECON_FAILED;
import static javax.net.ssl.HttpsURLConnection.HTTP_NO_CONTENT;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DigitalTwinsRelationshipAsyncTest extends DigitalTwinsRelationshipTestBase {
    private final ClientLogger logger = new ClientLogger(DigitalTwinsRelationshipAsyncTest.class);

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.digitaltwins.core.TestHelper#getTestParameters")
    @Override
    public void relationshipLifecycleTest(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion) throws JsonProcessingException {
        DigitalTwinsAsyncClient asyncClient = getAsyncClient(httpClient, serviceVersion);

        String floorModelId = getUniqueModelId(FLOOR_MODEL_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String roomModelId = getUniqueModelId(ROOM_MODEL_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String hvacModelId = getUniqueModelId(HVAC_MODEL_ID_PREFIX, asyncClient, randomIntegerStringGenerator);

        String floorTwinId = getUniqueDigitalTwinId(FLOOR_TWIN_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String roomTwinId = getUniqueDigitalTwinId(ROOM_TWIN_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String hvacTwinId = getUniqueDigitalTwinId(HVAC_TWIN_ID_PREFIX, asyncClient, randomIntegerStringGenerator);

        try {
            // Create floor, room and hvac model
            createModelsAndTwins(asyncClient, floorModelId, roomModelId, hvacModelId, floorTwinId, roomTwinId, hvacTwinId);

            // Connect the created twins via relationships
            String floorContainsRoomPayload = getRelationshipWithPropertyPayload(roomTwinId, CONTAINS_RELATIONSHIP, "isAccessRestricted", true);
            String floorTwinCoolsRelationshipPayload = getRelationshipPayload(floorTwinId, COOLS_RELATIONSHIP);
            String floorTwinContainedInRelationshipPayload = getRelationshipPayload(floorTwinId, CONTAINED_IN_RELATIONSHIP);
            String floorCooledByHvacPayload = getRelationshipPayload(hvacTwinId, COOLED_BY_RELATIONSHIP);
            List<Object> floorContainsRoomUpdatePayload = getRelationshipUpdatePayload("/isAccessRestricted", false);

            // Create relationship from Floor -> Room
            StepVerifier
                .create(asyncClient.createRelationship(floorTwinId, FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID, deserializeJsonString(floorContainsRoomPayload, BasicRelationship.class), BasicRelationship.class))
                .assertNext(
                    basicRelationship -> {
                        assertThat(basicRelationship.getRelationshipId())
                            .isEqualTo(FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID)
                            .as("Created relationship from floor -> room");
                        logger.info("Created {} relationship between source = {} and target = {}", basicRelationship.getRelationshipId(), basicRelationship.getSourceDigitalTwinId(), basicRelationship.getTargetDigitalTwinId());
                    }
                )
                .verifyComplete();

            // Create relationship from Floor -> Hvac
            StepVerifier
                .create(asyncClient.createRelationship(floorTwinId, FLOOR_COOLED_BY_HVAC_RELATIONSHIP_ID, deserializeJsonString(floorCooledByHvacPayload, BasicRelationship.class), BasicRelationship.class))
                .assertNext(
                    basicRelationship -> {
                        assertThat(basicRelationship.getRelationshipId())
                            .isEqualTo(FLOOR_COOLED_BY_HVAC_RELATIONSHIP_ID)
                            .as("Created relationship from floor -> hvac");
                        logger.info("Created {} relationship between source = {} and target = {}", basicRelationship.getRelationshipId(), basicRelationship.getSourceDigitalTwinId(), basicRelationship.getTargetDigitalTwinId());
                    }
                )
                .verifyComplete();

            // Create relationship from Hvac -> Floor
            StepVerifier
                .create(asyncClient.createRelationship(hvacTwinId, HVAC_COOLS_FLOOR_RELATIONSHIP_ID, deserializeJsonString(floorTwinCoolsRelationshipPayload, BasicRelationship.class), BasicRelationship.class))
                .assertNext(
                    basicRelationship -> {
                        assertThat(basicRelationship.getRelationshipId())
                            .isEqualTo(HVAC_COOLS_FLOOR_RELATIONSHIP_ID)
                            .as("Created relationship from hvac -> floor");
                        logger.info("Created {} relationship between source = {} and target = {}", basicRelationship.getRelationshipId(), basicRelationship.getSourceDigitalTwinId(), basicRelationship.getTargetDigitalTwinId());
                    }
                )
                .verifyComplete();

            // Create relationship from Room -> Floor
            StepVerifier
                .create(asyncClient.createRelationship(roomTwinId, ROOM_CONTAINED_IN_FLOOR_RELATIONSHIP_ID, deserializeJsonString(floorTwinContainedInRelationshipPayload, BasicRelationship.class), BasicRelationship.class))
                .assertNext(
                    basicRelationship -> {
                        assertThat(basicRelationship.getRelationshipId())
                            .isEqualTo(ROOM_CONTAINED_IN_FLOOR_RELATIONSHIP_ID)
                            .as("Created relationship from room -> floor");
                        logger.info("Created {} relationship between source = {} and target = {}", basicRelationship.getRelationshipId(), basicRelationship.getSourceDigitalTwinId(), basicRelationship.getTargetDigitalTwinId());
                    }
                )
                .verifyComplete();

            // Create a relation which already exists - should return status code 409 (Conflict).
            StepVerifier.create(asyncClient.createRelationship(roomTwinId, ROOM_CONTAINED_IN_FLOOR_RELATIONSHIP_ID, floorTwinContainedInRelationshipPayload, String.class))
                .verifyErrorSatisfies(ex -> assertRestException(ex, HTTP_PRECON_FAILED));

            // Update relationships

            // Create relationship from Floor -> Room
            StepVerifier
                .create(asyncClient.updateRelationshipWithResponse(floorTwinId, FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID, floorContainsRoomUpdatePayload, null))
                .assertNext(
                    voidDigitalTwinsResponse -> {
                        assertThat(voidDigitalTwinsResponse.getStatusCode())
                            .as("Updated relationship floor -> room")
                            .isEqualTo(HTTP_NO_CONTENT);
                        logger.info("Updated {} relationship successfully in source {}", FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID, floorTwinId);
                    }
                )
                .verifyComplete();

            // GET relationship
            StepVerifier
                .create(asyncClient.getRelationship(floorTwinId, FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID, BasicRelationship.class))
                .assertNext(basicRelationship -> {
                    assertThat(basicRelationship.getRelationshipId())
                        .isEqualTo(FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID)
                        .as("Retrieved floor -> room relationship");
                    logger.info("Retrieved {} relationship under source {}", basicRelationship.getRelationshipId(), basicRelationship.getSourceDigitalTwinId());
                })
                .verifyComplete();

            // LIST incoming relationships
            List<String> incomingRelationshipsSourceIds = new ArrayList<>();
            StepVerifier
                .create(asyncClient.listIncomingRelationships(floorTwinId, null))
                .assertNext(incomingRelationship -> incomingRelationshipsSourceIds.add(incomingRelationship.getSourceDigitalTwinId()))
                .assertNext(incomingRelationship -> incomingRelationshipsSourceIds.add(incomingRelationship.getSourceDigitalTwinId()))
                .expectComplete()
                .verify();
            assertThat(incomingRelationshipsSourceIds)
                .as("Floor has incoming relationships from room and hvac")
                .containsExactlyInAnyOrder(roomTwinId, hvacTwinId);
            logger.info("Retrieved incoming relationships for {}, found sources {}", floorTwinId, Arrays.toString(incomingRelationshipsSourceIds.toArray()));

            // LIST relationships
            List<String> relationshipsTargetIds = new ArrayList<>();
            StepVerifier
                .create(asyncClient.listRelationships(floorTwinId, BasicRelationship.class))
                .assertNext(basicRelationship -> relationshipsTargetIds.add(basicRelationship.getTargetDigitalTwinId()))
                .assertNext(basicRelationship -> relationshipsTargetIds.add(basicRelationship.getTargetDigitalTwinId()))
                .expectComplete()
                .verify();
            assertThat(relationshipsTargetIds)
                .as("Floor has a relationship to room and hvac")
                .containsExactlyInAnyOrder(roomTwinId, hvacTwinId);
            logger.info("Retrieved all relationships for {}, found targets {}", floorTwinId, Arrays.toString(relationshipsTargetIds.toArray()));

            // LIST relationship by name
            StepVerifier
                .create(asyncClient.listRelationships(roomTwinId, CONTAINED_IN_RELATIONSHIP, BasicRelationship.class, null))
                .assertNext(basicRelationship -> {
                    assertThat(basicRelationship.getRelationshipName())
                        .isEqualTo(CONTAINED_IN_RELATIONSHIP)
                        .as("Room has only one containedIn relationship to floor");
                    assertThat(basicRelationship.getTargetDigitalTwinId())
                        .isEqualTo(floorTwinId)
                        .as("Room has only one containedIn relationship to floor");
                    logger.info("Retrieved relationship {} for twin {}", basicRelationship.getRelationshipId(), roomTwinId);
                })
                .expectComplete()
                .verify();

            // DELETE the created relationships
            StepVerifier
                .create(asyncClient.deleteRelationship(floorTwinId, FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID))
                .verifyComplete();
            logger.info("Deleted relationship {} for twin {}", FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID, floorTwinId);

            StepVerifier
                .create(asyncClient.deleteRelationship(roomTwinId, ROOM_CONTAINED_IN_FLOOR_RELATIONSHIP_ID))
                .verifyComplete();
            logger.info("Deleted relationship {} for twin {}", ROOM_CONTAINED_IN_FLOOR_RELATIONSHIP_ID, roomTwinId);

            StepVerifier
                .create(asyncClient.deleteRelationship(floorTwinId, FLOOR_COOLED_BY_HVAC_RELATIONSHIP_ID))
                .verifyComplete();
            logger.info("Deleted relationship {} for twin {}", FLOOR_COOLED_BY_HVAC_RELATIONSHIP_ID, floorTwinId);

            StepVerifier
                .create(asyncClient.deleteRelationship(hvacTwinId, HVAC_COOLS_FLOOR_RELATIONSHIP_ID))
                .verifyComplete();
            logger.info("Deleted relationship {} for twin {}", HVAC_COOLS_FLOOR_RELATIONSHIP_ID, hvacTwinId);

            // GET a relationship which doesn't exist - should return status code 404 (Not Found).
            StepVerifier
                .create(asyncClient.getRelationship(floorTwinId, FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID, String.class))
                .verifyErrorSatisfies(ex -> assertRestException(ex, HTTP_NOT_FOUND));

        } finally {
            // Clean up
            try {
                logger.info("Cleaning up test resources.");

                logger.info("Deleting created relationships.");
                // Delete the created relationships.
                List<BasicRelationship> relationships = new ArrayList<>();
                asyncClient.listRelationships(floorTwinId, BasicRelationship.class)
                    .doOnNext(relationships::add)
                    .blockLast();
                asyncClient.listRelationships(roomTwinId, BasicRelationship.class)
                    .doOnNext(relationships::add)
                    .blockLast();
                asyncClient.listRelationships(hvacTwinId, BasicRelationship.class)
                    .doOnNext(relationships::add)
                    .blockLast();
                relationships.forEach(basicRelationship -> asyncClient.deleteRelationship(basicRelationship.getSourceDigitalTwinId(), basicRelationship.getRelationshipId()).block());

                // Now the twins and models can be deleted.
                logger.info("Deleting created digital twins.");
                asyncClient.deleteDigitalTwin(floorTwinId).block();
                asyncClient.deleteDigitalTwin(roomTwinId).block();
                asyncClient.deleteDigitalTwin(hvacTwinId).block();

                logger.info("Deleting created models.");
                asyncClient.deleteModel(floorModelId).block();
                asyncClient.deleteModel(roomModelId).block();
                asyncClient.deleteModel(hvacModelId).block();
            }
            catch (Exception ex) {
                fail("Test cleanup failed", ex);
            }
        }
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.digitaltwins.core.TestHelper#getTestParameters")
    @Override
    public void relationshipListOperationWithMultiplePages(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion) {
        DigitalTwinsAsyncClient asyncClient = getAsyncClient(httpClient, serviceVersion);
        String floorModelId = getUniqueModelId(FLOOR_MODEL_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String roomModelId = getUniqueModelId(ROOM_MODEL_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String hvacModelId = getUniqueModelId(HVAC_MODEL_ID_PREFIX, asyncClient, randomIntegerStringGenerator);

        String floorTwinId = getUniqueDigitalTwinId(FLOOR_TWIN_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String roomTwinId = getUniqueDigitalTwinId(ROOM_TWIN_ID_PREFIX, asyncClient, randomIntegerStringGenerator);
        String hvacTwinId = getUniqueDigitalTwinId(HVAC_TWIN_ID_PREFIX, asyncClient, randomIntegerStringGenerator);

        List<String> createdOutgoingRelationshipIds = new ArrayList<>();
        List<String> createdIncomingRelationshipIds = new ArrayList<>();

        try {
            createModelsAndTwins(asyncClient, floorModelId, roomModelId, hvacModelId, floorTwinId, roomTwinId, hvacTwinId);

            // Connect the created twins via relationships
            String floorContainsRoomPayload = getRelationshipWithPropertyPayload(roomTwinId, CONTAINS_RELATIONSHIP, "isAccessRestricted", true);
            String roomContainedInFloorPayload = getRelationshipPayload(floorTwinId, CONTAINED_IN_RELATIONSHIP);

            // Create large number of relationships to test paging functionality
            // Relationship list api does not have max item count request option so we have to create a large number of them to trigger paging functionality from the service.
            // Create relationships from Floor -> Room
            for (int i = 0; i < BULK_RELATIONSHIP_COUNT; i++) {
                String relationshipId = FLOOR_CONTAINS_ROOM_RELATIONSHIP_ID + this.testResourceNamer.randomUuid();
                StepVerifier.create(
                    asyncClient.createRelationship(
                        floorTwinId,
                        relationshipId,
                        deserializeJsonString(floorContainsRoomPayload, BasicRelationship.class),
                        BasicRelationship.class))
                    .assertNext(response ->
                        logger.info("Created relationship with Id {}", relationshipId))
                    .verifyComplete();
                createdOutgoingRelationshipIds.add(relationshipId);
            }

            // Create multiple incoming relationships to the floor. Typically a room would have relationships to multiple
            // different floors, but for the sake of test simplicity, we'll just add multiple relationships from the same room
            // to the same floor.
            for (int i = 0; i < BULK_RELATIONSHIP_COUNT; i++) {
                String relationshipId = ROOM_CONTAINED_IN_FLOOR_RELATIONSHIP_ID + this.testResourceNamer.randomUuid();
                StepVerifier.create(
                    asyncClient.createRelationship(
                        roomTwinId,
                        relationshipId,
                        deserializeJsonString(roomContainedInFloorPayload, BasicRelationship.class),
                        BasicRelationship.class))
                    .assertNext(response ->
                        logger.info("Created relationship with Id {}", relationshipId))
                    .verifyComplete();
                createdIncomingRelationshipIds.add(relationshipId);
            }

            AtomicInteger outgoingRelationshipsPageCount = new AtomicInteger();
            // List relationships in multiple pages and verify more than one page was retrieved.
            StepVerifier.create(asyncClient.listRelationships(floorTwinId, BasicRelationship.class).byPage())
                .thenConsumeWhile(
                    page -> {
                        outgoingRelationshipsPageCount.getAndIncrement();
                        logger.info("content for this page " + outgoingRelationshipsPageCount);
                        for (BasicRelationship relationship : page.getValue()) {
                            logger.info(relationship.getRelationshipId());
                        }

                        if (page.getContinuationToken() != null) {
                            assertEquals(RELATIONSHIP_PAGE_SIZE_DEFAULT, page.getValue().size(), "Unexpected page size for a non-terminal page");
                        }

                        return true;
                    })
                .verifyComplete();

            assertThat(outgoingRelationshipsPageCount.get()).isGreaterThan(1);

            AtomicInteger incomingRelationshipsPageCount = new AtomicInteger();
            // List relationships in multiple pages and verify more than one page was retrieved.
            StepVerifier.create(asyncClient.listIncomingRelationships(floorTwinId, null).byPage())
                .thenConsumeWhile(
                    page -> {
                        incomingRelationshipsPageCount.getAndIncrement();
                        logger.info("content for this page " + incomingRelationshipsPageCount);
                        for (IncomingRelationship relationship : page.getValue()) {
                            logger.info(relationship.getSourceDigitalTwinId());
                        }

                        if (page.getContinuationToken() != null) {
                            assertEquals(RELATIONSHIP_PAGE_SIZE_DEFAULT, page.getValue().size(), "Unexpected page size for a non-terminal page");
                        }

                        return true;
                    })
                .verifyComplete();

            assertThat(incomingRelationshipsPageCount.get()).isGreaterThan(1);
        }
        catch (Exception ex) {
            fail("Test run failed", ex);
        }
        finally {
            // Clean up
            try {
                logger.info("Cleaning up test resources.");

                logger.info("Deleting created relationships.");
                // Delete the created relationships.
                createdOutgoingRelationshipIds.forEach(relationshipId -> asyncClient.deleteRelationship(floorTwinId, relationshipId).block());
                createdIncomingRelationshipIds.forEach(relationshipId -> asyncClient.deleteRelationship(roomTwinId, relationshipId).block());

                // Now the twins and models can be deleted.
                logger.info("Deleting created digital twins.");
                asyncClient.deleteDigitalTwin(floorTwinId).block();
                asyncClient.deleteDigitalTwin(roomTwinId).block();
                asyncClient.deleteDigitalTwin(hvacTwinId).block();

                logger.info("Deleting created models.");
                asyncClient.deleteModel(floorModelId).block();
                asyncClient.deleteModel(roomModelId).block();
                asyncClient.deleteModel(hvacModelId).block();
            }
            catch (Exception ex) {
                fail("Test cleanup failed", ex);
            }
        }
    }

    private void createModelsAndTwins(DigitalTwinsAsyncClient asyncClient, String floorModelId, String roomModelId, String hvacModelId, String floorTwinId, String roomTwinId, String hvacTwinId) throws JsonProcessingException {
        // Create floor, room and hvac model
        createModelsRunner(
            floorModelId,
            roomModelId,
            hvacModelId,
            modelsList -> StepVerifier
                .create(asyncClient.createModels(modelsList))
                .assertNext(createResponseList -> logger.info("Created models successfully"))
                .verifyComplete());

        // Create floor twin
        createFloorTwinRunner(
            floorTwinId,
            floorModelId,
            (twinId, twin) -> StepVerifier
                .create(asyncClient.createDigitalTwin(twinId, twin, BasicDigitalTwin.class))
                .assertNext(basicDigitalTwin -> logger.info("Created {} twin successfully", basicDigitalTwin.getId()))
                .verifyComplete());

        // Create room twin
        createRoomTwinRunner(
            roomTwinId,
            roomModelId,
            (twinId, twin) -> StepVerifier
                .create(asyncClient.createDigitalTwin(twinId, twin, BasicDigitalTwin.class))
                .assertNext(basicDigitalTwin -> logger.info("Created {} twin successfully", basicDigitalTwin.getId()))
                .verifyComplete());

        // Create hvac twin
        createHvacTwinRunner(
            hvacTwinId,
            hvacModelId,
            (twinId, twin) -> StepVerifier
                .create(asyncClient.createDigitalTwin(twinId, twin, BasicDigitalTwin.class))
                .assertNext(basicDigitalTwin -> logger.info("Created {} twin successfully", basicDigitalTwin.getId()))
                .verifyComplete());
    }
}
