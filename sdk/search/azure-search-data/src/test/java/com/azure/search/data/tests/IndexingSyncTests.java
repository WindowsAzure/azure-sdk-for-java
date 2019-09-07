// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search.data.tests;

import com.azure.search.data.SearchIndexClient;
import com.azure.search.data.generated.models.*;
import com.azure.search.data.helpers.EntityMapper;
import com.azure.search.data.models.Hotel;
import org.junit.Assert;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class IndexingSyncTests extends IndexingTestBase {
    private SearchIndexClient client;

    @Override
    public void countingDocsOfNewIndexGivesZero() {
        Long actual = client.countDocuments();
        Long expected = 0L;

        Assert.assertEquals(expected, actual);
    }

    @Override
    public void indexDoesNotThrowWhenAllActionsSucceed() {
        String expectedHotelId = "1";
        Long expectedHotelCount = 1L;

        List<IndexAction> indexActions = new LinkedList<>();
        Hotel myHotel = new Hotel().hotelId("1");
        Map<String, Object> hotelMap = new EntityMapper<Hotel>().objectToMap(myHotel);

        indexActions.add(new IndexAction().actionType(IndexActionType.UPLOAD).additionalProperties(hotelMap));
        List<IndexingResult> result = indexDocumentsSync(indexActions);

        Assert.assertEquals(expectedHotelCount, client.countDocuments());
        this.AssertIndexActionSucceeded(expectedHotelId, result.get(0), 201);
    }

    protected List<IndexingResult> indexDocumentsSync(List<IndexAction> indexActions) {
        IndexBatch indexBatch = new IndexBatch().actions(indexActions);
        DocumentIndexResult indexResult = client.index(indexBatch);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Assert.fail(e.getMessage());
        }

        return indexResult.results();
    }

    @Override
    protected void initializeClient() {
        client = builderSetup().indexName(INDEX_NAME).buildClient();
    }
}
