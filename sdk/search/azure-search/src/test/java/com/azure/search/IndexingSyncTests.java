// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.search.models.DataType;
import com.azure.search.models.Field;
import com.azure.search.models.GeoPoint;
import com.azure.search.models.Index;
import com.azure.search.models.IndexBatch;
import com.azure.search.models.IndexDocumentsResult;
import com.azure.search.models.IndexingResult;
import com.azure.search.test.environment.models.Author;
import com.azure.search.test.environment.models.Book;
import com.azure.search.test.environment.models.Hotel;
import com.azure.search.test.environment.models.HotelAddress;
import com.azure.search.test.environment.models.HotelRoom;
import com.azure.search.test.environment.models.LoudHotel;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class IndexingSyncTests extends SearchIndexClientTestBase {
    private static final String INDEX_NAME = "hotels";
    private static final String BOOKS_INDEX_NAME = "books";
    private static final String BOOKS_INDEX_JSON = "BooksIndexData.json";

    private SearchIndexClient client;

    @Test
    public void countingDocsOfNewIndexGivesZero() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        assertEquals(0L, client.getDocumentCount());
    }

    @Test
    public void indexDoesNotThrowWhenAllActionsSucceed() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        String expectedHotelId = "1";
        List<Hotel> hotels = Collections.singletonList(new Hotel().hotelId(expectedHotelId));

        List<IndexingResult> result = client.uploadDocuments(hotels).getResults();
        this.assertIndexActionSucceeded(expectedHotelId, result.get(0), 201);

        waitForIndexing();
        assertEquals(1L, client.getDocumentCount());
    }

    @Test
    public void canIndexWithPascalCaseFields() {
        setupIndexFromJsonFile(BOOKS_INDEX_JSON);
        client = getSearchIndexClientBuilder(BOOKS_INDEX_NAME).buildClient();

        List<Book> books = new ArrayList<>();
        books.add(new Book()
            .ISBN("123")
            .title("Lord of the Rings")
            .author(new Author()
                .firstName("J.R.R")
                .lastName("Tolkien"))
        );

        List<IndexingResult> result = client.uploadDocuments(books).getResults();
        this.assertIndexActionSucceeded("123", result.get(0), 201);

        waitForIndexing();
        assertEquals(1L, client.getDocumentCount());
    }

    @Test
    public void canDeleteBatchByKeys() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        client.uploadDocuments(Arrays.asList(
            new Hotel().hotelId("1"),
            new Hotel().hotelId("2")
        ));
        waitForIndexing();
        assertEquals(2, client.getDocumentCount());

        IndexBatch<Hotel> deleteBatch = new IndexBatch<Hotel>()
            .addDeleteAction("HotelId", "1", "2");

        IndexDocumentsResult documentIndexResult = client.index(deleteBatch);
        waitForIndexing();

        assertEquals(2, documentIndexResult.getResults().size());
        assertIndexActionSucceeded("1", documentIndexResult.getResults().get(0), 200);
        assertIndexActionSucceeded("2", documentIndexResult.getResults().get(1), 200);

        assertEquals(0, client.getDocumentCount());
    }

    @Test
    public void indexDoesNotThrowWhenDeletingDocumentWithExtraFields() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        List<Hotel> hotels = new ArrayList<>();
        Hotel hotel = new Hotel()
            .hotelId("1")
            .category("Luxury");
        hotels.add(hotel);

        client.uploadDocuments(hotels);
        waitForIndexing();
        assertEquals(1, client.getDocumentCount());

        hotel.category("ignored");
        IndexDocumentsResult documentIndexResult = client.deleteDocuments(hotels);
        waitForIndexing();

        assertEquals(1, documentIndexResult.getResults().size());
        assertIndexActionSucceeded("1", documentIndexResult.getResults().get(0), 200);
        assertEquals(0, client.getDocumentCount());
    }

    @Test
    public void indexDoesNotThrowWhenDeletingDynamicDocumentWithExtraFields() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        List<Document> docs = new ArrayList<>();


        Document document = new Document();
        document.put("HotelId", "1");
        document.put("Category", "Luxury");
        docs.add(document);

        client.uploadDocuments(docs);

        waitForIndexing();
        assertEquals(1, client.getDocumentCount());

        document.put("Category", "ignored");
        IndexDocumentsResult documentIndexResult = client.deleteDocuments(docs);
        waitForIndexing();

        assertEquals(1, documentIndexResult.getResults().size());
        assertIndexActionSucceeded("1", documentIndexResult.getResults().get(0), 200);
        assertEquals(0, client.getDocumentCount());
    }

    @Test
    public void canIndexStaticallyTypedDocuments() throws ParseException {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        Hotel hotel1 = prepareStaticallyTypedHotel("1");
        Hotel hotel2 = prepareStaticallyTypedHotel("2");
        Hotel hotel3 = prepareStaticallyTypedHotel("3");
        Hotel nonExistingHotel = prepareStaticallyTypedHotel("nonExistingHotel"); // merging with a non existing document
        Hotel randomHotel = prepareStaticallyTypedHotel("randomId"); // deleting a non existing document

        IndexBatch<Hotel> batch = new IndexBatch<Hotel>()
            .addUploadAction(hotel1)
            .addDeleteAction(randomHotel)
            .addMergeAction(nonExistingHotel)
            .addMergeOrUploadAction(hotel3)
            .addUploadAction(hotel2);

        try {
            client.index(batch);
            fail("indexing did not throw an expected Exception");
        } catch (IndexBatchException ex) {
            List<IndexingResult> results = ex.getIndexingResults();
            assertEquals(results.size(), batch.getActions().size());

            assertSuccessfulIndexResult(results.get(0), "1", 201);
            assertSuccessfulIndexResult(results.get(1), "randomId", 200);
            assertFailedIndexResult(results.get(2), "nonExistingHotel", 404);
            assertSuccessfulIndexResult(results.get(3), "3", 201);
            assertSuccessfulIndexResult(results.get(4), "2", 201);
        } catch (Exception ex) {
            fail(String.format("indexing failed with an unexpected Exception: %s", ex.getMessage()));
        }

        Hotel actualHotel1 = convertToType(client.getDocument(hotel1.hotelId()), Hotel.class);
        TestHelpers.assertHotelsEqual(hotel1, actualHotel1);

        Hotel actualHotel2 = convertToType(client.getDocument(hotel2.hotelId()), Hotel.class);
        TestHelpers.assertHotelsEqual(hotel2, actualHotel2);

        Hotel actualHotel3 = convertToType(client.getDocument(hotel3.hotelId()), Hotel.class);
        TestHelpers.assertHotelsEqual(hotel3, actualHotel3);
    }

    @Test
    public void canIndexDynamicDocuments() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        Document hotel1 = prepareDynamicallyTypedHotel("1");
        Document hotel2 = prepareDynamicallyTypedHotel("2");
        Document hotel3 = prepareDynamicallyTypedHotel("3");
        Document nonExistingHotel = prepareDynamicallyTypedHotel("nonExistingHotel"); // deleting a non existing document
        Document randomHotel = prepareDynamicallyTypedHotel("randomId"); // deleting a non existing document

        IndexBatch<Document> batch = new IndexBatch<Document>()
            .addUploadAction(hotel1)
            .addDeleteAction(randomHotel)
            .addMergeAction(nonExistingHotel)
            .addMergeOrUploadAction(hotel3)
            .addUploadAction(hotel2);

        try {
            client.index(batch);
            fail("indexing did not throw an expected Exception");
        } catch (IndexBatchException ex) {
            List<IndexingResult> results = ex.getIndexingResults();
            assertEquals(results.size(), batch.getActions().size());

            assertSuccessfulIndexResult(results.get(0), "1", 201);
            assertSuccessfulIndexResult(results.get(1), "randomId", 200);
            assertFailedIndexResult(results.get(2), "nonExistingHotel", 404);
            assertSuccessfulIndexResult(results.get(3), "3", 201);
            assertSuccessfulIndexResult(results.get(4), "2", 201);
        } catch (Exception ex) {
            fail(String.format("indexing failed with an unexpected Exception: %s", ex.getMessage()));
        }

        Document actualHotel1 = client.getDocument(hotel1.get("HotelId").toString());
        assertEquals(hotel1, actualHotel1);

        Document actualHotel2 = client.getDocument(hotel2.get("HotelId").toString());
        assertEquals(hotel2, actualHotel2);

        Document actualHotel3 = client.getDocument(hotel3.get("HotelId").toString());
        assertEquals(hotel3, actualHotel3);
    }

    @Test
    public void indexWithInvalidDocumentThrowsException() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        List<Document> docs = new ArrayList<>();
        docs.add(new Document());

        assertHttpResponseException(
            () -> client.uploadDocuments(docs),
            HttpResponseStatus.BAD_REQUEST,
            "The request is invalid. Details: actions : 0: Document key cannot be missing or empty."
        );
    }

    @Test
    public void canUseIndexWithReservedName() {
        String indexName = "prototype";
        Index indexWithReservedName = new Index()
            .setName(indexName)
            .setFields(Collections.singletonList(new Field()
                .setName("ID")
                .setType(DataType.EDM_STRING)
                .setKey(Boolean.TRUE)
            ));

        if (!interceptorManager.isPlaybackMode()) {
            SearchServiceClient searchServiceClient = getSearchServiceClientBuilder().buildClient();
            searchServiceClient.createOrUpdateIndex(indexWithReservedName);
        }

        client = getSearchIndexClientBuilder(indexName).buildClient();

        List<Map<String, Object>> docs = new ArrayList<>();
        Map<String, Object> doc = new HashMap<>();
        doc.put("ID", "1");
        docs.add(doc);

        client.uploadDocuments(docs);

        Document actual = client.getDocument("1");
        assertNotNull(actual);
    }

    @Test
    public void canRoundtripBoundaryValues() throws ParseException {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        List<Hotel> boundaryConditionDocs = getBoundaryValues();

        client.uploadDocuments(boundaryConditionDocs);
        waitForIndexing();

        for (Hotel expected : boundaryConditionDocs) {
            Document doc = client.getDocument(expected.hotelId());
            Hotel actual = convertToType(doc, Hotel.class);
            TestHelpers.assertHotelsEqual(expected, actual);
        }
    }

    @Test
    public void dynamicDocumentDateTimesRoundTripAsUtc() {
        setupIndexFromJsonFile(BOOKS_INDEX_JSON);
        client = getSearchIndexClientBuilder(BOOKS_INDEX_NAME).buildClient();

        OffsetDateTime utcTime = OffsetDateTime.of(
            LocalDateTime.of(2010, 1, 1, 0, 0, 0),
            ZoneOffset.UTC
        );
        OffsetDateTime utcTimeMinusEight = OffsetDateTime.of(
            // UTC-8
            LocalDateTime.of(2010, 1, 1, 0, 0, 0),
            ZoneOffset.ofHours(-8)
        );

        List<Map<String, Object>> books = new ArrayList<>();

        Map<String, Object> book1 = new HashMap<>();
        book1.put("ISBN", "1");
        book1.put("PublishDate", utcTime);
        books.add(book1);

        Map<String, Object> book2 = new HashMap<>();
        book2.put("ISBN", "2");
        book2.put("PublishDate", utcTimeMinusEight);
        books.add(book2);

        client.uploadDocuments(books);
        waitForIndexing();

        Document actualBook1 = client.getDocument("1");
        assertEquals(utcTime, actualBook1.get("PublishDate"));

        // Azure Cognitive Search normalizes to UTC, so we compare instants
        Document actualBook2 = client.getDocument("2");
        assertEquals(utcTimeMinusEight.withOffsetSameInstant(ZoneOffset.UTC), ((OffsetDateTime) actualBook2.get("PublishDate")).withOffsetSameInstant(ZoneOffset.UTC));
    }

    @Test
    public void staticallyTypedDateTimesRoundTripAsUtc() {
        setupIndexFromJsonFile(BOOKS_INDEX_JSON);
        client = getSearchIndexClientBuilder(BOOKS_INDEX_NAME).buildClient();

        List<Book> books = Arrays.asList(
            new Book()
                .ISBN("1")
                .publishDate(OffsetDateTime.of(
                    LocalDateTime.of(2010, 1, 1, 0, 0, 0),
                    ZoneOffset.UTC
                )),
            new Book()
                .ISBN("2")
                .publishDate(OffsetDateTime.of(
                    LocalDateTime.of(2010, 1, 1, 0, 0, 0),
                    ZoneOffset.ofHours(-8)
                ))
        );

        client.uploadDocuments(books);

        Document actualBook1 = client.getDocument("1");
        assertEquals(books.get(0).publishDate(), convertToType(actualBook1, Book.class).publishDate());

        // Azure Cognitive Search normalizes to UTC, so we compare instants
        Document actualBook2 = client.getDocument("2");
        assertEquals(books.get(1).publishDate().withOffsetSameInstant(ZoneOffset.UTC), convertToType(actualBook2, Book.class).publishDate().withOffsetSameInstant(ZoneOffset.UTC));
    }

    @Test
    public void canMergeStaticallyTypedDocuments() throws ParseException {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        // Define commonly used values
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        // Define hotels
        Hotel originalDoc = new Hotel()
            .hotelId("1")
            .hotelName("Secret Point Motel")
            .description("The hotel is ideally located on the main commercial artery of the city in the heart of New York. A few minutes away is Time's Square and the historic centre of the city, as well as other places of interest that make New York one of America's most attractive and cosmopolitan cities.")
            .descriptionFr("L'hôtel est idéalement situé sur la principale artère commerciale de la ville en plein cœur de New York. A quelques minutes se trouve la place du temps et le centre historique de la ville, ainsi que d'autres lieux d'intérêt qui font de New York l'une des villes les plus attractives et cosmopolites de l'Amérique.")
            .category("Boutique")
            .tags(Arrays.asList("pool", "air conditioning", "concierge"))
            .parkingIncluded(false)
            .smokingAllowed(true)
            .lastRenovationDate(dateFormat.parse("2010-06-27T00:00:00Z"))
            .rating(4)
            .location(GeoPoint.create(40.760586, -73.975403))
            .address(new HotelAddress()
                .streetAddress("677 5th Ave")
                .city("New York")
                .stateProvince("NY")
                .country("USA")
                .postalCode("10022"))
            .rooms(Arrays.asList(
                new HotelRoom()
                    .description("Budget Room, 1 Queen Bed (Cityside)")
                    .descriptionFr("Chambre Économique, 1 grand lit (côté ville)")
                    .type("Budget Room")
                    .baseRate(9.69)
                    .bedOptions("1 Queen Bed")
                    .sleepsCount(2)
                    .smokingAllowed(true)
                    .tags(Collections.singletonList("vcr/dvd")),
                new HotelRoom()
                    .description("Budget Room, 1 King Bed (Mountain View)")
                    .descriptionFr("Chambre Économique, 1 très grand lit (Mountain View)")
                    .type("Budget Room")
                    .baseRate(8.09)
                    .bedOptions("1 King Bed")
                    .sleepsCount(2)
                    .smokingAllowed(true)
                    .tags(Arrays.asList("vcr/dvd", "jacuzzi tub"))
            ));

        // Update category, tags, parking included, rating, and rooms. Erase description, last renovation date, location and address.
        Hotel updatedDoc = new Hotel()
            .hotelId("1")
            .hotelName("Secret Point Motel")
            .description(null)
            .category("Economy")
            .tags(Arrays.asList("pool", "air conditioning"))
            .parkingIncluded(true)
            .lastRenovationDate(null)
            .rating(3)
            .location(null)
            .address(new HotelAddress())
            .rooms(Collections.singletonList(
                new HotelRoom()
                    .description(null)
                    .type("Budget Room")
                    .baseRate(10.5)
                    .bedOptions("1 Queen Bed")
                    .sleepsCount(2)
                    .tags(Arrays.asList("vcr/dvd", "balcony"))
            ));

        // Fields whose values get updated are updated, and whose values get erased remain the same.
        Hotel expectedDoc = new Hotel()
            .hotelId("1")
            .hotelName("Secret Point Motel")
            .description("The hotel is ideally located on the main commercial artery of the city in the heart of New York. A few minutes away is Time's Square and the historic centre of the city, as well as other places of interest that make New York one of America's most attractive and cosmopolitan cities.")
            .descriptionFr("L'hôtel est idéalement situé sur la principale artère commerciale de la ville en plein cœur de New York. A quelques minutes se trouve la place du temps et le centre historique de la ville, ainsi que d'autres lieux d'intérêt qui font de New York l'une des villes les plus attractives et cosmopolites de l'Amérique.")
            .category("Economy")
            .tags(Arrays.asList("pool", "air conditioning"))
            .parkingIncluded(true)
            .smokingAllowed(true)
            .lastRenovationDate(dateFormat.parse("2010-06-27T00:00:00Z"))
            .rating(3)
            .location(GeoPoint.create(40.760586, -73.975403))
            .address(new HotelAddress()
                .streetAddress("677 5th Ave")
                .city("New York")
                .stateProvince("NY")
                .country("USA")
                .postalCode("10022"))
            .rooms(Collections.singletonList(
                new HotelRoom()
                    .description(null)
                    .type("Budget Room")
                    .baseRate(10.5)
                    .bedOptions("1 Queen Bed")
                    .sleepsCount(2)
                    .tags(Arrays.asList("vcr/dvd", "balcony"))
            ));

        List<Hotel> originalDocs = new ArrayList<>();
        originalDocs.add(originalDoc);
        client.uploadDocuments(originalDocs);

        List<Hotel> updatedDocs = new ArrayList<>();
        updatedDocs.add(updatedDoc);
        client.mergeDocuments(updatedDocs);
        TestHelpers.assertHotelsEqual(expectedDoc, convertToType(client.getDocument("1"), Hotel.class));

        client.mergeDocuments(originalDocs);
        TestHelpers.assertHotelsEqual(originalDoc, convertToType(client.getDocument("1"), Hotel.class));
    }

    @Test
    public void mergeDocumentWithoutExistingKeyThrowsIndexingException() throws ParseException {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(prepareStaticallyTypedHotel("1"));


        try {
            client.mergeDocuments(hotels);
            fail("merge did not throw an expected Exception");
        } catch (IndexBatchException ex) {
            List<IndexingResult> results = ex.getIndexingResults();
            assertFailedIndexResult(results.get(0), "1", HttpResponseStatus.NOT_FOUND.code());
            assertEquals(1, results.size());
        } catch (Exception ex) {
            fail(String.format("indexing failed with an unexpected Exception: %s", ex.getMessage()));
        }
    }

    @Test
    public void canSetExplicitNullsInStaticallyTypedDocument() throws ParseException {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        LoudHotel originalDoc = new LoudHotel()
            .hotelId("1")
            .hotelName("Secret Point Motel")
            .description("The hotel is ideally located on the main commercial artery of the city in the heart of New York. A few minutes away is Time's Square and the historic centre of the city, as well as other places of interest that make New York one of America's most attractive and cosmopolitan cities.")
            .descriptionFrench("L'hôtel est idéalement situé sur la principale artère commerciale de la ville en plein cœur de New York. A quelques minutes se trouve la place du temps et le centre historique de la ville, ainsi que d'autres lieux d'intérêt qui font de New York l'une des villes les plus attractives et cosmopolites de l'Amérique.")
            .category("Boutique")
            .tags(Arrays.asList("pool", "air conditioning", "concierge"))
            .parkingIncluded(false)
            .smokingAllowed(false)
            .lastRenovationDate(dateFormat.parse("1970-01-18T05:00:00Z"))
            .rating(4)
            .location(GeoPoint.create(40.760586, -73.975403))
            .address(new HotelAddress()
                .streetAddress("677 5th Ave")
                .city("New York")
                .stateProvince("NY")
                .country("USA")
                .postalCode("10022")
            ).rooms(Arrays.asList(
                new HotelRoom()
                    .description("Budget Room, 1 Queen Bed (Cityside)")
                    .descriptionFr("Chambre Économique, 1 grand lit (côté ville)")
                    .type("Budget Room")
                    .baseRate(9.69)
                    .bedOptions("1 Queen Bed")
                    .sleepsCount(2)
                    .smokingAllowed(true)
                    .tags(Collections.singletonList("vcr/dvd")),
                new HotelRoom()
                    .description("Budget Room, 1 King Bed (Mountain View)")
                    .descriptionFr("Chambre Économique, 1 très grand lit (Mountain View)")
                    .type("Budget Room")
                    .baseRate(8.09)
                    .bedOptions("1 King Bed")
                    .sleepsCount(2)
                    .smokingAllowed(true)
                    .tags(Arrays.asList("vcr/dvd", "jacuzzi tub"))
            ));

        LoudHotel updatedDoc = new LoudHotel()
            .hotelId("1")
            .description(null)  // This property has JsonInclude.Include.ALWAYS, so this will null out the field.
            .category(null)     // This property doesn't have JsonInclude.Include.ALWAYS, so this should have no effect.
            .tags(Arrays.asList("pool", "air conditioning"))
            .parkingIncluded(true)
            .lastRenovationDate(dateFormat.parse("1970-01-18T05:00:00Z"))
            .rating(3)
            .location(null)     // This property has JsonInclude.Include.ALWAYS, so this will null out the field.
            .address(new HotelAddress())
            .rooms(Collections.singletonList(
                new HotelRoom()
                    .description(null)
                    .type("Budget Room")
                    .baseRate(10.5)
                    .smokingAllowed(false)
                    .tags(Arrays.asList("vcr/dvd", "balcony"))
            ));

        LoudHotel expectedDoc = new LoudHotel()
            .hotelId("1")
            .hotelName("Secret Point Motel")
            .description(null)
            .descriptionFrench("L'hôtel est idéalement situé sur la principale artère commerciale de la ville en plein cœur de New York. A quelques minutes se trouve la place du temps et le centre historique de la ville, ainsi que d'autres lieux d'intérêt qui font de New York l'une des villes les plus attractives et cosmopolites de l'Amérique.")
            .category("Boutique")
            .tags(Arrays.asList("pool", "air conditioning"))
            .parkingIncluded(true)
            .smokingAllowed(false)
            .lastRenovationDate(dateFormat.parse("1970-01-18T05:00:00Z"))
            .rating(3)
            .location(null)
            .address(new HotelAddress()
                .streetAddress("677 5th Ave")
                .city("New York")
                .stateProvince("NY")
                .country("USA")
                .postalCode("10022")
            ).rooms(Collections.singletonList(
                // Regardless of NullValueHandling, this should look like the merged doc with unspecified fields as null
                // because we don't support partial updates for complex collections.
                new HotelRoom()
                    .description(null)
                    .descriptionFr(null)
                    .type("Budget Room")
                    .baseRate(10.5)
                    .bedOptions(null)
                    .sleepsCount(null)
                    .smokingAllowed(false)
                    .tags(Arrays.asList("vcr/dvd", "balcony"))
            ));

        List<LoudHotel> originalDocs = new ArrayList<>();
        originalDocs.add(originalDoc);
        client.uploadDocuments(originalDocs);
        waitForIndexing();

        List<LoudHotel> updatedDocs = new ArrayList<>();
        updatedDocs.add(updatedDoc);
        client.mergeDocuments(updatedDocs);
        waitForIndexing();

        Document result = client.getDocument("1");
        LoudHotel actualDoc = convertToType(result, LoudHotel.class);
        TestHelpers.assertLoudHotelsEqual(expectedDoc, actualDoc);

        client.uploadDocuments(originalDocs);
        waitForIndexing();

        result = client.getDocument("1");
        actualDoc = convertToType(result, LoudHotel.class);
        TestHelpers.assertLoudHotelsEqual(originalDoc, actualDoc);
    }

    @Test
    public void canMergeDynamicDocuments() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        Document originalDoc = new Document();
        originalDoc.put("HotelId", "1");
        originalDoc.put("HotelName", "Secret Point Motel");
        originalDoc.put("Description", "The hotel is ideally located on the main commercial artery of the city in the heart of New York. A few minutes away is Time's Square and the historic centre of the city, as well as other places of interest that make New York one of America's most attractive and cosmopolitan cities.");
        originalDoc.put("Description_fr", "L'hôtel est idéalement situé sur la principale artère commerciale de la ville en plein cœur de New York. A quelques minutes se trouve la place du temps et le centre historique de la ville, ainsi que d'autres lieux d'intérêt qui font de New York l'une des villes les plus attractives et cosmopolites de l'Amérique.");
        originalDoc.put("Category", "Boutique");
        originalDoc.put("Tags", Arrays.asList("pool", "air conditioning", "concierge"));
        originalDoc.put("ParkingIncluded", false);
        originalDoc.put("SmokingAllowed", true);
        originalDoc.put("LastRenovationDate", OffsetDateTime.parse("2010-06-27T00:00:00Z"));
        originalDoc.put("Rating", 4);
        originalDoc.put("Location", GeoPoint.create(40.760586, -73.965403));

        Document originalAddress = new Document();
        originalAddress.put("StreetAddress", "677 5th Ave");
        originalAddress.put("City", "New York");
        originalAddress.put("StateProvince", "NY");
        originalAddress.put("PostalCode", "10022");
        originalAddress.put("Country", "USA");
        originalDoc.put("Address", originalAddress);

        Document originalRoom1 = new Document();
        originalRoom1.put("Description", "Budget Room, 1 Queen Bed (Cityside)");
        originalRoom1.put("Description_fr", "Chambre Économique, 1 grand lit (côté ville)");
        originalRoom1.put("Type", "Budget Room");
        originalRoom1.put("BaseRate", 9.69);
        originalRoom1.put("BedOptions", "1 Queen Bed");
        originalRoom1.put("SleepsCount", 2);
        originalRoom1.put("SmokingAllowed", true);
        originalRoom1.put("Tags", Collections.singletonList("vcr/dvd"));

        Document originalRoom2 = new Document();
        originalRoom2.put("Description", "Budget Room, 1 King Bed (Mountain View)");
        originalRoom2.put("Description_fr", "Chambre Économique, 1 très grand lit (Mountain View)");
        originalRoom2.put("Type", "Budget Room");
        originalRoom2.put("BaseRate", 8.09);
        originalRoom2.put("BedOptions", "1 King Bed");
        originalRoom2.put("SleepsCount", 2);
        originalRoom2.put("SmokingAllowed", true);
        originalRoom2.put("Tags", Arrays.asList("vcr/dvd", "jacuzzi tub"));

        originalDoc.put("Rooms", Arrays.asList(originalRoom1, originalRoom2));

        Document updatedDoc = new Document();
        updatedDoc.put("HotelId", "1");
        updatedDoc.put("Description", null);
        updatedDoc.put("Category", "Economy");
        updatedDoc.put("Tags", Arrays.asList("pool", "air conditioning"));
        updatedDoc.put("ParkingIncluded", true);
        updatedDoc.put("LastRenovationDate", null);
        updatedDoc.put("Rating", 3);
        updatedDoc.put("Location", null);
        updatedDoc.put("Address", new Document());

        Document updatedRoom1 = new Document();
        updatedRoom1.put("Description", null);
        updatedRoom1.put("Type", "Budget Room");
        updatedRoom1.put("BaseRate", 10.5);
        updatedRoom1.put("BedOptions", "1 Queen Bed");
        updatedRoom1.put("SleepsCount", 2);
        updatedRoom1.put("SmokingAllowed", true);
        updatedRoom1.put("Tags", Arrays.asList("vcr/dvd", "balcony"));
        updatedDoc.put("Rooms", Collections.singletonList(updatedRoom1));

        Document expectedDoc = new Document();
        expectedDoc.put("HotelId", "1");
        expectedDoc.put("HotelName", "Secret Point Motel");
        expectedDoc.put("Description", null);
        expectedDoc.put("Description_fr", "L'hôtel est idéalement situé sur la principale artère commerciale de la ville en plein cœur de New York. A quelques minutes se trouve la place du temps et le centre historique de la ville, ainsi que d'autres lieux d'intérêt qui font de New York l'une des villes les plus attractives et cosmopolites de l'Amérique.");
        expectedDoc.put("Category", "Economy");
        expectedDoc.put("Tags", Arrays.asList("pool", "air conditioning"));
        expectedDoc.put("ParkingIncluded", true);
        expectedDoc.put("SmokingAllowed", true);
        expectedDoc.put("LastRenovationDate", null);
        expectedDoc.put("Rating", 3);
        expectedDoc.put("Location", null);

        LinkedHashMap<String, Object> expectedAddress = new LinkedHashMap<>();
        expectedAddress.put("StreetAddress", "677 5th Ave");
        expectedAddress.put("City", "New York");
        expectedAddress.put("StateProvince", "NY");
        expectedAddress.put("PostalCode", "10022");
        expectedAddress.put("Country", "USA");
        expectedDoc.put("Address", expectedAddress);

        // This should look like the merged doc with unspecified fields as null because we don't support
        // partial updates for complex collections.
        LinkedHashMap<String, Object> expectedRoom = new LinkedHashMap<>();
        expectedRoom.put("Description", null);
        expectedRoom.put("Description_fr", null);
        expectedRoom.put("Type", "Budget Room");
        expectedRoom.put("BaseRate", 10.5);
        expectedRoom.put("BedOptions", "1 Queen Bed");
        expectedRoom.put("SleepsCount", 2);
        expectedRoom.put("SmokingAllowed", true);
        expectedRoom.put("Tags", Arrays.asList("vcr/dvd", "balcony"));

        List<LinkedHashMap<String, Object>> expectedRooms = new ArrayList<>();
        expectedRooms.add(expectedRoom);
        expectedDoc.put("Rooms", expectedRooms);

        List<Document> originalDocs = new ArrayList<>();
        originalDocs.add(originalDoc);
        client.mergeOrUploadDocuments(originalDocs);
        waitForIndexing();

        List<Document> updatedDocs = new ArrayList<>();
        updatedDocs.add(updatedDoc);
        client.mergeDocuments(updatedDocs);
        waitForIndexing();

        Document actualDoc = client.getDocument("1");
        assertEquals(expectedDoc, actualDoc);

        client.mergeOrUploadDocuments(originalDocs);
        waitForIndexing();

        actualDoc = client.getDocument("1");
        assertEquals(originalDoc, actualDoc);
    }

    @Test
    public void canIndexAndAccessResponse() {
        createHotelIndex();
        client = getSearchIndexClientBuilder(INDEX_NAME).buildClient();

        List<Hotel> hotelsToUpload = new ArrayList<>();
        hotelsToUpload.add(new Hotel()
            .hotelId("1"));
        hotelsToUpload.add(new Hotel()
            .hotelId("2"));

        List<Hotel> hotelsToMerge = new ArrayList<>();
        hotelsToMerge.add(new Hotel()
            .hotelId("1")
            .rating(5));

        List<Hotel> hotelsToMergeOrUpload = new ArrayList<>();
        hotelsToMergeOrUpload.add(new Hotel()
            .hotelId("3")
            .rating(4));
        hotelsToMergeOrUpload.add(new Hotel()
            .hotelId("4")
            .rating(1));

        List<Hotel> hotelsToDelete = new ArrayList<>();
        hotelsToDelete.add(new Hotel()
            .hotelId("4"));

        IndexBatch<Hotel> batch = new IndexBatch<Hotel>()
            .addUploadAction(hotelsToUpload)
            .addMergeOrUploadAction(hotelsToMergeOrUpload);

        Response<IndexDocumentsResult> indexResponse = client.uploadDocumentsWithResponse(hotelsToUpload, Context.NONE);
        waitForIndexing();

        assertEquals(200, indexResponse.getStatusCode());
        IndexDocumentsResult result = indexResponse.getValue();
        assertEquals(2, result.getResults().size());

        Response<IndexDocumentsResult> updateResponse = client.mergeDocumentsWithResponse(hotelsToMerge, Context.NONE);
        waitForIndexing();

        assertEquals(200, updateResponse.getStatusCode());
        result = updateResponse.getValue();
        assertEquals(1, result.getResults().size());

        Response<IndexDocumentsResult> mergeOrUploadResponse = client.mergeOrUploadDocumentsWithResponse(
            hotelsToMergeOrUpload, Context.NONE);
        waitForIndexing();

        assertEquals(200, mergeOrUploadResponse.getStatusCode());
        result = mergeOrUploadResponse.getValue();
        assertEquals(2, result.getResults().size());

        Response<IndexDocumentsResult> deleteResponse = client.deleteDocumentsWithResponse(hotelsToDelete, Context.NONE);
        waitForIndexing();

        assertEquals(200, deleteResponse.getStatusCode());
        result = deleteResponse.getValue();
        assertEquals(1, result.getResults().size());

        Response<IndexDocumentsResult> batchResponse = client.indexWithResponse(batch, Context.NONE);
        waitForIndexing();

        assertEquals(200, batchResponse.getStatusCode());
        result = batchResponse.getValue();
        assertEquals(4, result.getResults().size());

        Response<Document> documentResponse = client.getDocumentWithResponse("3",
            null, generateRequestOptions(), Context.NONE);
        assertEquals(200, documentResponse.getStatusCode());
        Document doc = documentResponse.getValue();
        assertEquals(4, doc.get("Rating"));

        Response<Long> countResponse = client.getDocumentCountWithResponse(Context.NONE);
        assertEquals(200, countResponse.getStatusCode());
        Long count = countResponse.getValue();
        assertEquals(4L, count.longValue());
    }

    Hotel prepareStaticallyTypedHotel(String hotelId) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return new Hotel()
            .hotelId(hotelId)
            .hotelName("Fancy Stay")
            .description("Best hotel in town if you like luxury hotels. They have an amazing infinity pool, a spa, and a really helpful concierge. The location is perfect -- right downtown, close to all the tourist attractions. We highly recommend this hotel.")
            .descriptionFr("Meilleur hôtel en ville si vous aimez les hôtels de luxe. Ils ont une magnifique piscine à débordement, un spa et un concierge très utile. L'emplacement est parfait – en plein centre, à proximité de toutes les attractions touristiques. Nous recommandons fortement cet hôtel.")
            .category("Luxury")
            .tags(Arrays.asList("pool",
                "view",
                "wifi",
                "concierge"))
            .parkingIncluded(false)
            .smokingAllowed(false)
            .lastRenovationDate(dateFormat.parse("2010-06-27T00:00:00Z"))
            .rating(5)
            .location(GeoPoint.create(47.678581, -122.131577))
            .address(
                new HotelAddress()
                    .streetAddress("1 Microsoft Way")
                    .city("Redmond")
                    .stateProvince("Washington")
                    .postalCode("98052")
                    .country("United States")
            );
    }

    Document prepareDynamicallyTypedHotel(String hotelId) {

        Document room1 = new Document();
        room1.put("Description", "Budget Room, 1 Queen Bed");
        room1.put("Description_fr", null);
        room1.put("Type", "Budget Room");
        room1.put("BaseRate", 149.99);
        room1.put("BedOptions", "1 Queen Bed");
        room1.put("SleepsCount", 2);
        room1.put("SmokingAllowed", true);
        room1.put("Tags", Arrays.asList("vcr/dvd", "great view"));

        Document room2 = new Document();
        room2.put("Description", "Budget Room, 1 King Bed");
        room2.put("Description_fr", null);
        room2.put("Type", "Budget Room");
        room2.put("BaseRate", 249.99);
        room2.put("BedOptions", "1 King Bed");
        room2.put("SleepsCount", 2);
        room2.put("SmokingAllowed", true);
        room2.put("Tags", Arrays.asList("vcr/dvd", "seaside view"));

        List<Document> rooms = Arrays.asList(room1, room2);

        Document address = new Document();
        address.put("StreetAddress", "One Microsoft way");
        address.put("City", "Redmond");
        address.put("StateProvince", "Washington");
        address.put("PostalCode", "98052");
        address.put("Country", "US");

        // TODO (alzimmer): Determine if this should be used to create the hotel document.
        Document location = new Document();
        location.put("type", "Point");
        location.put("coordinates", Arrays.asList(-122.131577, 47.678581));
        location.put("crs", null);

        Document hotel = new Document();
        hotel.put("HotelId", hotelId);
        hotel.put("HotelName", "Fancy Stay Hotel");
        hotel.put("Description", "Best hotel in town if you like luxury hotels. They have an amazing infinity pool, a spa, and a really helpful concierge. The location is perfect -- right downtown, close to all the tourist attractions. We highly recommend this hotel.");
        hotel.put("Description_fr", null);
        hotel.put("Address", address);
        hotel.put("Location", null);
        hotel.put("Category", "Luxury");
        hotel.put("Tags", Arrays.asList("pool", "view", "wifi", "concierge"));
        hotel.put("LastRenovationDate", OffsetDateTime.parse("2019-01-30T00:00:00Z"));
        hotel.put("ParkingIncluded", true);
        hotel.put("SmokingAllowed", true);
        hotel.put("Rating", 5);
        hotel.put("Rooms", rooms);

        return hotel;
    }

    void assertSuccessfulIndexResult(IndexingResult result, String key, int statusCode) {
        assertEquals(result.getKey(), key);
        assertEquals(result.getStatusCode(), statusCode);
        assertTrue(result.isSucceeded());
    }

    void assertFailedIndexResult(IndexingResult result, String key, int statusCode) {
        assertEquals(result.getKey(), key);
        assertEquals(result.getStatusCode(), statusCode);
        assertEquals(result.getErrorMessage(), "Document not found.");
        assertFalse(result.isSucceeded());
    }

    void assertIndexActionSucceeded(String key, IndexingResult result, int expectedStatusCode) {
        assertEquals(key, result.getKey());
        assertTrue(result.isSucceeded());
        assertNull(result.getErrorMessage());
        assertEquals(expectedStatusCode, result.getStatusCode());
    }

    List<Hotel> getBoundaryValues() throws ParseException {
        return Arrays.asList(
            // Minimum values
            new Hotel()
                .hotelId("1")
                .category("")
                .lastRenovationDate(DATE_FORMAT.parse("0001-01-01T00:00:00Z"))
                .location(GeoPoint.create(-90, -180))   // South pole, date line from the west
                .parkingIncluded(false)
                .rating(Integer.MIN_VALUE)
                .tags(Collections.emptyList())
                .address(new HotelAddress())
                .rooms(Collections.singletonList(
                    new HotelRoom()
                        .baseRate(Double.MIN_VALUE)
                )),
            // Maximum values
            new Hotel()
                .hotelId("2")
                .category("test")   // No meaningful string max since there is no length limit (other than payload size or term length).
                .lastRenovationDate(DATE_FORMAT.parse("9999-12-31T11:59:59Z"))
                .location(GeoPoint.create(90, 180))     // North pole, date line from the east
                .parkingIncluded(true)
                .rating(Integer.MAX_VALUE)
                .tags(Collections.singletonList("test"))    // No meaningful string max; see above.
                .address(new HotelAddress()
                    .city("Maximum"))
                .rooms(Collections.singletonList(
                    new HotelRoom()
                        .baseRate(Double.MAX_VALUE)
                )),
            // Other boundary values #1
            new Hotel()
                .hotelId("3")
                .category(null)
                .lastRenovationDate(null)
                .location(GeoPoint.create(0, 0))     // Equator, meridian
                .parkingIncluded(null)
                .rating(null)
                .tags(Collections.emptyList())
                .address(new HotelAddress()
                    .city("Maximum"))
                .rooms(Collections.singletonList(
                    new HotelRoom()
                        .baseRate(Double.NEGATIVE_INFINITY)
                )),
            // Other boundary values #2
            new Hotel()
                .hotelId("4")
                .location(null)
                .tags(Collections.emptyList())
                .rooms(Collections.singletonList(
                    new HotelRoom()
                        .baseRate(Double.POSITIVE_INFINITY)
                )),
            // Other boundary values #3
            new Hotel()
                .hotelId("5")
                .tags(Collections.emptyList())
                .rooms(Collections.singletonList(
                    new HotelRoom()
                        .baseRate(Double.NaN)
                )),
            // Other boundary values #4
            new Hotel()
                .hotelId("6")
                .category(null)
                .tags(Collections.emptyList())
                .rooms(Collections.emptyList()));
    }
}
