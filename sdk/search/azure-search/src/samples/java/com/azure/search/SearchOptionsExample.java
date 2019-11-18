// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search;

import com.azure.core.util.Configuration;
import com.azure.search.common.SearchPagedResponse;
import com.azure.search.models.FacetResult;
import com.azure.search.models.RequestOptions;
import com.azure.search.models.SearchOptions;
import com.azure.search.models.SearchResult;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * This example shows how to work with {@link SearchOptions} while performing searches
 * <p>
 * This sample is based on the hotels-sample index available to install from the portal.
 * See https://docs.microsoft.com/en-us/azure/search/search-get-started-portal
 * </p>
 */
public class SearchOptionsExample {

    /**
     * From the Azure portal, get your Azure Cognitive Search service URL and API key,
     * and set the values of these environment variables:
     */
    private static final String ENDPOINT = Configuration.getGlobalConfiguration().get("AZURE_SEARCH_ENDPOINT");
    private static final String API_KEY = Configuration.getGlobalConfiguration().get("AZURE_SEARCH_API_KEY");

    public static void main(String[] args) {
        SearchIndexAsyncClient searchClient = new SearchIndexClientBuilder()
            .endpoint(ENDPOINT)
            .credential(new ApiKeyCredentials(API_KEY))
            .indexName("hotels")
            .buildAsyncClient();


        List<SearchResult> results = searchClient
            .search("search text")
            .log()
            .doOnSubscribe(ignoredVal -> System.out.println("Subscribed to paged flux processing items"))
            .doOnNext(item -> System.out.println("Processing item " + item))
            .doOnComplete(() -> System.out.println("Completed processing"))
            .collectList().block();

        Stream<SearchPagedResponse> pagedResults = searchClient.search("search text")
            .byPage().toStream();


        //Accessing Count property when iterating by page
        searchClient.search("search text",
            new SearchOptions().setIncludeTotalResultCount(true),
            new RequestOptions())
            .byPage()
            .map(page -> ((SearchPagedResponse) page).count())
            .toStream();

        //Getting just the count property
        Flux<Long> count = searchClient.search("search text",
            new SearchOptions().setIncludeTotalResultCount(true),
            new RequestOptions())
            .byPage()
            .take(1)
            .map(page -> ((SearchPagedResponse) page).count());


        //Accessing Coverage property when iterating by page
        searchClient.search("search text",
            new SearchOptions().setMinimumCoverage(73.5),
            new RequestOptions())
            .byPage()
            .map(page -> ((SearchPagedResponse) page).coverage())
            .toStream();

        //Getting just the Coverage property
        Flux<Double> coverage = searchClient.search("search text",
            new SearchOptions().setMinimumCoverage(73.5),
            new RequestOptions())
            .byPage()
            .take(1)
            .map(page -> ((SearchPagedResponse) page).coverage());

        //Accessing Facets property when iterating by page
        searchClient.search("search text",
            new SearchOptions().setFacets("Rooms/BaseRate,values:5|8|10",
                "LastRenovationDate,values:2000-01-01T00:00:00Z"),
            new RequestOptions())
            .byPage()
            .map(page -> ((SearchPagedResponse) page).facets())
            .toStream();

        //Getting just the Facets property
        Flux<Map<String, List<FacetResult>>> facets = searchClient.search("search text",
            new SearchOptions().setFacets("Rooms/BaseRate,values:5|8|10",
                "LastRenovationDate,values:2000-01-01T00:00:00Z"),
            new RequestOptions())
            .byPage()
            .take(1)
            .map(page -> ((SearchPagedResponse) page).facets());
    }
}
