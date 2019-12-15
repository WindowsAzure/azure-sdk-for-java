// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.rest;

import com.azure.core.http.HttpRequest;

import java.util.stream.Collectors;

import com.azure.core.util.paging.PageRetriever;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * This type is a Flux provides the ability to operate on paginated REST response of type {@link PagedResponse}
 * and individual items in such pages. When processing the response by page, each response will contain the items
 * in the page as well as the REST response details like status code and headers.
 *
 * <p>To process one item at a time, simply subscribe to this flux as shown below </p>
 * <p><strong>Code sample</strong></p>
 * {@codesnippet com.azure.core.http.rest.pagedflux.items}
 *
 * <p>To process one page at a time, use {@link #byPage()} method as shown below </p>
 * <p><strong>Code sample</strong></p>
 * {@codesnippet com.azure.core.http.rest.pagedflux.pages}
 *
 * <p>To process items one page at a time starting from any page associated with a continuation token,
 * use {@link #byPage(String)} as shown below</p>
 * <p><strong>Code sample</strong></p>
 * {@codesnippet com.azure.core.http.rest.pagedflux.pagesWithContinuationToken}
 *
 * @param <T> The type of items in a {@link PagedResponse}
 *
 * @see PagedResponse
 * @see Page
 * @see Flux
 */
public class PagedFlux<T> extends PagedFluxBase<T, PagedResponse<T>> {
    /**
     * Creates an instance of {@link PagedFlux} that consists of only a single page.
     * This constructor takes a {@code Supplier} that return the single page of {@code T}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedflux.singlepage.instantiation}
     *
     * @param firstPageRetriever Supplier that retrieves the first page.
     */
    public PagedFlux(Supplier<Mono<PagedResponse<T>>> firstPageRetriever) {
        this(firstPageRetriever, token -> Mono.empty());
    }

    /**
     * Creates an instance of {@link PagedFlux}. The constructor takes a {@code Supplier} and
     * {@code Function}. The {@code Supplier} returns the first page of {@code T},
     * the {@code Function} retrieves subsequent pages of {@code T}.
     *
     * <p><strong>Code sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedflux.instantiation}
     *
     * @param firstPageRetriever Supplier that retrieves the first page
     * @param nextPageRetriever Function that retrieves the next page given a continuation token
     */
    public PagedFlux(Supplier<Mono<PagedResponse<T>>> firstPageRetriever,
                     Function<String, Mono<PagedResponse<T>>> nextPageRetriever) {
        this(() -> (continuationToken, pageSize) -> continuationToken == null
            ? firstPageRetriever.get().flux()
            : nextPageRetriever.apply(continuationToken).flux(), true);
    }

    /**
     * PRIVATE CONSTRUCTOR. SEE BELOW NOTES.
     *
     * Create PagedFlux backed by Page Retriever Function Supplier.
     *
     * @param provider the Page Retrieval Provider
     * @param ignored param is ignored, exists in signature only to avoid conflict with first ctr
     */
    // NOTES: Proposal for azure-core-v2:
    //
    // 1. Remove the first ctr "PagedFlux(Supplier<Mono<PagedResponse<T>>>)".
    // 2. Add a new ctr        "PagedFlux(Supplier<PageRetriever<String, PagedResponse<T>>>)".
    // 3. Remove the factory method "PagedFlux::create" and this PRIVATE ctr in favour of #2.
    //
    private PagedFlux(Supplier<PageRetriever<String, PagedResponse<T>>> provider, boolean ignored) {
        super(provider, ignored);
    }

    /**
     * Creates an instance of {@link PagedFlux} backed by a Page Retriever Function Supplier.
     * When invoked supplier should provide Page Retriever Function which accepts continuation token.
     * The provider will be called for each Subscription to the PagedFlux instance. The Page Retriever
     * Function can get called multiple times in serial fashion, each time after the completion of the Flux
     * returned from the previous invocation. The final completion signal will be send to the Subscriber
     * when the last Page emitted by the Flux returned by Page Continuation Function has {@code null}
     * continuation token.
     *
     * The provider is useful mainly in two scenarios:
     * 1. To manage state across multiple call to Page Retrieval Function within the same Subscription
     * 2. To decorate a PagedFlux to produce new PagedFlux
     *
     * <p><strong>Decoration sample</strong></p>
     * {@codesnippet com.azure.core.http.rest.pagedflux.create.decoration}
     *
     * @param provider the Page Retrieval Provider
     * @param <T> The type of items in a {@link PagedResponse}
     * @return PagedFlux backed by the Page Retriever Function Supplier
     */
    public static <T> PagedFlux<T> create(Supplier<PageRetriever<String, PagedResponse<T>>> provider) {
        return new PagedFlux<>(provider, true);
    }

    /**
     * Maps this PagedFlux instance of T to a PagedFlux instance of type S as per the provided mapper
     * function.
     *
     * @param mapper The mapper function to convert from type T to type S.
     * @param <S> The mapped type.
     * @return A PagedFlux of type S.
     * @deprecated refer the decoration samples for {@link PagedFlux#create(Supplier)}.
     */
    @Deprecated
    public <S> PagedFlux<S> mapPage(Function<T, S> mapper) {
        Supplier<PageRetriever<String, PagedResponse<S>>> provider = () -> (continuationToken, pageSize) -> {
            Flux<PagedResponse<T>> flux = (continuationToken == null)
                ? byPage()
                : byPage(continuationToken);
            return flux
                .map(mapPagedResponse(mapper));
        };
        return PagedFlux.create(provider);
    }

    private <S> Function<PagedResponse<T>, PagedResponse<S>> mapPagedResponse(Function<T, S> mapper) {
        return pagedResponse -> new PagedResponseBase<HttpRequest, S>(pagedResponse.getRequest(),
            pagedResponse.getStatusCode(),
            pagedResponse.getHeaders(),
            pagedResponse.getValue().stream().map(mapper).collect(Collectors.toList()),
            pagedResponse.getContinuationToken(),
            null);
    }
}
