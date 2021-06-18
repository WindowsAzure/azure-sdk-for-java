// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.test.annotation;

import com.azure.core.http.HttpClient;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.test.implementation.TestingHelpers;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.ServiceVersion;
import com.azure.core.util.logging.ClientLogger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;
import org.junit.platform.commons.support.ReflectionSupport;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class HttpClientServiceVersionAugmentedArgumentsProvider
    implements ArgumentsProvider, AnnotationConsumer<HttpClientServiceVersionAugmentedSource> {
    private static final TestMode TEST_MODE = TestingHelpers.getTestMode();

    private static final Map<Class<? extends ServiceVersion>, ServiceVersion> CLASS_TO_LATEST_SERVICE_VERSION
        = new ConcurrentHashMap<>();

    private static final Map<Class<? extends ServiceVersion>, Map<String, ServiceVersion>>
        CLASS_TO_MAP_STRING_SERVICE_VERSION = new ConcurrentHashMap<>();

    private static final String SERVICE_VERSION_TYPES_MUST_MATCH = "The 'serviceVersionType' used by the "
        + "'TestingServiceVersions' and 'HttpClientServiceVersionAugmentedSource' annotations do not match. "
        + "For proper testing behavior they must match. The give was, 'TestingServiceVersions': '%s' and "
        + "'HttpClientServiceVersionAugmentedSource': '%s'.";

    private static final String MUST_BE_STATIC = "Source supplier method is required to be static. Method: %s.";

    private static final String MUST_BE_STREAM_ARGUMENTS =
        "Source supplier method is required to return Stream<Arguments>. Return type: %s.";

    private final ClientLogger logger = new ClientLogger(HttpClientServiceVersionAugmentedArgumentsProvider.class);

    private String minimumServiceVersion;
    private Class<? extends ServiceVersion> serviceVersionType;
    private String sourceSupplier;
    private boolean useHttpClientPermutation;

    @Override
    public void accept(HttpClientServiceVersionAugmentedSource annotation) {
        this.minimumServiceVersion = annotation.minimumServiceVersion();
        this.serviceVersionType = annotation.serviceVersionType();

        if (!Enum.class.isAssignableFrom(serviceVersionType)) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("'serviceVersionType' isn't an instance of Enum."));
        }

        this.sourceSupplier = annotation.sourceSupplier();
        this.useHttpClientPermutation = annotation.useHttpClientPermutation();
    }

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        // If the TEST_MODE is PLAYBACK or HttpClients are being ignored don't use HttpClients.
        List<HttpClient> httpClientsToUse = Collections.singletonList(null);
        if (!useHttpClientPermutation && TEST_MODE != TestMode.PLAYBACK) {
            httpClientsToUse = TestBase.getHttpClients().collect(Collectors.toList());
        }

        TestingServiceVersions testingServiceVersions = context.getRequiredTestClass()
            .getAnnotation(TestingServiceVersions.class);
        List<? extends ServiceVersion> serviceVersionsToUse = getServiceVersions(testingServiceVersions,
            minimumServiceVersion, serviceVersionType, TEST_MODE);

        // If the sourceSupplier isn't provided don't retrieve parameterized testing values.
        List<Arguments> testValues = null;
        if (!CoreUtils.isNullOrEmpty(sourceSupplier)) {
            Object source = invokeSupplierMethod(context, sourceSupplier);
            testValues = convertSupplierSourceToArguments(source);
        }

        /*
         * Create a stream of arguments for the test using the following logic.
         *
         * 1) HTTP clients are being ignored and there is no source supplier.
         *    - Use only service versions as the test permutation.
         *
         * 2) HTTP clients are being ignored.
         *    - Use a permutation of service versions X parameterized testing values.
         *
         * 3) There is no source supplier.
         *    - Use a permutation of HTTP client X service versions.
         *
         * 4) There are no HTTP clients.
         *    - Use a permutation of null HTTP client X service versions X parameterized testing values.
         *
         * 5) HTTP clients exist.
         *    - Use a permutation of HTTP client X service versions X parameterized testing values.
         */
        if (!useHttpClientPermutation && testValues == null) {
            return serviceVersionsToUse.stream().map(Arguments::arguments);
        } else if (!useHttpClientPermutation) {
            return createNonHttpPermutations(serviceVersionsToUse, testValues).stream();
        } else if (testValues == null) {
            return createHttpServiceVersionPermutations(httpClientsToUse, serviceVersionsToUse).stream();
        } else if (CoreUtils.isNullOrEmpty(httpClientsToUse)) {
            return createFullPermutations(Collections.singletonList(null), serviceVersionsToUse, testValues).stream();
        } else {
            return createFullPermutations(httpClientsToUse, serviceVersionsToUse, testValues).stream();
        }
    }

    /*
     * Gets the service versions that will be used during testing.
     *
     * If the test class is annotated with TestingServiceVersions that will be used to determine which version(s) will
     * be tested. When the TEST_MODE is PLAYBACK or RECORD the recording service version will be used. Otherwise, the
     * live service versions that the test supports will be used.
     *
     * If the test class is not annotated with TestingServiceVersions the latest service version will be used for
     * testing.
     */
    static List<? extends ServiceVersion> getServiceVersions(TestingServiceVersions testingServiceVersions,
        String minimumServiceVersion, Class<? extends ServiceVersion> serviceVersionType, TestMode testMode) {
        loadServiceVersion(serviceVersionType);

        if (testingServiceVersions != null) {
            // If the ServiceVersion types between the method and class annotations do not match throw an error.
            // This is likely a configuration error.
            if (testingServiceVersions.serviceVersionType() != serviceVersionType) {
                throw new IllegalStateException(String.format(SERVICE_VERSION_TYPES_MUST_MATCH,
                    testingServiceVersions.serviceVersionType().getName(), serviceVersionType.getName()));
            }

            // If the test mode isn't live return the recording/playback service version.
            if (testMode != TestMode.LIVE) {
                // If the recording service version hasn't been set use the latest.
                if (CoreUtils.isNullOrEmpty(testingServiceVersions.recordingServiceVersion())) {
                    return Collections.singletonList(CLASS_TO_LATEST_SERVICE_VERSION.get(serviceVersionType));
                } else {
                    return Collections.singletonList(CLASS_TO_MAP_STRING_SERVICE_VERSION.get(serviceVersionType)
                        .get(testingServiceVersions.recordingServiceVersion()));
                }
            }

            // If there are no live service versions configured use the latest service version.
            String[] liveServiceVersions = testingServiceVersions.liveServiceVersions();
            if (CoreUtils.isNullOrEmpty(liveServiceVersions)) {
                return Collections.singletonList(CLASS_TO_LATEST_SERVICE_VERSION.get(serviceVersionType));
            }

            // Otherwise use all live service versions supported by the test.
            Enum<?> minimumServiceVersionEnum = CoreUtils.isNullOrEmpty(minimumServiceVersion)
                ? null
                : (Enum<?>) CLASS_TO_MAP_STRING_SERVICE_VERSION.get(serviceVersionType).get(minimumServiceVersion);
            Set<String> liveServiceVersionsSet = Arrays.stream(liveServiceVersions).collect(Collectors.toSet());
            return CLASS_TO_MAP_STRING_SERVICE_VERSION.get(serviceVersionType).values().stream()
                .filter(sv -> liveServiceVersionsSet.contains(sv.getVersion()))
                .filter(sv -> minimumServiceVersionEnum == null
                    || ((Enum<?>) sv).ordinal() >= minimumServiceVersionEnum.ordinal())
                .collect(Collectors.toList());
        } else {
            return Collections.singletonList(CLASS_TO_LATEST_SERVICE_VERSION.get(serviceVersionType));
        }
    }

    /*
     * Helper method that loads all values and the latest ServiceVersion of the passed serviceVersionType.
     */
    private static void loadServiceVersion(Class<? extends ServiceVersion> serviceVersionType) {
        CLASS_TO_MAP_STRING_SERVICE_VERSION.computeIfAbsent(serviceVersionType, type -> {
            try {
                ServiceVersion[] serviceVersions = (ServiceVersion[]) serviceVersionType.getMethod("values")
                    .invoke(serviceVersionType);

                Map<String, ServiceVersion> stringServiceVersionMap = new TreeMap<>();
                for (ServiceVersion serviceVersion : serviceVersions) {
                    stringServiceVersionMap.put(serviceVersion.getVersion(), serviceVersion);
                }

                return stringServiceVersionMap;
            } catch (ReflectiveOperationException ex) {
                throw new IllegalStateException(ex);
            }
        });

        CLASS_TO_LATEST_SERVICE_VERSION.computeIfAbsent(serviceVersionType, type -> {
            try {
                return (ServiceVersion) serviceVersionType.getMethod("getLatest").invoke(serviceVersionType);
            } catch (ReflectiveOperationException ex) {
                throw new IllegalStateException(ex);
            }
        });
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    static Object invokeSupplierMethod(ExtensionContext context, String sourceSupplier) throws Exception {
        Class<?> sourceSupplierClass;
        Method sourceSupplierMethod;

        // The method is fully qualified.
        if (sourceSupplier.contains("#")) {
            String[] classAndMethod = sourceSupplier.split("#", 2);

            sourceSupplierClass = ReflectionSupport.tryToLoadClass(classAndMethod[0]).get();
            sourceSupplierMethod = ReflectionSupport.findMethod(sourceSupplierClass, classAndMethod[1]).get();
        } else {
            sourceSupplierClass = context.getRequiredTestClass();
            sourceSupplierMethod = ReflectionSupport.findMethod(sourceSupplierClass, sourceSupplier).get();
        }

        validateSourceSupplier(sourceSupplierMethod);

        return ReflectionSupport.invokeMethod(sourceSupplierMethod, sourceSupplier);
    }

    static void validateSourceSupplier(Method sourceMethod) {
        int modifiers = sourceMethod.getModifiers();
        if ((modifiers | Modifier.STATIC) != modifiers) {
            throw new IllegalArgumentException(String.format(MUST_BE_STATIC, sourceMethod.getName()));
        }

        Type returnType = sourceMethod.getGenericReturnType();
        boolean validReturnType = returnType instanceof ParameterizedType;

        if (!validReturnType) {
            throw new IllegalArgumentException(String.format(MUST_BE_STREAM_ARGUMENTS, returnType));
        }

        ParameterizedType parameterizedType = (ParameterizedType) returnType;
        validReturnType = parameterizedType.getRawType() instanceof Class
            && Stream.class.isAssignableFrom((Class<?>) parameterizedType.getRawType())
            && parameterizedType.getActualTypeArguments().length == 1
            && parameterizedType.getActualTypeArguments()[0] instanceof Class
            && Arguments.class.isAssignableFrom((Class<?>) parameterizedType.getActualTypeArguments()[0]);

        if (!validReturnType) {
            throw new IllegalArgumentException(String.format(MUST_BE_STREAM_ARGUMENTS, returnType));
        }
    }

    static List<Arguments> convertSupplierSourceToArguments(Object source) {
        if (source instanceof Stream) {
            return ((Stream<?>) source).map(HttpClientServiceVersionAugmentedArgumentsProvider::convertToArguments)
                .collect(Collectors.toList());
        } else {
            throw new IllegalStateException("'sourceSupplier' returned an unsupported type: " + source.getClass());
        }
    }

    static Arguments convertToArguments(Object value) {
        if (value instanceof Arguments) {
            return (Arguments) value;
        } else {
            throw new IllegalStateException("Test parameterized source is an unsupported type: " + value.getClass());
        }
    }

    static List<Arguments> createHttpServiceVersionPermutations(List<HttpClient> httpClients,
        List<? extends ServiceVersion> serviceVersions) {
        List<Arguments> arguments = new ArrayList<>();

        for (HttpClient httpClient : httpClients) {
            for (ServiceVersion serviceVersion : serviceVersions) {
                arguments.add(Arguments.of(httpClient, serviceVersion));
            }
        }

        return arguments;
    }

    static List<Arguments> createNonHttpPermutations(List<? extends ServiceVersion> serviceVersions,
        List<Arguments> parameterizedTestingValues) {
        List<Arguments> arguments = new ArrayList<>();

        for (ServiceVersion serviceVersion : serviceVersions) {
            for (Arguments parameterizedTestingValue : parameterizedTestingValues) {
                arguments.add(prependArguments(serviceVersion, null, parameterizedTestingValue));
            }
        }

        return arguments;
    }

    static List<Arguments> createFullPermutations(List<HttpClient> httpClients,
        List<? extends ServiceVersion> serviceVersions, List<Arguments> parameterizedTestingValues) {
        List<Arguments> arguments = new ArrayList<>();

        for (HttpClient httpClient : httpClients) {
            for (ServiceVersion serviceVersion : serviceVersions) {
                for (Arguments parameterizedTestingValue : parameterizedTestingValues) {
                    arguments.add(prependArguments(httpClient, serviceVersion, parameterizedTestingValue));
                }
            }
        }

        return arguments;
    }

    private static Arguments prependArguments(Object prepend, Object optionalPrepend, Arguments arguments) {
        boolean hasOptionalPrepend = optionalPrepend != null;

        Object[] previousArgs = arguments.get();
        Object[] newArgs = new Object[previousArgs.length + 1 + (hasOptionalPrepend ? 1 : 0)];

        newArgs[0] = prepend;
        if (hasOptionalPrepend) {
            newArgs[1] = optionalPrepend;
        }

        System.arraycopy(previousArgs, 0, newArgs, hasOptionalPrepend ? 2 : 1, previousArgs.length);

        return Arguments.of(newArgs);
    }
}
