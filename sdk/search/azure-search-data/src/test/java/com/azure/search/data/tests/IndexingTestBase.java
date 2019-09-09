// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search.data.tests;

import com.azure.search.data.customization.Document;
import com.azure.search.data.env.SearchIndexClientTestBase;
import com.azure.search.data.customization.models.GeoPoint;
import com.azure.search.data.models.Hotel;
import org.junit.Test;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public abstract class IndexingTestBase extends SearchIndexClientTestBase {
    protected static final String INDEX_NAME = "hotels";

    @Override
    protected void beforeTest() {
        super.beforeTest();
        initializeClient();
    }

    @Test
    public abstract void countingDocsOfNewIndexGivesZero();

    @Test
    public abstract void canIndexStaticallyTypedDocuments() throws Exception;

    @Test
    public abstract void canIndexDynamicDocuments() throws Exception;

    protected Hotel prepareStaticallyTypedHotel() throws ParseException {
        return new Hotel()
            .hotelId("1")
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
            .lastRenovationDate(DATE_FORMAT.parse("2019-01-30T00:00:00Z"))
            .rating(5)
            .location(GeoPoint.createWithDefaultCrs(-122.131577, 47.678581));
    }

    protected Document prepareDynamicallyTypedHotel() {

        Document room1 = new Document();
        room1.put("Description", "Budget Room, 1 Queen Bed (Cityside)");
        room1.put("Description_fr", null);
        room1.put("Type", "Budget Room");
        room1.put("BaseRate", 149.99);
        room1.put("BedOptions", "1 Queen Bed");
        room1.put("SleepsCount", 2);
        room1.put("SmokingAllowed", true);
        room1.put("Tags", Arrays.asList("vcr/dvd", "great view"));

        Document room2 = new Document();
        room2.put("Description", "Budget Room, 1 King Bed (Seattle)");
        room2.put("Description_fr", null);
        room2.put("Type", "Budget Room");
        room2.put("BaseRate", 249.99);
        room2.put("BedOptions", "1 King Bed");
        room2.put("SleepsCount", 2);
        room2.put("SmokingAllowed", true);
        room2.put("Tags", Arrays.asList("vcr/dvd", "seaside view"));

        List<Document> rooms = Arrays.asList(room1, room2);

        Document address = new Document();
        address.put("StreetAddress", "");
        address.put("City", "");
        address.put("StateProvince", "");
        address.put("PostalCode", "");
        address.put("Country", "");

        Document hotel = new Document();
        hotel.put("HotelId", "1");
        hotel.put("HotelName", "Fancy Stay Hotel");
        hotel.put("Description", "Best hotel in town if you like luxury hotels. They have an amazing infinity pool, a spa, and a really helpful concierge. The location is perfect -- right downtown, close to all the tourist attractions. We highly recommend this hotel.");
        hotel.put("Description_fr", null);
        hotel.put("Address", address);
        hotel.put("Location", null);
        hotel.put("Category", "Luxury");
        hotel.put("Tags", Arrays.asList("pool", "view", "wifi", "concierge"));
        hotel.put("LastRenovationDate", "2019-01-30T00:00:00Z");
        hotel.put("ParkingIncluded", true);
        hotel.put("SmokingAllowed", true);
        hotel.put("Rating", 5);
        hotel.put("Rooms", rooms);

        return hotel;
    }

    protected abstract void initializeClient();
}
