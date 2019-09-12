// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search.data.tests;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.search.data.SearchIndexClient;
import com.azure.search.data.generated.models.SuggestParameters;
import com.azure.search.data.generated.models.SuggestResult;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static com.azure.search.data.tests.SearchTestBase.HOTELS_DATA_JSON;
import static com.azure.search.data.tests.SearchTestBase.HOTELS_INDEX_NAME;

public class SuggestSyncTests extends SuggestTestBase {

    private SearchIndexClient client;

    @Override
    protected void initializeClient() {
        client = builderSetup().indexName(HOTELS_INDEX_NAME).buildClient();
    }

    @Test
    public void canSuggestDynamicDocuments() {
        uploadDocumentsJson(client, HOTELS_INDEX_NAME, HOTELS_DATA_JSON);
        SuggestParameters suggestParams = new SuggestParameters();
        suggestParams.orderBy(new LinkedList<>(Arrays.asList("HotelId")));

        PagedIterable<SuggestResult> suggestResult = client.suggest("more", "sg", suggestParams, null);
        Iterator<PagedResponse<SuggestResult>> iterator = suggestResult.iterableByPage().iterator();

        verifyDynamicDocumentSuggest(iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void searchFieldsExcludesFieldsFromSuggest()  {
        uploadDocumentsJson(client, HOTELS_INDEX_NAME, HOTELS_DATA_JSON);
        SuggestParameters suggestParams = new SuggestParameters();
        suggestParams.searchFields(new LinkedList<>(Arrays.asList("HotelName")));

        PagedIterable<SuggestResult> suggestResult = client.suggest("luxury", "sg", suggestParams, null);
        Iterator<PagedResponse<SuggestResult>> iterator = suggestResult.iterableByPage().iterator();

        verifyFieldsExcludesFieldsSuggest(iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void canUseSuggestHitHighlighting() {
        uploadDocumentsJson(client, HOTELS_INDEX_NAME, HOTELS_DATA_JSON);
        SuggestParameters suggestParams = new SuggestParameters();
        suggestParams.highlightPreTag("<b>");
        suggestParams.highlightPostTag("</b>");
        suggestParams.filter("Category eq 'Luxury'");
        suggestParams.top(1);

        PagedIterable<SuggestResult> suggestResult = client.suggest("hotel", "sg", suggestParams, null);
        Iterator<PagedResponse<SuggestResult>> iterator = suggestResult.iterableByPage().iterator();

        verifyHitHighlightingSuggest(iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void canGetFuzzySuggestions() {
        uploadDocumentsJson(client, HOTELS_INDEX_NAME, HOTELS_DATA_JSON);
        SuggestParameters suggestParams = new SuggestParameters();
        suggestParams.useFuzzyMatching(true);

        PagedIterable<SuggestResult> suggestResult = client.suggest("hitel", "sg", suggestParams, null);
        Iterator<PagedResponse<SuggestResult>> iterator = suggestResult.iterableByPage().iterator();

        verifyFuzzySuggest(iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Override
    public void canSuggestStaticallyTypedDocuments() {
        List<Map<String, Object>> hotels = uploadDocumentsJson(client, HOTELS_INDEX_NAME, HOTELS_DATA_JSON);
        //arrange
        SuggestParameters suggestParams = new SuggestParameters();
        suggestParams.orderBy(new LinkedList<>(Arrays.asList("HotelId")));

        //act
        PagedIterable<SuggestResult> suggestResult = client.suggest("more", "sg", suggestParams, null);
        Iterator<PagedResponse<SuggestResult>> iterator = suggestResult.iterableByPage().iterator();

        //assert
        verifyCanSuggestStaticallyTypedDocuments(iterator.next(), hotels);
    }
}
