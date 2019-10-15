// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.function.Function;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the SASSignatureValues type. Once generated, it can be set on a ClientBuilder
 * object to be constructed as part of a URL or it can be encoded into a {@code String} and appended to a URL directly
 * (though caution should be taken here in case there are existing query parameters, which might affect the appropriate
 * means of appending these query parameters). NOTE: Instances of this class are immutable to ensure thread safety.
 */
public abstract class BaseSasQueryParameters {

    protected String version;

    protected SasProtocol protocol;

    protected OffsetDateTime startTime;

    protected OffsetDateTime expiryTime;

    protected IpRange ipRange;

    protected String permissions;

    protected String signature;

    /**
     * Creates a new {@link BaseSasQueryParameters} object.
     *
     * @param queryParamsMap All query parameters for the request as key-value pairs
     * @param removeSASParametersFromMap When {@code true}, the SAS query parameters will be removed from
     * queryParamsMap
     */
    public BaseSasQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSASParametersFromMap) {
        this.version = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SERVICE_VERSION,
            removeSASParametersFromMap);
        this.protocol = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_PROTOCOL,
            removeSASParametersFromMap, SasProtocol::parse);
        this.startTime = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_START_TIME,
            removeSASParametersFromMap, Utility::parseDate);
        this.expiryTime = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_EXPIRY_TIME,
            removeSASParametersFromMap, Utility::parseDate);
        this.ipRange = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_IP_RANGE,
            removeSASParametersFromMap, IpRange::parse);
        this.permissions = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS,
            removeSASParametersFromMap);
        this.signature = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNATURE,
            removeSASParametersFromMap);
    }

    /**
     * Helper method to get a query parameter
     *
     * @param parameters A {@code Map} of parameters to values to search.
     * @param name The name of parameter to find.
     * @param remove Whether or not to remove the parameter from the map.
     * @return A String representing the query parameter
     */
    protected String getQueryParameter(Map<String, String[]> parameters, String name, boolean remove) {
        return getQueryParameter(parameters, name, remove, value -> value);
    }

    /**
     * Helper method to get a query parameter
     *
     * @param <T> The object type.
     * @param parameters A {@code Map} of parameters to values to search.
     * @param name The name of parameter to find.
     * @param remove Whether or not to remove the parameter from the map.
     * @param converter Function that transforms the value to a String.
     * @return The object
     */
    protected <T> T getQueryParameter(Map<String, String[]> parameters, String name, boolean remove, Function<String,
        T> converter) {
        String[] parameterValue = parameters.get(name);
        if (parameterValue == null) {
            return null;
        }

        if (remove) {
            parameters.remove(name);
        }

        return converter.apply(parameterValue[0]);
    }

    /**
     * Creates a new {@link BaseSasQueryParameters} object. These objects are only created internally by
     * SASSignatureValues classes.
     *
     * @param version A {@code String} representing the storage version.
     * @param protocol A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param ipRange A {@link IpRange} representing the range of valid IP addresses for this SAS token or
     * {@code null}.
     * @param permissions A {@code String} representing the storage permissions or {@code null}.
     * @param signature A {@code String} representing the signature for the SAS token.
     */
    public BaseSasQueryParameters(String version, SasProtocol protocol, OffsetDateTime startTime,
                                  OffsetDateTime expiryTime, IpRange ipRange, String permissions, String signature) {
        this.version = version;
        this.protocol = protocol;
        this.startTime = startTime;
        this.expiryTime = expiryTime;
        this.ipRange = ipRange;
        this.permissions = permissions;
        this.signature = signature;
    }

    /**
     * @return The storage version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return The allowed HTTP protocol(s) or {@code null}. Please refer to {@link SasProtocol} for more details.
     */
    public SasProtocol getProtocol() {
        return protocol;
    }

    /**
     * @return The start time for this SAS token or {@code null}.
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * @return The expiry time for this SAS token.
     */
    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * @return {@link IpRange}
     */
    public IpRange getIpRange() {
        return ipRange;
    }

    /**
     * @return Please refer to *SASPermission classes for more details.
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * @return The signature for the SAS token.
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Shared helper method to append a SAS query parameter.
     *
     * @param sb The {@code StringBuilder} to append to.
     * @param param The {@code String} parameter to append.
     * @param value The value of the parameter to append.
     */
    protected void tryAppendQueryParameter(StringBuilder sb, String param, Object value) {
        if (value != null) {
            if (sb.length() != 0) {
                sb.append('&');
            }
            sb.append(Utility.urlEncode(param)).append('=').append(Utility.urlEncode(value.toString()));
        }
    }

    /**
     * Formats date time SAS query parameters.
     *
     * @param dateTime The SAS date time.
     * @return A String representing the SAS date time.
     */
    protected String formatQueryParameterDate(OffsetDateTime dateTime) {
        if (dateTime == null) {
            return null;
        } else {
            return Utility.ISO_8601_UTC_DATE_FORMATTER.format(dateTime);
        }
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing all SAS query parameters.
     */
    public abstract String encode();
}
