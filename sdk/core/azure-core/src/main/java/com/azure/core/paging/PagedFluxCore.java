// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.paging;

import com.azure.core.http.rest.Page;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * This class is a Flux that can operate on a type that extends {@link PageCore} and also provides
 * the ability to operate on individual items. This type does not impose the need of a user facing
 * continuation token, hence it does not expose a public method to retrieve pages using such token.
 *
 * The constructor of this type takes a provider method, that when called should provides Page Retriever
 * Function which accepts no arguments. The provider is called for each Subscription to the PagedFluxCore
 * instance. Given provider is called per Subscription, the provider implementation can create one or more
 * objects to store any state and Page Retriever Function can capture and use those objects. This indirectly
 * associate the state objects to the Subscription. The Page Retriever Function can get called multiple
 * times in serial fashion, each time after the completion of the Flux returned by the previous invocation.
 * The final completion signal will be send to the downstream subscriber when Page Retriever returns
 * {@code null}.
 *
 * <p><strong>Extending PagedFluxCore with Page Retrieval Function Provider</strong></p>
 * {@codesnippet com.azure.core.paging.pagedfluxcore.provider}
 *
 * <p><strong>Extending PagedFluxCore for Custom Continuation Token support</strong></p>
 * {@codesnippet com.azure.core.paging.pagedfluxcore.continuationtoken}
 *
 * @param <T> The type of items in a {@link PageCore}
 * @param <P> The {@link PageCore} holding items of type {@code T}.
 *
 * @see PageCore
 * @see Flux
 */
public abstract class PagedFluxCore<T, P extends PageCore<T>> extends Flux<T> {

    private final Supplier<Supplier<Flux<P>>> pageRetrieverProvider;

    /**
     * Creates an instance of {@link PagedFluxCore}.
     *
     * @param pageRetrieverProvider a provider that returns Page Retriever Function.
     */
    public PagedFluxCore(Supplier<Supplier<Flux<P>>> pageRetrieverProvider) {
        this.pageRetrieverProvider = Objects.requireNonNull(pageRetrieverProvider,
            "'pageRetriever' function cannot be null.");
    }

    /**
     * @return a flux of {@link Page} starting from the first page
     */
    public Flux<P> byPage() {
        FluxHolder<P> holder = new FluxHolder<>();
        Supplier<Flux<P>> pageRetriever = this.pageRetrieverProvider.get();
        return Mono.just(true)
            .repeat()
            .map(b -> {
                holder.setFlux(pageRetriever.get());
                return b;
            })
            .takeWhile(b -> holder.getFlux() != null)
            .concatMap(b -> holder.getFlux());
    }

    /**
     * Subscribe to consume all items of type {@code T} in the sequence respectively.
     * This is recommended for most common scenarios. This will seamlessly fetch next
     * page when required and provide with a {@link Flux} of items.
     *
     * @param coreSubscriber The subscriber for this {@link PagedFluxCore}
     */
    @Override
    public void subscribe(CoreSubscriber<? super T> coreSubscriber) {
        byPage()
            .flatMap(page -> Flux.fromIterable(page.getItems()))
            .subscribe(coreSubscriber);
    }

    /**
     *Internal type to hold a reference to Flux<P>.
     */
    private static class FluxHolder<P> {
        private Flux<P> value;

        /**
         * @return the Flux in hold
         */
        Flux<P> getFlux() {
            return this.value;
        }

        /**
         * Hold the given Flux.
         *
         * @param value the Flux
         */
        void setFlux(Flux<P> value) {
            this.value = value;
        }
    }
}
