// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue;

import com.azure.storage.common.BaseSASQueryParameters;
import com.azure.storage.common.Constants;
import com.azure.storage.common.IPRange;
import com.azure.storage.common.SASProtocol;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the {@link QueueServiceSASSignatureValues} type. Once generated, it can be set on a
 * {@link QueueClientBuilder} object to be constructed as part of a URL or it can be encoded into a {@code String} and
 * appended to a URL directly (though caution should be taken here in case there are existing query parameters, which
 * might affect the appropriate means of appending these query parameters).
 * NOTE: Instances of this class are immutable to ensure thread safety.
 */
public final class QueueServiceSASQueryParameters extends BaseSASQueryParameters {

    private final String identifier;

    /**
     * Creates a new {@link QueueServiceSASQueryParameters} object.
     *
     * @param queryParamsMap All query parameters for the request as key-value pairs
     * @param removeSASParametersFromMap When {@code true}, the SAS query parameters will be removed from
     * queryParamsMap
     */
    public QueueServiceSASQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSASParametersFromMap) {
        super(queryParamsMap, removeSASParametersFromMap);

        this.identifier = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER, removeSASParametersFromMap);
    }


    /**
     * Creates a new {@link QueueServiceSASQueryParameters} object. These objects are only created internally by SASSignatureValues
     * classes.
     *
     * @param version A {@code String} representing the storage version.
     * @param protocol A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param ipRange A {@link IPRange} representing the range of valid IP addresses for this SAS token or {@code null}.
     * @param identifier A {@code String} representing the signed identifier (only for Service SAS) or {@code null}.
     * @param permissions A {@code String} representing the storage permissions or {@code null}.
     * @param signature A {@code String} representing the signature for the SAS token.
     */
    QueueServiceSASQueryParameters(String version, SASProtocol protocol, OffsetDateTime startTime, OffsetDateTime expiryTime,
        IPRange ipRange, String identifier, String permissions, String signature) {
        super(version, protocol, startTime, expiryTime, ipRange, permissions, signature);

        this.identifier = identifier;
    }

    /**
     * @return The signed identifier (only for {@link QueueServiceSASSignatureValues}) or {@code null}. Please see
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/establishing-a-stored-access-policy">here</a>
     * for more information.
     */
    public String identifier() {
        return identifier;
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing all SAS query parameters.
     */
    public String encode() {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        StringBuilder sb = new StringBuilder();

        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICE_VERSION, this.version);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PROTOCOL, this.protocol);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_START_TIME, formatQueryParameterDate(this.startTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_EXPIRY_TIME, formatQueryParameterDate(this.expiryTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_IP_RANGE, this.ipRange);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER, this.identifier);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS, this.permissions);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNATURE, this.signature);

        return sb.toString();
    }
}
