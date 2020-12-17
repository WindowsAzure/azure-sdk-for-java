// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.implementation;

import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpResponse;
import com.azure.core.util.Context;
import com.azure.core.util.UrlBuilder;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.common.Utility;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import static com.azure.storage.common.Utility.urlDecode;
import static com.azure.storage.common.implementation.Constants.HeaderConstants.ERROR_CODE;

/**
 * Utility class which is used internally.
 */
public class StorageImplUtils {
    private static final ClientLogger LOGGER = new ClientLogger(StorageImplUtils.class);

    private static final String ARGUMENT_NULL_OR_EMPTY =
        "The argument must not be null or an empty string. Argument name: %s.";

    private static final String PARAMETER_NOT_IN_RANGE = "The value of the parameter '%s' should be between %s and %s.";

    private static final String NO_PATH_SEGMENTS = "URL %s does not contain path segments.";

    /**
     * Parses the query string into a key-value pair map that maintains key, query parameter key, order. The value is
     * stored as a string (ex. key=val1,val2,val3 instead of key=[val1, val2, val3]).
     *
     * @param queryString Query string to parse
     * @return a mapping of query string pieces as key-value pairs.
     */
    public static Map<String, String> parseQueryString(final String queryString) {
        return parseQueryStringHelper(queryString, Utility::urlDecode);
    }

    /**
     * Parses the query string into a key-value pair map that maintains key, query parameter key, order. The value is
     * stored as a parsed array (ex. key=[val1, val2, val3] instead of key=val1,val2,val3).
     *
     * @param queryString Query string to parse
     * @return a mapping of query string pieces as key-value pairs.
     */
    public static Map<String, String[]> parseQueryStringSplitValues(final String queryString) {
        // We need to first split by comma and then decode each piece since we don't want to confuse legitimate separate
        // query values from query values that container a comma.
        // Example 1: prefix=a%2cb => prefix={decode(a%2cb)} => prefix={"a,b"}
        // Example 2: prefix=a,b => prefix={decode(a),decode(b)} => prefix={"a", "b"}
        return parseQueryStringHelper(queryString, value -> {
            String[] v = value.split(",");
            String[] ret = new String[v.length];
            for (int i = 0; i < v.length; i++) {
                ret[i] = urlDecode(v[i]);
            }
            return ret;
        });
    }

    private static <T> Map<String, T> parseQueryStringHelper(final String queryString,
                                                             Function<String, T> valueParser) {
        TreeMap<String, T> pieces = new TreeMap<>();

        if (CoreUtils.isNullOrEmpty(queryString)) {
            return pieces;
        }

        for (String kvp : queryString.split("&")) {
            int equalIndex = kvp.indexOf("=");
            String key = urlDecode(kvp.substring(0, equalIndex).toLowerCase(Locale.ROOT));
            T value = valueParser.apply(kvp.substring(equalIndex + 1));

            pieces.putIfAbsent(key, value);
        }

        return pieces;
    }

    /**
     * Blocks an asynchronous response with an optional timeout.
     *
     * @param response Asynchronous response to block
     * @param timeout Optional timeout
     * @param <T> Return type of the asynchronous response
     * @return the value of the asynchronous response
     * @throws RuntimeException If the asynchronous response doesn't complete before the timeout expires.
     */
    public static <T> T blockWithOptionalTimeout(Mono<T> response, Duration timeout) {
        if (timeout == null) {
            return response.block();
        } else {
            return response.block(timeout);
        }
    }

    /**
     * Applies a timeout to a publisher if the given timeout is not null.
     *
     * @param publisher Mono to apply optional timeout to.
     * @param timeout Optional timeout.
     * @param <T> Return type of the Mono.
     * @return Mono with an applied timeout, if any.
     */
    public static <T> Mono<T> applyOptionalTimeout(Mono<T> publisher, Duration timeout) {
        return timeout == null
            ? publisher
            : publisher.timeout(timeout);
    }

    /**
     * Applies a timeout to a publisher if the given timeout is not null.
     *
     * @param publisher Flux to apply optional timeout to.
     * @param timeout Optional timeout.
     * @param <T> Return type of the Flux.
     * @return Flux with an applied timeout, if any.
     */
    public static <T> Flux<T> applyOptionalTimeout(Flux<T> publisher, Duration timeout) {
        return timeout == null
            ? publisher
            : publisher.timeout(timeout);
    }

    /**
     * Asserts that a value is not {@code null}.
     *
     * @param param Name of the parameter
     * @param value Value of the parameter
     * @throws NullPointerException If {@code value} is {@code null}
     */
    public static void assertNotNull(final String param, final Object value) {
        if (value == null) {
            throw new NullPointerException(String.format(Locale.ROOT, ARGUMENT_NULL_OR_EMPTY, param));
        }
    }

    /**
     * Asserts that the specified number is in the valid range. The range is inclusive.
     *
     * @param param Name of the parameter
     * @param value Value of the parameter
     * @param min The minimum allowed value
     * @param max The maximum allowed value
     * @throws IllegalArgumentException If {@code value} is less than {@code min} or {@code value} is greater than
     * {@code max}.
     */
    public static void assertInBounds(final String param, final long value, final long min, final long max) {
        if (value < min || value > max) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(Locale.ROOT,
                PARAMETER_NOT_IN_RANGE, param, min, max)));
        }
    }

    /**
     * Computes a signature for the specified string using the HMAC-SHA256 algorithm.
     *
     * @param base64Key Base64 encoded key used to sign the string
     * @param stringToSign UTF-8 encoded string to sign
     * @return the HMAC-SHA256 encoded signature
     * @throws RuntimeException If the HMAC-SHA256 algorithm isn't support, if the key isn't a valid Base64 encoded
     * string, or the UTF-8 charset isn't supported.
     */
    public static String computeHMac256(final String base64Key, final String stringToSign) {
        try {
            byte[] key = Base64.getDecoder().decode(base64Key);
            Mac hmacSHA256 = Mac.getInstance("HmacSHA256");
            hmacSHA256.init(new SecretKeySpec(key, "HmacSHA256"));
            byte[] utf8Bytes = stringToSign.getBytes(StandardCharsets.UTF_8);
            return Base64.getEncoder().encodeToString(hmacSHA256.doFinal(utf8Bytes));
        } catch (NoSuchAlgorithmException | InvalidKeyException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Appends a string to the end of the passed URL's path.
     *
     * @param baseURL URL having a path appended
     * @param name Name of the path
     * @return a URL with the path appended.
     * @throws IllegalArgumentException If {@code name} causes the URL to become malformed.
     */
    public static URL appendToUrlPath(String baseURL, String name) {
        UrlBuilder builder = UrlBuilder.parse(baseURL);

        if (builder.getPath() == null) {
            builder.setPath("/");
        } else if (!builder.getPath().endsWith("/")) {
            builder.setPath(builder.getPath() + "/");
        }

        builder.setPath(builder.getPath() + name);

        try {
            return builder.toUrl();
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException(ex);
        }
    }


    /**
     * Strips the last path segment from the passed URL.
     *
     * @param baseUrl URL having its last path segment stripped
     * @return a URL with the path segment stripped.
     * @throws IllegalArgumentException If stripping the last path segment causes the URL to become malformed or it
     * doesn't contain any path segments.
     */
    public static URL stripLastPathSegment(URL baseUrl) {
        UrlBuilder builder = UrlBuilder.parse(baseUrl);

        if (builder.getPath() == null || !builder.getPath().contains("/")) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, NO_PATH_SEGMENTS, baseUrl));
        }

        builder.setPath(builder.getPath().substring(0, builder.getPath().lastIndexOf("/")));
        try {
            return builder.toUrl();
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException(ex);
        }
    }

    /**
     * Strips the account name from host part of the URL object.
     *
     * @param url URL having its  hostanme
     * @return account name.
     */
    public static String getAccountName(URL url) {
        UrlBuilder builder = UrlBuilder.parse(url);
        String accountName =  null;
        String host = builder.getHost();
        //Parse host to get account name
        // host will look like this : <accountname>.blob.core.windows.net
        if (!CoreUtils.isNullOrEmpty(host)) {
            int accountNameIndex = host.indexOf('.');
            if (accountNameIndex == -1) {
                // host only contains account name
                accountName = host;
            } else {
                // if host is separated by .
                accountName = host.substring(0, accountNameIndex);
            }
        }
        return accountName;
    }

    /** Returns an empty string if value is {@code null}, otherwise returns value
     * @param value The value to check and return.
     * @return The value or empty string.
     */
    public static String emptyIfNull(String value) {
        return value == null ? "" : value;
    }

    /**
     * Reads data from an input stream and writes it to an output stream.
     * @param source {@link InputStream source}
     * @param writeLength The length of data to write.
     * @param destination {@link OutputStream destination}
     * @throws IOException If an I/O error occurs.
     */
    public static void copyToOutputStream(InputStream source, long writeLength, OutputStream destination)
        throws IOException {
        StorageImplUtils.assertNotNull("source", source);
        StorageImplUtils.assertNotNull("destination", destination);

        final byte[] retrievedBuff = new byte[Constants.BUFFER_COPY_LENGTH];
        int nextCopy = (int) Math.min(retrievedBuff.length, writeLength);
        int count = source.read(retrievedBuff, 0, nextCopy);

        while (nextCopy > 0 && count != -1) {
            destination.write(retrievedBuff, 0, count);
            nextCopy = (int) Math.min(retrievedBuff.length, writeLength);
            count = source.read(retrievedBuff, 0, nextCopy);
        }
    }

    /**
     * Logs the string to sign if a valid context is provided.
     *
     * @param logger {@link ClientLogger}
     * @param stringToSign The string to sign to log.
     * @param context Additional context to determine if the string to sign should be logged.
     */
    public static void logStringToSign(ClientLogger logger, String stringToSign, Context context) {
        if (context != null && Boolean.TRUE.equals(context.getData(Constants.STORAGE_LOG_STRING_TO_SIGN).orElse(false))) {
            logger.info("The string to sign computed by the SDK is: {}{}", stringToSign,
                System.lineSeparator());
            logger.warning("Please remember to disable '{}' before going to production as this "
                + "string can potentially contain PII.", Constants.STORAGE_LOG_STRING_TO_SIGN);
        }
    }

    /**
     * Converts the storage exception message.
     *
     * @param message The storage exception message
     * @param response The storage service response.
     * @return The converted storage exception message.
     */
    public static String convertStorageExceptionMessage(String message, HttpResponse response) {
        if (response != null) {
            if (response.getStatusCode() == 403) {
                return String.format("If you are using a StorageSharedKeyCredential, and the server returned an "
                        + "error message that says 'Signature did not match', you can compare the string to sign with"
                        + " the one generated by the SDK. To log the string to sign, pass in the context key value pair "
                        + "'%s': true to the appropriate method call.%n"
                        + "If you are using a SAS token, and the server returned an error message that says "
                        + "'Signature did not match', you can compare the string to sign with"
                        + " the one generated by the SDK. To log the string to sign, pass in the context key value "
                        + "pair '%s': true to the appropriate generateSas method call.%n"
                        + "Please remember to disable '%s' before going to production as this string can potentially "
                        + "contain PII.%n",
                    Constants.STORAGE_LOG_STRING_TO_SIGN, Constants.STORAGE_LOG_STRING_TO_SIGN,
                    Constants.STORAGE_LOG_STRING_TO_SIGN)
                    + message;
            }
            if (response.getRequest() != null && response.getRequest().getHttpMethod() != null
                && response.getRequest().getHttpMethod().equals(HttpMethod.HEAD)
                && response.getHeaders().getValue(ERROR_CODE) != null) {
                return message.replaceFirst("(empty body)", response.getHeaders().getValue(ERROR_CODE));
            }
        }
        return message;
    }
}
