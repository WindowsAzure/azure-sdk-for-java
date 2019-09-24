// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.implementation.serializer.HttpResponseDecoder;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.Exceptions;
import reactor.core.publisher.Mono;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A concurrent cache of {@link Response<?>} constructors.
 */
class ResponseConstructorsCache {
    private final ClientLogger logger = new ClientLogger(ResponseConstructorsCache.class);
    private final Map<Class<?>, Optional<ResponseConstructor>> cache = new ConcurrentHashMap<>();

    /**
     * Identify the most specific constructor for the given response class.
     *
     * The most specific constructor is looked up following order:
     * 1. (httpRequest, statusCode, headers, body, decodedHeaders)
     * 2. (httpRequest, statusCode, headers, body)
     * 3. (httpRequest, statusCode, headers)
     *
     * @param responseClass the response class
     * @return optional with located constructor, empty optional if there is no match
     */
    Optional<ResponseConstructor> get(Class<? extends Response<?>> responseClass) {

        if (!this.cache.containsKey(responseClass)) {
            this.cache.put(responseClass, Arrays.stream(responseClass.getDeclaredConstructors())
                    .filter(constructor -> {
                        int paramCount = constructor.getParameterCount();
                        return paramCount >= 3 && paramCount <= 5;
                    })
                    .sorted(Comparator.comparingInt(Constructor::getParameterCount))
                    .findFirst()
                    .flatMap(constructor -> {
                        try {
                            MethodHandles.Lookup lookup = MethodHandles.lookup();
                            MethodHandle ctrMethodHandle = lookup.unreflectConstructor(constructor);
                            switch (constructor.getParameterCount()) {
                                case 3:
                                    Object f3 = LambdaMetafactory.metafactory(lookup,
                                            "apply",
                                            MethodType.methodType(Response3.class),
                                            MethodType.methodType(Object.class,
                                                    Object.class,
                                                    int.class,
                                                    Object.class),
                                            ctrMethodHandle,
                                            ctrMethodHandle.type()).getTarget().invoke();
                                    return Optional.of(new ResponseConstructor(3, f3));
                                case 4:
                                    Object f4 = LambdaMetafactory.metafactory(lookup,
                                            "apply",
                                            MethodType.methodType(Response4.class),
                                            MethodType.methodType(Object.class,
                                                    Object.class,
                                                    int.class,
                                                    Object.class,
                                                    Object.class),
                                            ctrMethodHandle,
                                            ctrMethodHandle.type()).getTarget().invoke();
                                    return Optional.of(new ResponseConstructor(4, f4));
                                case 5:
                                    Object f5 = LambdaMetafactory.metafactory(lookup,
                                            "apply",
                                            MethodType.methodType(Response5.class),
                                            MethodType.methodType(Object.class,
                                                    Object.class,
                                                    int.class,
                                                    Object.class,
                                                    Object.class,
                                                    Object.class),
                                            ctrMethodHandle,
                                            ctrMethodHandle.type())
                                            .getTarget().invoke();
                                    return Optional.of(new ResponseConstructor(5, f5));
                                default:
                                    return Optional.empty();
                            }

                        } catch (Throwable t) {
                            throw logger.logExceptionAsError(new RuntimeException(t));
                        }
                    }));
        }
        return this.cache.get(responseClass);
    }

    /**
     * Type that represent a {@link Response<?>} constructor and can be used to invoke
     * the same constructor.
     */
    static class ResponseConstructor {
        private final int parameterCount;
        private final Object function;

        /**
         * Creates ResponseConstructor.
         *
         * @param parameterCount the constructor parameter count
         * @param function the functional interface which delegate its abstract method
         *                 invocation to the invocation of a {@link Response<?>} constructor
         */
        private ResponseConstructor(int parameterCount, Object function) {
            this.parameterCount = parameterCount;
            this.function = function;
        }

        /**
         * Invoke the {@link Response<?>} constructor this type represents.
         *
         * @param decodedResponse the decoded response
         * @param bodyAsObject the response content
         * @return an instance of a {@link Response<?>} implementation
         */
        @SuppressWarnings("unchecked")
        Mono<Response<?>> create(final HttpResponseDecoder.HttpDecodedResponse decodedResponse,
                                        final Object bodyAsObject) {
            final HttpResponse httpResponse = decodedResponse.getSourceResponse();
            final HttpRequest httpRequest = httpResponse.getRequest();
            final int responseStatusCode = httpResponse.getStatusCode();
            final HttpHeaders responseHeaders = httpResponse.getHeaders();
            switch (this.parameterCount) {
                case 3:
                    try {
                        return Mono.just((Response<?>) ((Response3) this.function).apply(httpRequest,
                                responseStatusCode,
                                responseHeaders));
                    } catch (Throwable t) {
                        throw Exceptions.propagate(t);
                    }
                case 4:
                    try {
                        return Mono.just((Response<?>) ((Response4) this.function).apply(httpRequest,
                                responseStatusCode,
                                responseHeaders,
                                bodyAsObject));
                    } catch (Throwable t) {
                        throw Exceptions.propagate(t);
                    }
                case 5:
                    return decodedResponse.getDecodedHeaders()
                            .map((Function<Object, Response<?>>) decodedHeaders -> {
                                try {
                                    return (Response<?>) ((Response5) this.function).apply(httpRequest,
                                            responseStatusCode,
                                            responseHeaders,
                                            bodyAsObject,
                                            decodedHeaders);
                                } catch (Throwable t) {
                                    throw Exceptions.propagate(t);
                                }
                            })
                            .switchIfEmpty(Mono.defer((Supplier<Mono<Response<?>>>) () -> {
                                try {
                                    return Mono.just((Response<?>) ((Response5) this.function).apply(httpRequest,
                                        responseStatusCode,
                                        responseHeaders,
                                        bodyAsObject,
                                        null));
                                } catch (Throwable t) {
                                    throw Exceptions.propagate(t);
                                }
                            }));
                default:
                    return Mono.error(new IllegalStateException(
                            "Response constructor with expected parameters not found."));
            }
        }
    }

    @FunctionalInterface
    private interface Response3 {
        Object apply(Object httpRequest,
                     int responseStatusCode,
                     Object responseHeaders);
    }

    @FunctionalInterface
    private interface Response4 {
        Object apply(Object httpRequest,
                     int responseStatusCode,
                     Object responseHeaders,
                     Object body);
    }

    @FunctionalInterface
    private interface Response5 {
        Object apply(Object httpRequest,
                     int responseStatusCode,
                     Object responseHeaders,
                     Object body,
                     Object decodedHeaders);
    }
}
