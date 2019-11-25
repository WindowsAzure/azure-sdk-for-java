// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.sas;

import com.azure.storage.common.implementation.Constants;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the {@link AccountSasSignatureValues} type. Once generated, it can be set on a
 * ServiceClientBuilder object to be constructed as part of a URL or it can be encoded into a {@code String} and
 * appended to a URL directly (though caution should be taken here in case there are existing query parameters, which
 * might affect the appropriate means of appending these query parameters). NOTE: Instances of this class are immutable
 * to ensure thread safety.
 * @deprecated Please use the generate*Sas method on the desired service client after initializing
 * {@link AccountSasSignatureValues}.
 */
@Deprecated
public final class AccountSasQueryParameters extends BaseSasQueryParameters {

    private final String services;

    private final String resourceTypes;

    /**
     * Creates a new {@link AccountSasQueryParameters} object.
     *
     * @param queryParamsMap All query parameters for the request as key-value pairs
     * @param removeSasParameters When {@code true}, the SAS query parameters will be removed from
     * queryParamsMap
     */
    AccountSasQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSasParameters) {
        super(queryParamsMap, removeSasParameters);
        this.resourceTypes = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_RESOURCES_TYPES,
            removeSasParameters);
        this.services = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SERVICES,
            removeSasParameters);
    }

    /**
     * Creates a new {@link AccountSasQueryParameters} object. These objects are only created internally by
     * SASSignatureValues classes.
     *
     * @param version A {@code String} representing the storage version.
     * @param services A {@code String} representing the storage services being accessed (only for Account SAS).
     * @param resourceTypes A {@code String} representing the storage resource types being accessed (only for Account
     * SAS).
     * @param protocol A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param sasIpRange A {@link SasIpRange} representing the range of valid IP addresses for this SAS token or
     * {@code null}.
     * @param permissions A {@code String} representing the storage permissions or {@code null}.
     * @param signature A {@code String} representing the signature for the SAS token.
     */
    AccountSasQueryParameters(String version, String services, String resourceTypes, SasProtocol protocol,
                              OffsetDateTime startTime, OffsetDateTime expiryTime, SasIpRange sasIpRange,
                              String permissions, String signature) {
        super(version, protocol, startTime, expiryTime, sasIpRange, permissions, signature);
        this.services = services;
        this.resourceTypes = resourceTypes;
    }

    /**
     * @return The storage services being accessed (only for Account SAS). Please refer to {@link AccountSasService} for
     * more details.
     */
    public String getServices() {
        return services;
    }

    /**
     * @return The storage resource types being accessed (only for Account SAS). Please refer to {@link
     * AccountSasResourceType} for more details.
     */
    public String getResourceTypes() {
        return resourceTypes;
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing all SAS query parameters.
     * @deprecated Please use the generate*Sas method on the desired service client after initializing
     * {@link AccountSasSignatureValues}.
     */
    @Deprecated
    public String encode() {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        StringBuilder sb = new StringBuilder();

        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICE_VERSION, this.version);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICES, this.services);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_RESOURCES_TYPES, this.resourceTypes);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PROTOCOL, this.protocol);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_START_TIME, formatQueryParameterDate(this.startTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_EXPIRY_TIME, formatQueryParameterDate(this.expiryTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_IP_RANGE, this.sasIpRange);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS, this.permissions);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNATURE, this.signature);

        return sb.toString();
    }
}
