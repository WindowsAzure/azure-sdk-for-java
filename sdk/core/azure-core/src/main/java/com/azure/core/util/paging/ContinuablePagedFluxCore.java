// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.paging;

import com.azure.core.util.IterableStream;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * The default implementation of {@link ContinuablePagedFlux}.
 *
 * This type is a Flux provides the ability to operate on pages of type {@link ContinuablePage}
 * and individual items in such pages. This type supports user-provided continuation tokens,
 * allowing for restarting from a previously-retrieved continuation token.
 *
 * The constructor takes a Page Retriever provider, that when called should return {@link PageRetriever}.
 * The provider is called for each Subscription to this Flux. Given provider is called per Subscription,
 * the provider implementation can create one or more objects to store any state and Page Retriever
 * can capture and use those objects. This indirectly associate the state objects to the Subscription.
 * The Page Retriever can get called multiple times in serial fashion, each time after the completion
 * of the Flux returned by the previous invocation. The final completion signal will be send to
 * the Subscriber when the last Page emitted by the Flux returned by the Page Retriever has {@code null}
 * continuation token.
 *
 * <p><strong>Extending PagedFluxCore for Custom Continuation Token support</strong></p>
 * {@codesnippet com.azure.core.util.paging.pagedfluxcore.continuationtoken}
 *
 * @param <T> The type of elements in a {@link ContinuablePage}
 * @param <P> The {@link ContinuablePage} holding items of type {@code T}.
 *
 * @see ContinuablePagedFlux
 * @see ContinuablePage
 */
public abstract class ContinuablePagedFluxCore<C, T, P extends ContinuablePage<C, T>>
    extends ContinuablePagedFlux<C, T, P> {
    private final Supplier<PageRetriever<C, P>> pageRetrieverProvider;
    private final int defaultPageSize;

    /**
     * Creates an instance of {@link ContinuablePagedFluxCore}.
     *
     * @param pageRetrieverProvider a provider that returns {@link PageRetriever}.
     */
    protected ContinuablePagedFluxCore(Supplier<PageRetriever<C, P>> pageRetrieverProvider) {
        this.pageRetrieverProvider = Objects.requireNonNull(pageRetrieverProvider,
            "'pageRetrieverProvider' function cannot be null.");
        this.defaultPageSize = -1;
    }

    /**
     * Creates an instance of {@link ContinuablePagedFluxCore}.
     *
     * @param pageRetrieverProvider a provider that returns {@link PageRetriever}.
     * @param defaultPageSize the default preferred page size
     */
    protected ContinuablePagedFluxCore(Supplier<PageRetriever<C, P>> pageRetrieverProvider, int defaultPageSize) {
        this.pageRetrieverProvider = Objects.requireNonNull(pageRetrieverProvider,
            "'pageRetrieverProvider' function cannot be null.");
        if (defaultPageSize <= 0) {
            throw new IllegalArgumentException("defaultPageSize > 0 required but provided: " + defaultPageSize);
        }
        this.defaultPageSize = defaultPageSize;
    }

    /**
     * @return the page size configured for this {@link ContinuablePagedFluxCore}, -1 if unspecified.
     */
    public int getDefaultPageSize() {
        return this.defaultPageSize;
    }

    @Override
    public Flux<P> byPage() {
        return byPage(this.pageRetrieverProvider, null, this.defaultPageSize);
    }

    @Override
    public Flux<P> byPage(C continuationToken) {
        if (continuationToken == null) {
            return Flux.empty();
        }
        return byPage(this.pageRetrieverProvider, continuationToken, this.defaultPageSize);
    }

    @Override
    public Flux<P> byPage(int preferredPageSize) {
        if (preferredPageSize <= 0) {
            return Flux.error(new IllegalArgumentException("preferredPageSize > 0 required but provided: "
                + preferredPageSize));
        }
        return byPage(this.pageRetrieverProvider, null, preferredPageSize);
    }

    @Override
    public Flux<P> byPage(C continuationToken, int preferredPageSize) {
        if (preferredPageSize <= 0) {
            return Flux.error(new IllegalArgumentException("preferredPageSize > 0 required but provided: "
                + preferredPageSize));
        }
        if (continuationToken == null) {
            return Flux.empty();
        }
        return byPage(this.pageRetrieverProvider, continuationToken, preferredPageSize);
    }

    /**
     * Subscribe to consume all items of type {@code T} in the sequence respectively.
     * This is recommended for most common scenarios. This will seamlessly fetch next
     * page when required and provide with a {@link Flux} of items.
     *
     * @param coreSubscriber The subscriber for this {@link ContinuablePagedFluxCore}
     */
    @Override
    public void subscribe(CoreSubscriber<? super T> coreSubscriber) {
        byPage(this.pageRetrieverProvider, null, this.defaultPageSize)
            .flatMap(page -> {
                IterableStream<T> iterableStream = page.getElements();
                return iterableStream == null
                    ? Flux.empty()
                    : Flux.fromIterable(page.getElements());
            })
            .subscribe(coreSubscriber);
    }

    /**
     * Get a Flux of {@link ContinuablePage} created by concat-ing Flux instances returned
     * Page Retriever Function calls.
     *
     * @param provider the provider that when called returns Page Retriever Function
     * @param continuationToken the token to identify the pages to be retrieved
     * @param pageSize the preferred page size
     *
     * @param <C> the type of Continuation token
     * @param <T> The type of items in a {@link ContinuablePage}
     * @param <P> The {@link ContinuablePage} holding items of type {@code T}
     * @return a Flux of {@link ContinuablePage} identified by the given continuation token
     */
    private static <C, T, P extends ContinuablePage<C, T>>
        Flux<P> byPage(Supplier<PageRetriever<C, P>> provider,
                   C continuationToken, int pageSize) {
        return Flux.defer(() -> {
            final PageRetriever<C, P> pageRetriever = provider.get();
            final ContinuationState<C> state = new ContinuationState<>(continuationToken);
            return concatFluxOfPage(state, pageRetriever, pageSize);
        });
    }

    /**
     * Get a Flux of {@link ContinuablePage} created by concat-ing child Flux instances returned
     * Page Retriever Function calls. The first child Flux of {@link ContinuablePage} is identified
     * by the continuation-token in the state.
     *
     * @param state the state to be used across multiple Page Retriever Function calls
     * @param pageRetriever the Page Retriever Function
     * @param pageSize the preferred page size
     *
     * @param <C> the type of Continuation token
     * @param <T> The type of items in a {@link ContinuablePage}
     * @param <P> The {@link ContinuablePage} holding items of type {@code T}
     * @return a Flux of {@link ContinuablePage}
     */
    private static <C, T, P extends ContinuablePage<C, T>>
        Flux<P> concatFluxOfPage(ContinuationState<C> state, PageRetriever<C, P> pageRetriever, int pageSize) {
        if (state.isDone()) {
            return Flux.empty();
        } else {
            return pageRetriever.get(state.getLastContinuationToken(), pageSize == -1 ? null : pageSize)
                .switchIfEmpty(Flux.defer(() -> {
                    state.setLastContinuationToken(null);
                    return Mono.empty();
                }))
                .doOnNext(page -> state.setLastContinuationToken(page.getContinuationToken()))
                .concatWith(Flux.defer(() -> concatFluxOfPage(state, pageRetriever, pageSize)));
        }
    }

    /**
     * Internal type to store Continuation State.
     *
     * @param <C> the Continuation Token type
     */
    private static class ContinuationState<C> {
        // The last seen continuation token
        private C lastContinuationToken;
        // Indicate whether to call the PageRetrieval Function
        private boolean isDone;

        /**
         * Creates ContinuationState.
         *
         * @param token the token to start with
         */
        ContinuationState(C token) {
            this.lastContinuationToken = token;
        }

        /**
         * Store the last seen continuation token.
         *
         * @param token the token
         */
        void setLastContinuationToken(C token) {
            this.isDone = (token == null);
            this.lastContinuationToken = token;
        }

        /**
         * @return the last seen token
         */
        C getLastContinuationToken() {
            return this.lastContinuationToken;
        }

        /**
         * @return true if the PageRetrieval Function needs to be invoked
         * for next set of pages.
         */
        boolean isDone() {
            return this.isDone;
        }
    }
}
