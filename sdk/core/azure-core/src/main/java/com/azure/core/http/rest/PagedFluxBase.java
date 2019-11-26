// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.rest;

import com.azure.core.util.paging.SimplePagedFlux;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * This class is a flux that can operate on any type that extends {@link PagedResponse} and
 * also provides the ability to operate on individual items. When processing the response by page,
 * each response will contain the items in the page as well as the request details like
 * status code and headers.
 *
 * <p><strong>Process each item in Flux</strong></p>
 * <p>To process one item at a time, simply subscribe to this Flux.</p>
 * {@codesnippet com.azure.core.http.rest.pagedfluxbase.items}
 *
 * <p><strong>Process one page at a time</strong></p>
 * <p>To process one page at a time, starting from the beginning, use {@link #byPage() byPage()} method.</p>
 * {@codesnippet com.azure.core.http.rest.pagedfluxbase.pages}
 *
 * <p><strong>Process items starting from a continuation token</strong></p>
 * <p>To process items one page at a time starting from any page associated with a continuation token, use
 * {@link #byPage(String)}.</p>
 * {@codesnippet com.azure.core.http.rest.pagedfluxbase.pagesWithContinuationToken}
 *
 * @param <T> The type of items in {@code P}.
 * @param <P> The {@link PagedResponse} holding items of type {@code T}.
 *
 * @see PagedResponse
 * @see Page
 * @see Flux
 */
public class PagedFluxBase<T, P extends PagedResponse<T>> extends SimplePagedFlux<T, P> {
    /**
     * Creates an instance of {@link PagedFluxBase} that consists of only a single page of results.
     * The only argument to this constructor therefore is a supplier that fetches the first
     * (and known-only) page from {@code P}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedfluxbase.singlepage.instantiation}
     *
     * @param firstPageRetriever Supplier that retrieves the first page
     */
    public PagedFluxBase(Supplier<Mono<P>> firstPageRetriever) {
        this(firstPageRetriever, token -> Mono.empty());
    }

    /**
     * Creates an instance of {@link PagedFluxBase}. The constructor takes in two arguments. The first
     * argument is a supplier that fetches the first page from {@code P}. The second argument is a
     * function that fetches subsequent pages from {@code P}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedfluxbase.instantiation}
     *
     * @param firstPageRetriever Supplier that retrieves the first page
     * @param nextPageRetriever Function that retrieves the next page given a continuation token
     */
    public PagedFluxBase(Supplier<Mono<P>> firstPageRetriever,
                         Function<String, Mono<P>> nextPageRetriever) {
        super((continuationToken) -> continuationToken == null
                ? firstPageRetriever.get().flux()
                : nextPageRetriever.apply(continuationToken).flux());
    }

    /**
     * Creates a flux of {@link PagedResponse} starting from the first page.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedfluxbase.bypage}
     *
     * @return A {@link PagedFluxBase} starting from the first page
     */
    public Flux<P> byPage() {
        return super.byPage();
    }

    /**
     * Creates a flux of {@link PagedResponse} starting from the next page associated with the given
     * continuation token. To start from first page, use {@link #byPage()} instead.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedfluxbase.bypage#String}
     *
     * @param continuationToken The continuation token used to fetch the next page
     * @return A {@link PagedFluxBase} starting from the page associated with the continuation token
     */
    public Flux<P> byPage(String continuationToken) {
        return super.byPage(continuationToken);
    }

    /**
     * Subscribe to consume all items of type {@code T} in the sequence respectively.
     * This is recommended for most common scenarios. This will seamlessly fetch next
     * page when required and provide with a {@link Flux} of items.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedfluxbase.subscribe}
     *
     * @param coreSubscriber The subscriber for this {@link PagedFluxBase}
     */
    @Override
    public void subscribe(CoreSubscriber<? super T> coreSubscriber) {
        super.subscribe(coreSubscriber);
    }
}
