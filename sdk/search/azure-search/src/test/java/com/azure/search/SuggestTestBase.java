// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import com.azure.core.exception.HttpResponseException;
import com.azure.search.common.SuggestPagedResponse;
import com.azure.search.common.jsonwrapper.JsonWrapper;
import com.azure.search.common.jsonwrapper.api.JsonApi;
import com.azure.search.common.jsonwrapper.jacksonwrapper.JacksonDeserializer;
import com.azure.search.models.SuggestResult;
import com.azure.search.test.environment.models.Hotel;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public abstract class SuggestTestBase extends SearchIndexClientTestBase {
    protected JsonApi jsonApi = JsonWrapper.newInstance(JacksonDeserializer.class);
    static final String BOOKS_INDEX_JSON = "BooksIndexData.json";
    protected static final String BOOKS_INDEX_NAME = "books";

    @Override
    protected void beforeTest() {
        super.beforeTest();
    }

    protected void verifyFuzzySuggest(SuggestPagedResponse suggestResultPagedResponse) {
        Assert.assertNotNull(suggestResultPagedResponse);
        Assert.assertEquals(5, suggestResultPagedResponse.getValue().size());
    }

    protected void verifyHitHighlightingSuggest(SuggestPagedResponse suggestResultPagedResponse) {
        Assert.assertNotNull(suggestResultPagedResponse);
        Assert.assertEquals(1, suggestResultPagedResponse.getValue().size());
        Assert.assertTrue(
            suggestResultPagedResponse.getValue()
                .get(0)
                .getText()
                .startsWith("Best <b>hotel</b> in town"));
    }

    protected void verifyFieldsExcludesFieldsSuggest(SuggestPagedResponse suggestResultPagedResponse) {
        Assert.assertNotNull(suggestResultPagedResponse);
        Assert.assertEquals(0, suggestResultPagedResponse.getValue().size());
    }

    protected void verifyDynamicDocumentSuggest(SuggestPagedResponse suggestResultPagedResponse) {
        Assert.assertNotNull(suggestResultPagedResponse);
        Assert.assertEquals(2, suggestResultPagedResponse.getValue().size());
        Hotel hotel = suggestResultPagedResponse.getValue().get(0).getAdditionalProperties().as(Hotel.class);
        Assert.assertEquals("10", hotel.hotelId());
    }

    protected void verifyCanSuggestStaticallyTypedDocuments(SuggestPagedResponse suggestResultPagedResponse, List<Map<String, Object>> expectedHotels) {
        //sanity
        Assert.assertNotNull(suggestResultPagedResponse);
        List<Document> docs = suggestResultPagedResponse.getValue()
            .stream()
            .map(SuggestResult::getAdditionalProperties)
            .collect(Collectors.toList());
        List<SuggestResult> hotelsList = suggestResultPagedResponse.getValue();
        List<Hotel> expectedHotelsList = expectedHotels.stream().map(hotel ->
            jsonApi.convertObjectToType(hotel, Hotel.class))
            .filter(h -> h.hotelId().equals("10") || h.hotelId().equals("8"))
            .sorted(Comparator.comparing(Hotel::hotelId)).collect(Collectors.toList());

        //assert
        //verify fields
        Assert.assertEquals(2, docs.size());
        Assert.assertEquals(hotelsList.stream().map(SuggestResult::getText).collect(Collectors.toList()),
            expectedHotelsList.stream().map(Hotel::description).collect(Collectors.toList()));
    }

    protected void verifyFuzzyIsOffByDefault(SuggestPagedResponse suggestResultPagedResponse) {

        Assert.assertNotNull(suggestResultPagedResponse);
        Assert.assertEquals(0, suggestResultPagedResponse.getValue().size());
    }

    protected void verifySuggestThrowsWhenGivenBadSuggesterName(Throwable error) {
        assertEquals(HttpResponseException.class, error.getClass());
        assertEquals(HttpResponseStatus.BAD_REQUEST.code(),
            ((HttpResponseException) error).getResponse().getStatusCode());
        assertTrue(error.getMessage().contains("The specified suggester name 'Suggester does not exist' does not exist in this index definition."));
    }

    protected void verifySuggestThrowsWhenRequestIsMalformed(Throwable error) {
        assertEquals(HttpResponseException.class, error.getClass());
        assertEquals(HttpResponseStatus.BAD_REQUEST.code(),
            ((HttpResponseException) error).getResponse().getStatusCode());
        assertTrue(error.getMessage().contains("Invalid expression: Syntax error at position 7 in 'This is not a valid orderby.'"));
    }

    protected void verifyMinimumCoverage(SuggestPagedResponse suggestResultPagedResponse) {

        Assert.assertNotNull(suggestResultPagedResponse);
        Assert.assertEquals(new Double(100), suggestResultPagedResponse.coverage());
    }

    protected void verifyTopDocumentSuggest(SuggestPagedResponse suggestResultPagedResponse) {
        Assert.assertNotNull(suggestResultPagedResponse);
        Assert.assertEquals(3, suggestResultPagedResponse.getValue().size());
        List<String> resultIds = suggestResultPagedResponse
            .getValue()
            .stream()
            .map(hotel -> hotel.getAdditionalProperties().as(Hotel.class).hotelId())
            .collect(Collectors.toList());

        Assert.assertEquals(Arrays.asList("1", "10", "2"), resultIds);
    }

    protected void verifyCanSuggestWithDateTimeInStaticModel(SuggestPagedResponse suggestResultPagedResponse) {
        List<SuggestResult> books = suggestResultPagedResponse.getValue();
        List<Document> docs = suggestResultPagedResponse.getValue()
            .stream()
            .map(SuggestResult::getAdditionalProperties)
            .collect(Collectors.toList());

        Assert.assertEquals(1, docs.size());
        Assert.assertEquals("War and Peace", books.get(0).getText());
    }

    @Test
    public abstract void canSuggestDynamicDocuments() throws Exception;

    @Test
    public abstract void searchFieldsExcludesFieldsFromSuggest() throws Exception;

    @Test
    public abstract void canUseSuggestHitHighlighting() throws Exception;

    @Test
    public abstract void canGetFuzzySuggestions() throws Exception;

    @Test
    public abstract void canSuggestStaticallyTypedDocuments();

    @Test
    public abstract void canSuggestWithDateTimeInStaticModel() throws Exception;

    @Test
    public abstract void fuzzyIsOffByDefault();

    @Test
    public abstract void suggestThrowsWhenGivenBadSuggesterName() throws Exception;

    @Test
    public abstract void suggestThrowsWhenRequestIsMalformed() throws Exception;

    @Test
    public abstract void testCanSuggestWithMinimumCoverage() throws Exception;

    @Test
    public abstract void testTopTrimsResults();

    @Test
    public abstract void testCanFilter();

    @Test
    public abstract void testOrderByProgressivelyBreaksTies();
}
