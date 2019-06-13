// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.polling;

import reactor.core.Disposable;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * This class offer API that simplifies the task of executing long-running operations against Azure. The poller consists of
 * {@link Function} to be triggered on each poll cycle followed by polling to determine if long-running operation completed.
 * <p></p>
 * The poller starts polling <strong>automatically</strong> as soon as the Poller instance is created. It provides following API:
 *
 * <ul>
 *      <li>Querying the current state of long-running operations.</li>
 *      <li>Requesting an asynchronous notification for long-running operations's state.</li>
 *      <li>Cancelling the long-running operations if cancellation is supported by the service.</li>
 *      <li>Triggering a poll operation manually.</li>
 *      <li>Enable/Disable auto-polling.</li>
 * </ul>
 *
 * <p><strong>Code Samples</strong></p>
 *
 * <p><strong>Instantiating and Subscribing to Poll Response</strong></p>
 * {@codesnippet com.azure.core.util.polling.poller.instantiationAndSubscribe}
 *
 * <p><strong>Wait/Block for Polling to complete</strong></p>
 * {@codesnippet com.azure.core.util.polling.poller.block}
 *
 * <p><strong>Disable auto polling and polling manually</strong></p>
 * {@codesnippet com.azure.core.util.polling.poller.poll}
 *
 * @param <T> Type of poll response value
 * @see PollResponse
 * @see com.azure.core.util.polling.PollResponse.OperationStatus
 */
public class Poller<T> {

    /*
     * pollOperation is a Function that takes the previous PollResponse, and
     * returns a new Mono of PollResponse to represent the current state
     */
    private final Function<PollResponse<T>, Mono<PollResponse<T>>> pollOperation;

    /*
     * poll interval before next auto poll. This value will be used if the PollResponse does not include retryAfter from the service.
     */
    private Duration pollInterval;

    /*
     * This will save last poll response.
     */
    private PollResponse<T> pollResponse;

    /*
     * This will be called when cancel operation is triggered.
     */
    private Consumer<Poller> cancelOperation;

    /*
     * Indicate to poll automatically or not when poller is created.
     * default value is false;
     */
    private boolean autoPollingEnabled;

    /*
     * This handle to Flux allow us to perform polling operation in asynchronous manner.
     * This could be shared among many subscriber. One of the subscriber will be this poller itself.
     * Once subscribed, this Flux will continue to poll for status until poll operation is done/complete.
     */
    private Flux<PollResponse<T>> fluxHandle;

    /*
     * Since constructor create a subscriber and start auto polling.
     * This handle will be used to dispose the subscriber when
     * client disable auto polling.
     */
    private Disposable fluxDisposable;

    /**
     * Create a Poller object with poll interval and poll operation. The polling starts immediately by default and it will invoke pollOperation.
     * The next poll cycle will be defined by retryAfter value in {@link PollResponse}.
     * In absence of retryAfter, the poller will use pollInterval.
     *
     * @param pollInterval  Not null  and greater than zero poll interval. It ensure that polling happens only once in given pollInterval.
     * @param pollOperation to be called by poller. It should not return {@code null}. The response should always have valid {@link com.azure.core.util.polling.PollResponse.OperationStatus}
     *                      {@link Mono} returned from poll operation should never return Mono.error().
     *                      If any unexpected scenario happens in poll operation, it should handle it and return a valid {@link PollResponse}.
     *                      However if poll operation returns {@link Mono#error(Throwable)}, the poller will disregard that and continue to poll.
     * @throws NullPointerException     If it is {@code null} for {@code  pollInterval pollOperation}.
     * @throws IllegalArgumentException if {@code  pollInterval} is negative or zero
     */
    public Poller(Duration pollInterval, Function<PollResponse<T>, Mono<PollResponse<T>>> pollOperation) {

        Objects.requireNonNull(pollInterval, "The poll interval input parameter cannot be null.");
        if (pollInterval.toNanos() <= 0) {
            throw new IllegalArgumentException("Negative or zero value for poll interval not allowed.");
        }
        Objects.requireNonNull(pollOperation, "The poll operation input parameter cannot be null.");

        this.pollInterval = pollInterval;
        this.pollOperation = pollOperation;
        this.pollResponse = new PollResponse<>(PollResponse.OperationStatus.NOT_STARTED, null);

        this.fluxHandle = asyncPollRequestWithDelay()
            .flux()
            .repeat()
            .takeUntil(pollResponse -> hasCompleted())
            .share();

        // auto polling start here
        this.fluxDisposable = fluxHandle.subscribe();
        this.autoPollingEnabled = true;
    }

    /**
     * Create a Poller object with poll interval, poll operation and cancel operation. The polling starts immediately by default and invoke poll operation.
     *
     * @param pollInterval    Not null poll interval. It ensure that polling happens only once in given pollInterval.
     * @param pollOperation   to be called by poller. It should not return {@code null}. The response should always have valid {@link com.azure.core.util.polling.PollResponse.OperationStatus}
     *                        {@link Mono} returned from poll operation should never return Mono.error().
     *                        If any unexpected scenario happens in poll operation, it should handle it and return a valid {@link PollResponse}.
     *                        However if poll operation returns {@link Mono#error(Throwable)}, the poller will disregard that and continue to poll.
     * @param cancelOperation cancel operation if cancellation is supported by the service. It can be {@code null}.
     * @throws NullPointerException If {@code pollerOptions pollOperation} is {@code null}.
     */
    public Poller(Duration pollInterval, Function<PollResponse<T>, Mono<PollResponse<T>>> pollOperation, Consumer<Poller> cancelOperation) {
        this(pollInterval, pollOperation);
        this.cancelOperation = cancelOperation;
    }

    /**
     * Calls cancel operation function if cancellation is supported by the service.
     * It will only call cancelOperation if {@link com.azure.core.util.polling.PollResponse.OperationStatus} is IN_PROGRESS otherwise it does nothing.
     *
     * @throws UnsupportedOperationException when cancel operation is not provided.
     */
    public void cancelOperation() throws UnsupportedOperationException {
        if (this.cancelOperation == null) {
            throw new UnsupportedOperationException("Cancel operation is not supported on this service/resource.");
        }

        // We can not cancel an operation if it was never started
        // It only make sense to call cancel operation if current status IN_PROGRESS.
        if (this.pollResponse != null && this.pollResponse.getStatus() != PollResponse.OperationStatus.IN_PROGRESS) {
            return;
        }
        //Time to call cancel
        this.cancelOperation.accept(this);
    }

    /**
     * Enable user to subscribe to {@link Flux} and listen to every {@link PollResponse} asynchronously.
     * The user will start receiving {@link PollResponse} when client subscribe to this {@link Flux}.
     * The poller could still have its own auto polling in action unless user has turned off
     * auto polling.
     *
     * @return poll response as {@link Flux} that can be subscribed.
     */
    public Flux<PollResponse<T>> getObserver() {
        return this.fluxHandle;
    }

    /**
     * Enable user to take control of polling and trigger manual poll operation. It will call poll operation once.
     * This will not turn off auto polling.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p><strong>Manual Polling</strong></p>
     * <p>
     * {@codesnippet com.azure.core.util.polling.poller.poll.indepth}
     *
     * @return a Mono of {@link PollResponse} This will call poll operation once. The {@link Mono} returned here could be subscribed
     * for receiving {@link PollResponse} in async manner.
     */
    public Mono<PollResponse<T>> poll() {
        return this.pollOperation.apply(this.pollResponse)
            .doOnEach(pollResponseSignal -> {
                if (pollResponseSignal.get() != null) {
                    this.pollResponse = pollResponseSignal.get();
                }
            });
    }

    /**
     * Blocks execution and wait for polling to complete. The polling is considered finished based on status defined in {@link com.azure.core.util.polling.PollResponse.OperationStatus}.
     * Auto polling must be turned on for poller to continuously poll in background.
     *
     * @return returns final poll response when polling is finished as defined in {@link com.azure.core.util.polling.PollResponse.OperationStatus}.
     */
    public PollResponse<T> block() {
        return this.fluxHandle.blockLast();
    }

    /*
     * This function will apply delay and call poll operation function async.
     * We expect Mono from pollOperation should never return Mono.error() . If any unexpected
     * scenario happens in pollOperation, it should catch it and return a valid PollResponse.
     * This is because poller does not know what to do in case on Mono.error.
     * This function will return empty mono in case of Mono.error() returned by poll operation.
     *
     * @return mono of poll response
     */
    private Mono<PollResponse<T>> asyncPollRequestWithDelay() {
        return Mono.defer(() -> this.pollOperation.apply(this.pollResponse)
            .delaySubscription(getCurrentDelay())
            .onErrorResume(throwable -> {
                // We should never get here and since we want to continue polling
                //Log the error
                return Mono.empty();
            })
            .doOnEach(pollResponseSignal -> {
                if (pollResponseSignal.get() != null) {
                    this.pollResponse = pollResponseSignal.get();
                }
            }));
    }

    /*
     * We will use  {@link PollResponse#getRetryAfter} if it is greater than zero otherwise use poll interval.
     */
    private Duration getCurrentDelay() {
        return (this.pollResponse != null
            && this.pollResponse.getRetryAfter() != null
            && this.pollResponse.getRetryAfter().toNanos() > 0) ? this.pollResponse.getRetryAfter() : this.pollInterval;
    }

    /**
     * Controls whether auto-polling is enabled or disabled. Refer to the {@link Poller} class-level JavaDoc for more details on auto-polling.
     *
     * <p><strong>Disable auto polling</strong></p>
     * {@codesnippet com.azure.core.util.polling.poller.disableautopolling}
     *
     * <p><strong>Enable auto polling</strong></p>
     * {@codesnippet com.azure.core.util.polling.poller.enableautopolling}
     *
     * @param autoPollingEnabled If true, auto-polling will occur transparently in the background, otherwise it requires
     *                           manual polling by the user to get the latest state.
     */
    public final void setAutoPollingEnabled(boolean autoPollingEnabled) {
        this.autoPollingEnabled = autoPollingEnabled;
        if (this.autoPollingEnabled) {
            if (!activeSubscriber()) {
                this.fluxDisposable = this.fluxHandle.subscribe(pr -> this.pollResponse = pr);
            }
        } else {
            if (activeSubscriber()) {
                this.fluxDisposable.dispose();
            }
        }
    }

    /*
     * An operation will be considered complete if it is in one of the following state:
     * <ul>
     *     <li>SUCCESSFULLY_COMPLETED</li>
     *     <li>USER_CANCELLED</li>
     *     <li>FAILED</li>
     * </ul>
     * Also see {@link OperationStatus}
     * @return true if operation is done/complete.
     */
    private boolean hasCompleted() {
        return pollResponse != null && (pollResponse.getStatus() == PollResponse.OperationStatus.SUCCESSFULLY_COMPLETED
            || pollResponse.getStatus() == PollResponse.OperationStatus.FAILED
            || pollResponse.getStatus() == PollResponse.OperationStatus.USER_CANCELLED);
    }

    /*
     * Determine if this poller's internal subscriber exists and active.
     */
    private boolean activeSubscriber() {
        return (this.fluxDisposable != null && !this.fluxDisposable.isDisposed());
    }

    /**
     * Indicate if auto-polling is <strong>on/off</strong> . By default auto-polling is turned <strong>on</strong>.
     *
     * @return A boolean value representing if auto-polling is enabled or not..
     */
    public boolean isAutoPollingEnabled() {
        return this.autoPollingEnabled;
    }

    /**
     * Current known status as a result of last poll event. If auto-polling was disabled by user, this will represent
     * old response when auto-polling was enabled.
     *
     * @return current status or {@code null} if no status is available.
     */
    public PollResponse.OperationStatus getStatus() {
        return this.pollResponse != null ? this.pollResponse.getStatus() : null;
    }
}
