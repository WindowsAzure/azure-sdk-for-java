// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.search.models.RequestOptions;
import com.azure.search.models.SynonymMap;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.Assert;

import java.util.UUID;
import java.util.List;
import java.util.stream.Collectors;


public class SynonymMapSyncTests extends SynonymMapTestBase {
    private SearchServiceClient client;

    @Override
    protected void beforeTest() {
        super.beforeTest();
        client = getSearchServiceClientBuilder().buildClient();
    }

    @Override
    public void createSynonymMapReturnsCorrectDefinition() {
        SynonymMap expectedSynonymMap = createTestSynonymMap();
        SynonymMap actualSynonymMap = client.createSynonymMap(expectedSynonymMap);

        assertSynonymMapsEqual(expectedSynonymMap, actualSynonymMap);
    }

    @Override
    public void createSynonymMapFailsWithUsefulMessageOnUserError() {
        SynonymMap expectedSynonymMap = createTestSynonymMap();
        // Set invalid Synonym
        expectedSynonymMap.setSynonyms("a => b => c");

        try {
            client.createSynonymMap(expectedSynonymMap);
            Assert.fail("createSynonymMap did not throw an expected Exception");
        } catch (Exception ex) {
            Assert.assertEquals(HttpResponseException.class, ex.getClass());
            Assert.assertEquals(HttpResponseStatus.BAD_REQUEST.code(), ((HttpResponseException) ex).getResponse().getStatusCode());
            Assert.assertTrue(ex.getMessage().contains("Syntax error in line 1: 'a => b => c'. "
                    + "Only one explicit mapping (=>) can be specified in a synonym rule."));
        }
    }

    @Override
    public void getSynonymMapReturnsCorrectDefinition() {

    }

    @Override
    public void getSynonymMapThrowsOnNotFound() {

    }

    @Override
    public void canUpdateSynonymMap() {

    }

    @Override
    public void createOrUpdateCreatesWhenSynonymMapDoesNotExist() {

    }

    @Override
    public void createOrUpdateSynonymMapIfNotExistsFailsOnExistingResource() {

    }

    @Override
    public void createOrUpdateSynonymMapIfNotExistsSucceedsOnNoResource() {

    }

    @Override
    public void updateSynonymMapIfExistsSucceedsOnExistingResource() {

    }

    @Override
    public void updateSynonymMapIfExistsFailsOnNoResource() {

    }

    @Override
    public void updateSynonymMapIfNotChangedSucceedsWhenResourceUnchanged() {

    }

    @Override
    public void updateSynonymMapIfNotChangedFailsWhenResourceChanged() {

    }

    @Override
    public void deleteSynonymMapIfNotChangedWorksOnlyOnCurrentResource() {

    }

    @Override
    public void deleteSynonymMapIfExistsWorksOnlyWhenResourceExists() {

    }

    @Override
    public void deleteSynonymMapIsIdempotent() {

    }

    @Override
    public void canCreateAndListSynonymMaps() {
        SynonymMap synonymMap1 = createTestSynonymMap();
        SynonymMap synonymMap2 = createTestSynonymMap().setName("test-synonym1");

        client.createSynonymMap(synonymMap1);
        client.createSynonymMap(synonymMap2);

        PagedIterable<SynonymMap> listResponse = client.listSynonymMaps();
        List<SynonymMap> result = listResponse.stream().collect(Collectors.toList());

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(synonymMap1.getName(), result.get(0).getName());
        Assert.assertEquals(synonymMap2.getName(), result.get(1).getName());

        RequestOptions requestOptions = new RequestOptions()
            .setClientRequestId(UUID.randomUUID());

        listResponse = client.listSynonymMaps("name", requestOptions);
        result = listResponse.stream().collect(Collectors.toList());

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(synonymMap1.getName(), result.get(0).getName());
        Assert.assertEquals(synonymMap2.getName(), result.get(1).getName());
    }

    @Override
    public void canListSynonymMapsWithSelectedField() {
        SynonymMap synonymMap1 = createTestSynonymMap();
        SynonymMap synonymMap2 = createTestSynonymMap().setName("test-synonym1");

        client.createSynonymMap(synonymMap1);
        client.createSynonymMap(synonymMap2);

        PagedIterable<SynonymMap> listResponse = client.listSynonymMaps("name");
        List<SynonymMap> result = listResponse.stream().collect(Collectors.toList());

        result.forEach(res -> {
            Assert.assertNotNull(res.getName());
            Assert.assertNull(res.getSynonyms());
            Assert.assertNull(res.getETag());
        });

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(synonymMap1.getName(), result.get(0).getName());
        Assert.assertEquals(synonymMap2.getName(), result.get(1).getName());
    }

    @Override
    public void existsReturnsTrueForExistingSynonymMap() {

    }

    @Override
    public void existsReturnsFalseForNonExistingSynonymMap() {

    }
}
