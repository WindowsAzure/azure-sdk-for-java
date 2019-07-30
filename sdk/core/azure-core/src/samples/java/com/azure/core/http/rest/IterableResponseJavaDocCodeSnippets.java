// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.rest;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpRequest;
import com.azure.core.implementation.http.PagedResponseBase;
import io.netty.handler.codec.http.HttpResponseStatus;
import reactor.core.publisher.Flux;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Code snippets for {@link IterableResponse}
 */
public class IterableResponseJavaDocCodeSnippets {

    public void streamSnippet() throws MalformedURLException {
        HttpHeaders httpHeaders = new HttpHeaders().put("header1", "value1")
            .put("header2", "value2");
        HttpRequest httpRequest = new HttpRequest(HttpMethod.GET, new URL("http://localhost"));

        String deserializedHeaders = "header1,value1,header2,value2";

        IterableResponse<PagedResponseBase<String, Integer>> myIterableResponse =
            new IterableResponse<>(Flux.just(createPagedResponse(httpRequest, httpHeaders, deserializedHeaders, 1, 3)));

        // BEGIN: com.azure.core.http.rest.stream
        // process the stream
        myIterableResponse.stream().forEach(resp -> {
            if (resp.statusCode() == HttpResponseStatus.OK.code()) {
                System.out.printf("Response headers are %s. Url %s \n", resp.deserializedHeaders(), resp.request().url());
                resp.items().forEach( value -> {
                    System.out.printf("Response value is %d \n", value);
                });
            }else {
                System.out.printf("Failed with status is %d and url is %s\n", resp.statusCode(), resp.request().url());
            }
        });
        // END: com.azure.core.http.rest.stream
    }


    public void iteratorSnippet() throws MalformedURLException {
        HttpHeaders httpHeaders = new HttpHeaders().put("header1", "value1")
            .put("header2", "value2");
        HttpRequest httpRequest = new HttpRequest(HttpMethod.GET, new URL("http://localhost"));

        String deserializedHeaders = "header1,value1,header2,value2";

        IterableResponse<PagedResponseBase<String, Integer>> myIterableResponse =
            new IterableResponse<>(Flux.just(createPagedResponse(httpRequest, httpHeaders, deserializedHeaders, 1, 3)));

        // BEGIN: com.azure.core.http.rest.iterator
        // Iterate over iterator
        Iterator<PagedResponseBase<String, Integer>> ite = myIterableResponse.iterator();
        while(ite.hasNext()) {
            PagedResponseBase<String, Integer> resp = ite.next();
            if (resp.statusCode() == HttpResponseStatus.OK.code()) {
                System.out.printf("Response headers are %s. Url %s \n", resp.deserializedHeaders(), resp.request().url());
                resp.items().forEach( value -> {
                    System.out.printf("Response value is %d \n", value);
                });
            }else {
                System.out.printf("Failed with status is %d and url is %s\n", resp.statusCode(), resp.request().url());
            }
        }
        // END: com.azure.core.http.rest.iterator
    }

    private PagedResponseBase<String, Integer> createPagedResponse(HttpRequest httpRequest,
                                                                   HttpHeaders httpHeaders, String deserializedHeaders, int i, int noOfPages) {
        return new PagedResponseBase<>(httpRequest, HttpResponseStatus.OK.code(),
            httpHeaders,
            getItems(i),
            i < noOfPages - 1 ? String.valueOf(i + 1) : null,
            deserializedHeaders);
    }

    private List<Integer> getItems(Integer i) {
        return IntStream.range(i * 3, i * 3 + 3).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) throws Exception{
        IterableResponseJavaDocCodeSnippets x =  new IterableResponseJavaDocCodeSnippets();
        x.iteratorSnippet();
    }
}
