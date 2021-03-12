// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation;

import com.azure.cosmos.implementation.directconnectivity.AddressSelector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.function.Function;

/**
 * While this class is public, but it is not part of our published public APIs.
 * This is meant to be internally used only by our sdk.
 */
public class BackoffRetryUtility {

    private static final Logger logger = LoggerFactory.getLogger(BackoffRetryUtility.class);

    // transforms a retryFunc to a function which can be used by Observable.retryWhen(.)
    // also it invokes preRetryCallback prior to doing retry.
    public static final Quadruple<Boolean, Boolean, Duration, Integer> InitialArgumentValuePolicyArg = Quadruple.with(false, false,
            Duration.ofSeconds(60), 0);

    // a helper method for invoking callback method given the retry policy.
    // it also invokes the pre retry callback prior to retrying

    // a helper method for invoking callback method given the retry policy

    // a helper method for invoking callback method given the retry policy
    static public <T> Mono<T> executeRetry(Callable<Mono<T>> callbackMethod,
                                           IRetryPolicy retryPolicy) {

        logger.info("executeRetry - Before defer");
        return Mono.defer(() -> {
            // TODO: is defer required?

            try {
                if (retryPolicy != null) {
                    logger.info(
                        "executeRetry - Within defer before callback call, " +
                            "retry count {}, retry latency {}",
                        retryPolicy.getRetryCount(),
                        retryPolicy.getRetryLatency());
                } else {
                    logger.info(
                        "executeRetry - Within defer before callback call without retry policy");
                }
                return callbackMethod.call();
            } catch (Exception e) {
                logger.info("executeRetry - within defer, failed:", e);
                return Mono.error(e);
            }
        }).retryWhen(Retry.withThrowable(RetryUtils.toRetryWhenFunc(retryPolicy)));
    }

    static public <T> Flux<T> fluxExecuteRetry(Callable<Flux<T>> callbackMethod, IRetryPolicy retryPolicy) {

        return Flux.defer(() -> {
            try {
                return callbackMethod.call();
            } catch (Exception e) {
                return Flux.error(e);
            }
        }).retryWhen(Retry.withThrowable(RetryUtils.toRetryWhenFunc(retryPolicy)));
    }

    static public <T> Mono<T> executeAsync(
        Function<Quadruple<Boolean, Boolean, Duration, Integer>, Mono<T>> callbackMethod, IRetryPolicy retryPolicy,
        Function<Quadruple<Boolean, Boolean, Duration, Integer>, Mono<T>> inBackoffAlternateCallbackMethod,
        Duration minBackoffForInBackoffCallback,
        RxDocumentServiceRequest request,
        AddressSelector addressSelector) {

        return Mono.defer(() -> {
            // TODO: is defer required?
            return callbackMethod.apply(InitialArgumentValuePolicyArg).onErrorResume(
                RetryUtils.toRetryWithAlternateFunc(
                    callbackMethod,
                    retryPolicy,
                    inBackoffAlternateCallbackMethod,
                    minBackoffForInBackoffCallback,
                    request,
                    addressSelector));
        });
    }

}
